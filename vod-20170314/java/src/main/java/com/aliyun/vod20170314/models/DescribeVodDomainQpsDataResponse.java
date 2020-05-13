// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainQpsDataResponse extends TeaModel {
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

    @NameInMap("QpsDataInterval")
    @Validation(required = true)
    public DescribeVodDomainQpsDataResponseQpsDataInterval qpsDataInterval;

    public static DescribeVodDomainQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainQpsDataResponse self = new DescribeVodDomainQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainQpsDataResponseQpsDataIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("DomesticValue")
        @Validation(required = true)
        public String domesticValue;

        @NameInMap("OverseasValue")
        @Validation(required = true)
        public String overseasValue;

        @NameInMap("AccValue")
        @Validation(required = true)
        public String accValue;

        @NameInMap("AccDomesticValue")
        @Validation(required = true)
        public String accDomesticValue;

        @NameInMap("AccOverseasValue")
        @Validation(required = true)
        public String accOverseasValue;

        @NameInMap("HttpsValue")
        @Validation(required = true)
        public String httpsValue;

        @NameInMap("HttpsDomesticValue")
        @Validation(required = true)
        public String httpsDomesticValue;

        @NameInMap("HttpsOverseasValue")
        @Validation(required = true)
        public String httpsOverseasValue;

        @NameInMap("HttpsAccValue")
        @Validation(required = true)
        public String httpsAccValue;

        @NameInMap("HttpsAccDomesticValue")
        @Validation(required = true)
        public String httpsAccDomesticValue;

        @NameInMap("HttpsAccOverseasValue")
        @Validation(required = true)
        public String httpsAccOverseasValue;

        public static DescribeVodDomainQpsDataResponseQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainQpsDataResponseQpsDataIntervalDataModule self = new DescribeVodDomainQpsDataResponseQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainQpsDataResponseQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainQpsDataResponseQpsDataIntervalDataModule> dataModule;

        public static DescribeVodDomainQpsDataResponseQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainQpsDataResponseQpsDataInterval self = new DescribeVodDomainQpsDataResponseQpsDataInterval();
            return TeaModel.build(map, self);
        }

    }

}
