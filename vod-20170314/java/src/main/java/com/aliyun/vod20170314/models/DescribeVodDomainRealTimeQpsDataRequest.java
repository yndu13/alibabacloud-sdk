// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeQpsDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("IspNameEn")
    public String ispNameEn;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeVodDomainRealTimeQpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeQpsDataRequest self = new DescribeVodDomainRealTimeQpsDataRequest();
        return TeaModel.build(map, self);
    }

}
