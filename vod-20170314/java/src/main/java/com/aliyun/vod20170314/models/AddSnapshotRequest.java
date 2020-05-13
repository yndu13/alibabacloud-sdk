// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddSnapshotRequest extends TeaModel {
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
    @Validation(required = true)
    public String height;

    @NameInMap("Width")
    @Validation(required = true)
    public String width;

    @NameInMap("Number")
    @Validation(required = true)
    public String number;

    public static AddSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSnapshotRequest self = new AddSnapshotRequest();
        return TeaModel.build(map, self);
    }

}
