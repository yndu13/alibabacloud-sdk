// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetImageInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static GetImageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfoRequest self = new GetImageInfoRequest();
        return TeaModel.build(map, self);
    }

}
