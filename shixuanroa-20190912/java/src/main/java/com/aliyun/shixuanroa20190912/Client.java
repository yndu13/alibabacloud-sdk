// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.shixuanroa20190912;

import com.aliyun.tea.*;
import com.aliyun.shixuanroa20190912.models.*;

public class Client extends com.aliyun.tearoa.Client {
    public Client(com.aliyun.tearoa.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpointHost = this.getEndpoint("shixuanroa", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * CreateClusterBakCreateClusterBak
     */
    public CreateClusterBakResponse CreateClusterBak(CreateClusterBakRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.CreateClusterBakWithOptions(request, runtime);
    }

    public CreateClusterBakResponse CreateClusterBakWithOptions(CreateClusterBakRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("2019-09-12", "https", "get", "Anonymous", "/", request.headers, null, TeaModel.buildMap(request.body), runtime), new CreateClusterBakResponse());
    }
}
