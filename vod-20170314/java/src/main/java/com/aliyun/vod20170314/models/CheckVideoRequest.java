// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CheckVideoRequest extends TeaModel {
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

    @NameInMap("CheckStatus")
    @Validation(required = true)
    public String checkStatus;

    @NameInMap("CheckReason")
    public String checkReason;

    public static CheckVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckVideoRequest self = new CheckVideoRequest();
        return TeaModel.build(map, self);
    }

}
