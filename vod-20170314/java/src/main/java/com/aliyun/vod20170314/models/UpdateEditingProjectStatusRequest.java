// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateEditingProjectStatusRequest extends TeaModel {
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

    @NameInMap("ProjectIds")
    @Validation(required = true)
    public String projectIds;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static UpdateEditingProjectStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEditingProjectStatusRequest self = new UpdateEditingProjectStatusRequest();
        return TeaModel.build(map, self);
    }

}
