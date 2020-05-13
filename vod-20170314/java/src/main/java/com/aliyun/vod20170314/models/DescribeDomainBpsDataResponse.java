// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataResponse extends TeaModel {
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

    @NameInMap("BpsDataPerInterval")
    @Validation(required = true)
    public DescribeDomainBpsDataResponseBpsDataPerInterval bpsDataPerInterval;

    @NameInMap("SupplyBpsDatas")
    @Validation(required = true)
    public DescribeDomainBpsDataResponseSupplyBpsDatas supplyBpsDatas;

    public static DescribeDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataResponse self = new DescribeDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDomainBpsDataResponseBpsDataPerIntervalDataModule extends TeaModel {
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

        @NameInMap("L2Value")
        @Validation(required = true)
        public String l2Value;

        @NameInMap("DomesticL2Value")
        @Validation(required = true)
        public String domesticL2Value;

        @NameInMap("OverseasL2Value")
        @Validation(required = true)
        public String overseasL2Value;

        @NameInMap("DynamicValue")
        @Validation(required = true)
        public Long dynamicValue;

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

        public static DescribeDomainBpsDataResponseBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBpsDataPerIntervalDataModule self = new DescribeDomainBpsDataResponseBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainBpsDataResponseBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeDomainBpsDataResponseBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDomainBpsDataResponseBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBpsDataPerInterval self = new DescribeDomainBpsDataResponseBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainBpsDataResponseSupplyBpsDatasDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDomainBpsDataResponseSupplyBpsDatasDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseSupplyBpsDatasDataModule self = new DescribeDomainBpsDataResponseSupplyBpsDatasDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainBpsDataResponseSupplyBpsDatas extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeDomainBpsDataResponseSupplyBpsDatasDataModule> dataModule;

        public static DescribeDomainBpsDataResponseSupplyBpsDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseSupplyBpsDatas self = new DescribeDomainBpsDataResponseSupplyBpsDatas();
            return TeaModel.build(map, self);
        }

    }

}
