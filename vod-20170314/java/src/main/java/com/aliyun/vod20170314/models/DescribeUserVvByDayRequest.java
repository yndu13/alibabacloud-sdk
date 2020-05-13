// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVvByDayRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("VideoType")
    @Validation(required = true)
    public String videoType;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    public static DescribeUserVvByDayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVvByDayRequest self = new DescribeUserVvByDayRequest();
        return TeaModel.build(map, self);
    }

}
