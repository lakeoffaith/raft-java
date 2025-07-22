package com.github.wenweihu86.raft.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: raft.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RaftConsensusServiceGrpc {

  private RaftConsensusServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "raft.RaftConsensusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
      com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = com.github.wenweihu86.raft.proto.RaftProto.VoteRequest.class,
      responseType = com.github.wenweihu86.raft.proto.RaftProto.VoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
      com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest, com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getHelloMethod;
    if ((getHelloMethod = RaftConsensusServiceGrpc.getHelloMethod) == null) {
      synchronized (RaftConsensusServiceGrpc.class) {
        if ((getHelloMethod = RaftConsensusServiceGrpc.getHelloMethod) == null) {
          RaftConsensusServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest, com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.VoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.VoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RaftConsensusServiceMethodDescriptorSupplier("Hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
      com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getPreVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreVote",
      requestType = com.github.wenweihu86.raft.proto.RaftProto.VoteRequest.class,
      responseType = com.github.wenweihu86.raft.proto.RaftProto.VoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
      com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getPreVoteMethod() {
    io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest, com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getPreVoteMethod;
    if ((getPreVoteMethod = RaftConsensusServiceGrpc.getPreVoteMethod) == null) {
      synchronized (RaftConsensusServiceGrpc.class) {
        if ((getPreVoteMethod = RaftConsensusServiceGrpc.getPreVoteMethod) == null) {
          RaftConsensusServiceGrpc.getPreVoteMethod = getPreVoteMethod =
              io.grpc.MethodDescriptor.<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest, com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.VoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.VoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RaftConsensusServiceMethodDescriptorSupplier("PreVote"))
              .build();
        }
      }
    }
    return getPreVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
      com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getRequestVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestVote",
      requestType = com.github.wenweihu86.raft.proto.RaftProto.VoteRequest.class,
      responseType = com.github.wenweihu86.raft.proto.RaftProto.VoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
      com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getRequestVoteMethod() {
    io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest, com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> getRequestVoteMethod;
    if ((getRequestVoteMethod = RaftConsensusServiceGrpc.getRequestVoteMethod) == null) {
      synchronized (RaftConsensusServiceGrpc.class) {
        if ((getRequestVoteMethod = RaftConsensusServiceGrpc.getRequestVoteMethod) == null) {
          RaftConsensusServiceGrpc.getRequestVoteMethod = getRequestVoteMethod =
              io.grpc.MethodDescriptor.<com.github.wenweihu86.raft.proto.RaftProto.VoteRequest, com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.VoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.VoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RaftConsensusServiceMethodDescriptorSupplier("RequestVote"))
              .build();
        }
      }
    }
    return getRequestVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest,
      com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse> getAppendEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendEntries",
      requestType = com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest.class,
      responseType = com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest,
      com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse> getAppendEntriesMethod() {
    io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest, com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse> getAppendEntriesMethod;
    if ((getAppendEntriesMethod = RaftConsensusServiceGrpc.getAppendEntriesMethod) == null) {
      synchronized (RaftConsensusServiceGrpc.class) {
        if ((getAppendEntriesMethod = RaftConsensusServiceGrpc.getAppendEntriesMethod) == null) {
          RaftConsensusServiceGrpc.getAppendEntriesMethod = getAppendEntriesMethod =
              io.grpc.MethodDescriptor.<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest, com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RaftConsensusServiceMethodDescriptorSupplier("AppendEntries"))
              .build();
        }
      }
    }
    return getAppendEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest,
      com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse> getInstallSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstallSnapshot",
      requestType = com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest.class,
      responseType = com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest,
      com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse> getInstallSnapshotMethod() {
    io.grpc.MethodDescriptor<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest, com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse> getInstallSnapshotMethod;
    if ((getInstallSnapshotMethod = RaftConsensusServiceGrpc.getInstallSnapshotMethod) == null) {
      synchronized (RaftConsensusServiceGrpc.class) {
        if ((getInstallSnapshotMethod = RaftConsensusServiceGrpc.getInstallSnapshotMethod) == null) {
          RaftConsensusServiceGrpc.getInstallSnapshotMethod = getInstallSnapshotMethod =
              io.grpc.MethodDescriptor.<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest, com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstallSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RaftConsensusServiceMethodDescriptorSupplier("InstallSnapshot"))
              .build();
        }
      }
    }
    return getInstallSnapshotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RaftConsensusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftConsensusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftConsensusServiceStub>() {
        @java.lang.Override
        public RaftConsensusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftConsensusServiceStub(channel, callOptions);
        }
      };
    return RaftConsensusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RaftConsensusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftConsensusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftConsensusServiceBlockingStub>() {
        @java.lang.Override
        public RaftConsensusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftConsensusServiceBlockingStub(channel, callOptions);
        }
      };
    return RaftConsensusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RaftConsensusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftConsensusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftConsensusServiceFutureStub>() {
        @java.lang.Override
        public RaftConsensusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftConsensusServiceFutureStub(channel, callOptions);
        }
      };
    return RaftConsensusServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void hello(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    default void preVote(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreVoteMethod(), responseObserver);
    }

    /**
     */
    default void requestVote(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestVoteMethod(), responseObserver);
    }

    /**
     */
    default void appendEntries(com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendEntriesMethod(), responseObserver);
    }

    /**
     */
    default void installSnapshot(com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstallSnapshotMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RaftConsensusService.
   */
  public static abstract class RaftConsensusServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RaftConsensusServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RaftConsensusService.
   */
  public static final class RaftConsensusServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RaftConsensusServiceStub> {
    private RaftConsensusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftConsensusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftConsensusServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void preVote(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestVote(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendEntries(com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void installSnapshot(com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstallSnapshotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RaftConsensusService.
   */
  public static final class RaftConsensusServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RaftConsensusServiceBlockingStub> {
    private RaftConsensusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftConsensusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftConsensusServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.wenweihu86.raft.proto.RaftProto.VoteResponse hello(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.wenweihu86.raft.proto.RaftProto.VoteResponse preVote(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreVoteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.wenweihu86.raft.proto.RaftProto.VoteResponse requestVote(com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestVoteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse appendEntries(com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendEntriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse installSnapshot(com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstallSnapshotMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RaftConsensusService.
   */
  public static final class RaftConsensusServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RaftConsensusServiceFutureStub> {
    private RaftConsensusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftConsensusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftConsensusServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> hello(
        com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> preVote(
        com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreVoteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse> requestVote(
        com.github.wenweihu86.raft.proto.RaftProto.VoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestVoteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse> appendEntries(
        com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse> installSnapshot(
        com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstallSnapshotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_PRE_VOTE = 1;
  private static final int METHODID_REQUEST_VOTE = 2;
  private static final int METHODID_APPEND_ENTRIES = 3;
  private static final int METHODID_INSTALL_SNAPSHOT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.github.wenweihu86.raft.proto.RaftProto.VoteRequest) request,
              (io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>) responseObserver);
          break;
        case METHODID_PRE_VOTE:
          serviceImpl.preVote((com.github.wenweihu86.raft.proto.RaftProto.VoteRequest) request,
              (io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>) responseObserver);
          break;
        case METHODID_REQUEST_VOTE:
          serviceImpl.requestVote((com.github.wenweihu86.raft.proto.RaftProto.VoteRequest) request,
              (io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>) responseObserver);
          break;
        case METHODID_APPEND_ENTRIES:
          serviceImpl.appendEntries((com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest) request,
              (io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse>) responseObserver);
          break;
        case METHODID_INSTALL_SNAPSHOT:
          serviceImpl.installSnapshot((com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
              com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>(
                service, METHODID_HELLO)))
        .addMethod(
          getPreVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
              com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>(
                service, METHODID_PRE_VOTE)))
        .addMethod(
          getRequestVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.wenweihu86.raft.proto.RaftProto.VoteRequest,
              com.github.wenweihu86.raft.proto.RaftProto.VoteResponse>(
                service, METHODID_REQUEST_VOTE)))
        .addMethod(
          getAppendEntriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesRequest,
              com.github.wenweihu86.raft.proto.RaftProto.AppendEntriesResponse>(
                service, METHODID_APPEND_ENTRIES)))
        .addMethod(
          getInstallSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotRequest,
              com.github.wenweihu86.raft.proto.RaftProto.InstallSnapshotResponse>(
                service, METHODID_INSTALL_SNAPSHOT)))
        .build();
  }

  private static abstract class RaftConsensusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RaftConsensusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.wenweihu86.raft.proto.RaftProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RaftConsensusService");
    }
  }

  private static final class RaftConsensusServiceFileDescriptorSupplier
      extends RaftConsensusServiceBaseDescriptorSupplier {
    RaftConsensusServiceFileDescriptorSupplier() {}
  }

  private static final class RaftConsensusServiceMethodDescriptorSupplier
      extends RaftConsensusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RaftConsensusServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RaftConsensusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RaftConsensusServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getPreVoteMethod())
              .addMethod(getRequestVoteMethod())
              .addMethod(getAppendEntriesMethod())
              .addMethod(getInstallSnapshotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
