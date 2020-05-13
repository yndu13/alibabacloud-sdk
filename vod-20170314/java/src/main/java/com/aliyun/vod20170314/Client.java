// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314;

import com.aliyun.tea.*;
import com.aliyun.vod20170314.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-chengdu", "vod.aliyuncs.com"),
            new TeaPair("cn-edge-1", "vod.aliyuncs.com"),
            new TeaPair("cn-fujian", "vod.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vod.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-wuhan", "vod.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "vod.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeVodDomainISPDataResponse describeVodDomainISPDataWithOptions(DescribeVodDomainISPDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainISPData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainISPDataResponse());
    }

    public DescribeVodDomainISPDataResponse describeVodDomainISPData(DescribeVodDomainISPDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainISPDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRegionDataResponse describeVodDomainRegionDataWithOptions(DescribeVodDomainRegionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRegionData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRegionDataResponse());
    }

    public DescribeVodDomainRegionDataResponse describeVodDomainRegionData(DescribeVodDomainRegionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRegionDataWithOptions(request, runtime);
    }

    public DescribeVodDomainTopReferVisitResponse describeVodDomainTopReferVisitWithOptions(DescribeVodDomainTopReferVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainTopReferVisit", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainTopReferVisitResponse());
    }

    public DescribeVodDomainTopReferVisitResponse describeVodDomainTopReferVisit(DescribeVodDomainTopReferVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainTopReferVisitWithOptions(request, runtime);
    }

    public DescribeVodDomainTopUrlVisitResponse describeVodDomainTopUrlVisitWithOptions(DescribeVodDomainTopUrlVisitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainTopUrlVisit", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainTopUrlVisitResponse());
    }

    public DescribeVodDomainTopUrlVisitResponse describeVodDomainTopUrlVisit(DescribeVodDomainTopUrlVisitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainTopUrlVisitWithOptions(request, runtime);
    }

    public DescribeVodTopDomainsByFlowResponse describeVodTopDomainsByFlowWithOptions(DescribeVodTopDomainsByFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodTopDomainsByFlow", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodTopDomainsByFlowResponse());
    }

    public DescribeVodTopDomainsByFlowResponse describeVodTopDomainsByFlow(DescribeVodTopDomainsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeVodDomainPvDataResponse describeVodDomainPvDataWithOptions(DescribeVodDomainPvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainPvData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainPvDataResponse());
    }

    public DescribeVodDomainPvDataResponse describeVodDomainPvData(DescribeVodDomainPvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainPvDataWithOptions(request, runtime);
    }

    public DescribeVodDomainUvDataResponse describeVodDomainUvDataWithOptions(DescribeVodDomainUvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainUvData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainUvDataResponse());
    }

    public DescribeVodDomainUvDataResponse describeVodDomainUvData(DescribeVodDomainUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainUvDataWithOptions(request, runtime);
    }

    public GetOSSFlowStatisResponse getOSSFlowStatisWithOptions(GetOSSFlowStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOSSFlowStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetOSSFlowStatisResponse());
    }

    public GetOSSFlowStatisResponse getOSSFlowStatis(GetOSSFlowStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSFlowStatisWithOptions(request, runtime);
    }

    public ListAIStatisTypeResponse listAIStatisTypeWithOptions(ListAIStatisTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIStatisType", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIStatisTypeResponse());
    }

    public ListAIStatisTypeResponse listAIStatisType(ListAIStatisTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIStatisTypeWithOptions(request, runtime);
    }

    public GetAIStatisResponse getAIStatisWithOptions(GetAIStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAIStatisResponse());
    }

    public GetAIStatisResponse getAIStatis(GetAIStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIStatisWithOptions(request, runtime);
    }

    public SetDefaultAITemplateResponse setDefaultAITemplateWithOptions(SetDefaultAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultAITemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetDefaultAITemplateResponse());
    }

    public SetDefaultAITemplateResponse setDefaultAITemplate(SetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultAITemplateWithOptions(request, runtime);
    }

    public GetDefaultAITemplateResponse getDefaultAITemplateWithOptions(GetDefaultAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDefaultAITemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetDefaultAITemplateResponse());
    }

    public GetDefaultAITemplateResponse getDefaultAITemplate(GetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultAITemplateWithOptions(request, runtime);
    }

    public ListAITemplateResponse listAITemplateWithOptions(ListAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAITemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAITemplateResponse());
    }

    public ListAITemplateResponse listAITemplate(ListAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAITemplateWithOptions(request, runtime);
    }

    public GetAITemplateResponse getAITemplateWithOptions(GetAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAITemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAITemplateResponse());
    }

    public GetAITemplateResponse getAITemplate(GetAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAITemplateWithOptions(request, runtime);
    }

    public UpdateAITemplateResponse updateAITemplateWithOptions(UpdateAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAITemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateAITemplateResponse());
    }

    public UpdateAITemplateResponse updateAITemplate(UpdateAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAITemplateWithOptions(request, runtime);
    }

    public DeleteAITemplateResponse deleteAITemplateWithOptions(DeleteAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAITemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteAITemplateResponse());
    }

    public DeleteAITemplateResponse deleteAITemplate(DeleteAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAITemplateWithOptions(request, runtime);
    }

    public AddAITemplateResponse addAITemplateWithOptions(AddAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAITemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddAITemplateResponse());
    }

    public AddAITemplateResponse addAITemplate(AddAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAITemplateWithOptions(request, runtime);
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimelineWithOptions(GetMediaAuditResultTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaAuditResultTimeline", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMediaAuditResultTimelineResponse());
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultTimelineWithOptions(request, runtime);
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetailWithOptions(GetMediaAuditResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaAuditResultDetail", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMediaAuditResultDetailResponse());
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultResponse getMediaAuditResultWithOptions(GetMediaAuditResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaAuditResult", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMediaAuditResultResponse());
    }

    public GetMediaAuditResultResponse getMediaAuditResult(GetMediaAuditResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultWithOptions(request, runtime);
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJobWithOptions(SubmitAIMediaAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIMediaAuditJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIMediaAuditJobResponse());
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIMediaAuditJobWithOptions(request, runtime);
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJobWithOptions(GetAIMediaAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIMediaAuditJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAIMediaAuditJobResponse());
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJob(GetAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIMediaAuditJobWithOptions(request, runtime);
    }

    public DisplayAIAuditSwitchResponse displayAIAuditSwitchWithOptions(DisplayAIAuditSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisplayAIAuditSwitch", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DisplayAIAuditSwitchResponse());
    }

    public DisplayAIAuditSwitchResponse displayAIAuditSwitch(DisplayAIAuditSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.displayAIAuditSwitchWithOptions(request, runtime);
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatisWithOptions(DescribePlayVideoStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePlayVideoStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribePlayVideoStatisResponse());
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatis(DescribePlayVideoStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayVideoStatisWithOptions(request, runtime);
    }

    public TransferMediaDataResponse transferMediaDataWithOptions(TransferMediaDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TransferMediaData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new TransferMediaDataResponse());
    }

    public TransferMediaDataResponse transferMediaData(TransferMediaDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferMediaDataWithOptions(request, runtime);
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMediaWithOptions(CreateUploadAttachedMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadAttachedMedia", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateUploadAttachedMediaResponse());
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMedia(CreateUploadAttachedMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadAttachedMediaWithOptions(request, runtime);
    }

    public GetUploadProgressResponse getUploadProgressWithOptions(GetUploadProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetUploadProgress", "HTTPS", "POST", "2017-03-14", "Anonymous", TeaModel.buildMap(request), null, runtime), new GetUploadProgressResponse());
    }

    public GetUploadProgressResponse getUploadProgress(GetUploadProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadProgressWithOptions(request, runtime);
    }

    public UpdateVodTemplateResponse updateVodTemplateWithOptions(UpdateVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateVodTemplateResponse());
    }

    public UpdateVodTemplateResponse updateVodTemplate(UpdateVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodTemplateWithOptions(request, runtime);
    }

    public SetDefaultVodTemplateResponse setDefaultVodTemplateWithOptions(SetDefaultVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetDefaultVodTemplateResponse());
    }

    public SetDefaultVodTemplateResponse setDefaultVodTemplate(SetDefaultVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultVodTemplateWithOptions(request, runtime);
    }

    public ListVodTemplateResponse listVodTemplateWithOptions(ListVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListVodTemplateResponse());
    }

    public ListVodTemplateResponse listVodTemplate(ListVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVodTemplateWithOptions(request, runtime);
    }

    public GetVodTemplateResponse getVodTemplateWithOptions(GetVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVodTemplateResponse());
    }

    public GetVodTemplateResponse getVodTemplate(GetVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVodTemplateWithOptions(request, runtime);
    }

    public DeleteVodTemplateResponse deleteVodTemplateWithOptions(DeleteVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteVodTemplateResponse());
    }

    public DeleteVodTemplateResponse deleteVodTemplate(DeleteVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodTemplateWithOptions(request, runtime);
    }

    public AddVodTemplateResponse addVodTemplateWithOptions(AddVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddVodTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddVodTemplateResponse());
    }

    public AddVodTemplateResponse addVodTemplate(AddVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodTemplateWithOptions(request, runtime);
    }

    public GetMediaDNAResultResponse getMediaDNAResultWithOptions(GetMediaDNAResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaDNAResult", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMediaDNAResultResponse());
    }

    public GetMediaDNAResultResponse getMediaDNAResult(GetMediaDNAResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaDNAResultWithOptions(request, runtime);
    }

    public DeleteMezzaninesResponse deleteMezzaninesWithOptions(DeleteMezzaninesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMezzanines", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteMezzaninesResponse());
    }

    public DeleteMezzaninesResponse deleteMezzanines(DeleteMezzaninesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMezzaninesWithOptions(request, runtime);
    }

    public UpdateImageInfosResponse updateImageInfosWithOptions(UpdateImageInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateImageInfos", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateImageInfosResponse());
    }

    public UpdateImageInfosResponse updateImageInfos(UpdateImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageInfosWithOptions(request, runtime);
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageDataWithOptions(DescribeVodDomainUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainUsageData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainUsageDataResponse());
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainUsageDataWithOptions(request, runtime);
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficDataWithOptions(DescribeVodDomainTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainTrafficData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainTrafficDataResponse());
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeVodDomainsUsageByDayResponse describeVodDomainsUsageByDayWithOptions(DescribeVodDomainsUsageByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainsUsageByDay", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainsUsageByDayResponse());
    }

    public DescribeVodDomainsUsageByDayResponse describeVodDomainsUsageByDay(DescribeVodDomainsUsageByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainsUsageByDayWithOptions(request, runtime);
    }

    public DescribeVodDomainSrcTrafficDataResponse describeVodDomainSrcTrafficDataWithOptions(DescribeVodDomainSrcTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainSrcTrafficData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainSrcTrafficDataResponse());
    }

    public DescribeVodDomainSrcTrafficDataResponse describeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsDataWithOptions(DescribeVodDomainSrcBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainSrcBpsData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainSrcBpsDataResponse());
    }

    public DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeTrafficDataResponse describeVodDomainRealTimeTrafficDataWithOptions(DescribeVodDomainRealTimeTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeTrafficData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeTrafficDataResponse());
    }

    public DescribeVodDomainRealTimeTrafficDataResponse describeVodDomainRealTimeTrafficData(DescribeVodDomainRealTimeTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeSrcTrafficDataResponse describeVodDomainRealTimeSrcTrafficDataWithOptions(DescribeVodDomainRealTimeSrcTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeSrcTrafficData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeSrcTrafficDataResponse());
    }

    public DescribeVodDomainRealTimeSrcTrafficDataResponse describeVodDomainRealTimeSrcTrafficData(DescribeVodDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeSrcBpsDataResponse describeVodDomainRealTimeSrcBpsDataWithOptions(DescribeVodDomainRealTimeSrcBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeSrcBpsData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeSrcBpsDataResponse());
    }

    public DescribeVodDomainRealTimeSrcBpsDataResponse describeVodDomainRealTimeSrcBpsData(DescribeVodDomainRealTimeSrcBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeReqHitRateDataResponse describeVodDomainRealTimeReqHitRateDataWithOptions(DescribeVodDomainRealTimeReqHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeReqHitRateData", "HTTPS", "GET", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeReqHitRateDataResponse());
    }

    public DescribeVodDomainRealTimeReqHitRateDataResponse describeVodDomainRealTimeReqHitRateData(DescribeVodDomainRealTimeReqHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeQpsDataResponse describeVodDomainRealTimeQpsDataWithOptions(DescribeVodDomainRealTimeQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeQpsData", "HTTPS", "GET", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeQpsDataResponse());
    }

    public DescribeVodDomainRealTimeQpsDataResponse describeVodDomainRealTimeQpsData(DescribeVodDomainRealTimeQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeHttpCodeDataResponse describeVodDomainRealTimeHttpCodeDataWithOptions(DescribeVodDomainRealTimeHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeHttpCodeData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeHttpCodeDataResponse());
    }

    public DescribeVodDomainRealTimeHttpCodeDataResponse describeVodDomainRealTimeHttpCodeData(DescribeVodDomainRealTimeHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeByteHitRateDataResponse describeVodDomainRealTimeByteHitRateDataWithOptions(DescribeVodDomainRealTimeByteHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeByteHitRateData", "HTTPS", "GET", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeByteHitRateDataResponse());
    }

    public DescribeVodDomainRealTimeByteHitRateDataResponse describeVodDomainRealTimeByteHitRateData(DescribeVodDomainRealTimeByteHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    public DescribeVodDomainRealTimeBpsDataResponse describeVodDomainRealTimeBpsDataWithOptions(DescribeVodDomainRealTimeBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainRealTimeBpsData", "HTTPS", "GET", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainRealTimeBpsDataResponse());
    }

    public DescribeVodDomainRealTimeBpsDataResponse describeVodDomainRealTimeBpsData(DescribeVodDomainRealTimeBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainQpsDataResponse describeVodDomainQpsDataWithOptions(DescribeVodDomainQpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainQpsData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainQpsDataResponse());
    }

    public DescribeVodDomainQpsDataResponse describeVodDomainQpsData(DescribeVodDomainQpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainQpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainHttpCodeDataResponse describeVodDomainHttpCodeDataWithOptions(DescribeVodDomainHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainHttpCodeData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainHttpCodeDataResponse());
    }

    public DescribeVodDomainHttpCodeDataResponse describeVodDomainHttpCodeData(DescribeVodDomainHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeVodDomainHitRateDataResponse describeVodDomainHitRateDataWithOptions(DescribeVodDomainHitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainHitRateData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainHitRateDataResponse());
    }

    public DescribeVodDomainHitRateDataResponse describeVodDomainHitRateData(DescribeVodDomainHitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainHitRateDataWithOptions(request, runtime);
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsDataWithOptions(DescribeVodDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainBpsData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainBpsDataResponse());
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainBpsDataWithOptions(request, runtime);
    }

    public GetVideoDNAResultResponse getVideoDNAResultWithOptions(GetVideoDNAResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoDNAResult", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoDNAResultResponse());
    }

    public GetVideoDNAResultResponse getVideoDNAResult(GetVideoDNAResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoDNAResultWithOptions(request, runtime);
    }

    public DescribeVodCertificateDetailResponse describeVodCertificateDetailWithOptions(DescribeVodCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodCertificateDetail", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodCertificateDetailResponse());
    }

    public DescribeVodCertificateDetailResponse describeVodCertificateDetail(DescribeVodCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodCertificateDetailWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteImage", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public GetAuditResultDetailResponse getAuditResultDetailWithOptions(GetAuditResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAuditResultDetail", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAuditResultDetailResponse());
    }

    public GetAuditResultDetailResponse getAuditResultDetail(GetAuditResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditResultDetailWithOptions(request, runtime);
    }

    public GetMediaStreamResponse getMediaStreamWithOptions(GetMediaStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaStream", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMediaStreamResponse());
    }

    public GetMediaStreamResponse getMediaStream(GetMediaStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaStreamWithOptions(request, runtime);
    }

    public PayOrderCallbackResponse payOrderCallbackWithOptions(PayOrderCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PayOrderCallback", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new PayOrderCallbackResponse());
    }

    public PayOrderCallbackResponse payOrderCallback(PayOrderCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.payOrderCallbackWithOptions(request, runtime);
    }

    public ModifyResponse modifyWithOptions(ModifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("Modify", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ModifyResponse());
    }

    public ModifyResponse modify(ModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWithOptions(request, runtime);
    }

    public CompleteOrderParamResponse completeOrderParamWithOptions(CompleteOrderParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompleteOrderParam", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CompleteOrderParamResponse());
    }

    public CompleteOrderParamResponse completeOrderParam(CompleteOrderParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeOrderParamWithOptions(request, runtime);
    }

    public UpdateTemplateGroupDaemonResponse updateTemplateGroupDaemonWithOptions(UpdateTemplateGroupDaemonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTemplateGroupDaemon", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateTemplateGroupDaemonResponse());
    }

    public UpdateTemplateGroupDaemonResponse updateTemplateGroupDaemon(UpdateTemplateGroupDaemonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateGroupDaemonWithOptions(request, runtime);
    }

    public CreateKMSServiceKeyResponse createKMSServiceKeyWithOptions(CreateKMSServiceKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateKMSServiceKey", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateKMSServiceKeyResponse());
    }

    public CreateKMSServiceKeyResponse createKMSServiceKey(CreateKMSServiceKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKMSServiceKeyWithOptions(request, runtime);
    }

    public SetAuditSecurityIpResponse setAuditSecurityIpWithOptions(SetAuditSecurityIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetAuditSecurityIp", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetAuditSecurityIpResponse());
    }

    public SetAuditSecurityIpResponse setAuditSecurityIp(SetAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAuditSecurityIpWithOptions(request, runtime);
    }

    public ListAuditSecurityIpResponse listAuditSecurityIpWithOptions(ListAuditSecurityIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAuditSecurityIp", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAuditSecurityIpResponse());
    }

    public ListAuditSecurityIpResponse listAuditSecurityIp(ListAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuditSecurityIpWithOptions(request, runtime);
    }

    public GetVideoInfosResponse getVideoInfosWithOptions(GetVideoInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoInfos", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoInfosResponse());
    }

    public GetVideoInfosResponse getVideoInfos(GetVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfosWithOptions(request, runtime);
    }

    public AssumeOssRoleResponse assumeOssRoleWithOptions(AssumeOssRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssumeOssRole", "HTTPS", "POST", "2017-03-14", "Anonymous", TeaModel.buildMap(request), null, runtime), new AssumeOssRoleResponse());
    }

    public AssumeOssRoleResponse assumeOssRole(AssumeOssRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assumeOssRoleWithOptions(request, runtime);
    }

    public UpdateVodDomainResponse updateVodDomainWithOptions(UpdateVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVodDomain", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateVodDomainResponse());
    }

    public UpdateVodDomainResponse updateVodDomain(UpdateVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodDomainWithOptions(request, runtime);
    }

    public StopVodDomainResponse stopVodDomainWithOptions(StopVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopVodDomain", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new StopVodDomainResponse());
    }

    public StopVodDomainResponse stopVodDomain(StopVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopVodDomainWithOptions(request, runtime);
    }

    public StartVodDomainResponse startVodDomainWithOptions(StartVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartVodDomain", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new StartVodDomainResponse());
    }

    public StartVodDomainResponse startVodDomain(StartVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startVodDomainWithOptions(request, runtime);
    }

    public SetVodDomainCertificateResponse setVodDomainCertificateWithOptions(SetVodDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetVodDomainCertificate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetVodDomainCertificateResponse());
    }

    public SetVodDomainCertificateResponse setVodDomainCertificate(SetVodDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVodDomainCertificateWithOptions(request, runtime);
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCachesWithOptions(RefreshVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshVodObjectCaches", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new RefreshVodObjectCachesResponse());
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCaches(RefreshVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshVodObjectCachesWithOptions(request, runtime);
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCachesWithOptions(PreloadVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PreloadVodObjectCaches", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new PreloadVodObjectCachesResponse());
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCaches(PreloadVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadVodObjectCachesWithOptions(request, runtime);
    }

    public DescribeVodUserResourcePackageResponse describeVodUserResourcePackageWithOptions(DescribeVodUserResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodUserResourcePackage", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodUserResourcePackageResponse());
    }

    public DescribeVodUserResourcePackageResponse describeVodUserResourcePackage(DescribeVodUserResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserResourcePackageWithOptions(request, runtime);
    }

    public DescribeVodUserQuotaResponse describeVodUserQuotaWithOptions(DescribeVodUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodUserQuota", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodUserQuotaResponse());
    }

    public DescribeVodUserQuotaResponse describeVodUserQuota(DescribeVodUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserQuotaWithOptions(request, runtime);
    }

    public DescribeVodUserDomainsResponse describeVodUserDomainsWithOptions(DescribeVodUserDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodUserDomains", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodUserDomainsResponse());
    }

    public DescribeVodUserDomainsResponse describeVodUserDomains(DescribeVodUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserDomainsWithOptions(request, runtime);
    }

    public DescribeVodServiceResponse describeVodServiceWithOptions(DescribeVodServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodService", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodServiceResponse());
    }

    public DescribeVodServiceResponse describeVodService(DescribeVodServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodServiceWithOptions(request, runtime);
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasksWithOptions(DescribeVodRefreshTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodRefreshTasks", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodRefreshTasksResponse());
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasks(DescribeVodRefreshTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshTasksWithOptions(request, runtime);
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuotaWithOptions(DescribeVodRefreshQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodRefreshQuota", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodRefreshQuotaResponse());
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetailWithOptions(DescribeVodDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainDetail", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainDetailResponse());
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetail(DescribeVodDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainDetailWithOptions(request, runtime);
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigsWithOptions(DescribeVodDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainConfigs", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainConfigsResponse());
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigs(DescribeVodDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainConfigsWithOptions(request, runtime);
    }

    public DescribeVodCertificateListResponse describeVodCertificateListWithOptions(DescribeVodCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodCertificateList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodCertificateListResponse());
    }

    public DescribeVodCertificateListResponse describeVodCertificateList(DescribeVodCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodCertificateListWithOptions(request, runtime);
    }

    public DescribeUserVodStatusResponse describeUserVodStatusWithOptions(DescribeUserVodStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserVodStatus", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserVodStatusResponse());
    }

    public DescribeUserVodStatusResponse describeUserVodStatus(DescribeUserVodStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserVodStatusWithOptions(request, runtime);
    }

    public DeleteVodDomainResponse deleteVodDomainWithOptions(DeleteVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVodDomain", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteVodDomainResponse());
    }

    public DeleteVodDomainResponse deleteVodDomain(DeleteVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodDomainWithOptions(request, runtime);
    }

    public AddVodDomainResponse addVodDomainWithOptions(AddVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddVodDomain", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddVodDomainResponse());
    }

    public AddVodDomainResponse addVodDomain(AddVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodDomainWithOptions(request, runtime);
    }

    public DescribeVodDomainLogResponse describeVodDomainLogWithOptions(DescribeVodDomainLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainLog", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainLogResponse());
    }

    public DescribeVodDomainLogResponse describeVodDomainLog(DescribeVodDomainLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainLogWithOptions(request, runtime);
    }

    public DescribeVodDomainCnameResponse describeVodDomainCnameWithOptions(DescribeVodDomainCnameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainCname", "HTTPS", "GET", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainCnameResponse());
    }

    public DescribeVodDomainCnameResponse describeVodDomainCname(DescribeVodDomainCnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainCnameWithOptions(request, runtime);
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfoWithOptions(DescribeVodDomainCertificateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainCertificateInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainCertificateInfoResponse());
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainCertificateInfoWithOptions(request, runtime);
    }

    public UploadMediaByURLResponse uploadMediaByURLWithOptions(UploadMediaByURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadMediaByURL", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UploadMediaByURLResponse());
    }

    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMediaByURLWithOptions(request, runtime);
    }

    public GetAIServiceResponse getAIServiceWithOptions(GetAIServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIService", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAIServiceResponse());
    }

    public GetAIServiceResponse getAIService(GetAIServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIServiceWithOptions(request, runtime);
    }

    public SetAIServiceResponse setAIServiceWithOptions(SetAIServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetAIService", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetAIServiceResponse());
    }

    public SetAIServiceResponse setAIService(SetAIServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAIServiceWithOptions(request, runtime);
    }

    public SetL2OssKeyConfigResponse setL2OssKeyConfigWithOptions(SetL2OssKeyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetL2OssKeyConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetL2OssKeyConfigResponse());
    }

    public SetL2OssKeyConfigResponse setL2OssKeyConfig(SetL2OssKeyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setL2OssKeyConfigWithOptions(request, runtime);
    }

    public SetDefaultUploadStorageResponse setDefaultUploadStorageWithOptions(SetDefaultUploadStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultUploadStorage", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetDefaultUploadStorageResponse());
    }

    public SetDefaultUploadStorageResponse setDefaultUploadStorage(SetDefaultUploadStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultUploadStorageWithOptions(request, runtime);
    }

    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchMedia", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SearchMediaResponse());
    }

    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    public UpdateVideoInfosResponse updateVideoInfosWithOptions(UpdateVideoInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVideoInfos", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateVideoInfosResponse());
    }

    public UpdateVideoInfosResponse updateVideoInfos(UpdateVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfosWithOptions(request, runtime);
    }

    public GenerateDownloadSecretKeyResponse generateDownloadSecretKeyWithOptions(GenerateDownloadSecretKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateDownloadSecretKey", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GenerateDownloadSecretKeyResponse());
    }

    public GenerateDownloadSecretKeyResponse generateDownloadSecretKey(GenerateDownloadSecretKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDownloadSecretKeyWithOptions(request, runtime);
    }

    public AssumeSlsRoleResponse assumeSlsRoleWithOptions(AssumeSlsRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssumeSlsRole", "HTTPS", "POST", "2017-03-14", "Anonymous", TeaModel.buildMap(request), null, runtime), new AssumeSlsRoleResponse());
    }

    public AssumeSlsRoleResponse assumeSlsRole(AssumeSlsRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assumeSlsRoleWithOptions(request, runtime);
    }

    public GetPersonalStorageListResponse getPersonalStorageListWithOptions(GetPersonalStorageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPersonalStorageList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetPersonalStorageListResponse());
    }

    public GetPersonalStorageListResponse getPersonalStorageList(GetPersonalStorageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPersonalStorageListWithOptions(request, runtime);
    }

    public GetStorageRegionListResponse getStorageRegionListWithOptions(GetStorageRegionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStorageRegionList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetStorageRegionListResponse());
    }

    public GetStorageRegionListResponse getStorageRegionList(GetStorageRegionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageRegionListWithOptions(request, runtime);
    }

    public SetStorageACLResponse setStorageACLWithOptions(SetStorageACLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetStorageACL", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetStorageACLResponse());
    }

    public SetStorageACLResponse setStorageACL(SetStorageACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setStorageACLWithOptions(request, runtime);
    }

    public GetMessageCallbackEventListResponse getMessageCallbackEventListWithOptions(GetMessageCallbackEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMessageCallbackEventList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMessageCallbackEventListResponse());
    }

    public GetMessageCallbackEventListResponse getMessageCallbackEventList(GetMessageCallbackEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageCallbackEventListWithOptions(request, runtime);
    }

    public GetStorageInfoResponse getStorageInfoWithOptions(GetStorageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStorageInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetStorageInfoResponse());
    }

    public GetStorageInfoResponse getStorageInfo(GetStorageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageInfoWithOptions(request, runtime);
    }

    public DeleteStorageResponse deleteStorageWithOptions(DeleteStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteStorage", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteStorageResponse());
    }

    public DeleteStorageResponse deleteStorage(DeleteStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStorageWithOptions(request, runtime);
    }

    public AddStorageResponse addStorageWithOptions(AddStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddStorage", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddStorageResponse());
    }

    public AddStorageResponse addStorage(AddStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addStorageWithOptions(request, runtime);
    }

    public GetStorageListResponse getStorageListWithOptions(GetStorageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStorageList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetStorageListResponse());
    }

    public GetStorageListResponse getStorageList(GetStorageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageListWithOptions(request, runtime);
    }

    public GetThirdPartPlayPolicyResponse getThirdPartPlayPolicyWithOptions(GetThirdPartPlayPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetThirdPartPlayPolicy", "HTTPS", "POST", "2017-03-14", "Anonymous", TeaModel.buildMap(request), null, runtime), new GetThirdPartPlayPolicyResponse());
    }

    public GetThirdPartPlayPolicyResponse getThirdPartPlayPolicy(GetThirdPartPlayPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getThirdPartPlayPolicyWithOptions(request, runtime);
    }

    public AddThirdPartPlayPolicyResponse addThirdPartPlayPolicyWithOptions(AddThirdPartPlayPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddThirdPartPlayPolicy", "HTTPS", "POST", "2017-03-14", "Anonymous", TeaModel.buildMap(request), null, runtime), new AddThirdPartPlayPolicyResponse());
    }

    public AddThirdPartPlayPolicyResponse addThirdPartPlayPolicy(AddThirdPartPlayPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addThirdPartPlayPolicyWithOptions(request, runtime);
    }

    public AuthorizeAppLicenseResponse authorizeAppLicenseWithOptions(AuthorizeAppLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AuthorizeAppLicense", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AuthorizeAppLicenseResponse());
    }

    public AuthorizeAppLicenseResponse authorizeAppLicense(AuthorizeAppLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeAppLicenseWithOptions(request, runtime);
    }

    public GetAppLicenseResponse getAppLicenseWithOptions(GetAppLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAppLicense", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAppLicenseResponse());
    }

    public GetAppLicenseResponse getAppLicense(GetAppLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppLicenseWithOptions(request, runtime);
    }

    public UpdateAppLicenseResponse updateAppLicenseWithOptions(UpdateAppLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAppLicense", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateAppLicenseResponse());
    }

    public UpdateAppLicenseResponse updateAppLicense(UpdateAppLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppLicenseWithOptions(request, runtime);
    }

    public AddAppLicenseResponse addAppLicenseWithOptions(AddAppLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAppLicense", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddAppLicenseResponse());
    }

    public AddAppLicenseResponse addAppLicense(AddAppLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAppLicenseWithOptions(request, runtime);
    }

    public GetAppLicenseListResponse getAppLicenseListWithOptions(GetAppLicenseListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAppLicenseList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAppLicenseListResponse());
    }

    public GetAppLicenseListResponse getAppLicenseList(GetAppLicenseListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppLicenseListWithOptions(request, runtime);
    }

    public SPIPhysicalDeleteResourceActionResponse SPIPhysicalDeleteResourceActionWithOptions(SPIPhysicalDeleteResourceActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SPIPhysicalDeleteResourceAction", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SPIPhysicalDeleteResourceActionResponse());
    }

    public SPIPhysicalDeleteResourceActionResponse SPIPhysicalDeleteResourceAction(SPIPhysicalDeleteResourceActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.SPIPhysicalDeleteResourceActionWithOptions(request, runtime);
    }

    public SPICheckResourceActionResponse SPICheckResourceActionWithOptions(SPICheckResourceActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SPICheckResourceAction", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SPICheckResourceActionResponse());
    }

    public SPICheckResourceActionResponse SPICheckResourceAction(SPICheckResourceActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.SPICheckResourceActionWithOptions(request, runtime);
    }

    public SPILogicalDeleteResourceActionResponse SPILogicalDeleteResourceActionWithOptions(SPILogicalDeleteResourceActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SPILogicalDeleteResourceAction", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SPILogicalDeleteResourceActionResponse());
    }

    public SPILogicalDeleteResourceActionResponse SPILogicalDeleteResourceAction(SPILogicalDeleteResourceActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.SPILogicalDeleteResourceActionWithOptions(request, runtime);
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobsWithOptions(SubmitPreprocessJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitPreprocessJobs", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitPreprocessJobsResponse());
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobs(SubmitPreprocessJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPreprocessJobsWithOptions(request, runtime);
    }

    public QueryOrderParamResponse queryOrderParamWithOptions(QueryOrderParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOrderParam", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryOrderParamResponse());
    }

    public QueryOrderParamResponse queryOrderParam(QueryOrderParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderParamWithOptions(request, runtime);
    }

    public AssumeExperienceRoleResponse assumeExperienceRoleWithOptions(AssumeExperienceRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AssumeExperienceRole", "HTTPS", "POST", "2017-03-14", "Anonymous", TeaModel.buildMap(request), null, runtime), new AssumeExperienceRoleResponse());
    }

    public AssumeExperienceRoleResponse assumeExperienceRole(AssumeExperienceRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assumeExperienceRoleWithOptions(request, runtime);
    }

    public ListSnapshotsResponse listSnapshotsWithOptions(ListSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSnapshots", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListSnapshotsResponse());
    }

    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    public SetDefaultPlayDomainResponse setDefaultPlayDomainWithOptions(SetDefaultPlayDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultPlayDomain", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetDefaultPlayDomainResponse());
    }

    public SetDefaultPlayDomainResponse setDefaultPlayDomain(SetDefaultPlayDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultPlayDomainWithOptions(request, runtime);
    }

    public EditVideoIndexFileResponse editVideoIndexFileWithOptions(EditVideoIndexFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EditVideoIndexFile", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new EditVideoIndexFileResponse());
    }

    public EditVideoIndexFileResponse editVideoIndexFile(EditVideoIndexFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editVideoIndexFileWithOptions(request, runtime);
    }

    public SetCDNDomainServerCertificateResponse setCDNDomainServerCertificateWithOptions(SetCDNDomainServerCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCDNDomainServerCertificate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetCDNDomainServerCertificateResponse());
    }

    public SetCDNDomainServerCertificateResponse setCDNDomainServerCertificate(SetCDNDomainServerCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCDNDomainServerCertificateWithOptions(request, runtime);
    }

    public SetCDNForceRedirectConfigResponse setCDNForceRedirectConfigWithOptions(SetCDNForceRedirectConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCDNForceRedirectConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetCDNForceRedirectConfigResponse());
    }

    public SetCDNForceRedirectConfigResponse setCDNForceRedirectConfig(SetCDNForceRedirectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCDNForceRedirectConfigWithOptions(request, runtime);
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobsWithOptions(SubmitTranscodeJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitTranscodeJobs", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitTranscodeJobsResponse());
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobs(SubmitTranscodeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTranscodeJobsWithOptions(request, runtime);
    }

    public GetAuditResultResponse getAuditResultWithOptions(GetAuditResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAuditResult", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAuditResultResponse());
    }

    public GetAuditResultResponse getAuditResult(GetAuditResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditResultWithOptions(request, runtime);
    }

    public CreateAuditResponse createAuditWithOptions(CreateAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAudit", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateAuditResponse());
    }

    public CreateAuditResponse createAudit(CreateAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuditWithOptions(request, runtime);
    }

    public GetAuditHistoryResponse getAuditHistoryWithOptions(GetAuditHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAuditHistory", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAuditHistoryResponse());
    }

    public GetAuditHistoryResponse getAuditHistory(GetAuditHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditHistoryWithOptions(request, runtime);
    }

    public FinishLiveStreamRecordResponse finishLiveStreamRecordWithOptions(FinishLiveStreamRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FinishLiveStreamRecord", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new FinishLiveStreamRecordResponse());
    }

    public FinishLiveStreamRecordResponse finishLiveStreamRecord(FinishLiveStreamRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.finishLiveStreamRecordWithOptions(request, runtime);
    }

    public ListLiveRecordVideoResponse listLiveRecordVideoWithOptions(ListLiveRecordVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLiveRecordVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListLiveRecordVideoResponse());
    }

    public ListLiveRecordVideoResponse listLiveRecordVideo(ListLiveRecordVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRecordVideoWithOptions(request, runtime);
    }

    public AddLiveStreamVideoResponse addLiveStreamVideoWithOptions(AddLiveStreamVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveStreamVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddLiveStreamVideoResponse());
    }

    public AddLiveStreamVideoResponse addLiveStreamVideo(AddLiveStreamVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveStreamVideoWithOptions(request, runtime);
    }

    public SetTemplateGroupPropertyResponse setTemplateGroupPropertyWithOptions(SetTemplateGroupPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetTemplateGroupProperty", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetTemplateGroupPropertyResponse());
    }

    public SetTemplateGroupPropertyResponse setTemplateGroupProperty(SetTemplateGroupPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTemplateGroupPropertyWithOptions(request, runtime);
    }

    public QueryUploadInfoResponse queryUploadInfoWithOptions(QueryUploadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryUploadInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryUploadInfoResponse());
    }

    public QueryUploadInfoResponse queryUploadInfo(QueryUploadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUploadInfoWithOptions(request, runtime);
    }

    public FaceRegistrationResponse faceRegistrationWithOptions(FaceRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FaceRegistration", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new FaceRegistrationResponse());
    }

    public FaceRegistrationResponse faceRegistration(FaceRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceRegistrationWithOptions(request, runtime);
    }

    public ListAIJobResponse listAIJobWithOptions(ListAIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIJobResponse());
    }

    public ListAIJobResponse listAIJob(ListAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIJobWithOptions(request, runtime);
    }

    public SubmitAIJobResponse submitAIJobWithOptions(SubmitAIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIJobResponse());
    }

    public SubmitAIJobResponse submitAIJob(SubmitAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIJobWithOptions(request, runtime);
    }

    public GetImageInfoResponse getImageInfoWithOptions(GetImageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetImageInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetImageInfoResponse());
    }

    public GetImageInfoResponse getImageInfo(GetImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageInfoWithOptions(request, runtime);
    }

    public UpdateWatermarkInfoResponse updateWatermarkInfoWithOptions(UpdateWatermarkInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateWatermarkInfoResponse());
    }

    public UpdateWatermarkInfoResponse updateWatermarkInfo(UpdateWatermarkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatermarkInfoWithOptions(request, runtime);
    }

    public UpdateWatermarkGroupResponse updateWatermarkGroupWithOptions(UpdateWatermarkGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateWatermarkGroupResponse());
    }

    public UpdateWatermarkGroupResponse updateWatermarkGroup(UpdateWatermarkGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatermarkGroupWithOptions(request, runtime);
    }

    public ListWatermarkInfoResponse listWatermarkInfoWithOptions(ListWatermarkInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListWatermarkInfoResponse());
    }

    public ListWatermarkInfoResponse listWatermarkInfo(ListWatermarkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWatermarkInfoWithOptions(request, runtime);
    }

    public ListCompanionresourceInfoResponse listCompanionresourceInfoWithOptions(ListCompanionresourceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListCompanionresourceInfoResponse());
    }

    public ListCompanionresourceInfoResponse listCompanionresourceInfo(ListCompanionresourceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCompanionresourceInfoWithOptions(request, runtime);
    }

    public GetWatermarkInfoResponse getWatermarkInfoWithOptions(GetWatermarkInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetWatermarkInfoResponse());
    }

    public GetWatermarkInfoResponse getWatermarkInfo(GetWatermarkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkInfoWithOptions(request, runtime);
    }

    public GetWatermarkGroupResponse getWatermarkGroupWithOptions(GetWatermarkGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetWatermarkGroupResponse());
    }

    public GetWatermarkGroupResponse getWatermarkGroup(GetWatermarkGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkGroupWithOptions(request, runtime);
    }

    public GetCompanionresourceInfoResponse getCompanionresourceInfoWithOptions(GetCompanionresourceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCompanionresourceInfoResponse());
    }

    public GetCompanionresourceInfoResponse getCompanionresourceInfo(GetCompanionresourceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompanionresourceInfoWithOptions(request, runtime);
    }

    public DeleteWatermarkRelationResponse deleteWatermarkRelationWithOptions(DeleteWatermarkRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteWatermarkRelation", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteWatermarkRelationResponse());
    }

    public DeleteWatermarkRelationResponse deleteWatermarkRelation(DeleteWatermarkRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkRelationWithOptions(request, runtime);
    }

    public DeleteWatermarkInfoResponse deleteWatermarkInfoWithOptions(DeleteWatermarkInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteWatermarkInfoResponse());
    }

    public DeleteWatermarkInfoResponse deleteWatermarkInfo(DeleteWatermarkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkInfoWithOptions(request, runtime);
    }

    public DeleteWatermarkGroupResponse deleteWatermarkGroupWithOptions(DeleteWatermarkGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteWatermarkGroupResponse());
    }

    public DeleteWatermarkGroupResponse deleteWatermarkGroup(DeleteWatermarkGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkGroupWithOptions(request, runtime);
    }

    public DeleteCompanionresourceInfoResponse deleteCompanionresourceInfoWithOptions(DeleteCompanionresourceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteCompanionresourceInfoResponse());
    }

    public DeleteCompanionresourceInfoResponse deleteCompanionresourceInfo(DeleteCompanionresourceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCompanionresourceInfoWithOptions(request, runtime);
    }

    public CreateUploadMediaFileResponse createUploadMediaFileWithOptions(CreateUploadMediaFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadMediaFile", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateUploadMediaFileResponse());
    }

    public CreateUploadMediaFileResponse createUploadMediaFile(CreateUploadMediaFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadMediaFileWithOptions(request, runtime);
    }

    public AddWatermarkRelationResponse addWatermarkRelationWithOptions(AddWatermarkRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddWatermarkRelation", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddWatermarkRelationResponse());
    }

    public AddWatermarkRelationResponse addWatermarkRelation(AddWatermarkRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatermarkRelationWithOptions(request, runtime);
    }

    public AddWatermarkInfoResponse addWatermarkInfoWithOptions(AddWatermarkInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddWatermarkInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddWatermarkInfoResponse());
    }

    public AddWatermarkInfoResponse addWatermarkInfo(AddWatermarkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatermarkInfoWithOptions(request, runtime);
    }

    public AddWatermarkGroupResponse addWatermarkGroupWithOptions(AddWatermarkGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddWatermarkGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddWatermarkGroupResponse());
    }

    public AddWatermarkGroupResponse addWatermarkGroup(AddWatermarkGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatermarkGroupWithOptions(request, runtime);
    }

    public AddCompanionresourceInfoResponse addCompanionresourceInfoWithOptions(AddCompanionresourceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCompanionresourceInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddCompanionresourceInfoResponse());
    }

    public AddCompanionresourceInfoResponse addCompanionresourceInfo(AddCompanionresourceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCompanionresourceInfoWithOptions(request, runtime);
    }

    public OpenVodServiceResponse openVodServiceWithOptions(OpenVodServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OpenVodService", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new OpenVodServiceResponse());
    }

    public OpenVodServiceResponse openVodService(OpenVodServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openVodServiceWithOptions(request, runtime);
    }

    public SubmitAIVideoCategoryJobResponse submitAIVideoCategoryJobWithOptions(SubmitAIVideoCategoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIVideoCategoryJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIVideoCategoryJobResponse());
    }

    public SubmitAIVideoCategoryJobResponse submitAIVideoCategoryJob(SubmitAIVideoCategoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIVideoCategoryJobWithOptions(request, runtime);
    }

    public ListAIVideoCategoryJobResponse listAIVideoCategoryJobWithOptions(ListAIVideoCategoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIVideoCategoryJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIVideoCategoryJobResponse());
    }

    public ListAIVideoCategoryJobResponse listAIVideoCategoryJob(ListAIVideoCategoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIVideoCategoryJobWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOrder", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public GetBatchPlayInfoResponse getBatchPlayInfoWithOptions(GetBatchPlayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBatchPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetBatchPlayInfoResponse());
    }

    public GetBatchPlayInfoResponse getBatchPlayInfo(GetBatchPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchPlayInfoWithOptions(request, runtime);
    }

    public SubmitAIVideoTerrorismRecogJobResponse submitAIVideoTerrorismRecogJobWithOptions(SubmitAIVideoTerrorismRecogJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIVideoTerrorismRecogJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIVideoTerrorismRecogJobResponse());
    }

    public SubmitAIVideoTerrorismRecogJobResponse submitAIVideoTerrorismRecogJob(SubmitAIVideoTerrorismRecogJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIVideoTerrorismRecogJobWithOptions(request, runtime);
    }

    public SubmitAIVideoCensorJobResponse submitAIVideoCensorJobWithOptions(SubmitAIVideoCensorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIVideoCensorJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIVideoCensorJobResponse());
    }

    public SubmitAIVideoCensorJobResponse submitAIVideoCensorJob(SubmitAIVideoCensorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIVideoCensorJobWithOptions(request, runtime);
    }

    public ListAIVideoTerrorismRecogJobResponse listAIVideoTerrorismRecogJobWithOptions(ListAIVideoTerrorismRecogJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIVideoTerrorismRecogJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIVideoTerrorismRecogJobResponse());
    }

    public ListAIVideoTerrorismRecogJobResponse listAIVideoTerrorismRecogJob(ListAIVideoTerrorismRecogJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIVideoTerrorismRecogJobWithOptions(request, runtime);
    }

    public ListAIVideoCensorJobResponse listAIVideoCensorJobWithOptions(ListAIVideoCensorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIVideoCensorJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIVideoCensorJobResponse());
    }

    public ListAIVideoCensorJobResponse listAIVideoCensorJob(ListAIVideoCensorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIVideoCensorJobWithOptions(request, runtime);
    }

    public DeleteStreamResponse deleteStreamWithOptions(DeleteStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteStream", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteStreamResponse());
    }

    public DeleteStreamResponse deleteStream(DeleteStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamWithOptions(request, runtime);
    }

    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSnapshotJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitSnapshotJobResponse());
    }

    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    public DescribeDomainFlowDataResponse describeDomainFlowDataWithOptions(DescribeDomainFlowDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainFlowData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeDomainFlowDataResponse());
    }

    public DescribeDomainFlowDataResponse describeDomainFlowData(DescribeDomainFlowDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainFlowDataWithOptions(request, runtime);
    }

    public DescribeDomainBpsDataResponse describeDomainBpsDataWithOptions(DescribeDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainBpsData", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeDomainBpsDataResponse());
    }

    public DescribeDomainBpsDataResponse describeDomainBpsData(DescribeDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeCdnDomainLogsResponse describeCdnDomainLogsWithOptions(DescribeCdnDomainLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCdnDomainLogs", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeCdnDomainLogsResponse());
    }

    public DescribeCdnDomainLogsResponse describeCdnDomainLogs(DescribeCdnDomainLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdnDomainLogsWithOptions(request, runtime);
    }

    public SubmitAIVideoSummaryJobResponse submitAIVideoSummaryJobWithOptions(SubmitAIVideoSummaryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIVideoSummaryJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIVideoSummaryJobResponse());
    }

    public SubmitAIVideoSummaryJobResponse submitAIVideoSummaryJob(SubmitAIVideoSummaryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIVideoSummaryJobWithOptions(request, runtime);
    }

    public ListAIVideoSummaryJobResponse listAIVideoSummaryJobWithOptions(ListAIVideoSummaryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIVideoSummaryJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIVideoSummaryJobResponse());
    }

    public ListAIVideoSummaryJobResponse listAIVideoSummaryJob(ListAIVideoSummaryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIVideoSummaryJobWithOptions(request, runtime);
    }

    public DescribeUserVvTopByDayResponse describeUserVvTopByDayWithOptions(DescribeUserVvTopByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserVvTopByDay", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserVvTopByDayResponse());
    }

    public DescribeUserVvTopByDayResponse describeUserVvTopByDay(DescribeUserVvTopByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserVvTopByDayWithOptions(request, runtime);
    }

    public DescribeUserVvByVideoidResponse describeUserVvByVideoidWithOptions(DescribeUserVvByVideoidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserVvByVideoid", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserVvByVideoidResponse());
    }

    public DescribeUserVvByVideoidResponse describeUserVvByVideoid(DescribeUserVvByVideoidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserVvByVideoidWithOptions(request, runtime);
    }

    public DescribeUserVvByDayResponse describeUserVvByDayWithOptions(DescribeUserVvByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserVvByDay", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserVvByDayResponse());
    }

    public DescribeUserVvByDayResponse describeUserVvByDay(DescribeUserVvByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserVvByDayWithOptions(request, runtime);
    }

    public DescribeUserUvByDayResponse describeUserUvByDayWithOptions(DescribeUserUvByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserUvByDay", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserUvByDayResponse());
    }

    public DescribeUserUvByDayResponse describeUserUvByDay(DescribeUserUvByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserUvByDayWithOptions(request, runtime);
    }

    public DescribeUserTimeRangeByDayResponse describeUserTimeRangeByDayWithOptions(DescribeUserTimeRangeByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserTimeRangeByDay", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserTimeRangeByDayResponse());
    }

    public DescribeUserTimeRangeByDayResponse describeUserTimeRangeByDay(DescribeUserTimeRangeByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserTimeRangeByDayWithOptions(request, runtime);
    }

    public DescribeUserAvgTimeByDayResponse describeUserAvgTimeByDayWithOptions(DescribeUserAvgTimeByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserAvgTimeByDay", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserAvgTimeByDayResponse());
    }

    public DescribeUserAvgTimeByDayResponse describeUserAvgTimeByDay(DescribeUserAvgTimeByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAvgTimeByDayWithOptions(request, runtime);
    }

    public DescribeUserAvgCountByDayResponse describeUserAvgCountByDayWithOptions(DescribeUserAvgCountByDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUserAvgCountByDay", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeUserAvgCountByDayResponse());
    }

    public DescribeUserAvgCountByDayResponse describeUserAvgCountByDay(DescribeUserAvgCountByDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAvgCountByDayWithOptions(request, runtime);
    }

    public SetDefaultTemplateGroupResponse setDefaultTemplateGroupWithOptions(SetDefaultTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetDefaultTemplateGroupResponse());
    }

    public SetDefaultTemplateGroupResponse setDefaultTemplateGroup(SetDefaultTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultTemplateGroupWithOptions(request, runtime);
    }

    public SubmitAIASRJobResponse submitAIASRJobWithOptions(SubmitAIASRJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIASRJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIASRJobResponse());
    }

    public SubmitAIASRJobResponse submitAIASRJob(SubmitAIASRJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIASRJobWithOptions(request, runtime);
    }

    public ListAIASRJobResponse listAIASRJobWithOptions(ListAIASRJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIASRJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIASRJobResponse());
    }

    public ListAIASRJobResponse listAIASRJob(ListAIASRJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIASRJobWithOptions(request, runtime);
    }

    public GetMezzanineInfoResponse getMezzanineInfoWithOptions(GetMezzanineInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMezzanineInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMezzanineInfoResponse());
    }

    public GetMezzanineInfoResponse getMezzanineInfo(GetMezzanineInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMezzanineInfoWithOptions(request, runtime);
    }

    public UpdateTemplateGroupResponse updateTemplateGroupWithOptions(UpdateTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateTemplateGroupResponse());
    }

    public UpdateTemplateGroupResponse updateTemplateGroup(UpdateTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateGroupWithOptions(request, runtime);
    }

    public UpdateCustomTemplateAndGroupResponse updateCustomTemplateAndGroupWithOptions(UpdateCustomTemplateAndGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateCustomTemplateAndGroupResponse());
    }

    public UpdateCustomTemplateAndGroupResponse updateCustomTemplateAndGroup(UpdateCustomTemplateAndGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomTemplateAndGroupWithOptions(request, runtime);
    }

    public UpdateCustomTemplateResponse updateCustomTemplateWithOptions(UpdateCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateCustomTemplateResponse());
    }

    public UpdateCustomTemplateResponse updateCustomTemplate(UpdateCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomTemplateWithOptions(request, runtime);
    }

    public ListTemplateGroupResponse listTemplateGroupWithOptions(ListTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListTemplateGroupResponse());
    }

    public ListTemplateGroupResponse listTemplateGroup(ListTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplateGroupWithOptions(request, runtime);
    }

    public ListCustomTemplateResponse listCustomTemplateWithOptions(ListCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListCustomTemplateResponse());
    }

    public ListCustomTemplateResponse listCustomTemplate(ListCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomTemplateWithOptions(request, runtime);
    }

    public InitSystemTemplateGroupResponse initSystemTemplateGroupWithOptions(InitSystemTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitSystemTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new InitSystemTemplateGroupResponse());
    }

    public InitSystemTemplateGroupResponse initSystemTemplateGroup(InitSystemTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initSystemTemplateGroupWithOptions(request, runtime);
    }

    public InitCustomerWorkFlowResponse initCustomerWorkFlowWithOptions(InitCustomerWorkFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitCustomerWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new InitCustomerWorkFlowResponse());
    }

    public InitCustomerWorkFlowResponse initCustomerWorkFlow(InitCustomerWorkFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initCustomerWorkFlowWithOptions(request, runtime);
    }

    public InitCustomerWithSystemTemplateAndGroupResponse initCustomerWithSystemTemplateAndGroupWithOptions(InitCustomerWithSystemTemplateAndGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitCustomerWithSystemTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new InitCustomerWithSystemTemplateAndGroupResponse());
    }

    public InitCustomerWithSystemTemplateAndGroupResponse initCustomerWithSystemTemplateAndGroup(InitCustomerWithSystemTemplateAndGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initCustomerWithSystemTemplateAndGroupWithOptions(request, runtime);
    }

    public GetTemplateGroupResponse getTemplateGroupWithOptions(GetTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetTemplateGroupResponse());
    }

    public GetTemplateGroupResponse getTemplateGroup(GetTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateGroupWithOptions(request, runtime);
    }

    public GetCustomTemplateResponse getCustomTemplateWithOptions(GetCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCustomTemplateResponse());
    }

    public GetCustomTemplateResponse getCustomTemplate(GetCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomTemplateWithOptions(request, runtime);
    }

    public DeleteTemplateGroupResponse deleteTemplateGroupWithOptions(DeleteTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteTemplateGroupResponse());
    }

    public DeleteTemplateGroupResponse deleteTemplateGroup(DeleteTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateGroupWithOptions(request, runtime);
    }

    public DeleteInitCustomTemplateInfoResponse deleteInitCustomTemplateInfoWithOptions(DeleteInitCustomTemplateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteInitCustomTemplateInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteInitCustomTemplateInfoResponse());
    }

    public DeleteInitCustomTemplateInfoResponse deleteInitCustomTemplateInfo(DeleteInitCustomTemplateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInitCustomTemplateInfoWithOptions(request, runtime);
    }

    public DeleteCustomTemplateAndGroupResponse deleteCustomTemplateAndGroupWithOptions(DeleteCustomTemplateAndGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteCustomTemplateAndGroupResponse());
    }

    public DeleteCustomTemplateAndGroupResponse deleteCustomTemplateAndGroup(DeleteCustomTemplateAndGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomTemplateAndGroupWithOptions(request, runtime);
    }

    public DeleteCustomTemplateResponse deleteCustomTemplateWithOptions(DeleteCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteCustomTemplateResponse());
    }

    public DeleteCustomTemplateResponse deleteCustomTemplate(DeleteCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomTemplateWithOptions(request, runtime);
    }

    public AddTemplateGroupResponse addTemplateGroupWithOptions(AddTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTemplateGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddTemplateGroupResponse());
    }

    public AddTemplateGroupResponse addTemplateGroup(AddTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTemplateGroupWithOptions(request, runtime);
    }

    public AddCustomTemplateAndGroupResponse addCustomTemplateAndGroupWithOptions(AddCustomTemplateAndGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCustomTemplateAndGroup", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddCustomTemplateAndGroupResponse());
    }

    public AddCustomTemplateAndGroupResponse addCustomTemplateAndGroup(AddCustomTemplateAndGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomTemplateAndGroupWithOptions(request, runtime);
    }

    public AddCustomTemplateResponse addCustomTemplateWithOptions(AddCustomTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCustomTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddCustomTemplateResponse());
    }

    public AddCustomTemplateResponse addCustomTemplate(AddCustomTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomTemplateWithOptions(request, runtime);
    }

    public SubmitAIVideoPornRecogJobResponse submitAIVideoPornRecogJobWithOptions(SubmitAIVideoPornRecogJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIVideoPornRecogJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIVideoPornRecogJobResponse());
    }

    public SubmitAIVideoPornRecogJobResponse submitAIVideoPornRecogJob(SubmitAIVideoPornRecogJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIVideoPornRecogJobWithOptions(request, runtime);
    }

    public ListAIVideoPornRecogJobResponse listAIVideoPornRecogJobWithOptions(ListAIVideoPornRecogJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIVideoPornRecogJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIVideoPornRecogJobResponse());
    }

    public ListAIVideoPornRecogJobResponse listAIVideoPornRecogJob(ListAIVideoPornRecogJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIVideoPornRecogJobWithOptions(request, runtime);
    }

    public SubmitAIVideoCoverJobResponse submitAIVideoCoverJobWithOptions(SubmitAIVideoCoverJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIVideoCoverJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SubmitAIVideoCoverJobResponse());
    }

    public SubmitAIVideoCoverJobResponse submitAIVideoCoverJob(SubmitAIVideoCoverJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIVideoCoverJobWithOptions(request, runtime);
    }

    public ListAIVideoCoverJobResponse listAIVideoCoverJobWithOptions(ListAIVideoCoverJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIVideoCoverJob", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAIVideoCoverJobResponse());
    }

    public ListAIVideoCoverJobResponse listAIVideoCoverJob(ListAIVideoCoverJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIVideoCoverJobWithOptions(request, runtime);
    }

    public DeleteAudioTemplateResponse deleteAudioTemplateWithOptions(DeleteAudioTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteAudioTemplateResponse());
    }

    public DeleteAudioTemplateResponse deleteAudioTemplate(DeleteAudioTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAudioTemplateWithOptions(request, runtime);
    }

    public DeleteAudioConfigResponse deleteAudioConfigWithOptions(DeleteAudioConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteAudioConfigResponse());
    }

    public DeleteAudioConfigResponse deleteAudioConfig(DeleteAudioConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAudioConfigWithOptions(request, runtime);
    }

    public AddOriginTemplateResponse addOriginTemplateWithOptions(AddOriginTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddOriginTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddOriginTemplateResponse());
    }

    public AddOriginTemplateResponse addOriginTemplate(AddOriginTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addOriginTemplateWithOptions(request, runtime);
    }

    public UpdateMaterialStatusResponse updateMaterialStatusWithOptions(UpdateMaterialStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMaterialStatus", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateMaterialStatusResponse());
    }

    public UpdateMaterialStatusResponse updateMaterialStatus(UpdateMaterialStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMaterialStatusWithOptions(request, runtime);
    }

    public UpdateMaterialResponse updateMaterialWithOptions(UpdateMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMaterial", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateMaterialResponse());
    }

    public UpdateMaterialResponse updateMaterial(UpdateMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMaterialWithOptions(request, runtime);
    }

    public UpdateEditingProjectStatusResponse updateEditingProjectStatusWithOptions(UpdateEditingProjectStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEditingProjectStatus", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateEditingProjectStatusResponse());
    }

    public UpdateEditingProjectStatusResponse updateEditingProjectStatus(UpdateEditingProjectStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEditingProjectStatusWithOptions(request, runtime);
    }

    public UpdateEditingProjectResponse updateEditingProjectWithOptions(UpdateEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEditingProject", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateEditingProjectResponse());
    }

    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    public SyncMaterialResponse syncMaterialWithOptions(SyncMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SyncMaterial", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SyncMaterialResponse());
    }

    public SyncMaterialResponse syncMaterial(SyncMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncMaterialWithOptions(request, runtime);
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterialsWithOptions(SetEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetEditingProjectMaterials", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetEditingProjectMaterialsResponse());
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterials(SetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEditingProjectMaterialsWithOptions(request, runtime);
    }

    public SearchMaterialResponse searchMaterialWithOptions(SearchMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchMaterial", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SearchMaterialResponse());
    }

    public SearchMaterialResponse searchMaterial(SearchMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMaterialWithOptions(request, runtime);
    }

    public SearchEditingProjectResponse searchEditingProjectWithOptions(SearchEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchEditingProject", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SearchEditingProjectResponse());
    }

    public SearchEditingProjectResponse searchEditingProject(SearchEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    public RefreshUploadMaterialTokenResponse refreshUploadMaterialTokenWithOptions(RefreshUploadMaterialTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshUploadMaterialToken", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new RefreshUploadMaterialTokenResponse());
    }

    public RefreshUploadMaterialTokenResponse refreshUploadMaterialToken(RefreshUploadMaterialTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshUploadMaterialTokenWithOptions(request, runtime);
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideoWithOptions(ProduceEditingProjectVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ProduceEditingProjectVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ProduceEditingProjectVideoResponse());
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideo(ProduceEditingProjectVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.produceEditingProjectVideoWithOptions(request, runtime);
    }

    public GetMaterialListResponse getMaterialListWithOptions(GetMaterialListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMaterialList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMaterialListResponse());
    }

    public GetMaterialListResponse getMaterialList(GetMaterialListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMaterialListWithOptions(request, runtime);
    }

    public GetMaterialResponse getMaterialWithOptions(GetMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMaterial", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMaterialResponse());
    }

    public GetMaterialResponse getMaterial(GetMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMaterialWithOptions(request, runtime);
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEditingProjectMaterials", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetEditingProjectMaterialsResponse());
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    public GetEditingProjectListResponse getEditingProjectListWithOptions(GetEditingProjectListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEditingProjectList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetEditingProjectListResponse());
    }

    public GetEditingProjectListResponse getEditingProjectList(GetEditingProjectListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectListWithOptions(request, runtime);
    }

    public GetEditingProjectResponse getEditingProjectWithOptions(GetEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEditingProject", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetEditingProjectResponse());
    }

    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    public DeleteMaterialResponse deleteMaterialWithOptions(DeleteMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMaterial", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteMaterialResponse());
    }

    public DeleteMaterialResponse deleteMaterial(DeleteMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMaterialWithOptions(request, runtime);
    }

    public DeleteEditingProjectResponse deleteEditingProjectWithOptions(DeleteEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEditingProject", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteEditingProjectResponse());
    }

    public DeleteEditingProjectResponse deleteEditingProject(DeleteEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectWithOptions(request, runtime);
    }

    public CreateUploadMaterialResponse createUploadMaterialWithOptions(CreateUploadMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadMaterial", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateUploadMaterialResponse());
    }

    public CreateUploadMaterialResponse createUploadMaterial(CreateUploadMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadMaterialWithOptions(request, runtime);
    }

    public AddEditingProjectResponse addEditingProjectWithOptions(AddEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddEditingProject", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddEditingProjectResponse());
    }

    public AddEditingProjectResponse addEditingProject(AddEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectWithOptions(request, runtime);
    }

    public GetCategoriesResponse getCategoriesWithOptions(GetCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCategories", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCategoriesResponse());
    }

    public GetCategoriesResponse getCategories(GetCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoriesWithOptions(request, runtime);
    }

    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCategory", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateCategoryResponse());
    }

    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    public GetAudioTemplateResponse getAudioTemplateWithOptions(GetAudioTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetAudioTemplateResponse());
    }

    public GetAudioTemplateResponse getAudioTemplate(GetAudioTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioTemplateWithOptions(request, runtime);
    }

    public ListAudioTemplateResponse listAudioTemplateWithOptions(ListAudioTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAudioTemplateResponse());
    }

    public ListAudioTemplateResponse listAudioTemplate(ListAudioTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAudioTemplateWithOptions(request, runtime);
    }

    public ListAudioConfigResponse listAudioConfigWithOptions(ListAudioConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAudioConfigResponse());
    }

    public ListAudioConfigResponse listAudioConfig(ListAudioConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAudioConfigWithOptions(request, runtime);
    }

    public RefreshMaterialWorkFlowResponse refreshMaterialWorkFlowWithOptions(RefreshMaterialWorkFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshMaterialWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new RefreshMaterialWorkFlowResponse());
    }

    public RefreshMaterialWorkFlowResponse refreshMaterialWorkFlow(RefreshMaterialWorkFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshMaterialWorkFlowWithOptions(request, runtime);
    }

    public UpdateAudioConfigResponse updateAudioConfigWithOptions(UpdateAudioConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateAudioConfigResponse());
    }

    public UpdateAudioConfigResponse updateAudioConfig(UpdateAudioConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAudioConfigWithOptions(request, runtime);
    }

    public UpdateAudioTemplateResponse updateAudioTemplateWithOptions(UpdateAudioTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateAudioTemplateResponse());
    }

    public UpdateAudioTemplateResponse updateAudioTemplate(UpdateAudioTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAudioTemplateWithOptions(request, runtime);
    }

    public AddAudioConfigResponse addAudioConfigWithOptions(AddAudioConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAudioConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddAudioConfigResponse());
    }

    public AddAudioConfigResponse addAudioConfig(AddAudioConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAudioConfigWithOptions(request, runtime);
    }

    public AddAudioTemplateResponse addAudioTemplateWithOptions(AddAudioTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAudioTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddAudioTemplateResponse());
    }

    public AddAudioTemplateResponse addAudioTemplate(AddAudioTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAudioTemplateWithOptions(request, runtime);
    }

    public UpdateSpecifyCustomerTemplateConfigResponse updateSpecifyCustomerTemplateConfigWithOptions(UpdateSpecifyCustomerTemplateConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSpecifyCustomerTemplateConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateSpecifyCustomerTemplateConfigResponse());
    }

    public UpdateSpecifyCustomerTemplateConfigResponse updateSpecifyCustomerTemplateConfig(UpdateSpecifyCustomerTemplateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSpecifyCustomerTemplateConfigWithOptions(request, runtime);
    }

    public GetPlayInfoResponse getPlayInfoWithOptions(GetPlayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetPlayInfoResponse());
    }

    public GetPlayInfoResponse getPlayInfo(GetPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayInfoWithOptions(request, runtime);
    }

    public GetVideoConfigResponse getVideoConfigWithOptions(GetVideoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoConfigResponse());
    }

    public GetVideoConfigResponse getVideoConfig(GetVideoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoConfigWithOptions(request, runtime);
    }

    public SetCustomerConfigResponse setCustomerConfigWithOptions(SetCustomerConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCustomerConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetCustomerConfigResponse());
    }

    public SetCustomerConfigResponse setCustomerConfig(SetCustomerConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCustomerConfigWithOptions(request, runtime);
    }

    public GetCustomerConfigResponse getCustomerConfigWithOptions(GetCustomerConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomerConfig", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCustomerConfigResponse());
    }

    public GetCustomerConfigResponse getCustomerConfig(GetCustomerConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerConfigWithOptions(request, runtime);
    }

    public CreateUploadImageResponse createUploadImageWithOptions(CreateUploadImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadImage", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateUploadImageResponse());
    }

    public CreateUploadImageResponse createUploadImage(CreateUploadImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadImageWithOptions(request, runtime);
    }

    public UpdateSnapshotResponse updateSnapshotWithOptions(UpdateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSnapshot", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateSnapshotResponse());
    }

    public UpdateSnapshotResponse updateSnapshot(UpdateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSnapshotWithOptions(request, runtime);
    }

    public RefreshWorkFlowResponse refreshWorkFlowWithOptions(RefreshWorkFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshWorkFlow", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new RefreshWorkFlowResponse());
    }

    public RefreshWorkFlowResponse refreshWorkFlow(RefreshWorkFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshWorkFlowWithOptions(request, runtime);
    }

    public AddPipelineResponse addPipelineWithOptions(AddPipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddPipeline", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddPipelineResponse());
    }

    public AddPipelineResponse addPipeline(AddPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPipelineWithOptions(request, runtime);
    }

    public GetCheckChannelResponse getCheckChannelWithOptions(GetCheckChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCheckChannel", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCheckChannelResponse());
    }

    public GetCheckChannelResponse getCheckChannel(GetCheckChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCheckChannelWithOptions(request, runtime);
    }

    public SetCheckChannelResponse setCheckChannelWithOptions(SetCheckChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCheckChannel", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetCheckChannelResponse());
    }

    public SetCheckChannelResponse setCheckChannel(SetCheckChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCheckChannelWithOptions(request, runtime);
    }

    public GetPlayStatisResponse getPlayStatisWithOptions(GetPlayStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPlayStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetPlayStatisResponse());
    }

    public GetPlayStatisResponse getPlayStatis(GetPlayStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayStatisWithOptions(request, runtime);
    }

    public GetMTSStatisResponse getMTSStatisWithOptions(GetMTSStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMTSStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMTSStatisResponse());
    }

    public GetMTSStatisResponse getMTSStatis(GetMTSStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMTSStatisWithOptions(request, runtime);
    }

    public ListDomainRefererResponse listDomainRefererWithOptions(ListDomainRefererRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDomainReferer", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListDomainRefererResponse());
    }

    public ListDomainRefererResponse listDomainReferer(ListDomainRefererRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainRefererWithOptions(request, runtime);
    }

    public SetMessageCallbackResponse setMessageCallbackWithOptions(SetMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetMessageCallback", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetMessageCallbackResponse());
    }

    public SetMessageCallbackResponse setMessageCallback(SetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMessageCallbackWithOptions(request, runtime);
    }

    public GetMessageCallbackResponse getMessageCallbackWithOptions(GetMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMessageCallback", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMessageCallbackResponse());
    }

    public GetMessageCallbackResponse getMessageCallback(GetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageCallbackWithOptions(request, runtime);
    }

    public GetVideoPlayInfoForCloudResponse getVideoPlayInfoForCloudWithOptions(GetVideoPlayInfoForCloudRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoPlayInfoForCloud", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoPlayInfoForCloudResponse());
    }

    public GetVideoPlayInfoForCloudResponse getVideoPlayInfoForCloud(GetVideoPlayInfoForCloudRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoPlayInfoForCloudWithOptions(request, runtime);
    }

    public GetVideoPlayAuthResponse getVideoPlayAuthWithOptions(GetVideoPlayAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoPlayAuth", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoPlayAuthResponse());
    }

    public GetVideoPlayAuthResponse getVideoPlayAuth(GetVideoPlayAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoPlayAuthWithOptions(request, runtime);
    }

    public GetMidYKVidResponse getMidYKVidWithOptions(GetMidYKVidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMidYKVidResponse());
    }

    public GetMidYKVidResponse getMidYKVid(GetMidYKVidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMidYKVidWithOptions(request, runtime);
    }

    public DeleteMidYKVidResponse deleteMidYKVidWithOptions(DeleteMidYKVidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteMidYKVidResponse());
    }

    public DeleteMidYKVidResponse deleteMidYKVid(DeleteMidYKVidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMidYKVidWithOptions(request, runtime);
    }

    public AddMidYKVidResponse addMidYKVidWithOptions(AddMidYKVidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddMidYKVid", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddMidYKVidResponse());
    }

    public AddMidYKVidResponse addMidYKVid(AddMidYKVidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMidYKVidWithOptions(request, runtime);
    }

    public UpdateVideoStatusResponse updateVideoStatusWithOptions(UpdateVideoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVideoStatus", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateVideoStatusResponse());
    }

    public UpdateVideoStatusResponse updateVideoStatus(UpdateVideoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoStatusWithOptions(request, runtime);
    }

    public UpdateVideoInfoResponse updateVideoInfoWithOptions(UpdateVideoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVideoInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateVideoInfoResponse());
    }

    public UpdateVideoInfoResponse updateVideoInfo(UpdateVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfoWithOptions(request, runtime);
    }

    public SearchVideoResponse searchVideoWithOptions(SearchVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SearchVideoResponse());
    }

    public SearchVideoResponse searchVideo(SearchVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchVideoWithOptions(request, runtime);
    }

    public RefreshUploadVideoResponse refreshUploadVideoWithOptions(RefreshUploadVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshUploadVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new RefreshUploadVideoResponse());
    }

    public RefreshUploadVideoResponse refreshUploadVideo(RefreshUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshUploadVideoWithOptions(request, runtime);
    }

    public GetVideoListResponse getVideoListWithOptions(GetVideoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoListResponse());
    }

    public GetVideoListResponse getVideoList(GetVideoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoListWithOptions(request, runtime);
    }

    public GetVideoInfoResponse getVideoInfoWithOptions(GetVideoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoInfoResponse());
    }

    public GetVideoInfoResponse getVideoInfo(GetVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfoWithOptions(request, runtime);
    }

    public GetCategoryTreeResponse getCategoryTreeWithOptions(GetCategoryTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCategoryTree", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCategoryTreeResponse());
    }

    public GetCategoryTreeResponse getCategoryTree(GetCategoryTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoryTreeWithOptions(request, runtime);
    }

    public GetCategoryListResponse getCategoryListWithOptions(GetCategoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCategoryList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCategoryListResponse());
    }

    public GetCategoryListResponse getCategoryList(GetCategoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoryListWithOptions(request, runtime);
    }

    public DeleteVideoTagResponse deleteVideoTagWithOptions(DeleteVideoTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVideoTag", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteVideoTagResponse());
    }

    public DeleteVideoTagResponse deleteVideoTag(DeleteVideoTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoTagWithOptions(request, runtime);
    }

    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteVideoResponse());
    }

    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    public CreateUploadVideoResponse createUploadVideoWithOptions(CreateUploadVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateUploadVideoResponse());
    }

    public CreateUploadVideoResponse createUploadVideo(CreateUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadVideoWithOptions(request, runtime);
    }

    public CheckVideoResponse checkVideoWithOptions(CheckVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckVideo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CheckVideoResponse());
    }

    public CheckVideoResponse checkVideo(CheckVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkVideoWithOptions(request, runtime);
    }

    public AddVideoTagResponse addVideoTagWithOptions(AddVideoTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddVideoTag", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddVideoTagResponse());
    }

    public AddVideoTagResponse addVideoTag(AddVideoTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVideoTagWithOptions(request, runtime);
    }

    public AddApiAuthResponse addApiAuthWithOptions(AddApiAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddApiAuth", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddApiAuthResponse());
    }

    public AddApiAuthResponse addApiAuth(AddApiAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addApiAuthWithOptions(request, runtime);
    }

    public GetPlayChannelKeyResponse getPlayChannelKeyWithOptions(GetPlayChannelKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPlayChannelKey", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetPlayChannelKeyResponse());
    }

    public GetPlayChannelKeyResponse getPlayChannelKey(GetPlayChannelKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayChannelKeyWithOptions(request, runtime);
    }

    public GetDomainListResponse getDomainListWithOptions(GetDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDomainList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetDomainListResponse());
    }

    public GetDomainListResponse getDomainList(GetDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainListWithOptions(request, runtime);
    }

    public GetServiceStatusResponse getServiceStatusWithOptions(GetServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceStatus", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetServiceStatusResponse());
    }

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceStatusWithOptions(request, runtime);
    }

    public NotifyProduceResponse notifyProduceWithOptions(NotifyProduceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("NotifyProduce", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new NotifyProduceResponse());
    }

    public NotifyProduceResponse notifyProduce(NotifyProduceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.notifyProduceWithOptions(request, runtime);
    }

    public NotifyInitResourceResponse notifyInitResourceWithOptions(NotifyInitResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("NotifyInitResource", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new NotifyInitResourceResponse());
    }

    public NotifyInitResourceResponse notifyInitResource(NotifyInitResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.notifyInitResourceWithOptions(request, runtime);
    }

    public GetPlayChannelListResponse getPlayChannelListWithOptions(GetPlayChannelListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPlayChannelList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetPlayChannelListResponse());
    }

    public GetPlayChannelListResponse getPlayChannelList(GetPlayChannelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayChannelListWithOptions(request, runtime);
    }

    public UpdateApiAuthResponse updateApiAuthWithOptions(UpdateApiAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateApiAuth", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateApiAuthResponse());
    }

    public UpdateApiAuthResponse updateApiAuth(UpdateApiAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApiAuthWithOptions(request, runtime);
    }

    public UserExistResponse userExistWithOptions(UserExistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UserExist", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UserExistResponse());
    }

    public UserExistResponse userExist(UserExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.userExistWithOptions(request, runtime);
    }

    public AddMediaInfoResponse addMediaInfoWithOptions(AddMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddMediaInfoResponse());
    }

    public AddMediaInfoResponse addMediaInfo(AddMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMediaInfoWithOptions(request, runtime);
    }

    public AddCategoryResponse addCategoryWithOptions(AddCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCategory", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddCategoryResponse());
    }

    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCategory", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteCategoryResponse());
    }

    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    public UpdateMediaInfoStatusResponse updateMediaInfoStatusWithOptions(UpdateMediaInfoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMediaInfoStatus", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateMediaInfoStatusResponse());
    }

    public UpdateMediaInfoStatusResponse updateMediaInfoStatus(UpdateMediaInfoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaInfoStatusWithOptions(request, runtime);
    }

    public CategoryTreeResponse categoryTreeWithOptions(CategoryTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CategoryTree", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new CategoryTreeResponse());
    }

    public CategoryTreeResponse categoryTree(CategoryTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.categoryTreeWithOptions(request, runtime);
    }

    public AddMediaTagResponse addMediaTagWithOptions(AddMediaTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddMediaTag", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddMediaTagResponse());
    }

    public AddMediaTagResponse addMediaTag(AddMediaTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMediaTagWithOptions(request, runtime);
    }

    public GetCDNStatisSumResponse getCDNStatisSumWithOptions(GetCDNStatisSumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCDNStatisSum", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCDNStatisSumResponse());
    }

    public GetCDNStatisSumResponse getCDNStatisSum(GetCDNStatisSumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCDNStatisSumWithOptions(request, runtime);
    }

    public GetCDNStatisResponse getCDNStatisWithOptions(GetCDNStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCDNStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCDNStatisResponse());
    }

    public GetCDNStatisResponse getCDNStatis(GetCDNStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCDNStatisWithOptions(request, runtime);
    }

    public DeleteMediaTagResponse deleteMediaTagWithOptions(DeleteMediaTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMediaTag", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteMediaTagResponse());
    }

    public DeleteMediaTagResponse deleteMediaTag(DeleteMediaTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaTagWithOptions(request, runtime);
    }

    public DeleteMediaInfoResponse deleteMediaInfoWithOptions(DeleteMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteMediaInfoResponse());
    }

    public DeleteMediaInfoResponse deleteMediaInfo(DeleteMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaInfoWithOptions(request, runtime);
    }

    public GetOSSStatisResponse getOSSStatisWithOptions(GetOSSStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOSSStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetOSSStatisResponse());
    }

    public GetOSSStatisResponse getOSSStatis(GetOSSStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSStatisWithOptions(request, runtime);
    }

    public GetVideoPlayInfoResponse getVideoPlayInfoWithOptions(GetVideoPlayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoPlayInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetVideoPlayInfoResponse());
    }

    public GetVideoPlayInfoResponse getVideoPlayInfo(GetVideoPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoPlayInfoWithOptions(request, runtime);
    }

    public GetMediaInfoListResponse getMediaInfoListWithOptions(GetMediaInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaInfoList", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMediaInfoListResponse());
    }

    public GetMediaInfoListResponse getMediaInfoList(GetMediaInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaInfoListWithOptions(request, runtime);
    }

    public GetMediaInfoResponse getMediaInfoWithOptions(GetMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetMediaInfoResponse());
    }

    public GetMediaInfoResponse getMediaInfo(GetMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaInfoWithOptions(request, runtime);
    }

    public SearchMediaInfoResponse searchMediaInfoWithOptions(SearchMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SearchMediaInfoResponse());
    }

    public SearchMediaInfoResponse searchMediaInfo(SearchMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaInfoWithOptions(request, runtime);
    }

    public RefreshUploadTokenResponse refreshUploadTokenWithOptions(RefreshUploadTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshUploadToken", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new RefreshUploadTokenResponse());
    }

    public RefreshUploadTokenResponse refreshUploadToken(RefreshUploadTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshUploadTokenWithOptions(request, runtime);
    }

    public ListAllCategoryResponse listAllCategoryWithOptions(ListAllCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAllCategory", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new ListAllCategoryResponse());
    }

    public ListAllCategoryResponse listAllCategory(ListAllCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllCategoryWithOptions(request, runtime);
    }

    public GetTotalStatisResponse getTotalStatisWithOptions(GetTotalStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTotalStatis", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetTotalStatisResponse());
    }

    public GetTotalStatisResponse getTotalStatis(GetTotalStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTotalStatisWithOptions(request, runtime);
    }

    public UpdateMediaInfoResponse updateMediaInfoWithOptions(UpdateMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMediaInfo", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateMediaInfoResponse());
    }

    public UpdateMediaInfoResponse updateMediaInfo(UpdateMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaInfoWithOptions(request, runtime);
    }

    public UpdateMediaCategoryResponse updateMediaCategoryWithOptions(UpdateMediaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMediaCategory", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateMediaCategoryResponse());
    }

    public UpdateMediaCategoryResponse updateMediaCategory(UpdateMediaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaCategoryWithOptions(request, runtime);
    }

    public UpdateCategoryNameResponse updateCategoryNameWithOptions(UpdateCategoryNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCategoryName", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateCategoryNameResponse());
    }

    public UpdateCategoryNameResponse updateCategoryName(UpdateCategoryNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryNameWithOptions(request, runtime);
    }

    public AddWatermarkResponse addWatermarkWithOptions(AddWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddWatermark", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddWatermarkResponse());
    }

    public AddWatermarkResponse addWatermark(AddWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatermarkWithOptions(request, runtime);
    }

    public AddTranscodeTemplateResponse addTranscodeTemplateWithOptions(AddTranscodeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTranscodeTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddTranscodeTemplateResponse());
    }

    public AddTranscodeTemplateResponse addTranscodeTemplate(AddTranscodeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTranscodeTemplateWithOptions(request, runtime);
    }

    public AddSnapshotResponse addSnapshotWithOptions(AddSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddSnapshot", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new AddSnapshotResponse());
    }

    public AddSnapshotResponse addSnapshot(AddSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSnapshotWithOptions(request, runtime);
    }

    public GetCustomerTranscodeConfResponse getCustomerTranscodeConfWithOptions(GetCustomerTranscodeConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomerTranscodeConf", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCustomerTranscodeConfResponse());
    }

    public GetCustomerTranscodeConfResponse getCustomerTranscodeConf(GetCustomerTranscodeConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerTranscodeConfWithOptions(request, runtime);
    }

    public DeleteWatermarkResponse deleteWatermarkWithOptions(DeleteWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteWatermark", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteWatermarkResponse());
    }

    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkWithOptions(request, runtime);
    }

    public GetWatermarkResponse getWatermarkWithOptions(GetWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWatermark", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetWatermarkResponse());
    }

    public GetWatermarkResponse getWatermark(GetWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkWithOptions(request, runtime);
    }

    public GetWatermarksResponse getWatermarksWithOptions(GetWatermarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWatermarks", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetWatermarksResponse());
    }

    public GetWatermarksResponse getWatermarks(GetWatermarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarksWithOptions(request, runtime);
    }

    public SwitchWatermarkResponse switchWatermarkWithOptions(SwitchWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SwitchWatermark", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SwitchWatermarkResponse());
    }

    public SwitchWatermarkResponse switchWatermark(SwitchWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchWatermarkWithOptions(request, runtime);
    }

    public GetWatermarkSwitchResponse getWatermarkSwitchWithOptions(GetWatermarkSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWatermarkSwitch", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new GetWatermarkSwitchResponse());
    }

    public GetWatermarkSwitchResponse getWatermarkSwitch(GetWatermarkSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkSwitchWithOptions(request, runtime);
    }

    public SetDefaultWatermarkResponse setDefaultWatermarkWithOptions(SetDefaultWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultWatermark", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new SetDefaultWatermarkResponse());
    }

    public SetDefaultWatermarkResponse setDefaultWatermark(SetDefaultWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultWatermarkWithOptions(request, runtime);
    }

    public UpdateTranscodeTemplateResponse updateTranscodeTemplateWithOptions(UpdateTranscodeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTranscodeTemplate", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateTranscodeTemplateResponse());
    }

    public UpdateTranscodeTemplateResponse updateTranscodeTemplate(UpdateTranscodeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTranscodeTemplateWithOptions(request, runtime);
    }

    public UpdateTranscodeConfResponse updateTranscodeConfWithOptions(UpdateTranscodeConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTranscodeConf", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateTranscodeConfResponse());
    }

    public UpdateTranscodeConfResponse updateTranscodeConf(UpdateTranscodeConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTranscodeConfWithOptions(request, runtime);
    }

    public UpdateWatermarkResponse updateWatermarkWithOptions(UpdateWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateWatermark", "HTTPS", "POST", "2017-03-14", "AK", TeaModel.buildMap(request), null, runtime), new UpdateWatermarkResponse());
    }

    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatermarkWithOptions(request, runtime);
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
