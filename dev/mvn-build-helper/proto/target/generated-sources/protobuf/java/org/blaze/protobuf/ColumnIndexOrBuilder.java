// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface ColumnIndexOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.ColumnIndex)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 index = 1;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <code>.plan.protobuf.JoinSide side = 2;</code>
   * @return The enum numeric value on the wire for side.
   */
  int getSideValue();
  /**
   * <code>.plan.protobuf.JoinSide side = 2;</code>
   * @return The side.
   */
  org.blaze.protobuf.JoinSide getSide();
}
