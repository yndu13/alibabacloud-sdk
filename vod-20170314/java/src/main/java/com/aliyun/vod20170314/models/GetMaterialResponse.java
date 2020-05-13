// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Material")
    @Validation(required = true)
    public GetMaterialResponseMaterial material;

    public static GetMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialResponse self = new GetMaterialResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMaterialResponseMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetMaterialResponseMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialResponseMaterialSnapshots self = new GetMaterialResponseMaterialSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMaterialResponseMaterialTiles extends TeaModel {
        @NameInMap("Tile")
        @Validation(required = true)
        public java.util.List<String> tile;

        public static GetMaterialResponseMaterialTiles build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialResponseMaterialTiles self = new GetMaterialResponseMaterialTiles();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMaterialResponseMaterial extends TeaModel {
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
        public GetMaterialResponseMaterialSnapshots snapshots;

        @NameInMap("Tiles")
        @Validation(required = true)
        public GetMaterialResponseMaterialTiles tiles;

        public static GetMaterialResponseMaterial build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialResponseMaterial self = new GetMaterialResponseMaterial();
            return TeaModel.build(map, self);
        }

    }

}
