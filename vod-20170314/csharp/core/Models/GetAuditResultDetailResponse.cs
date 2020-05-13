// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAuditResultDetailResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIAuditResultDetail")]
        [Validation(Required=true)]
        public GetAuditResultDetailResponseAIAuditResultDetail AIAuditResultDetail { get; set; }
        public class GetAuditResultDetailResponseAIAuditResultDetail : TeaModel {
            [NameInMap("Total")]
            [Validation(Required=true)]
            public int? Total { get; set; }
            [NameInMap("List")]
            [Validation(Required=true)]
            public List<GetAuditResultDetailResponseAIAuditResultDetailList> List { get; set; }
            public class GetAuditResultDetailResponseAIAuditResultDetailList : TeaModel {
                    public string PornLabel { get; set; }
                    public string PornScore { get; set; }
                    public string TerrorismLabel { get; set; }
                    public string TerrorismScore { get; set; }
                    public string Index { get; set; }
                    public string Object { get; set; }
                    public string Timestamp { get; set; }
            }
        };

    }

}
