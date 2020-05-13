// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("TemplateId")
    public String templateId;

    public static SubmitAIMediaAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIMediaAuditJobRequest self = new SubmitAIMediaAuditJobRequest();
        return TeaModel.build(map, self);
    }

}
