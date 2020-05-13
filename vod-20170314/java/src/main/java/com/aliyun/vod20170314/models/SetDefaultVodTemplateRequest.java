// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetDefaultVodTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VodTemplateId")
    @Validation(required = true)
    public String vodTemplateId;

    public static SetDefaultVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultVodTemplateRequest self = new SetDefaultVodTemplateRequest();
        return TeaModel.build(map, self);
    }

}
