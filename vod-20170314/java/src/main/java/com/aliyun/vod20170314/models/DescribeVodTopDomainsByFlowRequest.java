// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodTopDomainsByFlowRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Product")
    public String product;

    @NameInMap("Limit")
    public Long limit;

    public static DescribeVodTopDomainsByFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTopDomainsByFlowRequest self = new DescribeVodTopDomainsByFlowRequest();
        return TeaModel.build(map, self);
    }

}
