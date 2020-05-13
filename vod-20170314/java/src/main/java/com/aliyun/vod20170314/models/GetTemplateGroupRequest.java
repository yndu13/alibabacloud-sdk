// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetTemplateGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    public static GetTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateGroupRequest self = new GetTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
