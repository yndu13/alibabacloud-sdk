// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVpcAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("Description")
    public String description;

    @NameInMap("VpcName")
    public String vpcName;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("UserCidr")
    public String userCidr;

    public static ModifyVpcAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAttributeRequest self = new ModifyVpcAttributeRequest();
        return TeaModel.build(map, self);
    }

}
