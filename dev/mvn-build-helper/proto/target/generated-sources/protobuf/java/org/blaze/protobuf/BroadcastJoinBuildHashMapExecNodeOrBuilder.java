// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface BroadcastJoinBuildHashMapExecNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.BroadcastJoinBuildHashMapExecNode)
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
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  java.util.List<org.blaze.protobuf.PhysicalExprNode> 
      getKeysList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  org.blaze.protobuf.PhysicalExprNode getKeys(int index);
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  int getKeysCount();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getKeysOrBuilderList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getKeysOrBuilder(
      int index);
}
