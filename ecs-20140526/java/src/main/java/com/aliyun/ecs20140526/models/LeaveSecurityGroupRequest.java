// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class LeaveSecurityGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static LeaveSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        LeaveSecurityGroupRequest self = new LeaveSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

}
