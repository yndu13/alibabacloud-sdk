// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.ShixuanROA20190912.Models;

namespace AlibabaCloud.SDK.ShixuanROA20190912
{
    public class Client : AlibabaCloud.ROAClient.Client
    {

        public Client(AlibabaCloud.ROAClient.Models.Config config): base(config)
        {
            this._endpointRule = "";
            CheckConfig(config);
            this._endpointHost = GetEndpoint("shixuanroa", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpointHost);
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

        /**
         * CreateClusterBakCreateClusterBak
         */
        public CreateClusterBakResponse CreateClusterBak(CreateClusterBakRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateClusterBakWithOptions(request, runtime);
        }

        /**
         * CreateClusterBakCreateClusterBak
         */
        public async Task<CreateClusterBakResponse> CreateClusterBakAsync(CreateClusterBakRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateClusterBakWithOptionsAsync(request, runtime);
        }

        public CreateClusterBakResponse CreateClusterBakWithOptions(CreateClusterBakRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateClusterBakResponse>(DoRequest("2019-09-12", "https", "get", "Anonymous", "/", request.Headers, null, request.Body.ToMap(), runtime));
        }

        public async Task<CreateClusterBakResponse> CreateClusterBakWithOptionsAsync(CreateClusterBakRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateClusterBakResponse>(await DoRequestAsync("2019-09-12", "https", "get", "Anonymous", "/", request.Headers, null, request.Body.ToMap(), runtime));
        }

    }
}
