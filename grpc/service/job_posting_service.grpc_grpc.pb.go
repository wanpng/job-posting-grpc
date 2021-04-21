// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package service

import (
	context "context"
	domain "github.com/wanpng/job-posting-grpc/grpc/domain"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// JobPostingServiceClient is the client API for JobPostingService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type JobPostingServiceClient interface {
	GetJobSeekerHiddenAndSavedJobsInSearch(ctx context.Context, in *GetJobSeekerJobsRequest, opts ...grpc.CallOption) (*GetJobSeekerJobsResponse, error)
	GetApplicationStatus(ctx context.Context, in *GetApplicationStatusRequest, opts ...grpc.CallOption) (*GetApplicationStatusResponse, error)
	GetJob(ctx context.Context, in *GetJobRequest, opts ...grpc.CallOption) (*GetJobResponse, error)
	SaveJobSeekerSkills(ctx context.Context, in *domain.CandidateSkills, opts ...grpc.CallOption) (*domain.CandidateSkills, error)
}

type jobPostingServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewJobPostingServiceClient(cc grpc.ClientConnInterface) JobPostingServiceClient {
	return &jobPostingServiceClient{cc}
}

func (c *jobPostingServiceClient) GetJobSeekerHiddenAndSavedJobsInSearch(ctx context.Context, in *GetJobSeekerJobsRequest, opts ...grpc.CallOption) (*GetJobSeekerJobsResponse, error) {
	out := new(GetJobSeekerJobsResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobPostingService/GetJobSeekerHiddenAndSavedJobsInSearch", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jobPostingServiceClient) GetApplicationStatus(ctx context.Context, in *GetApplicationStatusRequest, opts ...grpc.CallOption) (*GetApplicationStatusResponse, error) {
	out := new(GetApplicationStatusResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobPostingService/GetApplicationStatus", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jobPostingServiceClient) GetJob(ctx context.Context, in *GetJobRequest, opts ...grpc.CallOption) (*GetJobResponse, error) {
	out := new(GetJobResponse)
	err := c.cc.Invoke(ctx, "/protos.service.JobPostingService/GetJob", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *jobPostingServiceClient) SaveJobSeekerSkills(ctx context.Context, in *domain.CandidateSkills, opts ...grpc.CallOption) (*domain.CandidateSkills, error) {
	out := new(domain.CandidateSkills)
	err := c.cc.Invoke(ctx, "/protos.service.JobPostingService/SaveJobSeekerSkills", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// JobPostingServiceServer is the server API for JobPostingService service.
// All implementations must embed UnimplementedJobPostingServiceServer
// for forward compatibility
type JobPostingServiceServer interface {
	GetJobSeekerHiddenAndSavedJobsInSearch(context.Context, *GetJobSeekerJobsRequest) (*GetJobSeekerJobsResponse, error)
	GetApplicationStatus(context.Context, *GetApplicationStatusRequest) (*GetApplicationStatusResponse, error)
	GetJob(context.Context, *GetJobRequest) (*GetJobResponse, error)
	SaveJobSeekerSkills(context.Context, *domain.CandidateSkills) (*domain.CandidateSkills, error)
	mustEmbedUnimplementedJobPostingServiceServer()
}

// UnimplementedJobPostingServiceServer must be embedded to have forward compatible implementations.
type UnimplementedJobPostingServiceServer struct {
}

func (UnimplementedJobPostingServiceServer) GetJobSeekerHiddenAndSavedJobsInSearch(context.Context, *GetJobSeekerJobsRequest) (*GetJobSeekerJobsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetJobSeekerHiddenAndSavedJobsInSearch not implemented")
}
func (UnimplementedJobPostingServiceServer) GetApplicationStatus(context.Context, *GetApplicationStatusRequest) (*GetApplicationStatusResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetApplicationStatus not implemented")
}
func (UnimplementedJobPostingServiceServer) GetJob(context.Context, *GetJobRequest) (*GetJobResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetJob not implemented")
}
func (UnimplementedJobPostingServiceServer) SaveJobSeekerSkills(context.Context, *domain.CandidateSkills) (*domain.CandidateSkills, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SaveJobSeekerSkills not implemented")
}
func (UnimplementedJobPostingServiceServer) mustEmbedUnimplementedJobPostingServiceServer() {}

// UnsafeJobPostingServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to JobPostingServiceServer will
// result in compilation errors.
type UnsafeJobPostingServiceServer interface {
	mustEmbedUnimplementedJobPostingServiceServer()
}

func RegisterJobPostingServiceServer(s grpc.ServiceRegistrar, srv JobPostingServiceServer) {
	s.RegisterService(&JobPostingService_ServiceDesc, srv)
}

func _JobPostingService_GetJobSeekerHiddenAndSavedJobsInSearch_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetJobSeekerJobsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobPostingServiceServer).GetJobSeekerHiddenAndSavedJobsInSearch(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobPostingService/GetJobSeekerHiddenAndSavedJobsInSearch",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobPostingServiceServer).GetJobSeekerHiddenAndSavedJobsInSearch(ctx, req.(*GetJobSeekerJobsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _JobPostingService_GetApplicationStatus_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetApplicationStatusRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobPostingServiceServer).GetApplicationStatus(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobPostingService/GetApplicationStatus",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobPostingServiceServer).GetApplicationStatus(ctx, req.(*GetApplicationStatusRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _JobPostingService_GetJob_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetJobRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobPostingServiceServer).GetJob(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobPostingService/GetJob",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobPostingServiceServer).GetJob(ctx, req.(*GetJobRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _JobPostingService_SaveJobSeekerSkills_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(domain.CandidateSkills)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(JobPostingServiceServer).SaveJobSeekerSkills(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.JobPostingService/SaveJobSeekerSkills",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(JobPostingServiceServer).SaveJobSeekerSkills(ctx, req.(*domain.CandidateSkills))
	}
	return interceptor(ctx, in, info, handler)
}

// JobPostingService_ServiceDesc is the grpc.ServiceDesc for JobPostingService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var JobPostingService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "protos.service.JobPostingService",
	HandlerType: (*JobPostingServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetJobSeekerHiddenAndSavedJobsInSearch",
			Handler:    _JobPostingService_GetJobSeekerHiddenAndSavedJobsInSearch_Handler,
		},
		{
			MethodName: "GetApplicationStatus",
			Handler:    _JobPostingService_GetApplicationStatus_Handler,
		},
		{
			MethodName: "GetJob",
			Handler:    _JobPostingService_GetJob_Handler,
		},
		{
			MethodName: "SaveJobSeekerSkills",
			Handler:    _JobPostingService_SaveJobSeekerSkills_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "protos/service/job_posting_service.grpc.proto",
}
