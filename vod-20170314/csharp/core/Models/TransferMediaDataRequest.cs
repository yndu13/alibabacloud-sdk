// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class TransferMediaDataRequest : TeaModel {
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

        [NameInMap("VideoId")]
        [Validation(Required=false)]
        public string VideoId { get; set; }

        [NameInMap("VideoInfo")]
        [Validation(Required=false)]
        public string VideoInfo { get; set; }

        [NameInMap("MezzanineInfo")]
        [Validation(Required=false)]
        public string MezzanineInfo { get; set; }

        [NameInMap("StreamInfos")]
        [Validation(Required=false)]
        public string StreamInfos { get; set; }

    }

}
