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


    public OpenCallbackResponse openCallbackWithOptions(OpenCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OpenCallback", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new OpenCallbackResponse());
    }

    public OpenCallbackResponse openCallback(OpenCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openCallbackWithOptions(request, runtime);
    }

    public QueryForCssOrderResponse queryForCssOrderWithOptions(QueryForCssOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryForCssOrder", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryForCssOrderResponse());
    }

    public QueryForCssOrderResponse queryForCssOrder(QueryForCssOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryForCssOrderWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOrder", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public vnoPayCallBackNotifyResponse vnoPayCallBackNotifyWithOptions(vnoPayCallBackNotifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("vnoPayCallBackNotify", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new vnoPayCallBackNotifyResponse());
    }

    public vnoPayCallBackNotifyResponse vnoPayCallBackNotify(vnoPayCallBackNotifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vnoPayCallBackNotifyWithOptions(request, runtime);
    }

    public vnoBatchRefundOrderResponse vnoBatchRefundOrderWithOptions(vnoBatchRefundOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("vnoBatchRefundOrder", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new vnoBatchRefundOrderResponse());
    }

    public vnoBatchRefundOrderResponse vnoBatchRefundOrder(vnoBatchRefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vnoBatchRefundOrderWithOptions(request, runtime);
    }

    public SubscriptionCreateOrderApiResponse subscriptionCreateOrderApiWithOptions(SubscriptionCreateOrderApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubscriptionCreateOrderApi", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new SubscriptionCreateOrderApiResponse());
    }

    public SubscriptionCreateOrderApiResponse subscriptionCreateOrderApi(SubscriptionCreateOrderApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscriptionCreateOrderApiWithOptions(request, runtime);
    }

    public SetResourceBusinessStatusResponse setResourceBusinessStatusWithOptions(SetResourceBusinessStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResourceBusinessStatus", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new SetResourceBusinessStatusResponse());
    }

    public SetResourceBusinessStatusResponse setResourceBusinessStatus(SetResourceBusinessStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResourceBusinessStatusWithOptions(request, runtime);
    }

    public DescribeCouponListResponse describeCouponListWithOptions(DescribeCouponListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCouponList", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCouponListResponse());
    }

    public DescribeCouponListResponse describeCouponList(DescribeCouponListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCouponListWithOptions(request, runtime);
    }

    public DescribeCouponDetailResponse describeCouponDetailWithOptions(DescribeCouponDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCouponDetail", "HTTPS", "GET", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCouponDetailResponse());
    }

    public DescribeCouponDetailResponse describeCouponDetail(DescribeCouponDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCouponDetailWithOptions(request, runtime);
    }

    public DescribeCashDetailResponse describeCashDetailWithOptions(DescribeCashDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCashDetail", "HTTPS", "POST", "2014-07-14", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCashDetailResponse());
    }

    public DescribeCashDetailResponse describeCashDetail(DescribeCashDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCashDetailWithOptions(request, runtime);
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
