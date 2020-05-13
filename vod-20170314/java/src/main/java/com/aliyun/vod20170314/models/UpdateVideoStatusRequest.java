// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateVideoStatusRequest extends TeaModel {
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

    public static UpdateVideoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoStatusRequest self = new UpdateVideoStatusRequest();
        return TeaModel.build(map, self);
    }

}
