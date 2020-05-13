// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SetEditingProjectMaterialsResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MaterialList")]
        [Validation(Required=true)]
        public SetEditingProjectMaterialsResponseMaterialList MaterialList { get; set; }
        public class SetEditingProjectMaterialsResponseMaterialList : TeaModel {
            [NameInMap("Material")]
            [Validation(Required=true)]
            public List<SetEditingProjectMaterialsResponseMaterialListMaterial> Material { get; set; }
            public class SetEditingProjectMaterialsResponseMaterialListMaterial : TeaModel {
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
                    public SetEditingProjectMaterialsResponseMaterialListMaterialSnapshots Snapshots { get; set; }
                    public class SetEditingProjectMaterialsResponseMaterialListMaterialSnapshots : TeaModel {
                        [NameInMap("Snapshot")]
                        [Validation(Required=true)]
                        public List<string> Snapshot { get; set; }

                    }
                    public SetEditingProjectMaterialsResponseMaterialListMaterialTiles Tiles { get; set; }
                    public class SetEditingProjectMaterialsResponseMaterialListMaterialTiles : TeaModel {
                        [NameInMap("Tile")]
                        [Validation(Required=true)]
                        public List<string> Tile { get; set; }

                    }
            }
        };

    }

}
