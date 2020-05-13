// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetVideoInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("ResultTypes")
    public String resultTypes;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static GetVideoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfoRequest self = new GetVideoInfoRequest();
        return TeaModel.build(map, self);
    }

}
