// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214;

import com.aliyun.tea.*;
import com.aliyun.bssopenapi20171214.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "business.aliyuncs.com"),
            new TeaPair("cn-chengdu", "business.aliyuncs.com"),
            new TeaPair("cn-edge-1", "business.aliyuncs.com"),
            new TeaPair("cn-fujian", "business.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "business.aliyuncs.com"),
            new TeaPair("cn-hongkong", "business.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "business.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "business.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "business.aliyuncs.com"),
            new TeaPair("cn-wuhan", "business.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "business.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "business.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "business.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "business.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "business.aliyuncs.com"),
            new TeaPair("eu-central-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "business.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public QueryRIUtilizationDetailResponse queryRIUtilizationDetailEx(QueryRIUtilizationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRIUtilizationDetail", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryRIUtilizationDetailResponse());
    }

    public QueryRIUtilizationDetailResponse queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRIUtilizationDetailEx(request, runtime);
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscriptionEx(QueryBillToOSSSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryBillToOSSSubscription", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryBillToOSSSubscriptionResponse());
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscription(QueryBillToOSSSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillToOSSSubscriptionEx(request, runtime);
    }

    public QueryAccountBillResponse queryAccountBillEx(QueryAccountBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountBill", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryAccountBillResponse());
    }

    public QueryAccountBillResponse queryAccountBill(QueryAccountBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountBillEx(request, runtime);
    }

    public CreateCostUnitResponse createCostUnitEx(CreateCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCostUnit", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateCostUnitResponse());
    }

    public CreateCostUnitResponse createCostUnit(CreateCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCostUnitEx(request, runtime);
    }

    public ModifyCostUnitResponse modifyCostUnitEx(ModifyCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCostUnit", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new ModifyCostUnitResponse());
    }

    public ModifyCostUnitResponse modifyCostUnit(ModifyCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCostUnitEx(request, runtime);
    }

    public QueryCostUnitResponse queryCostUnitEx(QueryCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCostUnit", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryCostUnitResponse());
    }

    public QueryCostUnitResponse queryCostUnit(QueryCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostUnitEx(request, runtime);
    }

    public DeleteCostUnitResponse deleteCostUnitEx(DeleteCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCostUnit", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new DeleteCostUnitResponse());
    }

    public DeleteCostUnitResponse deleteCostUnit(DeleteCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCostUnitEx(request, runtime);
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResourceEx(AllocateCostUnitResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new AllocateCostUnitResourceResponse());
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResource(AllocateCostUnitResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateCostUnitResourceEx(request, runtime);
    }

    public QueryCostUnitResourceResponse queryCostUnitResourceEx(QueryCostUnitResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryCostUnitResourceResponse());
    }

    public QueryCostUnitResourceResponse queryCostUnitResource(QueryCostUnitResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostUnitResourceEx(request, runtime);
    }

    public RenewResourcePackageResponse renewResourcePackageEx(RenewResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new RenewResourcePackageResponse());
    }

    public RenewResourcePackageResponse renewResourcePackage(RenewResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewResourcePackageEx(request, runtime);
    }

    public UpgradeResourcePackageResponse upgradeResourcePackageEx(UpgradeResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new UpgradeResourcePackageResponse());
    }

    public UpgradeResourcePackageResponse upgradeResourcePackage(UpgradeResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeResourcePackageEx(request, runtime);
    }

    public CreateAgAccountResponse createAgAccountEx(CreateAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAgAccount", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateAgAccountResponse());
    }

    public CreateAgAccountResponse createAgAccount(CreateAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgAccountEx(request, runtime);
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfoEx(GetCustomerAccountInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomerAccountInfo", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new GetCustomerAccountInfoResponse());
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfo(GetCustomerAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerAccountInfoEx(request, runtime);
    }

    public GetCustomerListResponse getCustomerListEx(GetCustomerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomerList", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new GetCustomerListResponse());
    }

    public GetCustomerListResponse getCustomerList(GetCustomerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerListEx(request, runtime);
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmountEx(ChangeResellerConsumeAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangeResellerConsumeAmount", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new ChangeResellerConsumeAmountResponse());
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResellerConsumeAmountEx(request, runtime);
    }

    public SetResellerUserStatusResponse setResellerUserStatusEx(SetResellerUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResellerUserStatus", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new SetResellerUserStatusResponse());
    }

    public SetResellerUserStatusResponse setResellerUserStatus(SetResellerUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserStatusEx(request, runtime);
    }

    public CreateResellerUserQuotaResponse createResellerUserQuotaEx(CreateResellerUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateResellerUserQuotaResponse());
    }

    public CreateResellerUserQuotaResponse createResellerUserQuota(CreateResellerUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResellerUserQuotaEx(request, runtime);
    }

    public SetResellerUserQuotaResponse setResellerUserQuotaEx(SetResellerUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new SetResellerUserQuotaResponse());
    }

    public SetResellerUserQuotaResponse setResellerUserQuota(SetResellerUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserQuotaEx(request, runtime);
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuotaEx(QueryResellerAvailableQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryResellerAvailableQuota", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryResellerAvailableQuotaResponse());
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResellerAvailableQuotaEx(request, runtime);
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThresholdEx(SetResellerUserAlarmThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResellerUserAlarmThreshold", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new SetResellerUserAlarmThresholdResponse());
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserAlarmThresholdEx(request, runtime);
    }

    public QueryAccountTransactionsResponse queryAccountTransactionsEx(QueryAccountTransactionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountTransactions", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryAccountTransactionsResponse());
    }

    public QueryAccountTransactionsResponse queryAccountTransactions(QueryAccountTransactionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountTransactionsEx(request, runtime);
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSSEx(UnsubscribeBillToOSSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnsubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new UnsubscribeBillToOSSResponse());
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeBillToOSSEx(request, runtime);
    }

    public SubscribeBillToOSSResponse subscribeBillToOSSEx(SubscribeBillToOSSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new SubscribeBillToOSSResponse());
    }

    public SubscribeBillToOSSResponse subscribeBillToOSS(SubscribeBillToOSSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscribeBillToOSSEx(request, runtime);
    }

    public QueryUserOmsDataResponse queryUserOmsDataEx(QueryUserOmsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryUserOmsData", "HTTPS", "GET", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryUserOmsDataResponse());
    }

    public QueryUserOmsDataResponse queryUserOmsData(QueryUserOmsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserOmsDataEx(request, runtime);
    }

    public CancelOrderResponse cancelOrderEx(CancelOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelOrder", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderEx(request, runtime);
    }

    public ApplyInvoiceResponse applyInvoiceEx(ApplyInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyInvoice", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new ApplyInvoiceResponse());
    }

    public ApplyInvoiceResponse applyInvoice(ApplyInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyInvoiceEx(request, runtime);
    }

    public QueryCustomerAddressListResponse queryCustomerAddressListEx(QueryCustomerAddressListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCustomerAddressList", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryCustomerAddressListResponse());
    }

    public QueryCustomerAddressListResponse queryCustomerAddressList(QueryCustomerAddressListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomerAddressListEx(request, runtime);
    }

    public QueryEvaluateListResponse queryEvaluateListEx(QueryEvaluateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEvaluateList", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryEvaluateListResponse());
    }

    public QueryEvaluateListResponse queryEvaluateList(QueryEvaluateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEvaluateListEx(request, runtime);
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerListEx(QueryInvoicingCustomerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryInvoicingCustomerList", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryInvoicingCustomerListResponse());
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInvoicingCustomerListEx(request, runtime);
    }

    public QueryBillOverviewResponse queryBillOverviewEx(QueryBillOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryBillOverview", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryBillOverviewResponse());
    }

    public QueryBillOverviewResponse queryBillOverview(QueryBillOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillOverviewEx(request, runtime);
    }

    public QueryBillResponse queryBillEx(QueryBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryBill", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryBillResponse());
    }

    public QueryBillResponse queryBill(QueryBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillEx(request, runtime);
    }

    public QueryInstanceBillResponse queryInstanceBillEx(QueryInstanceBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryInstanceBill", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryInstanceBillResponse());
    }

    public QueryInstanceBillResponse queryInstanceBill(QueryInstanceBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceBillEx(request, runtime);
    }

    public EnableBillGenerationResponse enableBillGenerationEx(EnableBillGenerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableBillGeneration", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new EnableBillGenerationResponse());
    }

    public EnableBillGenerationResponse enableBillGeneration(EnableBillGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBillGenerationEx(request, runtime);
    }

    public QueryRedeemResponse queryRedeemEx(QueryRedeemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRedeem", "HTTPS", "GET", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryRedeemResponse());
    }

    public QueryRedeemResponse queryRedeem(QueryRedeemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRedeemEx(request, runtime);
    }

    public ConvertChargeTypeResponse convertChargeTypeEx(ConvertChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConvertChargeType", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new ConvertChargeTypeResponse());
    }

    public ConvertChargeTypeResponse convertChargeType(ConvertChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertChargeTypeEx(request, runtime);
    }

    public CreateInstanceResponse createInstanceEx(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstance", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceEx(request, runtime);
    }

    public ModifyInstanceResponse modifyInstanceEx(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstance", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new ModifyInstanceResponse());
    }

    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceEx(request, runtime);
    }

    public DescribePricingModuleResponse describePricingModuleEx(DescribePricingModuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePricingModule", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribePricingModuleResponse());
    }

    public DescribePricingModuleResponse describePricingModule(DescribePricingModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePricingModuleEx(request, runtime);
    }

    public QueryProductListResponse queryProductListEx(QueryProductListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProductList", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryProductListResponse());
    }

    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProductListEx(request, runtime);
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCostEx(QueryInstanceGaapCostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryInstanceGaapCost", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryInstanceGaapCostResponse());
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCost(QueryInstanceGaapCostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceGaapCostEx(request, runtime);
    }

    public RenewInstanceResponse renewInstanceEx(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewInstance", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceEx(request, runtime);
    }

    public GetOrderDetailResponse getOrderDetailEx(GetOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOrderDetail", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new GetOrderDetailResponse());
    }

    public GetOrderDetailResponse getOrderDetail(GetOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderDetailEx(request, runtime);
    }

    public QueryOrdersResponse queryOrdersEx(QueryOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOrders", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryOrdersResponse());
    }

    public QueryOrdersResponse queryOrders(QueryOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrdersEx(request, runtime);
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumptionEx(QueryMonthlyInstanceConsumptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryMonthlyInstanceConsumption", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryMonthlyInstanceConsumptionResponse());
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumption(QueryMonthlyInstanceConsumptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthlyInstanceConsumptionEx(request, runtime);
    }

    public QuerySettlementBillResponse querySettlementBillEx(QuerySettlementBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySettlementBill", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QuerySettlementBillResponse());
    }

    public QuerySettlementBillResponse querySettlementBill(QuerySettlementBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySettlementBillEx(request, runtime);
    }

    public QueryMonthlyBillResponse queryMonthlyBillEx(QueryMonthlyBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryMonthlyBill", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryMonthlyBillResponse());
    }

    public QueryMonthlyBillResponse queryMonthlyBill(QueryMonthlyBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthlyBillEx(request, runtime);
    }

    public SetRenewalResponse setRenewalEx(SetRenewalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetRenewal", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new SetRenewalResponse());
    }

    public SetRenewalResponse setRenewal(SetRenewalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRenewalEx(request, runtime);
    }

    public QueryAvailableInstancesResponse queryAvailableInstancesEx(QueryAvailableInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAvailableInstances", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryAvailableInstancesResponse());
    }

    public QueryAvailableInstancesResponse queryAvailableInstances(QueryAvailableInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvailableInstancesEx(request, runtime);
    }

    public CreateResourcePackageResponse createResourcePackageEx(CreateResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new CreateResourcePackageResponse());
    }

    public CreateResourcePackageResponse createResourcePackage(CreateResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourcePackageEx(request, runtime);
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstancesEx(QueryResourcePackageInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryResourcePackageInstances", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryResourcePackageInstancesResponse());
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstances(QueryResourcePackageInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResourcePackageInstancesEx(request, runtime);
    }

    public GetResourcePackagePriceResponse getResourcePackagePriceEx(GetResourcePackagePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourcePackagePrice", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new GetResourcePackagePriceResponse());
    }

    public GetResourcePackagePriceResponse getResourcePackagePrice(GetResourcePackagePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourcePackagePriceEx(request, runtime);
    }

    public GetSubscriptionPriceResponse getSubscriptionPriceEx(GetSubscriptionPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSubscriptionPrice", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new GetSubscriptionPriceResponse());
    }

    public GetSubscriptionPriceResponse getSubscriptionPrice(GetSubscriptionPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionPriceEx(request, runtime);
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPriceEx(GetPayAsYouGoPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPayAsYouGoPrice", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new GetPayAsYouGoPriceResponse());
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPayAsYouGoPriceEx(request, runtime);
    }

    public QueryPrepaidCardsResponse queryPrepaidCardsEx(QueryPrepaidCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPrepaidCards", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryPrepaidCardsResponse());
    }

    public QueryPrepaidCardsResponse queryPrepaidCards(QueryPrepaidCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPrepaidCardsEx(request, runtime);
    }

    public QueryCashCouponsResponse queryCashCouponsEx(QueryCashCouponsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCashCoupons", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryCashCouponsResponse());
    }

    public QueryCashCouponsResponse queryCashCoupons(QueryCashCouponsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCashCouponsEx(request, runtime);
    }

    public QueryAccountBalanceResponse queryAccountBalanceEx(QueryAccountBalanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountBalance", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryAccountBalanceResponse());
    }

    public QueryAccountBalanceResponse queryAccountBalance(QueryAccountBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountBalanceEx(request, runtime);
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProductEx(DescribeResourcePackageProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackageProduct", "HTTPS", "POST", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new DescribeResourcePackageProductResponse());
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProduct(DescribeResourcePackageProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourcePackageProductEx(request, runtime);
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
