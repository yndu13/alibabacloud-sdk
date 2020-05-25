// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoReleaseTimeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyDedicatedHostAutoReleaseTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoReleaseTimeRequest self = new ModifyDedicatedHostAutoReleaseTimeRequest();
        return TeaModel.build(map, self);
    }

}
