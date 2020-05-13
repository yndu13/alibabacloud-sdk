// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeSrcTrafficDataResponse extends TeaModel {
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

    @NameInMap("RealTimeSrcTrafficDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval;

    public static DescribeVodDomainRealTimeSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeSrcTrafficDataResponse self = new DescribeVodDomainRealTimeSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerIntervalDataModule self = new DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerInterval self = new DescribeVodDomainRealTimeSrcTrafficDataResponseRealTimeSrcTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
