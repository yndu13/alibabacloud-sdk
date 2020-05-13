// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAIStatisRequest : TeaModel {
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

        [NameInMap("StartTime")]
        [Validation(Required=false)]
        public long StartTime { get; set; }

        [NameInMap("EndTime")]
        [Validation(Required=false)]
        public long EndTime { get; set; }

        [NameInMap("StartTimeUTC")]
        [Validation(Required=false)]
        public string StartTimeUTC { get; set; }

        [NameInMap("EndTimeUTC")]
        [Validation(Required=false)]
        public string EndTimeUTC { get; set; }

        [NameInMap("Level")]
        [Validation(Required=true)]
        public string Level { get; set; }

        [NameInMap("Type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        [NameInMap("Division")]
        [Validation(Required=false)]
        public string Division { get; set; }

    }

}
