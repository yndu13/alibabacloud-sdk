// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipNotifyPaidRequest extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("UserCidr")
    public String userCidr;

    public static EipNotifyPaidRequest build(java.util.Map<String, ?> map) throws Exception {
        EipNotifyPaidRequest self = new EipNotifyPaidRequest();
        return TeaModel.build(map, self);
    }

}
