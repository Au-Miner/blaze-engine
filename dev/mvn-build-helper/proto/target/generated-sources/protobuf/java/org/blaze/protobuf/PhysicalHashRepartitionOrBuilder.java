// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface PhysicalHashRepartitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.PhysicalHashRepartition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode hash_expr = 1;</code>
   */
  java.util.List<org.blaze.protobuf.PhysicalExprNode> 
      getHashExprList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode hash_expr = 1;</code>
   */
  org.blaze.protobuf.PhysicalExprNode getHashExpr(int index);
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode hash_expr = 1;</code>
   */
  int getHashExprCount();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode hash_expr = 1;</code>
   */
  java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getHashExprOrBuilderList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode hash_expr = 1;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getHashExprOrBuilder(
      int index);

  /**
   * <code>uint64 partition_count = 2;</code>
   * @return The partitionCount.
   */
  long getPartitionCount();
}