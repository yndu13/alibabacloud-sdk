// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeTrafficDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeVodDomainRealTimeTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeTrafficDataRequest self = new DescribeVodDomainRealTimeTrafficDataRequest();
        return TeaModel.build(map, self);
    }

}
