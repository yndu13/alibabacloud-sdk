// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    public static ProduceEditingProjectVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoRequest self = new ProduceEditingProjectVideoRequest();
        return TeaModel.build(map, self);
    }

}
