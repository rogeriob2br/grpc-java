// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/cds.proto

package io.grpc.xds.shaded.envoy.api.v2;

/**
 * <pre>
 * An extensible structure containing the address Envoy should bind to when
 * establishing upstream connections.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.UpstreamBindConfig}
 */
public  final class UpstreamBindConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.UpstreamBindConfig)
    UpstreamBindConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpstreamBindConfig.newBuilder() to construct.
  private UpstreamBindConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpstreamBindConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpstreamBindConfig(
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
            io.grpc.xds.shaded.envoy.api.v2.core.Address.Builder subBuilder = null;
            if (sourceAddress_ != null) {
              subBuilder = sourceAddress_.toBuilder();
            }
            sourceAddress_ = input.readMessage(io.grpc.xds.shaded.envoy.api.v2.core.Address.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sourceAddress_);
              sourceAddress_ = subBuilder.buildPartial();
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
    return io.grpc.xds.shaded.envoy.api.v2.Cds.internal_static_envoy_api_v2_UpstreamBindConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.Cds.internal_static_envoy_api_v2_UpstreamBindConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig.class, io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig.Builder.class);
  }

  public static final int SOURCE_ADDRESS_FIELD_NUMBER = 1;
  private io.grpc.xds.shaded.envoy.api.v2.core.Address sourceAddress_;
  /**
   * <pre>
   * The address Envoy should bind to when establishing upstream connections.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address source_address = 1;</code>
   */
  public boolean hasSourceAddress() {
    return sourceAddress_ != null;
  }
  /**
   * <pre>
   * The address Envoy should bind to when establishing upstream connections.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address source_address = 1;</code>
   */
  public io.grpc.xds.shaded.envoy.api.v2.core.Address getSourceAddress() {
    return sourceAddress_ == null ? io.grpc.xds.shaded.envoy.api.v2.core.Address.getDefaultInstance() : sourceAddress_;
  }
  /**
   * <pre>
   * The address Envoy should bind to when establishing upstream connections.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address source_address = 1;</code>
   */
  public io.grpc.xds.shaded.envoy.api.v2.core.AddressOrBuilder getSourceAddressOrBuilder() {
    return getSourceAddress();
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
    if (sourceAddress_ != null) {
      output.writeMessage(1, getSourceAddress());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceAddress_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSourceAddress());
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
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig other = (io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig) obj;

    boolean result = true;
    result = result && (hasSourceAddress() == other.hasSourceAddress());
    if (hasSourceAddress()) {
      result = result && getSourceAddress()
          .equals(other.getSourceAddress());
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
    if (hasSourceAddress()) {
      hash = (37 * hash) + SOURCE_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getSourceAddress().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parseFrom(
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
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig prototype) {
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
   * An extensible structure containing the address Envoy should bind to when
   * establishing upstream connections.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.UpstreamBindConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.UpstreamBindConfig)
      io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.Cds.internal_static_envoy_api_v2_UpstreamBindConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.Cds.internal_static_envoy_api_v2_UpstreamBindConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig.class, io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig.newBuilder()
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
      if (sourceAddressBuilder_ == null) {
        sourceAddress_ = null;
      } else {
        sourceAddress_ = null;
        sourceAddressBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.Cds.internal_static_envoy_api_v2_UpstreamBindConfig_descriptor;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig build() {
      io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig result = new io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig(this);
      if (sourceAddressBuilder_ == null) {
        result.sourceAddress_ = sourceAddress_;
      } else {
        result.sourceAddress_ = sourceAddressBuilder_.build();
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
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig.getDefaultInstance()) return this;
      if (other.hasSourceAddress()) {
        mergeSourceAddress(other.getSourceAddress());
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
      io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grpc.xds.shaded.envoy.api.v2.core.Address sourceAddress_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.envoy.api.v2.core.Address, io.grpc.xds.shaded.envoy.api.v2.core.Address.Builder, io.grpc.xds.shaded.envoy.api.v2.core.AddressOrBuilder> sourceAddressBuilder_;
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public boolean hasSourceAddress() {
      return sourceAddressBuilder_ != null || sourceAddress_ != null;
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public io.grpc.xds.shaded.envoy.api.v2.core.Address getSourceAddress() {
      if (sourceAddressBuilder_ == null) {
        return sourceAddress_ == null ? io.grpc.xds.shaded.envoy.api.v2.core.Address.getDefaultInstance() : sourceAddress_;
      } else {
        return sourceAddressBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public Builder setSourceAddress(io.grpc.xds.shaded.envoy.api.v2.core.Address value) {
      if (sourceAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceAddress_ = value;
        onChanged();
      } else {
        sourceAddressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public Builder setSourceAddress(
        io.grpc.xds.shaded.envoy.api.v2.core.Address.Builder builderForValue) {
      if (sourceAddressBuilder_ == null) {
        sourceAddress_ = builderForValue.build();
        onChanged();
      } else {
        sourceAddressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public Builder mergeSourceAddress(io.grpc.xds.shaded.envoy.api.v2.core.Address value) {
      if (sourceAddressBuilder_ == null) {
        if (sourceAddress_ != null) {
          sourceAddress_ =
            io.grpc.xds.shaded.envoy.api.v2.core.Address.newBuilder(sourceAddress_).mergeFrom(value).buildPartial();
        } else {
          sourceAddress_ = value;
        }
        onChanged();
      } else {
        sourceAddressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public Builder clearSourceAddress() {
      if (sourceAddressBuilder_ == null) {
        sourceAddress_ = null;
        onChanged();
      } else {
        sourceAddress_ = null;
        sourceAddressBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public io.grpc.xds.shaded.envoy.api.v2.core.Address.Builder getSourceAddressBuilder() {
      
      onChanged();
      return getSourceAddressFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    public io.grpc.xds.shaded.envoy.api.v2.core.AddressOrBuilder getSourceAddressOrBuilder() {
      if (sourceAddressBuilder_ != null) {
        return sourceAddressBuilder_.getMessageOrBuilder();
      } else {
        return sourceAddress_ == null ?
            io.grpc.xds.shaded.envoy.api.v2.core.Address.getDefaultInstance() : sourceAddress_;
      }
    }
    /**
     * <pre>
     * The address Envoy should bind to when establishing upstream connections.
     * </pre>
     *
     * <code>.envoy.api.v2.core.Address source_address = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.envoy.api.v2.core.Address, io.grpc.xds.shaded.envoy.api.v2.core.Address.Builder, io.grpc.xds.shaded.envoy.api.v2.core.AddressOrBuilder> 
        getSourceAddressFieldBuilder() {
      if (sourceAddressBuilder_ == null) {
        sourceAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.xds.shaded.envoy.api.v2.core.Address, io.grpc.xds.shaded.envoy.api.v2.core.Address.Builder, io.grpc.xds.shaded.envoy.api.v2.core.AddressOrBuilder>(
                getSourceAddress(),
                getParentForChildren(),
                isClean());
        sourceAddress_ = null;
      }
      return sourceAddressBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.UpstreamBindConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.UpstreamBindConfig)
  private static final io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpstreamBindConfig>
      PARSER = new com.google.protobuf.AbstractParser<UpstreamBindConfig>() {
    @java.lang.Override
    public UpstreamBindConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpstreamBindConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpstreamBindConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpstreamBindConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.xds.shaded.envoy.api.v2.UpstreamBindConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

