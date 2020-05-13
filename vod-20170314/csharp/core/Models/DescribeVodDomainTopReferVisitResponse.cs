// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainTopReferVisitResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainName")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        [NameInMap("TopReferList")]
        [Validation(Required=true)]
        public DescribeVodDomainTopReferVisitResponseTopReferList TopReferList { get; set; }
        public class DescribeVodDomainTopReferVisitResponseTopReferList : TeaModel {
            [NameInMap("ReferList")]
            [Validation(Required=true)]
            public List<DescribeVodDomainTopReferVisitResponseTopReferListReferList> ReferList { get; set; }
            public class DescribeVodDomainTopReferVisitResponseTopReferListReferList : TeaModel {
                    public string ReferDetail { get; set; }
                    public string VisitData { get; set; }
                    public float? VisitProportion { get; set; }
                    public string Flow { get; set; }
                    public float? FlowProportion { get; set; }
            }
        };

    }

}
