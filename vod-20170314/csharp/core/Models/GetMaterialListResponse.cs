// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMaterialListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MaterialList")]
        [Validation(Required=true)]
        public GetMaterialListResponseMaterialList MaterialList { get; set; }
        public class GetMaterialListResponseMaterialList : TeaModel {
            [NameInMap("Material")]
            [Validation(Required=true)]
            public List<GetMaterialListResponseMaterialListMaterial> Material { get; set; }
            public class GetMaterialListResponseMaterialListMaterial : TeaModel {
                    public string MaterialId { get; set; }
                    public string Title { get; set; }
                    public string Tags { get; set; }
                    public string Status { get; set; }
                    public long Size { get; set; }
                    public float? Duration { get; set; }
                    public string Description { get; set; }
                    public long CustomerId { get; set; }
                    public string CreateTime { get; set; }
                    public string ModifyTime { get; set; }
                    public string CoverURL { get; set; }
                    public int? CateId { get; set; }
                    public string CateName { get; set; }
                    public string Source { get; set; }
                    public GetMaterialListResponseMaterialListMaterialSnapshots Snapshots { get; set; }
                    public class GetMaterialListResponseMaterialListMaterialSnapshots : TeaModel {
                        [NameInMap("Snapshot")]
                        [Validation(Required=true)]
                        public List<string> Snapshot { get; set; }

                    }
                    public GetMaterialListResponseMaterialListMaterialTiles Tiles { get; set; }
                    public class GetMaterialListResponseMaterialListMaterialTiles : TeaModel {
                        [NameInMap("Tile")]
                        [Validation(Required=true)]
                        public List<string> Tile { get; set; }

                    }
            }
        };

    }

}
