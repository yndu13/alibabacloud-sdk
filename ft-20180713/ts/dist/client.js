"use strict";
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
// This file is auto-generated, don't edit it
const tea_util_1 = __importStar(require("@alicloud/tea-util")), $Util = tea_util_1;
const rpc_client_1 = __importDefault(require("@alicloud/rpc-client"));
const endpoint_util_1 = __importDefault(require("@alicloud/endpoint-util"));
const $tea = __importStar(require("@alicloud/tea-typescript"));
class TestFlowStrategy01Request extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            names: 'Names',
        };
    }
    static types() {
        return {
            names: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
        };
    }
}
exports.TestFlowStrategy01Request = TestFlowStrategy01Request;
class TestFlowStrategy01Response extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            list: 'List',
            names: 'Names',
        };
    }
    static types() {
        return {
            requestId: 'string',
            list: { 'type': 'array', 'itemType': 'string' },
            names: { 'type': 'array', 'itemType': 'string' },
        };
    }
}
exports.TestFlowStrategy01Response = TestFlowStrategy01Response;
class TestHttpApiRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            stringValue: 'StringValue',
            defaultValue: 'DefaultValue',
            otherParam: 'OtherParam',
            booleanParam: 'BooleanParam',
        };
    }
    static types() {
        return {
            stringValue: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
            defaultValue: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
            otherParam: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
            booleanParam: 'boolean',
        };
    }
}
exports.TestHttpApiRequest = TestHttpApiRequest;
class TestHttpApiResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            params: 'Params',
            serviceRpcSign: 'ServiceRpcSign',
        };
    }
    static types() {
        return {
            params: 'string',
            serviceRpcSign: 'string',
        };
    }
}
exports.TestHttpApiResponse = TestHttpApiResponse;
class BatchAuditTest01Request extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
            batchAuditTest01: 'BatchAuditTest01',
            demo01: 'Demo01',
            test010101: 'Test010101',
        };
    }
    static types() {
        return {
            name: 'string',
            batchAuditTest01: 'string',
            demo01: 'string',
            test010101: 'boolean',
        };
    }
}
exports.BatchAuditTest01Request = BatchAuditTest01Request;
class BatchAuditTest01Response extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            name: 'Name',
            demo01: 'Demo01',
        };
    }
    static types() {
        return {
            requestId: 'string',
            name: 'string',
            demo01: BatchAuditTest01ResponseDemo01,
        };
    }
}
exports.BatchAuditTest01Response = BatchAuditTest01Response;
class FtIpFlowControlRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
        };
    }
    static types() {
        return {
            name: 'string',
        };
    }
}
exports.FtIpFlowControlRequest = FtIpFlowControlRequest;
class FtIpFlowControlResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            name: 'Name',
        };
    }
    static types() {
        return {
            requestId: 'string',
            name: 'string',
        };
    }
}
exports.FtIpFlowControlResponse = FtIpFlowControlResponse;
class FtDynamicAddressDubboRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            intValue: 'IntValue',
            stringValue: 'StringValue',
        };
    }
    static types() {
        return {
            intValue: 'number',
            stringValue: 'string',
        };
    }
}
exports.FtDynamicAddressDubboRequest = FtDynamicAddressDubboRequest;
class FtDynamicAddressDubboResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            stringValue: 'StringValue',
            intValue: 'IntValue',
        };
    }
    static types() {
        return {
            requestId: 'string',
            stringValue: 'string',
            intValue: 'number',
        };
    }
}
exports.FtDynamicAddressDubboResponse = FtDynamicAddressDubboResponse;
class FtDynamicAddressHsfRequest extends $tea.Model {
    static names() {
        return {};
    }
    static types() {
        return {};
    }
    constructor(map) {
        super(map);
    }
}
exports.FtDynamicAddressHsfRequest = FtDynamicAddressHsfRequest;
class FtDynamicAddressHsfResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
        };
    }
    static types() {
        return {
            requestId: 'string',
        };
    }
}
exports.FtDynamicAddressHsfResponse = FtDynamicAddressHsfResponse;
class FtFlowSpecialRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
        };
    }
    static types() {
        return {
            name: 'string',
        };
    }
}
exports.FtFlowSpecialRequest = FtFlowSpecialRequest;
class FtFlowSpecialResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            name: 'Name',
        };
    }
    static types() {
        return {
            requestId: 'string',
            name: 'string',
        };
    }
}
exports.FtFlowSpecialResponse = FtFlowSpecialResponse;
class FTApiAliasApiRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
        };
    }
    static types() {
        return {
            name: 'string',
        };
    }
}
exports.FTApiAliasApiRequest = FTApiAliasApiRequest;
class FTApiAliasApiResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            name: 'Name',
        };
    }
    static types() {
        return {
            requestId: 'string',
            name: 'string',
        };
    }
}
exports.FTApiAliasApiResponse = FTApiAliasApiResponse;
class FtEagleEyeRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
        };
    }
    static types() {
        return {
            name: 'string',
        };
    }
}
exports.FtEagleEyeRequest = FtEagleEyeRequest;
class FtEagleEyeResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            name: 'Name',
            eagleEyeTraceId: 'eagleEyeTraceId',
        };
    }
    static types() {
        return {
            requestId: 'string',
            name: 'string',
            eagleEyeTraceId: 'string',
        };
    }
}
exports.FtEagleEyeResponse = FtEagleEyeResponse;
class FtParamListRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
            disk: 'Disk',
        };
    }
    static types() {
        return {
            name: 'string',
            disk: { 'type': 'array', 'itemType': FtParamListRequestDisk },
        };
    }
}
exports.FtParamListRequest = FtParamListRequest;
class FtParamListResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            name: 'Name',
        };
    }
    static types() {
        return {
            requestId: 'string',
            name: 'string',
        };
    }
}
exports.FtParamListResponse = FtParamListResponse;
class FtGatedLaunchPolicy4Request extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            isGatedLaunch: 'IsGatedLaunch',
        };
    }
    static types() {
        return {
            isGatedLaunch: 'string',
        };
    }
}
exports.FtGatedLaunchPolicy4Request = FtGatedLaunchPolicy4Request;
class FtGatedLaunchPolicy4Response extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            isGatedLaunch: 'IsGatedLaunch',
        };
    }
    static types() {
        return {
            requestId: 'string',
            isGatedLaunch: 'string',
        };
    }
}
exports.FtGatedLaunchPolicy4Response = FtGatedLaunchPolicy4Response;
class BatchAuditTest01ResponseDemo01Demo011Demo011 extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            demo0111: 'Demo0111',
        };
    }
    static types() {
        return {
            demo0111: 'string',
        };
    }
}
exports.BatchAuditTest01ResponseDemo01Demo011Demo011 = BatchAuditTest01ResponseDemo01Demo011Demo011;
class BatchAuditTest01ResponseDemo01Demo011 extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            demo011: 'Demo011',
        };
    }
    static types() {
        return {
            demo011: { 'type': 'array', 'itemType': BatchAuditTest01ResponseDemo01Demo011Demo011 },
        };
    }
}
exports.BatchAuditTest01ResponseDemo01Demo011 = BatchAuditTest01ResponseDemo01Demo011;
class BatchAuditTest01ResponseDemo01 extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            demo011: 'Demo011',
        };
    }
    static types() {
        return {
            demo011: BatchAuditTest01ResponseDemo01Demo011,
        };
    }
}
exports.BatchAuditTest01ResponseDemo01 = BatchAuditTest01ResponseDemo01;
class FtParamListRequestDisk extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            size: 'Size',
            type: 'Type',
        };
    }
    static types() {
        return {
            size: { 'type': 'array', 'itemType': 'string' },
            type: { 'type': 'array', 'itemType': 'string' },
        };
    }
}
exports.FtParamListRequestDisk = FtParamListRequestDisk;
class Client extends rpc_client_1.default {
    constructor(config) {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = {
            'ap-northeast-2-pop': "ft.aliyuncs.com",
            'ap-south-1': "ft.aliyuncs.com",
            'ap-southeast-1': "ft.aliyuncs.com",
            'ap-southeast-2': "ft.aliyuncs.com",
            'ap-southeast-3': "ft.aliyuncs.com",
            'ap-southeast-5': "ft.aliyuncs.com",
            'cn-beijing': "ft.aliyuncs.com",
            'cn-beijing-finance-1': "ft.aliyuncs.com",
            'cn-beijing-finance-pop': "ft.aliyuncs.com",
            'cn-beijing-gov-1': "ft.aliyuncs.com",
            'cn-beijing-nu16-b01': "ft.aliyuncs.com",
            'cn-chengdu': "ft.aliyuncs.com",
            'cn-edge-1': "ft.aliyuncs.com",
            'cn-fujian': "ft.aliyuncs.com",
            'cn-haidian-cm12-c01': "ft.aliyuncs.com",
            'cn-hangzhou-bj-b01': "ft.aliyuncs.com",
            'cn-hangzhou-finance': "ft.aliyuncs.com",
            'cn-hangzhou-internal-prod-1': "ft.aliyuncs.com",
            'cn-hangzhou-internal-test-1': "ft.aliyuncs.com",
            'cn-hangzhou-internal-test-2': "ft.aliyuncs.com",
            'cn-hangzhou-internal-test-3': "ft.aliyuncs.com",
            'cn-hangzhou-test-306': "ft.aliyuncs.com",
            'cn-hongkong-finance-pop': "ft.aliyuncs.com",
            'cn-huhehaote': "ft.aliyuncs.com",
            'cn-qingdao': "ft.aliyuncs.com",
            'cn-qingdao-nebula': "ft.aliyuncs.com",
            'cn-shanghai-et15-b01': "ft.aliyuncs.com",
            'cn-shanghai-et2-b01': "ft.aliyuncs.com",
            'cn-shanghai-finance-1': "ft.aliyuncs.com",
            'cn-shanghai-inner': "ft.aliyuncs.com",
            'cn-shanghai-internal-test-1': "ft.aliyuncs.com",
            'cn-shenzhen-finance-1': "ft.aliyuncs.com",
            'cn-shenzhen-inner': "ft.aliyuncs.com",
            'cn-shenzhen-st4-d01': "ft.aliyuncs.com",
            'cn-shenzhen-su18-b01': "ft.aliyuncs.com",
            'cn-wuhan': "ft.aliyuncs.com",
            'cn-yushanfang': "ft.aliyuncs.com",
            'cn-zhangbei-na61-b01': "ft.aliyuncs.com",
            'cn-zhangjiakou-na62-a01': "ft.aliyuncs.com",
            'cn-zhengzhou-nebula-1': "ft.aliyuncs.com",
            'eu-central-1': "ft.aliyuncs.com",
            'eu-west-1': "ft.aliyuncs.com",
            'eu-west-1-oxs': "ft.aliyuncs.com",
            'me-east-1': "ft.aliyuncs.com",
            'rus-west-1-pop': "ft.aliyuncs.com",
            'us-west-1': "ft.aliyuncs.com",
        };
        this.checkConfig(config);
        this._endpoint = this.getEndpoint(this._productId, this._regionId, this._endpointRule, this._network, this._suffix, this._endpointMap, this._endpoint);
    }
    async testFlowStrategy01WithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("TestFlowStrategy01", "HTTPS", "PUT", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new TestFlowStrategy01Response({}));
    }
    async testFlowStrategy01(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.testFlowStrategy01WithOptions(request, runtime);
    }
    async testHttpApiWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("TestHttpApi", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new TestHttpApiResponse({}));
    }
    async testHttpApi(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.testHttpApiWithOptions(request, runtime);
    }
    async batchAuditTest01WithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("BatchAuditTest01", "HTTPS", "POST", "2018-07-13", "Anonymous", null, $tea.toMap(request), runtime), new BatchAuditTest01Response({}));
    }
    async batchAuditTest01(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.batchAuditTest01WithOptions(request, runtime);
    }
    async ftIpFlowControlWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FtIpFlowControl", "HTTPS", "POST", "2018-07-13", "Anonymous", null, $tea.toMap(request), runtime), new FtIpFlowControlResponse({}));
    }
    async ftIpFlowControl(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.ftIpFlowControlWithOptions(request, runtime);
    }
    async ftDynamicAddressDubboWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FtDynamicAddressDubbo", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new FtDynamicAddressDubboResponse({}));
    }
    async ftDynamicAddressDubbo(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.ftDynamicAddressDubboWithOptions(request, runtime);
    }
    async ftDynamicAddressHsfWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FtDynamicAddressHsf", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new FtDynamicAddressHsfResponse({}));
    }
    async ftDynamicAddressHsf(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.ftDynamicAddressHsfWithOptions(request, runtime);
    }
    async ftFlowSpecialWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FtFlowSpecial", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new FtFlowSpecialResponse({}));
    }
    async ftFlowSpecial(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.ftFlowSpecialWithOptions(request, runtime);
    }
    async FTApiAliasApiWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FTApiAliasApi", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new FTApiAliasApiResponse({}));
    }
    async FTApiAliasApi(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.FTApiAliasApiWithOptions(request, runtime);
    }
    async ftEagleEyeWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FtEagleEye", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new FtEagleEyeResponse({}));
    }
    async ftEagleEye(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.ftEagleEyeWithOptions(request, runtime);
    }
    async ftParamListWithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FtParamList", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new FtParamListResponse({}));
    }
    async ftParamList(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.ftParamListWithOptions(request, runtime);
    }
    async ftGatedLaunchPolicy4WithOptions(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FtGatedLaunchPolicy4", "HTTPS", "POST", "2018-07-13", "AK", null, $tea.toMap(request), runtime), new FtGatedLaunchPolicy4Response({}));
    }
    async ftGatedLaunchPolicy4(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.ftGatedLaunchPolicy4WithOptions(request, runtime);
    }
    getEndpoint(productId, regionId, endpointRule, network, suffix, endpointMap, endpoint) {
        if (!tea_util_1.default.empty(endpoint)) {
            return endpoint;
        }
        if (!tea_util_1.default.isUnset(endpointMap) && !tea_util_1.default.empty(endpointMap[regionId])) {
            return endpointMap[regionId];
        }
        return endpoint_util_1.default.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
exports.default = Client;
//# sourceMappingURL=client.js.map