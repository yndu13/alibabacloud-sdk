import * as $Util from '@alicloud/tea-util';
import RPC, * as $RPC from '@alicloud/rpc-client';
import * as $tea from '@alicloud/tea-typescript';
export declare class TestFlowStrategy01Request extends $tea.Model {
    names?: {
        [key: string]: any;
    };
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class TestFlowStrategy01Response extends $tea.Model {
    requestId: string;
    list: string[];
    names: string[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class TestHttpApiRequest extends $tea.Model {
    stringValue?: {
        [key: string]: any;
    };
    defaultValue?: {
        [key: string]: any;
    };
    otherParam?: {
        [key: string]: any;
    };
    booleanParam?: boolean;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class TestHttpApiResponse extends $tea.Model {
    params: string;
    serviceRpcSign: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BatchAuditTest01Request extends $tea.Model {
    name?: string;
    batchAuditTest01?: string;
    demo01?: string;
    test010101?: boolean;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BatchAuditTest01Response extends $tea.Model {
    requestId: string;
    name: string;
    demo01: BatchAuditTest01ResponseDemo01;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtIpFlowControlRequest extends $tea.Model {
    name?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtIpFlowControlResponse extends $tea.Model {
    requestId: string;
    name: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtDynamicAddressDubboRequest extends $tea.Model {
    intValue?: number;
    stringValue?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtDynamicAddressDubboResponse extends $tea.Model {
    requestId: string;
    stringValue: string;
    intValue: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtDynamicAddressHsfRequest extends $tea.Model {
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtDynamicAddressHsfResponse extends $tea.Model {
    requestId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtFlowSpecialRequest extends $tea.Model {
    name?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtFlowSpecialResponse extends $tea.Model {
    requestId: string;
    name: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FTApiAliasApiRequest extends $tea.Model {
    name?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FTApiAliasApiResponse extends $tea.Model {
    requestId: string;
    name: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtEagleEyeRequest extends $tea.Model {
    name?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtEagleEyeResponse extends $tea.Model {
    requestId: string;
    name: string;
    eagleEyeTraceId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtParamListRequest extends $tea.Model {
    name?: string;
    disk?: FtParamListRequestDisk[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtParamListResponse extends $tea.Model {
    requestId: string;
    name: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtGatedLaunchPolicy4Request extends $tea.Model {
    isGatedLaunch?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtGatedLaunchPolicy4Response extends $tea.Model {
    requestId: string;
    isGatedLaunch: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BatchAuditTest01ResponseDemo01Demo011Demo011 extends $tea.Model {
    demo0111: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BatchAuditTest01ResponseDemo01Demo011 extends $tea.Model {
    demo011: BatchAuditTest01ResponseDemo01Demo011Demo011[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BatchAuditTest01ResponseDemo01 extends $tea.Model {
    demo011: BatchAuditTest01ResponseDemo01Demo011;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FtParamListRequestDisk extends $tea.Model {
    size: string[];
    type: string[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export default class Client extends RPC {
    constructor(config: $RPC.Config);
    testFlowStrategy01WithOptions(request: TestFlowStrategy01Request, runtime: $Util.RuntimeOptions): Promise<TestFlowStrategy01Response>;
    testFlowStrategy01(request: TestFlowStrategy01Request): Promise<TestFlowStrategy01Response>;
    testHttpApiWithOptions(request: TestHttpApiRequest, runtime: $Util.RuntimeOptions): Promise<TestHttpApiResponse>;
    testHttpApi(request: TestHttpApiRequest): Promise<TestHttpApiResponse>;
    batchAuditTest01WithOptions(request: BatchAuditTest01Request, runtime: $Util.RuntimeOptions): Promise<BatchAuditTest01Response>;
    batchAuditTest01(request: BatchAuditTest01Request): Promise<BatchAuditTest01Response>;
    ftIpFlowControlWithOptions(request: FtIpFlowControlRequest, runtime: $Util.RuntimeOptions): Promise<FtIpFlowControlResponse>;
    ftIpFlowControl(request: FtIpFlowControlRequest): Promise<FtIpFlowControlResponse>;
    ftDynamicAddressDubboWithOptions(request: FtDynamicAddressDubboRequest, runtime: $Util.RuntimeOptions): Promise<FtDynamicAddressDubboResponse>;
    ftDynamicAddressDubbo(request: FtDynamicAddressDubboRequest): Promise<FtDynamicAddressDubboResponse>;
    ftDynamicAddressHsfWithOptions(request: FtDynamicAddressHsfRequest, runtime: $Util.RuntimeOptions): Promise<FtDynamicAddressHsfResponse>;
    ftDynamicAddressHsf(request: FtDynamicAddressHsfRequest): Promise<FtDynamicAddressHsfResponse>;
    ftFlowSpecialWithOptions(request: FtFlowSpecialRequest, runtime: $Util.RuntimeOptions): Promise<FtFlowSpecialResponse>;
    ftFlowSpecial(request: FtFlowSpecialRequest): Promise<FtFlowSpecialResponse>;
    FTApiAliasApiWithOptions(request: FTApiAliasApiRequest, runtime: $Util.RuntimeOptions): Promise<FTApiAliasApiResponse>;
    FTApiAliasApi(request: FTApiAliasApiRequest): Promise<FTApiAliasApiResponse>;
    ftEagleEyeWithOptions(request: FtEagleEyeRequest, runtime: $Util.RuntimeOptions): Promise<FtEagleEyeResponse>;
    ftEagleEye(request: FtEagleEyeRequest): Promise<FtEagleEyeResponse>;
    ftParamListWithOptions(request: FtParamListRequest, runtime: $Util.RuntimeOptions): Promise<FtParamListResponse>;
    ftParamList(request: FtParamListRequest): Promise<FtParamListResponse>;
    ftGatedLaunchPolicy4WithOptions(request: FtGatedLaunchPolicy4Request, runtime: $Util.RuntimeOptions): Promise<FtGatedLaunchPolicy4Response>;
    ftGatedLaunchPolicy4(request: FtGatedLaunchPolicy4Request): Promise<FtGatedLaunchPolicy4Response>;
    getEndpoint(productId: string, regionId: string, endpointRule: string, network: string, suffix: string, endpointMap: {
        [key: string]: string;
    }, endpoint: string): string;
}
