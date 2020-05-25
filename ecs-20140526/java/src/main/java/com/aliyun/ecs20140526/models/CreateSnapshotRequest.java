// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Tag")
    public java.util.List<CreateSnapshotRequestTag> tag;

    public static CreateSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotRequest self = new CreateSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateSnapshotRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static CreateSnapshotRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSnapshotRequestTag self = new CreateSnapshotRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
