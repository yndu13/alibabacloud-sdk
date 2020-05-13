// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainHitRateDataRequest extends TeaModel {
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

    @NameInMap("IspNameEn")
    public String ispNameEn;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    public static DescribeVodDomainHitRateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainHitRateDataRequest self = new DescribeVodDomainHitRateDataRequest();
        return TeaModel.build(map, self);
    }

}
