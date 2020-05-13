// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateWatermarkRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("HorizontalOffet")]
        [Validation(Required=false)]
        public string HorizontalOffet { get; set; }

        [NameInMap("HorizontalOffset")]
        [Validation(Required=false)]
        public string HorizontalOffset { get; set; }

        [NameInMap("VerticalOffset")]
        [Validation(Required=false)]
        public string VerticalOffset { get; set; }

        [NameInMap("Position")]
        [Validation(Required=false)]
        public string Position { get; set; }

        [NameInMap("Type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        [NameInMap("Bucket")]
        [Validation(Required=false)]
        public string Bucket { get; set; }

        [NameInMap("Object")]
        [Validation(Required=false)]
        public string Object { get; set; }

        [NameInMap("Name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        [NameInMap("Width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        [NameInMap("Height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        [NameInMap("WatermarkId")]
        [Validation(Required=false)]
        public string WatermarkId { get; set; }

        [NameInMap("ScreenMode")]
        [Validation(Required=false)]
        public string ScreenMode { get; set; }

        [NameInMap("VideoWidth")]
        [Validation(Required=false)]
        public int? VideoWidth { get; set; }

        [NameInMap("VideoHeight")]
        [Validation(Required=false)]
        public int? VideoHeight { get; set; }

        [NameInMap("WatermarkConfig")]
        [Validation(Required=false)]
        public string WatermarkConfig { get; set; }

        [NameInMap("FileUrl")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        [NameInMap("ScreenWidth")]
        [Validation(Required=false)]
        public int? ScreenWidth { get; set; }

        [NameInMap("ScreenHeight")]
        [Validation(Required=false)]
        public int? ScreenHeight { get; set; }

        [NameInMap("ResourceRealOwnerId")]
        [Validation(Required=false)]
        public long ResourceRealOwnerId { get; set; }

    }

}
