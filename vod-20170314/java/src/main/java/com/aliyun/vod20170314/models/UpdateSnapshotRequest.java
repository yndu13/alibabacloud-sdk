// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateSnapshotRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Time")
    @Validation(required = true)
    public String time;

    @NameInMap("Height")
    public String height;

    @NameInMap("Width")
    public String width;

    @NameInMap("Number")
    @Validation(required = true)
    public String number;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    public static UpdateSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotRequest self = new UpdateSnapshotRequest();
        return TeaModel.build(map, self);
    }

}
