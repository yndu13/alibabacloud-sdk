// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateApiAuthRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        [NameInMap("State")]
        [Validation(Required=false)]
        public int? State { get; set; }

        [NameInMap("ExpireTime")]
        [Validation(Required=false)]
        public string ExpireTime { get; set; }

        [NameInMap("SignVersion")]
        [Validation(Required=true)]
        public string SignVersion { get; set; }

        [NameInMap("Channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        [NameInMap("Description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        [NameInMap("ClientVersion")]
        [Validation(Required=false)]
        public string ClientVersion { get; set; }

        [NameInMap("ResourceRealOwnerId")]
        [Validation(Required=false)]
        public long ResourceRealOwnerId { get; set; }

    }

}
