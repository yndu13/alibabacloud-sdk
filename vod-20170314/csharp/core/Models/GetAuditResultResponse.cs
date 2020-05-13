// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAuditResultResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIAuditResult")]
        [Validation(Required=true)]
        public GetAuditResultResponseAIAuditResult AIAuditResult { get; set; }
        public class GetAuditResultResponseAIAuditResult : TeaModel {
            [NameInMap("AbnormalModules")]
            [Validation(Required=true)]
            public string AbnormalModules { get; set; }
            [NameInMap("Label")]
            [Validation(Required=true)]
            public string Label { get; set; }
            [NameInMap("PornResult")]
            [Validation(Required=true)]
            public string PornResult { get; set; }
            [NameInMap("TerrorismResult")]
            [Validation(Required=true)]
            public string TerrorismResult { get; set; }
            [NameInMap("TitleResult")]
            [Validation(Required=true)]
            public string TitleResult { get; set; }
            [NameInMap("CoverResult")]
            [Validation(Required=true)]
            public string CoverResult { get; set; }
        };

    }

}
