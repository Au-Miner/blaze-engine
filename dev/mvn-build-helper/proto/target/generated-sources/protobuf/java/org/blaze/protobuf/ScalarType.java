// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.ScalarType}
 */
public final class ScalarType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.ScalarType)
    ScalarTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScalarType.newBuilder() to construct.
  private ScalarType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScalarType() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScalarType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.ScalarType.class, org.blaze.protobuf.ScalarType.Builder.class);
  }

  private int datatypeCase_ = 0;
  private java.lang.Object datatype_;
  public enum DatatypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SCALAR(1),
    LIST(2),
    DATATYPE_NOT_SET(0);
    private final int value;
    private DatatypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DatatypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static DatatypeCase forNumber(int value) {
      switch (value) {
        case 1: return SCALAR;
        case 2: return LIST;
        case 0: return DATATYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DatatypeCase
  getDatatypeCase() {
    return DatatypeCase.forNumber(
        datatypeCase_);
  }

  public static final int SCALAR_FIELD_NUMBER = 1;
  /**
   * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
   * @return Whether the scalar field is set.
   */
  public boolean hasScalar() {
    return datatypeCase_ == 1;
  }
  /**
   * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
   * @return The enum numeric value on the wire for scalar.
   */
  public int getScalarValue() {
    if (datatypeCase_ == 1) {
      return (java.lang.Integer) datatype_;
    }
    return 0;
  }
  /**
   * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
   * @return The scalar.
   */
  public org.blaze.protobuf.PrimitiveScalarType getScalar() {
    if (datatypeCase_ == 1) {
      @SuppressWarnings("deprecation")
      org.blaze.protobuf.PrimitiveScalarType result = org.blaze.protobuf.PrimitiveScalarType.valueOf(
          (java.lang.Integer) datatype_);
      return result == null ? org.blaze.protobuf.PrimitiveScalarType.UNRECOGNIZED : result;
    }
    return org.blaze.protobuf.PrimitiveScalarType.BOOL;
  }

  public static final int LIST_FIELD_NUMBER = 2;
  /**
   * <code>.plan.protobuf.ScalarListType list = 2;</code>
   * @return Whether the list field is set.
   */
  @java.lang.Override
  public boolean hasList() {
    return datatypeCase_ == 2;
  }
  /**
   * <code>.plan.protobuf.ScalarListType list = 2;</code>
   * @return The list.
   */
  @java.lang.Override
  public org.blaze.protobuf.ScalarListType getList() {
    if (datatypeCase_ == 2) {
       return (org.blaze.protobuf.ScalarListType) datatype_;
    }
    return org.blaze.protobuf.ScalarListType.getDefaultInstance();
  }
  /**
   * <code>.plan.protobuf.ScalarListType list = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ScalarListTypeOrBuilder getListOrBuilder() {
    if (datatypeCase_ == 2) {
       return (org.blaze.protobuf.ScalarListType) datatype_;
    }
    return org.blaze.protobuf.ScalarListType.getDefaultInstance();
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
    if (datatypeCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) datatype_));
    }
    if (datatypeCase_ == 2) {
      output.writeMessage(2, (org.blaze.protobuf.ScalarListType) datatype_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (datatypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) datatype_));
    }
    if (datatypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.blaze.protobuf.ScalarListType) datatype_);
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
    if (!(obj instanceof org.blaze.protobuf.ScalarType)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.ScalarType other = (org.blaze.protobuf.ScalarType) obj;

    if (!getDatatypeCase().equals(other.getDatatypeCase())) return false;
    switch (datatypeCase_) {
      case 1:
        if (getScalarValue()
            != other.getScalarValue()) return false;
        break;
      case 2:
        if (!getList()
            .equals(other.getList())) return false;
        break;
      case 0:
      default:
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
    switch (datatypeCase_) {
      case 1:
        hash = (37 * hash) + SCALAR_FIELD_NUMBER;
        hash = (53 * hash) + getScalarValue();
        break;
      case 2:
        hash = (37 * hash) + LIST_FIELD_NUMBER;
        hash = (53 * hash) + getList().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.ScalarType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ScalarType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ScalarType parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.ScalarType prototype) {
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
   * Protobuf type {@code plan.protobuf.ScalarType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.ScalarType)
      org.blaze.protobuf.ScalarTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.ScalarType.class, org.blaze.protobuf.ScalarType.Builder.class);
    }

    // Construct using org.blaze.protobuf.ScalarType.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (listBuilder_ != null) {
        listBuilder_.clear();
      }
      datatypeCase_ = 0;
      datatype_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ScalarType_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.ScalarType getDefaultInstanceForType() {
      return org.blaze.protobuf.ScalarType.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.ScalarType build() {
      org.blaze.protobuf.ScalarType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.ScalarType buildPartial() {
      org.blaze.protobuf.ScalarType result = new org.blaze.protobuf.ScalarType(this);
      if (datatypeCase_ == 1) {
        result.datatype_ = datatype_;
      }
      if (datatypeCase_ == 2) {
        if (listBuilder_ == null) {
          result.datatype_ = datatype_;
        } else {
          result.datatype_ = listBuilder_.build();
        }
      }
      result.datatypeCase_ = datatypeCase_;
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
      if (other instanceof org.blaze.protobuf.ScalarType) {
        return mergeFrom((org.blaze.protobuf.ScalarType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.ScalarType other) {
      if (other == org.blaze.protobuf.ScalarType.getDefaultInstance()) return this;
      switch (other.getDatatypeCase()) {
        case SCALAR: {
          setScalarValue(other.getScalarValue());
          break;
        }
        case LIST: {
          mergeList(other.getList());
          break;
        }
        case DATATYPE_NOT_SET: {
          break;
        }
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
            case 8: {
              int rawValue = input.readEnum();
              datatypeCase_ = 1;
              datatype_ = rawValue;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getListFieldBuilder().getBuilder(),
                  extensionRegistry);
              datatypeCase_ = 2;
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
    private int datatypeCase_ = 0;
    private java.lang.Object datatype_;
    public DatatypeCase
        getDatatypeCase() {
      return DatatypeCase.forNumber(
          datatypeCase_);
    }

    public Builder clearDatatype() {
      datatypeCase_ = 0;
      datatype_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
     * @return Whether the scalar field is set.
     */
    @java.lang.Override
    public boolean hasScalar() {
      return datatypeCase_ == 1;
    }
    /**
     * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
     * @return The enum numeric value on the wire for scalar.
     */
    @java.lang.Override
    public int getScalarValue() {
      if (datatypeCase_ == 1) {
        return ((java.lang.Integer) datatype_).intValue();
      }
      return 0;
    }
    /**
     * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
     * @param value The enum numeric value on the wire for scalar to set.
     * @return This builder for chaining.
     */
    public Builder setScalarValue(int value) {
      datatypeCase_ = 1;
      datatype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
     * @return The scalar.
     */
    @java.lang.Override
    public org.blaze.protobuf.PrimitiveScalarType getScalar() {
      if (datatypeCase_ == 1) {
        @SuppressWarnings("deprecation")
        org.blaze.protobuf.PrimitiveScalarType result = org.blaze.protobuf.PrimitiveScalarType.valueOf(
            (java.lang.Integer) datatype_);
        return result == null ? org.blaze.protobuf.PrimitiveScalarType.UNRECOGNIZED : result;
      }
      return org.blaze.protobuf.PrimitiveScalarType.BOOL;
    }
    /**
     * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
     * @param value The scalar to set.
     * @return This builder for chaining.
     */
    public Builder setScalar(org.blaze.protobuf.PrimitiveScalarType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      datatypeCase_ = 1;
      datatype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.plan.protobuf.PrimitiveScalarType scalar = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScalar() {
      if (datatypeCase_ == 1) {
        datatypeCase_ = 0;
        datatype_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ScalarListType, org.blaze.protobuf.ScalarListType.Builder, org.blaze.protobuf.ScalarListTypeOrBuilder> listBuilder_;
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     * @return Whether the list field is set.
     */
    @java.lang.Override
    public boolean hasList() {
      return datatypeCase_ == 2;
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     * @return The list.
     */
    @java.lang.Override
    public org.blaze.protobuf.ScalarListType getList() {
      if (listBuilder_ == null) {
        if (datatypeCase_ == 2) {
          return (org.blaze.protobuf.ScalarListType) datatype_;
        }
        return org.blaze.protobuf.ScalarListType.getDefaultInstance();
      } else {
        if (datatypeCase_ == 2) {
          return listBuilder_.getMessage();
        }
        return org.blaze.protobuf.ScalarListType.getDefaultInstance();
      }
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     */
    public Builder setList(org.blaze.protobuf.ScalarListType value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datatype_ = value;
        onChanged();
      } else {
        listBuilder_.setMessage(value);
      }
      datatypeCase_ = 2;
      return this;
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     */
    public Builder setList(
        org.blaze.protobuf.ScalarListType.Builder builderForValue) {
      if (listBuilder_ == null) {
        datatype_ = builderForValue.build();
        onChanged();
      } else {
        listBuilder_.setMessage(builderForValue.build());
      }
      datatypeCase_ = 2;
      return this;
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     */
    public Builder mergeList(org.blaze.protobuf.ScalarListType value) {
      if (listBuilder_ == null) {
        if (datatypeCase_ == 2 &&
            datatype_ != org.blaze.protobuf.ScalarListType.getDefaultInstance()) {
          datatype_ = org.blaze.protobuf.ScalarListType.newBuilder((org.blaze.protobuf.ScalarListType) datatype_)
              .mergeFrom(value).buildPartial();
        } else {
          datatype_ = value;
        }
        onChanged();
      } else {
        if (datatypeCase_ == 2) {
          listBuilder_.mergeFrom(value);
        } else {
          listBuilder_.setMessage(value);
        }
      }
      datatypeCase_ = 2;
      return this;
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        if (datatypeCase_ == 2) {
          datatypeCase_ = 0;
          datatype_ = null;
          onChanged();
        }
      } else {
        if (datatypeCase_ == 2) {
          datatypeCase_ = 0;
          datatype_ = null;
        }
        listBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     */
    public org.blaze.protobuf.ScalarListType.Builder getListBuilder() {
      return getListFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     */
    @java.lang.Override
    public org.blaze.protobuf.ScalarListTypeOrBuilder getListOrBuilder() {
      if ((datatypeCase_ == 2) && (listBuilder_ != null)) {
        return listBuilder_.getMessageOrBuilder();
      } else {
        if (datatypeCase_ == 2) {
          return (org.blaze.protobuf.ScalarListType) datatype_;
        }
        return org.blaze.protobuf.ScalarListType.getDefaultInstance();
      }
    }
    /**
     * <code>.plan.protobuf.ScalarListType list = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ScalarListType, org.blaze.protobuf.ScalarListType.Builder, org.blaze.protobuf.ScalarListTypeOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        if (!(datatypeCase_ == 2)) {
          datatype_ = org.blaze.protobuf.ScalarListType.getDefaultInstance();
        }
        listBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.ScalarListType, org.blaze.protobuf.ScalarListType.Builder, org.blaze.protobuf.ScalarListTypeOrBuilder>(
                (org.blaze.protobuf.ScalarListType) datatype_,
                getParentForChildren(),
                isClean());
        datatype_ = null;
      }
      datatypeCase_ = 2;
      onChanged();;
      return listBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.ScalarType)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.ScalarType)
  private static final org.blaze.protobuf.ScalarType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.ScalarType();
  }

  public static org.blaze.protobuf.ScalarType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScalarType>
      PARSER = new com.google.protobuf.AbstractParser<ScalarType>() {
    @java.lang.Override
    public ScalarType parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScalarType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScalarType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.ScalarType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
