// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaterialList")
    @Validation(required = true)
    public GetEditingProjectMaterialsResponseMaterialList materialList;

    public static GetEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsResponse self = new GetEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public static class GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots self = new GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetEditingProjectMaterialsResponseMaterialListMaterialTiles extends TeaModel {
        @NameInMap("Tile")
        @Validation(required = true)
        public java.util.List<String> tile;

        public static GetEditingProjectMaterialsResponseMaterialListMaterialTiles build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialListMaterialTiles self = new GetEditingProjectMaterialsResponseMaterialListMaterialTiles();
            return TeaModel.build(map, self);
        }

    }

    public static class GetEditingProjectMaterialsResponseMaterialListMaterial extends TeaModel {
        @NameInMap("MaterialId")
        @Validation(required = true)
        public String materialId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public Long customerId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Integer cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("SpriteConfig")
        @Validation(required = true)
        public String spriteConfig;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots snapshots;

        @NameInMap("Tiles")
        @Validation(required = true)
        public GetEditingProjectMaterialsResponseMaterialListMaterialTiles tiles;

        public static GetEditingProjectMaterialsResponseMaterialListMaterial build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialListMaterial self = new GetEditingProjectMaterialsResponseMaterialListMaterial();
            return TeaModel.build(map, self);
        }

    }

    public static class GetEditingProjectMaterialsResponseMaterialList extends TeaModel {
        @NameInMap("Material")
        @Validation(required = true)
        public java.util.List<GetEditingProjectMaterialsResponseMaterialListMaterial> material;

        public static GetEditingProjectMaterialsResponseMaterialList build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialList self = new GetEditingProjectMaterialsResponseMaterialList();
            return TeaModel.build(map, self);
        }

    }

}
