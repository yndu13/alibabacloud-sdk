// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCategoryJobRequest extends TeaModel {
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

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("AIVideoCategoryConfig")
    public String AIVideoCategoryConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitAIVideoCategoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCategoryJobRequest self = new SubmitAIVideoCategoryJobRequest();
        return TeaModel.build(map, self);
    }

}
