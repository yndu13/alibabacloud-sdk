// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class RefreshUploadVideoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    public static RefreshUploadVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadVideoRequest self = new RefreshUploadVideoRequest();
        return TeaModel.build(map, self);
    }

}
