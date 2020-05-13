// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchMediaInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("VideoList")
    @Validation(required = true)
    public SearchMediaInfoResponseVideoList videoList;

    public static SearchMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaInfoResponse self = new SearchMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchMediaInfoResponseVideoListMediaInfoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static SearchMediaInfoResponseVideoListMediaInfoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaInfoResponseVideoListMediaInfoSnapshots self = new SearchMediaInfoResponseVideoListMediaInfoSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaInfoResponseVideoListMediaInfo extends TeaModel {
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
        public SearchMediaInfoResponseVideoListMediaInfoSnapshots snapshots;

        public static SearchMediaInfoResponseVideoListMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaInfoResponseVideoListMediaInfo self = new SearchMediaInfoResponseVideoListMediaInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaInfoResponseVideoList extends TeaModel {
        @NameInMap("MediaInfo")
        @Validation(required = true)
        public java.util.List<SearchMediaInfoResponseVideoListMediaInfo> mediaInfo;

        public static SearchMediaInfoResponseVideoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaInfoResponseVideoList self = new SearchMediaInfoResponseVideoList();
            return TeaModel.build(map, self);
        }

    }

}
