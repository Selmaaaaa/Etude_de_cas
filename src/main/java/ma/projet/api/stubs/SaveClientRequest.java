// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

/**
 * Protobuf type {@code SaveClientRequest}
 */
public  final class SaveClientRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SaveClientRequest)
    SaveClientRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveClientRequest.newBuilder() to construct.
  private SaveClientRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveClientRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveClientRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveClientRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            ma.projet.api.stubs.ClientRequest.Builder subBuilder = null;
            if (client_ != null) {
              subBuilder = client_.toBuilder();
            }
            client_ = input.readMessage(ma.projet.api.stubs.ClientRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(client_);
              client_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveClientRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveClientRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.api.stubs.SaveClientRequest.class, ma.projet.api.stubs.SaveClientRequest.Builder.class);
  }

  public static final int CLIENT_FIELD_NUMBER = 1;
  private ma.projet.api.stubs.ClientRequest client_;
  /**
   * <code>.ClientRequest client = 1;</code>
   * @return Whether the client field is set.
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.ClientRequest client = 1;</code>
   * @return The client.
   */
  public ma.projet.api.stubs.ClientRequest getClient() {
    return client_ == null ? ma.projet.api.stubs.ClientRequest.getDefaultInstance() : client_;
  }
  /**
   * <code>.ClientRequest client = 1;</code>
   */
  public ma.projet.api.stubs.ClientRequestOrBuilder getClientOrBuilder() {
    return getClient();
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
    if (client_ != null) {
      output.writeMessage(1, getClient());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClient());
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
    if (!(obj instanceof ma.projet.api.stubs.SaveClientRequest)) {
      return super.equals(obj);
    }
    ma.projet.api.stubs.SaveClientRequest other = (ma.projet.api.stubs.SaveClientRequest) obj;

    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.SaveClientRequest parseFrom(
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
  public static Builder newBuilder(ma.projet.api.stubs.SaveClientRequest prototype) {
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
   * Protobuf type {@code SaveClientRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SaveClientRequest)
      ma.projet.api.stubs.SaveClientRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveClientRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveClientRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.api.stubs.SaveClientRequest.class, ma.projet.api.stubs.SaveClientRequest.Builder.class);
    }

    // Construct using ma.projet.api.stubs.SaveClientRequest.newBuilder()
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
      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveClientRequest_descriptor;
    }

    @java.lang.Override
    public ma.projet.api.stubs.SaveClientRequest getDefaultInstanceForType() {
      return ma.projet.api.stubs.SaveClientRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.api.stubs.SaveClientRequest build() {
      ma.projet.api.stubs.SaveClientRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.api.stubs.SaveClientRequest buildPartial() {
      ma.projet.api.stubs.SaveClientRequest result = new ma.projet.api.stubs.SaveClientRequest(this);
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
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
      if (other instanceof ma.projet.api.stubs.SaveClientRequest) {
        return mergeFrom((ma.projet.api.stubs.SaveClientRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.api.stubs.SaveClientRequest other) {
      if (other == ma.projet.api.stubs.SaveClientRequest.getDefaultInstance()) return this;
      if (other.hasClient()) {
        mergeClient(other.getClient());
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
      ma.projet.api.stubs.SaveClientRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.api.stubs.SaveClientRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ma.projet.api.stubs.ClientRequest client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.projet.api.stubs.ClientRequest, ma.projet.api.stubs.ClientRequest.Builder, ma.projet.api.stubs.ClientRequestOrBuilder> clientBuilder_;
    /**
     * <code>.ClientRequest client = 1;</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     * @return The client.
     */
    public ma.projet.api.stubs.ClientRequest getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? ma.projet.api.stubs.ClientRequest.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     */
    public Builder setClient(ma.projet.api.stubs.ClientRequest value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     */
    public Builder setClient(
        ma.projet.api.stubs.ClientRequest.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     */
    public Builder mergeClient(ma.projet.api.stubs.ClientRequest value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            ma.projet.api.stubs.ClientRequest.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     */
    public ma.projet.api.stubs.ClientRequest.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     */
    public ma.projet.api.stubs.ClientRequestOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            ma.projet.api.stubs.ClientRequest.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.ClientRequest client = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.projet.api.stubs.ClientRequest, ma.projet.api.stubs.ClientRequest.Builder, ma.projet.api.stubs.ClientRequestOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ma.projet.api.stubs.ClientRequest, ma.projet.api.stubs.ClientRequest.Builder, ma.projet.api.stubs.ClientRequestOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SaveClientRequest)
  }

  // @@protoc_insertion_point(class_scope:SaveClientRequest)
  private static final ma.projet.api.stubs.SaveClientRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.api.stubs.SaveClientRequest();
  }

  public static ma.projet.api.stubs.SaveClientRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveClientRequest>
      PARSER = new com.google.protobuf.AbstractParser<SaveClientRequest>() {
    @java.lang.Override
    public SaveClientRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveClientRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveClientRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveClientRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.api.stubs.SaveClientRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

