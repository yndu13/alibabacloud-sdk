// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateAudioConfigRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateIds")
    @Validation(required = true)
    public String templateIds;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static UpdateAudioConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAudioConfigRequest self = new UpdateAudioConfigRequest();
        return TeaModel.build(map, self);
    }

}
