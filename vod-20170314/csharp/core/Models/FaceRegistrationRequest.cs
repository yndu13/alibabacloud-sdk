// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class FaceRegistrationRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public string ResourceOwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("OwnerAccount")]
        [Validation(Required=false)]
        public string OwnerAccount { get; set; }

        [NameInMap("PersonName")]
        [Validation(Required=true)]
        public string PersonName { get; set; }

        [NameInMap("PersonId")]
        [Validation(Required=false)]
        public string PersonId { get; set; }

        [NameInMap("PersonLibrary")]
        [Validation(Required=false)]
        public string PersonLibrary { get; set; }

        [NameInMap("Category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        [NameInMap("ImageIds")]
        [Validation(Required=false)]
        public string ImageIds { get; set; }

    }

}
