// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateApiAuthRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("State")
    public Integer state;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("SignVersion")
    @Validation(required = true)
    public String signVersion;

    @NameInMap("Channel")
    @Validation(required = true)
    public String channel;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static UpdateApiAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiAuthRequest self = new UpdateApiAuthRequest();
        return TeaModel.build(map, self);
    }

}
