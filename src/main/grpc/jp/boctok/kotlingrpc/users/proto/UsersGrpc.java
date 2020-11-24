package jp.boctok.kotlingrpc.users.proto;

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
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: users.proto")
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final String SERVICE_NAME = "Users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest,
      jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse> getUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserInfo",
      requestType = jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest.class,
      responseType = jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest,
      jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse> getUserInfoMethod() {
    io.grpc.MethodDescriptor<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest, jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse> getUserInfoMethod;
    if ((getUserInfoMethod = UsersGrpc.getUserInfoMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUserInfoMethod = UsersGrpc.getUserInfoMethod) == null) {
          UsersGrpc.getUserInfoMethod = getUserInfoMethod = 
              io.grpc.MethodDescriptor.<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest, jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Users", "UserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UsersMethodDescriptorSupplier("UserInfo"))
                  .build();
          }
        }
     }
     return getUserInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    return new UsersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UsersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UsersFutureStub(channel);
  }

  /**
   */
  public static abstract class UsersImplBase implements io.grpc.BindableService {

    /**
     */
    public void userInfo(jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest request,
        io.grpc.stub.StreamObserver<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest,
                jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse>(
                  this, METHODID_USER_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class UsersStub extends io.grpc.stub.AbstractStub<UsersStub> {
    private UsersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
    }

    /**
     */
    public void userInfo(jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest request,
        io.grpc.stub.StreamObserver<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersBlockingStub extends io.grpc.stub.AbstractStub<UsersBlockingStub> {
    private UsersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
    }

    /**
     */
    public jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse userInfo(jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersFutureStub extends io.grpc.stub.AbstractStub<UsersFutureStub> {
    private UsersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse> userInfo(
        jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_INFO:
          serviceImpl.userInfo((jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersRequest) request,
              (io.grpc.stub.StreamObserver<jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.UsersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return jp.boctok.kotlingrpc.users.proto.GreeterProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getUserInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
