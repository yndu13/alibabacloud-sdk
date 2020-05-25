// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20190610.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("Formats")
    public String formats;

    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("Rand")
    public String rand;

    @NameInMap("AuthInfo")
    public String authInfo;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("PlayerVersion")
    public String playerVersion;

    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("StreamType")
    public String streamType;

    @NameInMap("ReAuthInfo")
    public String reAuthInfo;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("PlayConfig")
    public String playConfig;

    public static GetPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoRequest self = new GetPlayInfoRequest();
        return TeaModel.build(map, self);
    }

}
