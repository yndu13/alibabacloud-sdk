// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoTerrorismRecogJobRequest extends TeaModel {
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

    @NameInMap("AIVideoTerrorismRecogConfig")
    public String AIVideoTerrorismRecogConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitAIVideoTerrorismRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoTerrorismRecogJobRequest self = new SubmitAIVideoTerrorismRecogJobRequest();
        return TeaModel.build(map, self);
    }

}
