// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetCustomerConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetCustomerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCustomerConfigResponse self = new SetCustomerConfigResponse();
        return TeaModel.build(map, self);
    }

}
