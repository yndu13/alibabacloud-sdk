// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateMaterialRequest : TeaModel {
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

        [NameInMap("MaterialId")]
        [Validation(Required=true)]
        public string MaterialId { get; set; }

        [NameInMap("Title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        [NameInMap("Description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        [NameInMap("Tags")]
        [Validation(Required=false)]
        public string Tags { get; set; }

        [NameInMap("CoverUrl")]
        [Validation(Required=false)]
        public string CoverUrl { get; set; }

        [NameInMap("CateId")]
        [Validation(Required=false)]
        public int? CateId { get; set; }

    }

}
