// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Material")
    @Validation(required = true)
    public UpdateMaterialResponseMaterial material;

    public static UpdateMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterialResponse self = new UpdateMaterialResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateMaterialResponseMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static UpdateMaterialResponseMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            UpdateMaterialResponseMaterialSnapshots self = new UpdateMaterialResponseMaterialSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateMaterialResponseMaterialTiles extends TeaModel {
        @NameInMap("Tile")
        @Validation(required = true)
        public java.util.List<String> tile;

        public static UpdateMaterialResponseMaterialTiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateMaterialResponseMaterialTiles self = new UpdateMaterialResponseMaterialTiles();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateMaterialResponseMaterial extends TeaModel {
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

        @NameInMap("Snapshots")
        @Validation(required = true)
        public UpdateMaterialResponseMaterialSnapshots snapshots;

        @NameInMap("Tiles")
        @Validation(required = true)
        public UpdateMaterialResponseMaterialTiles tiles;

        public static UpdateMaterialResponseMaterial build(java.util.Map<String, ?> map) throws Exception {
            UpdateMaterialResponseMaterial self = new UpdateMaterialResponseMaterial();
            return TeaModel.build(map, self);
        }

    }

}
