// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class NotifyProduceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static NotifyProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyProduceRequest self = new NotifyProduceRequest();
        return TeaModel.build(map, self);
    }

}
