// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

/**
 * <pre>
 * Header name/value pair plus option to control append behavior.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.HeaderValueOption}
 */
public  final class HeaderValueOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.HeaderValueOption)
    HeaderValueOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeaderValueOption.newBuilder() to construct.
  private HeaderValueOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeaderValueOption() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HeaderValueOption(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (append_ != null) {
              subBuilder = append_.toBuilder();
            }
            append_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(append_);
              append_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_HeaderValueOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_HeaderValueOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption.class, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue header_;
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   */
  public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue getHeader() {
    return header_ == null ? io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * Header name/value pair that this option applies to.
   * </pre>
   *
   * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
   */
  public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int APPEND_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue append_;
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   */
  public boolean hasAppend() {
    return append_ != null;
  }
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   */
  public com.google.protobuf.BoolValue getAppend() {
    return append_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : append_;
  }
  /**
   * <pre>
   * Should the value be appended? If true (default), the value is appended to
   * existing values.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue append = 2;</code>
   */
  public com.google.protobuf.BoolValueOrBuilder getAppendOrBuilder() {
    return getAppend();
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (append_ != null) {
      output.writeMessage(2, getAppend());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (append_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAppend());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption other = (io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (hasAppend() == other.hasAppend());
    if (hasAppend()) {
      result = result && getAppend()
          .equals(other.getAppend());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasAppend()) {
      hash = (37 * hash) + APPEND_FIELD_NUMBER;
      hash = (53 * hash) + getAppend().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parseFrom(
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
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption prototype) {
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
   * <pre>
   * Header name/value pair plus option to control append behavior.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.HeaderValueOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.HeaderValueOption)
      io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_HeaderValueOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_HeaderValueOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption.class, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (appendBuilder_ == null) {
        append_ = null;
      } else {
        append_ = null;
        appendBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_HeaderValueOption_descriptor;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption build() {
      io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption result = new io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (appendBuilder_ == null) {
        result.append_ = append_;
      } else {
        result.append_ = appendBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasAppend()) {
        mergeAppend(other.getAppend());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.Builder, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOrBuilder> headerBuilder_;
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setHeader(io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setHeader(
        io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeHeader(io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * Header name/value pair that this option applies to.
     * </pre>
     *
     * <code>.envoy.api.v2.core.HeaderValue header = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.Builder, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValue.Builder, io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.BoolValue append_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> appendBuilder_;
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public boolean hasAppend() {
      return appendBuilder_ != null || append_ != null;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public com.google.protobuf.BoolValue getAppend() {
      if (appendBuilder_ == null) {
        return append_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : append_;
      } else {
        return appendBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder setAppend(com.google.protobuf.BoolValue value) {
      if (appendBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        append_ = value;
        onChanged();
      } else {
        appendBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder setAppend(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (appendBuilder_ == null) {
        append_ = builderForValue.build();
        onChanged();
      } else {
        appendBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder mergeAppend(com.google.protobuf.BoolValue value) {
      if (appendBuilder_ == null) {
        if (append_ != null) {
          append_ =
            com.google.protobuf.BoolValue.newBuilder(append_).mergeFrom(value).buildPartial();
        } else {
          append_ = value;
        }
        onChanged();
      } else {
        appendBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public Builder clearAppend() {
      if (appendBuilder_ == null) {
        append_ = null;
        onChanged();
      } else {
        append_ = null;
        appendBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public com.google.protobuf.BoolValue.Builder getAppendBuilder() {
      
      onChanged();
      return getAppendFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getAppendOrBuilder() {
      if (appendBuilder_ != null) {
        return appendBuilder_.getMessageOrBuilder();
      } else {
        return append_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : append_;
      }
    }
    /**
     * <pre>
     * Should the value be appended? If true (default), the value is appended to
     * existing values.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue append = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getAppendFieldBuilder() {
      if (appendBuilder_ == null) {
        appendBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getAppend(),
                getParentForChildren(),
                isClean());
        append_ = null;
      }
      return appendBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.HeaderValueOption)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.HeaderValueOption)
  private static final io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeaderValueOption>
      PARSER = new com.google.protobuf.AbstractParser<HeaderValueOption>() {
    @java.lang.Override
    public HeaderValueOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HeaderValueOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeaderValueOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeaderValueOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.xds.shaded.envoy.api.v2.core.HeaderValueOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

