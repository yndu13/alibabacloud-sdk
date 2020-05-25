// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignPrivateIpAddressesRequest extends TeaModel {
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

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("PrivateIpAddress")
    @Validation(required = true)
    public java.util.List<String> privateIpAddress;

    public static UnassignPrivateIpAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignPrivateIpAddressesRequest self = new UnassignPrivateIpAddressesRequest();
        return TeaModel.build(map, self);
    }

}
