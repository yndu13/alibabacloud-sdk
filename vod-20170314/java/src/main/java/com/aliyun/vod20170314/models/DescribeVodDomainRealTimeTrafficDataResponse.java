// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeTrafficDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("RealTimeTrafficDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval;

    public static DescribeVodDomainRealTimeTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeTrafficDataResponse self = new DescribeVodDomainRealTimeTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule self = new DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval self = new DescribeVodDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
