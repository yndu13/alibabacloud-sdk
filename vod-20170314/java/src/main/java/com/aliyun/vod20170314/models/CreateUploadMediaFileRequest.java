// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CreateUploadMediaFileRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("FileExtension")
    @Validation(required = true)
    public String fileExtension;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("UserData")
    public String userData;

    public static CreateUploadMediaFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaFileRequest self = new CreateUploadMediaFileRequest();
        return TeaModel.build(map, self);
    }

}
