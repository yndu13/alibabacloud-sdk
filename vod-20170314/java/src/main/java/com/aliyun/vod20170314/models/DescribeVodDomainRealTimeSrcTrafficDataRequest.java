// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeSrcTrafficDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeVodDomainRealTimeSrcTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeSrcTrafficDataRequest self = new DescribeVodDomainRealTimeSrcTrafficDataRequest();
        return TeaModel.build(map, self);
    }

}
