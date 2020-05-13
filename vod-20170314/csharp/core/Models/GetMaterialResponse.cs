// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMaterialResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Material")]
        [Validation(Required=true)]
        public GetMaterialResponseMaterial Material { get; set; }
        public class GetMaterialResponseMaterial : TeaModel {
            [NameInMap("MaterialId")]
            [Validation(Required=true)]
            public string MaterialId { get; set; }
            [NameInMap("Title")]
            [Validation(Required=true)]
            public string Title { get; set; }
            [NameInMap("Tags")]
            [Validation(Required=true)]
            public string Tags { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("Size")]
            [Validation(Required=true)]
            public long Size { get; set; }
            [NameInMap("Duration")]
            [Validation(Required=true)]
            public float? Duration { get; set; }
            [NameInMap("Description")]
            [Validation(Required=true)]
            public string Description { get; set; }
            [NameInMap("CustomerId")]
            [Validation(Required=true)]
            public long CustomerId { get; set; }
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public string CreateTime { get; set; }
            [NameInMap("ModifyTime")]
            [Validation(Required=true)]
            public string ModifyTime { get; set; }
            [NameInMap("CoverURL")]
            [Validation(Required=true)]
            public string CoverURL { get; set; }
            [NameInMap("CateId")]
            [Validation(Required=true)]
            public int? CateId { get; set; }
            [NameInMap("CateName")]
            [Validation(Required=true)]
            public string CateName { get; set; }
            [NameInMap("Source")]
            [Validation(Required=true)]
            public string Source { get; set; }
            [NameInMap("Snapshots")]
            [Validation(Required=true)]
            public GetMaterialResponseMaterialSnapshots Snapshots { get; set; }
            public class GetMaterialResponseMaterialSnapshots : TeaModel {
                [NameInMap("Snapshot")]
                [Validation(Required=true)]
                public List<string> Snapshot { get; set; }

            }
            [NameInMap("Tiles")]
            [Validation(Required=true)]
            public GetMaterialResponseMaterialTiles Tiles { get; set; }
            public class GetMaterialResponseMaterialTiles : TeaModel {
                [NameInMap("Tile")]
                [Validation(Required=true)]
                public List<string> Tile { get; set; }

            }
        };

    }

}
