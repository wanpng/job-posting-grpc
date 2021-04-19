// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.15.5
// source: protos/domain/applicationstatus.grpc.proto

package domain

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ApplicationStatusGrpc struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id                int32  `protobuf:"varint,1,opt,name=id,proto3" json:"id,omitempty"`
	ApplicationStatus string `protobuf:"bytes,2,opt,name=application_status,json=applicationStatus,proto3" json:"application_status,omitempty"`
}

func (x *ApplicationStatusGrpc) Reset() {
	*x = ApplicationStatusGrpc{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_applicationstatus_grpc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ApplicationStatusGrpc) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ApplicationStatusGrpc) ProtoMessage() {}

func (x *ApplicationStatusGrpc) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_applicationstatus_grpc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ApplicationStatusGrpc.ProtoReflect.Descriptor instead.
func (*ApplicationStatusGrpc) Descriptor() ([]byte, []int) {
	return file_protos_domain_applicationstatus_grpc_proto_rawDescGZIP(), []int{0}
}

func (x *ApplicationStatusGrpc) GetId() int32 {
	if x != nil {
		return x.Id
	}
	return 0
}

func (x *ApplicationStatusGrpc) GetApplicationStatus() string {
	if x != nil {
		return x.ApplicationStatus
	}
	return ""
}

var File_protos_domain_applicationstatus_grpc_proto protoreflect.FileDescriptor

var file_protos_domain_applicationstatus_grpc_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x22, 0x56, 0x0a, 0x15, 0x41,
	0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x47, 0x72, 0x70, 0x63, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x02, 0x69, 0x64, 0x12, 0x2d, 0x0a, 0x12, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x11, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x42, 0x30, 0x5a, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x6a, 0x6f, 0x62, 0x2d, 0x70, 0x6f, 0x73,
	0x74, 0x69, 0x6e, 0x67, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x64,
	0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_domain_applicationstatus_grpc_proto_rawDescOnce sync.Once
	file_protos_domain_applicationstatus_grpc_proto_rawDescData = file_protos_domain_applicationstatus_grpc_proto_rawDesc
)

func file_protos_domain_applicationstatus_grpc_proto_rawDescGZIP() []byte {
	file_protos_domain_applicationstatus_grpc_proto_rawDescOnce.Do(func() {
		file_protos_domain_applicationstatus_grpc_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_applicationstatus_grpc_proto_rawDescData)
	})
	return file_protos_domain_applicationstatus_grpc_proto_rawDescData
}

var file_protos_domain_applicationstatus_grpc_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_protos_domain_applicationstatus_grpc_proto_goTypes = []interface{}{
	(*ApplicationStatusGrpc)(nil), // 0: protos.domain.ApplicationStatusGrpc
}
var file_protos_domain_applicationstatus_grpc_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_protos_domain_applicationstatus_grpc_proto_init() }
func file_protos_domain_applicationstatus_grpc_proto_init() {
	if File_protos_domain_applicationstatus_grpc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_applicationstatus_grpc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ApplicationStatusGrpc); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_protos_domain_applicationstatus_grpc_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_applicationstatus_grpc_proto_goTypes,
		DependencyIndexes: file_protos_domain_applicationstatus_grpc_proto_depIdxs,
		MessageInfos:      file_protos_domain_applicationstatus_grpc_proto_msgTypes,
	}.Build()
	File_protos_domain_applicationstatus_grpc_proto = out.File
	file_protos_domain_applicationstatus_grpc_proto_rawDesc = nil
	file_protos_domain_applicationstatus_grpc_proto_goTypes = nil
	file_protos_domain_applicationstatus_grpc_proto_depIdxs = nil
}
