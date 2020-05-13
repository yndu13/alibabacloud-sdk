// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetBatchPlayInfoRequest extends TeaModel {
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

    @NameInMap("VideoIds")
    @Validation(required = true)
    public String videoIds;

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

    public static GetBatchPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchPlayInfoRequest self = new GetBatchPlayInfoRequest();
        return TeaModel.build(map, self);
    }

}
