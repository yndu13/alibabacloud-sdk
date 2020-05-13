// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CreateUploadMaterialRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("FileSize")
    @Validation(required = true)
    public Long fileSize;

    @NameInMap("Title")
    @Validation(required = true)
    public String title;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("Tags")
    public String tags;

    public static CreateUploadMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMaterialRequest self = new CreateUploadMaterialRequest();
        return TeaModel.build(map, self);
    }

}
