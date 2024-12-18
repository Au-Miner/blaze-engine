// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.PhysicalScalarFunctionNode}
 */
public final class PhysicalScalarFunctionNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.PhysicalScalarFunctionNode)
    PhysicalScalarFunctionNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhysicalScalarFunctionNode.newBuilder() to construct.
  private PhysicalScalarFunctionNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhysicalScalarFunctionNode() {
    name_ = "";
    fun_ = 0;
    args_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhysicalScalarFunctionNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalScalarFunctionNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalScalarFunctionNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.PhysicalScalarFunctionNode.class, org.blaze.protobuf.PhysicalScalarFunctionNode.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
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

  public static final int FUN_FIELD_NUMBER = 2;
  private int fun_;
  /**
   * <code>.plan.protobuf.ScalarFunction fun = 2;</code>
   * @return The enum numeric value on the wire for fun.
   */
  @java.lang.Override public int getFunValue() {
    return fun_;
  }
  /**
   * <code>.plan.protobuf.ScalarFunction fun = 2;</code>
   * @return The fun.
   */
  @java.lang.Override public org.blaze.protobuf.ScalarFunction getFun() {
    @SuppressWarnings("deprecation")
    org.blaze.protobuf.ScalarFunction result = org.blaze.protobuf.ScalarFunction.valueOf(fun_);
    return result == null ? org.blaze.protobuf.ScalarFunction.UNRECOGNIZED : result;
  }

  public static final int ARGS_FIELD_NUMBER = 3;
  private java.util.List<org.blaze.protobuf.PhysicalExprNode> args_;
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.PhysicalExprNode> getArgsList() {
    return args_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getArgsOrBuilderList() {
    return args_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
   */
  @java.lang.Override
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getArgs(int index) {
    return args_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getArgsOrBuilder(
      int index) {
    return args_.get(index);
  }

  public static final int RETURN_TYPE_FIELD_NUMBER = 4;
  private org.blaze.protobuf.ArrowType returnType_;
  /**
   * <code>.plan.protobuf.ArrowType return_type = 4;</code>
   * @return Whether the returnType field is set.
   */
  @java.lang.Override
  public boolean hasReturnType() {
    return returnType_ != null;
  }
  /**
   * <code>.plan.protobuf.ArrowType return_type = 4;</code>
   * @return The returnType.
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowType getReturnType() {
    return returnType_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : returnType_;
  }
  /**
   * <code>.plan.protobuf.ArrowType return_type = 4;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ArrowTypeOrBuilder getReturnTypeOrBuilder() {
    return getReturnType();
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
    if (fun_ != org.blaze.protobuf.ScalarFunction.Abs.getNumber()) {
      output.writeEnum(2, fun_);
    }
    for (int i = 0; i < args_.size(); i++) {
      output.writeMessage(3, args_.get(i));
    }
    if (returnType_ != null) {
      output.writeMessage(4, getReturnType());
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
    if (fun_ != org.blaze.protobuf.ScalarFunction.Abs.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, fun_);
    }
    for (int i = 0; i < args_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, args_.get(i));
    }
    if (returnType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getReturnType());
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
    if (!(obj instanceof org.blaze.protobuf.PhysicalScalarFunctionNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.PhysicalScalarFunctionNode other = (org.blaze.protobuf.PhysicalScalarFunctionNode) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (fun_ != other.fun_) return false;
    if (!getArgsList()
        .equals(other.getArgsList())) return false;
    if (hasReturnType() != other.hasReturnType()) return false;
    if (hasReturnType()) {
      if (!getReturnType()
          .equals(other.getReturnType())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FUN_FIELD_NUMBER;
    hash = (53 * hash) + fun_;
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    if (hasReturnType()) {
      hash = (37 * hash) + RETURN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getReturnType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalScalarFunctionNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.PhysicalScalarFunctionNode prototype) {
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
   * Protobuf type {@code plan.protobuf.PhysicalScalarFunctionNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.PhysicalScalarFunctionNode)
      org.blaze.protobuf.PhysicalScalarFunctionNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalScalarFunctionNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalScalarFunctionNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.PhysicalScalarFunctionNode.class, org.blaze.protobuf.PhysicalScalarFunctionNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.PhysicalScalarFunctionNode.newBuilder()
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

      fun_ = 0;

      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
      } else {
        args_ = null;
        argsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (returnTypeBuilder_ == null) {
        returnType_ = null;
      } else {
        returnType_ = null;
        returnTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalScalarFunctionNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalScalarFunctionNode getDefaultInstanceForType() {
      return org.blaze.protobuf.PhysicalScalarFunctionNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalScalarFunctionNode build() {
      org.blaze.protobuf.PhysicalScalarFunctionNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalScalarFunctionNode buildPartial() {
      org.blaze.protobuf.PhysicalScalarFunctionNode result = new org.blaze.protobuf.PhysicalScalarFunctionNode(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.fun_ = fun_;
      if (argsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          args_ = java.util.Collections.unmodifiableList(args_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.args_ = args_;
      } else {
        result.args_ = argsBuilder_.build();
      }
      if (returnTypeBuilder_ == null) {
        result.returnType_ = returnType_;
      } else {
        result.returnType_ = returnTypeBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.PhysicalScalarFunctionNode) {
        return mergeFrom((org.blaze.protobuf.PhysicalScalarFunctionNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.PhysicalScalarFunctionNode other) {
      if (other == org.blaze.protobuf.PhysicalScalarFunctionNode.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.fun_ != 0) {
        setFunValue(other.getFunValue());
      }
      if (argsBuilder_ == null) {
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
          }
          onChanged();
        }
      } else {
        if (!other.args_.isEmpty()) {
          if (argsBuilder_.isEmpty()) {
            argsBuilder_.dispose();
            argsBuilder_ = null;
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000001);
            argsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgsFieldBuilder() : null;
          } else {
            argsBuilder_.addAllMessages(other.args_);
          }
        }
      }
      if (other.hasReturnType()) {
        mergeReturnType(other.getReturnType());
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
            case 16: {
              fun_ = input.readEnum();

              break;
            } // case 16
            case 26: {
              org.blaze.protobuf.PhysicalExprNode m =
                  input.readMessage(
                      org.blaze.protobuf.PhysicalExprNode.parser(),
                      extensionRegistry);
              if (argsBuilder_ == null) {
                ensureArgsIsMutable();
                args_.add(m);
              } else {
                argsBuilder_.addMessage(m);
              }
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getReturnTypeFieldBuilder().getBuilder(),
                  extensionRegistry);

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
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
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

    private int fun_ = 0;
    /**
     * <code>.plan.protobuf.ScalarFunction fun = 2;</code>
     * @return The enum numeric value on the wire for fun.
     */
    @java.lang.Override public int getFunValue() {
      return fun_;
    }
    /**
     * <code>.plan.protobuf.ScalarFunction fun = 2;</code>
     * @param value The enum numeric value on the wire for fun to set.
     * @return This builder for chaining.
     */
    public Builder setFunValue(int value) {
      
      fun_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.plan.protobuf.ScalarFunction fun = 2;</code>
     * @return The fun.
     */
    @java.lang.Override
    public org.blaze.protobuf.ScalarFunction getFun() {
      @SuppressWarnings("deprecation")
      org.blaze.protobuf.ScalarFunction result = org.blaze.protobuf.ScalarFunction.valueOf(fun_);
      return result == null ? org.blaze.protobuf.ScalarFunction.UNRECOGNIZED : result;
    }
    /**
     * <code>.plan.protobuf.ScalarFunction fun = 2;</code>
     * @param value The fun to set.
     * @return This builder for chaining.
     */
    public Builder setFun(org.blaze.protobuf.ScalarFunction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fun_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.plan.protobuf.ScalarFunction fun = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFun() {
      
      fun_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<org.blaze.protobuf.PhysicalExprNode> args_ =
      java.util.Collections.emptyList();
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        args_ = new java.util.ArrayList<org.blaze.protobuf.PhysicalExprNode>(args_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> argsBuilder_;

    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode> getArgsList() {
      if (argsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(args_);
      } else {
        return argsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public int getArgsCount() {
      if (argsBuilder_ == null) {
        return args_.size();
      } else {
        return argsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode getArgs(int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);
      } else {
        return argsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder setArgs(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
      } else {
        argsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder setArgs(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.set(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder addArgs(org.blaze.protobuf.PhysicalExprNode value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(value);
        onChanged();
      } else {
        argsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder addArgs(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (argsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgsIsMutable();
        args_.add(index, value);
        onChanged();
      } else {
        argsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder addArgs(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder addArgs(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.add(index, builderForValue.build());
        onChanged();
      } else {
        argsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder addAllArgs(
        java.lang.Iterable<? extends org.blaze.protobuf.PhysicalExprNode> values) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
      } else {
        argsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder clearArgs() {
      if (argsBuilder_ == null) {
        args_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        argsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public Builder removeArgs(int index) {
      if (argsBuilder_ == null) {
        ensureArgsIsMutable();
        args_.remove(index);
        onChanged();
      } else {
        argsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getArgsBuilder(
        int index) {
      return getArgsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getArgsOrBuilder(
        int index) {
      if (argsBuilder_ == null) {
        return args_.get(index);  } else {
        return argsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
         getArgsOrBuilderList() {
      if (argsBuilder_ != null) {
        return argsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(args_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addArgsBuilder() {
      return getArgsFieldBuilder().addBuilder(
          org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addArgsBuilder(
        int index) {
      return getArgsFieldBuilder().addBuilder(
          index, org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode args = 3;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode.Builder> 
         getArgsBuilderList() {
      return getArgsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getArgsFieldBuilder() {
      if (argsBuilder_ == null) {
        argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                args_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        args_ = null;
      }
      return argsBuilder_;
    }

    private org.blaze.protobuf.ArrowType returnType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> returnTypeBuilder_;
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     * @return Whether the returnType field is set.
     */
    public boolean hasReturnType() {
      return returnTypeBuilder_ != null || returnType_ != null;
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     * @return The returnType.
     */
    public org.blaze.protobuf.ArrowType getReturnType() {
      if (returnTypeBuilder_ == null) {
        return returnType_ == null ? org.blaze.protobuf.ArrowType.getDefaultInstance() : returnType_;
      } else {
        return returnTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     */
    public Builder setReturnType(org.blaze.protobuf.ArrowType value) {
      if (returnTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returnType_ = value;
        onChanged();
      } else {
        returnTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     */
    public Builder setReturnType(
        org.blaze.protobuf.ArrowType.Builder builderForValue) {
      if (returnTypeBuilder_ == null) {
        returnType_ = builderForValue.build();
        onChanged();
      } else {
        returnTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     */
    public Builder mergeReturnType(org.blaze.protobuf.ArrowType value) {
      if (returnTypeBuilder_ == null) {
        if (returnType_ != null) {
          returnType_ =
            org.blaze.protobuf.ArrowType.newBuilder(returnType_).mergeFrom(value).buildPartial();
        } else {
          returnType_ = value;
        }
        onChanged();
      } else {
        returnTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     */
    public Builder clearReturnType() {
      if (returnTypeBuilder_ == null) {
        returnType_ = null;
        onChanged();
      } else {
        returnType_ = null;
        returnTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     */
    public org.blaze.protobuf.ArrowType.Builder getReturnTypeBuilder() {
      
      onChanged();
      return getReturnTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     */
    public org.blaze.protobuf.ArrowTypeOrBuilder getReturnTypeOrBuilder() {
      if (returnTypeBuilder_ != null) {
        return returnTypeBuilder_.getMessageOrBuilder();
      } else {
        return returnType_ == null ?
            org.blaze.protobuf.ArrowType.getDefaultInstance() : returnType_;
      }
    }
    /**
     * <code>.plan.protobuf.ArrowType return_type = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder> 
        getReturnTypeFieldBuilder() {
      if (returnTypeBuilder_ == null) {
        returnTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.ArrowType, org.blaze.protobuf.ArrowType.Builder, org.blaze.protobuf.ArrowTypeOrBuilder>(
                getReturnType(),
                getParentForChildren(),
                isClean());
        returnType_ = null;
      }
      return returnTypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.PhysicalScalarFunctionNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.PhysicalScalarFunctionNode)
  private static final org.blaze.protobuf.PhysicalScalarFunctionNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.PhysicalScalarFunctionNode();
  }

  public static org.blaze.protobuf.PhysicalScalarFunctionNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhysicalScalarFunctionNode>
      PARSER = new com.google.protobuf.AbstractParser<PhysicalScalarFunctionNode>() {
    @java.lang.Override
    public PhysicalScalarFunctionNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhysicalScalarFunctionNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhysicalScalarFunctionNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.PhysicalScalarFunctionNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

