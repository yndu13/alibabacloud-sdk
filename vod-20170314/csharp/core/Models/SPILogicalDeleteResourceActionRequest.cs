// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SPILogicalDeleteResourceActionRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("SecurityToken")]
        [Validation(Required=false)]
        public string SecurityToken { get; set; }

        [NameInMap("Pk")]
        [Validation(Required=true)]
        public string Pk { get; set; }

        [NameInMap("Bid")]
        [Validation(Required=true)]
        public string Bid { get; set; }

        [NameInMap("Hid")]
        [Validation(Required=true)]
        public long Hid { get; set; }

        [NameInMap("Country")]
        [Validation(Required=true)]
        public string Country { get; set; }

        [NameInMap("TaskIdentifier")]
        [Validation(Required=true)]
        public string TaskIdentifier { get; set; }

        [NameInMap("TaskExtraData")]
        [Validation(Required=true)]
        public string TaskExtraData { get; set; }

        [NameInMap("GmtWakeup")]
        [Validation(Required=true)]
        public string GmtWakeup { get; set; }

        [NameInMap("Success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        [NameInMap("Message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        [NameInMap("Level")]
        [Validation(Required=false)]
        public long Level { get; set; }

        [NameInMap("Url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        [NameInMap("Prompt")]
        [Validation(Required=false)]
        public string Prompt { get; set; }

    }

}
