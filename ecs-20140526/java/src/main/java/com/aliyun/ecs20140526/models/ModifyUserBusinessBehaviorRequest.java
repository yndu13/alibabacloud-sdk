// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyUserBusinessBehaviorRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("statusKey")
    @Validation(required = true)
    public String statusKey;

    @NameInMap("statusValue")
    @Validation(required = true)
    public String statusValue;

    public static ModifyUserBusinessBehaviorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserBusinessBehaviorRequest self = new ModifyUserBusinessBehaviorRequest();
        return TeaModel.build(map, self);
    }

}
