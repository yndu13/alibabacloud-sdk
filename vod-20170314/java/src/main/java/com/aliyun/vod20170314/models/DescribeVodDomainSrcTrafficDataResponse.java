// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcTrafficDataResponse extends TeaModel {
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

    @NameInMap("SrcTrafficDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerInterval srcTrafficDataPerInterval;

    public static DescribeVodDomainSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcTrafficDataResponse self = new DescribeVodDomainSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("HttpsValue")
        @Validation(required = true)
        public String httpsValue;

        public static DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerIntervalDataModule self = new DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerInterval self = new DescribeVodDomainSrcTrafficDataResponseSrcTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
