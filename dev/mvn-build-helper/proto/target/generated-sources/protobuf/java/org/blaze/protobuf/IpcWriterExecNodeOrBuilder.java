// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface IpcWriterExecNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.IpcWriterExecNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
   * @return The input.
   */
  org.blaze.protobuf.PhysicalPlanNode getInput();
  /**
   * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
   */
  org.blaze.protobuf.PhysicalPlanNodeOrBuilder getInputOrBuilder();

  /**
   * <code>string ipc_consumer_resource_id = 2;</code>
   * @return The ipcConsumerResourceId.
   */
  java.lang.String getIpcConsumerResourceId();
  /**
   * <code>string ipc_consumer_resource_id = 2;</code>
   * @return The bytes for ipcConsumerResourceId.
   */
  com.google.protobuf.ByteString
      getIpcConsumerResourceIdBytes();
}