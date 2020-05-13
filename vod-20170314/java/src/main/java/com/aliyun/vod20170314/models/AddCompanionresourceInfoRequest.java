// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddCompanionresourceInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaFileId")
    @Validation(required = true)
    public String mediaFileId;

    @NameInMap("CompanionResourceType")
    @Validation(required = true)
    public String companionResourceType;

    @NameInMap("CompanionResourceConfig")
    @Validation(required = true)
    public String companionResourceConfig;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceTags")
    public String resourceTags;

    public static AddCompanionresourceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCompanionresourceInfoRequest self = new AddCompanionresourceInfoRequest();
        return TeaModel.build(map, self);
    }

}
