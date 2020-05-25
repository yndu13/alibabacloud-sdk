// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConnectRouterInterfaceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    public static ConnectRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConnectRouterInterfaceRequest self = new ConnectRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

}
