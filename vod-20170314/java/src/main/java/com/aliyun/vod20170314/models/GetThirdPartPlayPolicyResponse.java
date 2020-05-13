// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetThirdPartPlayPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PolicyInfo")
    @Validation(required = true)
    public String policyInfo;

    public static GetThirdPartPlayPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThirdPartPlayPolicyResponse self = new GetThirdPartPlayPolicyResponse();
        return TeaModel.build(map, self);
    }

}
