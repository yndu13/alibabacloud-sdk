// This file is auto-generated, don't edit it. Thanks.
package client

import (
  util  "github.com/alibabacloud-go/tea-utils/service"
  rpc  "github.com/alibabacloud-go/tea-rpc/client"
  endpointutil  "github.com/alibabacloud-go/endpoint-util/service"
  "github.com/alibabacloud-go/tea/tea"
)

type OpenCallbackRequest struct {
  ParamStr *string `json:"paramStr" xml:"paramStr" require:"true"`
}

func (s OpenCallbackRequest) String() string {
  return tea.Prettify(s)
}

func (s OpenCallbackRequest) GoString() string {
  return s.String()
}

func (s *OpenCallbackRequest) SetParamStr(v string) *OpenCallbackRequest {
  s.ParamStr = &v
  return s
}

type OpenCallbackResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  Code *string `json:"Code" xml:"Code" require:"true"`
  Message *string `json:"Message" xml:"Message" require:"true"`
  Data *string `json:"Data" xml:"Data" require:"true"`
}

func (s OpenCallbackResponse) String() string {
  return tea.Prettify(s)
}

func (s OpenCallbackResponse) GoString() string {
  return s.String()
}

func (s *OpenCallbackResponse) SetRequestId(v string) *OpenCallbackResponse {
  s.RequestId = &v
  return s
}

func (s *OpenCallbackResponse) SetSuccess(v bool) *OpenCallbackResponse {
  s.Success = &v
  return s
}

func (s *OpenCallbackResponse) SetCode(v string) *OpenCallbackResponse {
  s.Code = &v
  return s
}

func (s *OpenCallbackResponse) SetMessage(v string) *OpenCallbackResponse {
  s.Message = &v
  return s
}

func (s *OpenCallbackResponse) SetData(v string) *OpenCallbackResponse {
  s.Data = &v
  return s
}

type QueryForCssOrderRequest struct {
  ParamStr *string `json:"paramStr" xml:"paramStr" require:"true"`
}

func (s QueryForCssOrderRequest) String() string {
  return tea.Prettify(s)
}

func (s QueryForCssOrderRequest) GoString() string {
  return s.String()
}

func (s *QueryForCssOrderRequest) SetParamStr(v string) *QueryForCssOrderRequest {
  s.ParamStr = &v
  return s
}

type QueryForCssOrderResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  Code *string `json:"Code" xml:"Code" require:"true"`
  Message *string `json:"Message" xml:"Message" require:"true"`
  Data *string `json:"Data" xml:"Data" require:"true"`
}

func (s QueryForCssOrderResponse) String() string {
  return tea.Prettify(s)
}

func (s QueryForCssOrderResponse) GoString() string {
  return s.String()
}

func (s *QueryForCssOrderResponse) SetRequestId(v string) *QueryForCssOrderResponse {
  s.RequestId = &v
  return s
}

func (s *QueryForCssOrderResponse) SetSuccess(v bool) *QueryForCssOrderResponse {
  s.Success = &v
  return s
}

func (s *QueryForCssOrderResponse) SetCode(v string) *QueryForCssOrderResponse {
  s.Code = &v
  return s
}

func (s *QueryForCssOrderResponse) SetMessage(v string) *QueryForCssOrderResponse {
  s.Message = &v
  return s
}

func (s *QueryForCssOrderResponse) SetData(v string) *QueryForCssOrderResponse {
  s.Data = &v
  return s
}

type CreateOrderRequest struct {
  ParamStr *string `json:"paramStr" xml:"paramStr" require:"true"`
}

func (s CreateOrderRequest) String() string {
  return tea.Prettify(s)
}

func (s CreateOrderRequest) GoString() string {
  return s.String()
}

func (s *CreateOrderRequest) SetParamStr(v string) *CreateOrderRequest {
  s.ParamStr = &v
  return s
}

type CreateOrderResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  Code *string `json:"Code" xml:"Code" require:"true"`
  Message *string `json:"Message" xml:"Message" require:"true"`
  Data *string `json:"Data" xml:"Data" require:"true"`
}

func (s CreateOrderResponse) String() string {
  return tea.Prettify(s)
}

func (s CreateOrderResponse) GoString() string {
  return s.String()
}

func (s *CreateOrderResponse) SetRequestId(v string) *CreateOrderResponse {
  s.RequestId = &v
  return s
}

func (s *CreateOrderResponse) SetSuccess(v bool) *CreateOrderResponse {
  s.Success = &v
  return s
}

func (s *CreateOrderResponse) SetCode(v string) *CreateOrderResponse {
  s.Code = &v
  return s
}

func (s *CreateOrderResponse) SetMessage(v string) *CreateOrderResponse {
  s.Message = &v
  return s
}

func (s *CreateOrderResponse) SetData(v string) *CreateOrderResponse {
  s.Data = &v
  return s
}

type VnoPayCallBackNotifyRequest struct {
  ParamStr *string `json:"paramStr" xml:"paramStr" require:"true"`
}

func (s VnoPayCallBackNotifyRequest) String() string {
  return tea.Prettify(s)
}

func (s VnoPayCallBackNotifyRequest) GoString() string {
  return s.String()
}

func (s *VnoPayCallBackNotifyRequest) SetParamStr(v string) *VnoPayCallBackNotifyRequest {
  s.ParamStr = &v
  return s
}

type VnoPayCallBackNotifyResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  Code *string `json:"Code" xml:"Code" require:"true"`
  Message *string `json:"Message" xml:"Message" require:"true"`
  Data *string `json:"Data" xml:"Data" require:"true"`
}

func (s VnoPayCallBackNotifyResponse) String() string {
  return tea.Prettify(s)
}

func (s VnoPayCallBackNotifyResponse) GoString() string {
  return s.String()
}

func (s *VnoPayCallBackNotifyResponse) SetRequestId(v string) *VnoPayCallBackNotifyResponse {
  s.RequestId = &v
  return s
}

func (s *VnoPayCallBackNotifyResponse) SetSuccess(v bool) *VnoPayCallBackNotifyResponse {
  s.Success = &v
  return s
}

func (s *VnoPayCallBackNotifyResponse) SetCode(v string) *VnoPayCallBackNotifyResponse {
  s.Code = &v
  return s
}

func (s *VnoPayCallBackNotifyResponse) SetMessage(v string) *VnoPayCallBackNotifyResponse {
  s.Message = &v
  return s
}

func (s *VnoPayCallBackNotifyResponse) SetData(v string) *VnoPayCallBackNotifyResponse {
  s.Data = &v
  return s
}

type VnoBatchRefundOrderRequest struct {
  ParamStr *string `json:"paramStr" xml:"paramStr" require:"true"`
}

func (s VnoBatchRefundOrderRequest) String() string {
  return tea.Prettify(s)
}

func (s VnoBatchRefundOrderRequest) GoString() string {
  return s.String()
}

func (s *VnoBatchRefundOrderRequest) SetParamStr(v string) *VnoBatchRefundOrderRequest {
  s.ParamStr = &v
  return s
}

type VnoBatchRefundOrderResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  Code *string `json:"Code" xml:"Code" require:"true"`
  Message *string `json:"Message" xml:"Message" require:"true"`
  Data *string `json:"Data" xml:"Data" require:"true"`
}

func (s VnoBatchRefundOrderResponse) String() string {
  return tea.Prettify(s)
}

func (s VnoBatchRefundOrderResponse) GoString() string {
  return s.String()
}

func (s *VnoBatchRefundOrderResponse) SetRequestId(v string) *VnoBatchRefundOrderResponse {
  s.RequestId = &v
  return s
}

func (s *VnoBatchRefundOrderResponse) SetSuccess(v bool) *VnoBatchRefundOrderResponse {
  s.Success = &v
  return s
}

func (s *VnoBatchRefundOrderResponse) SetCode(v string) *VnoBatchRefundOrderResponse {
  s.Code = &v
  return s
}

func (s *VnoBatchRefundOrderResponse) SetMessage(v string) *VnoBatchRefundOrderResponse {
  s.Message = &v
  return s
}

func (s *VnoBatchRefundOrderResponse) SetData(v string) *VnoBatchRefundOrderResponse {
  s.Data = &v
  return s
}

type SubscriptionCreateOrderApiRequest struct {
  OwnerId *string `json:"ownerId" xml:"ownerId" require:"true"`
  ProductCode *string `json:"productCode" xml:"productCode" require:"true"`
}

func (s SubscriptionCreateOrderApiRequest) String() string {
  return tea.Prettify(s)
}

func (s SubscriptionCreateOrderApiRequest) GoString() string {
  return s.String()
}

func (s *SubscriptionCreateOrderApiRequest) SetOwnerId(v string) *SubscriptionCreateOrderApiRequest {
  s.OwnerId = &v
  return s
}

func (s *SubscriptionCreateOrderApiRequest) SetProductCode(v string) *SubscriptionCreateOrderApiRequest {
  s.ProductCode = &v
  return s
}

type SubscriptionCreateOrderApiResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Success *bool `json:"Success" xml:"Success" require:"true"`
  Code *string `json:"Code" xml:"Code" require:"true"`
  Message *string `json:"Message" xml:"Message" require:"true"`
  Data *string `json:"Data" xml:"Data" require:"true"`
}

func (s SubscriptionCreateOrderApiResponse) String() string {
  return tea.Prettify(s)
}

func (s SubscriptionCreateOrderApiResponse) GoString() string {
  return s.String()
}

func (s *SubscriptionCreateOrderApiResponse) SetRequestId(v string) *SubscriptionCreateOrderApiResponse {
  s.RequestId = &v
  return s
}

func (s *SubscriptionCreateOrderApiResponse) SetSuccess(v bool) *SubscriptionCreateOrderApiResponse {
  s.Success = &v
  return s
}

func (s *SubscriptionCreateOrderApiResponse) SetCode(v string) *SubscriptionCreateOrderApiResponse {
  s.Code = &v
  return s
}

func (s *SubscriptionCreateOrderApiResponse) SetMessage(v string) *SubscriptionCreateOrderApiResponse {
  s.Message = &v
  return s
}

func (s *SubscriptionCreateOrderApiResponse) SetData(v string) *SubscriptionCreateOrderApiResponse {
  s.Data = &v
  return s
}

type SetResourceBusinessStatusRequest struct {
  AccessKeyId *string `json:"AccessKeyId" xml:"AccessKeyId"`
  OwnerId *int64 `json:"OwnerId" xml:"OwnerId"`
  ResourceOwnerAccount *string `json:"ResourceOwnerAccount" xml:"ResourceOwnerAccount"`
  ResourceOwnerId *int64 `json:"ResourceOwnerId" xml:"ResourceOwnerId"`
  ResourceType *string `json:"ResourceType" xml:"ResourceType" require:"true"`
  ResourceId *string `json:"ResourceId" xml:"ResourceId" require:"true"`
  BusinessStatus *string `json:"BusinessStatus" xml:"BusinessStatus" require:"true"`
  OwnerAccount *string `json:"OwnerAccount" xml:"OwnerAccount"`
}

func (s SetResourceBusinessStatusRequest) String() string {
  return tea.Prettify(s)
}

func (s SetResourceBusinessStatusRequest) GoString() string {
  return s.String()
}

func (s *SetResourceBusinessStatusRequest) SetAccessKeyId(v string) *SetResourceBusinessStatusRequest {
  s.AccessKeyId = &v
  return s
}

func (s *SetResourceBusinessStatusRequest) SetOwnerId(v int64) *SetResourceBusinessStatusRequest {
  s.OwnerId = &v
  return s
}

func (s *SetResourceBusinessStatusRequest) SetResourceOwnerAccount(v string) *SetResourceBusinessStatusRequest {
  s.ResourceOwnerAccount = &v
  return s
}

func (s *SetResourceBusinessStatusRequest) SetResourceOwnerId(v int64) *SetResourceBusinessStatusRequest {
  s.ResourceOwnerId = &v
  return s
}

func (s *SetResourceBusinessStatusRequest) SetResourceType(v string) *SetResourceBusinessStatusRequest {
  s.ResourceType = &v
  return s
}

func (s *SetResourceBusinessStatusRequest) SetResourceId(v string) *SetResourceBusinessStatusRequest {
  s.ResourceId = &v
  return s
}

func (s *SetResourceBusinessStatusRequest) SetBusinessStatus(v string) *SetResourceBusinessStatusRequest {
  s.BusinessStatus = &v
  return s
}

func (s *SetResourceBusinessStatusRequest) SetOwnerAccount(v string) *SetResourceBusinessStatusRequest {
  s.OwnerAccount = &v
  return s
}

type SetResourceBusinessStatusResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
}

func (s SetResourceBusinessStatusResponse) String() string {
  return tea.Prettify(s)
}

func (s SetResourceBusinessStatusResponse) GoString() string {
  return s.String()
}

func (s *SetResourceBusinessStatusResponse) SetRequestId(v string) *SetResourceBusinessStatusResponse {
  s.RequestId = &v
  return s
}

type DescribeCouponListRequest struct {
  Status *string `json:"Status" xml:"Status"`
  StartDeliveryTime *string `json:"StartDeliveryTime" xml:"StartDeliveryTime"`
  EndDeliveryTime *string `json:"EndDeliveryTime" xml:"EndDeliveryTime"`
  PageSize *int `json:"PageSize" xml:"PageSize"`
  PageNum *int `json:"PageNum" xml:"PageNum"`
}

func (s DescribeCouponListRequest) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponListRequest) GoString() string {
  return s.String()
}

func (s *DescribeCouponListRequest) SetStatus(v string) *DescribeCouponListRequest {
  s.Status = &v
  return s
}

func (s *DescribeCouponListRequest) SetStartDeliveryTime(v string) *DescribeCouponListRequest {
  s.StartDeliveryTime = &v
  return s
}

func (s *DescribeCouponListRequest) SetEndDeliveryTime(v string) *DescribeCouponListRequest {
  s.EndDeliveryTime = &v
  return s
}

func (s *DescribeCouponListRequest) SetPageSize(v int) *DescribeCouponListRequest {
  s.PageSize = &v
  return s
}

func (s *DescribeCouponListRequest) SetPageNum(v int) *DescribeCouponListRequest {
  s.PageNum = &v
  return s
}

type DescribeCouponListResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  Coupons []*DescribeCouponListResponseCoupons `json:"Coupons" xml:"Coupons" require:"true" type:"Repeated"`
}

func (s DescribeCouponListResponse) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponListResponse) GoString() string {
  return s.String()
}

func (s *DescribeCouponListResponse) SetRequestId(v string) *DescribeCouponListResponse {
  s.RequestId = &v
  return s
}

func (s *DescribeCouponListResponse) SetCoupons(v []*DescribeCouponListResponseCoupons) *DescribeCouponListResponse {
  s.Coupons = v
  return s
}

type DescribeCouponListResponseCoupons struct     {
  CouponTemplateId *int64 `json:"CouponTemplateId" xml:"CouponTemplateId" require:"true"`
  TotalAmount *string `json:"TotalAmount" xml:"TotalAmount" require:"true"`
  BalanceAmount *string `json:"BalanceAmount" xml:"BalanceAmount" require:"true"`
  FrozenAmount *string `json:"FrozenAmount" xml:"FrozenAmount" require:"true"`
  ExpiredAmount *string `json:"ExpiredAmount" xml:"ExpiredAmount" require:"true"`
  DeliveryTime *string `json:"DeliveryTime" xml:"DeliveryTime" require:"true"`
  ExpiredTime *string `json:"ExpiredTime" xml:"ExpiredTime" require:"true"`
  CouponNumber *string `json:"CouponNumber" xml:"CouponNumber" require:"true"`
  Status *string `json:"Status" xml:"Status" require:"true"`
  Description *string `json:"Description" xml:"Description" require:"true"`
  CreationTime *string `json:"CreationTime" xml:"CreationTime" require:"true"`
  ModificationTime *string `json:"ModificationTime" xml:"ModificationTime" require:"true"`
  PriceLimit *string `json:"PriceLimit" xml:"PriceLimit" require:"true"`
  Application *string `json:"Application" xml:"Application" require:"true"`
  ProductCodes *DescribeCouponListResponseCouponsProductCodes `json:"ProductCodes" xml:"ProductCodes" require:"true" type:"Struct"`
  TradeTypes *DescribeCouponListResponseCouponsTradeTypes `json:"TradeTypes" xml:"TradeTypes" require:"true" type:"Struct"`
}

func (s DescribeCouponListResponseCoupons) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponListResponseCoupons) GoString() string {
  return s.String()
}

func (s *DescribeCouponListResponseCoupons) SetCouponTemplateId(v int64) *DescribeCouponListResponseCoupons {
  s.CouponTemplateId = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetTotalAmount(v string) *DescribeCouponListResponseCoupons {
  s.TotalAmount = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetBalanceAmount(v string) *DescribeCouponListResponseCoupons {
  s.BalanceAmount = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetFrozenAmount(v string) *DescribeCouponListResponseCoupons {
  s.FrozenAmount = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetExpiredAmount(v string) *DescribeCouponListResponseCoupons {
  s.ExpiredAmount = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetDeliveryTime(v string) *DescribeCouponListResponseCoupons {
  s.DeliveryTime = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetExpiredTime(v string) *DescribeCouponListResponseCoupons {
  s.ExpiredTime = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetCouponNumber(v string) *DescribeCouponListResponseCoupons {
  s.CouponNumber = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetStatus(v string) *DescribeCouponListResponseCoupons {
  s.Status = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetDescription(v string) *DescribeCouponListResponseCoupons {
  s.Description = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetCreationTime(v string) *DescribeCouponListResponseCoupons {
  s.CreationTime = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetModificationTime(v string) *DescribeCouponListResponseCoupons {
  s.ModificationTime = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetPriceLimit(v string) *DescribeCouponListResponseCoupons {
  s.PriceLimit = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetApplication(v string) *DescribeCouponListResponseCoupons {
  s.Application = &v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetProductCodes(v *DescribeCouponListResponseCouponsProductCodes) *DescribeCouponListResponseCoupons {
  s.ProductCodes = v
  return s
}

func (s *DescribeCouponListResponseCoupons) SetTradeTypes(v *DescribeCouponListResponseCouponsTradeTypes) *DescribeCouponListResponseCoupons {
  s.TradeTypes = v
  return s
}

type DescribeCouponListResponseCouponsProductCodes struct {
  ProductCode []*string `json:"ProductCode" xml:"ProductCode" require:"true" type:"Repeated"`
}

func (s DescribeCouponListResponseCouponsProductCodes) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponListResponseCouponsProductCodes) GoString() string {
  return s.String()
}

func (s *DescribeCouponListResponseCouponsProductCodes) SetProductCode(v []*string) *DescribeCouponListResponseCouponsProductCodes {
  s.ProductCode = v
  return s
}

type DescribeCouponListResponseCouponsTradeTypes struct {
  TradeType []*string `json:"TradeType" xml:"TradeType" require:"true" type:"Repeated"`
}

func (s DescribeCouponListResponseCouponsTradeTypes) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponListResponseCouponsTradeTypes) GoString() string {
  return s.String()
}

func (s *DescribeCouponListResponseCouponsTradeTypes) SetTradeType(v []*string) *DescribeCouponListResponseCouponsTradeTypes {
  s.TradeType = v
  return s
}

type DescribeCouponDetailRequest struct {
  CouponNumber *string `json:"CouponNumber" xml:"CouponNumber"`
}

func (s DescribeCouponDetailRequest) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponDetailRequest) GoString() string {
  return s.String()
}

func (s *DescribeCouponDetailRequest) SetCouponNumber(v string) *DescribeCouponDetailRequest {
  s.CouponNumber = &v
  return s
}

type DescribeCouponDetailResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  CouponTemplateId *int64 `json:"CouponTemplateId" xml:"CouponTemplateId" require:"true"`
  TotalAmount *string `json:"TotalAmount" xml:"TotalAmount" require:"true"`
  BalanceAmount *string `json:"BalanceAmount" xml:"BalanceAmount" require:"true"`
  FrozenAmount *string `json:"FrozenAmount" xml:"FrozenAmount" require:"true"`
  ExpiredAmount *string `json:"ExpiredAmount" xml:"ExpiredAmount" require:"true"`
  DeliveryTime *string `json:"DeliveryTime" xml:"DeliveryTime" require:"true"`
  ExpiredTime *string `json:"ExpiredTime" xml:"ExpiredTime" require:"true"`
  CouponNumber *string `json:"CouponNumber" xml:"CouponNumber" require:"true"`
  Status *string `json:"Status" xml:"Status" require:"true"`
  Description *string `json:"Description" xml:"Description" require:"true"`
  CreationTime *string `json:"CreationTime" xml:"CreationTime" require:"true"`
  ModificationTime *string `json:"ModificationTime" xml:"ModificationTime" require:"true"`
  PriceLimit *string `json:"PriceLimit" xml:"PriceLimit" require:"true"`
  Application *string `json:"Application" xml:"Application" require:"true"`
  ProductCodes *DescribeCouponDetailResponseProductCodes `json:"ProductCodes" xml:"ProductCodes" require:"true" type:"Struct"`
  TradeTypes *DescribeCouponDetailResponseTradeTypes `json:"TradeTypes" xml:"TradeTypes" require:"true" type:"Struct"`
}

func (s DescribeCouponDetailResponse) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponDetailResponse) GoString() string {
  return s.String()
}

func (s *DescribeCouponDetailResponse) SetRequestId(v string) *DescribeCouponDetailResponse {
  s.RequestId = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetCouponTemplateId(v int64) *DescribeCouponDetailResponse {
  s.CouponTemplateId = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetTotalAmount(v string) *DescribeCouponDetailResponse {
  s.TotalAmount = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetBalanceAmount(v string) *DescribeCouponDetailResponse {
  s.BalanceAmount = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetFrozenAmount(v string) *DescribeCouponDetailResponse {
  s.FrozenAmount = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetExpiredAmount(v string) *DescribeCouponDetailResponse {
  s.ExpiredAmount = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetDeliveryTime(v string) *DescribeCouponDetailResponse {
  s.DeliveryTime = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetExpiredTime(v string) *DescribeCouponDetailResponse {
  s.ExpiredTime = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetCouponNumber(v string) *DescribeCouponDetailResponse {
  s.CouponNumber = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetStatus(v string) *DescribeCouponDetailResponse {
  s.Status = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetDescription(v string) *DescribeCouponDetailResponse {
  s.Description = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetCreationTime(v string) *DescribeCouponDetailResponse {
  s.CreationTime = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetModificationTime(v string) *DescribeCouponDetailResponse {
  s.ModificationTime = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetPriceLimit(v string) *DescribeCouponDetailResponse {
  s.PriceLimit = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetApplication(v string) *DescribeCouponDetailResponse {
  s.Application = &v
  return s
}

func (s *DescribeCouponDetailResponse) SetProductCodes(v *DescribeCouponDetailResponseProductCodes) *DescribeCouponDetailResponse {
  s.ProductCodes = v
  return s
}

func (s *DescribeCouponDetailResponse) SetTradeTypes(v *DescribeCouponDetailResponseTradeTypes) *DescribeCouponDetailResponse {
  s.TradeTypes = v
  return s
}

type DescribeCouponDetailResponseProductCodes struct {
  ProductCode []*string `json:"ProductCode" xml:"ProductCode" require:"true" type:"Repeated"`
}

func (s DescribeCouponDetailResponseProductCodes) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponDetailResponseProductCodes) GoString() string {
  return s.String()
}

func (s *DescribeCouponDetailResponseProductCodes) SetProductCode(v []*string) *DescribeCouponDetailResponseProductCodes {
  s.ProductCode = v
  return s
}

type DescribeCouponDetailResponseTradeTypes struct {
  TradeType []*string `json:"TradeType" xml:"TradeType" require:"true" type:"Repeated"`
}

func (s DescribeCouponDetailResponseTradeTypes) String() string {
  return tea.Prettify(s)
}

func (s DescribeCouponDetailResponseTradeTypes) GoString() string {
  return s.String()
}

func (s *DescribeCouponDetailResponseTradeTypes) SetTradeType(v []*string) *DescribeCouponDetailResponseTradeTypes {
  s.TradeType = v
  return s
}

type DescribeCashDetailRequest struct {
}

func (s DescribeCashDetailRequest) String() string {
  return tea.Prettify(s)
}

func (s DescribeCashDetailRequest) GoString() string {
  return s.String()
}

type DescribeCashDetailResponse struct {
  RequestId *string `json:"RequestId" xml:"RequestId" require:"true"`
  BalanceAmount *string `json:"BalanceAmount" xml:"BalanceAmount" require:"true"`
  AmountOwed *string `json:"AmountOwed" xml:"AmountOwed" require:"true"`
  EnableThresholdAlert *string `json:"EnableThresholdAlert" xml:"EnableThresholdAlert" require:"true"`
  MiniAlertThreshold *int64 `json:"MiniAlertThreshold" xml:"MiniAlertThreshold" require:"true"`
  FrozenAmount *string `json:"FrozenAmount" xml:"FrozenAmount" require:"true"`
  CreditCardAmount *string `json:"CreditCardAmount" xml:"CreditCardAmount" require:"true"`
  RemmitanceAmount *string `json:"RemmitanceAmount" xml:"RemmitanceAmount" require:"true"`
  CreditLimit *string `json:"CreditLimit" xml:"CreditLimit" require:"true"`
  AvailableCredit *string `json:"AvailableCredit" xml:"AvailableCredit" require:"true"`
}

func (s DescribeCashDetailResponse) String() string {
  return tea.Prettify(s)
}

func (s DescribeCashDetailResponse) GoString() string {
  return s.String()
}

func (s *DescribeCashDetailResponse) SetRequestId(v string) *DescribeCashDetailResponse {
  s.RequestId = &v
  return s
}

func (s *DescribeCashDetailResponse) SetBalanceAmount(v string) *DescribeCashDetailResponse {
  s.BalanceAmount = &v
  return s
}

func (s *DescribeCashDetailResponse) SetAmountOwed(v string) *DescribeCashDetailResponse {
  s.AmountOwed = &v
  return s
}

func (s *DescribeCashDetailResponse) SetEnableThresholdAlert(v string) *DescribeCashDetailResponse {
  s.EnableThresholdAlert = &v
  return s
}

func (s *DescribeCashDetailResponse) SetMiniAlertThreshold(v int64) *DescribeCashDetailResponse {
  s.MiniAlertThreshold = &v
  return s
}

func (s *DescribeCashDetailResponse) SetFrozenAmount(v string) *DescribeCashDetailResponse {
  s.FrozenAmount = &v
  return s
}

func (s *DescribeCashDetailResponse) SetCreditCardAmount(v string) *DescribeCashDetailResponse {
  s.CreditCardAmount = &v
  return s
}

func (s *DescribeCashDetailResponse) SetRemmitanceAmount(v string) *DescribeCashDetailResponse {
  s.RemmitanceAmount = &v
  return s
}

func (s *DescribeCashDetailResponse) SetCreditLimit(v string) *DescribeCashDetailResponse {
  s.CreditLimit = &v
  return s
}

func (s *DescribeCashDetailResponse) SetAvailableCredit(v string) *DescribeCashDetailResponse {
  s.AvailableCredit = &v
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
  client.EndpointRule = tea.String("")
  _err = client.CheckConfig(config)
  if _err != nil {
    return _err
  }
  client.Endpoint, _err = client.GetEndpoint(client.ProductId, client.RegionId, client.EndpointRule, client.Network, client.Suffix, client.EndpointMap, client.Endpoint)
  if _err != nil {
    return _err
  }

  return nil
}



func (client *Client) OpenCallbackEx (request *OpenCallbackRequest, runtime *util.RuntimeOptions) (_result *OpenCallbackResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &OpenCallbackResponse{}
  _body, _err := client.DoRequest(tea.String("OpenCallback"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) OpenCallback (request *OpenCallbackRequest) (_result *OpenCallbackResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &OpenCallbackResponse{}
  _body, _err := client.OpenCallbackEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) QueryForCssOrderEx (request *QueryForCssOrderRequest, runtime *util.RuntimeOptions) (_result *QueryForCssOrderResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &QueryForCssOrderResponse{}
  _body, _err := client.DoRequest(tea.String("QueryForCssOrder"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) QueryForCssOrder (request *QueryForCssOrderRequest) (_result *QueryForCssOrderResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &QueryForCssOrderResponse{}
  _body, _err := client.QueryForCssOrderEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) CreateOrderEx (request *CreateOrderRequest, runtime *util.RuntimeOptions) (_result *CreateOrderResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &CreateOrderResponse{}
  _body, _err := client.DoRequest(tea.String("CreateOrder"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) CreateOrder (request *CreateOrderRequest) (_result *CreateOrderResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &CreateOrderResponse{}
  _body, _err := client.CreateOrderEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) VnoPayCallBackNotifyEx (request *vnoPayCallBackNotifyRequest, runtime *util.RuntimeOptions) (_result *vnoPayCallBackNotifyResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &vnoPayCallBackNotifyResponse{}
  _body, _err := client.DoRequest(tea.String("vnoPayCallBackNotify"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) VnoPayCallBackNotify (request *vnoPayCallBackNotifyRequest) (_result *vnoPayCallBackNotifyResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &vnoPayCallBackNotifyResponse{}
  _body, _err := client.VnoPayCallBackNotifyEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) VnoBatchRefundOrderEx (request *vnoBatchRefundOrderRequest, runtime *util.RuntimeOptions) (_result *vnoBatchRefundOrderResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &vnoBatchRefundOrderResponse{}
  _body, _err := client.DoRequest(tea.String("vnoBatchRefundOrder"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) VnoBatchRefundOrder (request *vnoBatchRefundOrderRequest) (_result *vnoBatchRefundOrderResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &vnoBatchRefundOrderResponse{}
  _body, _err := client.VnoBatchRefundOrderEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) SubscriptionCreateOrderApiEx (request *SubscriptionCreateOrderApiRequest, runtime *util.RuntimeOptions) (_result *SubscriptionCreateOrderApiResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &SubscriptionCreateOrderApiResponse{}
  _body, _err := client.DoRequest(tea.String("SubscriptionCreateOrderApi"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) SubscriptionCreateOrderApi (request *SubscriptionCreateOrderApiRequest) (_result *SubscriptionCreateOrderApiResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &SubscriptionCreateOrderApiResponse{}
  _body, _err := client.SubscriptionCreateOrderApiEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) SetResourceBusinessStatusEx (request *SetResourceBusinessStatusRequest, runtime *util.RuntimeOptions) (_result *SetResourceBusinessStatusResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &SetResourceBusinessStatusResponse{}
  _body, _err := client.DoRequest(tea.String("SetResourceBusinessStatus"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) SetResourceBusinessStatus (request *SetResourceBusinessStatusRequest) (_result *SetResourceBusinessStatusResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &SetResourceBusinessStatusResponse{}
  _body, _err := client.SetResourceBusinessStatusEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) DescribeCouponListEx (request *DescribeCouponListRequest, runtime *util.RuntimeOptions) (_result *DescribeCouponListResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &DescribeCouponListResponse{}
  _body, _err := client.DoRequest(tea.String("DescribeCouponList"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) DescribeCouponList (request *DescribeCouponListRequest) (_result *DescribeCouponListResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &DescribeCouponListResponse{}
  _body, _err := client.DescribeCouponListEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) DescribeCouponDetailEx (request *DescribeCouponDetailRequest, runtime *util.RuntimeOptions) (_result *DescribeCouponDetailResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &DescribeCouponDetailResponse{}
  _body, _err := client.DoRequest(tea.String("DescribeCouponDetail"), tea.String("HTTPS"), tea.String("GET"), tea.String("2014-07-14"), tea.String("AK"), tea.ToMap(request), nil, runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) DescribeCouponDetail (request *DescribeCouponDetailRequest) (_result *DescribeCouponDetailResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &DescribeCouponDetailResponse{}
  _body, _err := client.DescribeCouponDetailEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) DescribeCashDetailEx (request *DescribeCashDetailRequest, runtime *util.RuntimeOptions) (_result *DescribeCashDetailResponse, _err error) {
  _err = util.ValidateModel(request)
  if _err != nil {
    return _result, _err
  }
  _result = &DescribeCashDetailResponse{}
  _body, _err := client.DoRequest(tea.String("DescribeCashDetail"), tea.String("HTTPS"), tea.String("POST"), tea.String("2014-07-14"), tea.String("AK"), nil, tea.ToMap(request), runtime)
  if _err != nil {
    return _result, _err
  }
  _err = tea.Convert(_body, &_result)
  return _result, _err
}

func (client *Client) DescribeCashDetail (request *DescribeCashDetailRequest) (_result *DescribeCashDetailResponse, _err error) {
  runtime := &util.RuntimeOptions{}
  _result = &DescribeCashDetailResponse{}
  _body, _err := client.DescribeCashDetailEx(request, runtime)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

func (client *Client) GetEndpoint (productId *string, regionId *string, endpointRule *string, network *string, suffix *string, endpointMap map[string]*string, endpoint *string) (_result *string, _err error) {
  if !tea.BoolValue(util.Empty(endpoint)) {
    _result = endpoint
    return _result , _err
  }

  if !tea.BoolValue(util.IsUnset(endpointMap)) && !tea.BoolValue(util.Empty(endpointMap[tea.StringValue(regionId)])) {
    _result = endpointMap[tea.StringValue(regionId)]
    return _result, _err
  }

  _body, _err := endpointutil.GetEndpointRules(productId, regionId, endpointRule, network, suffix)
  if _err != nil {
    return _result, _err
  }
  _result = _body
  return _result, _err
}

