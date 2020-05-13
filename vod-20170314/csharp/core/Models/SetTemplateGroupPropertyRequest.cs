// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SetTemplateGroupPropertyRequest : TeaModel {
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

        [NameInMap("GroupId")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        [NameInMap("PropertyName")]
        [Validation(Required=true)]
        public string PropertyName { get; set; }

        [NameInMap("PropertyValue")]
        [Validation(Required=true)]
        public string PropertyValue { get; set; }

    }

}
