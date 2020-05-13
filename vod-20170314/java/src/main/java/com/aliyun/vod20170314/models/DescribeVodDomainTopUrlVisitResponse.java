// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTopUrlVisitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("AllUrlList")
    @Validation(required = true)
    public DescribeVodDomainTopUrlVisitResponseAllUrlList allUrlList;

    @NameInMap("Url200List")
    @Validation(required = true)
    public DescribeVodDomainTopUrlVisitResponseUrl200List url200List;

    @NameInMap("Url300List")
    @Validation(required = true)
    public DescribeVodDomainTopUrlVisitResponseUrl300List url300List;

    @NameInMap("Url400List")
    @Validation(required = true)
    public DescribeVodDomainTopUrlVisitResponseUrl400List url400List;

    @NameInMap("Url500List")
    @Validation(required = true)
    public DescribeVodDomainTopUrlVisitResponseUrl500List url500List;

    public static DescribeVodDomainTopUrlVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTopUrlVisitResponse self = new DescribeVodDomainTopUrlVisitResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainTopUrlVisitResponseAllUrlListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        @Validation(required = true)
        public String urlDetail;

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

        public static DescribeVodDomainTopUrlVisitResponseAllUrlListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseAllUrlListUrlList self = new DescribeVodDomainTopUrlVisitResponseAllUrlListUrlList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseAllUrlList extends TeaModel {
        @NameInMap("UrlList")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainTopUrlVisitResponseAllUrlListUrlList> urlList;

        public static DescribeVodDomainTopUrlVisitResponseAllUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseAllUrlList self = new DescribeVodDomainTopUrlVisitResponseAllUrlList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl200ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        @Validation(required = true)
        public String urlDetail;

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

        public static DescribeVodDomainTopUrlVisitResponseUrl200ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl200ListUrlList self = new DescribeVodDomainTopUrlVisitResponseUrl200ListUrlList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl200List extends TeaModel {
        @NameInMap("UrlList")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainTopUrlVisitResponseUrl200ListUrlList> urlList;

        public static DescribeVodDomainTopUrlVisitResponseUrl200List build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl200List self = new DescribeVodDomainTopUrlVisitResponseUrl200List();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl300ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        @Validation(required = true)
        public String urlDetail;

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

        public static DescribeVodDomainTopUrlVisitResponseUrl300ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl300ListUrlList self = new DescribeVodDomainTopUrlVisitResponseUrl300ListUrlList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl300List extends TeaModel {
        @NameInMap("UrlList")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainTopUrlVisitResponseUrl300ListUrlList> urlList;

        public static DescribeVodDomainTopUrlVisitResponseUrl300List build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl300List self = new DescribeVodDomainTopUrlVisitResponseUrl300List();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl400ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        @Validation(required = true)
        public String urlDetail;

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

        public static DescribeVodDomainTopUrlVisitResponseUrl400ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl400ListUrlList self = new DescribeVodDomainTopUrlVisitResponseUrl400ListUrlList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl400List extends TeaModel {
        @NameInMap("UrlList")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainTopUrlVisitResponseUrl400ListUrlList> urlList;

        public static DescribeVodDomainTopUrlVisitResponseUrl400List build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl400List self = new DescribeVodDomainTopUrlVisitResponseUrl400List();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl500ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        @Validation(required = true)
        public String urlDetail;

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

        public static DescribeVodDomainTopUrlVisitResponseUrl500ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl500ListUrlList self = new DescribeVodDomainTopUrlVisitResponseUrl500ListUrlList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTopUrlVisitResponseUrl500List extends TeaModel {
        @NameInMap("UrlList")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainTopUrlVisitResponseUrl500ListUrlList> urlList;

        public static DescribeVodDomainTopUrlVisitResponseUrl500List build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTopUrlVisitResponseUrl500List self = new DescribeVodDomainTopUrlVisitResponseUrl500List();
            return TeaModel.build(map, self);
        }

    }

}
