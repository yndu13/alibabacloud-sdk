// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteAudioTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static DeleteAudioTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAudioTemplateRequest self = new DeleteAudioTemplateRequest();
        return TeaModel.build(map, self);
    }

}
