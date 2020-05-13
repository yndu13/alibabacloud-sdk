// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("MaterialList")
    @Validation(required = true)
    public SearchMaterialResponseMaterialList materialList;

    public static SearchMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMaterialResponse self = new SearchMaterialResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchMaterialResponseMaterialListMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static SearchMaterialResponseMaterialListMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            SearchMaterialResponseMaterialListMaterialSnapshots self = new SearchMaterialResponseMaterialListMaterialSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMaterialResponseMaterialListMaterialTiles extends TeaModel {
        @NameInMap("Tile")
        @Validation(required = true)
        public java.util.List<String> tile;

        public static SearchMaterialResponseMaterialListMaterialTiles build(java.util.Map<String, ?> map) throws Exception {
            SearchMaterialResponseMaterialListMaterialTiles self = new SearchMaterialResponseMaterialListMaterialTiles();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMaterialResponseMaterialListMaterial extends TeaModel {
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
        public SearchMaterialResponseMaterialListMaterialSnapshots snapshots;

        @NameInMap("Tiles")
        @Validation(required = true)
        public SearchMaterialResponseMaterialListMaterialTiles tiles;

        public static SearchMaterialResponseMaterialListMaterial build(java.util.Map<String, ?> map) throws Exception {
            SearchMaterialResponseMaterialListMaterial self = new SearchMaterialResponseMaterialListMaterial();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMaterialResponseMaterialList extends TeaModel {
        @NameInMap("Material")
        @Validation(required = true)
        public java.util.List<SearchMaterialResponseMaterialListMaterial> material;

        public static SearchMaterialResponseMaterialList build(java.util.Map<String, ?> map) throws Exception {
            SearchMaterialResponseMaterialList self = new SearchMaterialResponseMaterialList();
            return TeaModel.build(map, self);
        }

    }

}
