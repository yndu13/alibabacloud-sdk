// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Title")
    public String title;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("MediaExt")
    @Validation(required = true)
    public String mediaExt;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileSize")
    public String fileSize;

    @NameInMap("UserData")
    public String userData;

    public static CreateUploadAttachedMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaRequest self = new CreateUploadAttachedMediaRequest();
        return TeaModel.build(map, self);
    }

}
