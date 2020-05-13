// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetWatermarksResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Watermarks")]
        [Validation(Required=true)]
        public GetWatermarksResponseWatermarks Watermarks { get; set; }
        public class GetWatermarksResponseWatermarks : TeaModel {
            [NameInMap("Watermark")]
            [Validation(Required=true)]
            public List<GetWatermarksResponseWatermarksWatermark> Watermark { get; set; }
            public class GetWatermarksResponseWatermarksWatermark : TeaModel {
                    public int? CreateTime { get; set; }
                    public string HorizontalOffset { get; set; }
                    public string IsDefault { get; set; }
                    public string Position { get; set; }
                    public string WatermarkId { get; set; }
                    public string VerticalOffset { get; set; }
                    public string Width { get; set; }
                    public string Height { get; set; }
                    public string Active { get; set; }
                    public string Url { get; set; }
                    public string Name { get; set; }
                    public int? VideoHeight { get; set; }
                    public int? VideoWidth { get; set; }
                    public string ScreenMode { get; set; }
            }
        };

        [NameInMap("WatermarkInfos")]
        [Validation(Required=true)]
        public GetWatermarksResponseWatermarkInfos WatermarkInfos { get; set; }
        public class GetWatermarksResponseWatermarkInfos : TeaModel {
            [NameInMap("WatermarkInfo")]
            [Validation(Required=true)]
            public List<GetWatermarksResponseWatermarkInfosWatermarkInfo> WatermarkInfo { get; set; }
            public class GetWatermarksResponseWatermarkInfosWatermarkInfo : TeaModel {
                    public string CreationTime { get; set; }
                    public string Type { get; set; }
                    public string IsDefault { get; set; }
                    public string WatermarkId { get; set; }
                    public int? ScreenWidth { get; set; }
                    public int? ScreenHeight { get; set; }
                    public string Name { get; set; }
                    public string FileUrl { get; set; }
                    public string WatermarkConfig { get; set; }
            }
        };

    }

}
