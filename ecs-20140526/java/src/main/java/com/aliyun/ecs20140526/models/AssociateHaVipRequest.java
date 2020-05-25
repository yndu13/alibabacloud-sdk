// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssociateHaVipRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("HaVipId")
    @Validation(required = true)
    public String haVipId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static AssociateHaVipRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateHaVipRequest self = new AssociateHaVipRequest();
        return TeaModel.build(map, self);
    }

}
