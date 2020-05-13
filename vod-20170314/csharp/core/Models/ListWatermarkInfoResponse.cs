// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListWatermarkInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("WatermarkInfos")]
        [Validation(Required=true)]
        public ListWatermarkInfoResponseWatermarkInfos WatermarkInfos { get; set; }
        public class ListWatermarkInfoResponseWatermarkInfos : TeaModel {
            [NameInMap("WatermarkInfo")]
            [Validation(Required=true)]
            public List<ListWatermarkInfoResponseWatermarkInfosWatermarkInfo> WatermarkInfo { get; set; }
            public class ListWatermarkInfoResponseWatermarkInfosWatermarkInfo : TeaModel {
                    public string WatermarkConfig { get; set; }
                    public string WatermarkId { get; set; }
                    public string WatermarkType { get; set; }
                    public string WatermarkName { get; set; }
                    public string WatermarkFileUrl { get; set; }
            }
        };

    }

}
