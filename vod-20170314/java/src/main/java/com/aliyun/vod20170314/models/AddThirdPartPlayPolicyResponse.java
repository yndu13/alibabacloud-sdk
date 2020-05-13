// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddThirdPartPlayPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Count")
    @Validation(required = true)
    public String count;

    public static AddThirdPartPlayPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddThirdPartPlayPolicyResponse self = new AddThirdPartPlayPolicyResponse();
        return TeaModel.build(map, self);
    }

}
