// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserUvByDayRequest extends TeaModel {
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

    public static DescribeUserUvByDayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUvByDayRequest self = new DescribeUserUvByDayRequest();
        return TeaModel.build(map, self);
    }

}
