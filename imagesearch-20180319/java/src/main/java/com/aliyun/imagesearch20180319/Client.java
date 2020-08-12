// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180319;

import com.aliyun.tea.*;
import com.aliyun.imagesearch20180319.models.*;

public class Client extends com.aliyun.tearoa.Client {
    public Client(com.aliyun.tearoa.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpointHost = this.getEndpoint("imagesearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
    }


    public SearchItemResponse searchItemWithOptions(SearchItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("SearchItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/search", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new SearchItemResponse());
    }

    public SearchItemResponse searchItem(SearchItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchItemWithOptions(request, runtime);
    }

    public DeleteItemResponse deleteItemWithOptions(DeleteItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("DeleteItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/delete", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new DeleteItemResponse());
    }

    public DeleteItemResponse deleteItem(DeleteItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteItemWithOptions(request, runtime);
    }

    public AddItemResponse addItemWithOptions(AddItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequestWithAction("AddItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/add", com.aliyun.teautil.Common.stringifyMapValue(TeaModel.buildMap(request.query)), request.headers, null, runtime), new AddItemResponse());
    }

    public AddItemResponse addItem(AddItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addItemWithOptions(request, runtime);
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
}
