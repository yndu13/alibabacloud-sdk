// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("DomainCount")
    @Validation(required = true)
    public Long domainCount;

    @NameInMap("DomainOnlineCount")
    @Validation(required = true)
    public Long domainOnlineCount;

    @NameInMap("TopDomains")
    @Validation(required = true)
    public DescribeVodTopDomainsByFlowResponseTopDomains topDomains;

    public static DescribeVodTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTopDomainsByFlowResponse self = new DescribeVodTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodTopDomainsByFlowResponseTopDomainsTopDomain extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Rank")
        @Validation(required = true)
        public Long rank;

        @NameInMap("TotalTraffic")
        @Validation(required = true)
        public String totalTraffic;

        @NameInMap("TrafficPercent")
        @Validation(required = true)
        public String trafficPercent;

        @NameInMap("MaxBps")
        @Validation(required = true)
        public Long maxBps;

        @NameInMap("MaxBpsTime")
        @Validation(required = true)
        public String maxBpsTime;

        @NameInMap("TotalAccess")
        @Validation(required = true)
        public Long totalAccess;

        public static DescribeVodTopDomainsByFlowResponseTopDomainsTopDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTopDomainsByFlowResponseTopDomainsTopDomain self = new DescribeVodTopDomainsByFlowResponseTopDomainsTopDomain();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodTopDomainsByFlowResponseTopDomains extends TeaModel {
        @NameInMap("TopDomain")
        @Validation(required = true)
        public java.util.List<DescribeVodTopDomainsByFlowResponseTopDomainsTopDomain> topDomain;

        public static DescribeVodTopDomainsByFlowResponseTopDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTopDomainsByFlowResponseTopDomains self = new DescribeVodTopDomainsByFlowResponseTopDomains();
            return TeaModel.build(map, self);
        }

    }

}
