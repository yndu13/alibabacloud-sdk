// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyLaunchTemplateDefaultVersionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("DefaultVersionNumber")
    @Validation(required = true)
    public Long defaultVersionNumber;

    public static ModifyLaunchTemplateDefaultVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLaunchTemplateDefaultVersionRequest self = new ModifyLaunchTemplateDefaultVersionRequest();
        return TeaModel.build(map, self);
    }

}
