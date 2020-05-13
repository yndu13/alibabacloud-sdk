// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainISPDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeVodDomainISPDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainISPDataRequest self = new DescribeVodDomainISPDataRequest();
        return TeaModel.build(map, self);
    }

}
