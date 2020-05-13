// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GenerateDownloadSecretKeyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("AppIdentification")
    @Validation(required = true)
    public String appIdentification;

    @NameInMap("AppDecryptKey")
    @Validation(required = true)
    public String appDecryptKey;

    public static GenerateDownloadSecretKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadSecretKeyRequest self = new GenerateDownloadSecretKeyRequest();
        return TeaModel.build(map, self);
    }

}
