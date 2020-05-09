// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AlibabaCloud.SDK.BssOpenApi20171214.Models;

namespace AlibabaCloud.SDK.BssOpenApi20171214
{
    public class Client : AlibabaCloud.RPCClient.Client
    {

        public Client(AlibabaCloud.RPCClient.Models.Config config): base(config)
        {
            this._endpointRule = "regional";
            this._endpointMap = new Dictionary<string, string>
            {
                {"ap-northeast-1", "business.ap-southeast-1.aliyuncs.com"},
                {"ap-northeast-2-pop", "business.ap-southeast-1.aliyuncs.com"},
                {"ap-south-1", "business.ap-southeast-1.aliyuncs.com"},
                {"ap-southeast-1", "business.ap-southeast-1.aliyuncs.com"},
                {"ap-southeast-2", "business.ap-southeast-1.aliyuncs.com"},
                {"ap-southeast-3", "business.ap-southeast-1.aliyuncs.com"},
                {"ap-southeast-5", "business.ap-southeast-1.aliyuncs.com"},
                {"cn-beijing", "business.aliyuncs.com"},
                {"cn-beijing-finance-1", "business.aliyuncs.com"},
                {"cn-beijing-finance-pop", "business.aliyuncs.com"},
                {"cn-beijing-gov-1", "business.aliyuncs.com"},
                {"cn-beijing-nu16-b01", "business.aliyuncs.com"},
                {"cn-chengdu", "business.aliyuncs.com"},
                {"cn-edge-1", "business.aliyuncs.com"},
                {"cn-fujian", "business.aliyuncs.com"},
                {"cn-haidian-cm12-c01", "business.aliyuncs.com"},
                {"cn-hangzhou", "business.aliyuncs.com"},
                {"cn-hangzhou-bj-b01", "business.aliyuncs.com"},
                {"cn-hangzhou-finance", "business.aliyuncs.com"},
                {"cn-hangzhou-internal-prod-1", "business.aliyuncs.com"},
                {"cn-hangzhou-internal-test-1", "business.aliyuncs.com"},
                {"cn-hangzhou-internal-test-2", "business.aliyuncs.com"},
                {"cn-hangzhou-internal-test-3", "business.aliyuncs.com"},
                {"cn-hangzhou-test-306", "business.aliyuncs.com"},
                {"cn-hongkong", "business.aliyuncs.com"},
                {"cn-hongkong-finance-pop", "business.aliyuncs.com"},
                {"cn-huhehaote", "business.aliyuncs.com"},
                {"cn-north-2-gov-1", "business.aliyuncs.com"},
                {"cn-qingdao", "business.aliyuncs.com"},
                {"cn-qingdao-nebula", "business.aliyuncs.com"},
                {"cn-shanghai", "business.aliyuncs.com"},
                {"cn-shanghai-et15-b01", "business.aliyuncs.com"},
                {"cn-shanghai-et2-b01", "business.aliyuncs.com"},
                {"cn-shanghai-finance-1", "business.aliyuncs.com"},
                {"cn-shanghai-inner", "business.aliyuncs.com"},
                {"cn-shanghai-internal-test-1", "business.aliyuncs.com"},
                {"cn-shenzhen", "business.aliyuncs.com"},
                {"cn-shenzhen-finance-1", "business.aliyuncs.com"},
                {"cn-shenzhen-inner", "business.aliyuncs.com"},
                {"cn-shenzhen-st4-d01", "business.aliyuncs.com"},
                {"cn-shenzhen-su18-b01", "business.aliyuncs.com"},
                {"cn-wuhan", "business.aliyuncs.com"},
                {"cn-yushanfang", "business.aliyuncs.com"},
                {"cn-zhangbei-na61-b01", "business.aliyuncs.com"},
                {"cn-zhangjiakou", "business.aliyuncs.com"},
                {"cn-zhangjiakou-na62-a01", "business.aliyuncs.com"},
                {"cn-zhengzhou-nebula-1", "business.aliyuncs.com"},
                {"eu-central-1", "business.ap-southeast-1.aliyuncs.com"},
                {"eu-west-1", "business.ap-southeast-1.aliyuncs.com"},
                {"eu-west-1-oxs", "business.ap-southeast-1.aliyuncs.com"},
                {"me-east-1", "business.ap-southeast-1.aliyuncs.com"},
                {"rus-west-1-pop", "business.ap-southeast-1.aliyuncs.com"},
                {"us-east-1", "business.ap-southeast-1.aliyuncs.com"},
                {"us-west-1", "business.ap-southeast-1.aliyuncs.com"},
            };
            CheckConfig(config);
            this._endpoint = GetEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
        }


        public QueryRIUtilizationDetailResponse QueryRIUtilizationDetailEx(QueryRIUtilizationDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRIUtilizationDetailResponse>(DoRequest("QueryRIUtilizationDetail", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryRIUtilizationDetailResponse> QueryRIUtilizationDetailExAsync(QueryRIUtilizationDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRIUtilizationDetailResponse>(await DoRequestAsync("QueryRIUtilizationDetail", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryRIUtilizationDetailResponse QueryRIUtilizationDetail(QueryRIUtilizationDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryRIUtilizationDetailEx(request, runtime);
        }

        public async Task<QueryRIUtilizationDetailResponse> QueryRIUtilizationDetailAsync(QueryRIUtilizationDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryRIUtilizationDetailExAsync(request, runtime);
        }

        public QueryBillToOSSSubscriptionResponse QueryBillToOSSSubscriptionEx(QueryBillToOSSSubscriptionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillToOSSSubscriptionResponse>(DoRequest("QueryBillToOSSSubscription", "HTTPS", "POST", "2017-12-14", "AK", null, request.ToMap(), runtime));
        }

        public async Task<QueryBillToOSSSubscriptionResponse> QueryBillToOSSSubscriptionExAsync(QueryBillToOSSSubscriptionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillToOSSSubscriptionResponse>(await DoRequestAsync("QueryBillToOSSSubscription", "HTTPS", "POST", "2017-12-14", "AK", null, request.ToMap(), runtime));
        }

        public QueryBillToOSSSubscriptionResponse QueryBillToOSSSubscription(QueryBillToOSSSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryBillToOSSSubscriptionEx(request, runtime);
        }

        public async Task<QueryBillToOSSSubscriptionResponse> QueryBillToOSSSubscriptionAsync(QueryBillToOSSSubscriptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryBillToOSSSubscriptionExAsync(request, runtime);
        }

        public QueryAccountBillResponse QueryAccountBillEx(QueryAccountBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAccountBillResponse>(DoRequest("QueryAccountBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryAccountBillResponse> QueryAccountBillExAsync(QueryAccountBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAccountBillResponse>(await DoRequestAsync("QueryAccountBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryAccountBillResponse QueryAccountBill(QueryAccountBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryAccountBillEx(request, runtime);
        }

        public async Task<QueryAccountBillResponse> QueryAccountBillAsync(QueryAccountBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryAccountBillExAsync(request, runtime);
        }

        public CreateCostUnitResponse CreateCostUnitEx(CreateCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCostUnitResponse>(DoRequest("CreateCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateCostUnitResponse> CreateCostUnitExAsync(CreateCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCostUnitResponse>(await DoRequestAsync("CreateCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateCostUnitResponse CreateCostUnit(CreateCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateCostUnitEx(request, runtime);
        }

        public async Task<CreateCostUnitResponse> CreateCostUnitAsync(CreateCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateCostUnitExAsync(request, runtime);
        }

        public ModifyCostUnitResponse ModifyCostUnitEx(ModifyCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifyCostUnitResponse>(DoRequest("ModifyCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ModifyCostUnitResponse> ModifyCostUnitExAsync(ModifyCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifyCostUnitResponse>(await DoRequestAsync("ModifyCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public ModifyCostUnitResponse ModifyCostUnit(ModifyCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ModifyCostUnitEx(request, runtime);
        }

        public async Task<ModifyCostUnitResponse> ModifyCostUnitAsync(ModifyCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ModifyCostUnitExAsync(request, runtime);
        }

        public QueryCostUnitResponse QueryCostUnitEx(QueryCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCostUnitResponse>(DoRequest("QueryCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryCostUnitResponse> QueryCostUnitExAsync(QueryCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCostUnitResponse>(await DoRequestAsync("QueryCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryCostUnitResponse QueryCostUnit(QueryCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryCostUnitEx(request, runtime);
        }

        public async Task<QueryCostUnitResponse> QueryCostUnitAsync(QueryCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryCostUnitExAsync(request, runtime);
        }

        public DeleteCostUnitResponse DeleteCostUnitEx(DeleteCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCostUnitResponse>(DoRequest("DeleteCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DeleteCostUnitResponse> DeleteCostUnitExAsync(DeleteCostUnitRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCostUnitResponse>(await DoRequestAsync("DeleteCostUnit", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public DeleteCostUnitResponse DeleteCostUnit(DeleteCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DeleteCostUnitEx(request, runtime);
        }

        public async Task<DeleteCostUnitResponse> DeleteCostUnitAsync(DeleteCostUnitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DeleteCostUnitExAsync(request, runtime);
        }

        public AllocateCostUnitResourceResponse AllocateCostUnitResourceEx(AllocateCostUnitResourceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllocateCostUnitResourceResponse>(DoRequest("AllocateCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<AllocateCostUnitResourceResponse> AllocateCostUnitResourceExAsync(AllocateCostUnitResourceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllocateCostUnitResourceResponse>(await DoRequestAsync("AllocateCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public AllocateCostUnitResourceResponse AllocateCostUnitResource(AllocateCostUnitResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AllocateCostUnitResourceEx(request, runtime);
        }

        public async Task<AllocateCostUnitResourceResponse> AllocateCostUnitResourceAsync(AllocateCostUnitResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AllocateCostUnitResourceExAsync(request, runtime);
        }

        public QueryCostUnitResourceResponse QueryCostUnitResourceEx(QueryCostUnitResourceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCostUnitResourceResponse>(DoRequest("QueryCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryCostUnitResourceResponse> QueryCostUnitResourceExAsync(QueryCostUnitResourceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCostUnitResourceResponse>(await DoRequestAsync("QueryCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryCostUnitResourceResponse QueryCostUnitResource(QueryCostUnitResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryCostUnitResourceEx(request, runtime);
        }

        public async Task<QueryCostUnitResourceResponse> QueryCostUnitResourceAsync(QueryCostUnitResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryCostUnitResourceExAsync(request, runtime);
        }

        public RenewResourcePackageResponse RenewResourcePackageEx(RenewResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenewResourcePackageResponse>(DoRequest("RenewResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RenewResourcePackageResponse> RenewResourcePackageExAsync(RenewResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenewResourcePackageResponse>(await DoRequestAsync("RenewResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public RenewResourcePackageResponse RenewResourcePackage(RenewResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RenewResourcePackageEx(request, runtime);
        }

        public async Task<RenewResourcePackageResponse> RenewResourcePackageAsync(RenewResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RenewResourcePackageExAsync(request, runtime);
        }

        public UpgradeResourcePackageResponse UpgradeResourcePackageEx(UpgradeResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpgradeResourcePackageResponse>(DoRequest("UpgradeResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UpgradeResourcePackageResponse> UpgradeResourcePackageExAsync(UpgradeResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpgradeResourcePackageResponse>(await DoRequestAsync("UpgradeResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public UpgradeResourcePackageResponse UpgradeResourcePackage(UpgradeResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UpgradeResourcePackageEx(request, runtime);
        }

        public async Task<UpgradeResourcePackageResponse> UpgradeResourcePackageAsync(UpgradeResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UpgradeResourcePackageExAsync(request, runtime);
        }

        public CreateAgAccountResponse CreateAgAccountEx(CreateAgAccountRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAgAccountResponse>(DoRequest("CreateAgAccount", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateAgAccountResponse> CreateAgAccountExAsync(CreateAgAccountRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAgAccountResponse>(await DoRequestAsync("CreateAgAccount", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateAgAccountResponse CreateAgAccount(CreateAgAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateAgAccountEx(request, runtime);
        }

        public async Task<CreateAgAccountResponse> CreateAgAccountAsync(CreateAgAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateAgAccountExAsync(request, runtime);
        }

        public GetCustomerAccountInfoResponse GetCustomerAccountInfoEx(GetCustomerAccountInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerAccountInfoResponse>(DoRequest("GetCustomerAccountInfo", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetCustomerAccountInfoResponse> GetCustomerAccountInfoExAsync(GetCustomerAccountInfoRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerAccountInfoResponse>(await DoRequestAsync("GetCustomerAccountInfo", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public GetCustomerAccountInfoResponse GetCustomerAccountInfo(GetCustomerAccountInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCustomerAccountInfoEx(request, runtime);
        }

        public async Task<GetCustomerAccountInfoResponse> GetCustomerAccountInfoAsync(GetCustomerAccountInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCustomerAccountInfoExAsync(request, runtime);
        }

        public GetCustomerListResponse GetCustomerListEx(GetCustomerListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerListResponse>(DoRequest("GetCustomerList", "HTTPS", "POST", "2017-12-14", "AK", null, request.ToMap(), runtime));
        }

        public async Task<GetCustomerListResponse> GetCustomerListExAsync(GetCustomerListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerListResponse>(await DoRequestAsync("GetCustomerList", "HTTPS", "POST", "2017-12-14", "AK", null, request.ToMap(), runtime));
        }

        public GetCustomerListResponse GetCustomerList(GetCustomerListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetCustomerListEx(request, runtime);
        }

        public async Task<GetCustomerListResponse> GetCustomerListAsync(GetCustomerListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetCustomerListExAsync(request, runtime);
        }

        public ChangeResellerConsumeAmountResponse ChangeResellerConsumeAmountEx(ChangeResellerConsumeAmountRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChangeResellerConsumeAmountResponse>(DoRequest("ChangeResellerConsumeAmount", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ChangeResellerConsumeAmountResponse> ChangeResellerConsumeAmountExAsync(ChangeResellerConsumeAmountRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChangeResellerConsumeAmountResponse>(await DoRequestAsync("ChangeResellerConsumeAmount", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public ChangeResellerConsumeAmountResponse ChangeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ChangeResellerConsumeAmountEx(request, runtime);
        }

        public async Task<ChangeResellerConsumeAmountResponse> ChangeResellerConsumeAmountAsync(ChangeResellerConsumeAmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ChangeResellerConsumeAmountExAsync(request, runtime);
        }

        public SetResellerUserStatusResponse SetResellerUserStatusEx(SetResellerUserStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResellerUserStatusResponse>(DoRequest("SetResellerUserStatus", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetResellerUserStatusResponse> SetResellerUserStatusExAsync(SetResellerUserStatusRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResellerUserStatusResponse>(await DoRequestAsync("SetResellerUserStatus", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public SetResellerUserStatusResponse SetResellerUserStatus(SetResellerUserStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetResellerUserStatusEx(request, runtime);
        }

        public async Task<SetResellerUserStatusResponse> SetResellerUserStatusAsync(SetResellerUserStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetResellerUserStatusExAsync(request, runtime);
        }

        public CreateResellerUserQuotaResponse CreateResellerUserQuotaEx(CreateResellerUserQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResellerUserQuotaResponse>(DoRequest("CreateResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateResellerUserQuotaResponse> CreateResellerUserQuotaExAsync(CreateResellerUserQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResellerUserQuotaResponse>(await DoRequestAsync("CreateResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateResellerUserQuotaResponse CreateResellerUserQuota(CreateResellerUserQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateResellerUserQuotaEx(request, runtime);
        }

        public async Task<CreateResellerUserQuotaResponse> CreateResellerUserQuotaAsync(CreateResellerUserQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateResellerUserQuotaExAsync(request, runtime);
        }

        public SetResellerUserQuotaResponse SetResellerUserQuotaEx(SetResellerUserQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResellerUserQuotaResponse>(DoRequest("SetResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetResellerUserQuotaResponse> SetResellerUserQuotaExAsync(SetResellerUserQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResellerUserQuotaResponse>(await DoRequestAsync("SetResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public SetResellerUserQuotaResponse SetResellerUserQuota(SetResellerUserQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetResellerUserQuotaEx(request, runtime);
        }

        public async Task<SetResellerUserQuotaResponse> SetResellerUserQuotaAsync(SetResellerUserQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetResellerUserQuotaExAsync(request, runtime);
        }

        public QueryResellerAvailableQuotaResponse QueryResellerAvailableQuotaEx(QueryResellerAvailableQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResellerAvailableQuotaResponse>(DoRequest("QueryResellerAvailableQuota", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryResellerAvailableQuotaResponse> QueryResellerAvailableQuotaExAsync(QueryResellerAvailableQuotaRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResellerAvailableQuotaResponse>(await DoRequestAsync("QueryResellerAvailableQuota", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryResellerAvailableQuotaResponse QueryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryResellerAvailableQuotaEx(request, runtime);
        }

        public async Task<QueryResellerAvailableQuotaResponse> QueryResellerAvailableQuotaAsync(QueryResellerAvailableQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryResellerAvailableQuotaExAsync(request, runtime);
        }

        public SetResellerUserAlarmThresholdResponse SetResellerUserAlarmThresholdEx(SetResellerUserAlarmThresholdRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResellerUserAlarmThresholdResponse>(DoRequest("SetResellerUserAlarmThreshold", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetResellerUserAlarmThresholdResponse> SetResellerUserAlarmThresholdExAsync(SetResellerUserAlarmThresholdRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetResellerUserAlarmThresholdResponse>(await DoRequestAsync("SetResellerUserAlarmThreshold", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public SetResellerUserAlarmThresholdResponse SetResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetResellerUserAlarmThresholdEx(request, runtime);
        }

        public async Task<SetResellerUserAlarmThresholdResponse> SetResellerUserAlarmThresholdAsync(SetResellerUserAlarmThresholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetResellerUserAlarmThresholdExAsync(request, runtime);
        }

        public QueryAccountTransactionsResponse QueryAccountTransactionsEx(QueryAccountTransactionsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAccountTransactionsResponse>(DoRequest("QueryAccountTransactions", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryAccountTransactionsResponse> QueryAccountTransactionsExAsync(QueryAccountTransactionsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAccountTransactionsResponse>(await DoRequestAsync("QueryAccountTransactions", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryAccountTransactionsResponse QueryAccountTransactions(QueryAccountTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryAccountTransactionsEx(request, runtime);
        }

        public async Task<QueryAccountTransactionsResponse> QueryAccountTransactionsAsync(QueryAccountTransactionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryAccountTransactionsExAsync(request, runtime);
        }

        public UnsubscribeBillToOSSResponse UnsubscribeBillToOSSEx(UnsubscribeBillToOSSRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnsubscribeBillToOSSResponse>(DoRequest("UnsubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<UnsubscribeBillToOSSResponse> UnsubscribeBillToOSSExAsync(UnsubscribeBillToOSSRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnsubscribeBillToOSSResponse>(await DoRequestAsync("UnsubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public UnsubscribeBillToOSSResponse UnsubscribeBillToOSS(UnsubscribeBillToOSSRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return UnsubscribeBillToOSSEx(request, runtime);
        }

        public async Task<UnsubscribeBillToOSSResponse> UnsubscribeBillToOSSAsync(UnsubscribeBillToOSSRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await UnsubscribeBillToOSSExAsync(request, runtime);
        }

        public SubscribeBillToOSSResponse SubscribeBillToOSSEx(SubscribeBillToOSSRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubscribeBillToOSSResponse>(DoRequest("SubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SubscribeBillToOSSResponse> SubscribeBillToOSSExAsync(SubscribeBillToOSSRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubscribeBillToOSSResponse>(await DoRequestAsync("SubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public SubscribeBillToOSSResponse SubscribeBillToOSS(SubscribeBillToOSSRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SubscribeBillToOSSEx(request, runtime);
        }

        public async Task<SubscribeBillToOSSResponse> SubscribeBillToOSSAsync(SubscribeBillToOSSRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SubscribeBillToOSSExAsync(request, runtime);
        }

        public QueryUserOmsDataResponse QueryUserOmsDataEx(QueryUserOmsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserOmsDataResponse>(DoRequest("QueryUserOmsData", "HTTPS", "GET", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryUserOmsDataResponse> QueryUserOmsDataExAsync(QueryUserOmsDataRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserOmsDataResponse>(await DoRequestAsync("QueryUserOmsData", "HTTPS", "GET", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryUserOmsDataResponse QueryUserOmsData(QueryUserOmsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryUserOmsDataEx(request, runtime);
        }

        public async Task<QueryUserOmsDataResponse> QueryUserOmsDataAsync(QueryUserOmsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryUserOmsDataExAsync(request, runtime);
        }

        public CancelOrderResponse CancelOrderEx(CancelOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelOrderResponse>(DoRequest("CancelOrder", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CancelOrderResponse> CancelOrderExAsync(CancelOrderRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelOrderResponse>(await DoRequestAsync("CancelOrder", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public CancelOrderResponse CancelOrder(CancelOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CancelOrderEx(request, runtime);
        }

        public async Task<CancelOrderResponse> CancelOrderAsync(CancelOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CancelOrderExAsync(request, runtime);
        }

        public ApplyInvoiceResponse ApplyInvoiceEx(ApplyInvoiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInvoiceResponse>(DoRequest("ApplyInvoice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ApplyInvoiceResponse> ApplyInvoiceExAsync(ApplyInvoiceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInvoiceResponse>(await DoRequestAsync("ApplyInvoice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public ApplyInvoiceResponse ApplyInvoice(ApplyInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ApplyInvoiceEx(request, runtime);
        }

        public async Task<ApplyInvoiceResponse> ApplyInvoiceAsync(ApplyInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ApplyInvoiceExAsync(request, runtime);
        }

        public QueryCustomerAddressListResponse QueryCustomerAddressListEx(QueryCustomerAddressListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerAddressListResponse>(DoRequest("QueryCustomerAddressList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryCustomerAddressListResponse> QueryCustomerAddressListExAsync(QueryCustomerAddressListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerAddressListResponse>(await DoRequestAsync("QueryCustomerAddressList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryCustomerAddressListResponse QueryCustomerAddressList(QueryCustomerAddressListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryCustomerAddressListEx(request, runtime);
        }

        public async Task<QueryCustomerAddressListResponse> QueryCustomerAddressListAsync(QueryCustomerAddressListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryCustomerAddressListExAsync(request, runtime);
        }

        public QueryEvaluateListResponse QueryEvaluateListEx(QueryEvaluateListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEvaluateListResponse>(DoRequest("QueryEvaluateList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryEvaluateListResponse> QueryEvaluateListExAsync(QueryEvaluateListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEvaluateListResponse>(await DoRequestAsync("QueryEvaluateList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryEvaluateListResponse QueryEvaluateList(QueryEvaluateListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryEvaluateListEx(request, runtime);
        }

        public async Task<QueryEvaluateListResponse> QueryEvaluateListAsync(QueryEvaluateListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryEvaluateListExAsync(request, runtime);
        }

        public QueryInvoicingCustomerListResponse QueryInvoicingCustomerListEx(QueryInvoicingCustomerListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInvoicingCustomerListResponse>(DoRequest("QueryInvoicingCustomerList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryInvoicingCustomerListResponse> QueryInvoicingCustomerListExAsync(QueryInvoicingCustomerListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInvoicingCustomerListResponse>(await DoRequestAsync("QueryInvoicingCustomerList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryInvoicingCustomerListResponse QueryInvoicingCustomerList(QueryInvoicingCustomerListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryInvoicingCustomerListEx(request, runtime);
        }

        public async Task<QueryInvoicingCustomerListResponse> QueryInvoicingCustomerListAsync(QueryInvoicingCustomerListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryInvoicingCustomerListExAsync(request, runtime);
        }

        public QueryBillOverviewResponse QueryBillOverviewEx(QueryBillOverviewRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillOverviewResponse>(DoRequest("QueryBillOverview", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryBillOverviewResponse> QueryBillOverviewExAsync(QueryBillOverviewRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillOverviewResponse>(await DoRequestAsync("QueryBillOverview", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryBillOverviewResponse QueryBillOverview(QueryBillOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryBillOverviewEx(request, runtime);
        }

        public async Task<QueryBillOverviewResponse> QueryBillOverviewAsync(QueryBillOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryBillOverviewExAsync(request, runtime);
        }

        public QueryBillResponse QueryBillEx(QueryBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillResponse>(DoRequest("QueryBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryBillResponse> QueryBillExAsync(QueryBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillResponse>(await DoRequestAsync("QueryBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryBillResponse QueryBill(QueryBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryBillEx(request, runtime);
        }

        public async Task<QueryBillResponse> QueryBillAsync(QueryBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryBillExAsync(request, runtime);
        }

        public QueryInstanceBillResponse QueryInstanceBillEx(QueryInstanceBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceBillResponse>(DoRequest("QueryInstanceBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryInstanceBillResponse> QueryInstanceBillExAsync(QueryInstanceBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceBillResponse>(await DoRequestAsync("QueryInstanceBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryInstanceBillResponse QueryInstanceBill(QueryInstanceBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryInstanceBillEx(request, runtime);
        }

        public async Task<QueryInstanceBillResponse> QueryInstanceBillAsync(QueryInstanceBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryInstanceBillExAsync(request, runtime);
        }

        public EnableBillGenerationResponse EnableBillGenerationEx(EnableBillGenerationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableBillGenerationResponse>(DoRequest("EnableBillGeneration", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<EnableBillGenerationResponse> EnableBillGenerationExAsync(EnableBillGenerationRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableBillGenerationResponse>(await DoRequestAsync("EnableBillGeneration", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public EnableBillGenerationResponse EnableBillGeneration(EnableBillGenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return EnableBillGenerationEx(request, runtime);
        }

        public async Task<EnableBillGenerationResponse> EnableBillGenerationAsync(EnableBillGenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await EnableBillGenerationExAsync(request, runtime);
        }

        public QueryRedeemResponse QueryRedeemEx(QueryRedeemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRedeemResponse>(DoRequest("QueryRedeem", "HTTPS", "GET", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryRedeemResponse> QueryRedeemExAsync(QueryRedeemRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRedeemResponse>(await DoRequestAsync("QueryRedeem", "HTTPS", "GET", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryRedeemResponse QueryRedeem(QueryRedeemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryRedeemEx(request, runtime);
        }

        public async Task<QueryRedeemResponse> QueryRedeemAsync(QueryRedeemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryRedeemExAsync(request, runtime);
        }

        public ConvertChargeTypeResponse ConvertChargeTypeEx(ConvertChargeTypeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConvertChargeTypeResponse>(DoRequest("ConvertChargeType", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ConvertChargeTypeResponse> ConvertChargeTypeExAsync(ConvertChargeTypeRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConvertChargeTypeResponse>(await DoRequestAsync("ConvertChargeType", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public ConvertChargeTypeResponse ConvertChargeType(ConvertChargeTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ConvertChargeTypeEx(request, runtime);
        }

        public async Task<ConvertChargeTypeResponse> ConvertChargeTypeAsync(ConvertChargeTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ConvertChargeTypeExAsync(request, runtime);
        }

        public CreateInstanceResponse CreateInstanceEx(CreateInstanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInstanceResponse>(DoRequest("CreateInstance", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateInstanceResponse> CreateInstanceExAsync(CreateInstanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInstanceResponse>(await DoRequestAsync("CreateInstance", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateInstanceResponse CreateInstance(CreateInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateInstanceEx(request, runtime);
        }

        public async Task<CreateInstanceResponse> CreateInstanceAsync(CreateInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateInstanceExAsync(request, runtime);
        }

        public ModifyInstanceResponse ModifyInstanceEx(ModifyInstanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifyInstanceResponse>(DoRequest("ModifyInstance", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<ModifyInstanceResponse> ModifyInstanceExAsync(ModifyInstanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifyInstanceResponse>(await DoRequestAsync("ModifyInstance", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ModifyInstanceEx(request, runtime);
        }

        public async Task<ModifyInstanceResponse> ModifyInstanceAsync(ModifyInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ModifyInstanceExAsync(request, runtime);
        }

        public DescribePricingModuleResponse DescribePricingModuleEx(DescribePricingModuleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribePricingModuleResponse>(DoRequest("DescribePricingModule", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribePricingModuleResponse> DescribePricingModuleExAsync(DescribePricingModuleRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribePricingModuleResponse>(await DoRequestAsync("DescribePricingModule", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribePricingModuleResponse DescribePricingModule(DescribePricingModuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribePricingModuleEx(request, runtime);
        }

        public async Task<DescribePricingModuleResponse> DescribePricingModuleAsync(DescribePricingModuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribePricingModuleExAsync(request, runtime);
        }

        public QueryProductListResponse QueryProductListEx(QueryProductListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProductListResponse>(DoRequest("QueryProductList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryProductListResponse> QueryProductListExAsync(QueryProductListRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProductListResponse>(await DoRequestAsync("QueryProductList", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryProductListResponse QueryProductList(QueryProductListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryProductListEx(request, runtime);
        }

        public async Task<QueryProductListResponse> QueryProductListAsync(QueryProductListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryProductListExAsync(request, runtime);
        }

        public QueryInstanceGaapCostResponse QueryInstanceGaapCostEx(QueryInstanceGaapCostRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceGaapCostResponse>(DoRequest("QueryInstanceGaapCost", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryInstanceGaapCostResponse> QueryInstanceGaapCostExAsync(QueryInstanceGaapCostRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceGaapCostResponse>(await DoRequestAsync("QueryInstanceGaapCost", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryInstanceGaapCostResponse QueryInstanceGaapCost(QueryInstanceGaapCostRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryInstanceGaapCostEx(request, runtime);
        }

        public async Task<QueryInstanceGaapCostResponse> QueryInstanceGaapCostAsync(QueryInstanceGaapCostRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryInstanceGaapCostExAsync(request, runtime);
        }

        public RenewInstanceResponse RenewInstanceEx(RenewInstanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenewInstanceResponse>(DoRequest("RenewInstance", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<RenewInstanceResponse> RenewInstanceExAsync(RenewInstanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenewInstanceResponse>(await DoRequestAsync("RenewInstance", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public RenewInstanceResponse RenewInstance(RenewInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return RenewInstanceEx(request, runtime);
        }

        public async Task<RenewInstanceResponse> RenewInstanceAsync(RenewInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await RenewInstanceExAsync(request, runtime);
        }

        public GetOrderDetailResponse GetOrderDetailEx(GetOrderDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOrderDetailResponse>(DoRequest("GetOrderDetail", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetOrderDetailResponse> GetOrderDetailExAsync(GetOrderDetailRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOrderDetailResponse>(await DoRequestAsync("GetOrderDetail", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public GetOrderDetailResponse GetOrderDetail(GetOrderDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetOrderDetailEx(request, runtime);
        }

        public async Task<GetOrderDetailResponse> GetOrderDetailAsync(GetOrderDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetOrderDetailExAsync(request, runtime);
        }

        public QueryOrdersResponse QueryOrdersEx(QueryOrdersRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOrdersResponse>(DoRequest("QueryOrders", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryOrdersResponse> QueryOrdersExAsync(QueryOrdersRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOrdersResponse>(await DoRequestAsync("QueryOrders", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryOrdersResponse QueryOrders(QueryOrdersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryOrdersEx(request, runtime);
        }

        public async Task<QueryOrdersResponse> QueryOrdersAsync(QueryOrdersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryOrdersExAsync(request, runtime);
        }

        public QueryMonthlyInstanceConsumptionResponse QueryMonthlyInstanceConsumptionEx(QueryMonthlyInstanceConsumptionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonthlyInstanceConsumptionResponse>(DoRequest("QueryMonthlyInstanceConsumption", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryMonthlyInstanceConsumptionResponse> QueryMonthlyInstanceConsumptionExAsync(QueryMonthlyInstanceConsumptionRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonthlyInstanceConsumptionResponse>(await DoRequestAsync("QueryMonthlyInstanceConsumption", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryMonthlyInstanceConsumptionResponse QueryMonthlyInstanceConsumption(QueryMonthlyInstanceConsumptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryMonthlyInstanceConsumptionEx(request, runtime);
        }

        public async Task<QueryMonthlyInstanceConsumptionResponse> QueryMonthlyInstanceConsumptionAsync(QueryMonthlyInstanceConsumptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryMonthlyInstanceConsumptionExAsync(request, runtime);
        }

        public QuerySettlementBillResponse QuerySettlementBillEx(QuerySettlementBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySettlementBillResponse>(DoRequest("QuerySettlementBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QuerySettlementBillResponse> QuerySettlementBillExAsync(QuerySettlementBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySettlementBillResponse>(await DoRequestAsync("QuerySettlementBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QuerySettlementBillResponse QuerySettlementBill(QuerySettlementBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QuerySettlementBillEx(request, runtime);
        }

        public async Task<QuerySettlementBillResponse> QuerySettlementBillAsync(QuerySettlementBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QuerySettlementBillExAsync(request, runtime);
        }

        public QueryMonthlyBillResponse QueryMonthlyBillEx(QueryMonthlyBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonthlyBillResponse>(DoRequest("QueryMonthlyBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryMonthlyBillResponse> QueryMonthlyBillExAsync(QueryMonthlyBillRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonthlyBillResponse>(await DoRequestAsync("QueryMonthlyBill", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryMonthlyBillResponse QueryMonthlyBill(QueryMonthlyBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryMonthlyBillEx(request, runtime);
        }

        public async Task<QueryMonthlyBillResponse> QueryMonthlyBillAsync(QueryMonthlyBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryMonthlyBillExAsync(request, runtime);
        }

        public SetRenewalResponse SetRenewalEx(SetRenewalRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetRenewalResponse>(DoRequest("SetRenewal", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<SetRenewalResponse> SetRenewalExAsync(SetRenewalRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetRenewalResponse>(await DoRequestAsync("SetRenewal", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public SetRenewalResponse SetRenewal(SetRenewalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return SetRenewalEx(request, runtime);
        }

        public async Task<SetRenewalResponse> SetRenewalAsync(SetRenewalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await SetRenewalExAsync(request, runtime);
        }

        public QueryAvailableInstancesResponse QueryAvailableInstancesEx(QueryAvailableInstancesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAvailableInstancesResponse>(DoRequest("QueryAvailableInstances", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryAvailableInstancesResponse> QueryAvailableInstancesExAsync(QueryAvailableInstancesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAvailableInstancesResponse>(await DoRequestAsync("QueryAvailableInstances", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryAvailableInstancesResponse QueryAvailableInstances(QueryAvailableInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryAvailableInstancesEx(request, runtime);
        }

        public async Task<QueryAvailableInstancesResponse> QueryAvailableInstancesAsync(QueryAvailableInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryAvailableInstancesExAsync(request, runtime);
        }

        public CreateResourcePackageResponse CreateResourcePackageEx(CreateResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourcePackageResponse>(DoRequest("CreateResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<CreateResourcePackageResponse> CreateResourcePackageExAsync(CreateResourcePackageRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourcePackageResponse>(await DoRequestAsync("CreateResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public CreateResourcePackageResponse CreateResourcePackage(CreateResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateResourcePackageEx(request, runtime);
        }

        public async Task<CreateResourcePackageResponse> CreateResourcePackageAsync(CreateResourcePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateResourcePackageExAsync(request, runtime);
        }

        public QueryResourcePackageInstancesResponse QueryResourcePackageInstancesEx(QueryResourcePackageInstancesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcePackageInstancesResponse>(DoRequest("QueryResourcePackageInstances", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryResourcePackageInstancesResponse> QueryResourcePackageInstancesExAsync(QueryResourcePackageInstancesRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcePackageInstancesResponse>(await DoRequestAsync("QueryResourcePackageInstances", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryResourcePackageInstancesResponse QueryResourcePackageInstances(QueryResourcePackageInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryResourcePackageInstancesEx(request, runtime);
        }

        public async Task<QueryResourcePackageInstancesResponse> QueryResourcePackageInstancesAsync(QueryResourcePackageInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryResourcePackageInstancesExAsync(request, runtime);
        }

        public GetResourcePackagePriceResponse GetResourcePackagePriceEx(GetResourcePackagePriceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetResourcePackagePriceResponse>(DoRequest("GetResourcePackagePrice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetResourcePackagePriceResponse> GetResourcePackagePriceExAsync(GetResourcePackagePriceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetResourcePackagePriceResponse>(await DoRequestAsync("GetResourcePackagePrice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public GetResourcePackagePriceResponse GetResourcePackagePrice(GetResourcePackagePriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetResourcePackagePriceEx(request, runtime);
        }

        public async Task<GetResourcePackagePriceResponse> GetResourcePackagePriceAsync(GetResourcePackagePriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetResourcePackagePriceExAsync(request, runtime);
        }

        public GetSubscriptionPriceResponse GetSubscriptionPriceEx(GetSubscriptionPriceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSubscriptionPriceResponse>(DoRequest("GetSubscriptionPrice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetSubscriptionPriceResponse> GetSubscriptionPriceExAsync(GetSubscriptionPriceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSubscriptionPriceResponse>(await DoRequestAsync("GetSubscriptionPrice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public GetSubscriptionPriceResponse GetSubscriptionPrice(GetSubscriptionPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetSubscriptionPriceEx(request, runtime);
        }

        public async Task<GetSubscriptionPriceResponse> GetSubscriptionPriceAsync(GetSubscriptionPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetSubscriptionPriceExAsync(request, runtime);
        }

        public GetPayAsYouGoPriceResponse GetPayAsYouGoPriceEx(GetPayAsYouGoPriceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPayAsYouGoPriceResponse>(DoRequest("GetPayAsYouGoPrice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<GetPayAsYouGoPriceResponse> GetPayAsYouGoPriceExAsync(GetPayAsYouGoPriceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPayAsYouGoPriceResponse>(await DoRequestAsync("GetPayAsYouGoPrice", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public GetPayAsYouGoPriceResponse GetPayAsYouGoPrice(GetPayAsYouGoPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetPayAsYouGoPriceEx(request, runtime);
        }

        public async Task<GetPayAsYouGoPriceResponse> GetPayAsYouGoPriceAsync(GetPayAsYouGoPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetPayAsYouGoPriceExAsync(request, runtime);
        }

        public QueryPrepaidCardsResponse QueryPrepaidCardsEx(QueryPrepaidCardsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPrepaidCardsResponse>(DoRequest("QueryPrepaidCards", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryPrepaidCardsResponse> QueryPrepaidCardsExAsync(QueryPrepaidCardsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPrepaidCardsResponse>(await DoRequestAsync("QueryPrepaidCards", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryPrepaidCardsResponse QueryPrepaidCards(QueryPrepaidCardsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryPrepaidCardsEx(request, runtime);
        }

        public async Task<QueryPrepaidCardsResponse> QueryPrepaidCardsAsync(QueryPrepaidCardsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryPrepaidCardsExAsync(request, runtime);
        }

        public QueryCashCouponsResponse QueryCashCouponsEx(QueryCashCouponsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCashCouponsResponse>(DoRequest("QueryCashCoupons", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<QueryCashCouponsResponse> QueryCashCouponsExAsync(QueryCashCouponsRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCashCouponsResponse>(await DoRequestAsync("QueryCashCoupons", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public QueryCashCouponsResponse QueryCashCoupons(QueryCashCouponsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryCashCouponsEx(request, runtime);
        }

        public async Task<QueryCashCouponsResponse> QueryCashCouponsAsync(QueryCashCouponsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryCashCouponsExAsync(request, runtime);
        }

        public QueryAccountBalanceResponse QueryAccountBalanceEx(QueryAccountBalanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAccountBalanceResponse>(DoRequest("QueryAccountBalance", "HTTPS", "POST", "2017-12-14", "AK", null, request.ToMap(), runtime));
        }

        public async Task<QueryAccountBalanceResponse> QueryAccountBalanceExAsync(QueryAccountBalanceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAccountBalanceResponse>(await DoRequestAsync("QueryAccountBalance", "HTTPS", "POST", "2017-12-14", "AK", null, request.ToMap(), runtime));
        }

        public QueryAccountBalanceResponse QueryAccountBalance(QueryAccountBalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryAccountBalanceEx(request, runtime);
        }

        public async Task<QueryAccountBalanceResponse> QueryAccountBalanceAsync(QueryAccountBalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryAccountBalanceExAsync(request, runtime);
        }

        public DescribeResourcePackageProductResponse DescribeResourcePackageProductEx(DescribeResourcePackageProductRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeResourcePackageProductResponse>(DoRequest("DescribeResourcePackageProduct", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public async Task<DescribeResourcePackageProductResponse> DescribeResourcePackageProductExAsync(DescribeResourcePackageProductRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeResourcePackageProductResponse>(await DoRequestAsync("DescribeResourcePackageProduct", "HTTPS", "POST", "2017-12-14", "AK", request.ToMap(), null, runtime));
        }

        public DescribeResourcePackageProductResponse DescribeResourcePackageProduct(DescribeResourcePackageProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return DescribeResourcePackageProductEx(request, runtime);
        }

        public async Task<DescribeResourcePackageProductResponse> DescribeResourcePackageProductAsync(DescribeResourcePackageProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await DescribeResourcePackageProductExAsync(request, runtime);
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
