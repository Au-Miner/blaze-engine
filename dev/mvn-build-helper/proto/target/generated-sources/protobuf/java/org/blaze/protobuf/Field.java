// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.Field}
 */
public final class Field extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.Field)
    FieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Field.newBuilder() to construct.
  private Field(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Field() {
    name_ = "";
    children_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Field();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Field_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Field_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.Field.class, org.blaze.protobuf.Field.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * name of the field
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name of the field
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARROW_TYPE_FIELD_NUMBER = 2;
  private org.blaze.protobuf.ArrowType arrowType_;
  /**
   * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
   * @return Whether the arrowType field is set.
   */
  @java.lang.Override
  public boolean hasArrowType() {
    return arrowType_ != null;
  }
  /**
   * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
   * @return The arrowType.
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowType getArrowType() {
    return arrowType_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : arrowType_;
  }
  /**
   * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowTypeOrBuilder getArrowTypeOrBuilder() {
    return getArrowType();
  }

  public static final int NULLABLE_FIELD_NUMBER = 3;
  private boolean nullable_;
  /**
   * <code>bool nullable = 3;</code>
   * @return The nullable.
   */
  @java.lang.Override
  public boolean getNullable() {
    return nullable_;
  }

  public static final int CHILDREN_FIELD_NUMBER = 4;
  private java.util.List<org.blaze.protobuf.Field> children_;
  /**
   * <pre>
   * for complex data types like structs, unions
   * </pre>
   *
   * <code>repeated .plan.protobuf.Field children = 4;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.Field> getChildrenList() {
    return children_;
  }
  /**
   * <pre>
   * for complex data types like structs, unions
   * </pre>
   *
   * <code>repeated .plan.protobuf.Field children = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.FieldOrBuilder> 
      getChildrenOrBuilderList() {
    return children_;
  }
  /**
   * <pre>
   * for complex data types like structs, unions
   * </pre>
   *
   * <code>repeated .plan.protobuf.Field children = 4;</code>
   */
  @java.lang.Override
  public int getChildrenCount() {
    return children_.size();
  }
  /**
   * <pre>
   * for complex data types like structs, unions
   * </pre>
   *
   * <code>repeated .plan.protobuf.Field children = 4;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.Field getChildren(int index) {
    return children_.get(index);
  }
  /**
   * <pre>
   * for complex data types like structs, unions
   * </pre>
   *
   * <code>repeated .plan.protobuf.Field children = 4;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.FieldOrBuilder getChildrenOrBuilder(
      int index) {
    return children_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (arrowType_ != null) {
      output.writeMessage(2, getArrowType());
    }
    if (nullable_ != false) {
      output.writeBool(3, nullable_);
    }
    for (int i = 0; i < children_.size(); i++) {
      output.writeMessage(4, children_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (arrowType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getArrowType());
    }
    if (nullable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, nullable_);
    }
    for (int i = 0; i < children_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, children_.get(i));
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
    if (!(obj instanceof org.blaze.protobuf.Field)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.Field other = (org.blaze.protobuf.Field) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasArrowType() != other.hasArrowType()) return false;
    if (hasArrowType()) {
      if (!getArrowType()
          .equals(other.getArrowType())) return false;
    }
    if (getNullable()
        != other.getNullable()) return false;
    if (!getChildrenList()
        .equals(other.getChildrenList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasArrowType()) {
      hash = (37 * hash) + ARROW_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getArrowType().hashCode();
    }
    hash = (37 * hash) + NULLABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNullable());
    if (getChildrenCount() > 0) {
      hash = (37 * hash) + CHILDREN_FIELD_NUMBER;
      hash = (53 * hash) + getChildrenList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.Field parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Field parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Field parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Field parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Field parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Field parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Field parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Field parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Field parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Field parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Field parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Field parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.Field prototype) {
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
   * Protobuf type {@code plan.protobuf.Field}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.Field)
      org.blaze.protobuf.FieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Field_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Field_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.Field.class, org.blaze.protobuf.Field.Builder.class);
    }

    // Construct using org.blaze.protobuf.Field.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (arrowTypeBuilder_ == null) {
        arrowType_ = null;
      } else {
        arrowType_ = null;
        arrowTypeBuilder_ = null;
      }
      nullable_ = false;

      if (childrenBuilder_ == null) {
        children_ = java.util.Collections.emptyList();
      } else {
        children_ = null;
        childrenBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Field_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.Field getDefaultInstanceForType() {
      return org.blaze.protobuf.Field.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.Field build() {
      org.blaze.protobuf.Field result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.Field buildPartial() {
      org.blaze.protobuf.Field result = new org.blaze.protobuf.Field(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (arrowTypeBuilder_ == null) {
        result.arrowType_ = arrowType_;
      } else {
        result.arrowType_ = arrowTypeBuilder_.build();
      }
      result.nullable_ = nullable_;
      if (childrenBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          children_ = java.util.Collections.unmodifiableList(children_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.children_ = children_;
      } else {
        result.children_ = childrenBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.Field) {
        return mergeFrom((org.blaze.protobuf.Field)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.Field other) {
      if (other == org.blaze.protobuf.Field.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasArrowType()) {
        mergeArrowType(other.getArrowType());
      }
      if (other.getNullable() != false) {
        setNullable(other.getNullable());
      }
      if (childrenBuilder_ == null) {
        if (!other.children_.isEmpty()) {
          if (children_.isEmpty()) {
            children_ = other.children_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChildrenIsMutable();
            children_.addAll(other.children_);
          }
          onChanged();
        }
      } else {
        if (!other.children_.isEmpty()) {
          if (childrenBuilder_.isEmpty()) {
            childrenBuilder_.dispose();
            childrenBuilder_ = null;
            children_ = other.children_;
            bitField0_ = (bitField0_ & ~0x00000001);
            childrenBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChildrenFieldBuilder() : null;
          } else {
            childrenBuilder_.addAllMessages(other.children_);
          }
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
            case 10: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getArrowTypeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              nullable_ = input.readBool();

              break;
            } // case 24
            case 34: {
              org.blaze.protobuf.Field m =
                  input.readMessage(
                      org.blaze.protobuf.Field.parser(),
                      extensionRegistry);
              if (childrenBuilder_ == null) {
                ensureChildrenIsMutable();
                children_.add(m);
              } else {
                childrenBuilder_.addMessage(m);
              }
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name of the field
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name of the field
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name of the field
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the field
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the field
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private org.blaze.protobuf.ArrowType arrowType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> arrowTypeBuilder_;
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     * @return Whether the arrowType field is set.
     */
    public boolean hasArrowType() {
      return arrowTypeBuilder_ != null || arrowType_ != null;
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     * @return The arrowType.
     */
    public org.blaze.protobuf.ArrowType getArrowType() {
      if (arrowTypeBuilder_ == null) {
        return arrowType_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : arrowType_;
      } else {
        return arrowTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     */
    public Builder setArrowType(org.blaze.protobuf.ArrowType value) {
      if (arrowTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arrowType_ = value;
        onChanged();
      } else {
        arrowTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     */
    public Builder setArrowType(
        org.blaze.protobuf.ArrowType.Builder builderForValue) {
      if (arrowTypeBuilder_ == null) {
        arrowType_ = builderForValue.build();
        onChanged();
      } else {
        arrowTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     */
    public Builder mergeArrowType(org.blaze.protobuf.ArrowType value) {
      if (arrowTypeBuilder_ == null) {
        if (arrowType_ != null) {
          arrowType_ =
            org.blaze.protobuf.ArrowType.newBuilder(arrowType_).mergeFrom(value).buildPartial();
        } else {
          arrowType_ = value;
        }
        onChanged();
      } else {
        arrowTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     */
    public Builder clearArrowType() {
      if (arrowTypeBuilder_ == null) {
        arrowType_ = null;
        onChanged();
      } else {
        arrowType_ = null;
        arrowTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     */
    public org.blaze.protobuf.ArrowType.Builder getArrowTypeBuilder() {
      
      onChanged();
      return getArrowTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     */
    public org.blaze.protobuf.ArrowTypeOrBuilder getArrowTypeOrBuilder() {
      if (arrowTypeBuilder_ != null) {
        return arrowTypeBuilder_.getMessageOrBuilder();
      } else {
        return arrowType_ == null ?
            org.blaze.protobuf.ArrowType.getDefaultInstance() : arrowType_;
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType arrow_type = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> 
        getArrowTypeFieldBuilder() {
      if (arrowTypeBuilder_ == null) {
        arrowTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder>(
                getArrowType(),
                getParentForChildren(),
                isClean());
        arrowType_ = null;
      }
      return arrowTypeBuilder_;
    }

    private boolean nullable_ ;
    /**
     * <code>bool nullable = 3;</code>
     * @return The nullable.
     */
    @java.lang.Override
    public boolean getNullable() {
      return nullable_;
    }
    /**
     * <code>bool nullable = 3;</code>
     * @param value The nullable to set.
     * @return This builder for chaining.
     */
    public Builder setNullable(boolean value) {
      
      nullable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nullable = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNullable() {
      
      nullable_ = false;
      onChanged();
      return this;
    }

    private java.util.List<org.blaze.protobuf.Field> children_ =
      java.util.Collections.emptyList();
    private void ensureChildrenIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        children_ = new java.util.ArrayList<org.blaze.protobuf.Field>(children_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> childrenBuilder_;

    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public java.util.List<org.blaze.protobuf.Field> getChildrenList() {
      if (childrenBuilder_ == null) {
        return java.util.Collections.unmodifiableList(children_);
      } else {
        return childrenBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public int getChildrenCount() {
      if (childrenBuilder_ == null) {
        return children_.size();
      } else {
        return childrenBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public org.blaze.protobuf.Field getChildren(int index) {
      if (childrenBuilder_ == null) {
        return children_.get(index);
      } else {
        return childrenBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder setChildren(
        int index, org.blaze.protobuf.Field value) {
      if (childrenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChildrenIsMutable();
        children_.set(index, value);
        onChanged();
      } else {
        childrenBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder setChildren(
        int index, org.blaze.protobuf.Field.Builder builderForValue) {
      if (childrenBuilder_ == null) {
        ensureChildrenIsMutable();
        children_.set(index, builderForValue.build());
        onChanged();
      } else {
        childrenBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder addChildren(org.blaze.protobuf.Field value) {
      if (childrenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChildrenIsMutable();
        children_.add(value);
        onChanged();
      } else {
        childrenBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder addChildren(
        int index, org.blaze.protobuf.Field value) {
      if (childrenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChildrenIsMutable();
        children_.add(index, value);
        onChanged();
      } else {
        childrenBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder addChildren(
        org.blaze.protobuf.Field.Builder builderForValue) {
      if (childrenBuilder_ == null) {
        ensureChildrenIsMutable();
        children_.add(builderForValue.build());
        onChanged();
      } else {
        childrenBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder addChildren(
        int index, org.blaze.protobuf.Field.Builder builderForValue) {
      if (childrenBuilder_ == null) {
        ensureChildrenIsMutable();
        children_.add(index, builderForValue.build());
        onChanged();
      } else {
        childrenBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder addAllChildren(
        java.lang.Iterable<? extends org.blaze.protobuf.Field> values) {
      if (childrenBuilder_ == null) {
        ensureChildrenIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, children_);
        onChanged();
      } else {
        childrenBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder clearChildren() {
      if (childrenBuilder_ == null) {
        children_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        childrenBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public Builder removeChildren(int index) {
      if (childrenBuilder_ == null) {
        ensureChildrenIsMutable();
        children_.remove(index);
        onChanged();
      } else {
        childrenBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public org.blaze.protobuf.Field.Builder getChildrenBuilder(
        int index) {
      return getChildrenFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public org.blaze.protobuf.FieldOrBuilder getChildrenOrBuilder(
        int index) {
      if (childrenBuilder_ == null) {
        return children_.get(index);  } else {
        return childrenBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.FieldOrBuilder> 
         getChildrenOrBuilderList() {
      if (childrenBuilder_ != null) {
        return childrenBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(children_);
      }
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public org.blaze.protobuf.Field.Builder addChildrenBuilder() {
      return getChildrenFieldBuilder().addBuilder(
          org.blaze.protobuf.Field.getDefaultInstance());
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public org.blaze.protobuf.Field.Builder addChildrenBuilder(
        int index) {
      return getChildrenFieldBuilder().addBuilder(
          index, org.blaze.protobuf.Field.getDefaultInstance());
    }
    /**
     * <pre>
     * for complex data types like structs, unions
     * </pre>
     *
     * <code>repeated .plan.protobuf.Field children = 4;</code>
     */
    public java.util.List<org.blaze.protobuf.Field.Builder> 
         getChildrenBuilderList() {
      return getChildrenFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder> 
        getChildrenFieldBuilder() {
      if (childrenBuilder_ == null) {
        childrenBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.Field, org.blaze.protobuf.Field.Builder, org.blaze.protobuf.FieldOrBuilder>(
                children_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        children_ = null;
      }
      return childrenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.Field)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.Field)
  private static final org.blaze.protobuf.Field DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.Field();
  }

  public static org.blaze.protobuf.Field getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Field>
      PARSER = new com.google.protobuf.AbstractParser<Field>() {
    @java.lang.Override
    public Field parsePartialFrom(
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

  public static com.google.protobuf.Parser<Field> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Field> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.Field getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

