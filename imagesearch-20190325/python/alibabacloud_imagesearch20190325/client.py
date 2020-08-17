# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from alibabacloud_tea_roa.client import Client as ROAClient
from alibabacloud_imagesearch20190325 import models as image_search_20190325_models
from alibabacloud_tea_util import models as util_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_endpoint_util.client import Client as EndpointUtilClient


class Client(ROAClient):
    def __init__(self, config):
        super(Client, self).__init__(config)
        self._endpoint_rule = ""
        self.check_config(config)
        self._endpoint_host = self.get_endpoint("imagesearch", self._region_id, self._endpoint_rule, self._network, self._suffix, self._endpoint_map, self._endpoint_host)

    def add_image_with_options(self, request, runtime):
        UtilClient.validate_model(request)
        return image_search_20190325_models.AddImageResponse().from_map(self.do_request_with_action("AddImage", "2019-03-25", "HTTPS", "POST", "AK", "/v2/image/add", None, request.headers, request.body.to_map(), runtime))


    def add_image(self, request):
        runtime = util_models.RuntimeOptions(

        )
        return self.add_image_with_options(request, runtime)

    def delete_image_with_options(self, request, runtime):
        UtilClient.validate_model(request)
        return image_search_20190325_models.DeleteImageResponse().from_map(self.do_request_with_action("DeleteImage", "2019-03-25", "HTTPS", "POST", "AK", "/v2/image/delete", None, request.headers, request.body.to_map(), runtime))


    def delete_image(self, request):
        runtime = util_models.RuntimeOptions(

        )
        return self.delete_image_with_options(request, runtime)

    def search_image_with_options(self, request, runtime):
        UtilClient.validate_model(request)
        return image_search_20190325_models.SearchImageResponse().from_map(self.do_request_with_action("SearchImage", "2019-03-25", "HTTPS", "POST", "AK", "/v2/image/search", None, request.headers, request.body.to_map(), runtime))


    def search_image(self, request):
        runtime = util_models.RuntimeOptions(

        )
        return self.search_image_with_options(request, runtime)

    def get_endpoint(self, product_id, region_id, endpoint_rule, network, suffix, endpoint_map, endpoint):
        if not UtilClient.empty(endpoint):
            return endpoint
        if not UtilClient.is_unset(endpoint_map) and not UtilClient.empty(endpoint_map.get('regionId')):
            return endpoint_map.get('regionId')
        return EndpointUtilClient.get_endpoint_rules(product_id, region_id, endpoint_rule, network, suffix)
