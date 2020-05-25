// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoReleaseTimeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyInstanceAutoReleaseTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoReleaseTimeRequest self = new ModifyInstanceAutoReleaseTimeRequest();
        return TeaModel.build(map, self);
    }

}
