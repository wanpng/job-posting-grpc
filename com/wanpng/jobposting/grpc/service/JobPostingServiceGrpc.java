package com.wanpng.jobposting.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/job_posting_service.grpc.proto")
public final class JobPostingServiceGrpc {

  private JobPostingServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.JobPostingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest,
      com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse> getGetJobSeekerHiddenAndSavedJobsInSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobSeekerHiddenAndSavedJobsInSearch",
      requestType = com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest.class,
      responseType = com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest,
      com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse> getGetJobSeekerHiddenAndSavedJobsInSearchMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest, com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse> getGetJobSeekerHiddenAndSavedJobsInSearchMethod;
    if ((getGetJobSeekerHiddenAndSavedJobsInSearchMethod = JobPostingServiceGrpc.getGetJobSeekerHiddenAndSavedJobsInSearchMethod) == null) {
      synchronized (JobPostingServiceGrpc.class) {
        if ((getGetJobSeekerHiddenAndSavedJobsInSearchMethod = JobPostingServiceGrpc.getGetJobSeekerHiddenAndSavedJobsInSearchMethod) == null) {
          JobPostingServiceGrpc.getGetJobSeekerHiddenAndSavedJobsInSearchMethod = getGetJobSeekerHiddenAndSavedJobsInSearchMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest, com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobSeekerHiddenAndSavedJobsInSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobPostingServiceMethodDescriptorSupplier("GetJobSeekerHiddenAndSavedJobsInSearch"))
              .build();
        }
      }
    }
    return getGetJobSeekerHiddenAndSavedJobsInSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobRequest,
      com.wanpng.jobposting.grpc.service.GetJobResponse> getGetJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJob",
      requestType = com.wanpng.jobposting.grpc.service.GetJobRequest.class,
      responseType = com.wanpng.jobposting.grpc.service.GetJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobRequest,
      com.wanpng.jobposting.grpc.service.GetJobResponse> getGetJobMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobRequest, com.wanpng.jobposting.grpc.service.GetJobResponse> getGetJobMethod;
    if ((getGetJobMethod = JobPostingServiceGrpc.getGetJobMethod) == null) {
      synchronized (JobPostingServiceGrpc.class) {
        if ((getGetJobMethod = JobPostingServiceGrpc.getGetJobMethod) == null) {
          JobPostingServiceGrpc.getGetJobMethod = getGetJobMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobposting.grpc.service.GetJobRequest, com.wanpng.jobposting.grpc.service.GetJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.GetJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.GetJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobPostingServiceMethodDescriptorSupplier("GetJob"))
              .build();
        }
      }
    }
    return getGetJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.domain.CandidateSkills,
      com.wanpng.jobposting.grpc.domain.CandidateSkills> getSaveJobSeekerSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveJobSeekerSkills",
      requestType = com.wanpng.jobposting.grpc.domain.CandidateSkills.class,
      responseType = com.wanpng.jobposting.grpc.domain.CandidateSkills.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.domain.CandidateSkills,
      com.wanpng.jobposting.grpc.domain.CandidateSkills> getSaveJobSeekerSkillsMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.domain.CandidateSkills, com.wanpng.jobposting.grpc.domain.CandidateSkills> getSaveJobSeekerSkillsMethod;
    if ((getSaveJobSeekerSkillsMethod = JobPostingServiceGrpc.getSaveJobSeekerSkillsMethod) == null) {
      synchronized (JobPostingServiceGrpc.class) {
        if ((getSaveJobSeekerSkillsMethod = JobPostingServiceGrpc.getSaveJobSeekerSkillsMethod) == null) {
          JobPostingServiceGrpc.getSaveJobSeekerSkillsMethod = getSaveJobSeekerSkillsMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobposting.grpc.domain.CandidateSkills, com.wanpng.jobposting.grpc.domain.CandidateSkills>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveJobSeekerSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.domain.CandidateSkills.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.domain.CandidateSkills.getDefaultInstance()))
              .setSchemaDescriptor(new JobPostingServiceMethodDescriptorSupplier("SaveJobSeekerSkills"))
              .build();
        }
      }
    }
    return getSaveJobSeekerSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobUserRequest,
      com.wanpng.jobposting.grpc.service.GetJobUserResponse> getGetJobUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getJobUser",
      requestType = com.wanpng.jobposting.grpc.service.GetJobUserRequest.class,
      responseType = com.wanpng.jobposting.grpc.service.GetJobUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobUserRequest,
      com.wanpng.jobposting.grpc.service.GetJobUserResponse> getGetJobUserMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.GetJobUserRequest, com.wanpng.jobposting.grpc.service.GetJobUserResponse> getGetJobUserMethod;
    if ((getGetJobUserMethod = JobPostingServiceGrpc.getGetJobUserMethod) == null) {
      synchronized (JobPostingServiceGrpc.class) {
        if ((getGetJobUserMethod = JobPostingServiceGrpc.getGetJobUserMethod) == null) {
          JobPostingServiceGrpc.getGetJobUserMethod = getGetJobUserMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobposting.grpc.service.GetJobUserRequest, com.wanpng.jobposting.grpc.service.GetJobUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getJobUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.GetJobUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.GetJobUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobPostingServiceMethodDescriptorSupplier("getJobUser"))
              .build();
        }
      }
    }
    return getGetJobUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.SearchJobRequest,
      com.wanpng.jobposting.grpc.service.SearchJobResponse> getSearchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchJob",
      requestType = com.wanpng.jobposting.grpc.service.SearchJobRequest.class,
      responseType = com.wanpng.jobposting.grpc.service.SearchJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.SearchJobRequest,
      com.wanpng.jobposting.grpc.service.SearchJobResponse> getSearchJobMethod() {
    io.grpc.MethodDescriptor<com.wanpng.jobposting.grpc.service.SearchJobRequest, com.wanpng.jobposting.grpc.service.SearchJobResponse> getSearchJobMethod;
    if ((getSearchJobMethod = JobPostingServiceGrpc.getSearchJobMethod) == null) {
      synchronized (JobPostingServiceGrpc.class) {
        if ((getSearchJobMethod = JobPostingServiceGrpc.getSearchJobMethod) == null) {
          JobPostingServiceGrpc.getSearchJobMethod = getSearchJobMethod =
              io.grpc.MethodDescriptor.<com.wanpng.jobposting.grpc.service.SearchJobRequest, com.wanpng.jobposting.grpc.service.SearchJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.SearchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.jobposting.grpc.service.SearchJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobPostingServiceMethodDescriptorSupplier("SearchJob"))
              .build();
        }
      }
    }
    return getSearchJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobPostingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobPostingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobPostingServiceStub>() {
        @java.lang.Override
        public JobPostingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobPostingServiceStub(channel, callOptions);
        }
      };
    return JobPostingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobPostingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobPostingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobPostingServiceBlockingStub>() {
        @java.lang.Override
        public JobPostingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobPostingServiceBlockingStub(channel, callOptions);
        }
      };
    return JobPostingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobPostingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobPostingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobPostingServiceFutureStub>() {
        @java.lang.Override
        public JobPostingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobPostingServiceFutureStub(channel, callOptions);
        }
      };
    return JobPostingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobPostingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getJobSeekerHiddenAndSavedJobsInSearch(com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobSeekerHiddenAndSavedJobsInSearchMethod(), responseObserver);
    }

    /**
     */
    public void getJob(com.wanpng.jobposting.grpc.service.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobMethod(), responseObserver);
    }

    /**
     */
    public void saveJobSeekerSkills(com.wanpng.jobposting.grpc.domain.CandidateSkills request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.domain.CandidateSkills> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveJobSeekerSkillsMethod(), responseObserver);
    }

    /**
     */
    public void getJobUser(com.wanpng.jobposting.grpc.service.GetJobUserRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobUserMethod(), responseObserver);
    }

    /**
     */
    public void searchJob(com.wanpng.jobposting.grpc.service.SearchJobRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.SearchJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetJobSeekerHiddenAndSavedJobsInSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest,
                com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse>(
                  this, METHODID_GET_JOB_SEEKER_HIDDEN_AND_SAVED_JOBS_IN_SEARCH)))
          .addMethod(
            getGetJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobposting.grpc.service.GetJobRequest,
                com.wanpng.jobposting.grpc.service.GetJobResponse>(
                  this, METHODID_GET_JOB)))
          .addMethod(
            getSaveJobSeekerSkillsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobposting.grpc.domain.CandidateSkills,
                com.wanpng.jobposting.grpc.domain.CandidateSkills>(
                  this, METHODID_SAVE_JOB_SEEKER_SKILLS)))
          .addMethod(
            getGetJobUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobposting.grpc.service.GetJobUserRequest,
                com.wanpng.jobposting.grpc.service.GetJobUserResponse>(
                  this, METHODID_GET_JOB_USER)))
          .addMethod(
            getSearchJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.jobposting.grpc.service.SearchJobRequest,
                com.wanpng.jobposting.grpc.service.SearchJobResponse>(
                  this, METHODID_SEARCH_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class JobPostingServiceStub extends io.grpc.stub.AbstractAsyncStub<JobPostingServiceStub> {
    private JobPostingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobPostingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobPostingServiceStub(channel, callOptions);
    }

    /**
     */
    public void getJobSeekerHiddenAndSavedJobsInSearch(com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobSeekerHiddenAndSavedJobsInSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJob(com.wanpng.jobposting.grpc.service.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveJobSeekerSkills(com.wanpng.jobposting.grpc.domain.CandidateSkills request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.domain.CandidateSkills> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveJobSeekerSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobUser(com.wanpng.jobposting.grpc.service.GetJobUserRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchJob(com.wanpng.jobposting.grpc.service.SearchJobRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.SearchJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobPostingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobPostingServiceBlockingStub> {
    private JobPostingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobPostingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobPostingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse getJobSeekerHiddenAndSavedJobsInSearch(com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobSeekerHiddenAndSavedJobsInSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobposting.grpc.service.GetJobResponse getJob(com.wanpng.jobposting.grpc.service.GetJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobposting.grpc.domain.CandidateSkills saveJobSeekerSkills(com.wanpng.jobposting.grpc.domain.CandidateSkills request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveJobSeekerSkillsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobposting.grpc.service.GetJobUserResponse getJobUser(com.wanpng.jobposting.grpc.service.GetJobUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wanpng.jobposting.grpc.service.SearchJobResponse searchJob(com.wanpng.jobposting.grpc.service.SearchJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobPostingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobPostingServiceFutureStub> {
    private JobPostingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobPostingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobPostingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse> getJobSeekerHiddenAndSavedJobsInSearch(
        com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobSeekerHiddenAndSavedJobsInSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobposting.grpc.service.GetJobResponse> getJob(
        com.wanpng.jobposting.grpc.service.GetJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobposting.grpc.domain.CandidateSkills> saveJobSeekerSkills(
        com.wanpng.jobposting.grpc.domain.CandidateSkills request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveJobSeekerSkillsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobposting.grpc.service.GetJobUserResponse> getJobUser(
        com.wanpng.jobposting.grpc.service.GetJobUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.jobposting.grpc.service.SearchJobResponse> searchJob(
        com.wanpng.jobposting.grpc.service.SearchJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_JOB_SEEKER_HIDDEN_AND_SAVED_JOBS_IN_SEARCH = 0;
  private static final int METHODID_GET_JOB = 1;
  private static final int METHODID_SAVE_JOB_SEEKER_SKILLS = 2;
  private static final int METHODID_GET_JOB_USER = 3;
  private static final int METHODID_SEARCH_JOB = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobPostingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobPostingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_JOB_SEEKER_HIDDEN_AND_SAVED_JOBS_IN_SEARCH:
          serviceImpl.getJobSeekerHiddenAndSavedJobsInSearch((com.wanpng.jobposting.grpc.service.GetJobSeekerJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse>) responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob((com.wanpng.jobposting.grpc.service.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobResponse>) responseObserver);
          break;
        case METHODID_SAVE_JOB_SEEKER_SKILLS:
          serviceImpl.saveJobSeekerSkills((com.wanpng.jobposting.grpc.domain.CandidateSkills) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.domain.CandidateSkills>) responseObserver);
          break;
        case METHODID_GET_JOB_USER:
          serviceImpl.getJobUser((com.wanpng.jobposting.grpc.service.GetJobUserRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.GetJobUserResponse>) responseObserver);
          break;
        case METHODID_SEARCH_JOB:
          serviceImpl.searchJob((com.wanpng.jobposting.grpc.service.SearchJobRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.jobposting.grpc.service.SearchJobResponse>) responseObserver);
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

  private static abstract class JobPostingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobPostingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobPostingService");
    }
  }

  private static final class JobPostingServiceFileDescriptorSupplier
      extends JobPostingServiceBaseDescriptorSupplier {
    JobPostingServiceFileDescriptorSupplier() {}
  }

  private static final class JobPostingServiceMethodDescriptorSupplier
      extends JobPostingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobPostingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobPostingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobPostingServiceFileDescriptorSupplier())
              .addMethod(getGetJobSeekerHiddenAndSavedJobsInSearchMethod())
              .addMethod(getGetJobMethod())
              .addMethod(getSaveJobSeekerSkillsMethod())
              .addMethod(getGetJobUserMethod())
              .addMethod(getSearchJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
