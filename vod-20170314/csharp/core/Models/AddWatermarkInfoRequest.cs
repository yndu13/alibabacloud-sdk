// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddWatermarkInfoRequest : TeaModel {
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

        [NameInMap("WatermarkType")]
        [Validation(Required=true)]
        public string WatermarkType { get; set; }

        [NameInMap("WatermarkConfig")]
        [Validation(Required=true)]
        public string WatermarkConfig { get; set; }

        [NameInMap("WatermarkName")]
        [Validation(Required=false)]
        public string WatermarkName { get; set; }

        [NameInMap("MediaFileId")]
        [Validation(Required=false)]
        public string MediaFileId { get; set; }

    }

}
