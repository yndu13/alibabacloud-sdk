// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPlayChannelKeyRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SignVersion")
    @Validation(required = true)
    public String signVersion;

    @NameInMap("Channel")
    @Validation(required = true)
    public String channel;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static GetPlayChannelKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayChannelKeyRequest self = new GetPlayChannelKeyRequest();
        return TeaModel.build(map, self);
    }

}
