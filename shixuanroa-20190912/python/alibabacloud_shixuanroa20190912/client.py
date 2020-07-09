# This file is auto-generated, don't edit it. Thanks.
from alibabacloud_tea_roa.client import Client as ROAClient
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_endpoint_util.client import Client as EndpointUtilClient
from alibabacloud_shixuanroa20190912 import models as shixuan_roa20190912_models
from alibabacloud_tea_util import models as util_models

"""
*
"""


class Client(ROAClient):
    def __init__(self, config):
        super().__init__(config)
        self._endpoint_rule = ""
        self.check_config(config)
        self._endpoint_host = self.get_endpoint("shixuanroa", self._region_id, self._endpoint_rule, self._network, self._suffix, self._endpoint_map, self._endpoint_host)

    def get_endpoint(self, product_id, region_id, endpoint_rule, network, suffix, endpoint_map, endpoint):
        if not UtilClient.empty(endpoint):
            return endpoint
        if not UtilClient.is_unset(endpoint_map) and not UtilClient.empty(endpoint_map.get('regionId')):
            return endpoint_map.get('regionId')
        return EndpointUtilClient.get_endpoint_rules(product_id, region_id, endpoint_rule, network, suffix)

    def create_cluster_bak(self, request):
        """
        CreateClusterBakCreateClusterBak
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_cluster_bak_with_options(request, runtime)

    def create_cluster_bak_with_options(self, request, runtime):
        UtilClient.validate_model(request)
        return shixuan_roa20190912_models.CreateClusterBakResponse().from_map(self.do_request("2019-09-12", "https", "get", "Anonymous", "/", request.headers, None, request.body.to_map(), runtime))

