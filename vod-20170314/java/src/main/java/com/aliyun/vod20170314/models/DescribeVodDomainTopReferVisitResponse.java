// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTopReferVisitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("TopReferList")
    @Validation(required = true)
    public DescribeVodDomainTopReferVisitResponseTopReferList topReferList;

    public static DescribeVodDomainTopReferVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTopReferVisitResponse self = new DescribeVodDomainTopReferVisitResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainTopReferVisitResponseTopReferListReferList extends TeaModel {
        @NameInMap("ReferDetail")
        @Validation(required = true)
        public String referDetail;

        @NameInMap("VisitData")
        @Validation(required = true)
        public String visitData;

        @NameInMap("VisitProportion")
        @Validation(required = true)
        public Double visitProportion;

        @NameInMap("Flow")
        @Validation(required = true)
        public String flow;

        @NameInMap("FlowProportion")
        @Validation(required = true)
        public Double flowProportion;

        public static DescribeVodDomainTopReferVisitResponseTopReferListReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopReferVisitResponseTopReferListReferList self = new DescribeVodDomainTopReferVisitResponseTopReferListReferList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopReferVisitResponseTopReferList extends TeaModel {
        @NameInMap("ReferList")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainTopReferVisitResponseTopReferListReferList> referList;

        public static DescribeVodDomainTopReferVisitResponseTopReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopReferVisitResponseTopReferList self = new DescribeVodDomainTopReferVisitResponseTopReferList();
            return TeaModel.build(map, self);
        }

    }

}
