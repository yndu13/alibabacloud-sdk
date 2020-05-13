// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserAvgCountByDayRequest extends TeaModel {
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

    public static DescribeUserAvgCountByDayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAvgCountByDayRequest self = new DescribeUserAvgCountByDayRequest();
        return TeaModel.build(map, self);
    }

}
