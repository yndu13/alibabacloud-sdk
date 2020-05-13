// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetWatermarkResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Watermark")]
        [Validation(Required=true)]
        public GetWatermarkResponseWatermark Watermark { get; set; }
        public class GetWatermarkResponseWatermark : TeaModel {
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public int? CreateTime { get; set; }
            [NameInMap("HorizontalOffset")]
            [Validation(Required=true)]
            public string HorizontalOffset { get; set; }
            [NameInMap("IsDefault")]
            [Validation(Required=true)]
            public string IsDefault { get; set; }
            [NameInMap("Position")]
            [Validation(Required=true)]
            public string Position { get; set; }
            [NameInMap("WatermarkId")]
            [Validation(Required=true)]
            public string WatermarkId { get; set; }
            [NameInMap("VerticalOffset")]
            [Validation(Required=true)]
            public string VerticalOffset { get; set; }
            [NameInMap("Width")]
            [Validation(Required=true)]
            public string Width { get; set; }
            [NameInMap("Height")]
            [Validation(Required=true)]
            public string Height { get; set; }
            [NameInMap("Active")]
            [Validation(Required=true)]
            public string Active { get; set; }
            [NameInMap("Url")]
            [Validation(Required=true)]
            public string Url { get; set; }
            [NameInMap("Name")]
            [Validation(Required=true)]
            public string Name { get; set; }
            [NameInMap("VideoHeight")]
            [Validation(Required=true)]
            public int? VideoHeight { get; set; }
            [NameInMap("VideoWidth")]
            [Validation(Required=true)]
            public int? VideoWidth { get; set; }
            [NameInMap("ScreenMode")]
            [Validation(Required=true)]
            public string ScreenMode { get; set; }
        };

        [NameInMap("WatermarkInfo")]
        [Validation(Required=true)]
        public GetWatermarkResponseWatermarkInfo WatermarkInfo { get; set; }
        public class GetWatermarkResponseWatermarkInfo : TeaModel {
            [NameInMap("CreationTime")]
            [Validation(Required=true)]
            public string CreationTime { get; set; }
            [NameInMap("Type")]
            [Validation(Required=true)]
            public string Type { get; set; }
            [NameInMap("IsDefault")]
            [Validation(Required=true)]
            public string IsDefault { get; set; }
            [NameInMap("WatermarkId")]
            [Validation(Required=true)]
            public string WatermarkId { get; set; }
            [NameInMap("ScreenWidth")]
            [Validation(Required=true)]
            public int? ScreenWidth { get; set; }
            [NameInMap("ScreenHeight")]
            [Validation(Required=true)]
            public int? ScreenHeight { get; set; }
            [NameInMap("Name")]
            [Validation(Required=true)]
            public string Name { get; set; }
            [NameInMap("FileUrl")]
            [Validation(Required=true)]
            public string FileUrl { get; set; }
            [NameInMap("WatermarkConfig")]
            [Validation(Required=true)]
            public string WatermarkConfig { get; set; }
        };

    }

}
