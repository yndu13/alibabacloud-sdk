// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddLiveStreamVideoRequest : TeaModel {
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

        [NameInMap("StreamName")]
        [Validation(Required=true)]
        public string StreamName { get; set; }

        [NameInMap("DomainName")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        [NameInMap("AppName")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        [NameInMap("TranscodeGroupId")]
        [Validation(Required=false)]
        public string TranscodeGroupId { get; set; }

        [NameInMap("ResourceInfo")]
        [Validation(Required=false)]
        public string ResourceInfo { get; set; }

        [NameInMap("FileUrl")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        [NameInMap("EndTime")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        [NameInMap("Title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        [NameInMap("Tags")]
        [Validation(Required=false)]
        public string Tags { get; set; }

    }

}
