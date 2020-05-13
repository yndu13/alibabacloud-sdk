// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMediaInfoListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VideoList")
    @Validation(required = true)
    public GetMediaInfoListResponseVideoList videoList;

    public static GetMediaInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoListResponse self = new GetMediaInfoListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaInfoListResponseVideoListMediaInfoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetMediaInfoListResponseVideoListMediaInfoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoListResponseVideoListMediaInfoSnapshots self = new GetMediaInfoListResponseVideoListMediaInfoSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaInfoListResponseVideoListMediaInfo extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

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

        @NameInMap("Privilege")
        @Validation(required = true)
        public Integer privilege;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

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

        @NameInMap("Snapshots")
        @Validation(required = true)
        public GetMediaInfoListResponseVideoListMediaInfoSnapshots snapshots;

        public static GetMediaInfoListResponseVideoListMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoListResponseVideoListMediaInfo self = new GetMediaInfoListResponseVideoListMediaInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaInfoListResponseVideoList extends TeaModel {
        @NameInMap("MediaInfo")
        @Validation(required = true)
        public java.util.List<GetMediaInfoListResponseVideoListMediaInfo> mediaInfo;

        public static GetMediaInfoListResponseVideoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoListResponseVideoList self = new GetMediaInfoListResponseVideoList();
            return TeaModel.build(map, self);
        }

    }

}
