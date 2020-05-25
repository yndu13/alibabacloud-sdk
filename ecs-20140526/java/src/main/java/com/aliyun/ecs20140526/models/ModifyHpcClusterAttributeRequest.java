// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyHpcClusterAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("HpcClusterId")
    @Validation(required = true)
    public String hpcClusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static ModifyHpcClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHpcClusterAttributeRequest self = new ModifyHpcClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

}
