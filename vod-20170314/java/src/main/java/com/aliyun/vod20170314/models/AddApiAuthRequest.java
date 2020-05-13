// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddApiAuthRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("State")
    public Integer state;

    @NameInMap("PlayKey")
    @Validation(required = true)
    public String playKey;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("SignVersion")
    @Validation(required = true)
    public String signVersion;

    @NameInMap("Channel")
    @Validation(required = true)
    public String channel;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("ClientVersion")
    @Validation(required = true)
    public String clientVersion;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    public static AddApiAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        AddApiAuthRequest self = new AddApiAuthRequest();
        return TeaModel.build(map, self);
    }

}
