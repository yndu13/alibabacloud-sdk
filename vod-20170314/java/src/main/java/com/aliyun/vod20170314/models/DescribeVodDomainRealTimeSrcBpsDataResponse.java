// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeSrcBpsDataResponse extends TeaModel {
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

    @NameInMap("RealTimeSrcBpsDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerInterval realTimeSrcBpsDataPerInterval;

    public static DescribeVodDomainRealTimeSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeSrcBpsDataResponse self = new DescribeVodDomainRealTimeSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerIntervalDataModule self = new DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerInterval self = new DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
