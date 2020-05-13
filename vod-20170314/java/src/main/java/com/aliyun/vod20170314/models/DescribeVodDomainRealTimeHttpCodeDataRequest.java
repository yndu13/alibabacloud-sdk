// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeHttpCodeDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IspNameEn")
    public String ispNameEn;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    public static DescribeVodDomainRealTimeHttpCodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeHttpCodeDataRequest self = new DescribeVodDomainRealTimeHttpCodeDataRequest();
        return TeaModel.build(map, self);
    }

}
