// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface ScalarTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.ScalarType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
   * @return Whether the scalar field is set.
   */
  boolean hasScalar();
  /**
   * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
   * @return The enum numeric value on the wire for scalar.
   */
  int getScalarValue();
  /**
   * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
   * @return The scalar.
   */
  org.blaze.protobuf.PrimitiveScalarType getScalar();

  /**
   * <code>.plan.protobuf.ScalarListType list = 2;</code>
   * @return Whether the list field is set.
   */
  boolean hasList();
  /**
   * <code>.plan.protobuf.ScalarListType list = 2;</code>
   * @return The list.
   */
  org.blaze.protobuf.ScalarListType getList();
  /**
   * <code>.plan.protobuf.ScalarListType list = 2;</code>
   */
  org.blaze.protobuf.ScalarListTypeOrBuilder getListOrBuilder();

  public org.blaze.protobuf.ScalarType.DatatypeCase getDatatypeCase();
}