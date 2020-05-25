// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyRequest extends TeaModel {
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

    @NameInMap("ImageFamily")
    @Validation(required = true)
    public String imageFamily;

    public static DescribeImageFromFamilyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromFamilyRequest self = new DescribeImageFromFamilyRequest();
        return TeaModel.build(map, self);
    }

}
