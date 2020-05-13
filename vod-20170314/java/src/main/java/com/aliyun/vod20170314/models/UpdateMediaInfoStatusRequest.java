// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoStatusRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static UpdateMediaInfoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoStatusRequest self = new UpdateMediaInfoStatusRequest();
        return TeaModel.build(map, self);
    }

}
