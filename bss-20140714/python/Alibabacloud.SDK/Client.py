# This file is auto-generated, don't edit it. Thanks.
from alibabacloud_tea_rpc.client import Client as alibabacloud_tea_rpc_client_Client
from Alibabacloud.SDK import models as Alibabacloud_SDK_models
from alibabacloud_tea_util import models as alibabacloud_tea_util_models
from alibabacloud_tea_util.client import Client as alibabacloud_tea_util_client_Client
from alibabacloud_endpoint_util.client import Client as alibabacloud_endpoint_util_client_Client


class Client(alibabacloud_tea_rpc_client_Client):
    def __init__(self, config):
        super().__init__(config)
        self._endpoint_rule = ""
        self.check_config(config)
        self._endpoint = self.get_endpoint(self._product_id, self._region_id, self._endpoint_rule, self._network, self._suffix, self._endpoint_map, self._endpoint)


    def open_callback_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.OpenCallbackResponse().from_map(self.do_request("OpenCallback", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def open_callback(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.open_callback_ex(request, runtime)

    def query_for_css_order_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.QueryForCssOrderResponse().from_map(self.do_request("QueryForCssOrder", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def query_for_css_order(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.query_for_css_order_ex(request, runtime)

    def create_order_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.CreateOrderResponse().from_map(self.do_request("CreateOrder", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def create_order(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.create_order_ex(request, runtime)

    def vno_pay_call_back_notify_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.VnoPayCallBackNotifyResponse().from_map(self.do_request("vnoPayCallBackNotify", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def vno_pay_call_back_notify(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.vno_pay_call_back_notify_ex(request, runtime)

    def vno_batch_refund_order_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.VnoBatchRefundOrderResponse().from_map(self.do_request("vnoBatchRefundOrder", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def vno_batch_refund_order(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.vno_batch_refund_order_ex(request, runtime)

    def subscription_create_order_api_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.SubscriptionCreateOrderApiResponse().from_map(self.do_request("SubscriptionCreateOrderApi", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def subscription_create_order_api(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.subscription_create_order_api_ex(request, runtime)

    def set_resource_business_status_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.SetResourceBusinessStatusResponse().from_map(self.do_request("SetResourceBusinessStatus", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def set_resource_business_status(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.set_resource_business_status_ex(request, runtime)

    def describe_coupon_list_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.DescribeCouponListResponse().from_map(self.do_request("DescribeCouponList", "HTTPS", "POST", "2014-07-14", "AK", request, None, runtime))


    def describe_coupon_list(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.describe_coupon_list_ex(request, runtime)

    def describe_coupon_detail_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.DescribeCouponDetailResponse().from_map(self.do_request("DescribeCouponDetail", "HTTPS", "GET", "2014-07-14", "AK", request, None, runtime))


    def describe_coupon_detail(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.describe_coupon_detail_ex(request, runtime)

    def describe_cash_detail_ex(self, request, runtime):
        alibabacloud_tea_util_client_Client.validate_model(request)
        return Alibabacloud_SDK_models.DescribeCashDetailResponse().from_map(self.do_request("DescribeCashDetail", "HTTPS", "POST", "2014-07-14", "AK", None, request, runtime))


    def describe_cash_detail(self, request):
        runtime = alibabacloud_tea_util_models.RuntimeOptions(

        )
        return self.describe_cash_detail_ex(request, runtime)

    def get_endpoint(self, product_id, region_id, endpoint_rule, network, suffix, endpoint_map, endpoint):
        if not alibabacloud_tea_util_client_Client.empty(endpoint) :
            return endpoint
        if not alibabacloud_tea_util_client_Client.is_unset(endpoint_map) and not alibabacloud_tea_util_client_Client.empty(endpointMap["regionId"]) :
            return endpointMap["regionId"]
        return alibabacloud_endpoint_util_client_Client.get_endpoint_rules(product_id, region_id, endpoint_rule, network, suffix)
