// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface ExpandExecNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.ExpandExecNode)
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
   * <code>repeated .plan.protobuf.ExpandProjection projections = 3;</code>
   */
  java.util.List<org.blaze.protobuf.ExpandProjection> 
      getProjectionsList();
  /**
   * <code>repeated .plan.protobuf.ExpandProjection projections = 3;</code>
   */
  org.blaze.protobuf.ExpandProjection getProjections(int index);
  /**
   * <code>repeated .plan.protobuf.ExpandProjection projections = 3;</code>
   */
  int getProjectionsCount();
  /**
   * <code>repeated .plan.protobuf.ExpandProjection projections = 3;</code>
   */
  java.util.List<? extends org.blaze.protobuf.ExpandProjectionOrBuilder> 
      getProjectionsOrBuilderList();
  /**
   * <code>repeated .plan.protobuf.ExpandProjection projections = 3;</code>
   */
  org.blaze.protobuf.ExpandProjectionOrBuilder getProjectionsOrBuilder(
      int index);
}
