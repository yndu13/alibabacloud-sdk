// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RamRoleName")
    @Validation(required = true)
    public String ramRoleName;

    @NameInMap("InstanceIds")
    @Validation(required = true)
    public String instanceIds;

    public static AttachInstanceRamRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceRamRoleRequest self = new AttachInstanceRamRoleRequest();
        return TeaModel.build(map, self);
    }

}
