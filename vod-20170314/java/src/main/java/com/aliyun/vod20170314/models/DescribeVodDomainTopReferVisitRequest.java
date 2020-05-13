// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTopReferVisitRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Percent")
    public String percent;

    public static DescribeVodDomainTopReferVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTopReferVisitRequest self = new DescribeVodDomainTopReferVisitRequest();
        return TeaModel.build(map, self);
    }

}
