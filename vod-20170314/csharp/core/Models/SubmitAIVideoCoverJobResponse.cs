// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SubmitAIVideoCoverJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoCoverJob")]
        [Validation(Required=true)]
        public SubmitAIVideoCoverJobResponseAIVideoCoverJob AIVideoCoverJob { get; set; }
        public class SubmitAIVideoCoverJobResponseAIVideoCoverJob : TeaModel {
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
