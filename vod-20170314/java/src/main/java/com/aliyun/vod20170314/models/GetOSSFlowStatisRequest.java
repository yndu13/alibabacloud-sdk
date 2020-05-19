// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetOSSFlowStatisRequest extends TeaModel {
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
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTimeUTC")
    public String startTimeUTC;

    @NameInMap("EndTimeUTC")
    public String endTimeUTC;

    @NameInMap("Level")
    @Validation(required = true)
    public String level;

    @NameInMap("Division")
    public String division;

    public static GetOSSFlowStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOSSFlowStatisRequest self = new GetOSSFlowStatisRequest();
        return TeaModel.build(map, self);
    }

}