// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface UnionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.Union)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  java.util.List<org.blaze.protobuf.Field> 
      getUnionTypesList();
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  org.blaze.protobuf.Field getUnionTypes(int index);
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  int getUnionTypesCount();
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  java.util.List<? extends org.blaze.protobuf.FieldOrBuilder> 
      getUnionTypesOrBuilderList();
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  org.blaze.protobuf.FieldOrBuilder getUnionTypesOrBuilder(
      int index);

  /**
   * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
   * @return The enum numeric value on the wire for unionMode.
   */
  int getUnionModeValue();
  /**
   * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
   * @return The unionMode.
   */
  org.blaze.protobuf.UnionMode getUnionMode();
}
