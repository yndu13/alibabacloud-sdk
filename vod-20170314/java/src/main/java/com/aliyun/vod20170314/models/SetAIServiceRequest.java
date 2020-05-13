// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetAIServiceRequest extends TeaModel {
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

    @NameInMap("Operation")
    @Validation(required = true)
    public String operation;

    @NameInMap("Types")
    @Validation(required = true)
    public String types;

    public static SetAIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAIServiceRequest self = new SetAIServiceRequest();
        return TeaModel.build(map, self);
    }

}
