// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PcrfGrpcService.proto

package tmt.pcrf.grpc;

/**
 * Protobuf type {@code ServerMessage}
 */
public  final class ServerMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServerMessage)
    ServerMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerMessage.newBuilder() to construct.
  private ServerMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerMessage() {
    messageType_ = 0;
    moduleId_ = 0L;
    status_ = 0;
    uniqueRefId_ = "";
    messageKey_ = "";
    sessionId_ = "";
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerMessage(
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
          case 8: {
            int rawValue = input.readEnum();

            messageType_ = rawValue;
            break;
          }
          case 16: {

            moduleId_ = input.readInt64();
            break;
          }
          case 24: {

            status_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            uniqueRefId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            messageKey_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionId_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
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
    return tmt.pcrf.grpc.PcrfGrpcService.internal_static_ServerMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tmt.pcrf.grpc.PcrfGrpcService.internal_static_ServerMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tmt.pcrf.grpc.ServerMessage.class, tmt.pcrf.grpc.ServerMessage.Builder.class);
  }

  public static final int MESSAGETYPE_FIELD_NUMBER = 1;
  private int messageType_;
  /**
   * <pre>
   * Define the fields for the request JSON data.
   * </pre>
   *
   * <code>.MessageType messageType = 1;</code>
   */
  public int getMessageTypeValue() {
    return messageType_;
  }
  /**
   * <pre>
   * Define the fields for the request JSON data.
   * </pre>
   *
   * <code>.MessageType messageType = 1;</code>
   */
  public tmt.pcrf.grpc.MessageType getMessageType() {
    @SuppressWarnings("deprecation")
    tmt.pcrf.grpc.MessageType result = tmt.pcrf.grpc.MessageType.valueOf(messageType_);
    return result == null ? tmt.pcrf.grpc.MessageType.UNRECOGNIZED : result;
  }

  public static final int MODULEID_FIELD_NUMBER = 2;
  private long moduleId_;
  /**
   * <code>int64 moduleId = 2;</code>
   */
  public long getModuleId() {
    return moduleId_;
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>int32 status = 3;</code>
   */
  public int getStatus() {
    return status_;
  }

  public static final int UNIQUEREFID_FIELD_NUMBER = 4;
  private volatile java.lang.Object uniqueRefId_;
  /**
   * <code>string uniqueRefId = 4;</code>
   */
  public java.lang.String getUniqueRefId() {
    java.lang.Object ref = uniqueRefId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uniqueRefId_ = s;
      return s;
    }
  }
  /**
   * <code>string uniqueRefId = 4;</code>
   */
  public com.google.protobuf.ByteString
      getUniqueRefIdBytes() {
    java.lang.Object ref = uniqueRefId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uniqueRefId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGEKEY_FIELD_NUMBER = 5;
  private volatile java.lang.Object messageKey_;
  /**
   * <code>string messageKey = 5;</code>
   */
  public java.lang.String getMessageKey() {
    java.lang.Object ref = messageKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageKey_ = s;
      return s;
    }
  }
  /**
   * <code>string messageKey = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMessageKeyBytes() {
    java.lang.Object ref = messageKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSIONID_FIELD_NUMBER = 6;
  private volatile java.lang.Object sessionId_;
  /**
   * <code>string sessionId = 6;</code>
   */
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string sessionId = 6;</code>
   */
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 7;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 7;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 7;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (messageType_ != tmt.pcrf.grpc.MessageType.NW_REQUEST.getNumber()) {
      output.writeEnum(1, messageType_);
    }
    if (moduleId_ != 0L) {
      output.writeInt64(2, moduleId_);
    }
    if (status_ != 0) {
      output.writeInt32(3, status_);
    }
    if (!getUniqueRefIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uniqueRefId_);
    }
    if (!getMessageKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, messageKey_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sessionId_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, message_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageType_ != tmt.pcrf.grpc.MessageType.NW_REQUEST.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, messageType_);
    }
    if (moduleId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, moduleId_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, status_);
    }
    if (!getUniqueRefIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uniqueRefId_);
    }
    if (!getMessageKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, messageKey_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sessionId_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, message_);
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
    if (!(obj instanceof tmt.pcrf.grpc.ServerMessage)) {
      return super.equals(obj);
    }
    tmt.pcrf.grpc.ServerMessage other = (tmt.pcrf.grpc.ServerMessage) obj;

    boolean result = true;
    result = result && messageType_ == other.messageType_;
    result = result && (getModuleId()
        == other.getModuleId());
    result = result && (getStatus()
        == other.getStatus());
    result = result && getUniqueRefId()
        .equals(other.getUniqueRefId());
    result = result && getMessageKey()
        .equals(other.getMessageKey());
    result = result && getSessionId()
        .equals(other.getSessionId());
    result = result && getMessage()
        .equals(other.getMessage());
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
    hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
    hash = (53 * hash) + messageType_;
    hash = (37 * hash) + MODULEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModuleId());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + UNIQUEREFID_FIELD_NUMBER;
    hash = (53 * hash) + getUniqueRefId().hashCode();
    hash = (37 * hash) + MESSAGEKEY_FIELD_NUMBER;
    hash = (53 * hash) + getMessageKey().hashCode();
    hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tmt.pcrf.grpc.ServerMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tmt.pcrf.grpc.ServerMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tmt.pcrf.grpc.ServerMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tmt.pcrf.grpc.ServerMessage parseFrom(
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
  public static Builder newBuilder(tmt.pcrf.grpc.ServerMessage prototype) {
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
   * Protobuf type {@code ServerMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServerMessage)
      tmt.pcrf.grpc.ServerMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tmt.pcrf.grpc.PcrfGrpcService.internal_static_ServerMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tmt.pcrf.grpc.PcrfGrpcService.internal_static_ServerMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tmt.pcrf.grpc.ServerMessage.class, tmt.pcrf.grpc.ServerMessage.Builder.class);
    }

    // Construct using tmt.pcrf.grpc.ServerMessage.newBuilder()
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
      messageType_ = 0;

      moduleId_ = 0L;

      status_ = 0;

      uniqueRefId_ = "";

      messageKey_ = "";

      sessionId_ = "";

      message_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tmt.pcrf.grpc.PcrfGrpcService.internal_static_ServerMessage_descriptor;
    }

    @java.lang.Override
    public tmt.pcrf.grpc.ServerMessage getDefaultInstanceForType() {
      return tmt.pcrf.grpc.ServerMessage.getDefaultInstance();
    }

    @java.lang.Override
    public tmt.pcrf.grpc.ServerMessage build() {
      tmt.pcrf.grpc.ServerMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tmt.pcrf.grpc.ServerMessage buildPartial() {
      tmt.pcrf.grpc.ServerMessage result = new tmt.pcrf.grpc.ServerMessage(this);
      result.messageType_ = messageType_;
      result.moduleId_ = moduleId_;
      result.status_ = status_;
      result.uniqueRefId_ = uniqueRefId_;
      result.messageKey_ = messageKey_;
      result.sessionId_ = sessionId_;
      result.message_ = message_;
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
      if (other instanceof tmt.pcrf.grpc.ServerMessage) {
        return mergeFrom((tmt.pcrf.grpc.ServerMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tmt.pcrf.grpc.ServerMessage other) {
      if (other == tmt.pcrf.grpc.ServerMessage.getDefaultInstance()) return this;
      if (other.messageType_ != 0) {
        setMessageTypeValue(other.getMessageTypeValue());
      }
      if (other.getModuleId() != 0L) {
        setModuleId(other.getModuleId());
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getUniqueRefId().isEmpty()) {
        uniqueRefId_ = other.uniqueRefId_;
        onChanged();
      }
      if (!other.getMessageKey().isEmpty()) {
        messageKey_ = other.messageKey_;
        onChanged();
      }
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
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
      tmt.pcrf.grpc.ServerMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tmt.pcrf.grpc.ServerMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int messageType_ = 0;
    /**
     * <pre>
     * Define the fields for the request JSON data.
     * </pre>
     *
     * <code>.MessageType messageType = 1;</code>
     */
    public int getMessageTypeValue() {
      return messageType_;
    }
    /**
     * <pre>
     * Define the fields for the request JSON data.
     * </pre>
     *
     * <code>.MessageType messageType = 1;</code>
     */
    public Builder setMessageTypeValue(int value) {
      messageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the fields for the request JSON data.
     * </pre>
     *
     * <code>.MessageType messageType = 1;</code>
     */
    public tmt.pcrf.grpc.MessageType getMessageType() {
      @SuppressWarnings("deprecation")
      tmt.pcrf.grpc.MessageType result = tmt.pcrf.grpc.MessageType.valueOf(messageType_);
      return result == null ? tmt.pcrf.grpc.MessageType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Define the fields for the request JSON data.
     * </pre>
     *
     * <code>.MessageType messageType = 1;</code>
     */
    public Builder setMessageType(tmt.pcrf.grpc.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      messageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the fields for the request JSON data.
     * </pre>
     *
     * <code>.MessageType messageType = 1;</code>
     */
    public Builder clearMessageType() {
      
      messageType_ = 0;
      onChanged();
      return this;
    }

    private long moduleId_ ;
    /**
     * <code>int64 moduleId = 2;</code>
     */
    public long getModuleId() {
      return moduleId_;
    }
    /**
     * <code>int64 moduleId = 2;</code>
     */
    public Builder setModuleId(long value) {
      
      moduleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 moduleId = 2;</code>
     */
    public Builder clearModuleId() {
      
      moduleId_ = 0L;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 3;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 3;</code>
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object uniqueRefId_ = "";
    /**
     * <code>string uniqueRefId = 4;</code>
     */
    public java.lang.String getUniqueRefId() {
      java.lang.Object ref = uniqueRefId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uniqueRefId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uniqueRefId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUniqueRefIdBytes() {
      java.lang.Object ref = uniqueRefId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uniqueRefId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uniqueRefId = 4;</code>
     */
    public Builder setUniqueRefId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uniqueRefId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uniqueRefId = 4;</code>
     */
    public Builder clearUniqueRefId() {
      
      uniqueRefId_ = getDefaultInstance().getUniqueRefId();
      onChanged();
      return this;
    }
    /**
     * <code>string uniqueRefId = 4;</code>
     */
    public Builder setUniqueRefIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uniqueRefId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object messageKey_ = "";
    /**
     * <code>string messageKey = 5;</code>
     */
    public java.lang.String getMessageKey() {
      java.lang.Object ref = messageKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string messageKey = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMessageKeyBytes() {
      java.lang.Object ref = messageKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string messageKey = 5;</code>
     */
    public Builder setMessageKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string messageKey = 5;</code>
     */
    public Builder clearMessageKey() {
      
      messageKey_ = getDefaultInstance().getMessageKey();
      onChanged();
      return this;
    }
    /**
     * <code>string messageKey = 5;</code>
     */
    public Builder setMessageKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string sessionId = 6;</code>
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sessionId = 6;</code>
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sessionId = 6;</code>
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 6;</code>
     */
    public Builder clearSessionId() {
      
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 6;</code>
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 7;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 7;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 7;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 7;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 7;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ServerMessage)
  }

  // @@protoc_insertion_point(class_scope:ServerMessage)
  private static final tmt.pcrf.grpc.ServerMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tmt.pcrf.grpc.ServerMessage();
  }

  public static tmt.pcrf.grpc.ServerMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerMessage>
      PARSER = new com.google.protobuf.AbstractParser<ServerMessage>() {
    @java.lang.Override
    public ServerMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tmt.pcrf.grpc.ServerMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

