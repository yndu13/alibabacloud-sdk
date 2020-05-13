// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoCensorJobRequest extends TeaModel {
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

    @NameInMap("AIVideoCensorJobIds")
    @Validation(required = true)
    public String AIVideoCensorJobIds;

    public static ListAIVideoCensorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCensorJobRequest self = new ListAIVideoCensorJobRequest();
        return TeaModel.build(map, self);
    }

}
