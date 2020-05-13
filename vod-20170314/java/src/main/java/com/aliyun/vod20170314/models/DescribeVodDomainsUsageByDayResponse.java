// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainsUsageByDayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("UsageByDays")
    @Validation(required = true)
    public DescribeVodDomainsUsageByDayResponseUsageByDays usageByDays;

    @NameInMap("UsageTotal")
    @Validation(required = true)
    public DescribeVodDomainsUsageByDayResponseUsageTotal usageTotal;

    public static DescribeVodDomainsUsageByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainsUsageByDayResponse self = new DescribeVodDomainsUsageByDayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainsUsageByDayResponseUsageByDaysUsageByDay extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Qps")
        @Validation(required = true)
        public String qps;

        @NameInMap("BytesHitRate")
        @Validation(required = true)
        public String bytesHitRate;

        @NameInMap("RequestHitRate")
        @Validation(required = true)
        public String requestHitRate;

        @NameInMap("MaxBps")
        @Validation(required = true)
        public String maxBps;

        @NameInMap("MaxBpsTime")
        @Validation(required = true)
        public String maxBpsTime;

        @NameInMap("MaxSrcBps")
        @Validation(required = true)
        public String maxSrcBps;

        @NameInMap("MaxSrcBpsTime")
        @Validation(required = true)
        public String maxSrcBpsTime;

        @NameInMap("TotalAccess")
        @Validation(required = true)
        public String totalAccess;

        @NameInMap("TotalTraffic")
        @Validation(required = true)
        public String totalTraffic;

        public static DescribeVodDomainsUsageByDayResponseUsageByDaysUsageByDay build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainsUsageByDayResponseUsageByDaysUsageByDay self = new DescribeVodDomainsUsageByDayResponseUsageByDaysUsageByDay();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainsUsageByDayResponseUsageByDays extends TeaModel {
        @NameInMap("UsageByDay")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainsUsageByDayResponseUsageByDaysUsageByDay> usageByDay;

        public static DescribeVodDomainsUsageByDayResponseUsageByDays build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainsUsageByDayResponseUsageByDays self = new DescribeVodDomainsUsageByDayResponseUsageByDays();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainsUsageByDayResponseUsageTotal extends TeaModel {
        @NameInMap("BytesHitRate")
        @Validation(required = true)
        public String bytesHitRate;

        @NameInMap("RequestHitRate")
        @Validation(required = true)
        public String requestHitRate;

        @NameInMap("MaxBps")
        @Validation(required = true)
        public String maxBps;

        @NameInMap("MaxBpsTime")
        @Validation(required = true)
        public String maxBpsTime;

        @NameInMap("MaxSrcBps")
        @Validation(required = true)
        public String maxSrcBps;

        @NameInMap("MaxSrcBpsTime")
        @Validation(required = true)
        public String maxSrcBpsTime;

        @NameInMap("TotalAccess")
        @Validation(required = true)
        public String totalAccess;

        @NameInMap("TotalTraffic")
        @Validation(required = true)
        public String totalTraffic;

        public static DescribeVodDomainsUsageByDayResponseUsageTotal build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainsUsageByDayResponseUsageTotal self = new DescribeVodDomainsUsageByDayResponseUsageTotal();
            return TeaModel.build(map, self);
        }

    }

}
