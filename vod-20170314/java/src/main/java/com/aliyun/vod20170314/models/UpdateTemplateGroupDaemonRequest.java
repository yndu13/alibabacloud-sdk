// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateTemplateGroupDaemonRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateGroupId")
    @Validation(required = true)
    public String templateGroupId;

    @NameInMap("UserId")
    @Validation(required = true)
    public Long userId;

    @NameInMap("IsLocked")
    public String isLocked;

    @NameInMap("GroupName")
    public String groupName;

    public static UpdateTemplateGroupDaemonRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateGroupDaemonRequest self = new UpdateTemplateGroupDaemonRequest();
        return TeaModel.build(map, self);
    }

}
