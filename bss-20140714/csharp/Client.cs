// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.Bss20140714.Models;

namespace AlibabaCloud.SDK.Bss20140714
{
    public class Client : AlibabaCloud.RPCClient.Client
    {

        public Client(AlibabaCloud.RPCClient.Models.Config config): base(config)
        {
            this._endpointRule = "";
            CheckConfig(config);
            this._endpoint = GetEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
        }


        public OpenCallbackResponse OpenCallbackEx(OpenCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenCallbackResponse>(DoRequest("OpenCallback", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<OpenCallbackResponse> OpenCallbackExAsync(OpenCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenCallbackResponse>(await DoRequestAsync("OpenCallback", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public OpenCallbackResponse OpenCallback(OpenCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return OpenCallbackEx(request, runtime);
        }

        public async Task<OpenCallbackResponse> OpenCallbackAsync(OpenCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await OpenCallbackExAsync(request, runtime);
        }

        public QueryForCssOrderResponse QueryForCssOrderEx(QueryForCssOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryForCssOrderResponse>(DoRequest("QueryForCssOrder", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryForCssOrderResponse> QueryForCssOrderExAsync(QueryForCssOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryForCssOrderResponse>(await DoRequestAsync("QueryForCssOrder", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryForCssOrderResponse QueryForCssOrder(QueryForCssOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryForCssOrderEx(request, runtime);
        }

        public async Task<QueryForCssOrderResponse> QueryForCssOrderAsync(QueryForCssOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryForCssOrderExAsync(request, runtime);
        }

        public CreateOrderResponse CreateOrderEx(CreateOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(DoRequest("CreateOrder", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateOrderResponse> CreateOrderExAsync(CreateOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(await DoRequestAsync("CreateOrder", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateOrderResponse CreateOrder(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateOrderEx(request, runtime);
        }

        public async Task<CreateOrderResponse> CreateOrderAsync(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateOrderExAsync(request, runtime);
        }

        public vnoPayCallBackNotifyResponse VnoPayCallBackNotifyEx(vnoPayCallBackNotifyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VnoPayCallBackNotifyResponse>(DoRequest("vnoPayCallBackNotify", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<vnoPayCallBackNotifyResponse> VnoPayCallBackNotifyExAsync(vnoPayCallBackNotifyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VnoPayCallBackNotifyResponse>(await DoRequestAsync("vnoPayCallBackNotify", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public vnoPayCallBackNotifyResponse VnoPayCallBackNotify(vnoPayCallBackNotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return VnoPayCallBackNotifyEx(request, runtime);
        }

        public async Task<vnoPayCallBackNotifyResponse> VnoPayCallBackNotifyAsync(vnoPayCallBackNotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await VnoPayCallBackNotifyExAsync(request, runtime);
        }

        public vnoBatchRefundOrderResponse VnoBatchRefundOrderEx(vnoBatchRefundOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VnoBatchRefundOrderResponse>(DoRequest("vnoBatchRefundOrder", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<vnoBatchRefundOrderResponse> VnoBatchRefundOrderExAsync(vnoBatchRefundOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VnoBatchRefundOrderResponse>(await DoRequestAsync("vnoBatchRefundOrder", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public vnoBatchRefundOrderResponse VnoBatchRefundOrder(vnoBatchRefundOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return VnoBatchRefundOrderEx(request, runtime);
        }

        public async Task<vnoBatchRefundOrderResponse> VnoBatchRefundOrderAsync(vnoBatchRefundOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await VnoBatchRefundOrderExAsync(request, runtime);
        }

        public SubscriptionCreateOrderApiResponse SubscriptionCreateOrderApiEx(SubscriptionCreateOrderApiRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubscriptionCreateOrderApiResponse>(DoRequest("SubscriptionCreateOrderApi", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubscriptionCreateOrderApiResponse> SubscriptionCreateOrderApiExAsync(SubscriptionCreateOrderApiRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubscriptionCreateOrderApiResponse>(await DoRequestAsync("SubscriptionCreateOrderApi", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public SubscriptionCreateOrderApiResponse SubscriptionCreateOrderApi(SubscriptionCreateOrderApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubscriptionCreateOrderApiEx(request, runtime);
        }

        public async Task<SubscriptionCreateOrderApiResponse> SubscriptionCreateOrderApiAsync(SubscriptionCreateOrderApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubscriptionCreateOrderApiExAsync(request, runtime);
        }

        public SetResourceBusinessStatusResponse SetResourceBusinessStatusEx(SetResourceBusinessStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResourceBusinessStatusResponse>(DoRequest("SetResourceBusinessStatus", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetResourceBusinessStatusResponse> SetResourceBusinessStatusExAsync(SetResourceBusinessStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResourceBusinessStatusResponse>(await DoRequestAsync("SetResourceBusinessStatus", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public SetResourceBusinessStatusResponse SetResourceBusinessStatus(SetResourceBusinessStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetResourceBusinessStatusEx(request, runtime);
        }

        public async Task<SetResourceBusinessStatusResponse> SetResourceBusinessStatusAsync(SetResourceBusinessStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetResourceBusinessStatusExAsync(request, runtime);
        }

        public DescribeCouponListResponse DescribeCouponListEx(DescribeCouponListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCouponListResponse>(DoRequest("DescribeCouponList", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeCouponListResponse> DescribeCouponListExAsync(DescribeCouponListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCouponListResponse>(await DoRequestAsync("DescribeCouponList", "HTTPS", "POST", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeCouponListResponse DescribeCouponList(DescribeCouponListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeCouponListEx(request, runtime);
        }

        public async Task<DescribeCouponListResponse> DescribeCouponListAsync(DescribeCouponListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeCouponListExAsync(request, runtime);
        }

        public DescribeCouponDetailResponse DescribeCouponDetailEx(DescribeCouponDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCouponDetailResponse>(DoRequest("DescribeCouponDetail", "HTTPS", "GET", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeCouponDetailResponse> DescribeCouponDetailExAsync(DescribeCouponDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCouponDetailResponse>(await DoRequestAsync("DescribeCouponDetail", "HTTPS", "GET", "2014-07-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeCouponDetailResponse DescribeCouponDetail(DescribeCouponDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeCouponDetailEx(request, runtime);
        }

        public async Task<DescribeCouponDetailResponse> DescribeCouponDetailAsync(DescribeCouponDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeCouponDetailExAsync(request, runtime);
        }

        public DescribeCashDetailResponse DescribeCashDetailEx(DescribeCashDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCashDetailResponse>(DoRequest("DescribeCashDetail", "HTTPS", "POST", "2014-07-14", "AK", null, request.ToMap(), runtime));
        }

        public async Task<DescribeCashDetailResponse> DescribeCashDetailExAsync(DescribeCashDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCashDetailResponse>(await DoRequestAsync("DescribeCashDetail", "HTTPS", "POST", "2014-07-14", "AK", null, request.ToMap(), runtime));
        }

        public DescribeCashDetailResponse DescribeCashDetail(DescribeCashDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeCashDetailEx(request, runtime);
        }

        public async Task<DescribeCashDetailResponse> DescribeCashDetailAsync(DescribeCashDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeCashDetailExAsync(request, runtime);
        }

        public string GetEndpoint(string productId, string regionId, string endpointRule, string network, string suffix, Dictionary<string, string> endpointMap, string endpoint)
        {
            if (!AlibabaCloud.TeaUtil.Common.Empty(endpoint))
            {
                return endpoint;
            }
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(endpointMap) && !AlibabaCloud.TeaUtil.Common.Empty(endpointMap.Get(regionId)))
            {
                return endpointMap.Get(regionId);
            }
            return AlibabaCloud.EndpointUtil.Common.GetEndpointRules(productId, regionId, endpointRule, network, suffix);
        }

    }
}
