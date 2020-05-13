// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainTopUrlVisitResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainName")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        [NameInMap("AllUrlList")]
        [Validation(Required=true)]
        public DescribeVodDomainTopUrlVisitResponseAllUrlList AllUrlList { get; set; }
        public class DescribeVodDomainTopUrlVisitResponseAllUrlList : TeaModel {
            [NameInMap("UrlList")]
            [Validation(Required=true)]
            public List<DescribeVodDomainTopUrlVisitResponseAllUrlListUrlList> UrlList { get; set; }
            public class DescribeVodDomainTopUrlVisitResponseAllUrlListUrlList : TeaModel {
                    public string UrlDetail { get; set; }
                    public string VisitData { get; set; }
                    public float? VisitProportion { get; set; }
                    public string Flow { get; set; }
                    public float? FlowProportion { get; set; }
            }
        };

        [NameInMap("Url200List")]
        [Validation(Required=true)]
        public DescribeVodDomainTopUrlVisitResponseUrl200List Url200List { get; set; }
        public class DescribeVodDomainTopUrlVisitResponseUrl200List : TeaModel {
            [NameInMap("UrlList")]
            [Validation(Required=true)]
            public List<DescribeVodDomainTopUrlVisitResponseUrl200ListUrlList> UrlList { get; set; }
            public class DescribeVodDomainTopUrlVisitResponseUrl200ListUrlList : TeaModel {
                    public string UrlDetail { get; set; }
                    public string VisitData { get; set; }
                    public float? VisitProportion { get; set; }
                    public string Flow { get; set; }
                    public float? FlowProportion { get; set; }
            }
        };

        [NameInMap("Url300List")]
        [Validation(Required=true)]
        public DescribeVodDomainTopUrlVisitResponseUrl300List Url300List { get; set; }
        public class DescribeVodDomainTopUrlVisitResponseUrl300List : TeaModel {
            [NameInMap("UrlList")]
            [Validation(Required=true)]
            public List<DescribeVodDomainTopUrlVisitResponseUrl300ListUrlList> UrlList { get; set; }
            public class DescribeVodDomainTopUrlVisitResponseUrl300ListUrlList : TeaModel {
                    public string UrlDetail { get; set; }
                    public string VisitData { get; set; }
                    public float? VisitProportion { get; set; }
                    public string Flow { get; set; }
                    public float? FlowProportion { get; set; }
            }
        };

        [NameInMap("Url400List")]
        [Validation(Required=true)]
        public DescribeVodDomainTopUrlVisitResponseUrl400List Url400List { get; set; }
        public class DescribeVodDomainTopUrlVisitResponseUrl400List : TeaModel {
            [NameInMap("UrlList")]
            [Validation(Required=true)]
            public List<DescribeVodDomainTopUrlVisitResponseUrl400ListUrlList> UrlList { get; set; }
            public class DescribeVodDomainTopUrlVisitResponseUrl400ListUrlList : TeaModel {
                    public string UrlDetail { get; set; }
                    public string VisitData { get; set; }
                    public float? VisitProportion { get; set; }
                    public string Flow { get; set; }
                    public float? FlowProportion { get; set; }
            }
        };

        [NameInMap("Url500List")]
        [Validation(Required=true)]
        public DescribeVodDomainTopUrlVisitResponseUrl500List Url500List { get; set; }
        public class DescribeVodDomainTopUrlVisitResponseUrl500List : TeaModel {
            [NameInMap("UrlList")]
            [Validation(Required=true)]
            public List<DescribeVodDomainTopUrlVisitResponseUrl500ListUrlList> UrlList { get; set; }
            public class DescribeVodDomainTopUrlVisitResponseUrl500ListUrlList : TeaModel {
                    public string UrlDetail { get; set; }
                    public string VisitData { get; set; }
                    public float? VisitProportion { get; set; }
                    public string Flow { get; set; }
                    public float? FlowProportion { get; set; }
            }
        };

    }

}
