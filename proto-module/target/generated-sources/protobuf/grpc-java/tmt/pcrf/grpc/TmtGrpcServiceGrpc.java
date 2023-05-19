package tmt.pcrf.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: PcrfGrpcService.proto")
public final class TmtGrpcServiceGrpc {

  private TmtGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "TmtGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tmt.pcrf.grpc.ClientMessage,
      tmt.pcrf.grpc.ServerMessage> getProcessGrpcMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessGrpcMessage",
      requestType = tmt.pcrf.grpc.ClientMessage.class,
      responseType = tmt.pcrf.grpc.ServerMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<tmt.pcrf.grpc.ClientMessage,
      tmt.pcrf.grpc.ServerMessage> getProcessGrpcMessageMethod() {
    io.grpc.MethodDescriptor<tmt.pcrf.grpc.ClientMessage, tmt.pcrf.grpc.ServerMessage> getProcessGrpcMessageMethod;
    if ((getProcessGrpcMessageMethod = TmtGrpcServiceGrpc.getProcessGrpcMessageMethod) == null) {
      synchronized (TmtGrpcServiceGrpc.class) {
        if ((getProcessGrpcMessageMethod = TmtGrpcServiceGrpc.getProcessGrpcMessageMethod) == null) {
          TmtGrpcServiceGrpc.getProcessGrpcMessageMethod = getProcessGrpcMessageMethod = 
              io.grpc.MethodDescriptor.<tmt.pcrf.grpc.ClientMessage, tmt.pcrf.grpc.ServerMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TmtGrpcService", "ProcessGrpcMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmt.pcrf.grpc.ClientMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmt.pcrf.grpc.ServerMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new TmtGrpcServiceMethodDescriptorSupplier("ProcessGrpcMessage"))
                  .build();
          }
        }
     }
     return getProcessGrpcMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TmtGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new TmtGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TmtGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TmtGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TmtGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TmtGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TmtGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define the RPC method for duplex communication between client and server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<tmt.pcrf.grpc.ClientMessage> processGrpcMessage(
        io.grpc.stub.StreamObserver<tmt.pcrf.grpc.ServerMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getProcessGrpcMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessGrpcMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                tmt.pcrf.grpc.ClientMessage,
                tmt.pcrf.grpc.ServerMessage>(
                  this, METHODID_PROCESS_GRPC_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class TmtGrpcServiceStub extends io.grpc.stub.AbstractStub<TmtGrpcServiceStub> {
    private TmtGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TmtGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TmtGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TmtGrpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define the RPC method for duplex communication between client and server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<tmt.pcrf.grpc.ClientMessage> processGrpcMessage(
        io.grpc.stub.StreamObserver<tmt.pcrf.grpc.ServerMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getProcessGrpcMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TmtGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<TmtGrpcServiceBlockingStub> {
    private TmtGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TmtGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TmtGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TmtGrpcServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class TmtGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<TmtGrpcServiceFutureStub> {
    private TmtGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TmtGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TmtGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TmtGrpcServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PROCESS_GRPC_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TmtGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TmtGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_GRPC_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.processGrpcMessage(
              (io.grpc.stub.StreamObserver<tmt.pcrf.grpc.ServerMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TmtGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TmtGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tmt.pcrf.grpc.PcrfGrpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TmtGrpcService");
    }
  }

  private static final class TmtGrpcServiceFileDescriptorSupplier
      extends TmtGrpcServiceBaseDescriptorSupplier {
    TmtGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class TmtGrpcServiceMethodDescriptorSupplier
      extends TmtGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TmtGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TmtGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TmtGrpcServiceFileDescriptorSupplier())
              .addMethod(getProcessGrpcMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
