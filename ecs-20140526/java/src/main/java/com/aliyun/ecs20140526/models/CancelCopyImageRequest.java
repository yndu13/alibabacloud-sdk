// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelCopyImageRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CancelCopyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCopyImageRequest self = new CancelCopyImageRequest();
        return TeaModel.build(map, self);
    }

}
