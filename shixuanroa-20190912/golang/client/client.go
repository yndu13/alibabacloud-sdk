// This file is auto-generated, don't edit it. Thanks.
/**
 *
 */
package client

import (
	endpointutil "github.com/alibabacloud-go/endpoint-util/service"
	roa "github.com/alibabacloud-go/tea-roa/client"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
)

type CreateClusterBakBody struct {
}

func (s CreateClusterBakBody) String() string {
	return tea.Prettify(s)
}

func (s CreateClusterBakBody) GoString() string {
	return s.String()
}

type CreateClusterBakRequest struct {
	Headers map[string]*string    `json:"headers,omitempty" xml:"headers,omitempty"`
	Body    *CreateClusterBakBody `json:"body,omitempty" xml:"body,omitempty"`
}

func (s CreateClusterBakRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateClusterBakRequest) GoString() string {
	return s.String()
}

func (s *CreateClusterBakRequest) SetHeaders(v map[string]*string) *CreateClusterBakRequest {
	s.Headers = v
	return s
}

func (s *CreateClusterBakRequest) SetBody(v *CreateClusterBakBody) *CreateClusterBakRequest {
	s.Body = v
	return s
}

type CreateClusterBakResponseBody struct {
	ClusterId *string `json:"cluster_id,omitempty" xml:"cluster_id,omitempty"`
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	TaskId    *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s CreateClusterBakResponseBody) String() string {
	return tea.Prettify(s)
}

func (s CreateClusterBakResponseBody) GoString() string {
	return s.String()
}

func (s *CreateClusterBakResponseBody) SetClusterId(v string) *CreateClusterBakResponseBody {
	s.ClusterId = &v
	return s
}

func (s *CreateClusterBakResponseBody) SetRequestId(v string) *CreateClusterBakResponseBody {
	s.RequestId = &v
	return s
}

func (s *CreateClusterBakResponseBody) SetTaskId(v string) *CreateClusterBakResponseBody {
	s.TaskId = &v
	return s
}

type CreateClusterBakResponse struct {
	Headers map[string]*string            `json:"headers,omitempty" xml:"headers,omitempty" require:"true"`
	Body    *CreateClusterBakResponseBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s CreateClusterBakResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateClusterBakResponse) GoString() string {
	return s.String()
}

func (s *CreateClusterBakResponse) SetHeaders(v map[string]*string) *CreateClusterBakResponse {
	s.Headers = v
	return s
}

func (s *CreateClusterBakResponse) SetBody(v *CreateClusterBakResponseBody) *CreateClusterBakResponse {
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
	client.EndpointHost, _err = client.GetEndpoint(tea.String("shixuanroa"), client.RegionId, client.EndpointRule, client.Network, client.Suffix, client.EndpointMap, client.EndpointHost)
	if _err != nil {
		return _err
	}

	return nil
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

/**
 * CreateClusterBakCreateClusterBak
 */
func (client *Client) CreateClusterBak(request *CreateClusterBakRequest) (_result *CreateClusterBakResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateClusterBakResponse{}
	_body, _err := client.CreateClusterBakWithOptions(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

func (client *Client) CreateClusterBakWithOptions(request *CreateClusterBakRequest, runtime *util.RuntimeOptions) (_result *CreateClusterBakResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateClusterBakResponse{}
	_body, _err := client.DoRequest(tea.String("2019-09-12"), tea.String("https"), tea.String("get"), tea.String("Anonymous"), tea.String("/"), request.Headers, nil, tea.ToMap(request.Body), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
