// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddTemplateGroupRequest extends TeaModel {
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

    @NameInMap("ToNeedTranscode")
    @Validation(required = true)
    public String toNeedTranscode;

    public static AddTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTemplateGroupRequest self = new AddTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
