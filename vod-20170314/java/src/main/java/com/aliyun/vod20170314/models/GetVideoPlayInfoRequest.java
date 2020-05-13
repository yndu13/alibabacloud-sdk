// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetVideoPlayInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Channel")
    @Validation(required = true)
    public String channel;

    @NameInMap("ClientTS")
    @Validation(required = true)
    public Long clientTS;

    @NameInMap("ClientVersion")
    @Validation(required = true)
    public String clientVersion;

    @NameInMap("PlaySign")
    @Validation(required = true)
    public String playSign;

    @NameInMap("SignVersion")
    @Validation(required = true)
    public String signVersion;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    public static GetVideoPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayInfoRequest self = new GetVideoPlayInfoRequest();
        return TeaModel.build(map, self);
    }

}
