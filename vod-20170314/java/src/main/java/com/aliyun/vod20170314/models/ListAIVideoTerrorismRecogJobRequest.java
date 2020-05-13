// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoTerrorismRecogJobRequest extends TeaModel {
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

    @NameInMap("AIVideoTerrorismRecogJobIds")
    @Validation(required = true)
    public String AIVideoTerrorismRecogJobIds;

    public static ListAIVideoTerrorismRecogJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoTerrorismRecogJobRequest self = new ListAIVideoTerrorismRecogJobRequest();
        return TeaModel.build(map, self);
    }

}
