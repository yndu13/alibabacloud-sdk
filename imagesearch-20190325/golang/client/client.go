// This file is auto-generated, don't edit it. Thanks.
package client

import (
	endpointutil "github.com/alibabacloud-go/endpoint-util/service"
	roa "github.com/alibabacloud-go/tea-roa/client"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
)

type AddImageBody struct {
	InstanceName  *string `json:"InstanceName,omitempty" xml:"InstanceName,omitempty" require:"true"`
	CategoryId    *int    `json:"CategoryId,omitempty" xml:"CategoryId,omitempty"`
	ProductId     *string `json:"ProductId,omitempty" xml:"ProductId,omitempty" require:"true"`
	PicName       *string `json:"PicName,omitempty" xml:"PicName,omitempty" require:"true"`
	PicContent    *string `json:"PicContent,omitempty" xml:"PicContent,omitempty" require:"true"`
	Crop          *bool   `json:"Crop,omitempty" xml:"Crop,omitempty"`
	Region        *string `json:"Region,omitempty" xml:"Region,omitempty"`
	CustomContent *string `json:"CustomContent,omitempty" xml:"CustomContent,omitempty"`
	IntAttr       *int    `json:"IntAttr,omitempty" xml:"IntAttr,omitempty"`
	StrAttr       *string `json:"StrAttr,omitempty" xml:"StrAttr,omitempty"`
}

func (s AddImageBody) String() string {
	return tea.Prettify(s)
}

func (s AddImageBody) GoString() string {
	return s.String()
}

func (s *AddImageBody) SetInstanceName(v string) *AddImageBody {
	s.InstanceName = &v
	return s
}

func (s *AddImageBody) SetCategoryId(v int) *AddImageBody {
	s.CategoryId = &v
	return s
}

func (s *AddImageBody) SetProductId(v string) *AddImageBody {
	s.ProductId = &v
	return s
}

func (s *AddImageBody) SetPicName(v string) *AddImageBody {
	s.PicName = &v
	return s
}

func (s *AddImageBody) SetPicContent(v string) *AddImageBody {
	s.PicContent = &v
	return s
}

func (s *AddImageBody) SetCrop(v bool) *AddImageBody {
	s.Crop = &v
	return s
}

func (s *AddImageBody) SetRegion(v string) *AddImageBody {
	s.Region = &v
	return s
}

func (s *AddImageBody) SetCustomContent(v string) *AddImageBody {
	s.CustomContent = &v
	return s
}

func (s *AddImageBody) SetIntAttr(v int) *AddImageBody {
	s.IntAttr = &v
	return s
}

func (s *AddImageBody) SetStrAttr(v string) *AddImageBody {
	s.StrAttr = &v
	return s
}

type AddImageRequest struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty"`
	Body    *AddImageBody      `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s AddImageRequest) String() string {
	return tea.Prettify(s)
}

func (s AddImageRequest) GoString() string {
	return s.String()
}

func (s *AddImageRequest) SetHeaders(v map[string]*string) *AddImageRequest {
	s.Headers = v
	return s
}

func (s *AddImageRequest) SetBody(v *AddImageBody) *AddImageRequest {
	s.Body = v
	return s
}

type AddImageResponseBody struct {
	RequestId *string                      `json:"RequestId,omitempty" xml:"RequestId,omitempty" require:"true"`
	Success   *bool                        `json:"Success,omitempty" xml:"Success,omitempty" require:"true"`
	Message   *string                      `json:"Message,omitempty" xml:"Message,omitempty" require:"true"`
	Code      *int                         `json:"Code,omitempty" xml:"Code,omitempty" require:"true"`
	PicInfo   *AddImageResponseBodyPicInfo `json:"PicInfo,omitempty" xml:"PicInfo,omitempty" require:"true" type:"Struct"`
}

func (s AddImageResponseBody) String() string {
	return tea.Prettify(s)
}

func (s AddImageResponseBody) GoString() string {
	return s.String()
}

func (s *AddImageResponseBody) SetRequestId(v string) *AddImageResponseBody {
	s.RequestId = &v
	return s
}

func (s *AddImageResponseBody) SetSuccess(v bool) *AddImageResponseBody {
	s.Success = &v
	return s
}

func (s *AddImageResponseBody) SetMessage(v string) *AddImageResponseBody {
	s.Message = &v
	return s
}

func (s *AddImageResponseBody) SetCode(v int) *AddImageResponseBody {
	s.Code = &v
	return s
}

func (s *AddImageResponseBody) SetPicInfo(v *AddImageResponseBodyPicInfo) *AddImageResponseBody {
	s.PicInfo = v
	return s
}

type AddImageResponseBodyPicInfo struct {
	CategoryId *int    `json:"CategoryId,omitempty" xml:"CategoryId,omitempty" require:"true"`
	Region     *string `json:"Region,omitempty" xml:"Region,omitempty" require:"true"`
}

func (s AddImageResponseBodyPicInfo) String() string {
	return tea.Prettify(s)
}

func (s AddImageResponseBodyPicInfo) GoString() string {
	return s.String()
}

func (s *AddImageResponseBodyPicInfo) SetCategoryId(v int) *AddImageResponseBodyPicInfo {
	s.CategoryId = &v
	return s
}

func (s *AddImageResponseBodyPicInfo) SetRegion(v string) *AddImageResponseBodyPicInfo {
	s.Region = &v
	return s
}

type AddImageResponse struct {
	Headers map[string]*string    `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *AddImageResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s AddImageResponse) String() string {
	return tea.Prettify(s)
}

func (s AddImageResponse) GoString() string {
	return s.String()
}

func (s *AddImageResponse) SetHeaders(v map[string]*string) *AddImageResponse {
	s.Headers = v
	return s
}

func (s *AddImageResponse) SetBody(v *AddImageResponseBody) *AddImageResponse {
	s.Body = v
	return s
}

type DeleteImageBody struct {
	InstanceName *string `json:"InstanceName,omitempty" xml:"InstanceName,omitempty" require:"true"`
	ProductId    *string `json:"ProductId,omitempty" xml:"ProductId,omitempty" require:"true"`
	PicName      *string `json:"PicName,omitempty" xml:"PicName,omitempty"`
}

func (s DeleteImageBody) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageBody) GoString() string {
	return s.String()
}

func (s *DeleteImageBody) SetInstanceName(v string) *DeleteImageBody {
	s.InstanceName = &v
	return s
}

func (s *DeleteImageBody) SetProductId(v string) *DeleteImageBody {
	s.ProductId = &v
	return s
}

func (s *DeleteImageBody) SetPicName(v string) *DeleteImageBody {
	s.PicName = &v
	return s
}

type DeleteImageRequest struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty"`
	Body    *DeleteImageBody   `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s DeleteImageRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageRequest) GoString() string {
	return s.String()
}

func (s *DeleteImageRequest) SetHeaders(v map[string]*string) *DeleteImageRequest {
	s.Headers = v
	return s
}

func (s *DeleteImageRequest) SetBody(v *DeleteImageBody) *DeleteImageRequest {
	s.Body = v
	return s
}

type DeleteImageResponseBody struct {
	RequestId *string `json:"RequestId,omitempty" xml:"RequestId,omitempty" require:"true"`
	Success   *bool   `json:"Success,omitempty" xml:"Success,omitempty" require:"true"`
	Message   *string `json:"Message,omitempty" xml:"Message,omitempty" require:"true"`
	Code      *int    `json:"Code,omitempty" xml:"Code,omitempty" require:"true"`
}

func (s DeleteImageResponseBody) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageResponseBody) GoString() string {
	return s.String()
}

func (s *DeleteImageResponseBody) SetRequestId(v string) *DeleteImageResponseBody {
	s.RequestId = &v
	return s
}

func (s *DeleteImageResponseBody) SetSuccess(v bool) *DeleteImageResponseBody {
	s.Success = &v
	return s
}

func (s *DeleteImageResponseBody) SetMessage(v string) *DeleteImageResponseBody {
	s.Message = &v
	return s
}

func (s *DeleteImageResponseBody) SetCode(v int) *DeleteImageResponseBody {
	s.Code = &v
	return s
}

type DeleteImageResponse struct {
	Headers map[string]*string       `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *DeleteImageResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s DeleteImageResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteImageResponse) GoString() string {
	return s.String()
}

func (s *DeleteImageResponse) SetHeaders(v map[string]*string) *DeleteImageResponse {
	s.Headers = v
	return s
}

func (s *DeleteImageResponse) SetBody(v *DeleteImageResponseBody) *DeleteImageResponse {
	s.Body = v
	return s
}

type SearchImageBody struct {
	CategoryId   *int    `json:"CategoryId,omitempty" xml:"CategoryId,omitempty"`
	InstanceName *string `json:"InstanceName,omitempty" xml:"InstanceName,omitempty" require:"true"`
	ProductId    *string `json:"ProductId,omitempty" xml:"ProductId,omitempty"`
	PicName      *string `json:"PicName,omitempty" xml:"PicName,omitempty"`
	PicContent   *string `json:"PicContent,omitempty" xml:"PicContent,omitempty"`
	Crop         *bool   `json:"Crop,omitempty" xml:"Crop,omitempty"`
	Region       *string `json:"Region,omitempty" xml:"Region,omitempty"`
	Num          *int    `json:"Num,omitempty" xml:"Num,omitempty"`
	Start        *int    `json:"Start,omitempty" xml:"Start,omitempty"`
	Type         *string `json:"Type,omitempty" xml:"Type,omitempty"`
	Filter       *string `json:"Filter,omitempty" xml:"Filter,omitempty"`
}

func (s SearchImageBody) String() string {
	return tea.Prettify(s)
}

func (s SearchImageBody) GoString() string {
	return s.String()
}

func (s *SearchImageBody) SetCategoryId(v int) *SearchImageBody {
	s.CategoryId = &v
	return s
}

func (s *SearchImageBody) SetInstanceName(v string) *SearchImageBody {
	s.InstanceName = &v
	return s
}

func (s *SearchImageBody) SetProductId(v string) *SearchImageBody {
	s.ProductId = &v
	return s
}

func (s *SearchImageBody) SetPicName(v string) *SearchImageBody {
	s.PicName = &v
	return s
}

func (s *SearchImageBody) SetPicContent(v string) *SearchImageBody {
	s.PicContent = &v
	return s
}

func (s *SearchImageBody) SetCrop(v bool) *SearchImageBody {
	s.Crop = &v
	return s
}

func (s *SearchImageBody) SetRegion(v string) *SearchImageBody {
	s.Region = &v
	return s
}

func (s *SearchImageBody) SetNum(v int) *SearchImageBody {
	s.Num = &v
	return s
}

func (s *SearchImageBody) SetStart(v int) *SearchImageBody {
	s.Start = &v
	return s
}

func (s *SearchImageBody) SetType(v string) *SearchImageBody {
	s.Type = &v
	return s
}

func (s *SearchImageBody) SetFilter(v string) *SearchImageBody {
	s.Filter = &v
	return s
}

type SearchImageRequest struct {
	Headers map[string]*string `json:"headers,omitempty" xml:"headers,omitempty"`
	Body    *SearchImageBody   `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s SearchImageRequest) String() string {
	return tea.Prettify(s)
}

func (s SearchImageRequest) GoString() string {
	return s.String()
}

func (s *SearchImageRequest) SetHeaders(v map[string]*string) *SearchImageRequest {
	s.Headers = v
	return s
}

func (s *SearchImageRequest) SetBody(v *SearchImageBody) *SearchImageRequest {
	s.Body = v
	return s
}

type SearchImageResponseBody struct {
	RequestId *string                            `json:"RequestId,omitempty" xml:"RequestId,omitempty" require:"true"`
	Success   *bool                              `json:"Success,omitempty" xml:"Success,omitempty" require:"true"`
	Code      *int                               `json:"Code,omitempty" xml:"Code,omitempty" require:"true"`
	Msg       *string                            `json:"Msg,omitempty" xml:"Msg,omitempty" require:"true"`
	Auctions  []*SearchImageResponseBodyAuctions `json:"Auctions,omitempty" xml:"Auctions,omitempty" require:"true" type:"Repeated"`
	Head      *SearchImageResponseBodyHead       `json:"Head,omitempty" xml:"Head,omitempty" require:"true" type:"Struct"`
	PicInfo   *SearchImageResponseBodyPicInfo    `json:"PicInfo,omitempty" xml:"PicInfo,omitempty" require:"true" type:"Struct"`
}

func (s SearchImageResponseBody) String() string {
	return tea.Prettify(s)
}

func (s SearchImageResponseBody) GoString() string {
	return s.String()
}

func (s *SearchImageResponseBody) SetRequestId(v string) *SearchImageResponseBody {
	s.RequestId = &v
	return s
}

func (s *SearchImageResponseBody) SetSuccess(v bool) *SearchImageResponseBody {
	s.Success = &v
	return s
}

func (s *SearchImageResponseBody) SetCode(v int) *SearchImageResponseBody {
	s.Code = &v
	return s
}

func (s *SearchImageResponseBody) SetMsg(v string) *SearchImageResponseBody {
	s.Msg = &v
	return s
}

func (s *SearchImageResponseBody) SetAuctions(v []*SearchImageResponseBodyAuctions) *SearchImageResponseBody {
	s.Auctions = v
	return s
}

func (s *SearchImageResponseBody) SetHead(v *SearchImageResponseBodyHead) *SearchImageResponseBody {
	s.Head = v
	return s
}

func (s *SearchImageResponseBody) SetPicInfo(v *SearchImageResponseBodyPicInfo) *SearchImageResponseBody {
	s.PicInfo = v
	return s
}

type SearchImageResponseBodyAuctions struct {
	CategoryId     *int    `json:"CategoryId,omitempty" xml:"CategoryId,omitempty" require:"true"`
	ProductId      *string `json:"ProductId,omitempty" xml:"ProductId,omitempty" require:"true"`
	PicName        *string `json:"PicName,omitempty" xml:"PicName,omitempty" require:"true"`
	CustomContent  *string `json:"CustomContent,omitempty" xml:"CustomContent,omitempty" require:"true"`
	SortExprValues *string `json:"SortExprValues,omitempty" xml:"SortExprValues,omitempty" require:"true"`
	IntAttr        *int    `json:"IntAttr,omitempty" xml:"IntAttr,omitempty" require:"true"`
	StrAttr        *string `json:"StrAttr,omitempty" xml:"StrAttr,omitempty" require:"true"`
}

func (s SearchImageResponseBodyAuctions) String() string {
	return tea.Prettify(s)
}

func (s SearchImageResponseBodyAuctions) GoString() string {
	return s.String()
}

func (s *SearchImageResponseBodyAuctions) SetCategoryId(v int) *SearchImageResponseBodyAuctions {
	s.CategoryId = &v
	return s
}

func (s *SearchImageResponseBodyAuctions) SetProductId(v string) *SearchImageResponseBodyAuctions {
	s.ProductId = &v
	return s
}

func (s *SearchImageResponseBodyAuctions) SetPicName(v string) *SearchImageResponseBodyAuctions {
	s.PicName = &v
	return s
}

func (s *SearchImageResponseBodyAuctions) SetCustomContent(v string) *SearchImageResponseBodyAuctions {
	s.CustomContent = &v
	return s
}

func (s *SearchImageResponseBodyAuctions) SetSortExprValues(v string) *SearchImageResponseBodyAuctions {
	s.SortExprValues = &v
	return s
}

func (s *SearchImageResponseBodyAuctions) SetIntAttr(v int) *SearchImageResponseBodyAuctions {
	s.IntAttr = &v
	return s
}

func (s *SearchImageResponseBodyAuctions) SetStrAttr(v string) *SearchImageResponseBodyAuctions {
	s.StrAttr = &v
	return s
}

type SearchImageResponseBodyHead struct {
	DocsReturn *int `json:"DocsReturn,omitempty" xml:"DocsReturn,omitempty" require:"true"`
	DocsFound  *int `json:"DocsFound,omitempty" xml:"DocsFound,omitempty" require:"true"`
	SearchTime *int `json:"SearchTime,omitempty" xml:"SearchTime,omitempty" require:"true"`
}

func (s SearchImageResponseBodyHead) String() string {
	return tea.Prettify(s)
}

func (s SearchImageResponseBodyHead) GoString() string {
	return s.String()
}

func (s *SearchImageResponseBodyHead) SetDocsReturn(v int) *SearchImageResponseBodyHead {
	s.DocsReturn = &v
	return s
}

func (s *SearchImageResponseBodyHead) SetDocsFound(v int) *SearchImageResponseBodyHead {
	s.DocsFound = &v
	return s
}

func (s *SearchImageResponseBodyHead) SetSearchTime(v int) *SearchImageResponseBodyHead {
	s.SearchTime = &v
	return s
}

type SearchImageResponseBodyPicInfo struct {
	CategoryId    *int                                           `json:"CategoryId,omitempty" xml:"CategoryId,omitempty" require:"true"`
	Region        *string                                        `json:"Region,omitempty" xml:"Region,omitempty" require:"true"`
	AllCategories []*SearchImageResponseBodyPicInfoAllCategories `json:"AllCategories,omitempty" xml:"AllCategories,omitempty" require:"true" type:"Repeated"`
}

func (s SearchImageResponseBodyPicInfo) String() string {
	return tea.Prettify(s)
}

func (s SearchImageResponseBodyPicInfo) GoString() string {
	return s.String()
}

func (s *SearchImageResponseBodyPicInfo) SetCategoryId(v int) *SearchImageResponseBodyPicInfo {
	s.CategoryId = &v
	return s
}

func (s *SearchImageResponseBodyPicInfo) SetRegion(v string) *SearchImageResponseBodyPicInfo {
	s.Region = &v
	return s
}

func (s *SearchImageResponseBodyPicInfo) SetAllCategories(v []*SearchImageResponseBodyPicInfoAllCategories) *SearchImageResponseBodyPicInfo {
	s.AllCategories = v
	return s
}

type SearchImageResponseBodyPicInfoAllCategories struct {
	Id   *int    `json:"Id,omitempty" xml:"Id,omitempty" require:"true"`
	Name *string `json:"Name,omitempty" xml:"Name,omitempty" require:"true"`
}

func (s SearchImageResponseBodyPicInfoAllCategories) String() string {
	return tea.Prettify(s)
}

func (s SearchImageResponseBodyPicInfoAllCategories) GoString() string {
	return s.String()
}

func (s *SearchImageResponseBodyPicInfoAllCategories) SetId(v int) *SearchImageResponseBodyPicInfoAllCategories {
	s.Id = &v
	return s
}

func (s *SearchImageResponseBodyPicInfoAllCategories) SetName(v string) *SearchImageResponseBodyPicInfoAllCategories {
	s.Name = &v
	return s
}

type SearchImageResponse struct {
	Headers map[string]*string       `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *SearchImageResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s SearchImageResponse) String() string {
	return tea.Prettify(s)
}

func (s SearchImageResponse) GoString() string {
	return s.String()
}

func (s *SearchImageResponse) SetHeaders(v map[string]*string) *SearchImageResponse {
	s.Headers = v
	return s
}

func (s *SearchImageResponse) SetBody(v *SearchImageResponseBody) *SearchImageResponse {
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

func (client *Client) AddImageWithOptions(request *AddImageRequest, runtime *util.RuntimeOptions) (_result *AddImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddImageResponse{}
	_body, _err := client.DoRequestWithAction(tea.String("AddImage"), tea.String("2019-03-25"), tea.String("HTTPS"), tea.String("POST"), tea.String("AK"), tea.String("/v2/image/add"), nil, request.Headers, tea.ToMap(request.Body), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) AddImage(request *AddImageRequest) (_result *AddImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddImageResponse{}
	_body, _err := client.AddImageWithOptions(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) DeleteImageWithOptions(request *DeleteImageRequest, runtime *util.RuntimeOptions) (_result *DeleteImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteImageResponse{}
	_body, _err := client.DoRequestWithAction(tea.String("DeleteImage"), tea.String("2019-03-25"), tea.String("HTTPS"), tea.String("POST"), tea.String("AK"), tea.String("/v2/image/delete"), nil, request.Headers, tea.ToMap(request.Body), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) DeleteImage(request *DeleteImageRequest) (_result *DeleteImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &DeleteImageResponse{}
	_body, _err := client.DeleteImageWithOptions(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) SearchImageWithOptions(request *SearchImageRequest, runtime *util.RuntimeOptions) (_result *SearchImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SearchImageResponse{}
	_body, _err := client.DoRequestWithAction(tea.String("SearchImage"), tea.String("2019-03-25"), tea.String("HTTPS"), tea.String("POST"), tea.String("AK"), tea.String("/v2/image/search"), nil, request.Headers, tea.ToMap(request.Body), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

func (client *Client) SearchImage(request *SearchImageRequest) (_result *SearchImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SearchImageResponse{}
	_body, _err := client.SearchImageWithOptions(request, runtime)
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
