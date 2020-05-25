// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("VlanId")
    public Integer vlanId;

    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("LocalGatewayIp")
    public String localGatewayIp;

    @NameInMap("PeerGatewayIp")
    public String peerGatewayIp;

    @NameInMap("PeeringSubnetMask")
    public String peeringSubnetMask;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("UserCidr")
    public String userCidr;

    public static ModifyVirtualBorderRouterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBorderRouterAttributeRequest self = new ModifyVirtualBorderRouterAttributeRequest();
        return TeaModel.build(map, self);
    }

}
