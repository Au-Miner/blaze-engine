// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface PhysicalLikeExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.PhysicalLikeExprNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool negated = 1;</code>
   * @return The negated.
   */
  boolean getNegated();

  /**
   * <code>bool case_insensitive = 2;</code>
   * @return The caseInsensitive.
   */
  boolean getCaseInsensitive();

  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 3;</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 3;</code>
   * @return The expr.
   */
  org.blaze.protobuf.PhysicalExprNode getExpr();
  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 3;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getExprOrBuilder();

  /**
   * <code>.plan.protobuf.PhysicalExprNode pattern = 4;</code>
   * @return Whether the pattern field is set.
   */
  boolean hasPattern();
  /**
   * <code>.plan.protobuf.PhysicalExprNode pattern = 4;</code>
   * @return The pattern.
   */
  org.blaze.protobuf.PhysicalExprNode getPattern();
  /**
   * <code>.plan.protobuf.PhysicalExprNode pattern = 4;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getPatternOrBuilder();
}
