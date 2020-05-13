// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeHttpCodeDataResponse extends TeaModel {
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

    @NameInMap("RealTimeHttpCodeData")
    @Validation(required = true)
    public DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData realTimeHttpCodeData;

    public static DescribeVodDomainRealTimeHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeHttpCodeDataResponse self = new DescribeVodDomainRealTimeHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Proportion")
        @Validation(required = true)
        public String proportion;

        @NameInMap("Count")
        @Validation(required = true)
        public String count;

        public static DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData self = new DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("RealTimeCodeProportionData")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData;

        public static DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue self = new DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue value;

        public static DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData self = new DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData> usageData;

        public static DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData self = new DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData();
            return TeaModel.build(map, self);
        }

    }

}
