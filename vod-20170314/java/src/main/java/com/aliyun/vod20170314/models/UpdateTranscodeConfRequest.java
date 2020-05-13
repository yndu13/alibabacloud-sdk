// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateTranscodeConfRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ids")
    @Validation(required = true)
    public String ids;

    @NameInMap("EncryptTemplayeIds")
    public String encryptTemplayeIds;

    public static UpdateTranscodeConfRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeConfRequest self = new UpdateTranscodeConfRequest();
        return TeaModel.build(map, self);
    }

}
