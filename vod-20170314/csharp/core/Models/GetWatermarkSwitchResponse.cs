// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetWatermarkSwitchResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("WaterMarkSwitch")]
        [Validation(Required=true)]
        public GetWatermarkSwitchResponseWaterMarkSwitch WaterMarkSwitch { get; set; }
        public class GetWatermarkSwitchResponseWaterMarkSwitch : TeaModel {
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public int? CreateTime { get; set; }
            [NameInMap("UpdateTime")]
            [Validation(Required=true)]
            public int? UpdateTime { get; set; }
            [NameInMap("Active")]
            [Validation(Required=true)]
            public string Active { get; set; }
            [NameInMap("CustomerId")]
            [Validation(Required=true)]
            public string CustomerId { get; set; }
        };

    }

}
