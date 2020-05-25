// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    public static CreateNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponse self = new CreateNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

}
