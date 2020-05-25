// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDeploymentSetRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DeploymentSetId")
    @Validation(required = true)
    public String deploymentSetId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeleteDeploymentSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentSetRequest self = new DeleteDeploymentSetRequest();
        return TeaModel.build(map, self);
    }

}
