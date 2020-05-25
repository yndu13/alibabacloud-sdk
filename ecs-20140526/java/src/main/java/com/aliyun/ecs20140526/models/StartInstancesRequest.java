// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public java.util.List<String> instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BatchOptimization")
    public String batchOptimization;

    public static StartInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesRequest self = new StartInstancesRequest();
        return TeaModel.build(map, self);
    }

}
