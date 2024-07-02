// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface AggExecNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.AggExecNode)
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
   * <code>.plan.protobuf.AggExecMode exec_mode = 2;</code>
   * @return The enum numeric value on the wire for execMode.
   */
  int getExecModeValue();
  /**
   * <code>.plan.protobuf.AggExecMode exec_mode = 2;</code>
   * @return The execMode.
   */
  org.blaze.protobuf.AggExecMode getExecMode();

  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode grouping_expr = 3;</code>
   */
  java.util.List<org.blaze.protobuf.PhysicalExprNode> 
      getGroupingExprList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode grouping_expr = 3;</code>
   */
  org.blaze.protobuf.PhysicalExprNode getGroupingExpr(int index);
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode grouping_expr = 3;</code>
   */
  int getGroupingExprCount();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode grouping_expr = 3;</code>
   */
  java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getGroupingExprOrBuilderList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode grouping_expr = 3;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getGroupingExprOrBuilder(
      int index);

  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode agg_expr = 4;</code>
   */
  java.util.List<org.blaze.protobuf.PhysicalExprNode> 
      getAggExprList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode agg_expr = 4;</code>
   */
  org.blaze.protobuf.PhysicalExprNode getAggExpr(int index);
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode agg_expr = 4;</code>
   */
  int getAggExprCount();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode agg_expr = 4;</code>
   */
  java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getAggExprOrBuilderList();
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode agg_expr = 4;</code>
   */
  org.blaze.protobuf.PhysicalExprNodeOrBuilder getAggExprOrBuilder(
      int index);

  /**
   * <code>repeated .plan.protobuf.AggMode mode = 5;</code>
   * @return A list containing the mode.
   */
  java.util.List<org.blaze.protobuf.AggMode> getModeList();
  /**
   * <code>repeated .plan.protobuf.AggMode mode = 5;</code>
   * @return The count of mode.
   */
  int getModeCount();
  /**
   * <code>repeated .plan.protobuf.AggMode mode = 5;</code>
   * @param index The index of the element to return.
   * @return The mode at the given index.
   */
  org.blaze.protobuf.AggMode getMode(int index);
  /**
   * <code>repeated .plan.protobuf.AggMode mode = 5;</code>
   * @return A list containing the enum numeric values on the wire for mode.
   */
  java.util.List<java.lang.Integer>
  getModeValueList();
  /**
   * <code>repeated .plan.protobuf.AggMode mode = 5;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of mode at the given index.
   */
  int getModeValue(int index);

  /**
   * <code>repeated string grouping_expr_name = 6;</code>
   * @return A list containing the groupingExprName.
   */
  java.util.List<java.lang.String>
      getGroupingExprNameList();
  /**
   * <code>repeated string grouping_expr_name = 6;</code>
   * @return The count of groupingExprName.
   */
  int getGroupingExprNameCount();
  /**
   * <code>repeated string grouping_expr_name = 6;</code>
   * @param index The index of the element to return.
   * @return The groupingExprName at the given index.
   */
  java.lang.String getGroupingExprName(int index);
  /**
   * <code>repeated string grouping_expr_name = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the groupingExprName at the given index.
   */
  com.google.protobuf.ByteString
      getGroupingExprNameBytes(int index);

  /**
   * <code>repeated string agg_expr_name = 7;</code>
   * @return A list containing the aggExprName.
   */
  java.util.List<java.lang.String>
      getAggExprNameList();
  /**
   * <code>repeated string agg_expr_name = 7;</code>
   * @return The count of aggExprName.
   */
  int getAggExprNameCount();
  /**
   * <code>repeated string agg_expr_name = 7;</code>
   * @param index The index of the element to return.
   * @return The aggExprName at the given index.
   */
  java.lang.String getAggExprName(int index);
  /**
   * <code>repeated string agg_expr_name = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the aggExprName at the given index.
   */
  com.google.protobuf.ByteString
      getAggExprNameBytes(int index);

  /**
   * <code>uint64 initial_input_buffer_offset = 8;</code>
   * @return The initialInputBufferOffset.
   */
  long getInitialInputBufferOffset();

  /**
   * <code>bool supports_partial_skipping = 9;</code>
   * @return The supportsPartialSkipping.
   */
  boolean getSupportsPartialSkipping();
}