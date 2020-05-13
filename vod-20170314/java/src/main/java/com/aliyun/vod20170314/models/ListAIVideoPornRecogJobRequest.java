// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoPornRecogJobRequest extends TeaModel {
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

    @NameInMap("AIVideoPornRecogJobIds")
    @Validation(required = true)
    public String AIVideoPornRecogJobIds;

    public static ListAIVideoPornRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoPornRecogJobRequest self = new ListAIVideoPornRecogJobRequest();
        return TeaModel.build(map, self);
    }

}
