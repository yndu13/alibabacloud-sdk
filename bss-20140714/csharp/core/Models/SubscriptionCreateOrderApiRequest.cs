// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Bss20140714.Models
{
    public class SubscriptionCreateOrderApiRequest : TeaModel {
        [NameInMap("ownerId")]
        [Validation(Required=true)]
        public string OwnerId { get; set; }

        [NameInMap("productCode")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
