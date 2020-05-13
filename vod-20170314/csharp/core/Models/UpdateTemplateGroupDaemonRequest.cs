// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateTemplateGroupDaemonRequest : TeaModel {
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

        [NameInMap("TemplateGroupId")]
        [Validation(Required=true)]
        public string TemplateGroupId { get; set; }

        [NameInMap("UserId")]
        [Validation(Required=true)]
        public long UserId { get; set; }

        [NameInMap("IsLocked")]
        [Validation(Required=false)]
        public string IsLocked { get; set; }

        [NameInMap("GroupName")]
        [Validation(Required=false)]
        public string GroupName { get; set; }

    }

}
