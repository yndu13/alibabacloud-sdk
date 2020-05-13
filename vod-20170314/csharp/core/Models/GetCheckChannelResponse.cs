// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCheckChannelResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Audit")]
        [Validation(Required=true)]
        public GetCheckChannelResponseAudit Audit { get; set; }
        public class GetCheckChannelResponseAudit : TeaModel {
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public string CreateTime { get; set; }
            [NameInMap("UpdateTime")]
            [Validation(Required=true)]
            public string UpdateTime { get; set; }
            [NameInMap("Channel")]
            [Validation(Required=true)]
            public string Channel { get; set; }
            [NameInMap("CustomerId")]
            [Validation(Required=true)]
            public string CustomerId { get; set; }
            [NameInMap("LegalSwitch")]
            [Validation(Required=true)]
            public string LegalSwitch { get; set; }
        };

    }

}
