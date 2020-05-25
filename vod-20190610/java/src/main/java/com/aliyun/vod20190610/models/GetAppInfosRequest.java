// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20190610.models;

import com.aliyun.tea.*;

public class GetAppInfosRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("AppIds")
    @Validation(required = true)
    public String appIds;

    public static GetAppInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInfosRequest self = new GetAppInfosRequest();
        return TeaModel.build(map, self);
    }

}
