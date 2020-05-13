// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAIServiceRequest extends TeaModel {
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

    @NameInMap("Types")
    @Validation(required = true)
    public String types;

    public static GetAIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIServiceRequest self = new GetAIServiceRequest();
        return TeaModel.build(map, self);
    }

}
