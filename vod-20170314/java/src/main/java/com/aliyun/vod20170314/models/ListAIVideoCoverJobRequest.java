// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoCoverJobRequest extends TeaModel {
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

    @NameInMap("AIVideoCoverJobIds")
    @Validation(required = true)
    public String AIVideoCoverJobIds;

    public static ListAIVideoCoverJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCoverJobRequest self = new ListAIVideoCoverJobRequest();
        return TeaModel.build(map, self);
    }

}
