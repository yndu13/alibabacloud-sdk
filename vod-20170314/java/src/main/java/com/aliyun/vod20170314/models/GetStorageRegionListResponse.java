// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetStorageRegionListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionList")
    @Validation(required = true)
    public GetStorageRegionListResponseRegionList regionList;

    public static GetStorageRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageRegionListResponse self = new GetStorageRegionListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStorageRegionListResponseRegionListRegion extends TeaModel {
        @NameInMap("RegionID")
        @Validation(required = true)
        public String regionID;

        public static GetStorageRegionListResponseRegionListRegion build(java.util.Map<String, ?> map) throws Exception {
            GetStorageRegionListResponseRegionListRegion self = new GetStorageRegionListResponseRegionListRegion();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStorageRegionListResponseRegionList extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public java.util.List<GetStorageRegionListResponseRegionListRegion> region;

        public static GetStorageRegionListResponseRegionList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageRegionListResponseRegionList self = new GetStorageRegionListResponseRegionList();
            return TeaModel.build(map, self);
        }

    }

}
