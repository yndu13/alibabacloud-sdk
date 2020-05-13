// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoCategoryJobRequest extends TeaModel {
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

    @NameInMap("AIVideoCategoryJobIds")
    @Validation(required = true)
    public String AIVideoCategoryJobIds;

    public static ListAIVideoCategoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCategoryJobRequest self = new ListAIVideoCategoryJobRequest();
        return TeaModel.build(map, self);
    }

}
