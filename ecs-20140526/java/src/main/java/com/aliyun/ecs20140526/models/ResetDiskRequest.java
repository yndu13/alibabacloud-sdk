// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ResetDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskRequest self = new ResetDiskRequest();
        return TeaModel.build(map, self);
    }

}
