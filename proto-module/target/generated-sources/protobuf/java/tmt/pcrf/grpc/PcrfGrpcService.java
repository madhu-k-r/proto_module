// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PcrfGrpcService.proto

package tmt.pcrf.grpc;

public final class PcrfGrpcService {
  private PcrfGrpcService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PcrfGrpcService.proto\"\241\001\n\rClientMessag" +
      "e\022!\n\013messageType\030\001 \001(\0162\014.MessageType\022\020\n\010" +
      "moduleId\030\002 \001(\003\022\016\n\006status\030\003 \001(\005\022\023\n\013unique" +
      "RefId\030\004 \001(\t\022\022\n\nmessageKey\030\005 \001(\t\022\021\n\tsessi" +
      "onId\030\006 \001(\t\022\017\n\007message\030\007 \001(\t\"\241\001\n\rServerMe" +
      "ssage\022!\n\013messageType\030\001 \001(\0162\014.MessageType" +
      "\022\020\n\010moduleId\030\002 \001(\003\022\016\n\006status\030\003 \001(\005\022\023\n\013un" +
      "iqueRefId\030\004 \001(\t\022\022\n\nmessageKey\030\005 \001(\t\022\021\n\ts" +
      "essionId\030\006 \001(\t\022\017\n\007message\030\007 \001(\t*]\n\013Messa" +
      "geType\022\016\n\nNW_REQUEST\020\000\022\017\n\013NW_RESPONSE\020\001\022" +
      "\017\n\013APP_REQUEST\020\002\022\020\n\014APP_RESPONSE\020\003\022\n\n\006OT" +
      "HERS\020\0042L\n\016TmtGrpcService\022:\n\022ProcessGrpcM" +
      "essage\022\016.ClientMessage\032\016.ServerMessage\"\000" +
      "(\0010\001B\021\n\rtmt.pcrf.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ClientMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientMessage_descriptor,
        new java.lang.String[] { "MessageType", "ModuleId", "Status", "UniqueRefId", "MessageKey", "SessionId", "Message", });
    internal_static_ServerMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ServerMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerMessage_descriptor,
        new java.lang.String[] { "MessageType", "ModuleId", "Status", "UniqueRefId", "MessageKey", "SessionId", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
