// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetThirdPartPlayPolicyRequest : TeaModel {
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

        [NameInMap("ContentId")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        [NameInMap("Source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        [NameInMap("AuthTimestamp")]
        [Validation(Required=true)]
        public long AuthTimestamp { get; set; }

        [NameInMap("AuthInfo")]
        [Validation(Required=true)]
        public string AuthInfo { get; set; }

    }

}
