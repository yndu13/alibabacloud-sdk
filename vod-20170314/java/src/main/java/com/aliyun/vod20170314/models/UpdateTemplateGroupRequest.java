// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateTemplateGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("ToNeedTranscode")
    public String toNeedTranscode;

    public static UpdateTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateGroupRequest self = new UpdateTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
