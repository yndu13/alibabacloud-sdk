// This file is auto-generated, don't edit it. Thanks.
package client

import (
  util  "github.com/alibabacloud-go/tea-utils/service"
  rpc  "github.com/alibabacloud-go/tea-rpc/client"
  endpointutil  "github.com/alibabacloud-go/endpoint-util/service"
  "github.com/alibabacloud-go/tea/tea"
)

type AsdwqwRequest struct {
  GroupTest *string `json:"GroupTest" xml:"GroupTest"`
  GroupTestA *string `json:"GroupTestA" xml:"GroupTestA"`
}

func (s AsdwqwRequest) String() string {
  return tea.Prettify(s)
}

func (s AsdwqwRequest) GoString() string {
  return s.String()
}

func (s *AsdwqwRequest) SetGroupTest(v string) *AsdwqwRequest {
  s.GroupTest = &v
  return s
}

func (s *AsdwqwRequest) SetGroupTestA(v string) *AsdwqwRequest {
  s.GroupTestA = &v
  return s
}

type AsdwqwResponse struct {
  Add *string `json:"Add" xml:"Add" require:"true"`
  Dda *float32 `json:"Dda" xml:"Dda" require:"true"`
  ABC []*AsdwqwResponseABC `json:"ABC" xml:"ABC" require:"true" type:"Repeated"`
  Dds []*AsdwqwResponseDds `json:"Dds" xml:"Dds" require:"true" type:"Repeated"`
  Ko []*string `json:"Ko" xml:"Ko" require:"true" type:"Repeated"`
}

func (s AsdwqwResponse) String() string {
  return tea.Prettify(s)
}

func (s AsdwqwResponse) GoString() string {
  return s.String()
}

func (s *AsdwqwResponse) SetAdd(v string) *AsdwqwResponse {
  s.Add = &v
  return s
}

func (s *AsdwqwResponse) SetDda(v float32) *AsdwqwResponse {
  s.Dda = &v
  return s
}

func (s *AsdwqwResponse) SetABC(v []*AsdwqwResponseABC) *AsdwqwResponse {
  s.ABC = v
  return s
}

func (s *AsdwqwResponse) SetDds(v []*AsdwqwResponseDds) *AsdwqwResponse {
  s.Dds = v
  return s
}

func (s *AsdwqwResponse) SetKo(v []*string) *AsdwqwResponse {
  s.Ko = v
  return s
}

type AsdwqwResponseABC struct     {
  DDsssfcao *int64 `json:"DDsssfcao" xml:"DDsssfcao" require:"true"`
  Aasdsdfs11 []*AsdwqwResponseABCAasdsdfs11 `json:"Aasdsdfs11" xml:"Aasdsdfs11" require:"true" type:"Repeated"`
  Asdqd *AsdwqwResponseABCAsdqd `json:"Asdqd" xml:"Asdqd" require:"true" type:"Struct"`
  SDfsdw []*string `json:"SDfsdw" xml:"SDfsdw" require:"true" type:"Repeated"`
}

func (s AsdwqwResponseABC) String() string {
  return tea.Prettify(s)
}

func (s AsdwqwResponseABC) GoString() string {
  return s.String()
}

func (s *AsdwqwResponseABC) SetDDsssfcao(v int64) *AsdwqwResponseABC {
  s.DDsssfcao = &v
  return s
}

func (s *AsdwqwResponseABC) SetAasdsdfs11(v []*AsdwqwResponseABCAasdsdfs11) *AsdwqwResponseABC {
  s.Aasdsdfs11 = v
  return s
}

func (s *AsdwqwResponseABC) SetAsdqd(v *AsdwqwResponseABCAsdqd) *AsdwqwResponseABC {
  s.Asdqd = v
  return s
}

func (s *AsdwqwResponseABC) SetSDfsdw(v []*string) *AsdwqwResponseABC {
  s.SDfsdw = v
  return s
}

type AsdwqwResponseABCAasdsdfs11 struct     {
  ADasdafsgs map[string]interface{} `json:"ADasdafsgs" xml:"ADasdafsgs" require:"true"`
  KKasdasd *bool `json:"KKasdasd" xml:"KKasdasd" require:"true"`
}

func (s AsdwqwResponseABCAasdsdfs11) String() string {
  return tea.Prettify(s)
}

func (s AsdwqwResponseABCAasdsdfs11) GoString() string {
  return s.String()
}

func (s *AsdwqwResponseABCAasdsdfs11) SetADasdafsgs(v map[string]interface{}) *AsdwqwResponseABCAasdsdfs11 {
  s.ADasdafsgs = v
  return s
}

func (s *AsdwqwResponseABCAasdsdfs11) SetKKasdasd(v bool) *AsdwqwResponseABCAasdsdfs11 {
  s.KKasdasd = &v
  return s
}

type AsdwqwResponseABCAsdqd struct {
  Ssdas *bool `json:"Ssdas" xml:"Ssdas" require:"true"`
}

func (s AsdwqwResponseABCAsdqd) String() string {
  return tea.Prettify(s)
}

func (s AsdwqwResponseABCAsdqd) GoString() string {
  return s.String()
}

func (s *AsdwqwResponseABCAsdqd) SetSsdas(v bool) *AsdwqwResponseABCAsdqd {
  s.Ssdas = &v
  return s
}

type AsdwqwResponseDds struct type HsfMockRequest struct {
  Request *string `json:"Request" xml:"Request"`
  Response *string `json:"Response" xml:"Response"`
  RT *int64 `json:"RT" xml:"RT"`
  ResponseSize *int `json:"ResponseSize" xml:"ResponseSize"`
}

func (s HsfMockRequest) String() string {
  return tea.Prettify(s)
}

func (s HsfMockRequest) GoString() string {
  return s.String()
}

func (s *HsfMockRequest) SetRequest(v string) *HsfMockRequest {
  s.Request = &v
  return s
}

func (s *HsfMockRequest) SetResponse(v string) *HsfMockRequest {
  s.Response = &v
  return s
}

func (s *HsfMockRequest) SetRT(v int64) *HsfMockRequest {
  s.RT = &v
  return s
}

func (s *HsfMockRequest) SetResponseSize(v int) *HsfMockRequest {
  s.ResponseSize = &v
  return s
}

type HsfMockResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Value *string `json:"Value" xml:"Value" require:"true"`
  Size *string `json:"Size" xml:"Size" require:"true"`
}

func (s HsfMockResponse) String() string {
  return tea.Prettify(s)
}

func (s HsfMockResponse) GoString() string {
  return s.String()
}

func (s *HsfMockResponse) SetRequestId(v string) *HsfMockResponse {
  s.RequestId = &v
  return s
}

func (s *HsfMockResponse) SetValue(v string) *HsfMockResponse {
  s.Value = &v
  return s
}

func (s *HsfMockResponse) SetSize(v string) *HsfMockResponse {
  s.Size = &v
  return s
}

type DeleteEcsDemoIncRequest struct {
}

func (s DeleteEcsDemoIncRequest) String() string {
  return tea.Prettify(s)
}

func (s DeleteEcsDemoIncRequest) GoString() string {
  return s.String()
}

type DeleteEcsDemoIncResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
}

func (s DeleteEcsDemoIncResponse) String() string {
  return tea.Prettify(s)
}

func (s DeleteEcsDemoIncResponse) GoString() string {
  return s.String()
}

func (s *DeleteEcsDemoIncResponse) SetRequestId(v string) *DeleteEcsDemoIncResponse {
  s.RequestId = &v
  return s
}

type DescribeInstancesRequest struct {
  OwnerId *int64 `json:"OwnerId" xml:"OwnerId"`
  ResourceOwnerAccount *string `json:"ResourceOwnerAccount" xml:"ResourceOwnerAccount"`
  ResourceOwnerId *int64 `json:"ResourceOwnerId" xml:"ResourceOwnerId"`
  RegionId *string `json:"RegionId" xml:"RegionId" require:"true"`
  VpcId *string `json:"VpcId" xml:"VpcId"`
  VSwitchId *string `json:"VSwitchId" xml:"VSwitchId"`
  ZoneId *string `json:"ZoneId" xml:"ZoneId"`
  InstanceNetworkType *string `json:"InstanceNetworkType" xml:"InstanceNetworkType"`
  SecurityGroupId *string `json:"SecurityGroupId" xml:"SecurityGroupId"`
  InstanceIds *string `json:"InstanceIds" xml:"InstanceIds"`
  PageNumber *int `json:"PageNumber" xml:"PageNumber"`
  PageSize *int `json:"PageSize" xml:"PageSize"`
  InnerIpAddresses *string `json:"InnerIpAddresses" xml:"InnerIpAddresses"`
  PrivateIpAddresses *string `json:"PrivateIpAddresses" xml:"PrivateIpAddresses"`
  PublicIpAddresses *string `json:"PublicIpAddresses" xml:"PublicIpAddresses"`
  EipAddresses *string `json:"EipAddresses" xml:"EipAddresses"`
  OwnerAccount *string `json:"OwnerAccount" xml:"OwnerAccount"`
  InstanceChargeType *string `json:"InstanceChargeType" xml:"InstanceChargeType"`
  InternetChargeType *string `json:"InternetChargeType" xml:"InternetChargeType"`
  InstanceName *string `json:"InstanceName" xml:"InstanceName"`
  ImageId *string `json:"ImageId" xml:"ImageId"`
  Status *string `json:"Status" xml:"Status"`
  LockReason *string `json:"LockReason" xml:"LockReason"`
  Filter []*DescribeInstancesRequestFilter `json:"Filter" xml:"Filter" require:"true" type:"Repeated"`
  DeviceAvailable *bool `json:"DeviceAvailable" xml:"DeviceAvailable"`
  IoOptimized *bool `json:"IoOptimized" xml:"IoOptimized"`
  NeedSaleCycle *bool `json:"NeedSaleCycle" xml:"NeedSaleCycle"`
  Tag []*DescribeInstancesRequestTag `json:"Tag" xml:"Tag" type:"Repeated"`
  InstanceType *string `json:"InstanceType" xml:"InstanceType"`
  InstanceTypeFamily *string `json:"InstanceTypeFamily" xml:"InstanceTypeFamily"`
  KeyPairName *string `json:"KeyPairName" xml:"KeyPairName"`
  ResourceGroupId *string `json:"ResourceGroupId" xml:"ResourceGroupId"`
  HpcClusterId *string `json:"HpcClusterId" xml:"HpcClusterId"`
  RdmaIpAddresses *string `json:"RdmaIpAddresses" xml:"RdmaIpAddresses"`
  DryRun *bool `json:"DryRun" xml:"DryRun"`
}

func (s DescribeInstancesRequest) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesRequest) GoString() string {
  return s.String()
}

func (s *DescribeInstancesRequest) SetOwnerId(v int64) *DescribeInstancesRequest {
  s.OwnerId = &v
  return s
}

func (s *DescribeInstancesRequest) SetResourceOwnerAccount(v string) *DescribeInstancesRequest {
  s.ResourceOwnerAccount = &v
  return s
}

func (s *DescribeInstancesRequest) SetResourceOwnerId(v int64) *DescribeInstancesRequest {
  s.ResourceOwnerId = &v
  return s
}

func (s *DescribeInstancesRequest) SetRegionId(v string) *DescribeInstancesRequest {
  s.RegionId = &v
  return s
}

func (s *DescribeInstancesRequest) SetVpcId(v string) *DescribeInstancesRequest {
  s.VpcId = &v
  return s
}

func (s *DescribeInstancesRequest) SetVSwitchId(v string) *DescribeInstancesRequest {
  s.VSwitchId = &v
  return s
}

func (s *DescribeInstancesRequest) SetZoneId(v string) *DescribeInstancesRequest {
  s.ZoneId = &v
  return s
}

func (s *DescribeInstancesRequest) SetInstanceNetworkType(v string) *DescribeInstancesRequest {
  s.InstanceNetworkType = &v
  return s
}

func (s *DescribeInstancesRequest) SetSecurityGroupId(v string) *DescribeInstancesRequest {
  s.SecurityGroupId = &v
  return s
}

func (s *DescribeInstancesRequest) SetInstanceIds(v string) *DescribeInstancesRequest {
  s.InstanceIds = &v
  return s
}

func (s *DescribeInstancesRequest) SetPageNumber(v int) *DescribeInstancesRequest {
  s.PageNumber = &v
  return s
}

func (s *DescribeInstancesRequest) SetPageSize(v int) *DescribeInstancesRequest {
  s.PageSize = &v
  return s
}

func (s *DescribeInstancesRequest) SetInnerIpAddresses(v string) *DescribeInstancesRequest {
  s.InnerIpAddresses = &v
  return s
}

func (s *DescribeInstancesRequest) SetPrivateIpAddresses(v string) *DescribeInstancesRequest {
  s.PrivateIpAddresses = &v
  return s
}

func (s *DescribeInstancesRequest) SetPublicIpAddresses(v string) *DescribeInstancesRequest {
  s.PublicIpAddresses = &v
  return s
}

func (s *DescribeInstancesRequest) SetEipAddresses(v string) *DescribeInstancesRequest {
  s.EipAddresses = &v
  return s
}

func (s *DescribeInstancesRequest) SetOwnerAccount(v string) *DescribeInstancesRequest {
  s.OwnerAccount = &v
  return s
}

func (s *DescribeInstancesRequest) SetInstanceChargeType(v string) *DescribeInstancesRequest {
  s.InstanceChargeType = &v
  return s
}

func (s *DescribeInstancesRequest) SetInternetChargeType(v string) *DescribeInstancesRequest {
  s.InternetChargeType = &v
  return s
}

func (s *DescribeInstancesRequest) SetInstanceName(v string) *DescribeInstancesRequest {
  s.InstanceName = &v
  return s
}

func (s *DescribeInstancesRequest) SetImageId(v string) *DescribeInstancesRequest {
  s.ImageId = &v
  return s
}

func (s *DescribeInstancesRequest) SetStatus(v string) *DescribeInstancesRequest {
  s.Status = &v
  return s
}

func (s *DescribeInstancesRequest) SetLockReason(v string) *DescribeInstancesRequest {
  s.LockReason = &v
  return s
}

func (s *DescribeInstancesRequest) SetFilter(v []*DescribeInstancesRequestFilter) *DescribeInstancesRequest {
  s.Filter = v
  return s
}

func (s *DescribeInstancesRequest) SetDeviceAvailable(v bool) *DescribeInstancesRequest {
  s.DeviceAvailable = &v
  return s
}

func (s *DescribeInstancesRequest) SetIoOptimized(v bool) *DescribeInstancesRequest {
  s.IoOptimized = &v
  return s
}

func (s *DescribeInstancesRequest) SetNeedSaleCycle(v bool) *DescribeInstancesRequest {
  s.NeedSaleCycle = &v
  return s
}

func (s *DescribeInstancesRequest) SetTag(v []*DescribeInstancesRequestTag) *DescribeInstancesRequest {
  s.Tag = v
  return s
}

func (s *DescribeInstancesRequest) SetInstanceType(v string) *DescribeInstancesRequest {
  s.InstanceType = &v
  return s
}

func (s *DescribeInstancesRequest) SetInstanceTypeFamily(v string) *DescribeInstancesRequest {
  s.InstanceTypeFamily = &v
  return s
}

func (s *DescribeInstancesRequest) SetKeyPairName(v string) *DescribeInstancesRequest {
  s.KeyPairName = &v
  return s
}

func (s *DescribeInstancesRequest) SetResourceGroupId(v string) *DescribeInstancesRequest {
  s.ResourceGroupId = &v
  return s
}

func (s *DescribeInstancesRequest) SetHpcClusterId(v string) *DescribeInstancesRequest {
  s.HpcClusterId = &v
  return s
}

func (s *DescribeInstancesRequest) SetRdmaIpAddresses(v string) *DescribeInstancesRequest {
  s.RdmaIpAddresses = &v
  return s
}

func (s *DescribeInstancesRequest) SetDryRun(v bool) *DescribeInstancesRequest {
  s.DryRun = &v
  return s
}

type DescribeInstancesRequestFilter struct     {
  Key *string `json:"Key" xml:"Key"`
  Value *string `json:"Value" xml:"Value"`
}

func (s DescribeInstancesRequestFilter) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesRequestFilter) GoString() string {
  return s.String()
}

func (s *DescribeInstancesRequestFilter) SetKey(v string) *DescribeInstancesRequestFilter {
  s.Key = &v
  return s
}

func (s *DescribeInstancesRequestFilter) SetValue(v string) *DescribeInstancesRequestFilter {
  s.Value = &v
  return s
}

type DescribeInstancesRequestTag struct     {
  Key *string `json:"Key" xml:"Key"`
  Value *string `json:"Value" xml:"Value"`
}

func (s DescribeInstancesRequestTag) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesRequestTag) GoString() string {
  return s.String()
}

func (s *DescribeInstancesRequestTag) SetKey(v string) *DescribeInstancesRequestTag {
  s.Key = &v
  return s
}

func (s *DescribeInstancesRequestTag) SetValue(v string) *DescribeInstancesRequestTag {
  s.Value = &v
  return s
}

type DescribeInstancesResponse struct {
  PageNumber *int `json:"PageNumber" xml:"PageNumber" require:"true"`
  PageSize *int `json:"PageSize" xml:"PageSize" require:"true"`
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  TotalCount *int `json:"TotalCount" xml:"TotalCount" require:"true"`
  Instances *DescribeInstancesResponseInstances `json:"Instances" xml:"Instances" require:"true" type:"Struct"`
}

func (s DescribeInstancesResponse) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponse) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponse) SetPageNumber(v int) *DescribeInstancesResponse {
  s.PageNumber = &v
  return s
}

func (s *DescribeInstancesResponse) SetPageSize(v int) *DescribeInstancesResponse {
  s.PageSize = &v
  return s
}

func (s *DescribeInstancesResponse) SetRequestId(v string) *DescribeInstancesResponse {
  s.RequestId = &v
  return s
}

func (s *DescribeInstancesResponse) SetTotalCount(v int) *DescribeInstancesResponse {
  s.TotalCount = &v
  return s
}

func (s *DescribeInstancesResponse) SetInstances(v *DescribeInstancesResponseInstances) *DescribeInstancesResponse {
  s.Instances = v
  return s
}

type DescribeInstancesResponseInstances struct {
  Instance []*DescribeInstancesResponseInstancesInstance `json:"Instance" xml:"Instance" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstances) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstances) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstances) SetInstance(v []*DescribeInstancesResponseInstancesInstance) *DescribeInstancesResponseInstances {
  s.Instance = v
  return s
}

type DescribeInstancesResponseInstancesInstance struct     {
  AutoReleaseTime *string `json:"AutoReleaseTime" xml:"AutoReleaseTime" require:"true"`
  ClusterId *string `json:"ClusterId" xml:"ClusterId" require:"true"`
  Cpu *int `json:"Cpu" xml:"Cpu" require:"true"`
  CreationTime *string `json:"CreationTime" xml:"CreationTime" require:"true"`
  CreditSpecification *string `json:"CreditSpecification" xml:"CreditSpecification" require:"true"`
  DeletionProtection *bool `json:"DeletionProtection" xml:"DeletionProtection" require:"true"`
  DeploymentSetId *string `json:"DeploymentSetId" xml:"DeploymentSetId" require:"true"`
  Description *string `json:"Description" xml:"Description" require:"true"`
  DeviceAvailable *bool `json:"DeviceAvailable" xml:"DeviceAvailable" require:"true"`
  ExpiredTime *string `json:"ExpiredTime" xml:"ExpiredTime" require:"true"`
  GPUAmount *int `json:"GPUAmount" xml:"GPUAmount" require:"true"`
  GPUSpec *string `json:"GPUSpec" xml:"GPUSpec" require:"true"`
  HostName *string `json:"HostName" xml:"HostName" require:"true"`
  HpcClusterId *string `json:"HpcClusterId" xml:"HpcClusterId" require:"true"`
  ImageId *string `json:"ImageId" xml:"ImageId" require:"true"`
  InstanceChargeType *string `json:"InstanceChargeType" xml:"InstanceChargeType" require:"true"`
  InstanceId *string `json:"InstanceId" xml:"InstanceId" require:"true"`
  InstanceName *string `json:"InstanceName" xml:"InstanceName" require:"true"`
  InstanceNetworkType *string `json:"InstanceNetworkType" xml:"InstanceNetworkType" require:"true"`
  InstanceType *string `json:"InstanceType" xml:"InstanceType" require:"true"`
  InstanceTypeFamily *string `json:"InstanceTypeFamily" xml:"InstanceTypeFamily" require:"true"`
  InternetChargeType *string `json:"InternetChargeType" xml:"InternetChargeType" require:"true"`
  InternetMaxBandwidthIn *int `json:"InternetMaxBandwidthIn" xml:"InternetMaxBandwidthIn" require:"true"`
  InternetMaxBandwidthOut *int `json:"InternetMaxBandwidthOut" xml:"InternetMaxBandwidthOut" require:"true"`
  IoOptimized *bool `json:"IoOptimized" xml:"IoOptimized" require:"true"`
  KeyPairName *string `json:"KeyPairName" xml:"KeyPairName" require:"true"`
  LocalStorageAmount *int `json:"LocalStorageAmount" xml:"LocalStorageAmount" require:"true"`
  LocalStorageCapacity *int64 `json:"LocalStorageCapacity" xml:"LocalStorageCapacity" require:"true"`
  Memory *int `json:"Memory" xml:"Memory" require:"true"`
  OSName *string `json:"OSName" xml:"OSName" require:"true"`
  OSNameEn *string `json:"OSNameEn" xml:"OSNameEn" require:"true"`
  OSType *string `json:"OSType" xml:"OSType" require:"true"`
  Recyclable *bool `json:"Recyclable" xml:"Recyclable" require:"true"`
  RegionId *string `json:"RegionId" xml:"RegionId" require:"true"`
  ResourceGroupId *string `json:"ResourceGroupId" xml:"ResourceGroupId" require:"true"`
  SaleCycle *string `json:"SaleCycle" xml:"SaleCycle" require:"true"`
  SerialNumber *string `json:"SerialNumber" xml:"SerialNumber" require:"true"`
  SpotPriceLimit *float32 `json:"SpotPriceLimit" xml:"SpotPriceLimit" require:"true"`
  SpotStrategy *string `json:"SpotStrategy" xml:"SpotStrategy" require:"true"`
  StartTime *string `json:"StartTime" xml:"StartTime" require:"true"`
  Status *string `json:"Status" xml:"Status" require:"true"`
  StoppedMode *string `json:"StoppedMode" xml:"StoppedMode" require:"true"`
  VlanId *string `json:"VlanId" xml:"VlanId" require:"true"`
  ZoneId *string `json:"ZoneId" xml:"ZoneId" require:"true"`
  NetworkInterfaces *DescribeInstancesResponseInstancesInstanceNetworkInterfaces `json:"NetworkInterfaces" xml:"NetworkInterfaces" require:"true" type:"Struct"`
  OperationLocks *DescribeInstancesResponseInstancesInstanceOperationLocks `json:"OperationLocks" xml:"OperationLocks" require:"true" type:"Struct"`
  Tags *DescribeInstancesResponseInstancesInstanceTags `json:"Tags" xml:"Tags" require:"true" type:"Struct"`
  CpuOptions *DescribeInstancesResponseInstancesInstanceCpuOptions `json:"CpuOptions" xml:"CpuOptions" require:"true" type:"Struct"`
  DedicatedHostAttribute *DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute `json:"DedicatedHostAttribute" xml:"DedicatedHostAttribute" require:"true" type:"Struct"`
  DedicatedInstanceAttribute *DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute `json:"DedicatedInstanceAttribute" xml:"DedicatedInstanceAttribute" require:"true" type:"Struct"`
  EcsCapacityReservationAttr *DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr `json:"EcsCapacityReservationAttr" xml:"EcsCapacityReservationAttr" require:"true" type:"Struct"`
  EipAddress *DescribeInstancesResponseInstancesInstanceEipAddress `json:"EipAddress" xml:"EipAddress" require:"true" type:"Struct"`
  VpcAttributes *DescribeInstancesResponseInstancesInstanceVpcAttributes `json:"VpcAttributes" xml:"VpcAttributes" require:"true" type:"Struct"`
  InnerIpAddress *DescribeInstancesResponseInstancesInstanceInnerIpAddress `json:"InnerIpAddress" xml:"InnerIpAddress" require:"true" type:"Struct"`
  PublicIpAddress *DescribeInstancesResponseInstancesInstancePublicIpAddress `json:"PublicIpAddress" xml:"PublicIpAddress" require:"true" type:"Struct"`
  RdmaIpAddress *DescribeInstancesResponseInstancesInstanceRdmaIpAddress `json:"RdmaIpAddress" xml:"RdmaIpAddress" require:"true" type:"Struct"`
  SecurityGroupIds *DescribeInstancesResponseInstancesInstanceSecurityGroupIds `json:"SecurityGroupIds" xml:"SecurityGroupIds" require:"true" type:"Struct"`
}

func (s DescribeInstancesResponseInstancesInstance) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstance) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstance) SetAutoReleaseTime(v string) *DescribeInstancesResponseInstancesInstance {
  s.AutoReleaseTime = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetClusterId(v string) *DescribeInstancesResponseInstancesInstance {
  s.ClusterId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetCpu(v int) *DescribeInstancesResponseInstancesInstance {
  s.Cpu = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetCreationTime(v string) *DescribeInstancesResponseInstancesInstance {
  s.CreationTime = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetCreditSpecification(v string) *DescribeInstancesResponseInstancesInstance {
  s.CreditSpecification = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetDeletionProtection(v bool) *DescribeInstancesResponseInstancesInstance {
  s.DeletionProtection = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetDeploymentSetId(v string) *DescribeInstancesResponseInstancesInstance {
  s.DeploymentSetId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetDescription(v string) *DescribeInstancesResponseInstancesInstance {
  s.Description = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetDeviceAvailable(v bool) *DescribeInstancesResponseInstancesInstance {
  s.DeviceAvailable = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetExpiredTime(v string) *DescribeInstancesResponseInstancesInstance {
  s.ExpiredTime = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetGPUAmount(v int) *DescribeInstancesResponseInstancesInstance {
  s.GPUAmount = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetGPUSpec(v string) *DescribeInstancesResponseInstancesInstance {
  s.GPUSpec = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetHostName(v string) *DescribeInstancesResponseInstancesInstance {
  s.HostName = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetHpcClusterId(v string) *DescribeInstancesResponseInstancesInstance {
  s.HpcClusterId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetImageId(v string) *DescribeInstancesResponseInstancesInstance {
  s.ImageId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInstanceChargeType(v string) *DescribeInstancesResponseInstancesInstance {
  s.InstanceChargeType = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInstanceId(v string) *DescribeInstancesResponseInstancesInstance {
  s.InstanceId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInstanceName(v string) *DescribeInstancesResponseInstancesInstance {
  s.InstanceName = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInstanceNetworkType(v string) *DescribeInstancesResponseInstancesInstance {
  s.InstanceNetworkType = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInstanceType(v string) *DescribeInstancesResponseInstancesInstance {
  s.InstanceType = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInstanceTypeFamily(v string) *DescribeInstancesResponseInstancesInstance {
  s.InstanceTypeFamily = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInternetChargeType(v string) *DescribeInstancesResponseInstancesInstance {
  s.InternetChargeType = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInternetMaxBandwidthIn(v int) *DescribeInstancesResponseInstancesInstance {
  s.InternetMaxBandwidthIn = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInternetMaxBandwidthOut(v int) *DescribeInstancesResponseInstancesInstance {
  s.InternetMaxBandwidthOut = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetIoOptimized(v bool) *DescribeInstancesResponseInstancesInstance {
  s.IoOptimized = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetKeyPairName(v string) *DescribeInstancesResponseInstancesInstance {
  s.KeyPairName = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetLocalStorageAmount(v int) *DescribeInstancesResponseInstancesInstance {
  s.LocalStorageAmount = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetLocalStorageCapacity(v int64) *DescribeInstancesResponseInstancesInstance {
  s.LocalStorageCapacity = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetMemory(v int) *DescribeInstancesResponseInstancesInstance {
  s.Memory = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetOSName(v string) *DescribeInstancesResponseInstancesInstance {
  s.OSName = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetOSNameEn(v string) *DescribeInstancesResponseInstancesInstance {
  s.OSNameEn = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetOSType(v string) *DescribeInstancesResponseInstancesInstance {
  s.OSType = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetRecyclable(v bool) *DescribeInstancesResponseInstancesInstance {
  s.Recyclable = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetRegionId(v string) *DescribeInstancesResponseInstancesInstance {
  s.RegionId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetResourceGroupId(v string) *DescribeInstancesResponseInstancesInstance {
  s.ResourceGroupId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetSaleCycle(v string) *DescribeInstancesResponseInstancesInstance {
  s.SaleCycle = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetSerialNumber(v string) *DescribeInstancesResponseInstancesInstance {
  s.SerialNumber = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetSpotPriceLimit(v float32) *DescribeInstancesResponseInstancesInstance {
  s.SpotPriceLimit = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetSpotStrategy(v string) *DescribeInstancesResponseInstancesInstance {
  s.SpotStrategy = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetStartTime(v string) *DescribeInstancesResponseInstancesInstance {
  s.StartTime = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetStatus(v string) *DescribeInstancesResponseInstancesInstance {
  s.Status = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetStoppedMode(v string) *DescribeInstancesResponseInstancesInstance {
  s.StoppedMode = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetVlanId(v string) *DescribeInstancesResponseInstancesInstance {
  s.VlanId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetZoneId(v string) *DescribeInstancesResponseInstancesInstance {
  s.ZoneId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetNetworkInterfaces(v *DescribeInstancesResponseInstancesInstanceNetworkInterfaces) *DescribeInstancesResponseInstancesInstance {
  s.NetworkInterfaces = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetOperationLocks(v *DescribeInstancesResponseInstancesInstanceOperationLocks) *DescribeInstancesResponseInstancesInstance {
  s.OperationLocks = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetTags(v *DescribeInstancesResponseInstancesInstanceTags) *DescribeInstancesResponseInstancesInstance {
  s.Tags = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetCpuOptions(v *DescribeInstancesResponseInstancesInstanceCpuOptions) *DescribeInstancesResponseInstancesInstance {
  s.CpuOptions = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetDedicatedHostAttribute(v *DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute) *DescribeInstancesResponseInstancesInstance {
  s.DedicatedHostAttribute = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetDedicatedInstanceAttribute(v *DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute) *DescribeInstancesResponseInstancesInstance {
  s.DedicatedInstanceAttribute = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetEcsCapacityReservationAttr(v *DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr) *DescribeInstancesResponseInstancesInstance {
  s.EcsCapacityReservationAttr = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetEipAddress(v *DescribeInstancesResponseInstancesInstanceEipAddress) *DescribeInstancesResponseInstancesInstance {
  s.EipAddress = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetVpcAttributes(v *DescribeInstancesResponseInstancesInstanceVpcAttributes) *DescribeInstancesResponseInstancesInstance {
  s.VpcAttributes = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetInnerIpAddress(v *DescribeInstancesResponseInstancesInstanceInnerIpAddress) *DescribeInstancesResponseInstancesInstance {
  s.InnerIpAddress = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetPublicIpAddress(v *DescribeInstancesResponseInstancesInstancePublicIpAddress) *DescribeInstancesResponseInstancesInstance {
  s.PublicIpAddress = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetRdmaIpAddress(v *DescribeInstancesResponseInstancesInstanceRdmaIpAddress) *DescribeInstancesResponseInstancesInstance {
  s.RdmaIpAddress = v
  return s
}

func (s *DescribeInstancesResponseInstancesInstance) SetSecurityGroupIds(v *DescribeInstancesResponseInstancesInstanceSecurityGroupIds) *DescribeInstancesResponseInstancesInstance {
  s.SecurityGroupIds = v
  return s
}

type DescribeInstancesResponseInstancesInstanceNetworkInterfaces struct {
  NetworkInterface []*DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface `json:"NetworkInterface" xml:"NetworkInterface" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstanceNetworkInterfaces) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceNetworkInterfaces) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceNetworkInterfaces) SetNetworkInterface(v []*DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface) *DescribeInstancesResponseInstancesInstanceNetworkInterfaces {
  s.NetworkInterface = v
  return s
}

type DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface struct     {
  MacAddress *string `json:"MacAddress" xml:"MacAddress" require:"true"`
  NetworkInterfaceId *string `json:"NetworkInterfaceId" xml:"NetworkInterfaceId" require:"true"`
  PrimaryIpAddress *string `json:"PrimaryIpAddress" xml:"PrimaryIpAddress" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface) SetMacAddress(v string) *DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface {
  s.MacAddress = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface) SetNetworkInterfaceId(v string) *DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface {
  s.NetworkInterfaceId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface) SetPrimaryIpAddress(v string) *DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface {
  s.PrimaryIpAddress = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceOperationLocks struct {
  LockReason []*DescribeInstancesResponseInstancesInstanceOperationLocksLockReason `json:"LockReason" xml:"LockReason" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstanceOperationLocks) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceOperationLocks) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceOperationLocks) SetLockReason(v []*DescribeInstancesResponseInstancesInstanceOperationLocksLockReason) *DescribeInstancesResponseInstancesInstanceOperationLocks {
  s.LockReason = v
  return s
}

type DescribeInstancesResponseInstancesInstanceOperationLocksLockReason struct     {
  LockMsg *string `json:"LockMsg" xml:"LockMsg" require:"true"`
  LockReason *string `json:"LockReason" xml:"LockReason" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceOperationLocksLockReason) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceOperationLocksLockReason) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceOperationLocksLockReason) SetLockMsg(v string) *DescribeInstancesResponseInstancesInstanceOperationLocksLockReason {
  s.LockMsg = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceOperationLocksLockReason) SetLockReason(v string) *DescribeInstancesResponseInstancesInstanceOperationLocksLockReason {
  s.LockReason = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceTags struct {
  Tag []*DescribeInstancesResponseInstancesInstanceTagsTag `json:"Tag" xml:"Tag" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstanceTags) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceTags) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceTags) SetTag(v []*DescribeInstancesResponseInstancesInstanceTagsTag) *DescribeInstancesResponseInstancesInstanceTags {
  s.Tag = v
  return s
}

type DescribeInstancesResponseInstancesInstanceTagsTag struct     {
  TagKey *string `json:"TagKey" xml:"TagKey" require:"true"`
  TagValue *string `json:"TagValue" xml:"TagValue" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceTagsTag) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceTagsTag) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceTagsTag) SetTagKey(v string) *DescribeInstancesResponseInstancesInstanceTagsTag {
  s.TagKey = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceTagsTag) SetTagValue(v string) *DescribeInstancesResponseInstancesInstanceTagsTag {
  s.TagValue = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceCpuOptions struct {
  CoreCount *int `json:"CoreCount" xml:"CoreCount" require:"true"`
  Numa *string `json:"Numa" xml:"Numa" require:"true"`
  ThreadsPerCore *int `json:"ThreadsPerCore" xml:"ThreadsPerCore" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceCpuOptions) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceCpuOptions) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceCpuOptions) SetCoreCount(v int) *DescribeInstancesResponseInstancesInstanceCpuOptions {
  s.CoreCount = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceCpuOptions) SetNuma(v string) *DescribeInstancesResponseInstancesInstanceCpuOptions {
  s.Numa = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceCpuOptions) SetThreadsPerCore(v int) *DescribeInstancesResponseInstancesInstanceCpuOptions {
  s.ThreadsPerCore = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute struct {
  DedicatedHostId *string `json:"DedicatedHostId" xml:"DedicatedHostId" require:"true"`
  DedicatedHostName *string `json:"DedicatedHostName" xml:"DedicatedHostName" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute) SetDedicatedHostId(v string) *DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute {
  s.DedicatedHostId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute) SetDedicatedHostName(v string) *DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute {
  s.DedicatedHostName = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute struct {
  Affinity *string `json:"Affinity" xml:"Affinity" require:"true"`
  Tenancy *string `json:"Tenancy" xml:"Tenancy" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute) SetAffinity(v string) *DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute {
  s.Affinity = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute) SetTenancy(v string) *DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute {
  s.Tenancy = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr struct {
  CapacityReservationId *string `json:"CapacityReservationId" xml:"CapacityReservationId" require:"true"`
  CapacityReservationPreference *string `json:"CapacityReservationPreference" xml:"CapacityReservationPreference" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr) SetCapacityReservationId(v string) *DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr {
  s.CapacityReservationId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr) SetCapacityReservationPreference(v string) *DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr {
  s.CapacityReservationPreference = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceEipAddress struct {
  AllocationId *string `json:"AllocationId" xml:"AllocationId" require:"true"`
  Bandwidth *int `json:"Bandwidth" xml:"Bandwidth" require:"true"`
  InternetChargeType *string `json:"InternetChargeType" xml:"InternetChargeType" require:"true"`
  IpAddress *string `json:"IpAddress" xml:"IpAddress" require:"true"`
  IsSupportUnassociate *bool `json:"IsSupportUnassociate" xml:"IsSupportUnassociate" require:"true"`
}

func (s DescribeInstancesResponseInstancesInstanceEipAddress) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceEipAddress) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceEipAddress) SetAllocationId(v string) *DescribeInstancesResponseInstancesInstanceEipAddress {
  s.AllocationId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceEipAddress) SetBandwidth(v int) *DescribeInstancesResponseInstancesInstanceEipAddress {
  s.Bandwidth = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceEipAddress) SetInternetChargeType(v string) *DescribeInstancesResponseInstancesInstanceEipAddress {
  s.InternetChargeType = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceEipAddress) SetIpAddress(v string) *DescribeInstancesResponseInstancesInstanceEipAddress {
  s.IpAddress = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceEipAddress) SetIsSupportUnassociate(v bool) *DescribeInstancesResponseInstancesInstanceEipAddress {
  s.IsSupportUnassociate = &v
  return s
}

type DescribeInstancesResponseInstancesInstanceVpcAttributes struct {
  NatIpAddress *string `json:"NatIpAddress" xml:"NatIpAddress" require:"true"`
  VSwitchId *string `json:"VSwitchId" xml:"VSwitchId" require:"true"`
  VpcId *string `json:"VpcId" xml:"VpcId" require:"true"`
  PrivateIpAddress *DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress `json:"PrivateIpAddress" xml:"PrivateIpAddress" require:"true" type:"Struct"`
}

func (s DescribeInstancesResponseInstancesInstanceVpcAttributes) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceVpcAttributes) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceVpcAttributes) SetNatIpAddress(v string) *DescribeInstancesResponseInstancesInstanceVpcAttributes {
  s.NatIpAddress = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceVpcAttributes) SetVSwitchId(v string) *DescribeInstancesResponseInstancesInstanceVpcAttributes {
  s.VSwitchId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceVpcAttributes) SetVpcId(v string) *DescribeInstancesResponseInstancesInstanceVpcAttributes {
  s.VpcId = &v
  return s
}

func (s *DescribeInstancesResponseInstancesInstanceVpcAttributes) SetPrivateIpAddress(v *DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress) *DescribeInstancesResponseInstancesInstanceVpcAttributes {
  s.PrivateIpAddress = v
  return s
}

type DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress struct {
  IpAddress []*string `json:"IpAddress" xml:"IpAddress" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress) SetIpAddress(v []*string) *DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress {
  s.IpAddress = v
  return s
}

type DescribeInstancesResponseInstancesInstanceInnerIpAddress struct {
  IpAddress []*string `json:"IpAddress" xml:"IpAddress" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstanceInnerIpAddress) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceInnerIpAddress) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceInnerIpAddress) SetIpAddress(v []*string) *DescribeInstancesResponseInstancesInstanceInnerIpAddress {
  s.IpAddress = v
  return s
}

type DescribeInstancesResponseInstancesInstancePublicIpAddress struct {
  IpAddress []*string `json:"IpAddress" xml:"IpAddress" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstancePublicIpAddress) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstancePublicIpAddress) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstancePublicIpAddress) SetIpAddress(v []*string) *DescribeInstancesResponseInstancesInstancePublicIpAddress {
  s.IpAddress = v
  return s
}

type DescribeInstancesResponseInstancesInstanceRdmaIpAddress struct {
  IpAddress []*string `json:"IpAddress" xml:"IpAddress" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstanceRdmaIpAddress) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceRdmaIpAddress) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceRdmaIpAddress) SetIpAddress(v []*string) *DescribeInstancesResponseInstancesInstanceRdmaIpAddress {
  s.IpAddress = v
  return s
}

type DescribeInstancesResponseInstancesInstanceSecurityGroupIds struct {
  SecurityGroupId []*string `json:"SecurityGroupId" xml:"SecurityGroupId" require:"true" type:"Repeated"`
}

func (s DescribeInstancesResponseInstancesInstanceSecurityGroupIds) String() string {
  return tea.Prettify(s)
}

func (s DescribeInstancesResponseInstancesInstanceSecurityGroupIds) GoString() string {
  return s.String()
}

func (s *DescribeInstancesResponseInstancesInstanceSecurityGroupIds) SetSecurityGroupId(v []*string) *DescribeInstancesResponseInstancesInstanceSecurityGroupIds {
  s.SecurityGroupId = v
  return s
}

type CreateEcsDemoIncRequest struct {
}

func (s CreateEcsDemoIncRequest) String() string {
  return tea.Prettify(s)
}

func (s CreateEcsDemoIncRequest) GoString() string {
  return s.String()
}

type CreateEcsDemoIncResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
}

func (s CreateEcsDemoIncResponse) String() string {
  return tea.Prettify(s)
}

func (s CreateEcsDemoIncResponse) GoString() string {
  return s.String()
}

func (s *CreateEcsDemoIncResponse) SetRequestId(v string) *CreateEcsDemoIncResponse {
  s.RequestId = &v
  return s
}

type ListDisks001Request struct {
  AuthKey *string `json:"AuthKey" xml:"AuthKey" require:"true"`
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  ClientIp *string `json:"ClientIp" xml:"ClientIp" require:"true"`
  IdentityDTO map[string]interface{} `json:"IdentityDTO" xml:"IdentityDTO" require:"true"`
  ExtraParams map[string]interface{} `json:"ExtraParams" xml:"ExtraParams" require:"true"`
  ServerClientIp *string `json:"ServerClientIp" xml:"ServerClientIp" require:"true"`
  NextToken *int `json:"NextToken" xml:"NextToken"`
}

func (s ListDisks001Request) String() string {
  return tea.Prettify(s)
}

func (s ListDisks001Request) GoString() string {
  return s.String()
}

func (s *ListDisks001Request) SetAuthKey(v string) *ListDisks001Request {
  s.AuthKey = &v
  return s
}

func (s *ListDisks001Request) SetRequestId(v string) *ListDisks001Request {
  s.RequestId = &v
  return s
}

func (s *ListDisks001Request) SetClientIp(v string) *ListDisks001Request {
  s.ClientIp = &v
  return s
}

func (s *ListDisks001Request) SetIdentityDTO(v map[string]interface{}) *ListDisks001Request {
  s.IdentityDTO = v
  return s
}

func (s *ListDisks001Request) SetExtraParams(v map[string]interface{}) *ListDisks001Request {
  s.ExtraParams = v
  return s
}

func (s *ListDisks001Request) SetServerClientIp(v string) *ListDisks001Request {
  s.ServerClientIp = &v
  return s
}

func (s *ListDisks001Request) SetNextToken(v int) *ListDisks001Request {
  s.NextToken = &v
  return s
}

type ListDisks001Response struct {
  TraceId *string `json:"TraceId" xml:"TraceId" require:"true"`
  ErrorDetailMessage *string `json:"ErrorDetailMessage" xml:"ErrorDetailMessage" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  ErrorMessage *string `json:"ErrorMessage" xml:"ErrorMessage" require:"true"`
  ErrorCode *string `json:"ErrorCode" xml:"ErrorCode" require:"true"`
  TotalCount *int `json:"TotalCount" xml:"TotalCount" require:"true"`
  Result *ListDisks001ResponseResult `json:"Result" xml:"Result" require:"true" type:"Struct"`
}

func (s ListDisks001Response) String() string {
  return tea.Prettify(s)
}

func (s ListDisks001Response) GoString() string {
  return s.String()
}

func (s *ListDisks001Response) SetTraceId(v string) *ListDisks001Response {
  s.TraceId = &v
  return s
}

func (s *ListDisks001Response) SetErrorDetailMessage(v string) *ListDisks001Response {
  s.ErrorDetailMessage = &v
  return s
}

func (s *ListDisks001Response) SetSuccess(v bool) *ListDisks001Response {
  s.Success = &v
  return s
}

func (s *ListDisks001Response) SetErrorMessage(v string) *ListDisks001Response {
  s.ErrorMessage = &v
  return s
}

func (s *ListDisks001Response) SetErrorCode(v string) *ListDisks001Response {
  s.ErrorCode = &v
  return s
}

func (s *ListDisks001Response) SetTotalCount(v int) *ListDisks001Response {
  s.TotalCount = &v
  return s
}

func (s *ListDisks001Response) SetResult(v *ListDisks001ResponseResult) *ListDisks001Response {
  s.Result = v
  return s
}

type ListDisks001ResponseResult struct {
  NextToken *int `json:"NextToken" xml:"NextToken" require:"true"`
  MaxResults *int `json:"MaxResults" xml:"MaxResults" require:"true"`
}

func (s ListDisks001ResponseResult) String() string {
  return tea.Prettify(s)
}

func (s ListDisks001ResponseResult) GoString() string {
  return s.String()
}

func (s *ListDisks001ResponseResult) SetNextToken(v int) *ListDisks001ResponseResult {
  s.NextToken = &v
  return s
}

func (s *ListDisks001ResponseResult) SetMaxResults(v int) *ListDisks001ResponseResult {
  s.MaxResults = &v
  return s
}

type ListDisks1233Request struct {
  AuthKey *string `json:"AuthKey" xml:"AuthKey" require:"true"`
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  ClientIp *string `json:"ClientIp" xml:"ClientIp" require:"true"`
  IdentityDTO map[string]interface{} `json:"IdentityDTO" xml:"IdentityDTO" require:"true"`
  ExtraParams map[string]interface{} `json:"ExtraParams" xml:"ExtraParams" require:"true"`
  ServerClientIp *string `json:"ServerClientIp" xml:"ServerClientIp" require:"true"`
}

func (s ListDisks1233Request) String() string {
  return tea.Prettify(s)
}

func (s ListDisks1233Request) GoString() string {
  return s.String()
}

func (s *ListDisks1233Request) SetAuthKey(v string) *ListDisks1233Request {
  s.AuthKey = &v
  return s
}

func (s *ListDisks1233Request) SetRequestId(v string) *ListDisks1233Request {
  s.RequestId = &v
  return s
}

func (s *ListDisks1233Request) SetClientIp(v string) *ListDisks1233Request {
  s.ClientIp = &v
  return s
}

func (s *ListDisks1233Request) SetIdentityDTO(v map[string]interface{}) *ListDisks1233Request {
  s.IdentityDTO = v
  return s
}

func (s *ListDisks1233Request) SetExtraParams(v map[string]interface{}) *ListDisks1233Request {
  s.ExtraParams = v
  return s
}

func (s *ListDisks1233Request) SetServerClientIp(v string) *ListDisks1233Request {
  s.ServerClientIp = &v
  return s
}

type ListDisks1233Response struct {
  TraceId *string `json:"TraceId" xml:"TraceId" require:"true"`
  ErrorDetailMessage *string `json:"ErrorDetailMessage" xml:"ErrorDetailMessage" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  ErrorMessage *string `json:"ErrorMessage" xml:"ErrorMessage" require:"true"`
  ErrorCode *string `json:"ErrorCode" xml:"ErrorCode" require:"true"`
}

func (s ListDisks1233Response) String() string {
  return tea.Prettify(s)
}

func (s ListDisks1233Response) GoString() string {
  return s.String()
}

func (s *ListDisks1233Response) SetTraceId(v string) *ListDisks1233Response {
  s.TraceId = &v
  return s
}

func (s *ListDisks1233Response) SetErrorDetailMessage(v string) *ListDisks1233Response {
  s.ErrorDetailMessage = &v
  return s
}

func (s *ListDisks1233Response) SetSuccess(v bool) *ListDisks1233Response {
  s.Success = &v
  return s
}

func (s *ListDisks1233Response) SetErrorMessage(v string) *ListDisks1233Response {
  s.ErrorMessage = &v
  return s
}

func (s *ListDisks1233Response) SetErrorCode(v string) *ListDisks1233Response {
  s.ErrorCode = &v
  return s
}

type ModifyInstanceRequest struct {
}

func (s ModifyInstanceRequest) String() string {
  return tea.Prettify(s)
}

func (s ModifyInstanceRequest) GoString() string {
  return s.String()
}

type ModifyInstanceResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  AnswerList []*ModifyInstanceResponseAnswerList `json:"AnswerList" xml:"AnswerList" require:"true" type:"Repeated"`
}

func (s ModifyInstanceResponse) String() string {
  return tea.Prettify(s)
}

func (s ModifyInstanceResponse) GoString() string {
  return s.String()
}

func (s *ModifyInstanceResponse) SetRequestId(v string) *ModifyInstanceResponse {
  s.RequestId = &v
  return s
}

func (s *ModifyInstanceResponse) SetAnswerList(v []*ModifyInstanceResponseAnswerList) *ModifyInstanceResponse {
  s.AnswerList = v
  return s
}

type ModifyInstanceResponseAnswerList struct     {
  Answer *string `json:"Answer" xml:"Answer" require:"true"`
}

func (s ModifyInstanceResponseAnswerList) String() string {
  return tea.Prettify(s)
}

func (s ModifyInstanceResponseAnswerList) GoString() string {
  return s.String()
}

func (s *ModifyInstanceResponseAnswerList) SetAnswer(v string) *ModifyInstanceResponseAnswerList {
  s.Answer = &v
  return s
}

type HiFucker4Request struct {
  Env *string `json:"Env" xml:"Env" require:"true"`
  AcceptLanguage *string `json:"AcceptLanguage" xml:"AcceptLanguage"`
  Product *string `json:"Product" xml:"Product" require:"true"`
  PageNumber *int `json:"PageNumber" xml:"PageNumber"`
  PageSize *int `json:"PageSize" xml:"PageSize"`
  Filters []*string `json:"Filters" xml:"Filters" type:"Repeated"`
  ResourceTypeCodes []*string `json:"ResourceTypeCodes" xml:"ResourceTypeCodes" type:"Repeated"`
  SiteType *string `json:"SiteType" xml:"SiteType"`
  FromCache *bool `json:"FromCache" xml:"FromCache"`
  RepeatLista []*string `json:"RepeatLista" xml:"RepeatLista" type:"Repeated"`
}

func (s HiFucker4Request) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4Request) GoString() string {
  return s.String()
}

func (s *HiFucker4Request) SetEnv(v string) *HiFucker4Request {
  s.Env = &v
  return s
}

func (s *HiFucker4Request) SetAcceptLanguage(v string) *HiFucker4Request {
  s.AcceptLanguage = &v
  return s
}

func (s *HiFucker4Request) SetProduct(v string) *HiFucker4Request {
  s.Product = &v
  return s
}

func (s *HiFucker4Request) SetPageNumber(v int) *HiFucker4Request {
  s.PageNumber = &v
  return s
}

func (s *HiFucker4Request) SetPageSize(v int) *HiFucker4Request {
  s.PageSize = &v
  return s
}

func (s *HiFucker4Request) SetFilters(v []*string) *HiFucker4Request {
  s.Filters = v
  return s
}

func (s *HiFucker4Request) SetResourceTypeCodes(v []*string) *HiFucker4Request {
  s.ResourceTypeCodes = v
  return s
}

func (s *HiFucker4Request) SetSiteType(v string) *HiFucker4Request {
  s.SiteType = &v
  return s
}

func (s *HiFucker4Request) SetFromCache(v bool) *HiFucker4Request {
  s.FromCache = &v
  return s
}

func (s *HiFucker4Request) SetRepeatLista(v []*string) *HiFucker4Request {
  s.RepeatLista = v
  return s
}

type HiFucker4Response struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  PageNumber *bool `json:"PageNumber" xml:"PageNumber" require:"true"`
  PageSize *bool `json:"PageSize" xml:"PageSize" require:"true"`
  TotalCount *int `json:"TotalCount" xml:"TotalCount" require:"true"`
  ResourceTypes []*HiFucker4ResponseResourceTypes `json:"ResourceTypes" xml:"ResourceTypes" require:"true" type:"Repeated"`
}

func (s HiFucker4Response) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4Response) GoString() string {
  return s.String()
}

func (s *HiFucker4Response) SetRequestId(v string) *HiFucker4Response {
  s.RequestId = &v
  return s
}

func (s *HiFucker4Response) SetPageNumber(v bool) *HiFucker4Response {
  s.PageNumber = &v
  return s
}

func (s *HiFucker4Response) SetPageSize(v bool) *HiFucker4Response {
  s.PageSize = &v
  return s
}

func (s *HiFucker4Response) SetTotalCount(v int) *HiFucker4Response {
  s.TotalCount = &v
  return s
}

func (s *HiFucker4Response) SetResourceTypes(v []*HiFucker4ResponseResourceTypes) *HiFucker4Response {
  s.ResourceTypes = v
  return s
}

type HiFucker4ResponseResourceTypes struct     {
  Product *string `json:"Product" xml:"Product" require:"true"`
  ResourceTypeCode *string `json:"ResourceTypeCode" xml:"ResourceTypeCode" require:"true"`
  ResourceTypeVersion *string `json:"ResourceTypeVersion" xml:"ResourceTypeVersion" require:"true"`
  Title *string `json:"Title" xml:"Title" require:"true"`
  UniqueIdentifier *string `json:"UniqueIdentifier" xml:"UniqueIdentifier" require:"true"`
  Description *string `json:"Description" xml:"Description" require:"true"`
  DeliveryScope *string `json:"DeliveryScope" xml:"DeliveryScope" require:"true"`
  ResourceIdField *bool `json:"ResourceIdField" xml:"ResourceIdField" require:"true"`
  Definitions map[string]interface{} `json:"Definitions" xml:"Definitions" require:"true"`
  SchemaRef *string `json:"SchemaRef" xml:"SchemaRef" require:"true"`
  States []*HiFucker4ResponseResourceTypesStates `json:"States" xml:"States" require:"true" type:"Repeated"`
  OperationAPI *HiFucker4ResponseResourceTypesOperationAPI `json:"OperationAPI" xml:"OperationAPI" require:"true" type:"Struct"`
  ResourceTypeAttributeMappings *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings `json:"ResourceTypeAttributeMappings" xml:"ResourceTypeAttributeMappings" require:"true" type:"Struct"`
  CommonAttributeMark *HiFucker4ResponseResourceTypesCommonAttributeMark `json:"CommonAttributeMark" xml:"CommonAttributeMark" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypes) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypes) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypes) SetProduct(v string) *HiFucker4ResponseResourceTypes {
  s.Product = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetResourceTypeCode(v string) *HiFucker4ResponseResourceTypes {
  s.ResourceTypeCode = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetResourceTypeVersion(v string) *HiFucker4ResponseResourceTypes {
  s.ResourceTypeVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetTitle(v string) *HiFucker4ResponseResourceTypes {
  s.Title = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetUniqueIdentifier(v string) *HiFucker4ResponseResourceTypes {
  s.UniqueIdentifier = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetDescription(v string) *HiFucker4ResponseResourceTypes {
  s.Description = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetDeliveryScope(v string) *HiFucker4ResponseResourceTypes {
  s.DeliveryScope = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetResourceIdField(v bool) *HiFucker4ResponseResourceTypes {
  s.ResourceIdField = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetDefinitions(v map[string]interface{}) *HiFucker4ResponseResourceTypes {
  s.Definitions = v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetSchemaRef(v string) *HiFucker4ResponseResourceTypes {
  s.SchemaRef = &v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetStates(v []*HiFucker4ResponseResourceTypesStates) *HiFucker4ResponseResourceTypes {
  s.States = v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetOperationAPI(v *HiFucker4ResponseResourceTypesOperationAPI) *HiFucker4ResponseResourceTypes {
  s.OperationAPI = v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetResourceTypeAttributeMappings(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) *HiFucker4ResponseResourceTypes {
  s.ResourceTypeAttributeMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypes) SetCommonAttributeMark(v *HiFucker4ResponseResourceTypesCommonAttributeMark) *HiFucker4ResponseResourceTypes {
  s.CommonAttributeMark = v
  return s
}

type HiFucker4ResponseResourceTypesStates struct     {
  StateCode *string `json:"StateCode" xml:"StateCode" require:"true"`
  Description *string `json:"Description" xml:"Description" require:"true"`
}

func (s HiFucker4ResponseResourceTypesStates) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesStates) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesStates) SetStateCode(v string) *HiFucker4ResponseResourceTypesStates {
  s.StateCode = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesStates) SetDescription(v string) *HiFucker4ResponseResourceTypesStates {
  s.Description = &v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPI struct {
  CreateAPIs []*HiFucker4ResponseResourceTypesOperationAPICreateAPIs `json:"CreateAPIs" xml:"CreateAPIs" require:"true" type:"Repeated"`
  GetAPIs []*HiFucker4ResponseResourceTypesOperationAPIGetAPIs `json:"GetAPIs" xml:"GetAPIs" require:"true" type:"Repeated"`
  ListAPIs []*HiFucker4ResponseResourceTypesOperationAPIListAPIs `json:"ListAPIs" xml:"ListAPIs" require:"true" type:"Repeated"`
  UpdateAPIs []*HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs `json:"UpdateAPIs" xml:"UpdateAPIs" require:"true" type:"Repeated"`
  DeleteAPIs []*HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs `json:"DeleteAPIs" xml:"DeleteAPIs" require:"true" type:"Repeated"`
  EstablishRelationAPIs []*HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs `json:"EstablishRelationAPIs" xml:"EstablishRelationAPIs" require:"true" type:"Repeated"`
  DestroyRelationAPIs []*HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs `json:"DestroyRelationAPIs" xml:"DestroyRelationAPIs" require:"true" type:"Repeated"`
}

func (s HiFucker4ResponseResourceTypesOperationAPI) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPI) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPI) SetCreateAPIs(v []*HiFucker4ResponseResourceTypesOperationAPICreateAPIs) *HiFucker4ResponseResourceTypesOperationAPI {
  s.CreateAPIs = v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPI) SetGetAPIs(v []*HiFucker4ResponseResourceTypesOperationAPIGetAPIs) *HiFucker4ResponseResourceTypesOperationAPI {
  s.GetAPIs = v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPI) SetListAPIs(v []*HiFucker4ResponseResourceTypesOperationAPIListAPIs) *HiFucker4ResponseResourceTypesOperationAPI {
  s.ListAPIs = v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPI) SetUpdateAPIs(v []*HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs) *HiFucker4ResponseResourceTypesOperationAPI {
  s.UpdateAPIs = v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPI) SetDeleteAPIs(v []*HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs) *HiFucker4ResponseResourceTypesOperationAPI {
  s.DeleteAPIs = v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPI) SetEstablishRelationAPIs(v []*HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs) *HiFucker4ResponseResourceTypesOperationAPI {
  s.EstablishRelationAPIs = v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPI) SetDestroyRelationAPIs(v []*HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs) *HiFucker4ResponseResourceTypesOperationAPI {
  s.DestroyRelationAPIs = v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPICreateAPIs struct     {
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
}

func (s HiFucker4ResponseResourceTypesOperationAPICreateAPIs) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPICreateAPIs) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPICreateAPIs) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesOperationAPICreateAPIs {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPICreateAPIs) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesOperationAPICreateAPIs {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPICreateAPIs) SetApiName(v string) *HiFucker4ResponseResourceTypesOperationAPICreateAPIs {
  s.ApiName = &v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPIGetAPIs struct     {
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
}

func (s HiFucker4ResponseResourceTypesOperationAPIGetAPIs) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPIGetAPIs) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPIGetAPIs) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesOperationAPIGetAPIs {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIGetAPIs) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesOperationAPIGetAPIs {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIGetAPIs) SetApiName(v string) *HiFucker4ResponseResourceTypesOperationAPIGetAPIs {
  s.ApiName = &v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPIListAPIs struct     {
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
}

func (s HiFucker4ResponseResourceTypesOperationAPIListAPIs) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPIListAPIs) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPIListAPIs) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesOperationAPIListAPIs {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIListAPIs) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesOperationAPIListAPIs {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIListAPIs) SetApiName(v string) *HiFucker4ResponseResourceTypesOperationAPIListAPIs {
  s.ApiName = &v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs struct     {
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
}

func (s HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs) SetApiName(v string) *HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs {
  s.ApiName = &v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs struct     {
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
}

func (s HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs) SetApiName(v string) *HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs {
  s.ApiName = &v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs struct     {
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
}

func (s HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs) SetApiName(v string) *HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs {
  s.ApiName = &v
  return s
}

type HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs struct     {
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
}

func (s HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs) SetApiName(v string) *HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs {
  s.ApiName = &v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappings struct {
  EnableAttributeMapping *string `json:"EnableAttributeMapping" xml:"EnableAttributeMapping" require:"true"`
  OptionalConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig `json:"OptionalConfig" xml:"OptionalConfig" require:"true" type:"Struct"`
  OperationGet *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet `json:"OperationGet" xml:"OperationGet" require:"true" type:"Struct"`
  OperationCreate *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate `json:"OperationCreate" xml:"OperationCreate" require:"true" type:"Struct"`
  OperationUpdate *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate `json:"OperationUpdate" xml:"OperationUpdate" require:"true" type:"Struct"`
  OperationDelete *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete `json:"OperationDelete" xml:"OperationDelete" require:"true" type:"Struct"`
  OperationList *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList `json:"OperationList" xml:"OperationList" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) SetEnableAttributeMapping(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings {
  s.EnableAttributeMapping = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) SetOptionalConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings {
  s.OptionalConfig = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) SetOperationGet(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings {
  s.OperationGet = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) SetOperationCreate(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings {
  s.OperationCreate = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) SetOperationUpdate(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings {
  s.OperationUpdate = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) SetOperationDelete(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings {
  s.OperationDelete = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings) SetOperationList(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappings {
  s.OperationList = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig struct {
  PrePaidValue *string `json:"PrePaidValue" xml:"PrePaidValue" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig) SetPrePaidValue(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig {
  s.PrePaidValue = &v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet struct {
  AttributeMappings map[string]interface{} `json:"AttributeMappings" xml:"AttributeMappings" require:"true"`
  ApiInfos []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos `json:"ApiInfos" xml:"ApiInfos" require:"true" type:"Repeated"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet) SetAttributeMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet {
  s.AttributeMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet) SetApiInfos(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet {
  s.ApiInfos = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos struct     {
  GatewaySource *string `json:"GatewaySource" xml:"GatewaySource" require:"true"`
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
  SupplementParameters []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters `json:"SupplementParameters" xml:"SupplementParameters" require:"true" type:"Repeated"`
  Paging *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging `json:"Paging" xml:"Paging" require:"true" type:"Struct"`
  RequiredAttributeMappings *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings `json:"RequiredAttributeMappings" xml:"RequiredAttributeMappings" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) SetGatewaySource(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos {
  s.GatewaySource = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) SetApiName(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos {
  s.ApiName = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) SetSupplementParameters(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos {
  s.SupplementParameters = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) SetPaging(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos {
  s.Paging = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos) SetRequiredAttributeMappings(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos {
  s.RequiredAttributeMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters struct     {
  MappingType *string `json:"MappingType" xml:"MappingType" require:"true"`
  Position *string `json:"Position" xml:"Position" require:"true"`
  In *string `json:"In" xml:"In" require:"true"`
  Path *string `json:"Path" xml:"Path" require:"true"`
  Value *string `json:"Value" xml:"Value" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) SetMappingType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters {
  s.MappingType = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) SetPosition(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters {
  s.Position = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) SetIn(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters {
  s.In = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) SetPath(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters {
  s.Path = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters) SetValue(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters {
  s.Value = &v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging struct {
  Type *string `json:"Type" xml:"Type" require:"true"`
  NextTokenConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig `json:"NextTokenConfig" xml:"NextTokenConfig" require:"true" type:"Struct"`
  PageNumberConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig `json:"PageNumberConfig" xml:"PageNumberConfig" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging) SetType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging {
  s.Type = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging) SetNextTokenConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging {
  s.NextTokenConfig = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging) SetPageNumberConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging {
  s.PageNumberConfig = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings struct {
  IdMappings map[string]interface{} `json:"IdMappings" xml:"IdMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings) SetIdMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings {
  s.IdMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate struct {
  AttributeMappings map[string]interface{} `json:"AttributeMappings" xml:"AttributeMappings" require:"true"`
  ApiInfos []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos `json:"ApiInfos" xml:"ApiInfos" require:"true" type:"Repeated"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate) SetAttributeMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate {
  s.AttributeMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate) SetApiInfos(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate {
  s.ApiInfos = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos struct     {
  GatewaySource *string `json:"GatewaySource" xml:"GatewaySource" require:"true"`
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
  SupplementParameters []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters `json:"SupplementParameters" xml:"SupplementParameters" require:"true" type:"Repeated"`
  Paging *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging `json:"Paging" xml:"Paging" require:"true" type:"Struct"`
  RequiredAttributeMappings *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings `json:"RequiredAttributeMappings" xml:"RequiredAttributeMappings" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) SetGatewaySource(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos {
  s.GatewaySource = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) SetApiName(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos {
  s.ApiName = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) SetSupplementParameters(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos {
  s.SupplementParameters = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) SetPaging(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos {
  s.Paging = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos) SetRequiredAttributeMappings(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos {
  s.RequiredAttributeMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters struct     {
  MappingType *string `json:"MappingType" xml:"MappingType" require:"true"`
  Position *string `json:"Position" xml:"Position" require:"true"`
  In *string `json:"In" xml:"In" require:"true"`
  Path *string `json:"Path" xml:"Path" require:"true"`
  Value *string `json:"Value" xml:"Value" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) SetMappingType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters {
  s.MappingType = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) SetPosition(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters {
  s.Position = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) SetIn(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters {
  s.In = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) SetPath(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters {
  s.Path = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters) SetValue(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters {
  s.Value = &v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging struct {
  Type *string `json:"Type" xml:"Type" require:"true"`
  NextTokenConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig `json:"NextTokenConfig" xml:"NextTokenConfig" require:"true" type:"Struct"`
  PageNumberConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig `json:"PageNumberConfig" xml:"PageNumberConfig" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging) SetType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging {
  s.Type = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging) SetNextTokenConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging {
  s.NextTokenConfig = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging) SetPageNumberConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging {
  s.PageNumberConfig = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings struct {
  IdMappings map[string]interface{} `json:"IdMappings" xml:"IdMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings) SetIdMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings {
  s.IdMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate struct {
  AttributeMappings map[string]interface{} `json:"AttributeMappings" xml:"AttributeMappings" require:"true"`
  ApiInfos []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos `json:"ApiInfos" xml:"ApiInfos" require:"true" type:"Repeated"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate) SetAttributeMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate {
  s.AttributeMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate) SetApiInfos(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate {
  s.ApiInfos = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos struct     {
  GatewaySource *string `json:"GatewaySource" xml:"GatewaySource" require:"true"`
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
  SupplementParameters []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters `json:"SupplementParameters" xml:"SupplementParameters" require:"true" type:"Repeated"`
  Paging *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging `json:"Paging" xml:"Paging" require:"true" type:"Struct"`
  RequiredAttributeMappings *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings `json:"RequiredAttributeMappings" xml:"RequiredAttributeMappings" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) SetGatewaySource(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos {
  s.GatewaySource = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) SetApiName(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos {
  s.ApiName = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) SetSupplementParameters(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos {
  s.SupplementParameters = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) SetPaging(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos {
  s.Paging = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos) SetRequiredAttributeMappings(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos {
  s.RequiredAttributeMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters struct     {
  MappingType *string `json:"MappingType" xml:"MappingType" require:"true"`
  Position *string `json:"Position" xml:"Position" require:"true"`
  In *string `json:"In" xml:"In" require:"true"`
  Path *string `json:"Path" xml:"Path" require:"true"`
  Value *string `json:"Value" xml:"Value" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) SetMappingType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters {
  s.MappingType = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) SetPosition(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters {
  s.Position = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) SetIn(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters {
  s.In = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) SetPath(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters {
  s.Path = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters) SetValue(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters {
  s.Value = &v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging struct {
  Type *string `json:"Type" xml:"Type" require:"true"`
  NextTokenConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig `json:"NextTokenConfig" xml:"NextTokenConfig" require:"true" type:"Struct"`
  PageNumberConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig `json:"PageNumberConfig" xml:"PageNumberConfig" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging) SetType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging {
  s.Type = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging) SetNextTokenConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging {
  s.NextTokenConfig = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging) SetPageNumberConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging {
  s.PageNumberConfig = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings struct {
  IdMappings map[string]interface{} `json:"IdMappings" xml:"IdMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings) SetIdMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings {
  s.IdMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete struct {
  AttributeMappings map[string]interface{} `json:"AttributeMappings" xml:"AttributeMappings" require:"true"`
  ApiInfos []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos `json:"ApiInfos" xml:"ApiInfos" require:"true" type:"Repeated"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete) SetAttributeMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete {
  s.AttributeMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete) SetApiInfos(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete {
  s.ApiInfos = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos struct     {
  GatewaySource *string `json:"GatewaySource" xml:"GatewaySource" require:"true"`
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
  SupplementParameters []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters `json:"SupplementParameters" xml:"SupplementParameters" require:"true" type:"Repeated"`
  Paging *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging `json:"Paging" xml:"Paging" require:"true" type:"Struct"`
  RequiredAttributeMappings *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings `json:"RequiredAttributeMappings" xml:"RequiredAttributeMappings" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) SetGatewaySource(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos {
  s.GatewaySource = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) SetApiName(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos {
  s.ApiName = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) SetSupplementParameters(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos {
  s.SupplementParameters = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) SetPaging(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos {
  s.Paging = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos) SetRequiredAttributeMappings(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos {
  s.RequiredAttributeMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters struct     {
  MappingType *string `json:"MappingType" xml:"MappingType" require:"true"`
  Position *string `json:"Position" xml:"Position" require:"true"`
  In *string `json:"In" xml:"In" require:"true"`
  Path *string `json:"Path" xml:"Path" require:"true"`
  Value *string `json:"Value" xml:"Value" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) SetMappingType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters {
  s.MappingType = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) SetPosition(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters {
  s.Position = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) SetIn(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters {
  s.In = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) SetPath(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters {
  s.Path = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters) SetValue(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters {
  s.Value = &v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging struct {
  Type *string `json:"Type" xml:"Type" require:"true"`
  NextTokenConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig `json:"NextTokenConfig" xml:"NextTokenConfig" require:"true" type:"Struct"`
  PageNumberConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig `json:"PageNumberConfig" xml:"PageNumberConfig" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging) SetType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging {
  s.Type = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging) SetNextTokenConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging {
  s.NextTokenConfig = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging) SetPageNumberConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging {
  s.PageNumberConfig = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings struct {
  IdMappings map[string]interface{} `json:"IdMappings" xml:"IdMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings) SetIdMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings {
  s.IdMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList struct {
  AttributeMappings map[string]interface{} `json:"AttributeMappings" xml:"AttributeMappings" require:"true"`
  ApiInfos []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos `json:"ApiInfos" xml:"ApiInfos" require:"true" type:"Repeated"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList) SetAttributeMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList {
  s.AttributeMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList) SetApiInfos(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList {
  s.ApiInfos = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos struct     {
  GatewaySource *string `json:"GatewaySource" xml:"GatewaySource" require:"true"`
  GatewayProduct *string `json:"GatewayProduct" xml:"GatewayProduct" require:"true"`
  GatewayVersion *string `json:"GatewayVersion" xml:"GatewayVersion" require:"true"`
  ApiName *string `json:"ApiName" xml:"ApiName" require:"true"`
  SupplementParameters []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters `json:"SupplementParameters" xml:"SupplementParameters" require:"true" type:"Repeated"`
  Paging *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging `json:"Paging" xml:"Paging" require:"true" type:"Struct"`
  RequiredAttributeMappings *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings `json:"RequiredAttributeMappings" xml:"RequiredAttributeMappings" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) SetGatewaySource(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos {
  s.GatewaySource = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) SetGatewayProduct(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos {
  s.GatewayProduct = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) SetGatewayVersion(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos {
  s.GatewayVersion = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) SetApiName(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos {
  s.ApiName = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) SetSupplementParameters(v []*HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos {
  s.SupplementParameters = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) SetPaging(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos {
  s.Paging = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos) SetRequiredAttributeMappings(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos {
  s.RequiredAttributeMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters struct     {
  MappingType *string `json:"MappingType" xml:"MappingType" require:"true"`
  Position *string `json:"Position" xml:"Position" require:"true"`
  In *string `json:"In" xml:"In" require:"true"`
  Path *string `json:"Path" xml:"Path" require:"true"`
  Value *string `json:"Value" xml:"Value" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) SetMappingType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters {
  s.MappingType = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) SetPosition(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters {
  s.Position = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) SetIn(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters {
  s.In = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) SetPath(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters {
  s.Path = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters) SetValue(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters {
  s.Value = &v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging struct {
  Type *string `json:"Type" xml:"Type" require:"true"`
  NextTokenConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig `json:"NextTokenConfig" xml:"NextTokenConfig" require:"true" type:"Struct"`
  PageNumberConfig *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig `json:"PageNumberConfig" xml:"PageNumberConfig" require:"true" type:"Struct"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging) SetType(v string) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging {
  s.Type = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging) SetNextTokenConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging {
  s.NextTokenConfig = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging) SetPageNumberConfig(v *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging {
  s.PageNumberConfig = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig struct {
  RequestParameterMappings map[string]interface{} `json:"RequestParameterMappings" xml:"RequestParameterMappings" require:"true"`
  ResponseParameterMappings map[string]interface{} `json:"ResponseParameterMappings" xml:"ResponseParameterMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig) SetRequestParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig {
  s.RequestParameterMappings = v
  return s
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig) SetResponseParameterMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig {
  s.ResponseParameterMappings = v
  return s
}

type HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings struct {
  IdMappings map[string]interface{} `json:"IdMappings" xml:"IdMappings" require:"true"`
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings) SetIdMappings(v map[string]interface{}) *HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings {
  s.IdMappings = v
  return s
}

type HiFucker4ResponseResourceTypesCommonAttributeMark struct {
  BillingMethod *string `json:"BillingMethod" xml:"BillingMethod" require:"true"`
  Uids []*string `json:"Uids" xml:"Uids" require:"true" type:"Repeated"`
}

func (s HiFucker4ResponseResourceTypesCommonAttributeMark) String() string {
  return tea.Prettify(s)
}

func (s HiFucker4ResponseResourceTypesCommonAttributeMark) GoString() string {
  return s.String()
}

func (s *HiFucker4ResponseResourceTypesCommonAttributeMark) SetBillingMethod(v string) *HiFucker4ResponseResourceTypesCommonAttributeMark {
  s.BillingMethod = &v
  return s
}

func (s *HiFucker4ResponseResourceTypesCommonAttributeMark) SetUids(v []*string) *HiFucker4ResponseResourceTypesCommonAttributeMark {
  s.Uids = v
  return s
}

type CreateTestEcsRequest struct {
  AuthKey *string `json:"AuthKey" xml:"AuthKey" require:"true"`
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  ClientIp *string `json:"ClientIp" xml:"ClientIp" require:"true"`
  IdentityDTO map[string]interface{} `json:"IdentityDTO" xml:"IdentityDTO" require:"true"`
  ExtraParams map[string]interface{} `json:"ExtraParams" xml:"ExtraParams" require:"true"`
  ServerClientIp *string `json:"ServerClientIp" xml:"ServerClientIp" require:"true"`
  GmtModified *string `json:"GmtModified" xml:"GmtModified" require:"true"`
  MarketStr *string `json:"MarketStr" xml:"MarketStr" require:"true"`
  ProjectStatusStr *string `json:"ProjectStatusStr" xml:"ProjectStatusStr" require:"true"`
  ChangeFreeStatus *string `json:"ChangeFreeStatus" xml:"ChangeFreeStatus" require:"true"`
  DailyTime *string `json:"DailyTime" xml:"DailyTime" require:"true"`
  RelationPeople *string `json:"RelationPeople" xml:"RelationPeople" require:"true"`
  CloseTime *string `json:"CloseTime" xml:"CloseTime" require:"true"`
  OnlineTime *string `json:"OnlineTime" xml:"OnlineTime" require:"true"`
  CreatePeopleName *string `json:"CreatePeopleName" xml:"CreatePeopleName" require:"true"`
  Id *int64 `json:"Id" xml:"Id" require:"true"`
  NamespaceName *string `json:"NamespaceName" xml:"NamespaceName" require:"true"`
  PlanStartTime *string `json:"PlanStartTime" xml:"PlanStartTime" require:"true"`
  ChangeFreeOrderId *string `json:"ChangeFreeOrderId" xml:"ChangeFreeOrderId" require:"true"`
  PreTime *string `json:"PreTime" xml:"PreTime" require:"true"`
  CreatePeopleBucId *string `json:"CreatePeopleBucId" xml:"CreatePeopleBucId" require:"true"`
  GmtCreate *string `json:"GmtCreate" xml:"GmtCreate" require:"true"`
  Market *int `json:"Market" xml:"Market" require:"true"`
  ProjectStatus *int64 `json:"ProjectStatus" xml:"ProjectStatus" require:"true"`
  NamespaceId *int64 `json:"NamespaceId" xml:"NamespaceId" require:"true"`
  ProjectDesc *string `json:"ProjectDesc" xml:"ProjectDesc" require:"true"`
  PlanEndTime *string `json:"PlanEndTime" xml:"PlanEndTime" require:"true"`
  CreatePeopleId *string `json:"CreatePeopleId" xml:"CreatePeopleId" require:"true"`
  ProjectName *string `json:"ProjectName" xml:"ProjectName" require:"true"`
  Properties *string `json:"Properties" xml:"Properties" require:"true"`
}

func (s CreateTestEcsRequest) String() string {
  return tea.Prettify(s)
}

func (s CreateTestEcsRequest) GoString() string {
  return s.String()
}

func (s *CreateTestEcsRequest) SetAuthKey(v string) *CreateTestEcsRequest {
  s.AuthKey = &v
  return s
}

func (s *CreateTestEcsRequest) SetRequestId(v string) *CreateTestEcsRequest {
  s.RequestId = &v
  return s
}

func (s *CreateTestEcsRequest) SetClientIp(v string) *CreateTestEcsRequest {
  s.ClientIp = &v
  return s
}

func (s *CreateTestEcsRequest) SetIdentityDTO(v map[string]interface{}) *CreateTestEcsRequest {
  s.IdentityDTO = v
  return s
}

func (s *CreateTestEcsRequest) SetExtraParams(v map[string]interface{}) *CreateTestEcsRequest {
  s.ExtraParams = v
  return s
}

func (s *CreateTestEcsRequest) SetServerClientIp(v string) *CreateTestEcsRequest {
  s.ServerClientIp = &v
  return s
}

func (s *CreateTestEcsRequest) SetGmtModified(v string) *CreateTestEcsRequest {
  s.GmtModified = &v
  return s
}

func (s *CreateTestEcsRequest) SetMarketStr(v string) *CreateTestEcsRequest {
  s.MarketStr = &v
  return s
}

func (s *CreateTestEcsRequest) SetProjectStatusStr(v string) *CreateTestEcsRequest {
  s.ProjectStatusStr = &v
  return s
}

func (s *CreateTestEcsRequest) SetChangeFreeStatus(v string) *CreateTestEcsRequest {
  s.ChangeFreeStatus = &v
  return s
}

func (s *CreateTestEcsRequest) SetDailyTime(v string) *CreateTestEcsRequest {
  s.DailyTime = &v
  return s
}

func (s *CreateTestEcsRequest) SetRelationPeople(v string) *CreateTestEcsRequest {
  s.RelationPeople = &v
  return s
}

func (s *CreateTestEcsRequest) SetCloseTime(v string) *CreateTestEcsRequest {
  s.CloseTime = &v
  return s
}

func (s *CreateTestEcsRequest) SetOnlineTime(v string) *CreateTestEcsRequest {
  s.OnlineTime = &v
  return s
}

func (s *CreateTestEcsRequest) SetCreatePeopleName(v string) *CreateTestEcsRequest {
  s.CreatePeopleName = &v
  return s
}

func (s *CreateTestEcsRequest) SetId(v int64) *CreateTestEcsRequest {
  s.Id = &v
  return s
}

func (s *CreateTestEcsRequest) SetNamespaceName(v string) *CreateTestEcsRequest {
  s.NamespaceName = &v
  return s
}

func (s *CreateTestEcsRequest) SetPlanStartTime(v string) *CreateTestEcsRequest {
  s.PlanStartTime = &v
  return s
}

func (s *CreateTestEcsRequest) SetChangeFreeOrderId(v string) *CreateTestEcsRequest {
  s.ChangeFreeOrderId = &v
  return s
}

func (s *CreateTestEcsRequest) SetPreTime(v string) *CreateTestEcsRequest {
  s.PreTime = &v
  return s
}

func (s *CreateTestEcsRequest) SetCreatePeopleBucId(v string) *CreateTestEcsRequest {
  s.CreatePeopleBucId = &v
  return s
}

func (s *CreateTestEcsRequest) SetGmtCreate(v string) *CreateTestEcsRequest {
  s.GmtCreate = &v
  return s
}

func (s *CreateTestEcsRequest) SetMarket(v int) *CreateTestEcsRequest {
  s.Market = &v
  return s
}

func (s *CreateTestEcsRequest) SetProjectStatus(v int64) *CreateTestEcsRequest {
  s.ProjectStatus = &v
  return s
}

func (s *CreateTestEcsRequest) SetNamespaceId(v int64) *CreateTestEcsRequest {
  s.NamespaceId = &v
  return s
}

func (s *CreateTestEcsRequest) SetProjectDesc(v string) *CreateTestEcsRequest {
  s.ProjectDesc = &v
  return s
}

func (s *CreateTestEcsRequest) SetPlanEndTime(v string) *CreateTestEcsRequest {
  s.PlanEndTime = &v
  return s
}

func (s *CreateTestEcsRequest) SetCreatePeopleId(v string) *CreateTestEcsRequest {
  s.CreatePeopleId = &v
  return s
}

func (s *CreateTestEcsRequest) SetProjectName(v string) *CreateTestEcsRequest {
  s.ProjectName = &v
  return s
}

func (s *CreateTestEcsRequest) SetProperties(v string) *CreateTestEcsRequest {
  s.Properties = &v
  return s
}

type CreateTestEcsResponse struct {
  TraceId *string `json:"TraceId" xml:"TraceId" require:"true"`
  ErrorDetailMessage *string `json:"ErrorDetailMessage" xml:"ErrorDetailMessage" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  ErrorMessage *string `json:"ErrorMessage" xml:"ErrorMessage" require:"true"`
  ErrorCode *string `json:"ErrorCode" xml:"ErrorCode" require:"true"`
}

func (s CreateTestEcsResponse) String() string {
  return tea.Prettify(s)
}

func (s CreateTestEcsResponse) GoString() string {
  return s.String()
}

func (s *CreateTestEcsResponse) SetTraceId(v string) *CreateTestEcsResponse {
  s.TraceId = &v
  return s
}

func (s *CreateTestEcsResponse) SetErrorDetailMessage(v string) *CreateTestEcsResponse {
  s.ErrorDetailMessage = &v
  return s
}

func (s *CreateTestEcsResponse) SetSuccess(v bool) *CreateTestEcsResponse {
  s.Success = &v
  return s
}

func (s *CreateTestEcsResponse) SetErrorMessage(v string) *CreateTestEcsResponse {
  s.ErrorMessage = &v
  return s
}

func (s *CreateTestEcsResponse) SetErrorCode(v string) *CreateTestEcsResponse {
  s.ErrorCode = &v
  return s
}

type ListDisks00Request struct {
  AuthKey *string `json:"AuthKey" xml:"AuthKey" require:"true"`
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  ClientIp *string `json:"ClientIp" xml:"ClientIp" require:"true"`
  IdentityDTO map[string]interface{} `json:"IdentityDTO" xml:"IdentityDTO" require:"true"`
  ExtraParams map[string]interface{} `json:"ExtraParams" xml:"ExtraParams" require:"true"`
  ServerClientIp *string `json:"ServerClientIp" xml:"ServerClientIp" require:"true"`
}

func (s ListDisks00Request) String() string {
  return tea.Prettify(s)
}

func (s ListDisks00Request) GoString() string {
  return s.String()
}

func (s *ListDisks00Request) SetAuthKey(v string) *ListDisks00Request {
  s.AuthKey = &v
  return s
}

func (s *ListDisks00Request) SetRequestId(v string) *ListDisks00Request {
  s.RequestId = &v
  return s
}

func (s *ListDisks00Request) SetClientIp(v string) *ListDisks00Request {
  s.ClientIp = &v
  return s
}

func (s *ListDisks00Request) SetIdentityDTO(v map[string]interface{}) *ListDisks00Request {
  s.IdentityDTO = v
  return s
}

func (s *ListDisks00Request) SetExtraParams(v map[string]interface{}) *ListDisks00Request {
  s.ExtraParams = v
  return s
}

func (s *ListDisks00Request) SetServerClientIp(v string) *ListDisks00Request {
  s.ServerClientIp = &v
  return s
}

type ListDisks00Response struct {
  TraceId *string `json:"TraceId" xml:"TraceId" require:"true"`
  ErrorDetailMessage *string `json:"ErrorDetailMessage" xml:"ErrorDetailMessage" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  ErrorMessage *string `json:"ErrorMessage" xml:"ErrorMessage" require:"true"`
  ErrorCode *string `json:"ErrorCode" xml:"ErrorCode" require:"true"`
}

func (s ListDisks00Response) String() string {
  return tea.Prettify(s)
}

func (s ListDisks00Response) GoString() string {
  return s.String()
}

func (s *ListDisks00Response) SetTraceId(v string) *ListDisks00Response {
  s.TraceId = &v
  return s
}

func (s *ListDisks00Response) SetErrorDetailMessage(v string) *ListDisks00Response {
  s.ErrorDetailMessage = &v
  return s
}

func (s *ListDisks00Response) SetSuccess(v bool) *ListDisks00Response {
  s.Success = &v
  return s
}

func (s *ListDisks00Response) SetErrorMessage(v string) *ListDisks00Response {
  s.ErrorMessage = &v
  return s
}

func (s *ListDisks00Response) SetErrorCode(v string) *ListDisks00Response {
  s.ErrorCode = &v
  return s
}

type GetInstance01Request struct {
  AuthKey *string `json:"AuthKey" xml:"AuthKey" require:"true"`
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  ClientIp *string `json:"ClientIp" xml:"ClientIp" require:"true"`
  IdentityDTO map[string]interface{} `json:"IdentityDTO" xml:"IdentityDTO" require:"true"`
  ExtraParams map[string]interface{} `json:"ExtraParams" xml:"ExtraParams" require:"true"`
  ServerClientIp *string `json:"ServerClientIp" xml:"ServerClientIp" require:"true"`
}

func (s GetInstance01Request) String() string {
  return tea.Prettify(s)
}

func (s GetInstance01Request) GoString() string {
  return s.String()
}

func (s *GetInstance01Request) SetAuthKey(v string) *GetInstance01Request {
  s.AuthKey = &v
  return s
}

func (s *GetInstance01Request) SetRequestId(v string) *GetInstance01Request {
  s.RequestId = &v
  return s
}

func (s *GetInstance01Request) SetClientIp(v string) *GetInstance01Request {
  s.ClientIp = &v
  return s
}

func (s *GetInstance01Request) SetIdentityDTO(v map[string]interface{}) *GetInstance01Request {
  s.IdentityDTO = v
  return s
}

func (s *GetInstance01Request) SetExtraParams(v map[string]interface{}) *GetInstance01Request {
  s.ExtraParams = v
  return s
}

func (s *GetInstance01Request) SetServerClientIp(v string) *GetInstance01Request {
  s.ServerClientIp = &v
  return s
}

type GetInstance01Response struct {
  TraceId *string `json:"TraceId" xml:"TraceId" require:"true"`
  ErrorDetailMessage *string `json:"ErrorDetailMessage" xml:"ErrorDetailMessage" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  ErrorMessage *string `json:"ErrorMessage" xml:"ErrorMessage" require:"true"`
  ErrorCode *string `json:"ErrorCode" xml:"ErrorCode" require:"true"`
  Result *GetInstance01ResponseResult `json:"Result" xml:"Result" require:"true" type:"Struct"`
}

func (s GetInstance01Response) String() string {
  return tea.Prettify(s)
}

func (s GetInstance01Response) GoString() string {
  return s.String()
}

func (s *GetInstance01Response) SetTraceId(v string) *GetInstance01Response {
  s.TraceId = &v
  return s
}

func (s *GetInstance01Response) SetErrorDetailMessage(v string) *GetInstance01Response {
  s.ErrorDetailMessage = &v
  return s
}

func (s *GetInstance01Response) SetSuccess(v bool) *GetInstance01Response {
  s.Success = &v
  return s
}

func (s *GetInstance01Response) SetErrorMessage(v string) *GetInstance01Response {
  s.ErrorMessage = &v
  return s
}

func (s *GetInstance01Response) SetErrorCode(v string) *GetInstance01Response {
  s.ErrorCode = &v
  return s
}

func (s *GetInstance01Response) SetResult(v *GetInstance01ResponseResult) *GetInstance01Response {
  s.Result = v
  return s
}

type GetInstance01ResponseResult struct {
  Id *int64 `json:"Id" xml:"Id" require:"true"`
  ProjectName *string `json:"ProjectName" xml:"ProjectName" require:"true"`
}

func (s GetInstance01ResponseResult) String() string {
  return tea.Prettify(s)
}

func (s GetInstance01ResponseResult) GoString() string {
  return s.String()
}

func (s *GetInstance01ResponseResult) SetId(v int64) *GetInstance01ResponseResult {
  s.Id = &v
  return s
}

func (s *GetInstance01ResponseResult) SetProjectName(v string) *GetInstance01ResponseResult {
  s.ProjectName = &v
  return s
}

type DisableDiskRequest struct {
  TypeCode *string `json:"TypeCode" xml:"TypeCode" require:"true"`
}

func (s DisableDiskRequest) String() string {
  return tea.Prettify(s)
}

func (s DisableDiskRequest) GoString() string {
  return s.String()
}

func (s *DisableDiskRequest) SetTypeCode(v string) *DisableDiskRequest {
  s.TypeCode = &v
  return s
}

type DisableDiskResponse struct {
  Success *bool `json:"Success" xml:"Success" require:"true"`
  Data *DisableDiskResponseData `json:"Data" xml:"Data" require:"true" type:"Struct"`
}

func (s DisableDiskResponse) String() string {
  return tea.Prettify(s)
}

func (s DisableDiskResponse) GoString() string {
  return s.String()
}

func (s *DisableDiskResponse) SetSuccess(v bool) *DisableDiskResponse {
  s.Success = &v
  return s
}

func (s *DisableDiskResponse) SetData(v *DisableDiskResponseData) *DisableDiskResponse {
  s.Data = v
  return s
}

type DisableDiskResponseData struct {
  Code *string `json:"Code" xml:"Code" require:"true"`
  Name *string `json:"Name" xml:"Name" require:"true"`
  Option *int `json:"Option" xml:"Option" require:"true"`
}

func (s DisableDiskResponseData) String() string {
  return tea.Prettify(s)
}

func (s DisableDiskResponseData) GoString() string {
  return s.String()
}

func (s *DisableDiskResponseData) SetCode(v string) *DisableDiskResponseData {
  s.Code = &v
  return s
}

func (s *DisableDiskResponseData) SetName(v string) *DisableDiskResponseData {
  s.Name = &v
  return s
}

func (s *DisableDiskResponseData) SetOption(v int) *DisableDiskResponseData {
  s.Option = &v
  return s
}

type FsRequest struct {
  RegionId *string `json:"RegionId" xml:"RegionId" require:"true"`
  ImageId *string `json:"ImageId" xml:"ImageId" require:"true"`
  InternetChargeType *string `json:"InternetChargeType" xml:"InternetChargeType"`
  ClientToken *string `json:"ClientToken" xml:"ClientToken" require:"true"`
}

func (s FsRequest) String() string {
  return tea.Prettify(s)
}

func (s FsRequest) GoString() string {
  return s.String()
}

func (s *FsRequest) SetRegionId(v string) *FsRequest {
  s.RegionId = &v
  return s
}

func (s *FsRequest) SetImageId(v string) *FsRequest {
  s.ImageId = &v
  return s
}

func (s *FsRequest) SetInternetChargeType(v string) *FsRequest {
  s.InternetChargeType = &v
  return s
}

func (s *FsRequest) SetClientToken(v string) *FsRequest {
  s.ClientToken = &v
  return s
}

type FsResponse struct {
  InstanceId *string `json:"InstanceId" xml:"InstanceId" require:"true"`
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
}

func (s FsResponse) String() string {
  return tea.Prettify(s)
}

func (s FsResponse) GoString() string {
  return s.String()
}

func (s *FsResponse) SetInstanceId(v string) *FsResponse {
  s.InstanceId = &v
  return s
}

func (s *FsResponse) SetRequestId(v string) *FsResponse {
  s.RequestId = &v
  return s
}

type AttachDiskRequest struct {
  Aid *string `json:"Aid" xml:"Aid"`
  Bid *string `json:"Bid" xml:"Bid"`
}

func (s AttachDiskRequest) String() string {
  return tea.Prettify(s)
}

func (s AttachDiskRequest) GoString() string {
  return s.String()
}

func (s *AttachDiskRequest) SetAid(v string) *AttachDiskRequest {
  s.Aid = &v
  return s
}

func (s *AttachDiskRequest) SetBid(v string) *AttachDiskRequest {
  s.Bid = &v
  return s
}

type AttachDiskResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
}

func (s AttachDiskResponse) String() string {
  return tea.Prettify(s)
}

func (s AttachDiskResponse) GoString() string {
  return s.String()
}

func (s *AttachDiskResponse) SetRequestId(v string) *AttachDiskResponse {
  s.RequestId = &v
  return s
}

type DeleteInstanceRequest struct {
  OwnerId *int64 `json:"OwnerId" xml:"OwnerId"`
  ResourceOwnerAccount *string `json:"ResourceOwnerAccount" xml:"ResourceOwnerAccount"`
  ResourceOwnerId *int64 `json:"ResourceOwnerId" xml:"ResourceOwnerId"`
  InstanceId *string `json:"InstanceId" xml:"InstanceId" require:"true"`
  OwnerAccount *string `json:"OwnerAccount" xml:"OwnerAccount"`
  Force *bool `json:"Force" xml:"Force"`
  TerminateSubscription *bool `json:"TerminateSubscription" xml:"TerminateSubscription"`
}

func (s DeleteInstanceRequest) String() string {
  return tea.Prettify(s)
}

func (s DeleteInstanceRequest) GoString() string {
  return s.String()
}

func (s *DeleteInstanceRequest) SetOwnerId(v int64) *DeleteInstanceRequest {
  s.OwnerId = &v
  return s
}

func (s *DeleteInstanceRequest) SetResourceOwnerAccount(v string) *DeleteInstanceRequest {
  s.ResourceOwnerAccount = &v
  return s
}

func (s *DeleteInstanceRequest) SetResourceOwnerId(v int64) *DeleteInstanceRequest {
  s.ResourceOwnerId = &v
  return s
}

func (s *DeleteInstanceRequest) SetInstanceId(v string) *DeleteInstanceRequest {
  s.InstanceId = &v
  return s
}

func (s *DeleteInstanceRequest) SetOwnerAccount(v string) *DeleteInstanceRequest {
  s.OwnerAccount = &v
  return s
}

func (s *DeleteInstanceRequest) SetForce(v bool) *DeleteInstanceRequest {
  s.Force = &v
  return s
}

func (s *DeleteInstanceRequest) SetTerminateSubscription(v bool) *DeleteInstanceRequest {
  s.TerminateSubscription = &v
  return s
}

type DeleteInstanceResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
}

func (s DeleteInstanceResponse) String() string {
  return tea.Prettify(s)
}

func (s DeleteInstanceResponse) GoString() string {
  return s.String()
}

func (s *DeleteInstanceResponse) SetRequestId(v string) *DeleteInstanceResponse {
  s.RequestId = &v
  return s
}

type CreateInstanceRequest struct {
  OwnerId *int64 `json:"OwnerId" xml:"OwnerId"`
  ResourceOwnerAccount *string `json:"ResourceOwnerAccount" xml:"ResourceOwnerAccount"`
  ResourceOwnerId *int64 `json:"ResourceOwnerId" xml:"ResourceOwnerId"`
  RegionId *string `json:"RegionId" xml:"RegionId" require:"true"`
  ImageId *string `json:"ImageId" xml:"ImageId"`
  ImageFamily *string `json:"ImageFamily" xml:"ImageFamily"`
  InstanceType *string `json:"InstanceType" xml:"InstanceType" require:"true"`
  SecurityGroupId *string `json:"SecurityGroupId" xml:"SecurityGroupId"`
  InstanceName *string `json:"InstanceName" xml:"InstanceName"`
  InternetChargeType *string `json:"InternetChargeType" xml:"InternetChargeType"`
  AutoRenew *bool `json:"AutoRenew" xml:"AutoRenew"`
  AutoRenewPeriod *int `json:"AutoRenewPeriod" xml:"AutoRenewPeriod"`
  InternetMaxBandwidthIn *int `json:"InternetMaxBandwidthIn" xml:"InternetMaxBandwidthIn"`
  InternetMaxBandwidthOut *int `json:"InternetMaxBandwidthOut" xml:"InternetMaxBandwidthOut"`
  HostName *string `json:"HostName" xml:"HostName"`
  Password *string `json:"Password" xml:"Password"`
  PasswordInherit *bool `json:"PasswordInherit" xml:"PasswordInherit"`
  DeploymentSetId *string `json:"DeploymentSetId" xml:"DeploymentSetId"`
  ZoneId *string `json:"ZoneId" xml:"ZoneId"`
  ClusterId *string `json:"ClusterId" xml:"ClusterId"`
  ClientToken *string `json:"ClientToken" xml:"ClientToken"`
  VlanId *string `json:"VlanId" xml:"VlanId"`
  InnerIpAddress *string `json:"InnerIpAddress" xml:"InnerIpAddress"`
  SystemDisk *CreateInstanceRequestSystemDisk `json:"SystemDisk" xml:"SystemDisk" require:"true" type:"Struct"`
  DataDisk []*CreateInstanceRequestDataDisk `json:"DataDisk" xml:"DataDisk" type:"Repeated"`
  Arn []*CreateInstanceRequestArn `json:"Arn" xml:"Arn" type:"Repeated"`
  NodeControllerId *string `json:"NodeControllerId" xml:"NodeControllerId"`
  Description *string `json:"Description" xml:"Description"`
  VSwitchId *string `json:"VSwitchId" xml:"VSwitchId"`
  PrivateIpAddress *string `json:"PrivateIpAddress" xml:"PrivateIpAddress"`
  IoOptimized *string `json:"IoOptimized" xml:"IoOptimized"`
  OwnerAccount *string `json:"OwnerAccount" xml:"OwnerAccount"`
  UseAdditionalService *bool `json:"UseAdditionalService" xml:"UseAdditionalService"`
  InstanceChargeType *string `json:"InstanceChargeType" xml:"InstanceChargeType"`
  Period *int `json:"Period" xml:"Period"`
  PeriodUnit *string `json:"PeriodUnit" xml:"PeriodUnit"`
  Tag []*CreateInstanceRequestTag `json:"Tag" xml:"Tag" type:"Repeated"`
  UserData *string `json:"UserData" xml:"UserData"`
  SpotStrategy *string `json:"SpotStrategy" xml:"SpotStrategy"`
  KeyPairName *string `json:"KeyPairName" xml:"KeyPairName"`
  SpotPriceLimit *float32 `json:"SpotPriceLimit" xml:"SpotPriceLimit"`
  SpotDuration *int `json:"SpotDuration" xml:"SpotDuration"`
  SpotInterruptionBehavior *string `json:"SpotInterruptionBehavior" xml:"SpotInterruptionBehavior"`
  RamRoleName *string `json:"RamRoleName" xml:"RamRoleName"`
  SecurityEnhancementStrategy *string `json:"SecurityEnhancementStrategy" xml:"SecurityEnhancementStrategy"`
  ResourceGroupId *string `json:"ResourceGroupId" xml:"ResourceGroupId"`
  HpcClusterId *string `json:"HpcClusterId" xml:"HpcClusterId"`
  DryRun *bool `json:"DryRun" xml:"DryRun"`
  DedicatedHostId *string `json:"DedicatedHostId" xml:"DedicatedHostId"`
  CreditSpecification *string `json:"CreditSpecification" xml:"CreditSpecification"`
  DeletionProtection *bool `json:"DeletionProtection" xml:"DeletionProtection"`
  Affinity *string `json:"Affinity" xml:"Affinity"`
  Tenancy *string `json:"Tenancy" xml:"Tenancy"`
  StorageSetId *string `json:"StorageSetId" xml:"StorageSetId"`
  StorageSetPartitionNumber *int `json:"StorageSetPartitionNumber" xml:"StorageSetPartitionNumber"`
}

func (s CreateInstanceRequest) String() string {
  return tea.Prettify(s)
}

func (s CreateInstanceRequest) GoString() string {
  return s.String()
}

func (s *CreateInstanceRequest) SetOwnerId(v int64) *CreateInstanceRequest {
  s.OwnerId = &v
  return s
}

func (s *CreateInstanceRequest) SetResourceOwnerAccount(v string) *CreateInstanceRequest {
  s.ResourceOwnerAccount = &v
  return s
}

func (s *CreateInstanceRequest) SetResourceOwnerId(v int64) *CreateInstanceRequest {
  s.ResourceOwnerId = &v
  return s
}

func (s *CreateInstanceRequest) SetRegionId(v string) *CreateInstanceRequest {
  s.RegionId = &v
  return s
}

func (s *CreateInstanceRequest) SetImageId(v string) *CreateInstanceRequest {
  s.ImageId = &v
  return s
}

func (s *CreateInstanceRequest) SetImageFamily(v string) *CreateInstanceRequest {
  s.ImageFamily = &v
  return s
}

func (s *CreateInstanceRequest) SetInstanceType(v string) *CreateInstanceRequest {
  s.InstanceType = &v
  return s
}

func (s *CreateInstanceRequest) SetSecurityGroupId(v string) *CreateInstanceRequest {
  s.SecurityGroupId = &v
  return s
}

func (s *CreateInstanceRequest) SetInstanceName(v string) *CreateInstanceRequest {
  s.InstanceName = &v
  return s
}

func (s *CreateInstanceRequest) SetInternetChargeType(v string) *CreateInstanceRequest {
  s.InternetChargeType = &v
  return s
}

func (s *CreateInstanceRequest) SetAutoRenew(v bool) *CreateInstanceRequest {
  s.AutoRenew = &v
  return s
}

func (s *CreateInstanceRequest) SetAutoRenewPeriod(v int) *CreateInstanceRequest {
  s.AutoRenewPeriod = &v
  return s
}

func (s *CreateInstanceRequest) SetInternetMaxBandwidthIn(v int) *CreateInstanceRequest {
  s.InternetMaxBandwidthIn = &v
  return s
}

func (s *CreateInstanceRequest) SetInternetMaxBandwidthOut(v int) *CreateInstanceRequest {
  s.InternetMaxBandwidthOut = &v
  return s
}

func (s *CreateInstanceRequest) SetHostName(v string) *CreateInstanceRequest {
  s.HostName = &v
  return s
}

func (s *CreateInstanceRequest) SetPassword(v string) *CreateInstanceRequest {
  s.Password = &v
  return s
}

func (s *CreateInstanceRequest) SetPasswordInherit(v bool) *CreateInstanceRequest {
  s.PasswordInherit = &v
  return s
}

func (s *CreateInstanceRequest) SetDeploymentSetId(v string) *CreateInstanceRequest {
  s.DeploymentSetId = &v
  return s
}

func (s *CreateInstanceRequest) SetZoneId(v string) *CreateInstanceRequest {
  s.ZoneId = &v
  return s
}

func (s *CreateInstanceRequest) SetClusterId(v string) *CreateInstanceRequest {
  s.ClusterId = &v
  return s
}

func (s *CreateInstanceRequest) SetClientToken(v string) *CreateInstanceRequest {
  s.ClientToken = &v
  return s
}

func (s *CreateInstanceRequest) SetVlanId(v string) *CreateInstanceRequest {
  s.VlanId = &v
  return s
}

func (s *CreateInstanceRequest) SetInnerIpAddress(v string) *CreateInstanceRequest {
  s.InnerIpAddress = &v
  return s
}

func (s *CreateInstanceRequest) SetSystemDisk(v *CreateInstanceRequestSystemDisk) *CreateInstanceRequest {
  s.SystemDisk = v
  return s
}

func (s *CreateInstanceRequest) SetDataDisk(v []*CreateInstanceRequestDataDisk) *CreateInstanceRequest {
  s.DataDisk = v
  return s
}

func (s *CreateInstanceRequest) SetArn(v []*CreateInstanceRequestArn) *CreateInstanceRequest {
  s.Arn = v
  return s
}

func (s *CreateInstanceRequest) SetNodeControllerId(v string) *CreateInstanceRequest {
  s.NodeControllerId = &v
  return s
}

func (s *CreateInstanceRequest) SetDescription(v string) *CreateInstanceRequest {
  s.Description = &v
  return s
}

func (s *CreateInstanceRequest) SetVSwitchId(v string) *CreateInstanceRequest {
  s.VSwitchId = &v
  return s
}

func (s *CreateInstanceRequest) SetPrivateIpAddress(v string) *CreateInstanceRequest {
  s.PrivateIpAddress = &v
  return s
}

func (s *CreateInstanceRequest) SetIoOptimized(v string) *CreateInstanceRequest {
  s.IoOptimized = &v
  return s
}

func (s *CreateInstanceRequest) SetOwnerAccount(v string) *CreateInstanceRequest {
  s.OwnerAccount = &v
  return s
}

func (s *CreateInstanceRequest) SetUseAdditionalService(v bool) *CreateInstanceRequest {
  s.UseAdditionalService = &v
  return s
}

func (s *CreateInstanceRequest) SetInstanceChargeType(v string) *CreateInstanceRequest {
  s.InstanceChargeType = &v
  return s
}

func (s *CreateInstanceRequest) SetPeriod(v int) *CreateInstanceRequest {
  s.Period = &v
  return s
}

func (s *CreateInstanceRequest) SetPeriodUnit(v string) *CreateInstanceRequest {
  s.PeriodUnit = &v
  return s
}

func (s *CreateInstanceRequest) SetTag(v []*CreateInstanceRequestTag) *CreateInstanceRequest {
  s.Tag = v
  return s
}

func (s *CreateInstanceRequest) SetUserData(v string) *CreateInstanceRequest {
  s.UserData = &v
  return s
}

func (s *CreateInstanceRequest) SetSpotStrategy(v string) *CreateInstanceRequest {
  s.SpotStrategy = &v
  return s
}

func (s *CreateInstanceRequest) SetKeyPairName(v string) *CreateInstanceRequest {
  s.KeyPairName = &v
  return s
}

func (s *CreateInstanceRequest) SetSpotPriceLimit(v float32) *CreateInstanceRequest {
  s.SpotPriceLimit = &v
  return s
}

func (s *CreateInstanceRequest) SetSpotDuration(v int) *CreateInstanceRequest {
  s.SpotDuration = &v
  return s
}

func (s *CreateInstanceRequest) SetSpotInterruptionBehavior(v string) *CreateInstanceRequest {
  s.SpotInterruptionBehavior = &v
  return s
}

func (s *CreateInstanceRequest) SetRamRoleName(v string) *CreateInstanceRequest {
  s.RamRoleName = &v
  return s
}

func (s *CreateInstanceRequest) SetSecurityEnhancementStrategy(v string) *CreateInstanceRequest {
  s.SecurityEnhancementStrategy = &v
  return s
}

func (s *CreateInstanceRequest) SetResourceGroupId(v string) *CreateInstanceRequest {
  s.ResourceGroupId = &v
  return s
}

func (s *CreateInstanceRequest) SetHpcClusterId(v string) *CreateInstanceRequest {
  s.HpcClusterId = &v
  return s
}

func (s *CreateInstanceRequest) SetDryRun(v bool) *CreateInstanceRequest {
  s.DryRun = &v
  return s
}

func (s *CreateInstanceRequest) SetDedicatedHostId(v string) *CreateInstanceRequest {
  s.DedicatedHostId = &v
  return s
}

func (s *CreateInstanceRequest) SetCreditSpecification(v string) *CreateInstanceRequest {
  s.CreditSpecification = &v
  return s
}

func (s *CreateInstanceRequest) SetDeletionProtection(v bool) *CreateInstanceRequest {
  s.DeletionProtection = &v
  return s
}

func (s *CreateInstanceRequest) SetAffinity(v string) *CreateInstanceRequest {
  s.Affinity = &v
  return s
}

func (s *CreateInstanceRequest) SetTenancy(v string) *CreateInstanceRequest {
  s.Tenancy = &v
  return s
}

func (s *CreateInstanceRequest) SetStorageSetId(v string) *CreateInstanceRequest {
  s.StorageSetId = &v
  return s
}

func (s *CreateInstanceRequest) SetStorageSetPartitionNumber(v int) *CreateInstanceRequest {
  s.StorageSetPartitionNumber = &v
  return s
}

type CreateInstanceRequestSystemDisk struct {
  Size *int `json:"Size" xml:"Size"`
  Category *string `json:"Category" xml:"Category"`
  DiskName *string `json:"DiskName" xml:"DiskName"`
  Description *string `json:"Description" xml:"Description"`
  PerformanceLevel *string `json:"PerformanceLevel" xml:"PerformanceLevel"`
}

func (s CreateInstanceRequestSystemDisk) String() string {
  return tea.Prettify(s)
}

func (s CreateInstanceRequestSystemDisk) GoString() string {
  return s.String()
}

func (s *CreateInstanceRequestSystemDisk) SetSize(v int) *CreateInstanceRequestSystemDisk {
  s.Size = &v
  return s
}

func (s *CreateInstanceRequestSystemDisk) SetCategory(v string) *CreateInstanceRequestSystemDisk {
  s.Category = &v
  return s
}

func (s *CreateInstanceRequestSystemDisk) SetDiskName(v string) *CreateInstanceRequestSystemDisk {
  s.DiskName = &v
  return s
}

func (s *CreateInstanceRequestSystemDisk) SetDescription(v string) *CreateInstanceRequestSystemDisk {
  s.Description = &v
  return s
}

func (s *CreateInstanceRequestSystemDisk) SetPerformanceLevel(v string) *CreateInstanceRequestSystemDisk {
  s.PerformanceLevel = &v
  return s
}

type CreateInstanceRequestDataDisk struct     {
  Size *int `json:"Size" xml:"Size" require:"true"`
  SnapshotId *string `json:"SnapshotId" xml:"SnapshotId" require:"true"`
  Category *string `json:"Category" xml:"Category" require:"true"`
  DiskName *string `json:"DiskName" xml:"DiskName" require:"true"`
  Description *string `json:"Description" xml:"Description" require:"true"`
  Device *string `json:"Device" xml:"Device" require:"true"`
  DeleteWithInstance *bool `json:"DeleteWithInstance" xml:"DeleteWithInstance" require:"true"`
  Encrypted *bool `json:"Encrypted" xml:"Encrypted" require:"true"`
  KMSKeyId *string `json:"KMSKeyId" xml:"KMSKeyId" require:"true"`
  PerformanceLevel *string `json:"PerformanceLevel" xml:"PerformanceLevel" require:"true"`
}

func (s CreateInstanceRequestDataDisk) String() string {
  return tea.Prettify(s)
}

func (s CreateInstanceRequestDataDisk) GoString() string {
  return s.String()
}

func (s *CreateInstanceRequestDataDisk) SetSize(v int) *CreateInstanceRequestDataDisk {
  s.Size = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetSnapshotId(v string) *CreateInstanceRequestDataDisk {
  s.SnapshotId = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetCategory(v string) *CreateInstanceRequestDataDisk {
  s.Category = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetDiskName(v string) *CreateInstanceRequestDataDisk {
  s.DiskName = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetDescription(v string) *CreateInstanceRequestDataDisk {
  s.Description = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetDevice(v string) *CreateInstanceRequestDataDisk {
  s.Device = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetDeleteWithInstance(v bool) *CreateInstanceRequestDataDisk {
  s.DeleteWithInstance = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetEncrypted(v bool) *CreateInstanceRequestDataDisk {
  s.Encrypted = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetKMSKeyId(v string) *CreateInstanceRequestDataDisk {
  s.KMSKeyId = &v
  return s
}

func (s *CreateInstanceRequestDataDisk) SetPerformanceLevel(v string) *CreateInstanceRequestDataDisk {
  s.PerformanceLevel = &v
  return s
}

type CreateInstanceRequestArn struct     {
  AssumeRoleFor *int64 `json:"AssumeRoleFor" xml:"AssumeRoleFor" require:"true"`
  Rolearn *string `json:"Rolearn" xml:"Rolearn" require:"true"`
  RoleType *string `json:"RoleType" xml:"RoleType" require:"true"`
}

func (s CreateInstanceRequestArn) String() string {
  return tea.Prettify(s)
}

func (s CreateInstanceRequestArn) GoString() string {
  return s.String()
}

func (s *CreateInstanceRequestArn) SetAssumeRoleFor(v int64) *CreateInstanceRequestArn {
  s.AssumeRoleFor = &v
  return s
}

func (s *CreateInstanceRequestArn) SetRolearn(v string) *CreateInstanceRequestArn {
  s.Rolearn = &v
  return s
}

func (s *CreateInstanceRequestArn) SetRoleType(v string) *CreateInstanceRequestArn {
  s.RoleType = &v
  return s
}

type CreateInstanceRequestTag struct     {
  Value *string `json:"value" xml:"value" require:"true"`
  Key *string `json:"key" xml:"key" require:"true"`
}

func (s CreateInstanceRequestTag) String() string {
  return tea.Prettify(s)
}

func (s CreateInstanceRequestTag) GoString() string {
  return s.String()
}

func (s *CreateInstanceRequestTag) SetValue(v string) *CreateInstanceRequestTag {
  s.Value = &v
  return s
}

func (s *CreateInstanceRequestTag) SetKey(v string) *CreateInstanceRequestTag {
  s.Key = &v
  return s
}

type CreateInstanceResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  InstanceId *string `json:"InstanceId" xml:"InstanceId" require:"true"`
  TradePrice *float32 `json:"TradePrice" xml:"TradePrice" require:"true"`
}

func (s CreateInstanceResponse) String() string {
  return tea.Prettify(s)
}

func (s CreateInstanceResponse) GoString() string {
  return s.String()
}

func (s *CreateInstanceResponse) SetRequestId(v string) *CreateInstanceResponse {
  s.RequestId = &v
  return s
}

func (s *CreateInstanceResponse) SetInstanceId(v string) *CreateInstanceResponse {
  s.InstanceId = &v
  return s
}

func (s *CreateInstanceResponse) SetTradePrice(v float32) *CreateInstanceResponse {
  s.TradePrice = &v
  return s
}

type Client struct {
  rpc.Client
}

func NewClient(config *rpc.Config)(*Client, error) {
  client := new(Client)
  err := client.Init(config)
  return client, err
}

func (client *Client)Init(config *rpc.Config)(_err error) {
  _err = client.Client.Init(config  )
  if _err != nil {
    return _err
  }
  client.EndpointRule = ""
  _err = client.CheckConfig(config)
  if _err != nil {
    return
  }
  client.Endpoint, _err = client.GetEndpoint(client.ProductId, client.RegionId, client.EndpointRule, client.Network, client.Suffix, client.EndpointMap, client.Endpoint)
  if _err != nil {
    return _err
  }

  return nil
}



func (client *Client) AsdwqwEx (request *AsdwqwRequest, runtime *util.RuntimeOptions) (_result *AsdwqwResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &AsdwqwResponse{}
  _body, _err := client.DoRequest("Asdwqw", "HTTPS", "PUT", "2019-06-20", "AK,APP", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) Asdwqw (request *AsdwqwRequest) (_result *AsdwqwResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &AsdwqwResponse{}
  _body, _err := client.AsdwqwEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) HsfMockEx (request *HsfMockRequest, runtime *util.RuntimeOptions) (_result *HsfMockResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &HsfMockResponse{}
  _body, _err := client.DoRequest("HsfMock", "HTTPS", "POST", "2019-06-20", "AK", nil, tea.ToMap(request), runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) HsfMock (request *HsfMockRequest) (_result *HsfMockResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &HsfMockResponse{}
  _body, _err := client.HsfMockEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) DeleteEcsDemoIncEx (request *DeleteEcsDemoIncRequest, runtime *util.RuntimeOptions) (_result *DeleteEcsDemoIncResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &DeleteEcsDemoIncResponse{}
  _body, _err := client.DoRequest("DeleteEcsDemoInc", "HTTPS", "GET", "2019-06-20", "Anonymous", nil, tea.ToMap(request), runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) DeleteEcsDemoInc (request *DeleteEcsDemoIncRequest) (_result *DeleteEcsDemoIncResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &DeleteEcsDemoIncResponse{}
  _body, _err := client.DeleteEcsDemoIncEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) DescribeInstancesEx (request *DescribeInstancesRequest, runtime *util.RuntimeOptions) (_result *DescribeInstancesResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &DescribeInstancesResponse{}
  _body, _err := client.DoRequest("DescribeInstances", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) DescribeInstances (request *DescribeInstancesRequest) (_result *DescribeInstancesResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &DescribeInstancesResponse{}
  _body, _err := client.DescribeInstancesEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) CreateEcsDemoIncEx (request *CreateEcsDemoIncRequest, runtime *util.RuntimeOptions) (_result *CreateEcsDemoIncResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &CreateEcsDemoIncResponse{}
  _body, _err := client.DoRequest("CreateEcsDemoInc", "HTTPS", "POST", "2019-06-20", "Anonymous", nil, tea.ToMap(request), runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) CreateEcsDemoInc (request *CreateEcsDemoIncRequest) (_result *CreateEcsDemoIncResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &CreateEcsDemoIncResponse{}
  _body, _err := client.CreateEcsDemoIncEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) ListDisks001Ex (request *ListDisks001Request, runtime *util.RuntimeOptions) (_result *ListDisks001Response, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &ListDisks001Response{}
  _body, _err := client.DoRequest("ListDisks001", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) ListDisks001 (request *ListDisks001Request) (_result *ListDisks001Response, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &ListDisks001Response{}
  _body, _err := client.ListDisks001Ex(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) ListDisks1233Ex (request *ListDisks1233Request, runtime *util.RuntimeOptions) (_result *ListDisks1233Response, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &ListDisks1233Response{}
  _body, _err := client.DoRequest("ListDisks1233", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) ListDisks1233 (request *ListDisks1233Request) (_result *ListDisks1233Response, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &ListDisks1233Response{}
  _body, _err := client.ListDisks1233Ex(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) ModifyInstanceEx (request *ModifyInstanceRequest, runtime *util.RuntimeOptions) (_result *ModifyInstanceResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &ModifyInstanceResponse{}
  _body, _err := client.DoRequest("ModifyInstance", "HTTPS", "POST", "2019-06-20", "Anonymous", nil, tea.ToMap(request), runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) ModifyInstance (request *ModifyInstanceRequest) (_result *ModifyInstanceResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &ModifyInstanceResponse{}
  _body, _err := client.ModifyInstanceEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) HiFucker4Ex (request *HiFucker4Request, runtime *util.RuntimeOptions) (_result *HiFucker4Response, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &HiFucker4Response{}
  _body, _err := client.DoRequest("HiFucker4", "HTTPS", "GET", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) HiFucker4 (request *HiFucker4Request) (_result *HiFucker4Response, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &HiFucker4Response{}
  _body, _err := client.HiFucker4Ex(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) CreateTestEcsEx (request *CreateTestEcsRequest, runtime *util.RuntimeOptions) (_result *CreateTestEcsResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &CreateTestEcsResponse{}
  _body, _err := client.DoRequest("CreateTestEcs", "HTTPS", "POST", "2019-06-20", "APP", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) CreateTestEcs (request *CreateTestEcsRequest) (_result *CreateTestEcsResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &CreateTestEcsResponse{}
  _body, _err := client.CreateTestEcsEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) ListDisks00Ex (request *ListDisks00Request, runtime *util.RuntimeOptions) (_result *ListDisks00Response, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &ListDisks00Response{}
  _body, _err := client.DoRequest("ListDisks00", "HTTPS", "GET", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) ListDisks00 (request *ListDisks00Request) (_result *ListDisks00Response, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &ListDisks00Response{}
  _body, _err := client.ListDisks00Ex(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) GetInstance01Ex (request *GetInstance01Request, runtime *util.RuntimeOptions) (_result *GetInstance01Response, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &GetInstance01Response{}
  _body, _err := client.DoRequest("GetInstance01", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) GetInstance01 (request *GetInstance01Request) (_result *GetInstance01Response, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &GetInstance01Response{}
  _body, _err := client.GetInstance01Ex(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) DisableDiskEx (request *DisableDiskRequest, runtime *util.RuntimeOptions) (_result *DisableDiskResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &DisableDiskResponse{}
  _body, _err := client.DoRequest("DisableDisk", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) DisableDisk (request *DisableDiskRequest) (_result *DisableDiskResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &DisableDiskResponse{}
  _body, _err := client.DisableDiskEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) FsEx (request *FsRequest, runtime *util.RuntimeOptions) (_result *FsResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &FsResponse{}
  _body, _err := client.DoRequest("Fs", "HTTPS", "POST", "2019-06-20", "AK", nil, tea.ToMap(request), runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) Fs (request *FsRequest) (_result *FsResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &FsResponse{}
  _body, _err := client.FsEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) AttachDiskEx (request *AttachDiskRequest, runtime *util.RuntimeOptions) (_result *AttachDiskResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &AttachDiskResponse{}
  _body, _err := client.DoRequest("AttachDisk", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) AttachDisk (request *AttachDiskRequest) (_result *AttachDiskResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &AttachDiskResponse{}
  _body, _err := client.AttachDiskEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) DeleteInstanceEx (request *DeleteInstanceRequest, runtime *util.RuntimeOptions) (_result *DeleteInstanceResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &DeleteInstanceResponse{}
  _body, _err := client.DoRequest("DeleteInstance", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) DeleteInstance (request *DeleteInstanceRequest) (_result *DeleteInstanceResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &DeleteInstanceResponse{}
  _body, _err := client.DeleteInstanceEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) CreateInstanceEx (request *CreateInstanceRequest, runtime *util.RuntimeOptions) (_result *CreateInstanceResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return
  }
  _result = &CreateInstanceResponse{}
  _body, _err := client.DoRequest("CreateInstance", "HTTPS", "POST", "2019-06-20", "AK", tea.ToMap(request), nil, runtime)
  if _err != nil {
    return nil, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) CreateInstance (request *CreateInstanceRequest) (_result *CreateInstanceResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &CreateInstanceResponse{}
  _body, _err := client.CreateInstanceEx(request, runtime)
  if _err != nil {
    return nil, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) GetEndpoint (productId string, regionId string, endpointRule string, network string, suffix string, endpointMap map[string]string, endpoint string) (_result string, _err error) {
  if !util.Empty(endpoint) {
    _result = endpoint
    return _result , _err
  }

  if !util.IsUnset(endpointMap) && !util.Empty(endpointMap[regionId]) {
    return _result, _err
  }

  _body, _err := endpointutil.GetEndpointRules(productId, regionId, endpointRule, network, suffix)
  if _err != nil {
    return "", _err
  }
  _result = _body
  return _result, _err
}

