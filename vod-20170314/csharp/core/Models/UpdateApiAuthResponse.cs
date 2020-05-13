// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateApiAuthResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("ApiAuth")]
        [Validation(Required=true)]
        public UpdateApiAuthResponseApiAuth ApiAuth { get; set; }
        public class UpdateApiAuthResponseApiAuth : TeaModel {
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public string CreateTime { get; set; }
            [NameInMap("ModifyTime")]
            [Validation(Required=true)]
            public string ModifyTime { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public int? Status { get; set; }
            [NameInMap("ExpireTime")]
            [Validation(Required=true)]
            public string ExpireTime { get; set; }
            [NameInMap("SignVersion")]
            [Validation(Required=true)]
            public string SignVersion { get; set; }
            [NameInMap("Channel")]
            [Validation(Required=true)]
            public string Channel { get; set; }
            [NameInMap("Description")]
            [Validation(Required=true)]
            public string Description { get; set; }
            [NameInMap("ClientVersion")]
            [Validation(Required=true)]
            public string ClientVersion { get; set; }
        };

    }

}
