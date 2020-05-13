// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListTemplateGroupRequest extends TeaModel {
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

    @NameInMap("IsContainsTemplates")
    public Boolean isContainsTemplates;

    public static ListTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupRequest self = new ListTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
