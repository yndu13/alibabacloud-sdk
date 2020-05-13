// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainISPDataResponse extends TeaModel {
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
    public DescribeVodDomainISPDataResponseValue value;

    public static DescribeVodDomainISPDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainISPDataResponse self = new DescribeVodDomainISPDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainISPDataResponseValueISPProportionData extends TeaModel {
        @NameInMap("ISP")
        @Validation(required = true)
        public String ISP;

        @NameInMap("Proportion")
        @Validation(required = true)
        public String proportion;

        @NameInMap("IspEname")
        @Validation(required = true)
        public String ispEname;

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

        public static DescribeVodDomainISPDataResponseValueISPProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainISPDataResponseValueISPProportionData self = new DescribeVodDomainISPDataResponseValueISPProportionData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainISPDataResponseValue extends TeaModel {
        @NameInMap("ISPProportionData")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainISPDataResponseValueISPProportionData> ISPProportionData;

        public static DescribeVodDomainISPDataResponseValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainISPDataResponseValue self = new DescribeVodDomainISPDataResponseValue();
            return TeaModel.build(map, self);
        }

    }

}
