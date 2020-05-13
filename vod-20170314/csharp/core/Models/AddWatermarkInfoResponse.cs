// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddWatermarkInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Result")]
        [Validation(Required=true)]
        public bool? Result { get; set; }

        [NameInMap("WatermarkId")]
        [Validation(Required=true)]
        public string WatermarkId { get; set; }

    }

}
