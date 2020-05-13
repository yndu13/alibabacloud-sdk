// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddCompanionresourceInfoRequest : TeaModel {
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

        [NameInMap("MediaFileId")]
        [Validation(Required=true)]
        public string MediaFileId { get; set; }

        [NameInMap("CompanionResourceType")]
        [Validation(Required=true)]
        public string CompanionResourceType { get; set; }

        [NameInMap("CompanionResourceConfig")]
        [Validation(Required=true)]
        public string CompanionResourceConfig { get; set; }

        [NameInMap("ResourceName")]
        [Validation(Required=false)]
        public string ResourceName { get; set; }

        [NameInMap("ResourceTags")]
        [Validation(Required=false)]
        public string ResourceTags { get; set; }

    }

}
