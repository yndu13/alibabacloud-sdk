// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class CheckVideoRequest : TeaModel {
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

        [NameInMap("VideoIds")]
        [Validation(Required=true)]
        public string VideoIds { get; set; }

        [NameInMap("CheckStatus")]
        [Validation(Required=true)]
        public string CheckStatus { get; set; }

        [NameInMap("CheckReason")]
        [Validation(Required=false)]
        public string CheckReason { get; set; }

    }

}