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
package org.apache.spark.sql.blaze

import org.apache.spark.SparkEnv
import org.apache.spark.internal.Logging
import org.apache.spark.internal.config.ConfigEntry
import org.apache.spark.sql.SparkSessionExtensions
import org.apache.spark.sql.catalyst.rules.Rule
import org.apache.spark.sql.execution.SparkPlan
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.execution.ColumnarRule
import org.apache.spark.sql.execution.LocalTableScanExec
import org.apache.spark.sql.internal.SQLConf

// extends(...): 实现了一个接收 SparkSessionExtensions 参数并返回Unit的函数特质
class BlazeSparkSessionExtension extends (SparkSessionExtensions => Unit) with Logging {
  // 初始化适配模块Shims，并调用扩展初始化方法
  Shims.get.initExtension()

  // 通过实现apply方法，该类可以像函数一样被调用
  // 定义apply方法的对象或类可以使用类似函数调用的语法，而不需要显式地调用apply方法
  override def apply(extensions: SparkSessionExtensions): Unit = {
    SparkEnv.get.conf.set("spark.sql.adaptive.enabled", "true")
    SparkEnv.get.conf.set("spark.sql.adaptive.forceApply", "true")
    logInfo("org.apache.spark.BlazeSparkSessionExtension enabled")

    assert(BlazeSparkSessionExtension.blazeEnabledKey != null)
    // spark333没有实现该方法
    Shims.get.onApplyingExtension()

    extensions.injectColumnar(sparkSession => {
      BlazeColumnarOverrides(sparkSession)
    })
  }
}

object BlazeSparkSessionExtension extends Logging {
  lazy val blazeEnabledKey: ConfigEntry[Boolean] = SQLConf
    .buildConf("spark.blaze.enable")
    .booleanConf
    .createWithDefault(true)

  // 递归地打印出 Spark 计划树（SparkPlan）的每个节点信息
  def dumpSimpleSparkPlanTreeNode(exec: SparkPlan, depth: Int = 0): Unit = {
    val nodeName = exec.nodeName
    val convertible = exec
      .getTagValue(BlazeConvertStrategy.convertibleTag)
      .getOrElse(false)
    val strategy =
      exec.getTagValue(BlazeConvertStrategy.convertStrategyTag).getOrElse(Default)
    // 输出每个节点的名称、是否可转换（convertible），以及转换策略（strategy）
    logInfo(s" +${"-" * depth} $nodeName (convertible=$convertible, strategy=$strategy)")
    exec.children.foreach(dumpSimpleSparkPlanTreeNode(_, depth + 1))
  }
}

// 通过实现 ColumnarRule 接口来插入自定义的转换逻辑
case class BlazeColumnarOverrides(sparkSession: SparkSession) extends ColumnarRule with Logging {
  import BlazeSparkSessionExtension._

  override def preColumnarTransitions: Rule[SparkPlan] = {
    new Rule[SparkPlan] {
      override def apply(sparkPlan: SparkPlan): SparkPlan = {
        // 配置项未启用，则直接返回原始计划
        if (!sparkPlan.conf.getConf(blazeEnabledKey)) {
          return sparkPlan // performs no conversion if blaze is not enabled
        }

        if (sparkPlan.isInstanceOf[LocalTableScanExec]) {
          return sparkPlan // skip useless local table scan (generated by set, addjar, etc)
        }

        // 生成当前物理计划的转换策略（并未实际转换）
        // generate convert strategy
        logInfo("wqlnb: 准备插入策略")
        BlazeConvertStrategy.apply(sparkPlan)
        logInfo("Blaze convert strategy for current stage:")
        // 打印信息
        dumpSimpleSparkPlanTreeNode(sparkPlan)

        // 通过递归开始实际转换
        val sparkPlanTransformed = BlazeConverters.convertSparkPlanRecursively(sparkPlan)
        logInfo("Blaze convert result for current stage:")
        // 打印信息
        dumpSimpleSparkPlanTreeNode(sparkPlanTransformed)

        logInfo(s"Transformed spark plan after preColumnarTransitions:\n${sparkPlanTransformed
          .treeString(verbose = true, addSuffix = true)}")

        // post-transform
        // 向后转换（未实现实际功能）
        Shims.get.postTransform(sparkPlanTransformed, sparkSession.sparkContext)
        // 返回转换后的sparkPlan
        sparkPlanTransformed
      }
    }
  }
}
