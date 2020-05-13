// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRegionDataResponse extends TeaModel {
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

    @NameInMap("Value")
    @Validation(required = true)
    public DescribeVodDomainRegionDataResponseValue value;

    public static DescribeVodDomainRegionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRegionDataResponse self = new DescribeVodDomainRegionDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRegionDataResponseValueRegionProportionData extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Proportion")
        @Validation(required = true)
        public String proportion;

        @NameInMap("RegionEname")
        @Validation(required = true)
        public String regionEname;

        @NameInMap("AvgObjectSize")
        @Validation(required = true)
        public String avgObjectSize;

        @NameInMap("AvgResponseTime")
        @Validation(required = true)
        public String avgResponseTime;

        @NameInMap("Bps")
        @Validation(required = true)
        public String bps;

        @NameInMap("Qps")
        @Validation(required = true)
        public String qps;

        @NameInMap("AvgResponseRate")
        @Validation(required = true)
        public String avgResponseRate;

        @NameInMap("ReqErrRate")
        @Validation(required = true)
        public String reqErrRate;

        @NameInMap("TotalBytes")
        @Validation(required = true)
        public String totalBytes;

        @NameInMap("BytesProportion")
        @Validation(required = true)
        public String bytesProportion;

        @NameInMap("TotalQuery")
        @Validation(required = true)
        public String totalQuery;

        public static DescribeVodDomainRegionDataResponseValueRegionProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRegionDataResponseValueRegionProportionData self = new DescribeVodDomainRegionDataResponseValueRegionProportionData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRegionDataResponseValue extends TeaModel {
        @NameInMap("RegionProportionData")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRegionDataResponseValueRegionProportionData> regionProportionData;

        public static DescribeVodDomainRegionDataResponseValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRegionDataResponseValue self = new DescribeVodDomainRegionDataResponseValue();
            return TeaModel.build(map, self);
        }

    }

}
