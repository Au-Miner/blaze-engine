// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface PhysicalAliasNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.PhysicalAliasNode)
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
   * <code>string alias = 2;</code>
   * @return The alias.
   */
  java.lang.String getAlias();
  /**
   * <code>string alias = 2;</code>
   * @return The bytes for alias.
   */
  com.google.protobuf.ByteString
      getAliasBytes();
}
