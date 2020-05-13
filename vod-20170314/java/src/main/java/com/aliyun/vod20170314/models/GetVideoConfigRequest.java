// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetVideoConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("AuthInfo")
    public String authInfo;

    public static GetVideoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoConfigRequest self = new GetVideoConfigRequest();
        return TeaModel.build(map, self);
    }

}
