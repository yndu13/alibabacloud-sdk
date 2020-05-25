// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLimitationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Limitation")
    @Validation(required = true)
    public String limitation;

    public static DescribeLimitationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLimitationRequest self = new DescribeLimitationRequest();
        return TeaModel.build(map, self);
    }

}
