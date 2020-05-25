// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String VSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyInstanceVpcAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeRequest self = new ModifyInstanceVpcAttributeRequest();
        return TeaModel.build(map, self);
    }

}
