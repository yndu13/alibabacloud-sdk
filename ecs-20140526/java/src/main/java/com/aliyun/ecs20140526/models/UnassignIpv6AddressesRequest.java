// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignIpv6AddressesRequest extends TeaModel {
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

    @NameInMap("Ipv6Address")
    @Validation(required = true)
    public java.util.List<String> ipv6Address;

    public static UnassignIpv6AddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignIpv6AddressesRequest self = new UnassignIpv6AddressesRequest();
        return TeaModel.build(map, self);
    }

}
