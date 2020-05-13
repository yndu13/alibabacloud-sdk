// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetVideoPlayInfoRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("Channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        [NameInMap("ClientTS")]
        [Validation(Required=true)]
        public long ClientTS { get; set; }

        [NameInMap("ClientVersion")]
        [Validation(Required=true)]
        public string ClientVersion { get; set; }

        [NameInMap("PlaySign")]
        [Validation(Required=true)]
        public string PlaySign { get; set; }

        [NameInMap("SignVersion")]
        [Validation(Required=true)]
        public string SignVersion { get; set; }

        [NameInMap("VideoId")]
        [Validation(Required=true)]
        public string VideoId { get; set; }

    }

}
