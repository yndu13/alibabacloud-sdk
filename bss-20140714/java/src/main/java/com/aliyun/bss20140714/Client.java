// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714;

import com.aliyun.tea.*;
import com.aliyun.bss20140714.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public OpenCallbackResponse openCallbackEx(OpenCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OpenCallback", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new OpenCallbackResponse());
    }

    public OpenCallbackResponse openCallback(OpenCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openCallbackEx(request, runtime);
    }

    public QueryForCssOrderResponse queryForCssOrderEx(QueryForCssOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryForCssOrder", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryForCssOrderResponse());
    }

    public QueryForCssOrderResponse queryForCssOrder(QueryForCssOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryForCssOrderEx(request, runtime);
    }

    public CreateOrderResponse createOrderEx(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOrder", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderEx(request, runtime);
    }

    public vnoPayCallBackNotifyResponse vnoPayCallBackNotifyEx(vnoPayCallBackNotifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("vnoPayCallBackNotify", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new vnoPayCallBackNotifyResponse());
    }

    public vnoPayCallBackNotifyResponse vnoPayCallBackNotify(vnoPayCallBackNotifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vnoPayCallBackNotifyEx(request, runtime);
    }

    public vnoBatchRefundOrderResponse vnoBatchRefundOrderEx(vnoBatchRefundOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("vnoBatchRefundOrder", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new vnoBatchRefundOrderResponse());
    }

    public vnoBatchRefundOrderResponse vnoBatchRefundOrder(vnoBatchRefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vnoBatchRefundOrderEx(request, runtime);
    }

    public SubscriptionCreateOrderApiResponse subscriptionCreateOrderApiEx(SubscriptionCreateOrderApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubscriptionCreateOrderApi", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new SubscriptionCreateOrderApiResponse());
    }

    public SubscriptionCreateOrderApiResponse subscriptionCreateOrderApi(SubscriptionCreateOrderApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscriptionCreateOrderApiEx(request, runtime);
    }

    public SetResourceBusinessStatusResponse setResourceBusinessStatusEx(SetResourceBusinessStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResourceBusinessStatus", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new SetResourceBusinessStatusResponse());
    }

    public SetResourceBusinessStatusResponse setResourceBusinessStatus(SetResourceBusinessStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResourceBusinessStatusEx(request, runtime);
    }

    public DescribeCouponListResponse describeCouponListEx(DescribeCouponListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCouponList", "HTTPS", "POST", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeCouponListResponse());
    }

    public DescribeCouponListResponse describeCouponList(DescribeCouponListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCouponListEx(request, runtime);
    }

    public DescribeCouponDetailResponse describeCouponDetailEx(DescribeCouponDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCouponDetail", "HTTPS", "GET", "2014-07-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeCouponDetailResponse());
    }

    public DescribeCouponDetailResponse describeCouponDetail(DescribeCouponDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCouponDetailEx(request, runtime);
    }

    public DescribeCashDetailResponse describeCashDetailEx(DescribeCashDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCashDetail", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCashDetailResponse());
    }

    public DescribeCashDetailResponse describeCashDetail(DescribeCashDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCashDetailEx(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
