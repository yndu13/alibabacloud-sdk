// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCDNStatisSumResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SumFlowDataValue")
    @Validation(required = true)
    public Long sumFlowDataValue;

    @NameInMap("MaxBpsDataValue")
    @Validation(required = true)
    public Long maxBpsDataValue;

    @NameInMap("Current95BpsDataValue")
    @Validation(required = true)
    public Long current95BpsDataValue;

    @NameInMap("Level")
    @Validation(required = true)
    public String level;

    @NameInMap("CDNStatisList")
    @Validation(required = true)
    public GetCDNStatisSumResponseCDNStatisList CDNStatisList;

    public static GetCDNStatisSumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCDNStatisSumResponse self = new GetCDNStatisSumResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCDNStatisSumResponseCDNStatisListCDNMetric extends TeaModel {
        @NameInMap("StatTime")
        @Validation(required = true)
        public String statTime;

        @NameInMap("StatTimeUTC")
        @Validation(required = true)
        public String statTimeUTC;

        @NameInMap("FlowDataDomesticValue")
        @Validation(required = true)
        public Long flowDataDomesticValue;

        @NameInMap("FlowDataOverseasValue")
        @Validation(required = true)
        public Long flowDataOverseasValue;

        @NameInMap("FlowDataValue")
        @Validation(required = true)
        public Long flowDataValue;

        @NameInMap("BpsDataDomesticValue")
        @Validation(required = true)
        public Long bpsDataDomesticValue;

        @NameInMap("BpsDataOverseasValue")
        @Validation(required = true)
        public Long bpsDataOverseasValue;

        @NameInMap("BpsDataValue")
        @Validation(required = true)
        public Long bpsDataValue;

        public static GetCDNStatisSumResponseCDNStatisListCDNMetric build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisSumResponseCDNStatisListCDNMetric self = new GetCDNStatisSumResponseCDNStatisListCDNMetric();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCDNStatisSumResponseCDNStatisList extends TeaModel {
        @NameInMap("CDNMetric")
        @Validation(required = true)
        public java.util.List<GetCDNStatisSumResponseCDNStatisListCDNMetric> CDNMetric;

        public static GetCDNStatisSumResponseCDNStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisSumResponseCDNStatisList self = new GetCDNStatisSumResponseCDNStatisList();
            return TeaModel.build(map, self);
        }

    }

}
