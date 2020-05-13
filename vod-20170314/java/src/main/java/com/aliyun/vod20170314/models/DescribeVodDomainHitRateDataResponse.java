// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainHitRateDataResponse extends TeaModel {
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

    @NameInMap("HitRateInterval")
    @Validation(required = true)
    public DescribeVodDomainHitRateDataResponseHitRateInterval hitRateInterval;

    public static DescribeVodDomainHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainHitRateDataResponse self = new DescribeVodDomainHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainHitRateDataResponseHitRateIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("HttpsValue")
        @Validation(required = true)
        public String httpsValue;

        public static DescribeVodDomainHitRateDataResponseHitRateIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHitRateDataResponseHitRateIntervalDataModule self = new DescribeVodDomainHitRateDataResponseHitRateIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainHitRateDataResponseHitRateInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainHitRateDataResponseHitRateIntervalDataModule> dataModule;

        public static DescribeVodDomainHitRateDataResponseHitRateInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHitRateDataResponseHitRateInterval self = new DescribeVodDomainHitRateDataResponseHitRateInterval();
            return TeaModel.build(map, self);
        }

    }

}
