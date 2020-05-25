// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String VSwitchId;

    @NameInMap("VSwitchName")
    public String VSwitchName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyVSwitchAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeRequest self = new ModifyVSwitchAttributeRequest();
        return TeaModel.build(map, self);
    }

}
