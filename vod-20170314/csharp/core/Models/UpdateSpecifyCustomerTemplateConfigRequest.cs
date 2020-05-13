// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateSpecifyCustomerTemplateConfigRequest : TeaModel {
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

        [NameInMap("TranscodeIds")]
        [Validation(Required=true)]
        public string TranscodeIds { get; set; }

        [NameInMap("EncryptTemplateIds")]
        [Validation(Required=false)]
        public string EncryptTemplateIds { get; set; }

        [NameInMap("CustomerId")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

    }

}
