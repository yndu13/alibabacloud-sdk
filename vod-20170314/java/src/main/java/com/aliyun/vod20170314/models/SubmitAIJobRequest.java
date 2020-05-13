// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIJobRequest extends TeaModel {
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

    @NameInMap("Types")
    public String types;

    @NameInMap("Config")
    public String config;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("MediaType")
    public String mediaType;

    public static SubmitAIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIJobRequest self = new SubmitAIJobRequest();
        return TeaModel.build(map, self);
    }

}
