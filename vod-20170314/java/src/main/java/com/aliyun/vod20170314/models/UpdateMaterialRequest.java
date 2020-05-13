// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMaterialRequest extends TeaModel {
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

    @NameInMap("MaterialId")
    @Validation(required = true)
    public String materialId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("CoverUrl")
    public String coverUrl;

    @NameInMap("CateId")
    public Integer cateId;

    public static UpdateMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterialRequest self = new UpdateMaterialRequest();
        return TeaModel.build(map, self);
    }

}
