// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.ImageSearch20180319.Models;

namespace AlibabaCloud.SDK.ImageSearch20180319
{
    public class Client : AlibabaCloud.ROAClient.Client
    {

        public Client(AlibabaCloud.ROAClient.Models.Config config): base(config)
        {
            this._endpointRule = "";
            CheckConfig(config);
            this._endpointHost = GetEndpoint("imagesearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
        }


        public SearchItemResponse SearchItemWithOptions(SearchItemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchItemResponse>(DoRequestWithAction("SearchItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/search", AlibabaCloud.TeaUtil.Common.StringifyMapValue(request.Query.ToMap()), request.Headers, null, runtime));
        }

        public async Task<SearchItemResponse> SearchItemWithOptionsAsync(SearchItemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchItemResponse>(await DoRequestWithActionAsync("SearchItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/search", AlibabaCloud.TeaUtil.Common.StringifyMapValue(request.Query.ToMap()), request.Headers, null, runtime));
        }

        public SearchItemResponse SearchItem(SearchItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SearchItemWithOptions(request, runtime);
        }

        public async Task<SearchItemResponse> SearchItemAsync(SearchItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SearchItemWithOptionsAsync(request, runtime);
        }

        public DeleteItemResponse DeleteItemWithOptions(DeleteItemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteItemResponse>(DoRequestWithAction("DeleteItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/delete", AlibabaCloud.TeaUtil.Common.StringifyMapValue(request.Query.ToMap()), request.Headers, null, runtime));
        }

        public async Task<DeleteItemResponse> DeleteItemWithOptionsAsync(DeleteItemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteItemResponse>(await DoRequestWithActionAsync("DeleteItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/delete", AlibabaCloud.TeaUtil.Common.StringifyMapValue(request.Query.ToMap()), request.Headers, null, runtime));
        }

        public DeleteItemResponse DeleteItem(DeleteItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteItemWithOptions(request, runtime);
        }

        public async Task<DeleteItemResponse> DeleteItemAsync(DeleteItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteItemWithOptionsAsync(request, runtime);
        }

        public AddItemResponse AddItemWithOptions(AddItemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddItemResponse>(DoRequestWithAction("AddItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/add", AlibabaCloud.TeaUtil.Common.StringifyMapValue(request.Query.ToMap()), request.Headers, null, runtime));
        }

        public async Task<AddItemResponse> AddItemWithOptionsAsync(AddItemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddItemResponse>(await DoRequestWithActionAsync("AddItem", "2018-03-19", "HTTPS", "POST", "AK", "/item/add", AlibabaCloud.TeaUtil.Common.StringifyMapValue(request.Query.ToMap()), request.Headers, null, runtime));
        }

        public AddItemResponse AddItem(AddItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddItemWithOptions(request, runtime);
        }

        public async Task<AddItemResponse> AddItemAsync(AddItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddItemWithOptionsAsync(request, runtime);
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
