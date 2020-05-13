// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class QueryUploadInfoRequest : TeaModel {
        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("CustomerId")]
        [Validation(Required=true)]
        public long CustomerId { get; set; }

        [NameInMap("TranscodeGroupId")]
        [Validation(Required=true)]
        public string TranscodeGroupId { get; set; }

        [NameInMap("StorageLocation")]
        [Validation(Required=false)]
        public string StorageLocation { get; set; }

        [NameInMap("LiveRegionId")]
        [Validation(Required=false)]
        public string LiveRegionId { get; set; }

        [NameInMap("ComposeTranscodeGroupId")]
        [Validation(Required=false)]
        public string ComposeTranscodeGroupId { get; set; }

    }

}
