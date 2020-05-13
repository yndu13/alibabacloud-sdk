// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetWatermarkInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("WatermarkInfo")]
        [Validation(Required=true)]
        public GetWatermarkInfoResponseWatermarkInfo WatermarkInfo { get; set; }
        public class GetWatermarkInfoResponseWatermarkInfo : TeaModel {
            [NameInMap("WatermarkConfig")]
            [Validation(Required=true)]
            public string WatermarkConfig { get; set; }
            [NameInMap("WatermarkId")]
            [Validation(Required=true)]
            public string WatermarkId { get; set; }
            [NameInMap("WatermarkType")]
            [Validation(Required=true)]
            public string WatermarkType { get; set; }
            [NameInMap("WatermarkName")]
            [Validation(Required=true)]
            public string WatermarkName { get; set; }
            [NameInMap("WatermarkFileUrl")]
            [Validation(Required=true)]
            public string WatermarkFileUrl { get; set; }
        };

    }

}
