// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcBpsDataResponse extends TeaModel {
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

    @NameInMap("SrcBpsDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerInterval srcBpsDataPerInterval;

    public static DescribeVodDomainSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcBpsDataResponse self = new DescribeVodDomainSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("HttpsValue")
        @Validation(required = true)
        public String httpsValue;

        public static DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerIntervalDataModule self = new DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerInterval self = new DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
