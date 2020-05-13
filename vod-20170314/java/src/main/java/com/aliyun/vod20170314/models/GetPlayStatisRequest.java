// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPlayStatisRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Level")
    public String level;

    public static GetPlayStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayStatisRequest self = new GetPlayStatisRequest();
        return TeaModel.build(map, self);
    }

}
