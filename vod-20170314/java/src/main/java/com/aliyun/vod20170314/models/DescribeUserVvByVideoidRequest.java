// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVvByVideoidRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Videoid")
    @Validation(required = true)
    public String videoid;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    public static DescribeUserVvByVideoidRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVvByVideoidRequest self = new DescribeUserVvByVideoidRequest();
        return TeaModel.build(map, self);
    }

}
