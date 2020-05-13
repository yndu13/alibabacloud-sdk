// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainHttpCodeDataResponse extends TeaModel {
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

    @NameInMap("HttpCodeData")
    @Validation(required = true)
    public DescribeVodDomainHttpCodeDataResponseHttpCodeData httpCodeData;

    public static DescribeVodDomainHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainHttpCodeDataResponse self = new DescribeVodDomainHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValueCodeProportionData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Proportion")
        @Validation(required = true)
        public String proportion;

        @NameInMap("Count")
        @Validation(required = true)
        public String count;

        public static DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValueCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValueCodeProportionData self = new DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValueCodeProportionData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("CodeProportionData")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValueCodeProportionData> codeProportionData;

        public static DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValue self = new DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageData extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValue value;

        public static DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageData self = new DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainHttpCodeDataResponseHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageData> usageData;

        public static DescribeVodDomainHttpCodeDataResponseHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHttpCodeDataResponseHttpCodeData self = new DescribeVodDomainHttpCodeDataResponseHttpCodeData();
            return TeaModel.build(map, self);
        }

    }

}
