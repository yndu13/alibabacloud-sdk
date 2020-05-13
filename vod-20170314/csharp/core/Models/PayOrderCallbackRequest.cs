// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class PayOrderCallbackRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("SecurityToken")]
        [Validation(Required=false)]
        public string SecurityToken { get; set; }

        [NameInMap("product")]
        [Validation(Required=false)]
        public string Product { get; set; }

        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        [NameInMap("regionId")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
