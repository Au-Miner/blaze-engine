// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface IpcReaderExecNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.IpcReaderExecNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 num_partitions = 1;</code>
   * @return The numPartitions.
   */
  int getNumPartitions();

  /**
   * <code>.plan.protobuf.Schema schema = 2;</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <code>.plan.protobuf.Schema schema = 2;</code>
   * @return The schema.
   */
  org.blaze.protobuf.Schema getSchema();
  /**
   * <code>.plan.protobuf.Schema schema = 2;</code>
   */
  org.blaze.protobuf.SchemaOrBuilder getSchemaOrBuilder();

  /**
   * <code>string ipc_provider_resource_id = 3;</code>
   * @return The ipcProviderResourceId.
   */
  java.lang.String getIpcProviderResourceId();
  /**
   * <code>string ipc_provider_resource_id = 3;</code>
   * @return The bytes for ipcProviderResourceId.
   */
  com.google.protobuf.ByteString
      getIpcProviderResourceIdBytes();
}
