// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface PartitionIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.PartitionId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string job_id = 1;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <code>string job_id = 1;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <code>uint32 stage_id = 2;</code>
   * @return The stageId.
   */
  int getStageId();

  /**
   * <code>uint32 partition_id = 4;</code>
   * @return The partitionId.
   */
  int getPartitionId();
}
