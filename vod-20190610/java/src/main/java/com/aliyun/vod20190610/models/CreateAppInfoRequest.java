// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20190610.models;

import com.aliyun.tea.*;

public class CreateAppInfoRequest extends TeaModel {
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

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    public static CreateAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoRequest self = new CreateAppInfoRequest();
        return TeaModel.build(map, self);
    }

}
