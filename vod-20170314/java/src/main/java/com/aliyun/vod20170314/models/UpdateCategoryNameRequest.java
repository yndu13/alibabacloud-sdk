// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateCategoryNameRequest extends TeaModel {
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

    @NameInMap("CateName")
    @Validation(required = true)
    public String cateName;

    @NameInMap("CateId")
    @Validation(required = true)
    public String cateId;

    public static UpdateCategoryNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryNameRequest self = new UpdateCategoryNameRequest();
        return TeaModel.build(map, self);
    }

}
