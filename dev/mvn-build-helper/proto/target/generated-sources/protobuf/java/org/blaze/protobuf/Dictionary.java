// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.Dictionary}
 */
public final class Dictionary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.Dictionary)
    DictionaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Dictionary.newBuilder() to construct.
  private Dictionary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Dictionary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Dictionary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Dictionary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Dictionary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.Dictionary.class, org.blaze.protobuf.Dictionary.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private org.blaze.protobuf.ArrowType key_;
  /**
   * <code>.plan.protobuf.ArrowType key = 1;</code>
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <code>.plan.protobuf.ArrowType key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowType getKey() {
    return key_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : key_;
  }
  /**
   * <code>.plan.protobuf.ArrowType key = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowTypeOrBuilder getKeyOrBuilder() {
    return getKey();
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private org.blaze.protobuf.ArrowType value_;
  /**
   * <code>.plan.protobuf.ArrowType value = 2;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <code>.plan.protobuf.ArrowType value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowType getValue() {
    return value_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : value_;
  }
  /**
   * <code>.plan.protobuf.ArrowType value = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowTypeOrBuilder getValueOrBuilder() {
    return getValue();
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
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
    if (!(obj instanceof org.blaze.protobuf.Dictionary)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.Dictionary other = (org.blaze.protobuf.Dictionary) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.Dictionary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Dictionary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Dictionary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Dictionary parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.Dictionary prototype) {
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
   * Protobuf type {@code plan.protobuf.Dictionary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.Dictionary)
      org.blaze.protobuf.DictionaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Dictionary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Dictionary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.Dictionary.class, org.blaze.protobuf.Dictionary.Builder.class);
    }

    // Construct using org.blaze.protobuf.Dictionary.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Dictionary_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.Dictionary getDefaultInstanceForType() {
      return org.blaze.protobuf.Dictionary.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.Dictionary build() {
      org.blaze.protobuf.Dictionary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.Dictionary buildPartial() {
      org.blaze.protobuf.Dictionary result = new org.blaze.protobuf.Dictionary(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.Dictionary) {
        return mergeFrom((org.blaze.protobuf.Dictionary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.Dictionary other) {
      if (other == org.blaze.protobuf.Dictionary.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
                  getKeyFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
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

    private org.blaze.protobuf.ArrowType key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> keyBuilder_;
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     * @return The key.
     */
    public org.blaze.protobuf.ArrowType getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     */
    public Builder setKey(org.blaze.protobuf.ArrowType value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     */
    public Builder setKey(
        org.blaze.protobuf.ArrowType.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     */
    public Builder mergeKey(org.blaze.protobuf.ArrowType value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
            org.blaze.protobuf.ArrowType.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     */
    public org.blaze.protobuf.ArrowType.Builder getKeyBuilder() {
      
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     */
    public org.blaze.protobuf.ArrowTypeOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            org.blaze.protobuf.ArrowType.getDefaultInstance() : key_;
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private org.blaze.protobuf.ArrowType value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> valueBuilder_;
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     * @return The value.
     */
    public org.blaze.protobuf.ArrowType getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     */
    public Builder setValue(org.blaze.protobuf.ArrowType value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     */
    public Builder setValue(
        org.blaze.protobuf.ArrowType.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     */
    public Builder mergeValue(org.blaze.protobuf.ArrowType value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            org.blaze.protobuf.ArrowType.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     */
    public org.blaze.protobuf.ArrowType.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     */
    public org.blaze.protobuf.ArrowTypeOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            org.blaze.protobuf.ArrowType.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.Dictionary)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.Dictionary)
  private static final org.blaze.protobuf.Dictionary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.Dictionary();
  }

  public static org.blaze.protobuf.Dictionary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dictionary>
      PARSER = new com.google.protobuf.AbstractParser<Dictionary>() {
    @java.lang.Override
    public Dictionary parsePartialFrom(
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

  public static com.google.protobuf.Parser<Dictionary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dictionary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.Dictionary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

