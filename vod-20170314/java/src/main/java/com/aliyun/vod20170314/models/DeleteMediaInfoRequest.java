// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteMediaInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoIds")
    @Validation(required = true)
    public String videoIds;

    public static DeleteMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfoRequest self = new DeleteMediaInfoRequest();
        return TeaModel.build(map, self);
    }

}
