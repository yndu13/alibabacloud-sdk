// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaterialList")
    @Validation(required = true)
    public SetEditingProjectMaterialsResponseMaterialList materialList;

    public static SetEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEditingProjectMaterialsResponse self = new SetEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public static class SetEditingProjectMaterialsResponseMaterialListMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static SetEditingProjectMaterialsResponseMaterialListMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            SetEditingProjectMaterialsResponseMaterialListMaterialSnapshots self = new SetEditingProjectMaterialsResponseMaterialListMaterialSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class SetEditingProjectMaterialsResponseMaterialListMaterialTiles extends TeaModel {
        @NameInMap("Tile")
        @Validation(required = true)
        public java.util.List<String> tile;

        public static SetEditingProjectMaterialsResponseMaterialListMaterialTiles build(java.util.Map<String, ?> map) throws Exception {
            SetEditingProjectMaterialsResponseMaterialListMaterialTiles self = new SetEditingProjectMaterialsResponseMaterialListMaterialTiles();
            return TeaModel.build(map, self);
        }

    }

    public static class SetEditingProjectMaterialsResponseMaterialListMaterial extends TeaModel {
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

        @NameInMap("Snapshots")
        @Validation(required = true)
        public SetEditingProjectMaterialsResponseMaterialListMaterialSnapshots snapshots;

        @NameInMap("Tiles")
        @Validation(required = true)
        public SetEditingProjectMaterialsResponseMaterialListMaterialTiles tiles;

        public static SetEditingProjectMaterialsResponseMaterialListMaterial build(java.util.Map<String, ?> map) throws Exception {
            SetEditingProjectMaterialsResponseMaterialListMaterial self = new SetEditingProjectMaterialsResponseMaterialListMaterial();
            return TeaModel.build(map, self);
        }

    }

    public static class SetEditingProjectMaterialsResponseMaterialList extends TeaModel {
        @NameInMap("Material")
        @Validation(required = true)
        public java.util.List<SetEditingProjectMaterialsResponseMaterialListMaterial> material;

        public static SetEditingProjectMaterialsResponseMaterialList build(java.util.Map<String, ?> map) throws Exception {
            SetEditingProjectMaterialsResponseMaterialList self = new SetEditingProjectMaterialsResponseMaterialList();
            return TeaModel.build(map, self);
        }

    }

}
