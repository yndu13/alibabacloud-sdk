// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeDomainFlowDataResponse extends TeaModel {
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

    @NameInMap("FlowDataPerInterval")
    @Validation(required = true)
    public DescribeDomainFlowDataResponseFlowDataPerInterval flowDataPerInterval;

    public static DescribeDomainFlowDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainFlowDataResponse self = new DescribeDomainFlowDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDomainFlowDataResponseFlowDataPerIntervalDataModule extends TeaModel {
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

        @NameInMap("DynamicValue")
        @Validation(required = true)
        public String dynamicValue;

        @NameInMap("DynamicDomesticValue")
        @Validation(required = true)
        public String dynamicDomesticValue;

        @NameInMap("DynamicOverseasValue")
        @Validation(required = true)
        public String dynamicOverseasValue;

        @NameInMap("StaticValue")
        @Validation(required = true)
        public String staticValue;

        @NameInMap("StaticDomesticValue")
        @Validation(required = true)
        public String staticDomesticValue;

        @NameInMap("StaticOverseasValue")
        @Validation(required = true)
        public String staticOverseasValue;

        public static DescribeDomainFlowDataResponseFlowDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFlowDataResponseFlowDataPerIntervalDataModule self = new DescribeDomainFlowDataResponseFlowDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainFlowDataResponseFlowDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeDomainFlowDataResponseFlowDataPerIntervalDataModule> dataModule;

        public static DescribeDomainFlowDataResponseFlowDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFlowDataResponseFlowDataPerInterval self = new DescribeDomainFlowDataResponseFlowDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
