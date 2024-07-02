// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.ScalarDecimalValue}
 */
public final class ScalarDecimalValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.ScalarDecimalValue)
    ScalarDecimalValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScalarDecimalValue.newBuilder() to construct.
  private ScalarDecimalValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScalarDecimalValue() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScalarDecimalValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarDecimalValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarDecimalValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.ScalarDecimalValue.class, org.blaze.protobuf.ScalarDecimalValue.Builder.class);
  }

  public static final int DECIMAL_FIELD_NUMBER = 1;
  private org.blaze.protobuf.Decimal decimal_;
  /**
   * <code>.plan.protobuf.Decimal decimal = 1;</code>
   * @return Whether the decimal field is set.
   */
  @java.lang.Override
  public boolean hasDecimal() {
    return decimal_ != null;
  }
  /**
   * <code>.plan.protobuf.Decimal decimal = 1;</code>
   * @return The decimal.
   */
  @java.lang.Override
  public org.blaze.protobuf.Decimal getDecimal() {
    return decimal_ == null ? org.blaze.protobuf.Decimal.getDefaultInstance() : decimal_;
  }
  /**
   * <code>.plan.protobuf.Decimal decimal = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.DecimalOrBuilder getDecimalOrBuilder() {
    return getDecimal();
  }

  public static final int LONG_VALUE_FIELD_NUMBER = 2;
  private long longValue_;
  /**
   * <pre>
   * datafusion has i128 decimal value, only use i64 for blaze
   * </pre>
   *
   * <code>int64 long_value = 2;</code>
   * @return The longValue.
   */
  @java.lang.Override
  public long getLongValue() {
    return longValue_;
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
    if (decimal_ != null) {
      output.writeMessage(1, getDecimal());
    }
    if (longValue_ != 0L) {
      output.writeInt64(2, longValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (decimal_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDecimal());
    }
    if (longValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, longValue_);
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
    if (!(obj instanceof org.blaze.protobuf.ScalarDecimalValue)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.ScalarDecimalValue other = (org.blaze.protobuf.ScalarDecimalValue) obj;

    if (hasDecimal() != other.hasDecimal()) return false;
    if (hasDecimal()) {
      if (!getDecimal()
          .equals(other.getDecimal())) return false;
    }
    if (getLongValue()
        != other.getLongValue()) return false;
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
    if (hasDecimal()) {
      hash = (37 * hash) + DECIMAL_FIELD_NUMBER;
      hash = (53 * hash) + getDecimal().hashCode();
    }
    hash = (37 * hash) + LONG_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLongValue());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ScalarDecimalValue parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.ScalarDecimalValue prototype) {
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
   * Protobuf type {@code plan.protobuf.ScalarDecimalValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.ScalarDecimalValue)
      org.blaze.protobuf.ScalarDecimalValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarDecimalValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarDecimalValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.ScalarDecimalValue.class, org.blaze.protobuf.ScalarDecimalValue.Builder.class);
    }

    // Construct using org.blaze.protobuf.ScalarDecimalValue.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (decimalBuilder_ == null) {
        decimal_ = null;
      } else {
        decimal_ = null;
        decimalBuilder_ = null;
      }
      longValue_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarDecimalValue_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.ScalarDecimalValue getDefaultInstanceForType() {
      return org.blaze.protobuf.ScalarDecimalValue.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.ScalarDecimalValue build() {
      org.blaze.protobuf.ScalarDecimalValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.ScalarDecimalValue buildPartial() {
      org.blaze.protobuf.ScalarDecimalValue result = new org.blaze.protobuf.ScalarDecimalValue(this);
      if (decimalBuilder_ == null) {
        result.decimal_ = decimal_;
      } else {
        result.decimal_ = decimalBuilder_.build();
      }
      result.longValue_ = longValue_;
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
      if (other instanceof org.blaze.protobuf.ScalarDecimalValue) {
        return mergeFrom((org.blaze.protobuf.ScalarDecimalValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.ScalarDecimalValue other) {
      if (other == org.blaze.protobuf.ScalarDecimalValue.getDefaultInstance()) return this;
      if (other.hasDecimal()) {
        mergeDecimal(other.getDecimal());
      }
      if (other.getLongValue() != 0L) {
        setLongValue(other.getLongValue());
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
                  getDecimalFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 16: {
              longValue_ = input.readInt64();

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

    private org.blaze.protobuf.Decimal decimal_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Decimal, org.blaze.protobuf.Decimal.Builder, org.blaze.protobuf.DecimalOrBuilder> decimalBuilder_;
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     * @return Whether the decimal field is set.
     */
    public boolean hasDecimal() {
      return decimalBuilder_ != null || decimal_ != null;
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     * @return The decimal.
     */
    public org.blaze.protobuf.Decimal getDecimal() {
      if (decimalBuilder_ == null) {
        return decimal_ == null ? org.blaze.protobuf.Decimal.getDefaultInstance() : decimal_;
      } else {
        return decimalBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     */
    public Builder setDecimal(org.blaze.protobuf.Decimal value) {
      if (decimalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        decimal_ = value;
        onChanged();
      } else {
        decimalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     */
    public Builder setDecimal(
        org.blaze.protobuf.Decimal.Builder builderForValue) {
      if (decimalBuilder_ == null) {
        decimal_ = builderForValue.build();
        onChanged();
      } else {
        decimalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     */
    public Builder mergeDecimal(org.blaze.protobuf.Decimal value) {
      if (decimalBuilder_ == null) {
        if (decimal_ != null) {
          decimal_ =
            org.blaze.protobuf.Decimal.newBuilder(decimal_).mergeFrom(value).buildPartial();
        } else {
          decimal_ = value;
        }
        onChanged();
      } else {
        decimalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     */
    public Builder clearDecimal() {
      if (decimalBuilder_ == null) {
        decimal_ = null;
        onChanged();
      } else {
        decimal_ = null;
        decimalBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     */
    public org.blaze.protobuf.Decimal.Builder getDecimalBuilder() {
      
      onChanged();
      return getDecimalFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     */
    public org.blaze.protobuf.DecimalOrBuilder getDecimalOrBuilder() {
      if (decimalBuilder_ != null) {
        return decimalBuilder_.getMessageOrBuilder();
      } else {
        return decimal_ == null ?
            org.blaze.protobuf.Decimal.getDefaultInstance() : decimal_;
      }
    }
    /**
     * <code>.plan.protobuf.Decimal decimal = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Decimal, org.blaze.protobuf.Decimal.Builder, org.blaze.protobuf.DecimalOrBuilder> 
        getDecimalFieldBuilder() {
      if (decimalBuilder_ == null) {
        decimalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.Decimal, org.blaze.protobuf.Decimal.Builder, org.blaze.protobuf.DecimalOrBuilder>(
                getDecimal(),
                getParentForChildren(),
                isClean());
        decimal_ = null;
      }
      return decimalBuilder_;
    }

    private long longValue_ ;
    /**
     * <pre>
     * datafusion has i128 decimal value, only use i64 for blaze
     * </pre>
     *
     * <code>int64 long_value = 2;</code>
     * @return The longValue.
     */
    @java.lang.Override
    public long getLongValue() {
      return longValue_;
    }
    /**
     * <pre>
     * datafusion has i128 decimal value, only use i64 for blaze
     * </pre>
     *
     * <code>int64 long_value = 2;</code>
     * @param value The longValue to set.
     * @return This builder for chaining.
     */
    public Builder setLongValue(long value) {
      
      longValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * datafusion has i128 decimal value, only use i64 for blaze
     * </pre>
     *
     * <code>int64 long_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongValue() {
      
      longValue_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.ScalarDecimalValue)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.ScalarDecimalValue)
  private static final org.blaze.protobuf.ScalarDecimalValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.ScalarDecimalValue();
  }

  public static org.blaze.protobuf.ScalarDecimalValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScalarDecimalValue>
      PARSER = new com.google.protobuf.AbstractParser<ScalarDecimalValue>() {
    @java.lang.Override
    public ScalarDecimalValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScalarDecimalValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScalarDecimalValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.ScalarDecimalValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
