// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAuditResultRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    public static GetAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditResultRequest self = new GetAuditResultRequest();
        return TeaModel.build(map, self);
    }

}
