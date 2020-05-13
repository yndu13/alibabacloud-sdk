// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateWatermarkGroupRequest : TeaModel {
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

        [NameInMap("WatermarkGroupId")]
        [Validation(Required=true)]
        public string WatermarkGroupId { get; set; }

        [NameInMap("WatermarkGroupName")]
        [Validation(Required=false)]
        public string WatermarkGroupName { get; set; }

        [NameInMap("IsDefault")]
        [Validation(Required=false)]
        public bool? IsDefault { get; set; }

    }

}
