// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetBatchPlayInfoRequest : TeaModel {
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

        [NameInMap("ResourceRealOwnerId")]
        [Validation(Required=false)]
        public long ResourceRealOwnerId { get; set; }

        [NameInMap("VideoIds")]
        [Validation(Required=true)]
        public string VideoIds { get; set; }

        [NameInMap("Formats")]
        [Validation(Required=false)]
        public string Formats { get; set; }

        [NameInMap("AuthTimeout")]
        [Validation(Required=false)]
        public long AuthTimeout { get; set; }

        [NameInMap("Rand")]
        [Validation(Required=false)]
        public string Rand { get; set; }

        [NameInMap("AuthInfo")]
        [Validation(Required=false)]
        public string AuthInfo { get; set; }

        [NameInMap("Channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        [NameInMap("PlayerVersion")]
        [Validation(Required=false)]
        public string PlayerVersion { get; set; }

        [NameInMap("OutputType")]
        [Validation(Required=false)]
        public string OutputType { get; set; }

        [NameInMap("StreamType")]
        [Validation(Required=false)]
        public string StreamType { get; set; }

        [NameInMap("ReAuthInfo")]
        [Validation(Required=false)]
        public string ReAuthInfo { get; set; }

    }

}
