// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UploadURLs")
    @Validation(required = true)
    public String uploadURLs;

    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("UploadMetadatas")
    public String uploadMetadatas;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("MessageCallback")
    public String messageCallback;

    public static UploadMediaByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLRequest self = new UploadMediaByURLRequest();
        return TeaModel.build(map, self);
    }

}
