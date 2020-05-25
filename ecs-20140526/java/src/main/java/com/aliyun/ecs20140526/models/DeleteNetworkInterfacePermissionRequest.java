// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacePermissionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfacePermissionId")
    @Validation(required = true)
    public String networkInterfacePermissionId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteNetworkInterfacePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacePermissionRequest self = new DeleteNetworkInterfacePermissionRequest();
        return TeaModel.build(map, self);
    }

}
