// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20190610.models;

import com.aliyun.tea.*;

public class UpdateAppInfoRequest extends TeaModel {
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

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Status")
    public String status;

    public static UpdateAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInfoRequest self = new UpdateAppInfoRequest();
        return TeaModel.build(map, self);
    }

}
