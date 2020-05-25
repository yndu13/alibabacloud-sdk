// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssignPrivateIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressesResponse self = new AssignPrivateIpAddressesResponse();
        return TeaModel.build(map, self);
    }

}
