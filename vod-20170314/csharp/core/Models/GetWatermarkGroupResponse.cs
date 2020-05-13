// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetWatermarkGroupResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public string Total { get; set; }

        [NameInMap("WatermarkGroupList")]
        [Validation(Required=true)]
        public GetWatermarkGroupResponseWatermarkGroupList WatermarkGroupList { get; set; }
        public class GetWatermarkGroupResponseWatermarkGroupList : TeaModel {
            [NameInMap("WatermarkGroup")]
            [Validation(Required=true)]
            public List<GetWatermarkGroupResponseWatermarkGroupListWatermarkGroup> WatermarkGroup { get; set; }
            public class GetWatermarkGroupResponseWatermarkGroupListWatermarkGroup : TeaModel {
                    public string WatermarkId { get; set; }
                    public string WatermarkGroupId { get; set; }
                    public string WatermarkFileURL { get; set; }
                    public string WatermarkType { get; set; }
                    public string WatermarkConfig { get; set; }
            }
        };

    }

}
