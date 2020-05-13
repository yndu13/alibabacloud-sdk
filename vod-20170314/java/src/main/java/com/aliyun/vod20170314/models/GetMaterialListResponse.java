// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMaterialListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaterialList")
    @Validation(required = true)
    public GetMaterialListResponseMaterialList materialList;

    public static GetMaterialListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialListResponse self = new GetMaterialListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMaterialListResponseMaterialListMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetMaterialListResponseMaterialListMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialListResponseMaterialListMaterialSnapshots self = new GetMaterialListResponseMaterialListMaterialSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMaterialListResponseMaterialListMaterialTiles extends TeaModel {
        @NameInMap("Tile")
        @Validation(required = true)
        public java.util.List<String> tile;

        public static GetMaterialListResponseMaterialListMaterialTiles build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialListResponseMaterialListMaterialTiles self = new GetMaterialListResponseMaterialListMaterialTiles();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMaterialListResponseMaterialListMaterial extends TeaModel {
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
        public GetMaterialListResponseMaterialListMaterialSnapshots snapshots;

        @NameInMap("Tiles")
        @Validation(required = true)
        public GetMaterialListResponseMaterialListMaterialTiles tiles;

        public static GetMaterialListResponseMaterialListMaterial build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialListResponseMaterialListMaterial self = new GetMaterialListResponseMaterialListMaterial();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMaterialListResponseMaterialList extends TeaModel {
        @NameInMap("Material")
        @Validation(required = true)
        public java.util.List<GetMaterialListResponseMaterialListMaterial> material;

        public static GetMaterialListResponseMaterialList build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialListResponseMaterialList self = new GetMaterialListResponseMaterialList();
            return TeaModel.build(map, self);
        }

    }

}
