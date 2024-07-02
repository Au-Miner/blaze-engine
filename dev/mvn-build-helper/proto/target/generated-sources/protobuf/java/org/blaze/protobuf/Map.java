// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.Map}
 */
public final class Map extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.Map)
    MapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Map.newBuilder() to construct.
  private Map(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Map() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Map();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Map_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Map_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.Map.class, org.blaze.protobuf.Map.Builder.class);
  }

  public static final int KEY_TYPE_FIELD_NUMBER = 1;
  private org.blaze.protobuf.Field keyType_;
  /**
   * <code>.plan.protobuf.Field key_type = 1;</code>
   * @return Whether the keyType field is set.
   */
  @java.lang.Override
  public boolean hasKeyType() {
    return keyType_ != null;
  }
  /**
   * <code>.plan.protobuf.Field key_type = 1;</code>
   * @return The keyType.
   */
  @java.lang.Override
  public org.blaze.protobuf.Field getKeyType() {
    return keyType_ == null ? org.blaze.protobuf.Field.getDefaultInstance() : keyType_;
  }
  /**
   * <code>.plan.protobuf.Field key_type = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.FieldOrBuilder getKeyTypeOrBuilder() {
    return getKeyType();
  }

  public static final int VALUE_TYPE_FIELD_NUMBER = 2;
  private org.blaze.protobuf.Field valueType_;
  /**
   * <code>.plan.protobuf.Field value_type = 2;</code>
   * @return Whether the valueType field is set.
   */
  @java.lang.Override
  public boolean hasValueType() {
    return valueType_ != null;
  }
  /**
   * <code>.plan.protobuf.Field value_type = 2;</code>
   * @return The valueType.
   */
  @java.lang.Override
  public org.blaze.protobuf.Field getValueType() {
    return valueType_ == null ? org.blaze.protobuf.Field.getDefaultInstance() : valueType_;
  }
  /**
   * <code>.plan.protobuf.Field value_type = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.FieldOrBuilder getValueTypeOrBuilder() {
    return getValueType();
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
    if (keyType_ != null) {
      output.writeMessage(1, getKeyType());
    }
    if (valueType_ != null) {
      output.writeMessage(2, getValueType());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keyType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKeyType());
    }
    if (valueType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValueType());
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
    if (!(obj instanceof org.blaze.protobuf.Map)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.Map other = (org.blaze.protobuf.Map) obj;

    if (hasKeyType() != other.hasKeyType()) return false;
    if (hasKeyType()) {
      if (!getKeyType()
          .equals(other.getKeyType())) return false;
    }
    if (hasValueType() != other.hasValueType()) return false;
    if (hasValueType()) {
      if (!getValueType()
          .equals(other.getValueType())) return false;
    }
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
    if (hasKeyType()) {
      hash = (37 * hash) + KEY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getKeyType().hashCode();
    }
    if (hasValueType()) {
      hash = (37 * hash) + VALUE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getValueType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.Map parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Map parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Map parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Map parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Map parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Map parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Map parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Map parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Map parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Map parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Map parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Map parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.Map prototype) {
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
   * Protobuf type {@code plan.protobuf.Map}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.Map)
      org.blaze.protobuf.MapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Map_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Map_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.Map.class, org.blaze.protobuf.Map.Builder.class);
    }

    // Construct using org.blaze.protobuf.Map.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyTypeBuilder_ == null) {
        keyType_ = null;
      } else {
        keyType_ = null;
        keyTypeBuilder_ = null;
      }
      if (valueTypeBuilder_ == null) {
        valueType_ = null;
      } else {
        valueType_ = null;
        valueTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Map_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.Map getDefaultInstanceForType() {
      return org.blaze.protobuf.Map.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.Map build() {
      org.blaze.protobuf.Map result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.Map buildPartial() {
      org.blaze.protobuf.Map result = new org.blaze.protobuf.Map(this);
      if (keyTypeBuilder_ == null) {
        result.keyType_ = keyType_;
      } else {
        result.keyType_ = keyTypeBuilder_.build();
      }
      if (valueTypeBuilder_ == null) {
        result.valueType_ = valueType_;
      } else {
        result.valueType_ = valueTypeBuilder_.build();
      }
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
      if (other instanceof org.blaze.protobuf.Map) {
        return mergeFrom((org.blaze.protobuf.Map)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.Map other) {
      if (other == org.blaze.protobuf.Map.getDefaultInstance()) return this;
      if (other.hasKeyType()) {
        mergeKeyType(other.getKeyType());
      }
      if (other.hasValueType()) {
        mergeValueType(other.getValueType());
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
              input.readMessage(
                  getKeyTypeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValueTypeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
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

    private org.blaze.protobuf.Field keyType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> keyTypeBuilder_;
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     * @return Whether the keyType field is set.
     */
    public boolean hasKeyType() {
      return keyTypeBuilder_ != null || keyType_ != null;
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     * @return The keyType.
     */
    public org.blaze.protobuf.Field getKeyType() {
      if (keyTypeBuilder_ == null) {
        return keyType_ == null ? org.blaze.protobuf.Field.getDefaultInstance() : keyType_;
      } else {
        return keyTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     */
    public Builder setKeyType(org.blaze.protobuf.Field value) {
      if (keyTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keyType_ = value;
        onChanged();
      } else {
        keyTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     */
    public Builder setKeyType(
        org.blaze.protobuf.Field.Builder builderForValue) {
      if (keyTypeBuilder_ == null) {
        keyType_ = builderForValue.build();
        onChanged();
      } else {
        keyTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     */
    public Builder mergeKeyType(org.blaze.protobuf.Field value) {
      if (keyTypeBuilder_ == null) {
        if (keyType_ != null) {
          keyType_ =
            org.blaze.protobuf.Field.newBuilder(keyType_).mergeFrom(value).buildPartial();
        } else {
          keyType_ = value;
        }
        onChanged();
      } else {
        keyTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     */
    public Builder clearKeyType() {
      if (keyTypeBuilder_ == null) {
        keyType_ = null;
        onChanged();
      } else {
        keyType_ = null;
        keyTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     */
    public org.blaze.protobuf.Field.Builder getKeyTypeBuilder() {
      
      onChanged();
      return getKeyTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     */
    public org.blaze.protobuf.FieldOrBuilder getKeyTypeOrBuilder() {
      if (keyTypeBuilder_ != null) {
        return keyTypeBuilder_.getMessageOrBuilder();
      } else {
        return keyType_ == null ?
            org.blaze.protobuf.Field.getDefaultInstance() : keyType_;
      }
    }
    /**
     * <code>.plan.protobuf.Field key_type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> 
        getKeyTypeFieldBuilder() {
      if (keyTypeBuilder_ == null) {
        keyTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder>(
                getKeyType(),
                getParentForChildren(),
                isClean());
        keyType_ = null;
      }
      return keyTypeBuilder_;
    }

    private org.blaze.protobuf.Field valueType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> valueTypeBuilder_;
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     * @return Whether the valueType field is set.
     */
    public boolean hasValueType() {
      return valueTypeBuilder_ != null || valueType_ != null;
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     * @return The valueType.
     */
    public org.blaze.protobuf.Field getValueType() {
      if (valueTypeBuilder_ == null) {
        return valueType_ == null ? org.blaze.protobuf.Field.getDefaultInstance() : valueType_;
      } else {
        return valueTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     */
    public Builder setValueType(org.blaze.protobuf.Field value) {
      if (valueTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueType_ = value;
        onChanged();
      } else {
        valueTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     */
    public Builder setValueType(
        org.blaze.protobuf.Field.Builder builderForValue) {
      if (valueTypeBuilder_ == null) {
        valueType_ = builderForValue.build();
        onChanged();
      } else {
        valueTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     */
    public Builder mergeValueType(org.blaze.protobuf.Field value) {
      if (valueTypeBuilder_ == null) {
        if (valueType_ != null) {
          valueType_ =
            org.blaze.protobuf.Field.newBuilder(valueType_).mergeFrom(value).buildPartial();
        } else {
          valueType_ = value;
        }
        onChanged();
      } else {
        valueTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     */
    public Builder clearValueType() {
      if (valueTypeBuilder_ == null) {
        valueType_ = null;
        onChanged();
      } else {
        valueType_ = null;
        valueTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     */
    public org.blaze.protobuf.Field.Builder getValueTypeBuilder() {
      
      onChanged();
      return getValueTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     */
    public org.blaze.protobuf.FieldOrBuilder getValueTypeOrBuilder() {
      if (valueTypeBuilder_ != null) {
        return valueTypeBuilder_.getMessageOrBuilder();
      } else {
        return valueType_ == null ?
            org.blaze.protobuf.Field.getDefaultInstance() : valueType_;
      }
    }
    /**
     * <code>.plan.protobuf.Field value_type = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> 
        getValueTypeFieldBuilder() {
      if (valueTypeBuilder_ == null) {
        valueTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder>(
                getValueType(),
                getParentForChildren(),
                isClean());
        valueType_ = null;
      }
      return valueTypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.Map)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.Map)
  private static final org.blaze.protobuf.Map DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.Map();
  }

  public static org.blaze.protobuf.Map getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Map>
      PARSER = new com.google.protobuf.AbstractParser<Map>() {
    @java.lang.Override
    public Map parsePartialFrom(
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

  public static com.google.protobuf.Parser<Map> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Map> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.Map getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
