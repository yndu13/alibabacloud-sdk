// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcTrafficDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    public static DescribeVodDomainSrcTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcTrafficDataRequest self = new DescribeVodDomainSrcTrafficDataRequest();
        return TeaModel.build(map, self);
    }

}
