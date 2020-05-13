// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetTotalStatisResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("TranscodeDuration")]
        [Validation(Required=true)]
        public long TranscodeDuration { get; set; }

        [NameInMap("StorageUtilization")]
        [Validation(Required=true)]
        public long StorageUtilization { get; set; }

        [NameInMap("NetworkOut")]
        [Validation(Required=true)]
        public long NetworkOut { get; set; }

    }

}
