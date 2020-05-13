// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCompanionresourceInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CompanionResourceId")
    @Validation(required = true)
    public String companionResourceId;

    public static GetCompanionresourceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompanionresourceInfoRequest self = new GetCompanionresourceInfoRequest();
        return TeaModel.build(map, self);
    }

}
