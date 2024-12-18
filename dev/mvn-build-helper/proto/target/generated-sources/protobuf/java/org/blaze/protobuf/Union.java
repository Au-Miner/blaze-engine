// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.Union}
 */
public final class Union extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.Union)
    UnionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Union.newBuilder() to construct.
  private Union(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Union() {
    unionTypes_ = java.util.Collections.emptyList();
    unionMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Union();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Union_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Union_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.Union.class, org.blaze.protobuf.Union.Builder.class);
  }

  public static final int UNION_TYPES_FIELD_NUMBER = 1;
  private java.util.List<org.blaze.protobuf.Field> unionTypes_;
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.Field> getUnionTypesList() {
    return unionTypes_;
  }
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.FieldOrBuilder> 
      getUnionTypesOrBuilderList() {
    return unionTypes_;
  }
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  @java.lang.Override
  public int getUnionTypesCount() {
    return unionTypes_.size();
  }
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.Field getUnionTypes(int index) {
    return unionTypes_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.Field union_types = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.FieldOrBuilder getUnionTypesOrBuilder(
      int index) {
    return unionTypes_.get(index);
  }

  public static final int UNION_MODE_FIELD_NUMBER = 2;
  private int unionMode_;
  /**
   * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
   * @return The enum numeric value on the wire for unionMode.
   */
  @java.lang.Override public int getUnionModeValue() {
    return unionMode_;
  }
  /**
   * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
   * @return The unionMode.
   */
  @java.lang.Override public org.blaze.protobuf.UnionMode getUnionMode() {
    @SuppressWarnings("deprecation")
    org.blaze.protobuf.UnionMode result = org.blaze.protobuf.UnionMode.valueOf(unionMode_);
    return result == null ? org.blaze.protobuf.UnionMode.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < unionTypes_.size(); i++) {
      output.writeMessage(1, unionTypes_.get(i));
    }
    if (unionMode_ != org.blaze.protobuf.UnionMode.sparse.getNumber()) {
      output.writeEnum(2, unionMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < unionTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, unionTypes_.get(i));
    }
    if (unionMode_ != org.blaze.protobuf.UnionMode.sparse.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, unionMode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.blaze.protobuf.Union)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.Union other = (org.blaze.protobuf.Union) obj;

    if (!getUnionTypesList()
        .equals(other.getUnionTypesList())) return false;
    if (unionMode_ != other.unionMode_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUnionTypesCount() > 0) {
      hash = (37 * hash) + UNION_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getUnionTypesList().hashCode();
    }
    hash = (37 * hash) + UNION_MODE_FIELD_NUMBER;
    hash = (53 * hash) + unionMode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.Union parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Union parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Union parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Union parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Union parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Union parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Union parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Union parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Union parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Union parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Union parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Union parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.blaze.protobuf.Union prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code plan.protobuf.Union}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.Union)
      org.blaze.protobuf.UnionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Union_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Union_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.Union.class, org.blaze.protobuf.Union.Builder.class);
    }

    // Construct using org.blaze.protobuf.Union.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (unionTypesBuilder_ == null) {
        unionTypes_ = java.util.Collections.emptyList();
      } else {
        unionTypes_ = null;
        unionTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      unionMode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Union_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.Union getDefaultInstanceForType() {
      return org.blaze.protobuf.Union.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.Union build() {
      org.blaze.protobuf.Union result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.Union buildPartial() {
      org.blaze.protobuf.Union result = new org.blaze.protobuf.Union(this);
      int from_bitField0_ = bitField0_;
      if (unionTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          unionTypes_ = java.util.Collections.unmodifiableList(unionTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unionTypes_ = unionTypes_;
      } else {
        result.unionTypes_ = unionTypesBuilder_.build();
      }
      result.unionMode_ = unionMode_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.blaze.protobuf.Union) {
        return mergeFrom((org.blaze.protobuf.Union)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.Union other) {
      if (other == org.blaze.protobuf.Union.getDefaultInstance()) return this;
      if (unionTypesBuilder_ == null) {
        if (!other.unionTypes_.isEmpty()) {
          if (unionTypes_.isEmpty()) {
            unionTypes_ = other.unionTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnionTypesIsMutable();
            unionTypes_.addAll(other.unionTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.unionTypes_.isEmpty()) {
          if (unionTypesBuilder_.isEmpty()) {
            unionTypesBuilder_.dispose();
            unionTypesBuilder_ = null;
            unionTypes_ = other.unionTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            unionTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUnionTypesFieldBuilder() : null;
          } else {
            unionTypesBuilder_.addAllMessages(other.unionTypes_);
          }
        }
      }
      if (other.unionMode_ != 0) {
        setUnionModeValue(other.getUnionModeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.blaze.protobuf.Field m =
                  input.readMessage(
                      org.blaze.protobuf.Field.parser(),
                      extensionRegistry);
              if (unionTypesBuilder_ == null) {
                ensureUnionTypesIsMutable();
                unionTypes_.add(m);
              } else {
                unionTypesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              unionMode_ = input.readEnum();

              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<org.blaze.protobuf.Field> unionTypes_ =
      java.util.Collections.emptyList();
    private void ensureUnionTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        unionTypes_ = new java.util.ArrayList<org.blaze.protobuf.Field>(unionTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> unionTypesBuilder_;

    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public java.util.List<org.blaze.protobuf.Field> getUnionTypesList() {
      if (unionTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(unionTypes_);
      } else {
        return unionTypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public int getUnionTypesCount() {
      if (unionTypesBuilder_ == null) {
        return unionTypes_.size();
      } else {
        return unionTypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public org.blaze.protobuf.Field getUnionTypes(int index) {
      if (unionTypesBuilder_ == null) {
        return unionTypes_.get(index);
      } else {
        return unionTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder setUnionTypes(
        int index, org.blaze.protobuf.Field value) {
      if (unionTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnionTypesIsMutable();
        unionTypes_.set(index, value);
        onChanged();
      } else {
        unionTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder setUnionTypes(
        int index, org.blaze.protobuf.Field.Builder builderForValue) {
      if (unionTypesBuilder_ == null) {
        ensureUnionTypesIsMutable();
        unionTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        unionTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder addUnionTypes(org.blaze.protobuf.Field value) {
      if (unionTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnionTypesIsMutable();
        unionTypes_.add(value);
        onChanged();
      } else {
        unionTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder addUnionTypes(
        int index, org.blaze.protobuf.Field value) {
      if (unionTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnionTypesIsMutable();
        unionTypes_.add(index, value);
        onChanged();
      } else {
        unionTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder addUnionTypes(
        org.blaze.protobuf.Field.Builder builderForValue) {
      if (unionTypesBuilder_ == null) {
        ensureUnionTypesIsMutable();
        unionTypes_.add(builderForValue.build());
        onChanged();
      } else {
        unionTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder addUnionTypes(
        int index, org.blaze.protobuf.Field.Builder builderForValue) {
      if (unionTypesBuilder_ == null) {
        ensureUnionTypesIsMutable();
        unionTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        unionTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder addAllUnionTypes(
        java.lang.Iterable<? extends org.blaze.protobuf.Field> values) {
      if (unionTypesBuilder_ == null) {
        ensureUnionTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unionTypes_);
        onChanged();
      } else {
        unionTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder clearUnionTypes() {
      if (unionTypesBuilder_ == null) {
        unionTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        unionTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public Builder removeUnionTypes(int index) {
      if (unionTypesBuilder_ == null) {
        ensureUnionTypesIsMutable();
        unionTypes_.remove(index);
        onChanged();
      } else {
        unionTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public org.blaze.protobuf.Field.Builder getUnionTypesBuilder(
        int index) {
      return getUnionTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public org.blaze.protobuf.FieldOrBuilder getUnionTypesOrBuilder(
        int index) {
      if (unionTypesBuilder_ == null) {
        return unionTypes_.get(index);  } else {
        return unionTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.FieldOrBuilder> 
         getUnionTypesOrBuilderList() {
      if (unionTypesBuilder_ != null) {
        return unionTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(unionTypes_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public org.blaze.protobuf.Field.Builder addUnionTypesBuilder() {
      return getUnionTypesFieldBuilder().addBuilder(
          org.blaze.protobuf.Field.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public org.blaze.protobuf.Field.Builder addUnionTypesBuilder(
        int index) {
      return getUnionTypesFieldBuilder().addBuilder(
          index, org.blaze.protobuf.Field.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.Field union_types = 1;</code>
     */
    public java.util.List<org.blaze.protobuf.Field.Builder> 
         getUnionTypesBuilderList() {
      return getUnionTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> 
        getUnionTypesFieldBuilder() {
      if (unionTypesBuilder_ == null) {
        unionTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder>(
                unionTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        unionTypes_ = null;
      }
      return unionTypesBuilder_;
    }

    private int unionMode_ = 0;
    /**
     * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
     * @return The enum numeric value on the wire for unionMode.
     */
    @java.lang.Override public int getUnionModeValue() {
      return unionMode_;
    }
    /**
     * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
     * @param value The enum numeric value on the wire for unionMode to set.
     * @return This builder for chaining.
     */
    public Builder setUnionModeValue(int value) {
      
      unionMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
     * @return The unionMode.
     */
    @java.lang.Override
    public org.blaze.protobuf.UnionMode getUnionMode() {
      @SuppressWarnings("deprecation")
      org.blaze.protobuf.UnionMode result = org.blaze.protobuf.UnionMode.valueOf(unionMode_);
      return result == null ? org.blaze.protobuf.UnionMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
     * @param value The unionMode to set.
     * @return This builder for chaining.
     */
    public Builder setUnionMode(org.blaze.protobuf.UnionMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      unionMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.plan.protobuf.UnionMode union_mode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnionMode() {
      
      unionMode_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:plan.protobuf.Union)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.Union)
  private static final org.blaze.protobuf.Union DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.Union();
  }

  public static org.blaze.protobuf.Union getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Union>
      PARSER = new com.google.protobuf.AbstractParser<Union>() {
    @java.lang.Override
    public Union parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Union> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Union> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.Union getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

