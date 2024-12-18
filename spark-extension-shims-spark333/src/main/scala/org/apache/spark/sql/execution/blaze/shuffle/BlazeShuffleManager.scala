/*
 * Copyright 2022 The Blaze Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.spark.sql.execution.blaze.shuffle

import org.apache.spark.ShuffleDependency
import org.apache.spark.SparkConf
import org.apache.spark.SparkEnv
import org.apache.spark.TaskContext
import org.apache.spark.internal.Logging
import org.apache.spark.shuffle._
import org.apache.spark.shuffle.sort.SortShuffleManager
import org.apache.spark.shuffle.sort.SortShuffleManager.canUseBatchFetch
import org.apache.spark.sql.execution.blaze.shuffle.BlazeShuffleDependency.isArrowShuffle

class BlazeShuffleManager(conf: SparkConf) extends ShuffleManager with Logging {
  // Spark 默认的 Shuffle 管理器
  val sortShuffleManager = new SortShuffleManager(conf)

  if (!conf.getBoolean("spark.shuffle.spill", defaultValue = true)) {
    logWarning(
      "spark.shuffle.spill was set to false, but this configuration is ignored as of Spark 1.6+." +
        " Shuffle will continue to spill to disk when necessary.")
  }

  // 负责 Shuffle 数据文件的索引和管理
  override val shuffleBlockResolver = new IndexShuffleBlockResolver(conf)

  /**
   * (override) Obtains a [[ShuffleHandle]] to pass to tasks.
   */
  override def registerShuffle[K, V, C](
      shuffleId: Int,
      dependency: ShuffleDependency[K, V, C]): ShuffleHandle = {
    sortShuffleManager.registerShuffle(shuffleId, dependency)
  }

  override def getReader[K, C](
      handle: ShuffleHandle,
      startMapIndex: Int,
      endMapIndex: Int,
      startPartition: Int,
      endPartition: Int,
      context: TaskContext,
      metrics: ShuffleReadMetricsReporter): ShuffleReader[K, C] = {

    if (isArrowShuffle(handle)) {
      val baseShuffleHandle = handle.asInstanceOf[BaseShuffleHandle[K, _, C]]
      val (blocksByAddress, canEnableBatchFetch) =
        if (baseShuffleHandle.dependency.isShuffleMergeFinalizedMarked) {
          val res = SparkEnv.get.mapOutputTracker.getPushBasedShuffleMapSizesByExecutorId(
            handle.shuffleId,
            startMapIndex,
            endMapIndex,
            startPartition,
            endPartition)
          (res.iter, res.enableBatchFetch)
        } else {
          val address = SparkEnv.get.mapOutputTracker.getMapSizesByExecutorId(
            handle.shuffleId,
            startMapIndex,
            endMapIndex,
            startPartition,
            endPartition)
          (address, true)
        }

      // 新建BlazeBlockStoreShuffleReader对象
      new BlazeBlockStoreShuffleReader(
        handle.asInstanceOf[BaseShuffleHandle[K, _, C]],
        blocksByAddress,
        context,
        metrics,
        SparkEnv.get.blockManager,
        SparkEnv.get.mapOutputTracker,
        shouldBatchFetch =
          canEnableBatchFetch && canUseBatchFetch(startPartition, endPartition, context))
    } else {
      sortShuffleManager.getReader(
        handle,
        startMapIndex,
        endMapIndex,
        startPartition,
        endPartition,
        context,
        metrics)
    }
  }

  /** Get a writer for a given partition. Called on executors by map tasks. */
  override def getWriter[K, V](
      handle: ShuffleHandle,
      mapId: Long,
      context: TaskContext,
      metrics: ShuffleWriteMetricsReporter): ShuffleWriter[K, V] = {

    if (isArrowShuffle(handle)) {
      // 新建BlazeShuffleWriter对象
      new BlazeShuffleWriter(metrics)
    } else {
      sortShuffleManager.getWriter(handle, mapId, context, metrics)
    }
  }

  /** Remove a shuffle's metadata from the ShuffleManager. */
  override def unregisterShuffle(shuffleId: Int): Boolean = {
    sortShuffleManager.unregisterShuffle(shuffleId)
  }

  /** Shut down this ShuffleManager. */
  override def stop(): Unit = {
    shuffleBlockResolver.stop()
  }
}
