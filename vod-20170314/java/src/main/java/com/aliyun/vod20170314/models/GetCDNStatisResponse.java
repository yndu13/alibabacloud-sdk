// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCDNStatisResponse extends TeaModel {
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

    @NameInMap("CDNStatisList")
    @Validation(required = true)
    public GetCDNStatisResponseCDNStatisList CDNStatisList;

    public static GetCDNStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCDNStatisResponse self = new GetCDNStatisResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCDNStatisResponseCDNStatisListCDNMetric extends TeaModel {
        @NameInMap("CdnDomain")
        @Validation(required = true)
        public String cdnDomain;

        @NameInMap("StatTime")
        @Validation(required = true)
        public String statTime;

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

        public static GetCDNStatisResponseCDNStatisListCDNMetric build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisResponseCDNStatisListCDNMetric self = new GetCDNStatisResponseCDNStatisListCDNMetric();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCDNStatisResponseCDNStatisList extends TeaModel {
        @NameInMap("CDNMetric")
        @Validation(required = true)
        public java.util.List<GetCDNStatisResponseCDNStatisListCDNMetric> CDNMetric;

        public static GetCDNStatisResponseCDNStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisResponseCDNStatisList self = new GetCDNStatisResponseCDNStatisList();
            return TeaModel.build(map, self);
        }

    }

}
