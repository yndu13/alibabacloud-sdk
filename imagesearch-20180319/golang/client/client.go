// This file is auto-generated, don't edit it. Thanks.
package client

import (
	endpointutil "github.com/alibabacloud-go/endpoint-util/service"
	roa "github.com/alibabacloud-go/tea-roa/client"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
)

type SearchItemQuery struct {
	InstanceName *string `json:"instanceName,omitempty" xml:"instanceName,omitempty" require:"true"`
}

func (s SearchItemQuery) String() string {
	return tea.Prettify(s)
}

func (s SearchItemQuery) GoString() string {
	return s.String()
}

func (s *SearchItemQuery) SetInstanceName(v string) *SearchItemQuery {
	s.InstanceName = &v
	return s
}

type SearchItemRequest struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty"`
	Query   *SearchItemQuery   `json:"query,omitempty" xml:"query,omitempty" require:"true"`
}

func (s SearchItemRequest) String() string {
	return tea.Prettify(s)
}

func (s SearchItemRequest) GoString() string {
	return s.String()
}

func (s *SearchItemRequest) SetHeaders(v map[string]*string) *SearchItemRequest {
	s.Headers = v
	return s
}

func (s *SearchItemRequest) SetQuery(v *SearchItemQuery) *SearchItemRequest {
	s.Query = v
	return s
}

type SearchItemResponseBody struct {
	RequestId *string                         `json:"RequestId,omitempty" xml:"RequestId,omitempty" require:"true"`
	Success   *bool                           `json:"Success,omitempty" xml:"Success,omitempty" require:"true"`
	Message   *string                         `json:"Message,omitempty" xml:"Message,omitempty" require:"true"`
	Code      *int                            `json:"Code,omitempty" xml:"Code,omitempty" require:"true"`
	Auctions  *SearchItemResponseBodyAuctions `json:"Auctions,omitempty" xml:"Auctions,omitempty" require:"true" type:"Struct"`
	Head      *SearchItemResponseBodyHead     `json:"Head,omitempty" xml:"Head,omitempty" require:"true" type:"Struct"`
	PicInfo   *SearchItemResponseBodyPicInfo  `json:"PicInfo,omitempty" xml:"PicInfo,omitempty" require:"true" type:"Struct"`
}

func (s SearchItemResponseBody) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponseBody) GoString() string {
	return s.String()
}

func (s *SearchItemResponseBody) SetRequestId(v string) *SearchItemResponseBody {
	s.RequestId = &v
	return s
}

func (s *SearchItemResponseBody) SetSuccess(v bool) *SearchItemResponseBody {
	s.Success = &v
	return s
}

func (s *SearchItemResponseBody) SetMessage(v string) *SearchItemResponseBody {
	s.Message = &v
	return s
}

func (s *SearchItemResponseBody) SetCode(v int) *SearchItemResponseBody {
	s.Code = &v
	return s
}

func (s *SearchItemResponseBody) SetAuctions(v *SearchItemResponseBodyAuctions) *SearchItemResponseBody {
	s.Auctions = v
	return s
}

func (s *SearchItemResponseBody) SetHead(v *SearchItemResponseBodyHead) *SearchItemResponseBody {
	s.Head = v
	return s
}

func (s *SearchItemResponseBody) SetPicInfo(v *SearchItemResponseBodyPicInfo) *SearchItemResponseBody {
	s.PicInfo = v
	return s
}

type SearchItemResponseBodyAuctions struct {
	Auction []*SearchItemResponseBodyAuctionsAuction `json:"Auction,omitempty" xml:"Auction,omitempty" require:"true" type:"Repeated"`
}

func (s SearchItemResponseBodyAuctions) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponseBodyAuctions) GoString() string {
	return s.String()
}

func (s *SearchItemResponseBodyAuctions) SetAuction(v []*SearchItemResponseBodyAuctionsAuction) *SearchItemResponseBodyAuctions {
	s.Auction = v
	return s
}

type SearchItemResponseBodyAuctionsAuction struct {
	CustContent    *string `json:"CustContent,omitempty" xml:"CustContent,omitempty" require:"true"`
	ItemId         *string `json:"ItemId,omitempty" xml:"ItemId,omitempty" require:"true"`
	SortExprValues *string `json:"SortExprValues,omitempty" xml:"SortExprValues,omitempty" require:"true"`
	CatId          *string `json:"CatId,omitempty" xml:"CatId,omitempty" require:"true"`
	PicName        *string `json:"PicName,omitempty" xml:"PicName,omitempty" require:"true"`
}

func (s SearchItemResponseBodyAuctionsAuction) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponseBodyAuctionsAuction) GoString() string {
	return s.String()
}

func (s *SearchItemResponseBodyAuctionsAuction) SetCustContent(v string) *SearchItemResponseBodyAuctionsAuction {
	s.CustContent = &v
	return s
}

func (s *SearchItemResponseBodyAuctionsAuction) SetItemId(v string) *SearchItemResponseBodyAuctionsAuction {
	s.ItemId = &v
	return s
}

func (s *SearchItemResponseBodyAuctionsAuction) SetSortExprValues(v string) *SearchItemResponseBodyAuctionsAuction {
	s.SortExprValues = &v
	return s
}

func (s *SearchItemResponseBodyAuctionsAuction) SetCatId(v string) *SearchItemResponseBodyAuctionsAuction {
	s.CatId = &v
	return s
}

func (s *SearchItemResponseBodyAuctionsAuction) SetPicName(v string) *SearchItemResponseBodyAuctionsAuction {
	s.PicName = &v
	return s
}

type SearchItemResponseBodyHead struct {
	SearchTime *int `json:"SearchTime,omitempty" xml:"SearchTime,omitempty" require:"true"`
	DocsFound  *int `json:"DocsFound,omitempty" xml:"DocsFound,omitempty" require:"true"`
	DocsReturn *int `json:"DocsReturn,omitempty" xml:"DocsReturn,omitempty" require:"true"`
}

func (s SearchItemResponseBodyHead) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponseBodyHead) GoString() string {
	return s.String()
}

func (s *SearchItemResponseBodyHead) SetSearchTime(v int) *SearchItemResponseBodyHead {
	s.SearchTime = &v
	return s
}

func (s *SearchItemResponseBodyHead) SetDocsFound(v int) *SearchItemResponseBodyHead {
	s.DocsFound = &v
	return s
}

func (s *SearchItemResponseBodyHead) SetDocsReturn(v int) *SearchItemResponseBodyHead {
	s.DocsReturn = &v
	return s
}

type SearchItemResponseBodyPicInfo struct {
	Category    *string                                   `json:"Category,omitempty" xml:"Category,omitempty" require:"true"`
	Region      *string                                   `json:"Region,omitempty" xml:"Region,omitempty" require:"true"`
	AllCategory *SearchItemResponseBodyPicInfoAllCategory `json:"AllCategory,omitempty" xml:"AllCategory,omitempty" require:"true" type:"Struct"`
}

func (s SearchItemResponseBodyPicInfo) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponseBodyPicInfo) GoString() string {
	return s.String()
}

func (s *SearchItemResponseBodyPicInfo) SetCategory(v string) *SearchItemResponseBodyPicInfo {
	s.Category = &v
	return s
}

func (s *SearchItemResponseBodyPicInfo) SetRegion(v string) *SearchItemResponseBodyPicInfo {
	s.Region = &v
	return s
}

func (s *SearchItemResponseBodyPicInfo) SetAllCategory(v *SearchItemResponseBodyPicInfoAllCategory) *SearchItemResponseBodyPicInfo {
	s.AllCategory = v
	return s
}

type SearchItemResponseBodyPicInfoAllCategory struct {
	Category []*SearchItemResponseBodyPicInfoAllCategoryCategory `json:"Category,omitempty" xml:"Category,omitempty" require:"true" type:"Repeated"`
}

func (s SearchItemResponseBodyPicInfoAllCategory) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponseBodyPicInfoAllCategory) GoString() string {
	return s.String()
}

func (s *SearchItemResponseBodyPicInfoAllCategory) SetCategory(v []*SearchItemResponseBodyPicInfoAllCategoryCategory) *SearchItemResponseBodyPicInfoAllCategory {
	s.Category = v
	return s
}

type SearchItemResponseBodyPicInfoAllCategoryCategory struct {
	Name *string `json:"Name,omitempty" xml:"Name,omitempty" require:"true"`
	Id   *string `json:"Id,omitempty" xml:"Id,omitempty" require:"true"`
}

func (s SearchItemResponseBodyPicInfoAllCategoryCategory) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponseBodyPicInfoAllCategoryCategory) GoString() string {
	return s.String()
}

func (s *SearchItemResponseBodyPicInfoAllCategoryCategory) SetName(v string) *SearchItemResponseBodyPicInfoAllCategoryCategory {
	s.Name = &v
	return s
}

func (s *SearchItemResponseBodyPicInfoAllCategoryCategory) SetId(v string) *SearchItemResponseBodyPicInfoAllCategoryCategory {
	s.Id = &v
	return s
}

type SearchItemResponse struct {
	Headers map[string]*string      `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *SearchItemResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s SearchItemResponse) String() string {
	return tea.Prettify(s)
}

func (s SearchItemResponse) GoString() string {
	return s.String()
}

func (s *SearchItemResponse) SetHeaders(v map[string]*string) *SearchItemResponse {
	s.Headers = v
	return s
}

func (s *SearchItemResponse) SetBody(v *SearchItemResponseBody) *SearchItemResponse {
	s.Body = v
	return s
}

type DeleteItemQuery struct {
	InstanceName *string `json:"instanceName,omitempty" xml:"instanceName,omitempty" require:"true"`
}

func (s DeleteItemQuery) String() string {
	return tea.Prettify(s)
}

func (s DeleteItemQuery) GoString() string {
	return s.String()
}

func (s *DeleteItemQuery) SetInstanceName(v string) *DeleteItemQuery {
	s.InstanceName = &v
	return s
}

type DeleteItemRequest struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty"`
	Query   *DeleteItemQuery   `json:"query,omitempty" xml:"query,omitempty" require:"true"`
}

func (s DeleteItemRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteItemRequest) GoString() string {
	return s.String()
}

func (s *DeleteItemRequest) SetHeaders(v map[string]*string) *DeleteItemRequest {
	s.Headers = v
	return s
}

func (s *DeleteItemRequest) SetQuery(v *DeleteItemQuery) *DeleteItemRequest {
	s.Query = v
	return s
}

type DeleteItemResponseBody struct {
	RequestId *string `json:"RequestId,omitempty" xml:"RequestId,omitempty" require:"true"`
	Success   *bool   `json:"Success,omitempty" xml:"Success,omitempty" require:"true"`
	Message   *string `json:"Message,omitempty" xml:"Message,omitempty" require:"true"`
	Code      *int    `json:"Code,omitempty" xml:"Code,omitempty" require:"true"`
}

func (s DeleteItemResponseBody) String() string {
	return tea.Prettify(s)
}

func (s DeleteItemResponseBody) GoString() string {
	return s.String()
}

func (s *DeleteItemResponseBody) SetRequestId(v string) *DeleteItemResponseBody {
	s.RequestId = &v
	return s
}

func (s *DeleteItemResponseBody) SetSuccess(v bool) *DeleteItemResponseBody {
	s.Success = &v
	return s
}

func (s *DeleteItemResponseBody) SetMessage(v string) *DeleteItemResponseBody {
	s.Message = &v
	return s
}

func (s *DeleteItemResponseBody) SetCode(v int) *DeleteItemResponseBody {
	s.Code = &v
	return s
}

type DeleteItemResponse struct {
	Headers map[string]*string      `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *DeleteItemResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s DeleteItemResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteItemResponse) GoString() string {
	return s.String()
}

func (s *DeleteItemResponse) SetHeaders(v map[string]*string) *DeleteItemResponse {
	s.Headers = v
	return s
}

func (s *DeleteItemResponse) SetBody(v *DeleteItemResponseBody) *DeleteItemResponse {
	s.Body = v
	return s
}

type AddItemQuery struct {
	InstanceName *string `json:"instanceName,omitempty" xml:"instanceName,omitempty" require:"true"`
}

func (s AddItemQuery) String() string {
	return tea.Prettify(s)
}

func (s AddItemQuery) GoString() string {
	return s.String()
}

func (s *AddItemQuery) SetInstanceName(v string) *AddItemQuery {
	s.InstanceName = &v
	return s
}

type AddItemRequest struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty"`
	Query   *AddItemQuery      `json:"query,omitempty" xml:"query,omitempty" require:"true"`
}

func (s AddItemRequest) String() string {
	return tea.Prettify(s)
}

func (s AddItemRequest) GoString() string {
	return s.String()
}

func (s *AddItemRequest) SetHeaders(v map[string]*string) *AddItemRequest {
	s.Headers = v
	return s
}

func (s *AddItemRequest) SetQuery(v *AddItemQuery) *AddItemRequest {
	s.Query = v
	return s
}

type AddItemResponseBody struct {
	RequestId *string `json:"RequestId,omitempty" xml:"RequestId,omitempty" require:"true"`
	Success   *bool   `json:"Success,omitempty" xml:"Success,omitempty" require:"true"`
	Message   *string `json:"Message,omitempty" xml:"Message,omitempty" require:"true"`
	Code      *int    `json:"Code,omitempty" xml:"Code,omitempty" require:"true"`
}

func (s AddItemResponseBody) String() string {
	return tea.Prettify(s)
}

func (s AddItemResponseBody) GoString() string {
	return s.String()
}

func (s *AddItemResponseBody) SetRequestId(v string) *AddItemResponseBody {
	s.RequestId = &v
	return s
}

func (s *AddItemResponseBody) SetSuccess(v bool) *AddItemResponseBody {
	s.Success = &v
	return s
}

func (s *AddItemResponseBody) SetMessage(v string) *AddItemResponseBody {
	s.Message = &v
	return s
}

func (s *AddItemResponseBody) SetCode(v int) *AddItemResponseBody {
	s.Code = &v
	return s
}

type AddItemResponse struct {
	Headers map[string]*string   `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *AddItemResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s AddItemResponse) String() string {
	return tea.Prettify(s)
}

func (s AddItemResponse) GoString() string {
	return s.String()
}

func (s *AddItemResponse) SetHeaders(v map[string]*string) *AddItemResponse {
	s.Headers = v
	return s
}

func (s *AddItemResponse) SetBody(v *AddItemResponseBody) *AddItemResponse {
	s.Body = v
	return s
}

type Client struct {
	roa.Client
}

func NewClient(config *roa.Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *roa.Config) (_err error) {
	_err = client.Client.Init(config)
	if _err != nil {
		return _err
	}
	client.EndpointRule = tea.String("")
	_err = client.CheckConfig(config)
	if _err != nil {
		return _err
	}
	client.EndpointHost, _err = client.GetEndpoint(tea.String("imagesearch"), client.RegionId, client.EndpointRule, client.Network, client.Suffix, client.EndpointMap, client.EndpointHost)
	if _err != nil {
		return _err
	}

	return nil
}

func (client *Client) SearchItemWithOptions(request *SearchItemRequest, runtime *util.RuntimeOptions) (_result *SearchItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SearchItemResponse{}
	_body, _err := client.DoRequestWithAction(tea.String("SearchItem"), tea.String("2018-03-19"), tea.String("HTTPS"), tea.String("POST"), tea.String("AK"), tea.String("/item/search"), util.StringifyMapValue(tea.ToMap(request.Query)), request.Headers, nil, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) SearchItem(request *SearchItemRequest) (_result *SearchItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SearchItemResponse{}
	_body, _err := client.SearchItemWithOptions(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) DeleteItemWithOptions(request *DeleteItemRequest, runtime *util.RuntimeOptions) (_result *DeleteItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteItemResponse{}
	_body, _err := client.DoRequestWithAction(tea.String("DeleteItem"), tea.String("2018-03-19"), tea.String("HTTPS"), tea.String("POST"), tea.String("AK"), tea.String("/item/delete"), util.StringifyMapValue(tea.ToMap(request.Query)), request.Headers, nil, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) DeleteItem(request *DeleteItemRequest) (_result *DeleteItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteItemResponse{}
	_body, _err := client.DeleteItemWithOptions(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) AddItemWithOptions(request *AddItemRequest, runtime *util.RuntimeOptions) (_result *AddItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddItemResponse{}
	_body, _err := client.DoRequestWithAction(tea.String("AddItem"), tea.String("2018-03-19"), tea.String("HTTPS"), tea.String("POST"), tea.String("AK"), tea.String("/item/add"), util.StringifyMapValue(tea.ToMap(request.Query)), request.Headers, nil, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) AddItem(request *AddItemRequest) (_result *AddItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddItemResponse{}
	_body, _err := client.AddItemWithOptions(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) GetEndpoint(productId *string, regionId *string, endpointRule *string, network *string, suffix *string, endpointMap map[string]*string, endpoint *string) (_result *string, _err error) {
	if !tea.BoolValue(util.Empty(endpoint)) {
		_result = endpoint
		return _result, _err
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
