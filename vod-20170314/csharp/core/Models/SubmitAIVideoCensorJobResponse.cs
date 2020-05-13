// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SubmitAIVideoCensorJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoCensorJob")]
        [Validation(Required=true)]
        public SubmitAIVideoCensorJobResponseAIVideoCensorJob AIVideoCensorJob { get; set; }
        public class SubmitAIVideoCensorJobResponseAIVideoCensorJob : TeaModel {
            [NameInMap("JobId")]
            [Validation(Required=true)]
            public string JobId { get; set; }
            [NameInMap("MediaId")]
            [Validation(Required=true)]
            public string MediaId { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("Code")]
            [Validation(Required=true)]
            public string Code { get; set; }
            [NameInMap("Message")]
            [Validation(Required=true)]
            public string Message { get; set; }
            [NameInMap("CreationTime")]
            [Validation(Required=true)]
            public string CreationTime { get; set; }
            [NameInMap("Data")]
            [Validation(Required=true)]
            public string Data { get; set; }
        };

    }

}
