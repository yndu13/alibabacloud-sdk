// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainPvDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("PvDataInterval")
    @Validation(required = true)
    public DescribeVodDomainPvDataResponsePvDataInterval pvDataInterval;

    public static DescribeVodDomainPvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainPvDataResponse self = new DescribeVodDomainPvDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainPvDataResponsePvDataIntervalPvDataInterval extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeVodDomainPvDataResponsePvDataIntervalPvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainPvDataResponsePvDataIntervalPvDataInterval self = new DescribeVodDomainPvDataResponsePvDataIntervalPvDataInterval();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainPvDataResponsePvDataInterval extends TeaModel {
        @NameInMap("PvDataInterval")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainPvDataResponsePvDataIntervalPvDataInterval> pvDataInterval;

        public static DescribeVodDomainPvDataResponsePvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainPvDataResponsePvDataInterval self = new DescribeVodDomainPvDataResponsePvDataInterval();
            return TeaModel.build(map, self);
        }

    }

}
