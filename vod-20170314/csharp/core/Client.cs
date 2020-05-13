// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.vod20170314.Models;

namespace AlibabaCloud.SDK.vod20170314
{
    public class Client : AlibabaCloud.RPCClient.Client
    {

        public Client(AlibabaCloud.RPCClient.Models.Config config): base(config)
        {
            this._endpointRule = "regional";
            this._endpointMap = new Dictionary<string, string>
            {
                {"cn-beijing", "vod.cn-shanghai.aliyuncs.com"},
                {"cn-hangzhou", "vod.cn-shanghai.aliyuncs.com"},
                {"cn-shenzhen", "vod.cn-shanghai.aliyuncs.com"},
                {"ap-northeast-2-pop", "vod.ap-northeast-1.aliyuncs.com"},
                {"ap-southeast-2", "vod.ap-northeast-1.aliyuncs.com"},
                {"ap-southeast-3", "vod.ap-northeast-1.aliyuncs.com"},
                {"cn-beijing-finance-1", "vod.aliyuncs.com"},
                {"cn-beijing-finance-pop", "vod.aliyuncs.com"},
                {"cn-beijing-gov-1", "vod.aliyuncs.com"},
                {"cn-beijing-nu16-b01", "vod.aliyuncs.com"},
                {"cn-chengdu", "vod.aliyuncs.com"},
                {"cn-edge-1", "vod.aliyuncs.com"},
                {"cn-fujian", "vod.aliyuncs.com"},
                {"cn-haidian-cm12-c01", "vod.aliyuncs.com"},
                {"cn-hangzhou-bj-b01", "vod.aliyuncs.com"},
                {"cn-hangzhou-finance", "vod.aliyuncs.com"},
                {"cn-hangzhou-internal-prod-1", "vod.aliyuncs.com"},
                {"cn-hangzhou-internal-test-1", "vod.aliyuncs.com"},
                {"cn-hangzhou-internal-test-2", "vod.aliyuncs.com"},
                {"cn-hangzhou-internal-test-3", "vod.aliyuncs.com"},
                {"cn-hangzhou-test-306", "vod.aliyuncs.com"},
                {"cn-hongkong-finance-pop", "vod.aliyuncs.com"},
                {"cn-huhehaote", "vod.aliyuncs.com"},
                {"cn-qingdao", "vod.aliyuncs.com"},
                {"cn-qingdao-nebula", "vod.aliyuncs.com"},
                {"cn-shanghai-et15-b01", "vod.aliyuncs.com"},
                {"cn-shanghai-et2-b01", "vod.aliyuncs.com"},
                {"cn-shanghai-finance-1", "vod.aliyuncs.com"},
                {"cn-shanghai-inner", "vod.aliyuncs.com"},
                {"cn-shanghai-internal-test-1", "vod.aliyuncs.com"},
                {"cn-shenzhen-finance-1", "vod.aliyuncs.com"},
                {"cn-shenzhen-inner", "vod.aliyuncs.com"},
                {"cn-shenzhen-st4-d01", "vod.aliyuncs.com"},
                {"cn-shenzhen-su18-b01", "vod.aliyuncs.com"},
                {"cn-wuhan", "vod.aliyuncs.com"},
                {"cn-yushanfang", "vod.aliyuncs.com"},
                {"cn-zhangbei-na61-b01", "vod.aliyuncs.com"},
                {"cn-zhangjiakou-na62-a01", "vod.aliyuncs.com"},
                {"cn-zhengzhou-nebula-1", "vod.aliyuncs.com"},
                {"eu-west-1-oxs", "vod.ap-northeast-1.aliyuncs.com"},
                {"me-east-1", "vod.ap-northeast-1.aliyuncs.com"},
                {"rus-west-1-pop", "vod.ap-northeast-1.aliyuncs.com"},
                {"us-east-1", "vod.ap-northeast-1.aliyuncs.com"},
            };
            CheckConfig(config);
            this._endpoint = GetEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
        }


        public DescribeVodDomainISPDataResponse DescribeVodDomainISPDataWithOptions(DescribeVodDomainISPDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainISPDataResponse>(DoRequest("DescribeVodDomainISPData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainISPDataResponse> DescribeVodDomainISPDataWithOptionsAsync(DescribeVodDomainISPDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainISPDataResponse>(await DoRequestAsync("DescribeVodDomainISPData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainISPDataResponse DescribeVodDomainISPData(DescribeVodDomainISPDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainISPDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainISPDataResponse> DescribeVodDomainISPDataAsync(DescribeVodDomainISPDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainISPDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRegionDataResponse DescribeVodDomainRegionDataWithOptions(DescribeVodDomainRegionDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRegionDataResponse>(DoRequest("DescribeVodDomainRegionData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRegionDataResponse> DescribeVodDomainRegionDataWithOptionsAsync(DescribeVodDomainRegionDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRegionDataResponse>(await DoRequestAsync("DescribeVodDomainRegionData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRegionDataResponse DescribeVodDomainRegionData(DescribeVodDomainRegionDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRegionDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRegionDataResponse> DescribeVodDomainRegionDataAsync(DescribeVodDomainRegionDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRegionDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainTopReferVisitResponse DescribeVodDomainTopReferVisitWithOptions(DescribeVodDomainTopReferVisitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainTopReferVisitResponse>(DoRequest("DescribeVodDomainTopReferVisit", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainTopReferVisitResponse> DescribeVodDomainTopReferVisitWithOptionsAsync(DescribeVodDomainTopReferVisitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainTopReferVisitResponse>(await DoRequestAsync("DescribeVodDomainTopReferVisit", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainTopReferVisitResponse DescribeVodDomainTopReferVisit(DescribeVodDomainTopReferVisitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainTopReferVisitWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainTopReferVisitResponse> DescribeVodDomainTopReferVisitAsync(DescribeVodDomainTopReferVisitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainTopReferVisitWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainTopUrlVisitResponse DescribeVodDomainTopUrlVisitWithOptions(DescribeVodDomainTopUrlVisitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainTopUrlVisitResponse>(DoRequest("DescribeVodDomainTopUrlVisit", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainTopUrlVisitResponse> DescribeVodDomainTopUrlVisitWithOptionsAsync(DescribeVodDomainTopUrlVisitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainTopUrlVisitResponse>(await DoRequestAsync("DescribeVodDomainTopUrlVisit", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainTopUrlVisitResponse DescribeVodDomainTopUrlVisit(DescribeVodDomainTopUrlVisitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainTopUrlVisitWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainTopUrlVisitResponse> DescribeVodDomainTopUrlVisitAsync(DescribeVodDomainTopUrlVisitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainTopUrlVisitWithOptionsAsync(request, runtime);
        }

        public DescribeVodTopDomainsByFlowResponse DescribeVodTopDomainsByFlowWithOptions(DescribeVodTopDomainsByFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodTopDomainsByFlowResponse>(DoRequest("DescribeVodTopDomainsByFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodTopDomainsByFlowResponse> DescribeVodTopDomainsByFlowWithOptionsAsync(DescribeVodTopDomainsByFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodTopDomainsByFlowResponse>(await DoRequestAsync("DescribeVodTopDomainsByFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodTopDomainsByFlowResponse DescribeVodTopDomainsByFlow(DescribeVodTopDomainsByFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodTopDomainsByFlowWithOptions(request, runtime);
        }

        public async Task<DescribeVodTopDomainsByFlowResponse> DescribeVodTopDomainsByFlowAsync(DescribeVodTopDomainsByFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodTopDomainsByFlowWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainPvDataResponse DescribeVodDomainPvDataWithOptions(DescribeVodDomainPvDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainPvDataResponse>(DoRequest("DescribeVodDomainPvData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainPvDataResponse> DescribeVodDomainPvDataWithOptionsAsync(DescribeVodDomainPvDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainPvDataResponse>(await DoRequestAsync("DescribeVodDomainPvData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainPvDataResponse DescribeVodDomainPvData(DescribeVodDomainPvDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainPvDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainPvDataResponse> DescribeVodDomainPvDataAsync(DescribeVodDomainPvDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainPvDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainUvDataResponse DescribeVodDomainUvDataWithOptions(DescribeVodDomainUvDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainUvDataResponse>(DoRequest("DescribeVodDomainUvData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainUvDataResponse> DescribeVodDomainUvDataWithOptionsAsync(DescribeVodDomainUvDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainUvDataResponse>(await DoRequestAsync("DescribeVodDomainUvData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainUvDataResponse DescribeVodDomainUvData(DescribeVodDomainUvDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainUvDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainUvDataResponse> DescribeVodDomainUvDataAsync(DescribeVodDomainUvDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainUvDataWithOptionsAsync(request, runtime);
        }

        public GetOSSFlowStatisResponse GetOSSFlowStatisWithOptions(GetOSSFlowStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOSSFlowStatisResponse>(DoRequest("GetOSSFlowStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetOSSFlowStatisResponse> GetOSSFlowStatisWithOptionsAsync(GetOSSFlowStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOSSFlowStatisResponse>(await DoRequestAsync("GetOSSFlowStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetOSSFlowStatisResponse GetOSSFlowStatis(GetOSSFlowStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetOSSFlowStatisWithOptions(request, runtime);
        }

        public async Task<GetOSSFlowStatisResponse> GetOSSFlowStatisAsync(GetOSSFlowStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetOSSFlowStatisWithOptionsAsync(request, runtime);
        }

        public ListAIStatisTypeResponse ListAIStatisTypeWithOptions(ListAIStatisTypeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIStatisTypeResponse>(DoRequest("ListAIStatisType", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIStatisTypeResponse> ListAIStatisTypeWithOptionsAsync(ListAIStatisTypeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIStatisTypeResponse>(await DoRequestAsync("ListAIStatisType", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIStatisTypeResponse ListAIStatisType(ListAIStatisTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIStatisTypeWithOptions(request, runtime);
        }

        public async Task<ListAIStatisTypeResponse> ListAIStatisTypeAsync(ListAIStatisTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIStatisTypeWithOptionsAsync(request, runtime);
        }

        public GetAIStatisResponse GetAIStatisWithOptions(GetAIStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAIStatisResponse>(DoRequest("GetAIStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAIStatisResponse> GetAIStatisWithOptionsAsync(GetAIStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAIStatisResponse>(await DoRequestAsync("GetAIStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAIStatisResponse GetAIStatis(GetAIStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAIStatisWithOptions(request, runtime);
        }

        public async Task<GetAIStatisResponse> GetAIStatisAsync(GetAIStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAIStatisWithOptionsAsync(request, runtime);
        }

        public SetDefaultAITemplateResponse SetDefaultAITemplateWithOptions(SetDefaultAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultAITemplateResponse>(DoRequest("SetDefaultAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetDefaultAITemplateResponse> SetDefaultAITemplateWithOptionsAsync(SetDefaultAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultAITemplateResponse>(await DoRequestAsync("SetDefaultAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetDefaultAITemplateResponse SetDefaultAITemplate(SetDefaultAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetDefaultAITemplateWithOptions(request, runtime);
        }

        public async Task<SetDefaultAITemplateResponse> SetDefaultAITemplateAsync(SetDefaultAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetDefaultAITemplateWithOptionsAsync(request, runtime);
        }

        public GetDefaultAITemplateResponse GetDefaultAITemplateWithOptions(GetDefaultAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDefaultAITemplateResponse>(DoRequest("GetDefaultAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetDefaultAITemplateResponse> GetDefaultAITemplateWithOptionsAsync(GetDefaultAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDefaultAITemplateResponse>(await DoRequestAsync("GetDefaultAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetDefaultAITemplateResponse GetDefaultAITemplate(GetDefaultAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetDefaultAITemplateWithOptions(request, runtime);
        }

        public async Task<GetDefaultAITemplateResponse> GetDefaultAITemplateAsync(GetDefaultAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetDefaultAITemplateWithOptionsAsync(request, runtime);
        }

        public ListAITemplateResponse ListAITemplateWithOptions(ListAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAITemplateResponse>(DoRequest("ListAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAITemplateResponse> ListAITemplateWithOptionsAsync(ListAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAITemplateResponse>(await DoRequestAsync("ListAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAITemplateResponse ListAITemplate(ListAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAITemplateWithOptions(request, runtime);
        }

        public async Task<ListAITemplateResponse> ListAITemplateAsync(ListAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAITemplateWithOptionsAsync(request, runtime);
        }

        public GetAITemplateResponse GetAITemplateWithOptions(GetAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAITemplateResponse>(DoRequest("GetAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAITemplateResponse> GetAITemplateWithOptionsAsync(GetAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAITemplateResponse>(await DoRequestAsync("GetAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAITemplateResponse GetAITemplate(GetAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAITemplateWithOptions(request, runtime);
        }

        public async Task<GetAITemplateResponse> GetAITemplateAsync(GetAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAITemplateWithOptionsAsync(request, runtime);
        }

        public UpdateAITemplateResponse UpdateAITemplateWithOptions(UpdateAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAITemplateResponse>(DoRequest("UpdateAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateAITemplateResponse> UpdateAITemplateWithOptionsAsync(UpdateAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAITemplateResponse>(await DoRequestAsync("UpdateAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateAITemplateResponse UpdateAITemplate(UpdateAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateAITemplateWithOptions(request, runtime);
        }

        public async Task<UpdateAITemplateResponse> UpdateAITemplateAsync(UpdateAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateAITemplateWithOptionsAsync(request, runtime);
        }

        public DeleteAITemplateResponse DeleteAITemplateWithOptions(DeleteAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAITemplateResponse>(DoRequest("DeleteAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteAITemplateResponse> DeleteAITemplateWithOptionsAsync(DeleteAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAITemplateResponse>(await DoRequestAsync("DeleteAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteAITemplateResponse DeleteAITemplate(DeleteAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteAITemplateWithOptions(request, runtime);
        }

        public async Task<DeleteAITemplateResponse> DeleteAITemplateAsync(DeleteAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteAITemplateWithOptionsAsync(request, runtime);
        }

        public AddAITemplateResponse AddAITemplateWithOptions(AddAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAITemplateResponse>(DoRequest("AddAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddAITemplateResponse> AddAITemplateWithOptionsAsync(AddAITemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAITemplateResponse>(await DoRequestAsync("AddAITemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddAITemplateResponse AddAITemplate(AddAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddAITemplateWithOptions(request, runtime);
        }

        public async Task<AddAITemplateResponse> AddAITemplateAsync(AddAITemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddAITemplateWithOptionsAsync(request, runtime);
        }

        public GetMediaAuditResultTimelineResponse GetMediaAuditResultTimelineWithOptions(GetMediaAuditResultTimelineRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaAuditResultTimelineResponse>(DoRequest("GetMediaAuditResultTimeline", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMediaAuditResultTimelineResponse> GetMediaAuditResultTimelineWithOptionsAsync(GetMediaAuditResultTimelineRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaAuditResultTimelineResponse>(await DoRequestAsync("GetMediaAuditResultTimeline", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMediaAuditResultTimelineResponse GetMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMediaAuditResultTimelineWithOptions(request, runtime);
        }

        public async Task<GetMediaAuditResultTimelineResponse> GetMediaAuditResultTimelineAsync(GetMediaAuditResultTimelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMediaAuditResultTimelineWithOptionsAsync(request, runtime);
        }

        public GetMediaAuditResultDetailResponse GetMediaAuditResultDetailWithOptions(GetMediaAuditResultDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaAuditResultDetailResponse>(DoRequest("GetMediaAuditResultDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMediaAuditResultDetailResponse> GetMediaAuditResultDetailWithOptionsAsync(GetMediaAuditResultDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaAuditResultDetailResponse>(await DoRequestAsync("GetMediaAuditResultDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMediaAuditResultDetailResponse GetMediaAuditResultDetail(GetMediaAuditResultDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMediaAuditResultDetailWithOptions(request, runtime);
        }

        public async Task<GetMediaAuditResultDetailResponse> GetMediaAuditResultDetailAsync(GetMediaAuditResultDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMediaAuditResultDetailWithOptionsAsync(request, runtime);
        }

        public GetMediaAuditResultResponse GetMediaAuditResultWithOptions(GetMediaAuditResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaAuditResultResponse>(DoRequest("GetMediaAuditResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMediaAuditResultResponse> GetMediaAuditResultWithOptionsAsync(GetMediaAuditResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaAuditResultResponse>(await DoRequestAsync("GetMediaAuditResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMediaAuditResultResponse GetMediaAuditResult(GetMediaAuditResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMediaAuditResultWithOptions(request, runtime);
        }

        public async Task<GetMediaAuditResultResponse> GetMediaAuditResultAsync(GetMediaAuditResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMediaAuditResultWithOptionsAsync(request, runtime);
        }

        public SubmitAIMediaAuditJobResponse SubmitAIMediaAuditJobWithOptions(SubmitAIMediaAuditJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIMediaAuditJobResponse>(DoRequest("SubmitAIMediaAuditJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIMediaAuditJobResponse> SubmitAIMediaAuditJobWithOptionsAsync(SubmitAIMediaAuditJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIMediaAuditJobResponse>(await DoRequestAsync("SubmitAIMediaAuditJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIMediaAuditJobResponse SubmitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIMediaAuditJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIMediaAuditJobResponse> SubmitAIMediaAuditJobAsync(SubmitAIMediaAuditJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIMediaAuditJobWithOptionsAsync(request, runtime);
        }

        public GetAIMediaAuditJobResponse GetAIMediaAuditJobWithOptions(GetAIMediaAuditJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAIMediaAuditJobResponse>(DoRequest("GetAIMediaAuditJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAIMediaAuditJobResponse> GetAIMediaAuditJobWithOptionsAsync(GetAIMediaAuditJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAIMediaAuditJobResponse>(await DoRequestAsync("GetAIMediaAuditJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAIMediaAuditJobResponse GetAIMediaAuditJob(GetAIMediaAuditJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAIMediaAuditJobWithOptions(request, runtime);
        }

        public async Task<GetAIMediaAuditJobResponse> GetAIMediaAuditJobAsync(GetAIMediaAuditJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAIMediaAuditJobWithOptionsAsync(request, runtime);
        }

        public DisplayAIAuditSwitchResponse DisplayAIAuditSwitchWithOptions(DisplayAIAuditSwitchRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisplayAIAuditSwitchResponse>(DoRequest("DisplayAIAuditSwitch", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DisplayAIAuditSwitchResponse> DisplayAIAuditSwitchWithOptionsAsync(DisplayAIAuditSwitchRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisplayAIAuditSwitchResponse>(await DoRequestAsync("DisplayAIAuditSwitch", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DisplayAIAuditSwitchResponse DisplayAIAuditSwitch(DisplayAIAuditSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DisplayAIAuditSwitchWithOptions(request, runtime);
        }

        public async Task<DisplayAIAuditSwitchResponse> DisplayAIAuditSwitchAsync(DisplayAIAuditSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DisplayAIAuditSwitchWithOptionsAsync(request, runtime);
        }

        public DescribePlayVideoStatisResponse DescribePlayVideoStatisWithOptions(DescribePlayVideoStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribePlayVideoStatisResponse>(DoRequest("DescribePlayVideoStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribePlayVideoStatisResponse> DescribePlayVideoStatisWithOptionsAsync(DescribePlayVideoStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribePlayVideoStatisResponse>(await DoRequestAsync("DescribePlayVideoStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribePlayVideoStatisResponse DescribePlayVideoStatis(DescribePlayVideoStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribePlayVideoStatisWithOptions(request, runtime);
        }

        public async Task<DescribePlayVideoStatisResponse> DescribePlayVideoStatisAsync(DescribePlayVideoStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribePlayVideoStatisWithOptionsAsync(request, runtime);
        }

        public TransferMediaDataResponse TransferMediaDataWithOptions(TransferMediaDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferMediaDataResponse>(DoRequest("TransferMediaData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<TransferMediaDataResponse> TransferMediaDataWithOptionsAsync(TransferMediaDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferMediaDataResponse>(await DoRequestAsync("TransferMediaData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public TransferMediaDataResponse TransferMediaData(TransferMediaDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return TransferMediaDataWithOptions(request, runtime);
        }

        public async Task<TransferMediaDataResponse> TransferMediaDataAsync(TransferMediaDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await TransferMediaDataWithOptionsAsync(request, runtime);
        }

        public CreateUploadAttachedMediaResponse CreateUploadAttachedMediaWithOptions(CreateUploadAttachedMediaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadAttachedMediaResponse>(DoRequest("CreateUploadAttachedMedia", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateUploadAttachedMediaResponse> CreateUploadAttachedMediaWithOptionsAsync(CreateUploadAttachedMediaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadAttachedMediaResponse>(await DoRequestAsync("CreateUploadAttachedMedia", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateUploadAttachedMediaResponse CreateUploadAttachedMedia(CreateUploadAttachedMediaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateUploadAttachedMediaWithOptions(request, runtime);
        }

        public async Task<CreateUploadAttachedMediaResponse> CreateUploadAttachedMediaAsync(CreateUploadAttachedMediaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateUploadAttachedMediaWithOptionsAsync(request, runtime);
        }

        public GetUploadProgressResponse GetUploadProgressWithOptions(GetUploadProgressRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUploadProgressResponse>(DoRequest("GetUploadProgress", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public async Task<GetUploadProgressResponse> GetUploadProgressWithOptionsAsync(GetUploadProgressRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUploadProgressResponse>(await DoRequestAsync("GetUploadProgress", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public GetUploadProgressResponse GetUploadProgress(GetUploadProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetUploadProgressWithOptions(request, runtime);
        }

        public async Task<GetUploadProgressResponse> GetUploadProgressAsync(GetUploadProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetUploadProgressWithOptionsAsync(request, runtime);
        }

        public UpdateVodTemplateResponse UpdateVodTemplateWithOptions(UpdateVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVodTemplateResponse>(DoRequest("UpdateVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateVodTemplateResponse> UpdateVodTemplateWithOptionsAsync(UpdateVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVodTemplateResponse>(await DoRequestAsync("UpdateVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateVodTemplateResponse UpdateVodTemplate(UpdateVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateVodTemplateWithOptions(request, runtime);
        }

        public async Task<UpdateVodTemplateResponse> UpdateVodTemplateAsync(UpdateVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateVodTemplateWithOptionsAsync(request, runtime);
        }

        public SetDefaultVodTemplateResponse SetDefaultVodTemplateWithOptions(SetDefaultVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultVodTemplateResponse>(DoRequest("SetDefaultVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetDefaultVodTemplateResponse> SetDefaultVodTemplateWithOptionsAsync(SetDefaultVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultVodTemplateResponse>(await DoRequestAsync("SetDefaultVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetDefaultVodTemplateResponse SetDefaultVodTemplate(SetDefaultVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetDefaultVodTemplateWithOptions(request, runtime);
        }

        public async Task<SetDefaultVodTemplateResponse> SetDefaultVodTemplateAsync(SetDefaultVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetDefaultVodTemplateWithOptionsAsync(request, runtime);
        }

        public ListVodTemplateResponse ListVodTemplateWithOptions(ListVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListVodTemplateResponse>(DoRequest("ListVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListVodTemplateResponse> ListVodTemplateWithOptionsAsync(ListVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListVodTemplateResponse>(await DoRequestAsync("ListVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListVodTemplateResponse ListVodTemplate(ListVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListVodTemplateWithOptions(request, runtime);
        }

        public async Task<ListVodTemplateResponse> ListVodTemplateAsync(ListVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListVodTemplateWithOptionsAsync(request, runtime);
        }

        public GetVodTemplateResponse GetVodTemplateWithOptions(GetVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVodTemplateResponse>(DoRequest("GetVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVodTemplateResponse> GetVodTemplateWithOptionsAsync(GetVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVodTemplateResponse>(await DoRequestAsync("GetVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVodTemplateResponse GetVodTemplate(GetVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVodTemplateWithOptions(request, runtime);
        }

        public async Task<GetVodTemplateResponse> GetVodTemplateAsync(GetVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVodTemplateWithOptionsAsync(request, runtime);
        }

        public DeleteVodTemplateResponse DeleteVodTemplateWithOptions(DeleteVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVodTemplateResponse>(DoRequest("DeleteVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteVodTemplateResponse> DeleteVodTemplateWithOptionsAsync(DeleteVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVodTemplateResponse>(await DoRequestAsync("DeleteVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteVodTemplateResponse DeleteVodTemplate(DeleteVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteVodTemplateWithOptions(request, runtime);
        }

        public async Task<DeleteVodTemplateResponse> DeleteVodTemplateAsync(DeleteVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteVodTemplateWithOptionsAsync(request, runtime);
        }

        public AddVodTemplateResponse AddVodTemplateWithOptions(AddVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddVodTemplateResponse>(DoRequest("AddVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddVodTemplateResponse> AddVodTemplateWithOptionsAsync(AddVodTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddVodTemplateResponse>(await DoRequestAsync("AddVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddVodTemplateResponse AddVodTemplate(AddVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddVodTemplateWithOptions(request, runtime);
        }

        public async Task<AddVodTemplateResponse> AddVodTemplateAsync(AddVodTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddVodTemplateWithOptionsAsync(request, runtime);
        }

        public GetMediaDNAResultResponse GetMediaDNAResultWithOptions(GetMediaDNAResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaDNAResultResponse>(DoRequest("GetMediaDNAResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMediaDNAResultResponse> GetMediaDNAResultWithOptionsAsync(GetMediaDNAResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaDNAResultResponse>(await DoRequestAsync("GetMediaDNAResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMediaDNAResultResponse GetMediaDNAResult(GetMediaDNAResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMediaDNAResultWithOptions(request, runtime);
        }

        public async Task<GetMediaDNAResultResponse> GetMediaDNAResultAsync(GetMediaDNAResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMediaDNAResultWithOptionsAsync(request, runtime);
        }

        public DeleteMezzaninesResponse DeleteMezzaninesWithOptions(DeleteMezzaninesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMezzaninesResponse>(DoRequest("DeleteMezzanines", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteMezzaninesResponse> DeleteMezzaninesWithOptionsAsync(DeleteMezzaninesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMezzaninesResponse>(await DoRequestAsync("DeleteMezzanines", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteMezzaninesResponse DeleteMezzanines(DeleteMezzaninesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteMezzaninesWithOptions(request, runtime);
        }

        public async Task<DeleteMezzaninesResponse> DeleteMezzaninesAsync(DeleteMezzaninesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteMezzaninesWithOptionsAsync(request, runtime);
        }

        public UpdateImageInfosResponse UpdateImageInfosWithOptions(UpdateImageInfosRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImageInfosResponse>(DoRequest("UpdateImageInfos", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateImageInfosResponse> UpdateImageInfosWithOptionsAsync(UpdateImageInfosRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImageInfosResponse>(await DoRequestAsync("UpdateImageInfos", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateImageInfosResponse UpdateImageInfos(UpdateImageInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateImageInfosWithOptions(request, runtime);
        }

        public async Task<UpdateImageInfosResponse> UpdateImageInfosAsync(UpdateImageInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateImageInfosWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainUsageDataResponse DescribeVodDomainUsageDataWithOptions(DescribeVodDomainUsageDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainUsageDataResponse>(DoRequest("DescribeVodDomainUsageData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainUsageDataResponse> DescribeVodDomainUsageDataWithOptionsAsync(DescribeVodDomainUsageDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainUsageDataResponse>(await DoRequestAsync("DescribeVodDomainUsageData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainUsageDataResponse DescribeVodDomainUsageData(DescribeVodDomainUsageDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainUsageDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainUsageDataResponse> DescribeVodDomainUsageDataAsync(DescribeVodDomainUsageDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainUsageDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainTrafficDataResponse DescribeVodDomainTrafficDataWithOptions(DescribeVodDomainTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainTrafficDataResponse>(DoRequest("DescribeVodDomainTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainTrafficDataResponse> DescribeVodDomainTrafficDataWithOptionsAsync(DescribeVodDomainTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainTrafficDataResponse>(await DoRequestAsync("DescribeVodDomainTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainTrafficDataResponse DescribeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainTrafficDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainTrafficDataResponse> DescribeVodDomainTrafficDataAsync(DescribeVodDomainTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainTrafficDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainsUsageByDayResponse DescribeVodDomainsUsageByDayWithOptions(DescribeVodDomainsUsageByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainsUsageByDayResponse>(DoRequest("DescribeVodDomainsUsageByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainsUsageByDayResponse> DescribeVodDomainsUsageByDayWithOptionsAsync(DescribeVodDomainsUsageByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainsUsageByDayResponse>(await DoRequestAsync("DescribeVodDomainsUsageByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainsUsageByDayResponse DescribeVodDomainsUsageByDay(DescribeVodDomainsUsageByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainsUsageByDayWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainsUsageByDayResponse> DescribeVodDomainsUsageByDayAsync(DescribeVodDomainsUsageByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainsUsageByDayWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainSrcTrafficDataResponse DescribeVodDomainSrcTrafficDataWithOptions(DescribeVodDomainSrcTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainSrcTrafficDataResponse>(DoRequest("DescribeVodDomainSrcTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainSrcTrafficDataResponse> DescribeVodDomainSrcTrafficDataWithOptionsAsync(DescribeVodDomainSrcTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainSrcTrafficDataResponse>(await DoRequestAsync("DescribeVodDomainSrcTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainSrcTrafficDataResponse DescribeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainSrcTrafficDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainSrcTrafficDataResponse> DescribeVodDomainSrcTrafficDataAsync(DescribeVodDomainSrcTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainSrcTrafficDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainSrcBpsDataResponse DescribeVodDomainSrcBpsDataWithOptions(DescribeVodDomainSrcBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainSrcBpsDataResponse>(DoRequest("DescribeVodDomainSrcBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainSrcBpsDataResponse> DescribeVodDomainSrcBpsDataWithOptionsAsync(DescribeVodDomainSrcBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainSrcBpsDataResponse>(await DoRequestAsync("DescribeVodDomainSrcBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainSrcBpsDataResponse DescribeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainSrcBpsDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainSrcBpsDataResponse> DescribeVodDomainSrcBpsDataAsync(DescribeVodDomainSrcBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainSrcBpsDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeTrafficDataResponse DescribeVodDomainRealTimeTrafficDataWithOptions(DescribeVodDomainRealTimeTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeTrafficDataResponse>(DoRequest("DescribeVodDomainRealTimeTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeTrafficDataResponse> DescribeVodDomainRealTimeTrafficDataWithOptionsAsync(DescribeVodDomainRealTimeTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeTrafficDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeTrafficDataResponse DescribeVodDomainRealTimeTrafficData(DescribeVodDomainRealTimeTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeTrafficDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeTrafficDataResponse> DescribeVodDomainRealTimeTrafficDataAsync(DescribeVodDomainRealTimeTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeTrafficDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeSrcTrafficDataResponse DescribeVodDomainRealTimeSrcTrafficDataWithOptions(DescribeVodDomainRealTimeSrcTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeSrcTrafficDataResponse>(DoRequest("DescribeVodDomainRealTimeSrcTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeSrcTrafficDataResponse> DescribeVodDomainRealTimeSrcTrafficDataWithOptionsAsync(DescribeVodDomainRealTimeSrcTrafficDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeSrcTrafficDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeSrcTrafficData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeSrcTrafficDataResponse DescribeVodDomainRealTimeSrcTrafficData(DescribeVodDomainRealTimeSrcTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeSrcTrafficDataResponse> DescribeVodDomainRealTimeSrcTrafficDataAsync(DescribeVodDomainRealTimeSrcTrafficDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeSrcTrafficDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeSrcBpsDataResponse DescribeVodDomainRealTimeSrcBpsDataWithOptions(DescribeVodDomainRealTimeSrcBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeSrcBpsDataResponse>(DoRequest("DescribeVodDomainRealTimeSrcBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeSrcBpsDataResponse> DescribeVodDomainRealTimeSrcBpsDataWithOptionsAsync(DescribeVodDomainRealTimeSrcBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeSrcBpsDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeSrcBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeSrcBpsDataResponse DescribeVodDomainRealTimeSrcBpsData(DescribeVodDomainRealTimeSrcBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeSrcBpsDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeSrcBpsDataResponse> DescribeVodDomainRealTimeSrcBpsDataAsync(DescribeVodDomainRealTimeSrcBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeSrcBpsDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeReqHitRateDataResponse DescribeVodDomainRealTimeReqHitRateDataWithOptions(DescribeVodDomainRealTimeReqHitRateDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeReqHitRateDataResponse>(DoRequest("DescribeVodDomainRealTimeReqHitRateData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeReqHitRateDataResponse> DescribeVodDomainRealTimeReqHitRateDataWithOptionsAsync(DescribeVodDomainRealTimeReqHitRateDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeReqHitRateDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeReqHitRateData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeReqHitRateDataResponse DescribeVodDomainRealTimeReqHitRateData(DescribeVodDomainRealTimeReqHitRateDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeReqHitRateDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeReqHitRateDataResponse> DescribeVodDomainRealTimeReqHitRateDataAsync(DescribeVodDomainRealTimeReqHitRateDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeReqHitRateDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeQpsDataResponse DescribeVodDomainRealTimeQpsDataWithOptions(DescribeVodDomainRealTimeQpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeQpsDataResponse>(DoRequest("DescribeVodDomainRealTimeQpsData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeQpsDataResponse> DescribeVodDomainRealTimeQpsDataWithOptionsAsync(DescribeVodDomainRealTimeQpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeQpsDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeQpsData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeQpsDataResponse DescribeVodDomainRealTimeQpsData(DescribeVodDomainRealTimeQpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeQpsDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeQpsDataResponse> DescribeVodDomainRealTimeQpsDataAsync(DescribeVodDomainRealTimeQpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeQpsDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeHttpCodeDataResponse DescribeVodDomainRealTimeHttpCodeDataWithOptions(DescribeVodDomainRealTimeHttpCodeDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeHttpCodeDataResponse>(DoRequest("DescribeVodDomainRealTimeHttpCodeData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeHttpCodeDataResponse> DescribeVodDomainRealTimeHttpCodeDataWithOptionsAsync(DescribeVodDomainRealTimeHttpCodeDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeHttpCodeDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeHttpCodeData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeHttpCodeDataResponse DescribeVodDomainRealTimeHttpCodeData(DescribeVodDomainRealTimeHttpCodeDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeHttpCodeDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeHttpCodeDataResponse> DescribeVodDomainRealTimeHttpCodeDataAsync(DescribeVodDomainRealTimeHttpCodeDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeHttpCodeDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeByteHitRateDataResponse DescribeVodDomainRealTimeByteHitRateDataWithOptions(DescribeVodDomainRealTimeByteHitRateDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeByteHitRateDataResponse>(DoRequest("DescribeVodDomainRealTimeByteHitRateData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeByteHitRateDataResponse> DescribeVodDomainRealTimeByteHitRateDataWithOptionsAsync(DescribeVodDomainRealTimeByteHitRateDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeByteHitRateDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeByteHitRateData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeByteHitRateDataResponse DescribeVodDomainRealTimeByteHitRateData(DescribeVodDomainRealTimeByteHitRateDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeByteHitRateDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeByteHitRateDataResponse> DescribeVodDomainRealTimeByteHitRateDataAsync(DescribeVodDomainRealTimeByteHitRateDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeByteHitRateDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainRealTimeBpsDataResponse DescribeVodDomainRealTimeBpsDataWithOptions(DescribeVodDomainRealTimeBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeBpsDataResponse>(DoRequest("DescribeVodDomainRealTimeBpsData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainRealTimeBpsDataResponse> DescribeVodDomainRealTimeBpsDataWithOptionsAsync(DescribeVodDomainRealTimeBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainRealTimeBpsDataResponse>(await DoRequestAsync("DescribeVodDomainRealTimeBpsData", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainRealTimeBpsDataResponse DescribeVodDomainRealTimeBpsData(DescribeVodDomainRealTimeBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainRealTimeBpsDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainRealTimeBpsDataResponse> DescribeVodDomainRealTimeBpsDataAsync(DescribeVodDomainRealTimeBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainRealTimeBpsDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainQpsDataResponse DescribeVodDomainQpsDataWithOptions(DescribeVodDomainQpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainQpsDataResponse>(DoRequest("DescribeVodDomainQpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainQpsDataResponse> DescribeVodDomainQpsDataWithOptionsAsync(DescribeVodDomainQpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainQpsDataResponse>(await DoRequestAsync("DescribeVodDomainQpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainQpsDataResponse DescribeVodDomainQpsData(DescribeVodDomainQpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainQpsDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainQpsDataResponse> DescribeVodDomainQpsDataAsync(DescribeVodDomainQpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainQpsDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainHttpCodeDataResponse DescribeVodDomainHttpCodeDataWithOptions(DescribeVodDomainHttpCodeDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainHttpCodeDataResponse>(DoRequest("DescribeVodDomainHttpCodeData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainHttpCodeDataResponse> DescribeVodDomainHttpCodeDataWithOptionsAsync(DescribeVodDomainHttpCodeDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainHttpCodeDataResponse>(await DoRequestAsync("DescribeVodDomainHttpCodeData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainHttpCodeDataResponse DescribeVodDomainHttpCodeData(DescribeVodDomainHttpCodeDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainHttpCodeDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainHttpCodeDataResponse> DescribeVodDomainHttpCodeDataAsync(DescribeVodDomainHttpCodeDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainHttpCodeDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainHitRateDataResponse DescribeVodDomainHitRateDataWithOptions(DescribeVodDomainHitRateDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainHitRateDataResponse>(DoRequest("DescribeVodDomainHitRateData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainHitRateDataResponse> DescribeVodDomainHitRateDataWithOptionsAsync(DescribeVodDomainHitRateDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainHitRateDataResponse>(await DoRequestAsync("DescribeVodDomainHitRateData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainHitRateDataResponse DescribeVodDomainHitRateData(DescribeVodDomainHitRateDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainHitRateDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainHitRateDataResponse> DescribeVodDomainHitRateDataAsync(DescribeVodDomainHitRateDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainHitRateDataWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainBpsDataResponse DescribeVodDomainBpsDataWithOptions(DescribeVodDomainBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainBpsDataResponse>(DoRequest("DescribeVodDomainBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainBpsDataResponse> DescribeVodDomainBpsDataWithOptionsAsync(DescribeVodDomainBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainBpsDataResponse>(await DoRequestAsync("DescribeVodDomainBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainBpsDataResponse DescribeVodDomainBpsData(DescribeVodDomainBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainBpsDataWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainBpsDataResponse> DescribeVodDomainBpsDataAsync(DescribeVodDomainBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainBpsDataWithOptionsAsync(request, runtime);
        }

        public GetVideoDNAResultResponse GetVideoDNAResultWithOptions(GetVideoDNAResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoDNAResultResponse>(DoRequest("GetVideoDNAResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoDNAResultResponse> GetVideoDNAResultWithOptionsAsync(GetVideoDNAResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoDNAResultResponse>(await DoRequestAsync("GetVideoDNAResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoDNAResultResponse GetVideoDNAResult(GetVideoDNAResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoDNAResultWithOptions(request, runtime);
        }

        public async Task<GetVideoDNAResultResponse> GetVideoDNAResultAsync(GetVideoDNAResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoDNAResultWithOptionsAsync(request, runtime);
        }

        public DescribeVodCertificateDetailResponse DescribeVodCertificateDetailWithOptions(DescribeVodCertificateDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodCertificateDetailResponse>(DoRequest("DescribeVodCertificateDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodCertificateDetailResponse> DescribeVodCertificateDetailWithOptionsAsync(DescribeVodCertificateDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodCertificateDetailResponse>(await DoRequestAsync("DescribeVodCertificateDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodCertificateDetailResponse DescribeVodCertificateDetail(DescribeVodCertificateDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodCertificateDetailWithOptions(request, runtime);
        }

        public async Task<DescribeVodCertificateDetailResponse> DescribeVodCertificateDetailAsync(DescribeVodCertificateDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodCertificateDetailWithOptionsAsync(request, runtime);
        }

        public DeleteImageResponse DeleteImageWithOptions(DeleteImageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteImageResponse>(DoRequest("DeleteImage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteImageResponse> DeleteImageWithOptionsAsync(DeleteImageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteImageResponse>(await DoRequestAsync("DeleteImage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteImageResponse DeleteImage(DeleteImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteImageWithOptions(request, runtime);
        }

        public async Task<DeleteImageResponse> DeleteImageAsync(DeleteImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteImageWithOptionsAsync(request, runtime);
        }

        public GetAuditResultDetailResponse GetAuditResultDetailWithOptions(GetAuditResultDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuditResultDetailResponse>(DoRequest("GetAuditResultDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAuditResultDetailResponse> GetAuditResultDetailWithOptionsAsync(GetAuditResultDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuditResultDetailResponse>(await DoRequestAsync("GetAuditResultDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAuditResultDetailResponse GetAuditResultDetail(GetAuditResultDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAuditResultDetailWithOptions(request, runtime);
        }

        public async Task<GetAuditResultDetailResponse> GetAuditResultDetailAsync(GetAuditResultDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAuditResultDetailWithOptionsAsync(request, runtime);
        }

        public GetMediaStreamResponse GetMediaStreamWithOptions(GetMediaStreamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaStreamResponse>(DoRequest("GetMediaStream", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMediaStreamResponse> GetMediaStreamWithOptionsAsync(GetMediaStreamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaStreamResponse>(await DoRequestAsync("GetMediaStream", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMediaStreamResponse GetMediaStream(GetMediaStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMediaStreamWithOptions(request, runtime);
        }

        public async Task<GetMediaStreamResponse> GetMediaStreamAsync(GetMediaStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMediaStreamWithOptionsAsync(request, runtime);
        }

        public PayOrderCallbackResponse PayOrderCallbackWithOptions(PayOrderCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayOrderCallbackResponse>(DoRequest("PayOrderCallback", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<PayOrderCallbackResponse> PayOrderCallbackWithOptionsAsync(PayOrderCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayOrderCallbackResponse>(await DoRequestAsync("PayOrderCallback", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public PayOrderCallbackResponse PayOrderCallback(PayOrderCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return PayOrderCallbackWithOptions(request, runtime);
        }

        public async Task<PayOrderCallbackResponse> PayOrderCallbackAsync(PayOrderCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await PayOrderCallbackWithOptionsAsync(request, runtime);
        }

        public ModifyResponse ModifyWithOptions(ModifyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifyResponse>(DoRequest("Modify", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ModifyResponse> ModifyWithOptionsAsync(ModifyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifyResponse>(await DoRequestAsync("Modify", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ModifyResponse Modify(ModifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ModifyWithOptions(request, runtime);
        }

        public async Task<ModifyResponse> ModifyAsync(ModifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ModifyWithOptionsAsync(request, runtime);
        }

        public CompleteOrderParamResponse CompleteOrderParamWithOptions(CompleteOrderParamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CompleteOrderParamResponse>(DoRequest("CompleteOrderParam", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CompleteOrderParamResponse> CompleteOrderParamWithOptionsAsync(CompleteOrderParamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CompleteOrderParamResponse>(await DoRequestAsync("CompleteOrderParam", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CompleteOrderParamResponse CompleteOrderParam(CompleteOrderParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CompleteOrderParamWithOptions(request, runtime);
        }

        public async Task<CompleteOrderParamResponse> CompleteOrderParamAsync(CompleteOrderParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CompleteOrderParamWithOptionsAsync(request, runtime);
        }

        public UpdateTemplateGroupDaemonResponse UpdateTemplateGroupDaemonWithOptions(UpdateTemplateGroupDaemonRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTemplateGroupDaemonResponse>(DoRequest("UpdateTemplateGroupDaemon", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateTemplateGroupDaemonResponse> UpdateTemplateGroupDaemonWithOptionsAsync(UpdateTemplateGroupDaemonRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTemplateGroupDaemonResponse>(await DoRequestAsync("UpdateTemplateGroupDaemon", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateTemplateGroupDaemonResponse UpdateTemplateGroupDaemon(UpdateTemplateGroupDaemonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateTemplateGroupDaemonWithOptions(request, runtime);
        }

        public async Task<UpdateTemplateGroupDaemonResponse> UpdateTemplateGroupDaemonAsync(UpdateTemplateGroupDaemonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateTemplateGroupDaemonWithOptionsAsync(request, runtime);
        }

        public CreateKMSServiceKeyResponse CreateKMSServiceKeyWithOptions(CreateKMSServiceKeyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKMSServiceKeyResponse>(DoRequest("CreateKMSServiceKey", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateKMSServiceKeyResponse> CreateKMSServiceKeyWithOptionsAsync(CreateKMSServiceKeyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKMSServiceKeyResponse>(await DoRequestAsync("CreateKMSServiceKey", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateKMSServiceKeyResponse CreateKMSServiceKey(CreateKMSServiceKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateKMSServiceKeyWithOptions(request, runtime);
        }

        public async Task<CreateKMSServiceKeyResponse> CreateKMSServiceKeyAsync(CreateKMSServiceKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateKMSServiceKeyWithOptionsAsync(request, runtime);
        }

        public SetAuditSecurityIpResponse SetAuditSecurityIpWithOptions(SetAuditSecurityIpRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetAuditSecurityIpResponse>(DoRequest("SetAuditSecurityIp", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetAuditSecurityIpResponse> SetAuditSecurityIpWithOptionsAsync(SetAuditSecurityIpRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetAuditSecurityIpResponse>(await DoRequestAsync("SetAuditSecurityIp", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetAuditSecurityIpResponse SetAuditSecurityIp(SetAuditSecurityIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetAuditSecurityIpWithOptions(request, runtime);
        }

        public async Task<SetAuditSecurityIpResponse> SetAuditSecurityIpAsync(SetAuditSecurityIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetAuditSecurityIpWithOptionsAsync(request, runtime);
        }

        public ListAuditSecurityIpResponse ListAuditSecurityIpWithOptions(ListAuditSecurityIpRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuditSecurityIpResponse>(DoRequest("ListAuditSecurityIp", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAuditSecurityIpResponse> ListAuditSecurityIpWithOptionsAsync(ListAuditSecurityIpRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuditSecurityIpResponse>(await DoRequestAsync("ListAuditSecurityIp", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAuditSecurityIpResponse ListAuditSecurityIp(ListAuditSecurityIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAuditSecurityIpWithOptions(request, runtime);
        }

        public async Task<ListAuditSecurityIpResponse> ListAuditSecurityIpAsync(ListAuditSecurityIpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAuditSecurityIpWithOptionsAsync(request, runtime);
        }

        public GetVideoInfosResponse GetVideoInfosWithOptions(GetVideoInfosRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoInfosResponse>(DoRequest("GetVideoInfos", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoInfosResponse> GetVideoInfosWithOptionsAsync(GetVideoInfosRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoInfosResponse>(await DoRequestAsync("GetVideoInfos", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoInfosResponse GetVideoInfos(GetVideoInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoInfosWithOptions(request, runtime);
        }

        public async Task<GetVideoInfosResponse> GetVideoInfosAsync(GetVideoInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoInfosWithOptionsAsync(request, runtime);
        }

        public AssumeOssRoleResponse AssumeOssRoleWithOptions(AssumeOssRoleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeOssRoleResponse>(DoRequest("AssumeOssRole", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public async Task<AssumeOssRoleResponse> AssumeOssRoleWithOptionsAsync(AssumeOssRoleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeOssRoleResponse>(await DoRequestAsync("AssumeOssRole", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public AssumeOssRoleResponse AssumeOssRole(AssumeOssRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AssumeOssRoleWithOptions(request, runtime);
        }

        public async Task<AssumeOssRoleResponse> AssumeOssRoleAsync(AssumeOssRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AssumeOssRoleWithOptionsAsync(request, runtime);
        }

        public UpdateVodDomainResponse UpdateVodDomainWithOptions(UpdateVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVodDomainResponse>(DoRequest("UpdateVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateVodDomainResponse> UpdateVodDomainWithOptionsAsync(UpdateVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVodDomainResponse>(await DoRequestAsync("UpdateVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateVodDomainResponse UpdateVodDomain(UpdateVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateVodDomainWithOptions(request, runtime);
        }

        public async Task<UpdateVodDomainResponse> UpdateVodDomainAsync(UpdateVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateVodDomainWithOptionsAsync(request, runtime);
        }

        public StopVodDomainResponse StopVodDomainWithOptions(StopVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopVodDomainResponse>(DoRequest("StopVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<StopVodDomainResponse> StopVodDomainWithOptionsAsync(StopVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopVodDomainResponse>(await DoRequestAsync("StopVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public StopVodDomainResponse StopVodDomain(StopVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return StopVodDomainWithOptions(request, runtime);
        }

        public async Task<StopVodDomainResponse> StopVodDomainAsync(StopVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await StopVodDomainWithOptionsAsync(request, runtime);
        }

        public StartVodDomainResponse StartVodDomainWithOptions(StartVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartVodDomainResponse>(DoRequest("StartVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<StartVodDomainResponse> StartVodDomainWithOptionsAsync(StartVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartVodDomainResponse>(await DoRequestAsync("StartVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public StartVodDomainResponse StartVodDomain(StartVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return StartVodDomainWithOptions(request, runtime);
        }

        public async Task<StartVodDomainResponse> StartVodDomainAsync(StartVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await StartVodDomainWithOptionsAsync(request, runtime);
        }

        public SetVodDomainCertificateResponse SetVodDomainCertificateWithOptions(SetVodDomainCertificateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetVodDomainCertificateResponse>(DoRequest("SetVodDomainCertificate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetVodDomainCertificateResponse> SetVodDomainCertificateWithOptionsAsync(SetVodDomainCertificateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetVodDomainCertificateResponse>(await DoRequestAsync("SetVodDomainCertificate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetVodDomainCertificateResponse SetVodDomainCertificate(SetVodDomainCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetVodDomainCertificateWithOptions(request, runtime);
        }

        public async Task<SetVodDomainCertificateResponse> SetVodDomainCertificateAsync(SetVodDomainCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetVodDomainCertificateWithOptionsAsync(request, runtime);
        }

        public RefreshVodObjectCachesResponse RefreshVodObjectCachesWithOptions(RefreshVodObjectCachesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshVodObjectCachesResponse>(DoRequest("RefreshVodObjectCaches", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RefreshVodObjectCachesResponse> RefreshVodObjectCachesWithOptionsAsync(RefreshVodObjectCachesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshVodObjectCachesResponse>(await DoRequestAsync("RefreshVodObjectCaches", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public RefreshVodObjectCachesResponse RefreshVodObjectCaches(RefreshVodObjectCachesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RefreshVodObjectCachesWithOptions(request, runtime);
        }

        public async Task<RefreshVodObjectCachesResponse> RefreshVodObjectCachesAsync(RefreshVodObjectCachesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RefreshVodObjectCachesWithOptionsAsync(request, runtime);
        }

        public PreloadVodObjectCachesResponse PreloadVodObjectCachesWithOptions(PreloadVodObjectCachesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreloadVodObjectCachesResponse>(DoRequest("PreloadVodObjectCaches", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<PreloadVodObjectCachesResponse> PreloadVodObjectCachesWithOptionsAsync(PreloadVodObjectCachesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreloadVodObjectCachesResponse>(await DoRequestAsync("PreloadVodObjectCaches", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public PreloadVodObjectCachesResponse PreloadVodObjectCaches(PreloadVodObjectCachesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return PreloadVodObjectCachesWithOptions(request, runtime);
        }

        public async Task<PreloadVodObjectCachesResponse> PreloadVodObjectCachesAsync(PreloadVodObjectCachesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await PreloadVodObjectCachesWithOptionsAsync(request, runtime);
        }

        public DescribeVodUserResourcePackageResponse DescribeVodUserResourcePackageWithOptions(DescribeVodUserResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodUserResourcePackageResponse>(DoRequest("DescribeVodUserResourcePackage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodUserResourcePackageResponse> DescribeVodUserResourcePackageWithOptionsAsync(DescribeVodUserResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodUserResourcePackageResponse>(await DoRequestAsync("DescribeVodUserResourcePackage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodUserResourcePackageResponse DescribeVodUserResourcePackage(DescribeVodUserResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodUserResourcePackageWithOptions(request, runtime);
        }

        public async Task<DescribeVodUserResourcePackageResponse> DescribeVodUserResourcePackageAsync(DescribeVodUserResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodUserResourcePackageWithOptionsAsync(request, runtime);
        }

        public DescribeVodUserQuotaResponse DescribeVodUserQuotaWithOptions(DescribeVodUserQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodUserQuotaResponse>(DoRequest("DescribeVodUserQuota", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodUserQuotaResponse> DescribeVodUserQuotaWithOptionsAsync(DescribeVodUserQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodUserQuotaResponse>(await DoRequestAsync("DescribeVodUserQuota", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodUserQuotaResponse DescribeVodUserQuota(DescribeVodUserQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodUserQuotaWithOptions(request, runtime);
        }

        public async Task<DescribeVodUserQuotaResponse> DescribeVodUserQuotaAsync(DescribeVodUserQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodUserQuotaWithOptionsAsync(request, runtime);
        }

        public DescribeVodUserDomainsResponse DescribeVodUserDomainsWithOptions(DescribeVodUserDomainsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodUserDomainsResponse>(DoRequest("DescribeVodUserDomains", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodUserDomainsResponse> DescribeVodUserDomainsWithOptionsAsync(DescribeVodUserDomainsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodUserDomainsResponse>(await DoRequestAsync("DescribeVodUserDomains", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodUserDomainsResponse DescribeVodUserDomains(DescribeVodUserDomainsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodUserDomainsWithOptions(request, runtime);
        }

        public async Task<DescribeVodUserDomainsResponse> DescribeVodUserDomainsAsync(DescribeVodUserDomainsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodUserDomainsWithOptionsAsync(request, runtime);
        }

        public DescribeVodServiceResponse DescribeVodServiceWithOptions(DescribeVodServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodServiceResponse>(DoRequest("DescribeVodService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodServiceResponse> DescribeVodServiceWithOptionsAsync(DescribeVodServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodServiceResponse>(await DoRequestAsync("DescribeVodService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodServiceResponse DescribeVodService(DescribeVodServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodServiceWithOptions(request, runtime);
        }

        public async Task<DescribeVodServiceResponse> DescribeVodServiceAsync(DescribeVodServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodServiceWithOptionsAsync(request, runtime);
        }

        public DescribeVodRefreshTasksResponse DescribeVodRefreshTasksWithOptions(DescribeVodRefreshTasksRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodRefreshTasksResponse>(DoRequest("DescribeVodRefreshTasks", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodRefreshTasksResponse> DescribeVodRefreshTasksWithOptionsAsync(DescribeVodRefreshTasksRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodRefreshTasksResponse>(await DoRequestAsync("DescribeVodRefreshTasks", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodRefreshTasksResponse DescribeVodRefreshTasks(DescribeVodRefreshTasksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodRefreshTasksWithOptions(request, runtime);
        }

        public async Task<DescribeVodRefreshTasksResponse> DescribeVodRefreshTasksAsync(DescribeVodRefreshTasksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodRefreshTasksWithOptionsAsync(request, runtime);
        }

        public DescribeVodRefreshQuotaResponse DescribeVodRefreshQuotaWithOptions(DescribeVodRefreshQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodRefreshQuotaResponse>(DoRequest("DescribeVodRefreshQuota", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodRefreshQuotaResponse> DescribeVodRefreshQuotaWithOptionsAsync(DescribeVodRefreshQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodRefreshQuotaResponse>(await DoRequestAsync("DescribeVodRefreshQuota", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodRefreshQuotaResponse DescribeVodRefreshQuota(DescribeVodRefreshQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodRefreshQuotaWithOptions(request, runtime);
        }

        public async Task<DescribeVodRefreshQuotaResponse> DescribeVodRefreshQuotaAsync(DescribeVodRefreshQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodRefreshQuotaWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainDetailResponse DescribeVodDomainDetailWithOptions(DescribeVodDomainDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainDetailResponse>(DoRequest("DescribeVodDomainDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainDetailResponse> DescribeVodDomainDetailWithOptionsAsync(DescribeVodDomainDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainDetailResponse>(await DoRequestAsync("DescribeVodDomainDetail", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainDetailResponse DescribeVodDomainDetail(DescribeVodDomainDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainDetailWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainDetailResponse> DescribeVodDomainDetailAsync(DescribeVodDomainDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainDetailWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainConfigsResponse DescribeVodDomainConfigsWithOptions(DescribeVodDomainConfigsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainConfigsResponse>(DoRequest("DescribeVodDomainConfigs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainConfigsResponse> DescribeVodDomainConfigsWithOptionsAsync(DescribeVodDomainConfigsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainConfigsResponse>(await DoRequestAsync("DescribeVodDomainConfigs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainConfigsResponse DescribeVodDomainConfigs(DescribeVodDomainConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainConfigsWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainConfigsResponse> DescribeVodDomainConfigsAsync(DescribeVodDomainConfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainConfigsWithOptionsAsync(request, runtime);
        }

        public DescribeVodCertificateListResponse DescribeVodCertificateListWithOptions(DescribeVodCertificateListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodCertificateListResponse>(DoRequest("DescribeVodCertificateList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodCertificateListResponse> DescribeVodCertificateListWithOptionsAsync(DescribeVodCertificateListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodCertificateListResponse>(await DoRequestAsync("DescribeVodCertificateList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodCertificateListResponse DescribeVodCertificateList(DescribeVodCertificateListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodCertificateListWithOptions(request, runtime);
        }

        public async Task<DescribeVodCertificateListResponse> DescribeVodCertificateListAsync(DescribeVodCertificateListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodCertificateListWithOptionsAsync(request, runtime);
        }

        public DescribeUserVodStatusResponse DescribeUserVodStatusWithOptions(DescribeUserVodStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVodStatusResponse>(DoRequest("DescribeUserVodStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserVodStatusResponse> DescribeUserVodStatusWithOptionsAsync(DescribeUserVodStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVodStatusResponse>(await DoRequestAsync("DescribeUserVodStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserVodStatusResponse DescribeUserVodStatus(DescribeUserVodStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserVodStatusWithOptions(request, runtime);
        }

        public async Task<DescribeUserVodStatusResponse> DescribeUserVodStatusAsync(DescribeUserVodStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserVodStatusWithOptionsAsync(request, runtime);
        }

        public DeleteVodDomainResponse DeleteVodDomainWithOptions(DeleteVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVodDomainResponse>(DoRequest("DeleteVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteVodDomainResponse> DeleteVodDomainWithOptionsAsync(DeleteVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVodDomainResponse>(await DoRequestAsync("DeleteVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteVodDomainResponse DeleteVodDomain(DeleteVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteVodDomainWithOptions(request, runtime);
        }

        public async Task<DeleteVodDomainResponse> DeleteVodDomainAsync(DeleteVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteVodDomainWithOptionsAsync(request, runtime);
        }

        public AddVodDomainResponse AddVodDomainWithOptions(AddVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddVodDomainResponse>(DoRequest("AddVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddVodDomainResponse> AddVodDomainWithOptionsAsync(AddVodDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddVodDomainResponse>(await DoRequestAsync("AddVodDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddVodDomainResponse AddVodDomain(AddVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddVodDomainWithOptions(request, runtime);
        }

        public async Task<AddVodDomainResponse> AddVodDomainAsync(AddVodDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddVodDomainWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainLogResponse DescribeVodDomainLogWithOptions(DescribeVodDomainLogRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainLogResponse>(DoRequest("DescribeVodDomainLog", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainLogResponse> DescribeVodDomainLogWithOptionsAsync(DescribeVodDomainLogRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainLogResponse>(await DoRequestAsync("DescribeVodDomainLog", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainLogResponse DescribeVodDomainLog(DescribeVodDomainLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainLogWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainLogResponse> DescribeVodDomainLogAsync(DescribeVodDomainLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainLogWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainCnameResponse DescribeVodDomainCnameWithOptions(DescribeVodDomainCnameRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainCnameResponse>(DoRequest("DescribeVodDomainCname", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainCnameResponse> DescribeVodDomainCnameWithOptionsAsync(DescribeVodDomainCnameRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainCnameResponse>(await DoRequestAsync("DescribeVodDomainCname", "HTTPS", "GET", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainCnameResponse DescribeVodDomainCname(DescribeVodDomainCnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainCnameWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainCnameResponse> DescribeVodDomainCnameAsync(DescribeVodDomainCnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainCnameWithOptionsAsync(request, runtime);
        }

        public DescribeVodDomainCertificateInfoResponse DescribeVodDomainCertificateInfoWithOptions(DescribeVodDomainCertificateInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainCertificateInfoResponse>(DoRequest("DescribeVodDomainCertificateInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeVodDomainCertificateInfoResponse> DescribeVodDomainCertificateInfoWithOptionsAsync(DescribeVodDomainCertificateInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeVodDomainCertificateInfoResponse>(await DoRequestAsync("DescribeVodDomainCertificateInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeVodDomainCertificateInfoResponse DescribeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeVodDomainCertificateInfoWithOptions(request, runtime);
        }

        public async Task<DescribeVodDomainCertificateInfoResponse> DescribeVodDomainCertificateInfoAsync(DescribeVodDomainCertificateInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeVodDomainCertificateInfoWithOptionsAsync(request, runtime);
        }

        public UploadMediaByURLResponse UploadMediaByURLWithOptions(UploadMediaByURLRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadMediaByURLResponse>(DoRequest("UploadMediaByURL", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UploadMediaByURLResponse> UploadMediaByURLWithOptionsAsync(UploadMediaByURLRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadMediaByURLResponse>(await DoRequestAsync("UploadMediaByURL", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UploadMediaByURLResponse UploadMediaByURL(UploadMediaByURLRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UploadMediaByURLWithOptions(request, runtime);
        }

        public async Task<UploadMediaByURLResponse> UploadMediaByURLAsync(UploadMediaByURLRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UploadMediaByURLWithOptionsAsync(request, runtime);
        }

        public GetAIServiceResponse GetAIServiceWithOptions(GetAIServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAIServiceResponse>(DoRequest("GetAIService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAIServiceResponse> GetAIServiceWithOptionsAsync(GetAIServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAIServiceResponse>(await DoRequestAsync("GetAIService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAIServiceResponse GetAIService(GetAIServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAIServiceWithOptions(request, runtime);
        }

        public async Task<GetAIServiceResponse> GetAIServiceAsync(GetAIServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAIServiceWithOptionsAsync(request, runtime);
        }

        public SetAIServiceResponse SetAIServiceWithOptions(SetAIServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetAIServiceResponse>(DoRequest("SetAIService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetAIServiceResponse> SetAIServiceWithOptionsAsync(SetAIServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetAIServiceResponse>(await DoRequestAsync("SetAIService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetAIServiceResponse SetAIService(SetAIServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetAIServiceWithOptions(request, runtime);
        }

        public async Task<SetAIServiceResponse> SetAIServiceAsync(SetAIServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetAIServiceWithOptionsAsync(request, runtime);
        }

        public SetL2OssKeyConfigResponse SetL2OssKeyConfigWithOptions(SetL2OssKeyConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetL2OssKeyConfigResponse>(DoRequest("SetL2OssKeyConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetL2OssKeyConfigResponse> SetL2OssKeyConfigWithOptionsAsync(SetL2OssKeyConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetL2OssKeyConfigResponse>(await DoRequestAsync("SetL2OssKeyConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetL2OssKeyConfigResponse SetL2OssKeyConfig(SetL2OssKeyConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetL2OssKeyConfigWithOptions(request, runtime);
        }

        public async Task<SetL2OssKeyConfigResponse> SetL2OssKeyConfigAsync(SetL2OssKeyConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetL2OssKeyConfigWithOptionsAsync(request, runtime);
        }

        public SetDefaultUploadStorageResponse SetDefaultUploadStorageWithOptions(SetDefaultUploadStorageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultUploadStorageResponse>(DoRequest("SetDefaultUploadStorage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetDefaultUploadStorageResponse> SetDefaultUploadStorageWithOptionsAsync(SetDefaultUploadStorageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultUploadStorageResponse>(await DoRequestAsync("SetDefaultUploadStorage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetDefaultUploadStorageResponse SetDefaultUploadStorage(SetDefaultUploadStorageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetDefaultUploadStorageWithOptions(request, runtime);
        }

        public async Task<SetDefaultUploadStorageResponse> SetDefaultUploadStorageAsync(SetDefaultUploadStorageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetDefaultUploadStorageWithOptionsAsync(request, runtime);
        }

        public SearchMediaResponse SearchMediaWithOptions(SearchMediaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMediaResponse>(DoRequest("SearchMedia", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SearchMediaResponse> SearchMediaWithOptionsAsync(SearchMediaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMediaResponse>(await DoRequestAsync("SearchMedia", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SearchMediaResponse SearchMedia(SearchMediaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SearchMediaWithOptions(request, runtime);
        }

        public async Task<SearchMediaResponse> SearchMediaAsync(SearchMediaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SearchMediaWithOptionsAsync(request, runtime);
        }

        public UpdateVideoInfosResponse UpdateVideoInfosWithOptions(UpdateVideoInfosRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVideoInfosResponse>(DoRequest("UpdateVideoInfos", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateVideoInfosResponse> UpdateVideoInfosWithOptionsAsync(UpdateVideoInfosRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVideoInfosResponse>(await DoRequestAsync("UpdateVideoInfos", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateVideoInfosResponse UpdateVideoInfos(UpdateVideoInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateVideoInfosWithOptions(request, runtime);
        }

        public async Task<UpdateVideoInfosResponse> UpdateVideoInfosAsync(UpdateVideoInfosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateVideoInfosWithOptionsAsync(request, runtime);
        }

        public GenerateDownloadSecretKeyResponse GenerateDownloadSecretKeyWithOptions(GenerateDownloadSecretKeyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GenerateDownloadSecretKeyResponse>(DoRequest("GenerateDownloadSecretKey", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GenerateDownloadSecretKeyResponse> GenerateDownloadSecretKeyWithOptionsAsync(GenerateDownloadSecretKeyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GenerateDownloadSecretKeyResponse>(await DoRequestAsync("GenerateDownloadSecretKey", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GenerateDownloadSecretKeyResponse GenerateDownloadSecretKey(GenerateDownloadSecretKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GenerateDownloadSecretKeyWithOptions(request, runtime);
        }

        public async Task<GenerateDownloadSecretKeyResponse> GenerateDownloadSecretKeyAsync(GenerateDownloadSecretKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GenerateDownloadSecretKeyWithOptionsAsync(request, runtime);
        }

        public AssumeSlsRoleResponse AssumeSlsRoleWithOptions(AssumeSlsRoleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeSlsRoleResponse>(DoRequest("AssumeSlsRole", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public async Task<AssumeSlsRoleResponse> AssumeSlsRoleWithOptionsAsync(AssumeSlsRoleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeSlsRoleResponse>(await DoRequestAsync("AssumeSlsRole", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public AssumeSlsRoleResponse AssumeSlsRole(AssumeSlsRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AssumeSlsRoleWithOptions(request, runtime);
        }

        public async Task<AssumeSlsRoleResponse> AssumeSlsRoleAsync(AssumeSlsRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AssumeSlsRoleWithOptionsAsync(request, runtime);
        }

        public GetPersonalStorageListResponse GetPersonalStorageListWithOptions(GetPersonalStorageListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPersonalStorageListResponse>(DoRequest("GetPersonalStorageList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetPersonalStorageListResponse> GetPersonalStorageListWithOptionsAsync(GetPersonalStorageListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPersonalStorageListResponse>(await DoRequestAsync("GetPersonalStorageList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetPersonalStorageListResponse GetPersonalStorageList(GetPersonalStorageListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetPersonalStorageListWithOptions(request, runtime);
        }

        public async Task<GetPersonalStorageListResponse> GetPersonalStorageListAsync(GetPersonalStorageListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetPersonalStorageListWithOptionsAsync(request, runtime);
        }

        public GetStorageRegionListResponse GetStorageRegionListWithOptions(GetStorageRegionListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStorageRegionListResponse>(DoRequest("GetStorageRegionList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetStorageRegionListResponse> GetStorageRegionListWithOptionsAsync(GetStorageRegionListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStorageRegionListResponse>(await DoRequestAsync("GetStorageRegionList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetStorageRegionListResponse GetStorageRegionList(GetStorageRegionListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetStorageRegionListWithOptions(request, runtime);
        }

        public async Task<GetStorageRegionListResponse> GetStorageRegionListAsync(GetStorageRegionListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetStorageRegionListWithOptionsAsync(request, runtime);
        }

        public SetStorageACLResponse SetStorageACLWithOptions(SetStorageACLRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetStorageACLResponse>(DoRequest("SetStorageACL", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetStorageACLResponse> SetStorageACLWithOptionsAsync(SetStorageACLRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetStorageACLResponse>(await DoRequestAsync("SetStorageACL", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetStorageACLResponse SetStorageACL(SetStorageACLRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetStorageACLWithOptions(request, runtime);
        }

        public async Task<SetStorageACLResponse> SetStorageACLAsync(SetStorageACLRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetStorageACLWithOptionsAsync(request, runtime);
        }

        public GetMessageCallbackEventListResponse GetMessageCallbackEventListWithOptions(GetMessageCallbackEventListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessageCallbackEventListResponse>(DoRequest("GetMessageCallbackEventList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMessageCallbackEventListResponse> GetMessageCallbackEventListWithOptionsAsync(GetMessageCallbackEventListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessageCallbackEventListResponse>(await DoRequestAsync("GetMessageCallbackEventList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMessageCallbackEventListResponse GetMessageCallbackEventList(GetMessageCallbackEventListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMessageCallbackEventListWithOptions(request, runtime);
        }

        public async Task<GetMessageCallbackEventListResponse> GetMessageCallbackEventListAsync(GetMessageCallbackEventListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMessageCallbackEventListWithOptionsAsync(request, runtime);
        }

        public GetStorageInfoResponse GetStorageInfoWithOptions(GetStorageInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStorageInfoResponse>(DoRequest("GetStorageInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetStorageInfoResponse> GetStorageInfoWithOptionsAsync(GetStorageInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStorageInfoResponse>(await DoRequestAsync("GetStorageInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetStorageInfoResponse GetStorageInfo(GetStorageInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetStorageInfoWithOptions(request, runtime);
        }

        public async Task<GetStorageInfoResponse> GetStorageInfoAsync(GetStorageInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetStorageInfoWithOptionsAsync(request, runtime);
        }

        public DeleteStorageResponse DeleteStorageWithOptions(DeleteStorageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStorageResponse>(DoRequest("DeleteStorage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteStorageResponse> DeleteStorageWithOptionsAsync(DeleteStorageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStorageResponse>(await DoRequestAsync("DeleteStorage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteStorageResponse DeleteStorage(DeleteStorageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteStorageWithOptions(request, runtime);
        }

        public async Task<DeleteStorageResponse> DeleteStorageAsync(DeleteStorageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteStorageWithOptionsAsync(request, runtime);
        }

        public AddStorageResponse AddStorageWithOptions(AddStorageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddStorageResponse>(DoRequest("AddStorage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddStorageResponse> AddStorageWithOptionsAsync(AddStorageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddStorageResponse>(await DoRequestAsync("AddStorage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddStorageResponse AddStorage(AddStorageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddStorageWithOptions(request, runtime);
        }

        public async Task<AddStorageResponse> AddStorageAsync(AddStorageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddStorageWithOptionsAsync(request, runtime);
        }

        public GetStorageListResponse GetStorageListWithOptions(GetStorageListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStorageListResponse>(DoRequest("GetStorageList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetStorageListResponse> GetStorageListWithOptionsAsync(GetStorageListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStorageListResponse>(await DoRequestAsync("GetStorageList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetStorageListResponse GetStorageList(GetStorageListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetStorageListWithOptions(request, runtime);
        }

        public async Task<GetStorageListResponse> GetStorageListAsync(GetStorageListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetStorageListWithOptionsAsync(request, runtime);
        }

        public GetThirdPartPlayPolicyResponse GetThirdPartPlayPolicyWithOptions(GetThirdPartPlayPolicyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetThirdPartPlayPolicyResponse>(DoRequest("GetThirdPartPlayPolicy", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public async Task<GetThirdPartPlayPolicyResponse> GetThirdPartPlayPolicyWithOptionsAsync(GetThirdPartPlayPolicyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetThirdPartPlayPolicyResponse>(await DoRequestAsync("GetThirdPartPlayPolicy", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public GetThirdPartPlayPolicyResponse GetThirdPartPlayPolicy(GetThirdPartPlayPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetThirdPartPlayPolicyWithOptions(request, runtime);
        }

        public async Task<GetThirdPartPlayPolicyResponse> GetThirdPartPlayPolicyAsync(GetThirdPartPlayPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetThirdPartPlayPolicyWithOptionsAsync(request, runtime);
        }

        public AddThirdPartPlayPolicyResponse AddThirdPartPlayPolicyWithOptions(AddThirdPartPlayPolicyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddThirdPartPlayPolicyResponse>(DoRequest("AddThirdPartPlayPolicy", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public async Task<AddThirdPartPlayPolicyResponse> AddThirdPartPlayPolicyWithOptionsAsync(AddThirdPartPlayPolicyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddThirdPartPlayPolicyResponse>(await DoRequestAsync("AddThirdPartPlayPolicy", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public AddThirdPartPlayPolicyResponse AddThirdPartPlayPolicy(AddThirdPartPlayPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddThirdPartPlayPolicyWithOptions(request, runtime);
        }

        public async Task<AddThirdPartPlayPolicyResponse> AddThirdPartPlayPolicyAsync(AddThirdPartPlayPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddThirdPartPlayPolicyWithOptionsAsync(request, runtime);
        }

        public AuthorizeAppLicenseResponse AuthorizeAppLicenseWithOptions(AuthorizeAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthorizeAppLicenseResponse>(DoRequest("AuthorizeAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AuthorizeAppLicenseResponse> AuthorizeAppLicenseWithOptionsAsync(AuthorizeAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthorizeAppLicenseResponse>(await DoRequestAsync("AuthorizeAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AuthorizeAppLicenseResponse AuthorizeAppLicense(AuthorizeAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AuthorizeAppLicenseWithOptions(request, runtime);
        }

        public async Task<AuthorizeAppLicenseResponse> AuthorizeAppLicenseAsync(AuthorizeAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AuthorizeAppLicenseWithOptionsAsync(request, runtime);
        }

        public GetAppLicenseResponse GetAppLicenseWithOptions(GetAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppLicenseResponse>(DoRequest("GetAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAppLicenseResponse> GetAppLicenseWithOptionsAsync(GetAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppLicenseResponse>(await DoRequestAsync("GetAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAppLicenseResponse GetAppLicense(GetAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAppLicenseWithOptions(request, runtime);
        }

        public async Task<GetAppLicenseResponse> GetAppLicenseAsync(GetAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAppLicenseWithOptionsAsync(request, runtime);
        }

        public UpdateAppLicenseResponse UpdateAppLicenseWithOptions(UpdateAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppLicenseResponse>(DoRequest("UpdateAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateAppLicenseResponse> UpdateAppLicenseWithOptionsAsync(UpdateAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppLicenseResponse>(await DoRequestAsync("UpdateAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateAppLicenseResponse UpdateAppLicense(UpdateAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateAppLicenseWithOptions(request, runtime);
        }

        public async Task<UpdateAppLicenseResponse> UpdateAppLicenseAsync(UpdateAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateAppLicenseWithOptionsAsync(request, runtime);
        }

        public AddAppLicenseResponse AddAppLicenseWithOptions(AddAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAppLicenseResponse>(DoRequest("AddAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddAppLicenseResponse> AddAppLicenseWithOptionsAsync(AddAppLicenseRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAppLicenseResponse>(await DoRequestAsync("AddAppLicense", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddAppLicenseResponse AddAppLicense(AddAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddAppLicenseWithOptions(request, runtime);
        }

        public async Task<AddAppLicenseResponse> AddAppLicenseAsync(AddAppLicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddAppLicenseWithOptionsAsync(request, runtime);
        }

        public GetAppLicenseListResponse GetAppLicenseListWithOptions(GetAppLicenseListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppLicenseListResponse>(DoRequest("GetAppLicenseList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAppLicenseListResponse> GetAppLicenseListWithOptionsAsync(GetAppLicenseListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppLicenseListResponse>(await DoRequestAsync("GetAppLicenseList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAppLicenseListResponse GetAppLicenseList(GetAppLicenseListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAppLicenseListWithOptions(request, runtime);
        }

        public async Task<GetAppLicenseListResponse> GetAppLicenseListAsync(GetAppLicenseListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAppLicenseListWithOptionsAsync(request, runtime);
        }

        public SPIPhysicalDeleteResourceActionResponse SPIPhysicalDeleteResourceActionWithOptions(SPIPhysicalDeleteResourceActionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SPIPhysicalDeleteResourceActionResponse>(DoRequest("SPIPhysicalDeleteResourceAction", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SPIPhysicalDeleteResourceActionResponse> SPIPhysicalDeleteResourceActionWithOptionsAsync(SPIPhysicalDeleteResourceActionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SPIPhysicalDeleteResourceActionResponse>(await DoRequestAsync("SPIPhysicalDeleteResourceAction", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SPIPhysicalDeleteResourceActionResponse SPIPhysicalDeleteResourceAction(SPIPhysicalDeleteResourceActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SPIPhysicalDeleteResourceActionWithOptions(request, runtime);
        }

        public async Task<SPIPhysicalDeleteResourceActionResponse> SPIPhysicalDeleteResourceActionAsync(SPIPhysicalDeleteResourceActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SPIPhysicalDeleteResourceActionWithOptionsAsync(request, runtime);
        }

        public SPICheckResourceActionResponse SPICheckResourceActionWithOptions(SPICheckResourceActionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SPICheckResourceActionResponse>(DoRequest("SPICheckResourceAction", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SPICheckResourceActionResponse> SPICheckResourceActionWithOptionsAsync(SPICheckResourceActionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SPICheckResourceActionResponse>(await DoRequestAsync("SPICheckResourceAction", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SPICheckResourceActionResponse SPICheckResourceAction(SPICheckResourceActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SPICheckResourceActionWithOptions(request, runtime);
        }

        public async Task<SPICheckResourceActionResponse> SPICheckResourceActionAsync(SPICheckResourceActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SPICheckResourceActionWithOptionsAsync(request, runtime);
        }

        public SPILogicalDeleteResourceActionResponse SPILogicalDeleteResourceActionWithOptions(SPILogicalDeleteResourceActionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SPILogicalDeleteResourceActionResponse>(DoRequest("SPILogicalDeleteResourceAction", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SPILogicalDeleteResourceActionResponse> SPILogicalDeleteResourceActionWithOptionsAsync(SPILogicalDeleteResourceActionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SPILogicalDeleteResourceActionResponse>(await DoRequestAsync("SPILogicalDeleteResourceAction", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SPILogicalDeleteResourceActionResponse SPILogicalDeleteResourceAction(SPILogicalDeleteResourceActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SPILogicalDeleteResourceActionWithOptions(request, runtime);
        }

        public async Task<SPILogicalDeleteResourceActionResponse> SPILogicalDeleteResourceActionAsync(SPILogicalDeleteResourceActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SPILogicalDeleteResourceActionWithOptionsAsync(request, runtime);
        }

        public SubmitPreprocessJobsResponse SubmitPreprocessJobsWithOptions(SubmitPreprocessJobsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitPreprocessJobsResponse>(DoRequest("SubmitPreprocessJobs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitPreprocessJobsResponse> SubmitPreprocessJobsWithOptionsAsync(SubmitPreprocessJobsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitPreprocessJobsResponse>(await DoRequestAsync("SubmitPreprocessJobs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitPreprocessJobsResponse SubmitPreprocessJobs(SubmitPreprocessJobsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitPreprocessJobsWithOptions(request, runtime);
        }

        public async Task<SubmitPreprocessJobsResponse> SubmitPreprocessJobsAsync(SubmitPreprocessJobsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitPreprocessJobsWithOptionsAsync(request, runtime);
        }

        public QueryOrderParamResponse QueryOrderParamWithOptions(QueryOrderParamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOrderParamResponse>(DoRequest("QueryOrderParam", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryOrderParamResponse> QueryOrderParamWithOptionsAsync(QueryOrderParamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOrderParamResponse>(await DoRequestAsync("QueryOrderParam", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryOrderParamResponse QueryOrderParam(QueryOrderParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryOrderParamWithOptions(request, runtime);
        }

        public async Task<QueryOrderParamResponse> QueryOrderParamAsync(QueryOrderParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryOrderParamWithOptionsAsync(request, runtime);
        }

        public AssumeExperienceRoleResponse AssumeExperienceRoleWithOptions(AssumeExperienceRoleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeExperienceRoleResponse>(DoRequest("AssumeExperienceRole", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public async Task<AssumeExperienceRoleResponse> AssumeExperienceRoleWithOptionsAsync(AssumeExperienceRoleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssumeExperienceRoleResponse>(await DoRequestAsync("AssumeExperienceRole", "HTTPS", "POST", "2017-03-14", "Anonymous", request.ToMap(), null, runtime));
        }

        public AssumeExperienceRoleResponse AssumeExperienceRole(AssumeExperienceRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AssumeExperienceRoleWithOptions(request, runtime);
        }

        public async Task<AssumeExperienceRoleResponse> AssumeExperienceRoleAsync(AssumeExperienceRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AssumeExperienceRoleWithOptionsAsync(request, runtime);
        }

        public ListSnapshotsResponse ListSnapshotsWithOptions(ListSnapshotsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSnapshotsResponse>(DoRequest("ListSnapshots", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListSnapshotsResponse> ListSnapshotsWithOptionsAsync(ListSnapshotsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSnapshotsResponse>(await DoRequestAsync("ListSnapshots", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListSnapshotsResponse ListSnapshots(ListSnapshotsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListSnapshotsWithOptions(request, runtime);
        }

        public async Task<ListSnapshotsResponse> ListSnapshotsAsync(ListSnapshotsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListSnapshotsWithOptionsAsync(request, runtime);
        }

        public SetDefaultPlayDomainResponse SetDefaultPlayDomainWithOptions(SetDefaultPlayDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultPlayDomainResponse>(DoRequest("SetDefaultPlayDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetDefaultPlayDomainResponse> SetDefaultPlayDomainWithOptionsAsync(SetDefaultPlayDomainRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultPlayDomainResponse>(await DoRequestAsync("SetDefaultPlayDomain", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetDefaultPlayDomainResponse SetDefaultPlayDomain(SetDefaultPlayDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetDefaultPlayDomainWithOptions(request, runtime);
        }

        public async Task<SetDefaultPlayDomainResponse> SetDefaultPlayDomainAsync(SetDefaultPlayDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetDefaultPlayDomainWithOptionsAsync(request, runtime);
        }

        public EditVideoIndexFileResponse EditVideoIndexFileWithOptions(EditVideoIndexFileRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EditVideoIndexFileResponse>(DoRequest("EditVideoIndexFile", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<EditVideoIndexFileResponse> EditVideoIndexFileWithOptionsAsync(EditVideoIndexFileRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EditVideoIndexFileResponse>(await DoRequestAsync("EditVideoIndexFile", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public EditVideoIndexFileResponse EditVideoIndexFile(EditVideoIndexFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return EditVideoIndexFileWithOptions(request, runtime);
        }

        public async Task<EditVideoIndexFileResponse> EditVideoIndexFileAsync(EditVideoIndexFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await EditVideoIndexFileWithOptionsAsync(request, runtime);
        }

        public SetCDNDomainServerCertificateResponse SetCDNDomainServerCertificateWithOptions(SetCDNDomainServerCertificateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCDNDomainServerCertificateResponse>(DoRequest("SetCDNDomainServerCertificate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetCDNDomainServerCertificateResponse> SetCDNDomainServerCertificateWithOptionsAsync(SetCDNDomainServerCertificateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCDNDomainServerCertificateResponse>(await DoRequestAsync("SetCDNDomainServerCertificate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetCDNDomainServerCertificateResponse SetCDNDomainServerCertificate(SetCDNDomainServerCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetCDNDomainServerCertificateWithOptions(request, runtime);
        }

        public async Task<SetCDNDomainServerCertificateResponse> SetCDNDomainServerCertificateAsync(SetCDNDomainServerCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetCDNDomainServerCertificateWithOptionsAsync(request, runtime);
        }

        public SetCDNForceRedirectConfigResponse SetCDNForceRedirectConfigWithOptions(SetCDNForceRedirectConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCDNForceRedirectConfigResponse>(DoRequest("SetCDNForceRedirectConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetCDNForceRedirectConfigResponse> SetCDNForceRedirectConfigWithOptionsAsync(SetCDNForceRedirectConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCDNForceRedirectConfigResponse>(await DoRequestAsync("SetCDNForceRedirectConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetCDNForceRedirectConfigResponse SetCDNForceRedirectConfig(SetCDNForceRedirectConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetCDNForceRedirectConfigWithOptions(request, runtime);
        }

        public async Task<SetCDNForceRedirectConfigResponse> SetCDNForceRedirectConfigAsync(SetCDNForceRedirectConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetCDNForceRedirectConfigWithOptionsAsync(request, runtime);
        }

        public SubmitTranscodeJobsResponse SubmitTranscodeJobsWithOptions(SubmitTranscodeJobsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitTranscodeJobsResponse>(DoRequest("SubmitTranscodeJobs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitTranscodeJobsResponse> SubmitTranscodeJobsWithOptionsAsync(SubmitTranscodeJobsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitTranscodeJobsResponse>(await DoRequestAsync("SubmitTranscodeJobs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitTranscodeJobsResponse SubmitTranscodeJobs(SubmitTranscodeJobsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitTranscodeJobsWithOptions(request, runtime);
        }

        public async Task<SubmitTranscodeJobsResponse> SubmitTranscodeJobsAsync(SubmitTranscodeJobsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitTranscodeJobsWithOptionsAsync(request, runtime);
        }

        public GetAuditResultResponse GetAuditResultWithOptions(GetAuditResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuditResultResponse>(DoRequest("GetAuditResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAuditResultResponse> GetAuditResultWithOptionsAsync(GetAuditResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuditResultResponse>(await DoRequestAsync("GetAuditResult", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAuditResultResponse GetAuditResult(GetAuditResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAuditResultWithOptions(request, runtime);
        }

        public async Task<GetAuditResultResponse> GetAuditResultAsync(GetAuditResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAuditResultWithOptionsAsync(request, runtime);
        }

        public CreateAuditResponse CreateAuditWithOptions(CreateAuditRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAuditResponse>(DoRequest("CreateAudit", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateAuditResponse> CreateAuditWithOptionsAsync(CreateAuditRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAuditResponse>(await DoRequestAsync("CreateAudit", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateAuditResponse CreateAudit(CreateAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateAuditWithOptions(request, runtime);
        }

        public async Task<CreateAuditResponse> CreateAuditAsync(CreateAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateAuditWithOptionsAsync(request, runtime);
        }

        public GetAuditHistoryResponse GetAuditHistoryWithOptions(GetAuditHistoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuditHistoryResponse>(DoRequest("GetAuditHistory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAuditHistoryResponse> GetAuditHistoryWithOptionsAsync(GetAuditHistoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuditHistoryResponse>(await DoRequestAsync("GetAuditHistory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAuditHistoryResponse GetAuditHistory(GetAuditHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAuditHistoryWithOptions(request, runtime);
        }

        public async Task<GetAuditHistoryResponse> GetAuditHistoryAsync(GetAuditHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAuditHistoryWithOptionsAsync(request, runtime);
        }

        public FinishLiveStreamRecordResponse FinishLiveStreamRecordWithOptions(FinishLiveStreamRecordRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishLiveStreamRecordResponse>(DoRequest("FinishLiveStreamRecord", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<FinishLiveStreamRecordResponse> FinishLiveStreamRecordWithOptionsAsync(FinishLiveStreamRecordRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishLiveStreamRecordResponse>(await DoRequestAsync("FinishLiveStreamRecord", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public FinishLiveStreamRecordResponse FinishLiveStreamRecord(FinishLiveStreamRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return FinishLiveStreamRecordWithOptions(request, runtime);
        }

        public async Task<FinishLiveStreamRecordResponse> FinishLiveStreamRecordAsync(FinishLiveStreamRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await FinishLiveStreamRecordWithOptionsAsync(request, runtime);
        }

        public ListLiveRecordVideoResponse ListLiveRecordVideoWithOptions(ListLiveRecordVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLiveRecordVideoResponse>(DoRequest("ListLiveRecordVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListLiveRecordVideoResponse> ListLiveRecordVideoWithOptionsAsync(ListLiveRecordVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLiveRecordVideoResponse>(await DoRequestAsync("ListLiveRecordVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListLiveRecordVideoResponse ListLiveRecordVideo(ListLiveRecordVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListLiveRecordVideoWithOptions(request, runtime);
        }

        public async Task<ListLiveRecordVideoResponse> ListLiveRecordVideoAsync(ListLiveRecordVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListLiveRecordVideoWithOptionsAsync(request, runtime);
        }

        public AddLiveStreamVideoResponse AddLiveStreamVideoWithOptions(AddLiveStreamVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLiveStreamVideoResponse>(DoRequest("AddLiveStreamVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddLiveStreamVideoResponse> AddLiveStreamVideoWithOptionsAsync(AddLiveStreamVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLiveStreamVideoResponse>(await DoRequestAsync("AddLiveStreamVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddLiveStreamVideoResponse AddLiveStreamVideo(AddLiveStreamVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddLiveStreamVideoWithOptions(request, runtime);
        }

        public async Task<AddLiveStreamVideoResponse> AddLiveStreamVideoAsync(AddLiveStreamVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddLiveStreamVideoWithOptionsAsync(request, runtime);
        }

        public SetTemplateGroupPropertyResponse SetTemplateGroupPropertyWithOptions(SetTemplateGroupPropertyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetTemplateGroupPropertyResponse>(DoRequest("SetTemplateGroupProperty", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetTemplateGroupPropertyResponse> SetTemplateGroupPropertyWithOptionsAsync(SetTemplateGroupPropertyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetTemplateGroupPropertyResponse>(await DoRequestAsync("SetTemplateGroupProperty", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetTemplateGroupPropertyResponse SetTemplateGroupProperty(SetTemplateGroupPropertyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetTemplateGroupPropertyWithOptions(request, runtime);
        }

        public async Task<SetTemplateGroupPropertyResponse> SetTemplateGroupPropertyAsync(SetTemplateGroupPropertyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetTemplateGroupPropertyWithOptionsAsync(request, runtime);
        }

        public QueryUploadInfoResponse QueryUploadInfoWithOptions(QueryUploadInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUploadInfoResponse>(DoRequest("QueryUploadInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryUploadInfoResponse> QueryUploadInfoWithOptionsAsync(QueryUploadInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUploadInfoResponse>(await DoRequestAsync("QueryUploadInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryUploadInfoResponse QueryUploadInfo(QueryUploadInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryUploadInfoWithOptions(request, runtime);
        }

        public async Task<QueryUploadInfoResponse> QueryUploadInfoAsync(QueryUploadInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryUploadInfoWithOptionsAsync(request, runtime);
        }

        public FaceRegistrationResponse FaceRegistrationWithOptions(FaceRegistrationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FaceRegistrationResponse>(DoRequest("FaceRegistration", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<FaceRegistrationResponse> FaceRegistrationWithOptionsAsync(FaceRegistrationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FaceRegistrationResponse>(await DoRequestAsync("FaceRegistration", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public FaceRegistrationResponse FaceRegistration(FaceRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return FaceRegistrationWithOptions(request, runtime);
        }

        public async Task<FaceRegistrationResponse> FaceRegistrationAsync(FaceRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await FaceRegistrationWithOptionsAsync(request, runtime);
        }

        public ListAIJobResponse ListAIJobWithOptions(ListAIJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIJobResponse>(DoRequest("ListAIJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIJobResponse> ListAIJobWithOptionsAsync(ListAIJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIJobResponse>(await DoRequestAsync("ListAIJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIJobResponse ListAIJob(ListAIJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIJobWithOptions(request, runtime);
        }

        public async Task<ListAIJobResponse> ListAIJobAsync(ListAIJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIJobWithOptionsAsync(request, runtime);
        }

        public SubmitAIJobResponse SubmitAIJobWithOptions(SubmitAIJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIJobResponse>(DoRequest("SubmitAIJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIJobResponse> SubmitAIJobWithOptionsAsync(SubmitAIJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIJobResponse>(await DoRequestAsync("SubmitAIJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIJobResponse SubmitAIJob(SubmitAIJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIJobResponse> SubmitAIJobAsync(SubmitAIJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIJobWithOptionsAsync(request, runtime);
        }

        public GetImageInfoResponse GetImageInfoWithOptions(GetImageInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetImageInfoResponse>(DoRequest("GetImageInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetImageInfoResponse> GetImageInfoWithOptionsAsync(GetImageInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetImageInfoResponse>(await DoRequestAsync("GetImageInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetImageInfoResponse GetImageInfo(GetImageInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetImageInfoWithOptions(request, runtime);
        }

        public async Task<GetImageInfoResponse> GetImageInfoAsync(GetImageInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetImageInfoWithOptionsAsync(request, runtime);
        }

        public UpdateWatermarkInfoResponse UpdateWatermarkInfoWithOptions(UpdateWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWatermarkInfoResponse>(DoRequest("UpdateWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateWatermarkInfoResponse> UpdateWatermarkInfoWithOptionsAsync(UpdateWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWatermarkInfoResponse>(await DoRequestAsync("UpdateWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateWatermarkInfoResponse UpdateWatermarkInfo(UpdateWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateWatermarkInfoWithOptions(request, runtime);
        }

        public async Task<UpdateWatermarkInfoResponse> UpdateWatermarkInfoAsync(UpdateWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateWatermarkInfoWithOptionsAsync(request, runtime);
        }

        public UpdateWatermarkGroupResponse UpdateWatermarkGroupWithOptions(UpdateWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWatermarkGroupResponse>(DoRequest("UpdateWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateWatermarkGroupResponse> UpdateWatermarkGroupWithOptionsAsync(UpdateWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWatermarkGroupResponse>(await DoRequestAsync("UpdateWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateWatermarkGroupResponse UpdateWatermarkGroup(UpdateWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateWatermarkGroupWithOptions(request, runtime);
        }

        public async Task<UpdateWatermarkGroupResponse> UpdateWatermarkGroupAsync(UpdateWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateWatermarkGroupWithOptionsAsync(request, runtime);
        }

        public ListWatermarkInfoResponse ListWatermarkInfoWithOptions(ListWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWatermarkInfoResponse>(DoRequest("ListWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListWatermarkInfoResponse> ListWatermarkInfoWithOptionsAsync(ListWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWatermarkInfoResponse>(await DoRequestAsync("ListWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListWatermarkInfoResponse ListWatermarkInfo(ListWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListWatermarkInfoWithOptions(request, runtime);
        }

        public async Task<ListWatermarkInfoResponse> ListWatermarkInfoAsync(ListWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListWatermarkInfoWithOptionsAsync(request, runtime);
        }

        public ListCompanionresourceInfoResponse ListCompanionresourceInfoWithOptions(ListCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCompanionresourceInfoResponse>(DoRequest("ListCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListCompanionresourceInfoResponse> ListCompanionresourceInfoWithOptionsAsync(ListCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCompanionresourceInfoResponse>(await DoRequestAsync("ListCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListCompanionresourceInfoResponse ListCompanionresourceInfo(ListCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListCompanionresourceInfoWithOptions(request, runtime);
        }

        public async Task<ListCompanionresourceInfoResponse> ListCompanionresourceInfoAsync(ListCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListCompanionresourceInfoWithOptionsAsync(request, runtime);
        }

        public GetWatermarkInfoResponse GetWatermarkInfoWithOptions(GetWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkInfoResponse>(DoRequest("GetWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetWatermarkInfoResponse> GetWatermarkInfoWithOptionsAsync(GetWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkInfoResponse>(await DoRequestAsync("GetWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetWatermarkInfoResponse GetWatermarkInfo(GetWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetWatermarkInfoWithOptions(request, runtime);
        }

        public async Task<GetWatermarkInfoResponse> GetWatermarkInfoAsync(GetWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetWatermarkInfoWithOptionsAsync(request, runtime);
        }

        public GetWatermarkGroupResponse GetWatermarkGroupWithOptions(GetWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkGroupResponse>(DoRequest("GetWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetWatermarkGroupResponse> GetWatermarkGroupWithOptionsAsync(GetWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkGroupResponse>(await DoRequestAsync("GetWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetWatermarkGroupResponse GetWatermarkGroup(GetWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetWatermarkGroupWithOptions(request, runtime);
        }

        public async Task<GetWatermarkGroupResponse> GetWatermarkGroupAsync(GetWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetWatermarkGroupWithOptionsAsync(request, runtime);
        }

        public GetCompanionresourceInfoResponse GetCompanionresourceInfoWithOptions(GetCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCompanionresourceInfoResponse>(DoRequest("GetCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCompanionresourceInfoResponse> GetCompanionresourceInfoWithOptionsAsync(GetCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCompanionresourceInfoResponse>(await DoRequestAsync("GetCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCompanionresourceInfoResponse GetCompanionresourceInfo(GetCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCompanionresourceInfoWithOptions(request, runtime);
        }

        public async Task<GetCompanionresourceInfoResponse> GetCompanionresourceInfoAsync(GetCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCompanionresourceInfoWithOptionsAsync(request, runtime);
        }

        public DeleteWatermarkRelationResponse DeleteWatermarkRelationWithOptions(DeleteWatermarkRelationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkRelationResponse>(DoRequest("DeleteWatermarkRelation", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteWatermarkRelationResponse> DeleteWatermarkRelationWithOptionsAsync(DeleteWatermarkRelationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkRelationResponse>(await DoRequestAsync("DeleteWatermarkRelation", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteWatermarkRelationResponse DeleteWatermarkRelation(DeleteWatermarkRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteWatermarkRelationWithOptions(request, runtime);
        }

        public async Task<DeleteWatermarkRelationResponse> DeleteWatermarkRelationAsync(DeleteWatermarkRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteWatermarkRelationWithOptionsAsync(request, runtime);
        }

        public DeleteWatermarkInfoResponse DeleteWatermarkInfoWithOptions(DeleteWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkInfoResponse>(DoRequest("DeleteWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteWatermarkInfoResponse> DeleteWatermarkInfoWithOptionsAsync(DeleteWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkInfoResponse>(await DoRequestAsync("DeleteWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteWatermarkInfoResponse DeleteWatermarkInfo(DeleteWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteWatermarkInfoWithOptions(request, runtime);
        }

        public async Task<DeleteWatermarkInfoResponse> DeleteWatermarkInfoAsync(DeleteWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteWatermarkInfoWithOptionsAsync(request, runtime);
        }

        public DeleteWatermarkGroupResponse DeleteWatermarkGroupWithOptions(DeleteWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkGroupResponse>(DoRequest("DeleteWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteWatermarkGroupResponse> DeleteWatermarkGroupWithOptionsAsync(DeleteWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkGroupResponse>(await DoRequestAsync("DeleteWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteWatermarkGroupResponse DeleteWatermarkGroup(DeleteWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteWatermarkGroupWithOptions(request, runtime);
        }

        public async Task<DeleteWatermarkGroupResponse> DeleteWatermarkGroupAsync(DeleteWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteWatermarkGroupWithOptionsAsync(request, runtime);
        }

        public DeleteCompanionresourceInfoResponse DeleteCompanionresourceInfoWithOptions(DeleteCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCompanionresourceInfoResponse>(DoRequest("DeleteCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteCompanionresourceInfoResponse> DeleteCompanionresourceInfoWithOptionsAsync(DeleteCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCompanionresourceInfoResponse>(await DoRequestAsync("DeleteCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteCompanionresourceInfoResponse DeleteCompanionresourceInfo(DeleteCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteCompanionresourceInfoWithOptions(request, runtime);
        }

        public async Task<DeleteCompanionresourceInfoResponse> DeleteCompanionresourceInfoAsync(DeleteCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteCompanionresourceInfoWithOptionsAsync(request, runtime);
        }

        public CreateUploadMediaFileResponse CreateUploadMediaFileWithOptions(CreateUploadMediaFileRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadMediaFileResponse>(DoRequest("CreateUploadMediaFile", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateUploadMediaFileResponse> CreateUploadMediaFileWithOptionsAsync(CreateUploadMediaFileRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadMediaFileResponse>(await DoRequestAsync("CreateUploadMediaFile", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateUploadMediaFileResponse CreateUploadMediaFile(CreateUploadMediaFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateUploadMediaFileWithOptions(request, runtime);
        }

        public async Task<CreateUploadMediaFileResponse> CreateUploadMediaFileAsync(CreateUploadMediaFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateUploadMediaFileWithOptionsAsync(request, runtime);
        }

        public AddWatermarkRelationResponse AddWatermarkRelationWithOptions(AddWatermarkRelationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkRelationResponse>(DoRequest("AddWatermarkRelation", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddWatermarkRelationResponse> AddWatermarkRelationWithOptionsAsync(AddWatermarkRelationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkRelationResponse>(await DoRequestAsync("AddWatermarkRelation", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddWatermarkRelationResponse AddWatermarkRelation(AddWatermarkRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddWatermarkRelationWithOptions(request, runtime);
        }

        public async Task<AddWatermarkRelationResponse> AddWatermarkRelationAsync(AddWatermarkRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddWatermarkRelationWithOptionsAsync(request, runtime);
        }

        public AddWatermarkInfoResponse AddWatermarkInfoWithOptions(AddWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkInfoResponse>(DoRequest("AddWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddWatermarkInfoResponse> AddWatermarkInfoWithOptionsAsync(AddWatermarkInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkInfoResponse>(await DoRequestAsync("AddWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddWatermarkInfoResponse AddWatermarkInfo(AddWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddWatermarkInfoWithOptions(request, runtime);
        }

        public async Task<AddWatermarkInfoResponse> AddWatermarkInfoAsync(AddWatermarkInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddWatermarkInfoWithOptionsAsync(request, runtime);
        }

        public AddWatermarkGroupResponse AddWatermarkGroupWithOptions(AddWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkGroupResponse>(DoRequest("AddWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddWatermarkGroupResponse> AddWatermarkGroupWithOptionsAsync(AddWatermarkGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkGroupResponse>(await DoRequestAsync("AddWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddWatermarkGroupResponse AddWatermarkGroup(AddWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddWatermarkGroupWithOptions(request, runtime);
        }

        public async Task<AddWatermarkGroupResponse> AddWatermarkGroupAsync(AddWatermarkGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddWatermarkGroupWithOptionsAsync(request, runtime);
        }

        public AddCompanionresourceInfoResponse AddCompanionresourceInfoWithOptions(AddCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCompanionresourceInfoResponse>(DoRequest("AddCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddCompanionresourceInfoResponse> AddCompanionresourceInfoWithOptionsAsync(AddCompanionresourceInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCompanionresourceInfoResponse>(await DoRequestAsync("AddCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddCompanionresourceInfoResponse AddCompanionresourceInfo(AddCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddCompanionresourceInfoWithOptions(request, runtime);
        }

        public async Task<AddCompanionresourceInfoResponse> AddCompanionresourceInfoAsync(AddCompanionresourceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddCompanionresourceInfoWithOptionsAsync(request, runtime);
        }

        public OpenVodServiceResponse OpenVodServiceWithOptions(OpenVodServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenVodServiceResponse>(DoRequest("OpenVodService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<OpenVodServiceResponse> OpenVodServiceWithOptionsAsync(OpenVodServiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenVodServiceResponse>(await DoRequestAsync("OpenVodService", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public OpenVodServiceResponse OpenVodService(OpenVodServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return OpenVodServiceWithOptions(request, runtime);
        }

        public async Task<OpenVodServiceResponse> OpenVodServiceAsync(OpenVodServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await OpenVodServiceWithOptionsAsync(request, runtime);
        }

        public SubmitAIVideoCategoryJobResponse SubmitAIVideoCategoryJobWithOptions(SubmitAIVideoCategoryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoCategoryJobResponse>(DoRequest("SubmitAIVideoCategoryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIVideoCategoryJobResponse> SubmitAIVideoCategoryJobWithOptionsAsync(SubmitAIVideoCategoryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoCategoryJobResponse>(await DoRequestAsync("SubmitAIVideoCategoryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIVideoCategoryJobResponse SubmitAIVideoCategoryJob(SubmitAIVideoCategoryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIVideoCategoryJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIVideoCategoryJobResponse> SubmitAIVideoCategoryJobAsync(SubmitAIVideoCategoryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIVideoCategoryJobWithOptionsAsync(request, runtime);
        }

        public ListAIVideoCategoryJobResponse ListAIVideoCategoryJobWithOptions(ListAIVideoCategoryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoCategoryJobResponse>(DoRequest("ListAIVideoCategoryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIVideoCategoryJobResponse> ListAIVideoCategoryJobWithOptionsAsync(ListAIVideoCategoryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoCategoryJobResponse>(await DoRequestAsync("ListAIVideoCategoryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIVideoCategoryJobResponse ListAIVideoCategoryJob(ListAIVideoCategoryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIVideoCategoryJobWithOptions(request, runtime);
        }

        public async Task<ListAIVideoCategoryJobResponse> ListAIVideoCategoryJobAsync(ListAIVideoCategoryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIVideoCategoryJobWithOptionsAsync(request, runtime);
        }

        public CreateOrderResponse CreateOrderWithOptions(CreateOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(DoRequest("CreateOrder", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateOrderResponse> CreateOrderWithOptionsAsync(CreateOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(await DoRequestAsync("CreateOrder", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateOrderResponse CreateOrder(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateOrderWithOptions(request, runtime);
        }

        public async Task<CreateOrderResponse> CreateOrderAsync(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateOrderWithOptionsAsync(request, runtime);
        }

        public GetBatchPlayInfoResponse GetBatchPlayInfoWithOptions(GetBatchPlayInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBatchPlayInfoResponse>(DoRequest("GetBatchPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetBatchPlayInfoResponse> GetBatchPlayInfoWithOptionsAsync(GetBatchPlayInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBatchPlayInfoResponse>(await DoRequestAsync("GetBatchPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetBatchPlayInfoResponse GetBatchPlayInfo(GetBatchPlayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetBatchPlayInfoWithOptions(request, runtime);
        }

        public async Task<GetBatchPlayInfoResponse> GetBatchPlayInfoAsync(GetBatchPlayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetBatchPlayInfoWithOptionsAsync(request, runtime);
        }

        public SubmitAIVideoTerrorismRecogJobResponse SubmitAIVideoTerrorismRecogJobWithOptions(SubmitAIVideoTerrorismRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoTerrorismRecogJobResponse>(DoRequest("SubmitAIVideoTerrorismRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIVideoTerrorismRecogJobResponse> SubmitAIVideoTerrorismRecogJobWithOptionsAsync(SubmitAIVideoTerrorismRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoTerrorismRecogJobResponse>(await DoRequestAsync("SubmitAIVideoTerrorismRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIVideoTerrorismRecogJobResponse SubmitAIVideoTerrorismRecogJob(SubmitAIVideoTerrorismRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIVideoTerrorismRecogJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIVideoTerrorismRecogJobResponse> SubmitAIVideoTerrorismRecogJobAsync(SubmitAIVideoTerrorismRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIVideoTerrorismRecogJobWithOptionsAsync(request, runtime);
        }

        public SubmitAIVideoCensorJobResponse SubmitAIVideoCensorJobWithOptions(SubmitAIVideoCensorJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoCensorJobResponse>(DoRequest("SubmitAIVideoCensorJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIVideoCensorJobResponse> SubmitAIVideoCensorJobWithOptionsAsync(SubmitAIVideoCensorJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoCensorJobResponse>(await DoRequestAsync("SubmitAIVideoCensorJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIVideoCensorJobResponse SubmitAIVideoCensorJob(SubmitAIVideoCensorJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIVideoCensorJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIVideoCensorJobResponse> SubmitAIVideoCensorJobAsync(SubmitAIVideoCensorJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIVideoCensorJobWithOptionsAsync(request, runtime);
        }

        public ListAIVideoTerrorismRecogJobResponse ListAIVideoTerrorismRecogJobWithOptions(ListAIVideoTerrorismRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoTerrorismRecogJobResponse>(DoRequest("ListAIVideoTerrorismRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIVideoTerrorismRecogJobResponse> ListAIVideoTerrorismRecogJobWithOptionsAsync(ListAIVideoTerrorismRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoTerrorismRecogJobResponse>(await DoRequestAsync("ListAIVideoTerrorismRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIVideoTerrorismRecogJobResponse ListAIVideoTerrorismRecogJob(ListAIVideoTerrorismRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIVideoTerrorismRecogJobWithOptions(request, runtime);
        }

        public async Task<ListAIVideoTerrorismRecogJobResponse> ListAIVideoTerrorismRecogJobAsync(ListAIVideoTerrorismRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIVideoTerrorismRecogJobWithOptionsAsync(request, runtime);
        }

        public ListAIVideoCensorJobResponse ListAIVideoCensorJobWithOptions(ListAIVideoCensorJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoCensorJobResponse>(DoRequest("ListAIVideoCensorJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIVideoCensorJobResponse> ListAIVideoCensorJobWithOptionsAsync(ListAIVideoCensorJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoCensorJobResponse>(await DoRequestAsync("ListAIVideoCensorJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIVideoCensorJobResponse ListAIVideoCensorJob(ListAIVideoCensorJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIVideoCensorJobWithOptions(request, runtime);
        }

        public async Task<ListAIVideoCensorJobResponse> ListAIVideoCensorJobAsync(ListAIVideoCensorJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIVideoCensorJobWithOptionsAsync(request, runtime);
        }

        public DeleteStreamResponse DeleteStreamWithOptions(DeleteStreamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStreamResponse>(DoRequest("DeleteStream", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteStreamResponse> DeleteStreamWithOptionsAsync(DeleteStreamRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStreamResponse>(await DoRequestAsync("DeleteStream", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteStreamResponse DeleteStream(DeleteStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteStreamWithOptions(request, runtime);
        }

        public async Task<DeleteStreamResponse> DeleteStreamAsync(DeleteStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteStreamWithOptionsAsync(request, runtime);
        }

        public SubmitSnapshotJobResponse SubmitSnapshotJobWithOptions(SubmitSnapshotJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitSnapshotJobResponse>(DoRequest("SubmitSnapshotJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitSnapshotJobResponse> SubmitSnapshotJobWithOptionsAsync(SubmitSnapshotJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitSnapshotJobResponse>(await DoRequestAsync("SubmitSnapshotJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitSnapshotJobResponse SubmitSnapshotJob(SubmitSnapshotJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitSnapshotJobWithOptions(request, runtime);
        }

        public async Task<SubmitSnapshotJobResponse> SubmitSnapshotJobAsync(SubmitSnapshotJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitSnapshotJobWithOptionsAsync(request, runtime);
        }

        public DescribeDomainFlowDataResponse DescribeDomainFlowDataWithOptions(DescribeDomainFlowDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeDomainFlowDataResponse>(DoRequest("DescribeDomainFlowData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeDomainFlowDataResponse> DescribeDomainFlowDataWithOptionsAsync(DescribeDomainFlowDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeDomainFlowDataResponse>(await DoRequestAsync("DescribeDomainFlowData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeDomainFlowDataResponse DescribeDomainFlowData(DescribeDomainFlowDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeDomainFlowDataWithOptions(request, runtime);
        }

        public async Task<DescribeDomainFlowDataResponse> DescribeDomainFlowDataAsync(DescribeDomainFlowDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeDomainFlowDataWithOptionsAsync(request, runtime);
        }

        public DescribeDomainBpsDataResponse DescribeDomainBpsDataWithOptions(DescribeDomainBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeDomainBpsDataResponse>(DoRequest("DescribeDomainBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeDomainBpsDataResponse> DescribeDomainBpsDataWithOptionsAsync(DescribeDomainBpsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeDomainBpsDataResponse>(await DoRequestAsync("DescribeDomainBpsData", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeDomainBpsDataResponse DescribeDomainBpsData(DescribeDomainBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeDomainBpsDataWithOptions(request, runtime);
        }

        public async Task<DescribeDomainBpsDataResponse> DescribeDomainBpsDataAsync(DescribeDomainBpsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeDomainBpsDataWithOptionsAsync(request, runtime);
        }

        public DescribeCdnDomainLogsResponse DescribeCdnDomainLogsWithOptions(DescribeCdnDomainLogsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCdnDomainLogsResponse>(DoRequest("DescribeCdnDomainLogs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeCdnDomainLogsResponse> DescribeCdnDomainLogsWithOptionsAsync(DescribeCdnDomainLogsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeCdnDomainLogsResponse>(await DoRequestAsync("DescribeCdnDomainLogs", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeCdnDomainLogsResponse DescribeCdnDomainLogs(DescribeCdnDomainLogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeCdnDomainLogsWithOptions(request, runtime);
        }

        public async Task<DescribeCdnDomainLogsResponse> DescribeCdnDomainLogsAsync(DescribeCdnDomainLogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeCdnDomainLogsWithOptionsAsync(request, runtime);
        }

        public SubmitAIVideoSummaryJobResponse SubmitAIVideoSummaryJobWithOptions(SubmitAIVideoSummaryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoSummaryJobResponse>(DoRequest("SubmitAIVideoSummaryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIVideoSummaryJobResponse> SubmitAIVideoSummaryJobWithOptionsAsync(SubmitAIVideoSummaryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoSummaryJobResponse>(await DoRequestAsync("SubmitAIVideoSummaryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIVideoSummaryJobResponse SubmitAIVideoSummaryJob(SubmitAIVideoSummaryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIVideoSummaryJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIVideoSummaryJobResponse> SubmitAIVideoSummaryJobAsync(SubmitAIVideoSummaryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIVideoSummaryJobWithOptionsAsync(request, runtime);
        }

        public ListAIVideoSummaryJobResponse ListAIVideoSummaryJobWithOptions(ListAIVideoSummaryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoSummaryJobResponse>(DoRequest("ListAIVideoSummaryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIVideoSummaryJobResponse> ListAIVideoSummaryJobWithOptionsAsync(ListAIVideoSummaryJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoSummaryJobResponse>(await DoRequestAsync("ListAIVideoSummaryJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIVideoSummaryJobResponse ListAIVideoSummaryJob(ListAIVideoSummaryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIVideoSummaryJobWithOptions(request, runtime);
        }

        public async Task<ListAIVideoSummaryJobResponse> ListAIVideoSummaryJobAsync(ListAIVideoSummaryJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIVideoSummaryJobWithOptionsAsync(request, runtime);
        }

        public DescribeUserVvTopByDayResponse DescribeUserVvTopByDayWithOptions(DescribeUserVvTopByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVvTopByDayResponse>(DoRequest("DescribeUserVvTopByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserVvTopByDayResponse> DescribeUserVvTopByDayWithOptionsAsync(DescribeUserVvTopByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVvTopByDayResponse>(await DoRequestAsync("DescribeUserVvTopByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserVvTopByDayResponse DescribeUserVvTopByDay(DescribeUserVvTopByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserVvTopByDayWithOptions(request, runtime);
        }

        public async Task<DescribeUserVvTopByDayResponse> DescribeUserVvTopByDayAsync(DescribeUserVvTopByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserVvTopByDayWithOptionsAsync(request, runtime);
        }

        public DescribeUserVvByVideoidResponse DescribeUserVvByVideoidWithOptions(DescribeUserVvByVideoidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVvByVideoidResponse>(DoRequest("DescribeUserVvByVideoid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserVvByVideoidResponse> DescribeUserVvByVideoidWithOptionsAsync(DescribeUserVvByVideoidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVvByVideoidResponse>(await DoRequestAsync("DescribeUserVvByVideoid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserVvByVideoidResponse DescribeUserVvByVideoid(DescribeUserVvByVideoidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserVvByVideoidWithOptions(request, runtime);
        }

        public async Task<DescribeUserVvByVideoidResponse> DescribeUserVvByVideoidAsync(DescribeUserVvByVideoidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserVvByVideoidWithOptionsAsync(request, runtime);
        }

        public DescribeUserVvByDayResponse DescribeUserVvByDayWithOptions(DescribeUserVvByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVvByDayResponse>(DoRequest("DescribeUserVvByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserVvByDayResponse> DescribeUserVvByDayWithOptionsAsync(DescribeUserVvByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserVvByDayResponse>(await DoRequestAsync("DescribeUserVvByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserVvByDayResponse DescribeUserVvByDay(DescribeUserVvByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserVvByDayWithOptions(request, runtime);
        }

        public async Task<DescribeUserVvByDayResponse> DescribeUserVvByDayAsync(DescribeUserVvByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserVvByDayWithOptionsAsync(request, runtime);
        }

        public DescribeUserUvByDayResponse DescribeUserUvByDayWithOptions(DescribeUserUvByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserUvByDayResponse>(DoRequest("DescribeUserUvByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserUvByDayResponse> DescribeUserUvByDayWithOptionsAsync(DescribeUserUvByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserUvByDayResponse>(await DoRequestAsync("DescribeUserUvByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserUvByDayResponse DescribeUserUvByDay(DescribeUserUvByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserUvByDayWithOptions(request, runtime);
        }

        public async Task<DescribeUserUvByDayResponse> DescribeUserUvByDayAsync(DescribeUserUvByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserUvByDayWithOptionsAsync(request, runtime);
        }

        public DescribeUserTimeRangeByDayResponse DescribeUserTimeRangeByDayWithOptions(DescribeUserTimeRangeByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserTimeRangeByDayResponse>(DoRequest("DescribeUserTimeRangeByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserTimeRangeByDayResponse> DescribeUserTimeRangeByDayWithOptionsAsync(DescribeUserTimeRangeByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserTimeRangeByDayResponse>(await DoRequestAsync("DescribeUserTimeRangeByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserTimeRangeByDayResponse DescribeUserTimeRangeByDay(DescribeUserTimeRangeByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserTimeRangeByDayWithOptions(request, runtime);
        }

        public async Task<DescribeUserTimeRangeByDayResponse> DescribeUserTimeRangeByDayAsync(DescribeUserTimeRangeByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserTimeRangeByDayWithOptionsAsync(request, runtime);
        }

        public DescribeUserAvgTimeByDayResponse DescribeUserAvgTimeByDayWithOptions(DescribeUserAvgTimeByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserAvgTimeByDayResponse>(DoRequest("DescribeUserAvgTimeByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserAvgTimeByDayResponse> DescribeUserAvgTimeByDayWithOptionsAsync(DescribeUserAvgTimeByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserAvgTimeByDayResponse>(await DoRequestAsync("DescribeUserAvgTimeByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserAvgTimeByDayResponse DescribeUserAvgTimeByDay(DescribeUserAvgTimeByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserAvgTimeByDayWithOptions(request, runtime);
        }

        public async Task<DescribeUserAvgTimeByDayResponse> DescribeUserAvgTimeByDayAsync(DescribeUserAvgTimeByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserAvgTimeByDayWithOptionsAsync(request, runtime);
        }

        public DescribeUserAvgCountByDayResponse DescribeUserAvgCountByDayWithOptions(DescribeUserAvgCountByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserAvgCountByDayResponse>(DoRequest("DescribeUserAvgCountByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeUserAvgCountByDayResponse> DescribeUserAvgCountByDayWithOptionsAsync(DescribeUserAvgCountByDayRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeUserAvgCountByDayResponse>(await DoRequestAsync("DescribeUserAvgCountByDay", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeUserAvgCountByDayResponse DescribeUserAvgCountByDay(DescribeUserAvgCountByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeUserAvgCountByDayWithOptions(request, runtime);
        }

        public async Task<DescribeUserAvgCountByDayResponse> DescribeUserAvgCountByDayAsync(DescribeUserAvgCountByDayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeUserAvgCountByDayWithOptionsAsync(request, runtime);
        }

        public SetDefaultTemplateGroupResponse SetDefaultTemplateGroupWithOptions(SetDefaultTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultTemplateGroupResponse>(DoRequest("SetDefaultTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetDefaultTemplateGroupResponse> SetDefaultTemplateGroupWithOptionsAsync(SetDefaultTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultTemplateGroupResponse>(await DoRequestAsync("SetDefaultTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetDefaultTemplateGroupResponse SetDefaultTemplateGroup(SetDefaultTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetDefaultTemplateGroupWithOptions(request, runtime);
        }

        public async Task<SetDefaultTemplateGroupResponse> SetDefaultTemplateGroupAsync(SetDefaultTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetDefaultTemplateGroupWithOptionsAsync(request, runtime);
        }

        public SubmitAIASRJobResponse SubmitAIASRJobWithOptions(SubmitAIASRJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIASRJobResponse>(DoRequest("SubmitAIASRJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIASRJobResponse> SubmitAIASRJobWithOptionsAsync(SubmitAIASRJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIASRJobResponse>(await DoRequestAsync("SubmitAIASRJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIASRJobResponse SubmitAIASRJob(SubmitAIASRJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIASRJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIASRJobResponse> SubmitAIASRJobAsync(SubmitAIASRJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIASRJobWithOptionsAsync(request, runtime);
        }

        public ListAIASRJobResponse ListAIASRJobWithOptions(ListAIASRJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIASRJobResponse>(DoRequest("ListAIASRJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIASRJobResponse> ListAIASRJobWithOptionsAsync(ListAIASRJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIASRJobResponse>(await DoRequestAsync("ListAIASRJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIASRJobResponse ListAIASRJob(ListAIASRJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIASRJobWithOptions(request, runtime);
        }

        public async Task<ListAIASRJobResponse> ListAIASRJobAsync(ListAIASRJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIASRJobWithOptionsAsync(request, runtime);
        }

        public GetMezzanineInfoResponse GetMezzanineInfoWithOptions(GetMezzanineInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMezzanineInfoResponse>(DoRequest("GetMezzanineInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMezzanineInfoResponse> GetMezzanineInfoWithOptionsAsync(GetMezzanineInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMezzanineInfoResponse>(await DoRequestAsync("GetMezzanineInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMezzanineInfoResponse GetMezzanineInfo(GetMezzanineInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMezzanineInfoWithOptions(request, runtime);
        }

        public async Task<GetMezzanineInfoResponse> GetMezzanineInfoAsync(GetMezzanineInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMezzanineInfoWithOptionsAsync(request, runtime);
        }

        public UpdateTemplateGroupResponse UpdateTemplateGroupWithOptions(UpdateTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTemplateGroupResponse>(DoRequest("UpdateTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateTemplateGroupResponse> UpdateTemplateGroupWithOptionsAsync(UpdateTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTemplateGroupResponse>(await DoRequestAsync("UpdateTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateTemplateGroupResponse UpdateTemplateGroup(UpdateTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateTemplateGroupWithOptions(request, runtime);
        }

        public async Task<UpdateTemplateGroupResponse> UpdateTemplateGroupAsync(UpdateTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateTemplateGroupWithOptionsAsync(request, runtime);
        }

        public UpdateCustomTemplateAndGroupResponse UpdateCustomTemplateAndGroupWithOptions(UpdateCustomTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomTemplateAndGroupResponse>(DoRequest("UpdateCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateCustomTemplateAndGroupResponse> UpdateCustomTemplateAndGroupWithOptionsAsync(UpdateCustomTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomTemplateAndGroupResponse>(await DoRequestAsync("UpdateCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateCustomTemplateAndGroupResponse UpdateCustomTemplateAndGroup(UpdateCustomTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateCustomTemplateAndGroupWithOptions(request, runtime);
        }

        public async Task<UpdateCustomTemplateAndGroupResponse> UpdateCustomTemplateAndGroupAsync(UpdateCustomTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateCustomTemplateAndGroupWithOptionsAsync(request, runtime);
        }

        public UpdateCustomTemplateResponse UpdateCustomTemplateWithOptions(UpdateCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomTemplateResponse>(DoRequest("UpdateCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateCustomTemplateResponse> UpdateCustomTemplateWithOptionsAsync(UpdateCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomTemplateResponse>(await DoRequestAsync("UpdateCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateCustomTemplateResponse UpdateCustomTemplate(UpdateCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateCustomTemplateWithOptions(request, runtime);
        }

        public async Task<UpdateCustomTemplateResponse> UpdateCustomTemplateAsync(UpdateCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateCustomTemplateWithOptionsAsync(request, runtime);
        }

        public ListTemplateGroupResponse ListTemplateGroupWithOptions(ListTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTemplateGroupResponse>(DoRequest("ListTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListTemplateGroupResponse> ListTemplateGroupWithOptionsAsync(ListTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTemplateGroupResponse>(await DoRequestAsync("ListTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListTemplateGroupResponse ListTemplateGroup(ListTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListTemplateGroupWithOptions(request, runtime);
        }

        public async Task<ListTemplateGroupResponse> ListTemplateGroupAsync(ListTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListTemplateGroupWithOptionsAsync(request, runtime);
        }

        public ListCustomTemplateResponse ListCustomTemplateWithOptions(ListCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCustomTemplateResponse>(DoRequest("ListCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListCustomTemplateResponse> ListCustomTemplateWithOptionsAsync(ListCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCustomTemplateResponse>(await DoRequestAsync("ListCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListCustomTemplateResponse ListCustomTemplate(ListCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListCustomTemplateWithOptions(request, runtime);
        }

        public async Task<ListCustomTemplateResponse> ListCustomTemplateAsync(ListCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListCustomTemplateWithOptionsAsync(request, runtime);
        }

        public InitSystemTemplateGroupResponse InitSystemTemplateGroupWithOptions(InitSystemTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSystemTemplateGroupResponse>(DoRequest("InitSystemTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<InitSystemTemplateGroupResponse> InitSystemTemplateGroupWithOptionsAsync(InitSystemTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSystemTemplateGroupResponse>(await DoRequestAsync("InitSystemTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public InitSystemTemplateGroupResponse InitSystemTemplateGroup(InitSystemTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return InitSystemTemplateGroupWithOptions(request, runtime);
        }

        public async Task<InitSystemTemplateGroupResponse> InitSystemTemplateGroupAsync(InitSystemTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await InitSystemTemplateGroupWithOptionsAsync(request, runtime);
        }

        public InitCustomerWorkFlowResponse InitCustomerWorkFlowWithOptions(InitCustomerWorkFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCustomerWorkFlowResponse>(DoRequest("InitCustomerWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<InitCustomerWorkFlowResponse> InitCustomerWorkFlowWithOptionsAsync(InitCustomerWorkFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCustomerWorkFlowResponse>(await DoRequestAsync("InitCustomerWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public InitCustomerWorkFlowResponse InitCustomerWorkFlow(InitCustomerWorkFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return InitCustomerWorkFlowWithOptions(request, runtime);
        }

        public async Task<InitCustomerWorkFlowResponse> InitCustomerWorkFlowAsync(InitCustomerWorkFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await InitCustomerWorkFlowWithOptionsAsync(request, runtime);
        }

        public InitCustomerWithSystemTemplateAndGroupResponse InitCustomerWithSystemTemplateAndGroupWithOptions(InitCustomerWithSystemTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCustomerWithSystemTemplateAndGroupResponse>(DoRequest("InitCustomerWithSystemTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<InitCustomerWithSystemTemplateAndGroupResponse> InitCustomerWithSystemTemplateAndGroupWithOptionsAsync(InitCustomerWithSystemTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCustomerWithSystemTemplateAndGroupResponse>(await DoRequestAsync("InitCustomerWithSystemTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public InitCustomerWithSystemTemplateAndGroupResponse InitCustomerWithSystemTemplateAndGroup(InitCustomerWithSystemTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return InitCustomerWithSystemTemplateAndGroupWithOptions(request, runtime);
        }

        public async Task<InitCustomerWithSystemTemplateAndGroupResponse> InitCustomerWithSystemTemplateAndGroupAsync(InitCustomerWithSystemTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await InitCustomerWithSystemTemplateAndGroupWithOptionsAsync(request, runtime);
        }

        public GetTemplateGroupResponse GetTemplateGroupWithOptions(GetTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTemplateGroupResponse>(DoRequest("GetTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetTemplateGroupResponse> GetTemplateGroupWithOptionsAsync(GetTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTemplateGroupResponse>(await DoRequestAsync("GetTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetTemplateGroupResponse GetTemplateGroup(GetTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetTemplateGroupWithOptions(request, runtime);
        }

        public async Task<GetTemplateGroupResponse> GetTemplateGroupAsync(GetTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetTemplateGroupWithOptionsAsync(request, runtime);
        }

        public GetCustomTemplateResponse GetCustomTemplateWithOptions(GetCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomTemplateResponse>(DoRequest("GetCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCustomTemplateResponse> GetCustomTemplateWithOptionsAsync(GetCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomTemplateResponse>(await DoRequestAsync("GetCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCustomTemplateResponse GetCustomTemplate(GetCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCustomTemplateWithOptions(request, runtime);
        }

        public async Task<GetCustomTemplateResponse> GetCustomTemplateAsync(GetCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCustomTemplateWithOptionsAsync(request, runtime);
        }

        public DeleteTemplateGroupResponse DeleteTemplateGroupWithOptions(DeleteTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTemplateGroupResponse>(DoRequest("DeleteTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteTemplateGroupResponse> DeleteTemplateGroupWithOptionsAsync(DeleteTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTemplateGroupResponse>(await DoRequestAsync("DeleteTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteTemplateGroupResponse DeleteTemplateGroup(DeleteTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteTemplateGroupWithOptions(request, runtime);
        }

        public async Task<DeleteTemplateGroupResponse> DeleteTemplateGroupAsync(DeleteTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteTemplateGroupWithOptionsAsync(request, runtime);
        }

        public DeleteInitCustomTemplateInfoResponse DeleteInitCustomTemplateInfoWithOptions(DeleteInitCustomTemplateInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInitCustomTemplateInfoResponse>(DoRequest("DeleteInitCustomTemplateInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteInitCustomTemplateInfoResponse> DeleteInitCustomTemplateInfoWithOptionsAsync(DeleteInitCustomTemplateInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteInitCustomTemplateInfoResponse>(await DoRequestAsync("DeleteInitCustomTemplateInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteInitCustomTemplateInfoResponse DeleteInitCustomTemplateInfo(DeleteInitCustomTemplateInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteInitCustomTemplateInfoWithOptions(request, runtime);
        }

        public async Task<DeleteInitCustomTemplateInfoResponse> DeleteInitCustomTemplateInfoAsync(DeleteInitCustomTemplateInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteInitCustomTemplateInfoWithOptionsAsync(request, runtime);
        }

        public DeleteCustomTemplateAndGroupResponse DeleteCustomTemplateAndGroupWithOptions(DeleteCustomTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCustomTemplateAndGroupResponse>(DoRequest("DeleteCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteCustomTemplateAndGroupResponse> DeleteCustomTemplateAndGroupWithOptionsAsync(DeleteCustomTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCustomTemplateAndGroupResponse>(await DoRequestAsync("DeleteCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteCustomTemplateAndGroupResponse DeleteCustomTemplateAndGroup(DeleteCustomTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteCustomTemplateAndGroupWithOptions(request, runtime);
        }

        public async Task<DeleteCustomTemplateAndGroupResponse> DeleteCustomTemplateAndGroupAsync(DeleteCustomTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteCustomTemplateAndGroupWithOptionsAsync(request, runtime);
        }

        public DeleteCustomTemplateResponse DeleteCustomTemplateWithOptions(DeleteCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCustomTemplateResponse>(DoRequest("DeleteCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteCustomTemplateResponse> DeleteCustomTemplateWithOptionsAsync(DeleteCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCustomTemplateResponse>(await DoRequestAsync("DeleteCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteCustomTemplateResponse DeleteCustomTemplate(DeleteCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteCustomTemplateWithOptions(request, runtime);
        }

        public async Task<DeleteCustomTemplateResponse> DeleteCustomTemplateAsync(DeleteCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteCustomTemplateWithOptionsAsync(request, runtime);
        }

        public AddTemplateGroupResponse AddTemplateGroupWithOptions(AddTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTemplateGroupResponse>(DoRequest("AddTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddTemplateGroupResponse> AddTemplateGroupWithOptionsAsync(AddTemplateGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTemplateGroupResponse>(await DoRequestAsync("AddTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddTemplateGroupResponse AddTemplateGroup(AddTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddTemplateGroupWithOptions(request, runtime);
        }

        public async Task<AddTemplateGroupResponse> AddTemplateGroupAsync(AddTemplateGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddTemplateGroupWithOptionsAsync(request, runtime);
        }

        public AddCustomTemplateAndGroupResponse AddCustomTemplateAndGroupWithOptions(AddCustomTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCustomTemplateAndGroupResponse>(DoRequest("AddCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddCustomTemplateAndGroupResponse> AddCustomTemplateAndGroupWithOptionsAsync(AddCustomTemplateAndGroupRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCustomTemplateAndGroupResponse>(await DoRequestAsync("AddCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddCustomTemplateAndGroupResponse AddCustomTemplateAndGroup(AddCustomTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddCustomTemplateAndGroupWithOptions(request, runtime);
        }

        public async Task<AddCustomTemplateAndGroupResponse> AddCustomTemplateAndGroupAsync(AddCustomTemplateAndGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddCustomTemplateAndGroupWithOptionsAsync(request, runtime);
        }

        public AddCustomTemplateResponse AddCustomTemplateWithOptions(AddCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCustomTemplateResponse>(DoRequest("AddCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddCustomTemplateResponse> AddCustomTemplateWithOptionsAsync(AddCustomTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCustomTemplateResponse>(await DoRequestAsync("AddCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddCustomTemplateResponse AddCustomTemplate(AddCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddCustomTemplateWithOptions(request, runtime);
        }

        public async Task<AddCustomTemplateResponse> AddCustomTemplateAsync(AddCustomTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddCustomTemplateWithOptionsAsync(request, runtime);
        }

        public SubmitAIVideoPornRecogJobResponse SubmitAIVideoPornRecogJobWithOptions(SubmitAIVideoPornRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoPornRecogJobResponse>(DoRequest("SubmitAIVideoPornRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIVideoPornRecogJobResponse> SubmitAIVideoPornRecogJobWithOptionsAsync(SubmitAIVideoPornRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoPornRecogJobResponse>(await DoRequestAsync("SubmitAIVideoPornRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIVideoPornRecogJobResponse SubmitAIVideoPornRecogJob(SubmitAIVideoPornRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIVideoPornRecogJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIVideoPornRecogJobResponse> SubmitAIVideoPornRecogJobAsync(SubmitAIVideoPornRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIVideoPornRecogJobWithOptionsAsync(request, runtime);
        }

        public ListAIVideoPornRecogJobResponse ListAIVideoPornRecogJobWithOptions(ListAIVideoPornRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoPornRecogJobResponse>(DoRequest("ListAIVideoPornRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIVideoPornRecogJobResponse> ListAIVideoPornRecogJobWithOptionsAsync(ListAIVideoPornRecogJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoPornRecogJobResponse>(await DoRequestAsync("ListAIVideoPornRecogJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIVideoPornRecogJobResponse ListAIVideoPornRecogJob(ListAIVideoPornRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIVideoPornRecogJobWithOptions(request, runtime);
        }

        public async Task<ListAIVideoPornRecogJobResponse> ListAIVideoPornRecogJobAsync(ListAIVideoPornRecogJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIVideoPornRecogJobWithOptionsAsync(request, runtime);
        }

        public SubmitAIVideoCoverJobResponse SubmitAIVideoCoverJobWithOptions(SubmitAIVideoCoverJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoCoverJobResponse>(DoRequest("SubmitAIVideoCoverJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubmitAIVideoCoverJobResponse> SubmitAIVideoCoverJobWithOptionsAsync(SubmitAIVideoCoverJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAIVideoCoverJobResponse>(await DoRequestAsync("SubmitAIVideoCoverJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SubmitAIVideoCoverJobResponse SubmitAIVideoCoverJob(SubmitAIVideoCoverJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubmitAIVideoCoverJobWithOptions(request, runtime);
        }

        public async Task<SubmitAIVideoCoverJobResponse> SubmitAIVideoCoverJobAsync(SubmitAIVideoCoverJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubmitAIVideoCoverJobWithOptionsAsync(request, runtime);
        }

        public ListAIVideoCoverJobResponse ListAIVideoCoverJobWithOptions(ListAIVideoCoverJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoCoverJobResponse>(DoRequest("ListAIVideoCoverJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAIVideoCoverJobResponse> ListAIVideoCoverJobWithOptionsAsync(ListAIVideoCoverJobRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAIVideoCoverJobResponse>(await DoRequestAsync("ListAIVideoCoverJob", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAIVideoCoverJobResponse ListAIVideoCoverJob(ListAIVideoCoverJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAIVideoCoverJobWithOptions(request, runtime);
        }

        public async Task<ListAIVideoCoverJobResponse> ListAIVideoCoverJobAsync(ListAIVideoCoverJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAIVideoCoverJobWithOptionsAsync(request, runtime);
        }

        public DeleteAudioTemplateResponse DeleteAudioTemplateWithOptions(DeleteAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAudioTemplateResponse>(DoRequest("DeleteAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteAudioTemplateResponse> DeleteAudioTemplateWithOptionsAsync(DeleteAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAudioTemplateResponse>(await DoRequestAsync("DeleteAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteAudioTemplateResponse DeleteAudioTemplate(DeleteAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteAudioTemplateWithOptions(request, runtime);
        }

        public async Task<DeleteAudioTemplateResponse> DeleteAudioTemplateAsync(DeleteAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteAudioTemplateWithOptionsAsync(request, runtime);
        }

        public DeleteAudioConfigResponse DeleteAudioConfigWithOptions(DeleteAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAudioConfigResponse>(DoRequest("DeleteAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteAudioConfigResponse> DeleteAudioConfigWithOptionsAsync(DeleteAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAudioConfigResponse>(await DoRequestAsync("DeleteAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteAudioConfigResponse DeleteAudioConfig(DeleteAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteAudioConfigWithOptions(request, runtime);
        }

        public async Task<DeleteAudioConfigResponse> DeleteAudioConfigAsync(DeleteAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteAudioConfigWithOptionsAsync(request, runtime);
        }

        public AddOriginTemplateResponse AddOriginTemplateWithOptions(AddOriginTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddOriginTemplateResponse>(DoRequest("AddOriginTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddOriginTemplateResponse> AddOriginTemplateWithOptionsAsync(AddOriginTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddOriginTemplateResponse>(await DoRequestAsync("AddOriginTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddOriginTemplateResponse AddOriginTemplate(AddOriginTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddOriginTemplateWithOptions(request, runtime);
        }

        public async Task<AddOriginTemplateResponse> AddOriginTemplateAsync(AddOriginTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddOriginTemplateWithOptionsAsync(request, runtime);
        }

        public UpdateMaterialStatusResponse UpdateMaterialStatusWithOptions(UpdateMaterialStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMaterialStatusResponse>(DoRequest("UpdateMaterialStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateMaterialStatusResponse> UpdateMaterialStatusWithOptionsAsync(UpdateMaterialStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMaterialStatusResponse>(await DoRequestAsync("UpdateMaterialStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateMaterialStatusResponse UpdateMaterialStatus(UpdateMaterialStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateMaterialStatusWithOptions(request, runtime);
        }

        public async Task<UpdateMaterialStatusResponse> UpdateMaterialStatusAsync(UpdateMaterialStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateMaterialStatusWithOptionsAsync(request, runtime);
        }

        public UpdateMaterialResponse UpdateMaterialWithOptions(UpdateMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMaterialResponse>(DoRequest("UpdateMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateMaterialResponse> UpdateMaterialWithOptionsAsync(UpdateMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMaterialResponse>(await DoRequestAsync("UpdateMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateMaterialResponse UpdateMaterial(UpdateMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateMaterialWithOptions(request, runtime);
        }

        public async Task<UpdateMaterialResponse> UpdateMaterialAsync(UpdateMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateMaterialWithOptionsAsync(request, runtime);
        }

        public UpdateEditingProjectStatusResponse UpdateEditingProjectStatusWithOptions(UpdateEditingProjectStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEditingProjectStatusResponse>(DoRequest("UpdateEditingProjectStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateEditingProjectStatusResponse> UpdateEditingProjectStatusWithOptionsAsync(UpdateEditingProjectStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEditingProjectStatusResponse>(await DoRequestAsync("UpdateEditingProjectStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateEditingProjectStatusResponse UpdateEditingProjectStatus(UpdateEditingProjectStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateEditingProjectStatusWithOptions(request, runtime);
        }

        public async Task<UpdateEditingProjectStatusResponse> UpdateEditingProjectStatusAsync(UpdateEditingProjectStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateEditingProjectStatusWithOptionsAsync(request, runtime);
        }

        public UpdateEditingProjectResponse UpdateEditingProjectWithOptions(UpdateEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEditingProjectResponse>(DoRequest("UpdateEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateEditingProjectResponse> UpdateEditingProjectWithOptionsAsync(UpdateEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateEditingProjectResponse>(await DoRequestAsync("UpdateEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateEditingProjectResponse UpdateEditingProject(UpdateEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateEditingProjectWithOptions(request, runtime);
        }

        public async Task<UpdateEditingProjectResponse> UpdateEditingProjectAsync(UpdateEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateEditingProjectWithOptionsAsync(request, runtime);
        }

        public SyncMaterialResponse SyncMaterialWithOptions(SyncMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncMaterialResponse>(DoRequest("SyncMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SyncMaterialResponse> SyncMaterialWithOptionsAsync(SyncMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncMaterialResponse>(await DoRequestAsync("SyncMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SyncMaterialResponse SyncMaterial(SyncMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SyncMaterialWithOptions(request, runtime);
        }

        public async Task<SyncMaterialResponse> SyncMaterialAsync(SyncMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SyncMaterialWithOptionsAsync(request, runtime);
        }

        public SetEditingProjectMaterialsResponse SetEditingProjectMaterialsWithOptions(SetEditingProjectMaterialsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetEditingProjectMaterialsResponse>(DoRequest("SetEditingProjectMaterials", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetEditingProjectMaterialsResponse> SetEditingProjectMaterialsWithOptionsAsync(SetEditingProjectMaterialsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetEditingProjectMaterialsResponse>(await DoRequestAsync("SetEditingProjectMaterials", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetEditingProjectMaterialsResponse SetEditingProjectMaterials(SetEditingProjectMaterialsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetEditingProjectMaterialsWithOptions(request, runtime);
        }

        public async Task<SetEditingProjectMaterialsResponse> SetEditingProjectMaterialsAsync(SetEditingProjectMaterialsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetEditingProjectMaterialsWithOptionsAsync(request, runtime);
        }

        public SearchMaterialResponse SearchMaterialWithOptions(SearchMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMaterialResponse>(DoRequest("SearchMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SearchMaterialResponse> SearchMaterialWithOptionsAsync(SearchMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMaterialResponse>(await DoRequestAsync("SearchMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SearchMaterialResponse SearchMaterial(SearchMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SearchMaterialWithOptions(request, runtime);
        }

        public async Task<SearchMaterialResponse> SearchMaterialAsync(SearchMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SearchMaterialWithOptionsAsync(request, runtime);
        }

        public SearchEditingProjectResponse SearchEditingProjectWithOptions(SearchEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchEditingProjectResponse>(DoRequest("SearchEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SearchEditingProjectResponse> SearchEditingProjectWithOptionsAsync(SearchEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchEditingProjectResponse>(await DoRequestAsync("SearchEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SearchEditingProjectResponse SearchEditingProject(SearchEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SearchEditingProjectWithOptions(request, runtime);
        }

        public async Task<SearchEditingProjectResponse> SearchEditingProjectAsync(SearchEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SearchEditingProjectWithOptionsAsync(request, runtime);
        }

        public RefreshUploadMaterialTokenResponse RefreshUploadMaterialTokenWithOptions(RefreshUploadMaterialTokenRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshUploadMaterialTokenResponse>(DoRequest("RefreshUploadMaterialToken", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RefreshUploadMaterialTokenResponse> RefreshUploadMaterialTokenWithOptionsAsync(RefreshUploadMaterialTokenRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshUploadMaterialTokenResponse>(await DoRequestAsync("RefreshUploadMaterialToken", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public RefreshUploadMaterialTokenResponse RefreshUploadMaterialToken(RefreshUploadMaterialTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RefreshUploadMaterialTokenWithOptions(request, runtime);
        }

        public async Task<RefreshUploadMaterialTokenResponse> RefreshUploadMaterialTokenAsync(RefreshUploadMaterialTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RefreshUploadMaterialTokenWithOptionsAsync(request, runtime);
        }

        public ProduceEditingProjectVideoResponse ProduceEditingProjectVideoWithOptions(ProduceEditingProjectVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ProduceEditingProjectVideoResponse>(DoRequest("ProduceEditingProjectVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ProduceEditingProjectVideoResponse> ProduceEditingProjectVideoWithOptionsAsync(ProduceEditingProjectVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ProduceEditingProjectVideoResponse>(await DoRequestAsync("ProduceEditingProjectVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ProduceEditingProjectVideoResponse ProduceEditingProjectVideo(ProduceEditingProjectVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ProduceEditingProjectVideoWithOptions(request, runtime);
        }

        public async Task<ProduceEditingProjectVideoResponse> ProduceEditingProjectVideoAsync(ProduceEditingProjectVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ProduceEditingProjectVideoWithOptionsAsync(request, runtime);
        }

        public GetMaterialListResponse GetMaterialListWithOptions(GetMaterialListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMaterialListResponse>(DoRequest("GetMaterialList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMaterialListResponse> GetMaterialListWithOptionsAsync(GetMaterialListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMaterialListResponse>(await DoRequestAsync("GetMaterialList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMaterialListResponse GetMaterialList(GetMaterialListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMaterialListWithOptions(request, runtime);
        }

        public async Task<GetMaterialListResponse> GetMaterialListAsync(GetMaterialListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMaterialListWithOptionsAsync(request, runtime);
        }

        public GetMaterialResponse GetMaterialWithOptions(GetMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMaterialResponse>(DoRequest("GetMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMaterialResponse> GetMaterialWithOptionsAsync(GetMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMaterialResponse>(await DoRequestAsync("GetMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMaterialResponse GetMaterial(GetMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMaterialWithOptions(request, runtime);
        }

        public async Task<GetMaterialResponse> GetMaterialAsync(GetMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMaterialWithOptionsAsync(request, runtime);
        }

        public GetEditingProjectMaterialsResponse GetEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEditingProjectMaterialsResponse>(DoRequest("GetEditingProjectMaterials", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetEditingProjectMaterialsResponse> GetEditingProjectMaterialsWithOptionsAsync(GetEditingProjectMaterialsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEditingProjectMaterialsResponse>(await DoRequestAsync("GetEditingProjectMaterials", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetEditingProjectMaterialsResponse GetEditingProjectMaterials(GetEditingProjectMaterialsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetEditingProjectMaterialsWithOptions(request, runtime);
        }

        public async Task<GetEditingProjectMaterialsResponse> GetEditingProjectMaterialsAsync(GetEditingProjectMaterialsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetEditingProjectMaterialsWithOptionsAsync(request, runtime);
        }

        public GetEditingProjectListResponse GetEditingProjectListWithOptions(GetEditingProjectListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEditingProjectListResponse>(DoRequest("GetEditingProjectList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetEditingProjectListResponse> GetEditingProjectListWithOptionsAsync(GetEditingProjectListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEditingProjectListResponse>(await DoRequestAsync("GetEditingProjectList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetEditingProjectListResponse GetEditingProjectList(GetEditingProjectListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetEditingProjectListWithOptions(request, runtime);
        }

        public async Task<GetEditingProjectListResponse> GetEditingProjectListAsync(GetEditingProjectListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetEditingProjectListWithOptionsAsync(request, runtime);
        }

        public GetEditingProjectResponse GetEditingProjectWithOptions(GetEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEditingProjectResponse>(DoRequest("GetEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetEditingProjectResponse> GetEditingProjectWithOptionsAsync(GetEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEditingProjectResponse>(await DoRequestAsync("GetEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetEditingProjectResponse GetEditingProject(GetEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetEditingProjectWithOptions(request, runtime);
        }

        public async Task<GetEditingProjectResponse> GetEditingProjectAsync(GetEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetEditingProjectWithOptionsAsync(request, runtime);
        }

        public DeleteMaterialResponse DeleteMaterialWithOptions(DeleteMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMaterialResponse>(DoRequest("DeleteMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteMaterialResponse> DeleteMaterialWithOptionsAsync(DeleteMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMaterialResponse>(await DoRequestAsync("DeleteMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteMaterialResponse DeleteMaterial(DeleteMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteMaterialWithOptions(request, runtime);
        }

        public async Task<DeleteMaterialResponse> DeleteMaterialAsync(DeleteMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteMaterialWithOptionsAsync(request, runtime);
        }

        public DeleteEditingProjectResponse DeleteEditingProjectWithOptions(DeleteEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteEditingProjectResponse>(DoRequest("DeleteEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteEditingProjectResponse> DeleteEditingProjectWithOptionsAsync(DeleteEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteEditingProjectResponse>(await DoRequestAsync("DeleteEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteEditingProjectResponse DeleteEditingProject(DeleteEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteEditingProjectWithOptions(request, runtime);
        }

        public async Task<DeleteEditingProjectResponse> DeleteEditingProjectAsync(DeleteEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteEditingProjectWithOptionsAsync(request, runtime);
        }

        public CreateUploadMaterialResponse CreateUploadMaterialWithOptions(CreateUploadMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadMaterialResponse>(DoRequest("CreateUploadMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateUploadMaterialResponse> CreateUploadMaterialWithOptionsAsync(CreateUploadMaterialRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadMaterialResponse>(await DoRequestAsync("CreateUploadMaterial", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateUploadMaterialResponse CreateUploadMaterial(CreateUploadMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateUploadMaterialWithOptions(request, runtime);
        }

        public async Task<CreateUploadMaterialResponse> CreateUploadMaterialAsync(CreateUploadMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateUploadMaterialWithOptionsAsync(request, runtime);
        }

        public AddEditingProjectResponse AddEditingProjectWithOptions(AddEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEditingProjectResponse>(DoRequest("AddEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddEditingProjectResponse> AddEditingProjectWithOptionsAsync(AddEditingProjectRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEditingProjectResponse>(await DoRequestAsync("AddEditingProject", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddEditingProjectResponse AddEditingProject(AddEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddEditingProjectWithOptions(request, runtime);
        }

        public async Task<AddEditingProjectResponse> AddEditingProjectAsync(AddEditingProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddEditingProjectWithOptionsAsync(request, runtime);
        }

        public GetCategoriesResponse GetCategoriesWithOptions(GetCategoriesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCategoriesResponse>(DoRequest("GetCategories", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCategoriesResponse> GetCategoriesWithOptionsAsync(GetCategoriesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCategoriesResponse>(await DoRequestAsync("GetCategories", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCategoriesResponse GetCategories(GetCategoriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCategoriesWithOptions(request, runtime);
        }

        public async Task<GetCategoriesResponse> GetCategoriesAsync(GetCategoriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCategoriesWithOptionsAsync(request, runtime);
        }

        public UpdateCategoryResponse UpdateCategoryWithOptions(UpdateCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCategoryResponse>(DoRequest("UpdateCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateCategoryResponse> UpdateCategoryWithOptionsAsync(UpdateCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCategoryResponse>(await DoRequestAsync("UpdateCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateCategoryResponse UpdateCategory(UpdateCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateCategoryWithOptions(request, runtime);
        }

        public async Task<UpdateCategoryResponse> UpdateCategoryAsync(UpdateCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateCategoryWithOptionsAsync(request, runtime);
        }

        public GetAudioTemplateResponse GetAudioTemplateWithOptions(GetAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAudioTemplateResponse>(DoRequest("GetAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetAudioTemplateResponse> GetAudioTemplateWithOptionsAsync(GetAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAudioTemplateResponse>(await DoRequestAsync("GetAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetAudioTemplateResponse GetAudioTemplate(GetAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetAudioTemplateWithOptions(request, runtime);
        }

        public async Task<GetAudioTemplateResponse> GetAudioTemplateAsync(GetAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetAudioTemplateWithOptionsAsync(request, runtime);
        }

        public ListAudioTemplateResponse ListAudioTemplateWithOptions(ListAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAudioTemplateResponse>(DoRequest("ListAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAudioTemplateResponse> ListAudioTemplateWithOptionsAsync(ListAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAudioTemplateResponse>(await DoRequestAsync("ListAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAudioTemplateResponse ListAudioTemplate(ListAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAudioTemplateWithOptions(request, runtime);
        }

        public async Task<ListAudioTemplateResponse> ListAudioTemplateAsync(ListAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAudioTemplateWithOptionsAsync(request, runtime);
        }

        public ListAudioConfigResponse ListAudioConfigWithOptions(ListAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAudioConfigResponse>(DoRequest("ListAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAudioConfigResponse> ListAudioConfigWithOptionsAsync(ListAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAudioConfigResponse>(await DoRequestAsync("ListAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAudioConfigResponse ListAudioConfig(ListAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAudioConfigWithOptions(request, runtime);
        }

        public async Task<ListAudioConfigResponse> ListAudioConfigAsync(ListAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAudioConfigWithOptionsAsync(request, runtime);
        }

        public RefreshMaterialWorkFlowResponse RefreshMaterialWorkFlowWithOptions(RefreshMaterialWorkFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshMaterialWorkFlowResponse>(DoRequest("RefreshMaterialWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RefreshMaterialWorkFlowResponse> RefreshMaterialWorkFlowWithOptionsAsync(RefreshMaterialWorkFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshMaterialWorkFlowResponse>(await DoRequestAsync("RefreshMaterialWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public RefreshMaterialWorkFlowResponse RefreshMaterialWorkFlow(RefreshMaterialWorkFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RefreshMaterialWorkFlowWithOptions(request, runtime);
        }

        public async Task<RefreshMaterialWorkFlowResponse> RefreshMaterialWorkFlowAsync(RefreshMaterialWorkFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RefreshMaterialWorkFlowWithOptionsAsync(request, runtime);
        }

        public UpdateAudioConfigResponse UpdateAudioConfigWithOptions(UpdateAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAudioConfigResponse>(DoRequest("UpdateAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateAudioConfigResponse> UpdateAudioConfigWithOptionsAsync(UpdateAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAudioConfigResponse>(await DoRequestAsync("UpdateAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateAudioConfigResponse UpdateAudioConfig(UpdateAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateAudioConfigWithOptions(request, runtime);
        }

        public async Task<UpdateAudioConfigResponse> UpdateAudioConfigAsync(UpdateAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateAudioConfigWithOptionsAsync(request, runtime);
        }

        public UpdateAudioTemplateResponse UpdateAudioTemplateWithOptions(UpdateAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAudioTemplateResponse>(DoRequest("UpdateAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateAudioTemplateResponse> UpdateAudioTemplateWithOptionsAsync(UpdateAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAudioTemplateResponse>(await DoRequestAsync("UpdateAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateAudioTemplateResponse UpdateAudioTemplate(UpdateAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateAudioTemplateWithOptions(request, runtime);
        }

        public async Task<UpdateAudioTemplateResponse> UpdateAudioTemplateAsync(UpdateAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateAudioTemplateWithOptionsAsync(request, runtime);
        }

        public AddAudioConfigResponse AddAudioConfigWithOptions(AddAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAudioConfigResponse>(DoRequest("AddAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddAudioConfigResponse> AddAudioConfigWithOptionsAsync(AddAudioConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAudioConfigResponse>(await DoRequestAsync("AddAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddAudioConfigResponse AddAudioConfig(AddAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddAudioConfigWithOptions(request, runtime);
        }

        public async Task<AddAudioConfigResponse> AddAudioConfigAsync(AddAudioConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddAudioConfigWithOptionsAsync(request, runtime);
        }

        public AddAudioTemplateResponse AddAudioTemplateWithOptions(AddAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAudioTemplateResponse>(DoRequest("AddAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddAudioTemplateResponse> AddAudioTemplateWithOptionsAsync(AddAudioTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAudioTemplateResponse>(await DoRequestAsync("AddAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddAudioTemplateResponse AddAudioTemplate(AddAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddAudioTemplateWithOptions(request, runtime);
        }

        public async Task<AddAudioTemplateResponse> AddAudioTemplateAsync(AddAudioTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddAudioTemplateWithOptionsAsync(request, runtime);
        }

        public UpdateSpecifyCustomerTemplateConfigResponse UpdateSpecifyCustomerTemplateConfigWithOptions(UpdateSpecifyCustomerTemplateConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSpecifyCustomerTemplateConfigResponse>(DoRequest("UpdateSpecifyCustomerTemplateConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateSpecifyCustomerTemplateConfigResponse> UpdateSpecifyCustomerTemplateConfigWithOptionsAsync(UpdateSpecifyCustomerTemplateConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSpecifyCustomerTemplateConfigResponse>(await DoRequestAsync("UpdateSpecifyCustomerTemplateConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateSpecifyCustomerTemplateConfigResponse UpdateSpecifyCustomerTemplateConfig(UpdateSpecifyCustomerTemplateConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateSpecifyCustomerTemplateConfigWithOptions(request, runtime);
        }

        public async Task<UpdateSpecifyCustomerTemplateConfigResponse> UpdateSpecifyCustomerTemplateConfigAsync(UpdateSpecifyCustomerTemplateConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateSpecifyCustomerTemplateConfigWithOptionsAsync(request, runtime);
        }

        public GetPlayInfoResponse GetPlayInfoWithOptions(GetPlayInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayInfoResponse>(DoRequest("GetPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetPlayInfoResponse> GetPlayInfoWithOptionsAsync(GetPlayInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayInfoResponse>(await DoRequestAsync("GetPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetPlayInfoResponse GetPlayInfo(GetPlayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetPlayInfoWithOptions(request, runtime);
        }

        public async Task<GetPlayInfoResponse> GetPlayInfoAsync(GetPlayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetPlayInfoWithOptionsAsync(request, runtime);
        }

        public GetVideoConfigResponse GetVideoConfigWithOptions(GetVideoConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoConfigResponse>(DoRequest("GetVideoConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoConfigResponse> GetVideoConfigWithOptionsAsync(GetVideoConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoConfigResponse>(await DoRequestAsync("GetVideoConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoConfigResponse GetVideoConfig(GetVideoConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoConfigWithOptions(request, runtime);
        }

        public async Task<GetVideoConfigResponse> GetVideoConfigAsync(GetVideoConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoConfigWithOptionsAsync(request, runtime);
        }

        public SetCustomerConfigResponse SetCustomerConfigWithOptions(SetCustomerConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCustomerConfigResponse>(DoRequest("SetCustomerConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetCustomerConfigResponse> SetCustomerConfigWithOptionsAsync(SetCustomerConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCustomerConfigResponse>(await DoRequestAsync("SetCustomerConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetCustomerConfigResponse SetCustomerConfig(SetCustomerConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetCustomerConfigWithOptions(request, runtime);
        }

        public async Task<SetCustomerConfigResponse> SetCustomerConfigAsync(SetCustomerConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetCustomerConfigWithOptionsAsync(request, runtime);
        }

        public GetCustomerConfigResponse GetCustomerConfigWithOptions(GetCustomerConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerConfigResponse>(DoRequest("GetCustomerConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCustomerConfigResponse> GetCustomerConfigWithOptionsAsync(GetCustomerConfigRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerConfigResponse>(await DoRequestAsync("GetCustomerConfig", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCustomerConfigResponse GetCustomerConfig(GetCustomerConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCustomerConfigWithOptions(request, runtime);
        }

        public async Task<GetCustomerConfigResponse> GetCustomerConfigAsync(GetCustomerConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCustomerConfigWithOptionsAsync(request, runtime);
        }

        public CreateUploadImageResponse CreateUploadImageWithOptions(CreateUploadImageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadImageResponse>(DoRequest("CreateUploadImage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateUploadImageResponse> CreateUploadImageWithOptionsAsync(CreateUploadImageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadImageResponse>(await DoRequestAsync("CreateUploadImage", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateUploadImageResponse CreateUploadImage(CreateUploadImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateUploadImageWithOptions(request, runtime);
        }

        public async Task<CreateUploadImageResponse> CreateUploadImageAsync(CreateUploadImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateUploadImageWithOptionsAsync(request, runtime);
        }

        public UpdateSnapshotResponse UpdateSnapshotWithOptions(UpdateSnapshotRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSnapshotResponse>(DoRequest("UpdateSnapshot", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateSnapshotResponse> UpdateSnapshotWithOptionsAsync(UpdateSnapshotRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSnapshotResponse>(await DoRequestAsync("UpdateSnapshot", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateSnapshotResponse UpdateSnapshot(UpdateSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateSnapshotWithOptions(request, runtime);
        }

        public async Task<UpdateSnapshotResponse> UpdateSnapshotAsync(UpdateSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateSnapshotWithOptionsAsync(request, runtime);
        }

        public RefreshWorkFlowResponse RefreshWorkFlowWithOptions(RefreshWorkFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshWorkFlowResponse>(DoRequest("RefreshWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RefreshWorkFlowResponse> RefreshWorkFlowWithOptionsAsync(RefreshWorkFlowRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshWorkFlowResponse>(await DoRequestAsync("RefreshWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public RefreshWorkFlowResponse RefreshWorkFlow(RefreshWorkFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RefreshWorkFlowWithOptions(request, runtime);
        }

        public async Task<RefreshWorkFlowResponse> RefreshWorkFlowAsync(RefreshWorkFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RefreshWorkFlowWithOptionsAsync(request, runtime);
        }

        public AddPipelineResponse AddPipelineWithOptions(AddPipelineRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPipelineResponse>(DoRequest("AddPipeline", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddPipelineResponse> AddPipelineWithOptionsAsync(AddPipelineRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPipelineResponse>(await DoRequestAsync("AddPipeline", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddPipelineResponse AddPipeline(AddPipelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddPipelineWithOptions(request, runtime);
        }

        public async Task<AddPipelineResponse> AddPipelineAsync(AddPipelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddPipelineWithOptionsAsync(request, runtime);
        }

        public GetCheckChannelResponse GetCheckChannelWithOptions(GetCheckChannelRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCheckChannelResponse>(DoRequest("GetCheckChannel", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCheckChannelResponse> GetCheckChannelWithOptionsAsync(GetCheckChannelRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCheckChannelResponse>(await DoRequestAsync("GetCheckChannel", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCheckChannelResponse GetCheckChannel(GetCheckChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCheckChannelWithOptions(request, runtime);
        }

        public async Task<GetCheckChannelResponse> GetCheckChannelAsync(GetCheckChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCheckChannelWithOptionsAsync(request, runtime);
        }

        public SetCheckChannelResponse SetCheckChannelWithOptions(SetCheckChannelRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCheckChannelResponse>(DoRequest("SetCheckChannel", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetCheckChannelResponse> SetCheckChannelWithOptionsAsync(SetCheckChannelRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetCheckChannelResponse>(await DoRequestAsync("SetCheckChannel", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetCheckChannelResponse SetCheckChannel(SetCheckChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetCheckChannelWithOptions(request, runtime);
        }

        public async Task<SetCheckChannelResponse> SetCheckChannelAsync(SetCheckChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetCheckChannelWithOptionsAsync(request, runtime);
        }

        public GetPlayStatisResponse GetPlayStatisWithOptions(GetPlayStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayStatisResponse>(DoRequest("GetPlayStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetPlayStatisResponse> GetPlayStatisWithOptionsAsync(GetPlayStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayStatisResponse>(await DoRequestAsync("GetPlayStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetPlayStatisResponse GetPlayStatis(GetPlayStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetPlayStatisWithOptions(request, runtime);
        }

        public async Task<GetPlayStatisResponse> GetPlayStatisAsync(GetPlayStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetPlayStatisWithOptionsAsync(request, runtime);
        }

        public GetMTSStatisResponse GetMTSStatisWithOptions(GetMTSStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMTSStatisResponse>(DoRequest("GetMTSStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMTSStatisResponse> GetMTSStatisWithOptionsAsync(GetMTSStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMTSStatisResponse>(await DoRequestAsync("GetMTSStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMTSStatisResponse GetMTSStatis(GetMTSStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMTSStatisWithOptions(request, runtime);
        }

        public async Task<GetMTSStatisResponse> GetMTSStatisAsync(GetMTSStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMTSStatisWithOptionsAsync(request, runtime);
        }

        public ListDomainRefererResponse ListDomainRefererWithOptions(ListDomainRefererRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDomainRefererResponse>(DoRequest("ListDomainReferer", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListDomainRefererResponse> ListDomainRefererWithOptionsAsync(ListDomainRefererRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDomainRefererResponse>(await DoRequestAsync("ListDomainReferer", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListDomainRefererResponse ListDomainReferer(ListDomainRefererRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListDomainRefererWithOptions(request, runtime);
        }

        public async Task<ListDomainRefererResponse> ListDomainRefererAsync(ListDomainRefererRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListDomainRefererWithOptionsAsync(request, runtime);
        }

        public SetMessageCallbackResponse SetMessageCallbackWithOptions(SetMessageCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetMessageCallbackResponse>(DoRequest("SetMessageCallback", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetMessageCallbackResponse> SetMessageCallbackWithOptionsAsync(SetMessageCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetMessageCallbackResponse>(await DoRequestAsync("SetMessageCallback", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetMessageCallbackResponse SetMessageCallback(SetMessageCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetMessageCallbackWithOptions(request, runtime);
        }

        public async Task<SetMessageCallbackResponse> SetMessageCallbackAsync(SetMessageCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetMessageCallbackWithOptionsAsync(request, runtime);
        }

        public GetMessageCallbackResponse GetMessageCallbackWithOptions(GetMessageCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessageCallbackResponse>(DoRequest("GetMessageCallback", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMessageCallbackResponse> GetMessageCallbackWithOptionsAsync(GetMessageCallbackRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessageCallbackResponse>(await DoRequestAsync("GetMessageCallback", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMessageCallbackResponse GetMessageCallback(GetMessageCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMessageCallbackWithOptions(request, runtime);
        }

        public async Task<GetMessageCallbackResponse> GetMessageCallbackAsync(GetMessageCallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMessageCallbackWithOptionsAsync(request, runtime);
        }

        public GetVideoPlayInfoForCloudResponse GetVideoPlayInfoForCloudWithOptions(GetVideoPlayInfoForCloudRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoPlayInfoForCloudResponse>(DoRequest("GetVideoPlayInfoForCloud", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoPlayInfoForCloudResponse> GetVideoPlayInfoForCloudWithOptionsAsync(GetVideoPlayInfoForCloudRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoPlayInfoForCloudResponse>(await DoRequestAsync("GetVideoPlayInfoForCloud", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoPlayInfoForCloudResponse GetVideoPlayInfoForCloud(GetVideoPlayInfoForCloudRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoPlayInfoForCloudWithOptions(request, runtime);
        }

        public async Task<GetVideoPlayInfoForCloudResponse> GetVideoPlayInfoForCloudAsync(GetVideoPlayInfoForCloudRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoPlayInfoForCloudWithOptionsAsync(request, runtime);
        }

        public GetVideoPlayAuthResponse GetVideoPlayAuthWithOptions(GetVideoPlayAuthRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoPlayAuthResponse>(DoRequest("GetVideoPlayAuth", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoPlayAuthResponse> GetVideoPlayAuthWithOptionsAsync(GetVideoPlayAuthRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoPlayAuthResponse>(await DoRequestAsync("GetVideoPlayAuth", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoPlayAuthResponse GetVideoPlayAuth(GetVideoPlayAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoPlayAuthWithOptions(request, runtime);
        }

        public async Task<GetVideoPlayAuthResponse> GetVideoPlayAuthAsync(GetVideoPlayAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoPlayAuthWithOptionsAsync(request, runtime);
        }

        public GetMidYKVidResponse GetMidYKVidWithOptions(GetMidYKVidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMidYKVidResponse>(DoRequest("GetMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMidYKVidResponse> GetMidYKVidWithOptionsAsync(GetMidYKVidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMidYKVidResponse>(await DoRequestAsync("GetMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMidYKVidResponse GetMidYKVid(GetMidYKVidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMidYKVidWithOptions(request, runtime);
        }

        public async Task<GetMidYKVidResponse> GetMidYKVidAsync(GetMidYKVidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMidYKVidWithOptionsAsync(request, runtime);
        }

        public DeleteMidYKVidResponse DeleteMidYKVidWithOptions(DeleteMidYKVidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMidYKVidResponse>(DoRequest("DeleteMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteMidYKVidResponse> DeleteMidYKVidWithOptionsAsync(DeleteMidYKVidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMidYKVidResponse>(await DoRequestAsync("DeleteMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteMidYKVidResponse DeleteMidYKVid(DeleteMidYKVidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteMidYKVidWithOptions(request, runtime);
        }

        public async Task<DeleteMidYKVidResponse> DeleteMidYKVidAsync(DeleteMidYKVidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteMidYKVidWithOptionsAsync(request, runtime);
        }

        public AddMidYKVidResponse AddMidYKVidWithOptions(AddMidYKVidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMidYKVidResponse>(DoRequest("AddMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddMidYKVidResponse> AddMidYKVidWithOptionsAsync(AddMidYKVidRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMidYKVidResponse>(await DoRequestAsync("AddMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddMidYKVidResponse AddMidYKVid(AddMidYKVidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddMidYKVidWithOptions(request, runtime);
        }

        public async Task<AddMidYKVidResponse> AddMidYKVidAsync(AddMidYKVidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddMidYKVidWithOptionsAsync(request, runtime);
        }

        public UpdateVideoStatusResponse UpdateVideoStatusWithOptions(UpdateVideoStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVideoStatusResponse>(DoRequest("UpdateVideoStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateVideoStatusResponse> UpdateVideoStatusWithOptionsAsync(UpdateVideoStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVideoStatusResponse>(await DoRequestAsync("UpdateVideoStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateVideoStatusResponse UpdateVideoStatus(UpdateVideoStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateVideoStatusWithOptions(request, runtime);
        }

        public async Task<UpdateVideoStatusResponse> UpdateVideoStatusAsync(UpdateVideoStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateVideoStatusWithOptionsAsync(request, runtime);
        }

        public UpdateVideoInfoResponse UpdateVideoInfoWithOptions(UpdateVideoInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVideoInfoResponse>(DoRequest("UpdateVideoInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateVideoInfoResponse> UpdateVideoInfoWithOptionsAsync(UpdateVideoInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateVideoInfoResponse>(await DoRequestAsync("UpdateVideoInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateVideoInfoResponse UpdateVideoInfo(UpdateVideoInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateVideoInfoWithOptions(request, runtime);
        }

        public async Task<UpdateVideoInfoResponse> UpdateVideoInfoAsync(UpdateVideoInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateVideoInfoWithOptionsAsync(request, runtime);
        }

        public SearchVideoResponse SearchVideoWithOptions(SearchVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchVideoResponse>(DoRequest("SearchVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SearchVideoResponse> SearchVideoWithOptionsAsync(SearchVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchVideoResponse>(await DoRequestAsync("SearchVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SearchVideoResponse SearchVideo(SearchVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SearchVideoWithOptions(request, runtime);
        }

        public async Task<SearchVideoResponse> SearchVideoAsync(SearchVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SearchVideoWithOptionsAsync(request, runtime);
        }

        public RefreshUploadVideoResponse RefreshUploadVideoWithOptions(RefreshUploadVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshUploadVideoResponse>(DoRequest("RefreshUploadVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RefreshUploadVideoResponse> RefreshUploadVideoWithOptionsAsync(RefreshUploadVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshUploadVideoResponse>(await DoRequestAsync("RefreshUploadVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public RefreshUploadVideoResponse RefreshUploadVideo(RefreshUploadVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RefreshUploadVideoWithOptions(request, runtime);
        }

        public async Task<RefreshUploadVideoResponse> RefreshUploadVideoAsync(RefreshUploadVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RefreshUploadVideoWithOptionsAsync(request, runtime);
        }

        public GetVideoListResponse GetVideoListWithOptions(GetVideoListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoListResponse>(DoRequest("GetVideoList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoListResponse> GetVideoListWithOptionsAsync(GetVideoListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoListResponse>(await DoRequestAsync("GetVideoList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoListResponse GetVideoList(GetVideoListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoListWithOptions(request, runtime);
        }

        public async Task<GetVideoListResponse> GetVideoListAsync(GetVideoListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoListWithOptionsAsync(request, runtime);
        }

        public GetVideoInfoResponse GetVideoInfoWithOptions(GetVideoInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoInfoResponse>(DoRequest("GetVideoInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoInfoResponse> GetVideoInfoWithOptionsAsync(GetVideoInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoInfoResponse>(await DoRequestAsync("GetVideoInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoInfoResponse GetVideoInfo(GetVideoInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoInfoWithOptions(request, runtime);
        }

        public async Task<GetVideoInfoResponse> GetVideoInfoAsync(GetVideoInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoInfoWithOptionsAsync(request, runtime);
        }

        public GetCategoryTreeResponse GetCategoryTreeWithOptions(GetCategoryTreeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCategoryTreeResponse>(DoRequest("GetCategoryTree", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCategoryTreeResponse> GetCategoryTreeWithOptionsAsync(GetCategoryTreeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCategoryTreeResponse>(await DoRequestAsync("GetCategoryTree", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCategoryTreeResponse GetCategoryTree(GetCategoryTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCategoryTreeWithOptions(request, runtime);
        }

        public async Task<GetCategoryTreeResponse> GetCategoryTreeAsync(GetCategoryTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCategoryTreeWithOptionsAsync(request, runtime);
        }

        public GetCategoryListResponse GetCategoryListWithOptions(GetCategoryListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCategoryListResponse>(DoRequest("GetCategoryList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCategoryListResponse> GetCategoryListWithOptionsAsync(GetCategoryListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCategoryListResponse>(await DoRequestAsync("GetCategoryList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCategoryListResponse GetCategoryList(GetCategoryListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCategoryListWithOptions(request, runtime);
        }

        public async Task<GetCategoryListResponse> GetCategoryListAsync(GetCategoryListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCategoryListWithOptionsAsync(request, runtime);
        }

        public DeleteVideoTagResponse DeleteVideoTagWithOptions(DeleteVideoTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVideoTagResponse>(DoRequest("DeleteVideoTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteVideoTagResponse> DeleteVideoTagWithOptionsAsync(DeleteVideoTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVideoTagResponse>(await DoRequestAsync("DeleteVideoTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteVideoTagResponse DeleteVideoTag(DeleteVideoTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteVideoTagWithOptions(request, runtime);
        }

        public async Task<DeleteVideoTagResponse> DeleteVideoTagAsync(DeleteVideoTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteVideoTagWithOptionsAsync(request, runtime);
        }

        public DeleteVideoResponse DeleteVideoWithOptions(DeleteVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVideoResponse>(DoRequest("DeleteVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteVideoResponse> DeleteVideoWithOptionsAsync(DeleteVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteVideoResponse>(await DoRequestAsync("DeleteVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteVideoResponse DeleteVideo(DeleteVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteVideoWithOptions(request, runtime);
        }

        public async Task<DeleteVideoResponse> DeleteVideoAsync(DeleteVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteVideoWithOptionsAsync(request, runtime);
        }

        public CreateUploadVideoResponse CreateUploadVideoWithOptions(CreateUploadVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadVideoResponse>(DoRequest("CreateUploadVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateUploadVideoResponse> CreateUploadVideoWithOptionsAsync(CreateUploadVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUploadVideoResponse>(await DoRequestAsync("CreateUploadVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateUploadVideoResponse CreateUploadVideo(CreateUploadVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateUploadVideoWithOptions(request, runtime);
        }

        public async Task<CreateUploadVideoResponse> CreateUploadVideoAsync(CreateUploadVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateUploadVideoWithOptionsAsync(request, runtime);
        }

        public CheckVideoResponse CheckVideoWithOptions(CheckVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckVideoResponse>(DoRequest("CheckVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CheckVideoResponse> CheckVideoWithOptionsAsync(CheckVideoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckVideoResponse>(await DoRequestAsync("CheckVideo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CheckVideoResponse CheckVideo(CheckVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CheckVideoWithOptions(request, runtime);
        }

        public async Task<CheckVideoResponse> CheckVideoAsync(CheckVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CheckVideoWithOptionsAsync(request, runtime);
        }

        public AddVideoTagResponse AddVideoTagWithOptions(AddVideoTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddVideoTagResponse>(DoRequest("AddVideoTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddVideoTagResponse> AddVideoTagWithOptionsAsync(AddVideoTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddVideoTagResponse>(await DoRequestAsync("AddVideoTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddVideoTagResponse AddVideoTag(AddVideoTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddVideoTagWithOptions(request, runtime);
        }

        public async Task<AddVideoTagResponse> AddVideoTagAsync(AddVideoTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddVideoTagWithOptionsAsync(request, runtime);
        }

        public AddApiAuthResponse AddApiAuthWithOptions(AddApiAuthRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddApiAuthResponse>(DoRequest("AddApiAuth", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddApiAuthResponse> AddApiAuthWithOptionsAsync(AddApiAuthRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddApiAuthResponse>(await DoRequestAsync("AddApiAuth", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddApiAuthResponse AddApiAuth(AddApiAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddApiAuthWithOptions(request, runtime);
        }

        public async Task<AddApiAuthResponse> AddApiAuthAsync(AddApiAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddApiAuthWithOptionsAsync(request, runtime);
        }

        public GetPlayChannelKeyResponse GetPlayChannelKeyWithOptions(GetPlayChannelKeyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayChannelKeyResponse>(DoRequest("GetPlayChannelKey", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetPlayChannelKeyResponse> GetPlayChannelKeyWithOptionsAsync(GetPlayChannelKeyRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayChannelKeyResponse>(await DoRequestAsync("GetPlayChannelKey", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetPlayChannelKeyResponse GetPlayChannelKey(GetPlayChannelKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetPlayChannelKeyWithOptions(request, runtime);
        }

        public async Task<GetPlayChannelKeyResponse> GetPlayChannelKeyAsync(GetPlayChannelKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetPlayChannelKeyWithOptionsAsync(request, runtime);
        }

        public GetDomainListResponse GetDomainListWithOptions(GetDomainListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDomainListResponse>(DoRequest("GetDomainList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetDomainListResponse> GetDomainListWithOptionsAsync(GetDomainListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDomainListResponse>(await DoRequestAsync("GetDomainList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetDomainListResponse GetDomainList(GetDomainListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetDomainListWithOptions(request, runtime);
        }

        public async Task<GetDomainListResponse> GetDomainListAsync(GetDomainListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetDomainListWithOptionsAsync(request, runtime);
        }

        public GetServiceStatusResponse GetServiceStatusWithOptions(GetServiceStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceStatusResponse>(DoRequest("GetServiceStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetServiceStatusResponse> GetServiceStatusWithOptionsAsync(GetServiceStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceStatusResponse>(await DoRequestAsync("GetServiceStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetServiceStatusWithOptions(request, runtime);
        }

        public async Task<GetServiceStatusResponse> GetServiceStatusAsync(GetServiceStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetServiceStatusWithOptionsAsync(request, runtime);
        }

        public NotifyProduceResponse NotifyProduceWithOptions(NotifyProduceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyProduceResponse>(DoRequest("NotifyProduce", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<NotifyProduceResponse> NotifyProduceWithOptionsAsync(NotifyProduceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyProduceResponse>(await DoRequestAsync("NotifyProduce", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public NotifyProduceResponse NotifyProduce(NotifyProduceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return NotifyProduceWithOptions(request, runtime);
        }

        public async Task<NotifyProduceResponse> NotifyProduceAsync(NotifyProduceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await NotifyProduceWithOptionsAsync(request, runtime);
        }

        public NotifyInitResourceResponse NotifyInitResourceWithOptions(NotifyInitResourceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInitResourceResponse>(DoRequest("NotifyInitResource", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<NotifyInitResourceResponse> NotifyInitResourceWithOptionsAsync(NotifyInitResourceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInitResourceResponse>(await DoRequestAsync("NotifyInitResource", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public NotifyInitResourceResponse NotifyInitResource(NotifyInitResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return NotifyInitResourceWithOptions(request, runtime);
        }

        public async Task<NotifyInitResourceResponse> NotifyInitResourceAsync(NotifyInitResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await NotifyInitResourceWithOptionsAsync(request, runtime);
        }

        public GetPlayChannelListResponse GetPlayChannelListWithOptions(GetPlayChannelListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayChannelListResponse>(DoRequest("GetPlayChannelList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetPlayChannelListResponse> GetPlayChannelListWithOptionsAsync(GetPlayChannelListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlayChannelListResponse>(await DoRequestAsync("GetPlayChannelList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetPlayChannelListResponse GetPlayChannelList(GetPlayChannelListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetPlayChannelListWithOptions(request, runtime);
        }

        public async Task<GetPlayChannelListResponse> GetPlayChannelListAsync(GetPlayChannelListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetPlayChannelListWithOptionsAsync(request, runtime);
        }

        public UpdateApiAuthResponse UpdateApiAuthWithOptions(UpdateApiAuthRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiAuthResponse>(DoRequest("UpdateApiAuth", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateApiAuthResponse> UpdateApiAuthWithOptionsAsync(UpdateApiAuthRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiAuthResponse>(await DoRequestAsync("UpdateApiAuth", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateApiAuthResponse UpdateApiAuth(UpdateApiAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateApiAuthWithOptions(request, runtime);
        }

        public async Task<UpdateApiAuthResponse> UpdateApiAuthAsync(UpdateApiAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateApiAuthWithOptionsAsync(request, runtime);
        }

        public UserExistResponse UserExistWithOptions(UserExistRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UserExistResponse>(DoRequest("UserExist", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UserExistResponse> UserExistWithOptionsAsync(UserExistRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UserExistResponse>(await DoRequestAsync("UserExist", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UserExistResponse UserExist(UserExistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UserExistWithOptions(request, runtime);
        }

        public async Task<UserExistResponse> UserExistAsync(UserExistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UserExistWithOptionsAsync(request, runtime);
        }

        public AddMediaInfoResponse AddMediaInfoWithOptions(AddMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMediaInfoResponse>(DoRequest("AddMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddMediaInfoResponse> AddMediaInfoWithOptionsAsync(AddMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMediaInfoResponse>(await DoRequestAsync("AddMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddMediaInfoResponse AddMediaInfo(AddMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddMediaInfoWithOptions(request, runtime);
        }

        public async Task<AddMediaInfoResponse> AddMediaInfoAsync(AddMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddMediaInfoWithOptionsAsync(request, runtime);
        }

        public AddCategoryResponse AddCategoryWithOptions(AddCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCategoryResponse>(DoRequest("AddCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddCategoryResponse> AddCategoryWithOptionsAsync(AddCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCategoryResponse>(await DoRequestAsync("AddCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddCategoryResponse AddCategory(AddCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddCategoryWithOptions(request, runtime);
        }

        public async Task<AddCategoryResponse> AddCategoryAsync(AddCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddCategoryWithOptionsAsync(request, runtime);
        }

        public DeleteCategoryResponse DeleteCategoryWithOptions(DeleteCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCategoryResponse>(DoRequest("DeleteCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteCategoryResponse> DeleteCategoryWithOptionsAsync(DeleteCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCategoryResponse>(await DoRequestAsync("DeleteCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteCategoryResponse DeleteCategory(DeleteCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteCategoryWithOptions(request, runtime);
        }

        public async Task<DeleteCategoryResponse> DeleteCategoryAsync(DeleteCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteCategoryWithOptionsAsync(request, runtime);
        }

        public UpdateMediaInfoStatusResponse UpdateMediaInfoStatusWithOptions(UpdateMediaInfoStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMediaInfoStatusResponse>(DoRequest("UpdateMediaInfoStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateMediaInfoStatusResponse> UpdateMediaInfoStatusWithOptionsAsync(UpdateMediaInfoStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMediaInfoStatusResponse>(await DoRequestAsync("UpdateMediaInfoStatus", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateMediaInfoStatusResponse UpdateMediaInfoStatus(UpdateMediaInfoStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateMediaInfoStatusWithOptions(request, runtime);
        }

        public async Task<UpdateMediaInfoStatusResponse> UpdateMediaInfoStatusAsync(UpdateMediaInfoStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateMediaInfoStatusWithOptionsAsync(request, runtime);
        }

        public CategoryTreeResponse CategoryTreeWithOptions(CategoryTreeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CategoryTreeResponse>(DoRequest("CategoryTree", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CategoryTreeResponse> CategoryTreeWithOptionsAsync(CategoryTreeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CategoryTreeResponse>(await DoRequestAsync("CategoryTree", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public CategoryTreeResponse CategoryTree(CategoryTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CategoryTreeWithOptions(request, runtime);
        }

        public async Task<CategoryTreeResponse> CategoryTreeAsync(CategoryTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CategoryTreeWithOptionsAsync(request, runtime);
        }

        public AddMediaTagResponse AddMediaTagWithOptions(AddMediaTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMediaTagResponse>(DoRequest("AddMediaTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddMediaTagResponse> AddMediaTagWithOptionsAsync(AddMediaTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMediaTagResponse>(await DoRequestAsync("AddMediaTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddMediaTagResponse AddMediaTag(AddMediaTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddMediaTagWithOptions(request, runtime);
        }

        public async Task<AddMediaTagResponse> AddMediaTagAsync(AddMediaTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddMediaTagWithOptionsAsync(request, runtime);
        }

        public GetCDNStatisSumResponse GetCDNStatisSumWithOptions(GetCDNStatisSumRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCDNStatisSumResponse>(DoRequest("GetCDNStatisSum", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCDNStatisSumResponse> GetCDNStatisSumWithOptionsAsync(GetCDNStatisSumRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCDNStatisSumResponse>(await DoRequestAsync("GetCDNStatisSum", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCDNStatisSumResponse GetCDNStatisSum(GetCDNStatisSumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCDNStatisSumWithOptions(request, runtime);
        }

        public async Task<GetCDNStatisSumResponse> GetCDNStatisSumAsync(GetCDNStatisSumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCDNStatisSumWithOptionsAsync(request, runtime);
        }

        public GetCDNStatisResponse GetCDNStatisWithOptions(GetCDNStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCDNStatisResponse>(DoRequest("GetCDNStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCDNStatisResponse> GetCDNStatisWithOptionsAsync(GetCDNStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCDNStatisResponse>(await DoRequestAsync("GetCDNStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCDNStatisResponse GetCDNStatis(GetCDNStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCDNStatisWithOptions(request, runtime);
        }

        public async Task<GetCDNStatisResponse> GetCDNStatisAsync(GetCDNStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCDNStatisWithOptionsAsync(request, runtime);
        }

        public DeleteMediaTagResponse DeleteMediaTagWithOptions(DeleteMediaTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMediaTagResponse>(DoRequest("DeleteMediaTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteMediaTagResponse> DeleteMediaTagWithOptionsAsync(DeleteMediaTagRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMediaTagResponse>(await DoRequestAsync("DeleteMediaTag", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteMediaTagResponse DeleteMediaTag(DeleteMediaTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteMediaTagWithOptions(request, runtime);
        }

        public async Task<DeleteMediaTagResponse> DeleteMediaTagAsync(DeleteMediaTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteMediaTagWithOptionsAsync(request, runtime);
        }

        public DeleteMediaInfoResponse DeleteMediaInfoWithOptions(DeleteMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMediaInfoResponse>(DoRequest("DeleteMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteMediaInfoResponse> DeleteMediaInfoWithOptionsAsync(DeleteMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMediaInfoResponse>(await DoRequestAsync("DeleteMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteMediaInfoResponse DeleteMediaInfo(DeleteMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteMediaInfoWithOptions(request, runtime);
        }

        public async Task<DeleteMediaInfoResponse> DeleteMediaInfoAsync(DeleteMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteMediaInfoWithOptionsAsync(request, runtime);
        }

        public GetOSSStatisResponse GetOSSStatisWithOptions(GetOSSStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOSSStatisResponse>(DoRequest("GetOSSStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetOSSStatisResponse> GetOSSStatisWithOptionsAsync(GetOSSStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOSSStatisResponse>(await DoRequestAsync("GetOSSStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetOSSStatisResponse GetOSSStatis(GetOSSStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetOSSStatisWithOptions(request, runtime);
        }

        public async Task<GetOSSStatisResponse> GetOSSStatisAsync(GetOSSStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetOSSStatisWithOptionsAsync(request, runtime);
        }

        public GetVideoPlayInfoResponse GetVideoPlayInfoWithOptions(GetVideoPlayInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoPlayInfoResponse>(DoRequest("GetVideoPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetVideoPlayInfoResponse> GetVideoPlayInfoWithOptionsAsync(GetVideoPlayInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetVideoPlayInfoResponse>(await DoRequestAsync("GetVideoPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetVideoPlayInfoResponse GetVideoPlayInfo(GetVideoPlayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetVideoPlayInfoWithOptions(request, runtime);
        }

        public async Task<GetVideoPlayInfoResponse> GetVideoPlayInfoAsync(GetVideoPlayInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetVideoPlayInfoWithOptionsAsync(request, runtime);
        }

        public GetMediaInfoListResponse GetMediaInfoListWithOptions(GetMediaInfoListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaInfoListResponse>(DoRequest("GetMediaInfoList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMediaInfoListResponse> GetMediaInfoListWithOptionsAsync(GetMediaInfoListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaInfoListResponse>(await DoRequestAsync("GetMediaInfoList", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMediaInfoListResponse GetMediaInfoList(GetMediaInfoListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMediaInfoListWithOptions(request, runtime);
        }

        public async Task<GetMediaInfoListResponse> GetMediaInfoListAsync(GetMediaInfoListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMediaInfoListWithOptionsAsync(request, runtime);
        }

        public GetMediaInfoResponse GetMediaInfoWithOptions(GetMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaInfoResponse>(DoRequest("GetMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetMediaInfoResponse> GetMediaInfoWithOptionsAsync(GetMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMediaInfoResponse>(await DoRequestAsync("GetMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetMediaInfoResponse GetMediaInfo(GetMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetMediaInfoWithOptions(request, runtime);
        }

        public async Task<GetMediaInfoResponse> GetMediaInfoAsync(GetMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetMediaInfoWithOptionsAsync(request, runtime);
        }

        public SearchMediaInfoResponse SearchMediaInfoWithOptions(SearchMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMediaInfoResponse>(DoRequest("SearchMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SearchMediaInfoResponse> SearchMediaInfoWithOptionsAsync(SearchMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMediaInfoResponse>(await DoRequestAsync("SearchMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SearchMediaInfoResponse SearchMediaInfo(SearchMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SearchMediaInfoWithOptions(request, runtime);
        }

        public async Task<SearchMediaInfoResponse> SearchMediaInfoAsync(SearchMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SearchMediaInfoWithOptionsAsync(request, runtime);
        }

        public RefreshUploadTokenResponse RefreshUploadTokenWithOptions(RefreshUploadTokenRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshUploadTokenResponse>(DoRequest("RefreshUploadToken", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RefreshUploadTokenResponse> RefreshUploadTokenWithOptionsAsync(RefreshUploadTokenRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefreshUploadTokenResponse>(await DoRequestAsync("RefreshUploadToken", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public RefreshUploadTokenResponse RefreshUploadToken(RefreshUploadTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RefreshUploadTokenWithOptions(request, runtime);
        }

        public async Task<RefreshUploadTokenResponse> RefreshUploadTokenAsync(RefreshUploadTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RefreshUploadTokenWithOptionsAsync(request, runtime);
        }

        public ListAllCategoryResponse ListAllCategoryWithOptions(ListAllCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAllCategoryResponse>(DoRequest("ListAllCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ListAllCategoryResponse> ListAllCategoryWithOptionsAsync(ListAllCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAllCategoryResponse>(await DoRequestAsync("ListAllCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public ListAllCategoryResponse ListAllCategory(ListAllCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ListAllCategoryWithOptions(request, runtime);
        }

        public async Task<ListAllCategoryResponse> ListAllCategoryAsync(ListAllCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ListAllCategoryWithOptionsAsync(request, runtime);
        }

        public GetTotalStatisResponse GetTotalStatisWithOptions(GetTotalStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTotalStatisResponse>(DoRequest("GetTotalStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetTotalStatisResponse> GetTotalStatisWithOptionsAsync(GetTotalStatisRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTotalStatisResponse>(await DoRequestAsync("GetTotalStatis", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetTotalStatisResponse GetTotalStatis(GetTotalStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetTotalStatisWithOptions(request, runtime);
        }

        public async Task<GetTotalStatisResponse> GetTotalStatisAsync(GetTotalStatisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetTotalStatisWithOptionsAsync(request, runtime);
        }

        public UpdateMediaInfoResponse UpdateMediaInfoWithOptions(UpdateMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMediaInfoResponse>(DoRequest("UpdateMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateMediaInfoResponse> UpdateMediaInfoWithOptionsAsync(UpdateMediaInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMediaInfoResponse>(await DoRequestAsync("UpdateMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateMediaInfoResponse UpdateMediaInfo(UpdateMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateMediaInfoWithOptions(request, runtime);
        }

        public async Task<UpdateMediaInfoResponse> UpdateMediaInfoAsync(UpdateMediaInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateMediaInfoWithOptionsAsync(request, runtime);
        }

        public UpdateMediaCategoryResponse UpdateMediaCategoryWithOptions(UpdateMediaCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMediaCategoryResponse>(DoRequest("UpdateMediaCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateMediaCategoryResponse> UpdateMediaCategoryWithOptionsAsync(UpdateMediaCategoryRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMediaCategoryResponse>(await DoRequestAsync("UpdateMediaCategory", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateMediaCategoryResponse UpdateMediaCategory(UpdateMediaCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateMediaCategoryWithOptions(request, runtime);
        }

        public async Task<UpdateMediaCategoryResponse> UpdateMediaCategoryAsync(UpdateMediaCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateMediaCategoryWithOptionsAsync(request, runtime);
        }

        public UpdateCategoryNameResponse UpdateCategoryNameWithOptions(UpdateCategoryNameRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCategoryNameResponse>(DoRequest("UpdateCategoryName", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateCategoryNameResponse> UpdateCategoryNameWithOptionsAsync(UpdateCategoryNameRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCategoryNameResponse>(await DoRequestAsync("UpdateCategoryName", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateCategoryNameResponse UpdateCategoryName(UpdateCategoryNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateCategoryNameWithOptions(request, runtime);
        }

        public async Task<UpdateCategoryNameResponse> UpdateCategoryNameAsync(UpdateCategoryNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateCategoryNameWithOptionsAsync(request, runtime);
        }

        public AddWatermarkResponse AddWatermarkWithOptions(AddWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkResponse>(DoRequest("AddWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddWatermarkResponse> AddWatermarkWithOptionsAsync(AddWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddWatermarkResponse>(await DoRequestAsync("AddWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddWatermarkResponse AddWatermark(AddWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddWatermarkWithOptions(request, runtime);
        }

        public async Task<AddWatermarkResponse> AddWatermarkAsync(AddWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddWatermarkWithOptionsAsync(request, runtime);
        }

        public AddTranscodeTemplateResponse AddTranscodeTemplateWithOptions(AddTranscodeTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTranscodeTemplateResponse>(DoRequest("AddTranscodeTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddTranscodeTemplateResponse> AddTranscodeTemplateWithOptionsAsync(AddTranscodeTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTranscodeTemplateResponse>(await DoRequestAsync("AddTranscodeTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddTranscodeTemplateResponse AddTranscodeTemplate(AddTranscodeTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddTranscodeTemplateWithOptions(request, runtime);
        }

        public async Task<AddTranscodeTemplateResponse> AddTranscodeTemplateAsync(AddTranscodeTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddTranscodeTemplateWithOptionsAsync(request, runtime);
        }

        public AddSnapshotResponse AddSnapshotWithOptions(AddSnapshotRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSnapshotResponse>(DoRequest("AddSnapshot", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AddSnapshotResponse> AddSnapshotWithOptionsAsync(AddSnapshotRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSnapshotResponse>(await DoRequestAsync("AddSnapshot", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public AddSnapshotResponse AddSnapshot(AddSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddSnapshotWithOptions(request, runtime);
        }

        public async Task<AddSnapshotResponse> AddSnapshotAsync(AddSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddSnapshotWithOptionsAsync(request, runtime);
        }

        public GetCustomerTranscodeConfResponse GetCustomerTranscodeConfWithOptions(GetCustomerTranscodeConfRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerTranscodeConfResponse>(DoRequest("GetCustomerTranscodeConf", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCustomerTranscodeConfResponse> GetCustomerTranscodeConfWithOptionsAsync(GetCustomerTranscodeConfRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerTranscodeConfResponse>(await DoRequestAsync("GetCustomerTranscodeConf", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCustomerTranscodeConfResponse GetCustomerTranscodeConf(GetCustomerTranscodeConfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCustomerTranscodeConfWithOptions(request, runtime);
        }

        public async Task<GetCustomerTranscodeConfResponse> GetCustomerTranscodeConfAsync(GetCustomerTranscodeConfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCustomerTranscodeConfWithOptionsAsync(request, runtime);
        }

        public DeleteWatermarkResponse DeleteWatermarkWithOptions(DeleteWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkResponse>(DoRequest("DeleteWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteWatermarkResponse> DeleteWatermarkWithOptionsAsync(DeleteWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWatermarkResponse>(await DoRequestAsync("DeleteWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteWatermarkResponse DeleteWatermark(DeleteWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteWatermarkWithOptions(request, runtime);
        }

        public async Task<DeleteWatermarkResponse> DeleteWatermarkAsync(DeleteWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteWatermarkWithOptionsAsync(request, runtime);
        }

        public GetWatermarkResponse GetWatermarkWithOptions(GetWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkResponse>(DoRequest("GetWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetWatermarkResponse> GetWatermarkWithOptionsAsync(GetWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkResponse>(await DoRequestAsync("GetWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetWatermarkResponse GetWatermark(GetWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetWatermarkWithOptions(request, runtime);
        }

        public async Task<GetWatermarkResponse> GetWatermarkAsync(GetWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetWatermarkWithOptionsAsync(request, runtime);
        }

        public GetWatermarksResponse GetWatermarksWithOptions(GetWatermarksRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarksResponse>(DoRequest("GetWatermarks", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetWatermarksResponse> GetWatermarksWithOptionsAsync(GetWatermarksRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarksResponse>(await DoRequestAsync("GetWatermarks", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetWatermarksResponse GetWatermarks(GetWatermarksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetWatermarksWithOptions(request, runtime);
        }

        public async Task<GetWatermarksResponse> GetWatermarksAsync(GetWatermarksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetWatermarksWithOptionsAsync(request, runtime);
        }

        public SwitchWatermarkResponse SwitchWatermarkWithOptions(SwitchWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchWatermarkResponse>(DoRequest("SwitchWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SwitchWatermarkResponse> SwitchWatermarkWithOptionsAsync(SwitchWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchWatermarkResponse>(await DoRequestAsync("SwitchWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SwitchWatermarkResponse SwitchWatermark(SwitchWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SwitchWatermarkWithOptions(request, runtime);
        }

        public async Task<SwitchWatermarkResponse> SwitchWatermarkAsync(SwitchWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SwitchWatermarkWithOptionsAsync(request, runtime);
        }

        public GetWatermarkSwitchResponse GetWatermarkSwitchWithOptions(GetWatermarkSwitchRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkSwitchResponse>(DoRequest("GetWatermarkSwitch", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetWatermarkSwitchResponse> GetWatermarkSwitchWithOptionsAsync(GetWatermarkSwitchRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWatermarkSwitchResponse>(await DoRequestAsync("GetWatermarkSwitch", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public GetWatermarkSwitchResponse GetWatermarkSwitch(GetWatermarkSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetWatermarkSwitchWithOptions(request, runtime);
        }

        public async Task<GetWatermarkSwitchResponse> GetWatermarkSwitchAsync(GetWatermarkSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetWatermarkSwitchWithOptionsAsync(request, runtime);
        }

        public SetDefaultWatermarkResponse SetDefaultWatermarkWithOptions(SetDefaultWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultWatermarkResponse>(DoRequest("SetDefaultWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetDefaultWatermarkResponse> SetDefaultWatermarkWithOptionsAsync(SetDefaultWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDefaultWatermarkResponse>(await DoRequestAsync("SetDefaultWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public SetDefaultWatermarkResponse SetDefaultWatermark(SetDefaultWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetDefaultWatermarkWithOptions(request, runtime);
        }

        public async Task<SetDefaultWatermarkResponse> SetDefaultWatermarkAsync(SetDefaultWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetDefaultWatermarkWithOptionsAsync(request, runtime);
        }

        public UpdateTranscodeTemplateResponse UpdateTranscodeTemplateWithOptions(UpdateTranscodeTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTranscodeTemplateResponse>(DoRequest("UpdateTranscodeTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateTranscodeTemplateResponse> UpdateTranscodeTemplateWithOptionsAsync(UpdateTranscodeTemplateRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTranscodeTemplateResponse>(await DoRequestAsync("UpdateTranscodeTemplate", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateTranscodeTemplateResponse UpdateTranscodeTemplate(UpdateTranscodeTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateTranscodeTemplateWithOptions(request, runtime);
        }

        public async Task<UpdateTranscodeTemplateResponse> UpdateTranscodeTemplateAsync(UpdateTranscodeTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateTranscodeTemplateWithOptionsAsync(request, runtime);
        }

        public UpdateTranscodeConfResponse UpdateTranscodeConfWithOptions(UpdateTranscodeConfRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTranscodeConfResponse>(DoRequest("UpdateTranscodeConf", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateTranscodeConfResponse> UpdateTranscodeConfWithOptionsAsync(UpdateTranscodeConfRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTranscodeConfResponse>(await DoRequestAsync("UpdateTranscodeConf", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateTranscodeConfResponse UpdateTranscodeConf(UpdateTranscodeConfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateTranscodeConfWithOptions(request, runtime);
        }

        public async Task<UpdateTranscodeConfResponse> UpdateTranscodeConfAsync(UpdateTranscodeConfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateTranscodeConfWithOptionsAsync(request, runtime);
        }

        public UpdateWatermarkResponse UpdateWatermarkWithOptions(UpdateWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWatermarkResponse>(DoRequest("UpdateWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpdateWatermarkResponse> UpdateWatermarkWithOptionsAsync(UpdateWatermarkRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWatermarkResponse>(await DoRequestAsync("UpdateWatermark", "HTTPS", "POST", "2017-03-14", "AK", request.ToMap(), null, runtime));
        }

        public UpdateWatermarkResponse UpdateWatermark(UpdateWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpdateWatermarkWithOptions(request, runtime);
        }

        public async Task<UpdateWatermarkResponse> UpdateWatermarkAsync(UpdateWatermarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpdateWatermarkWithOptionsAsync(request, runtime);
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
