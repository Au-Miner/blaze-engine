// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface StringContainsExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.StringContainsExprNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
   * @return The expr.
   */
  org.blaze.protobuf.PhysicalExprNode getExpr();
  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getExprOrBuilder();

  /**
   * <code>string infix = 2;</code>
   * @return The infix.
   */
  java.lang.String getInfix();
  /**
   * <code>string infix = 2;</code>
   * @return The bytes for infix.
   */
  com.google.protobuf.ByteString
      getInfixBytes();
}