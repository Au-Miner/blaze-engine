// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface PhysicalAggExprNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.PhysicalAggExprNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.plan.protobuf.AggFunction agg_function = 1;</code>
   * @return The enum numeric value on the wire for aggFunction.
   */
  int getAggFunctionValue();
  /**
   * <code>.plan.protobuf.AggFunction agg_function = 1;</code>
   * @return The aggFunction.
   */
  org.blaze.protobuf.AggFunction getAggFunction();

  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode children = 2;</code>
   */
  java.util.List<org.blaze.protobuf.PhysicalExprNode> 
      getChildrenList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode children = 2;</code>
   */
  org.blaze.protobuf.PhysicalExprNode getChildren(int index);
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode children = 2;</code>
   */
  int getChildrenCount();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode children = 2;</code>
   */
  java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode children = 2;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getChildrenOrBuilder(
      int index);
}
