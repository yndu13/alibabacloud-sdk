// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ScrollToken")
    @Validation(required = true)
    public String scrollToken;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("VideoList")
    @Validation(required = true)
    public SearchVideoResponseVideoList videoList;

    public static SearchVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchVideoResponse self = new SearchVideoResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchVideoResponseVideoListVideoPlayInfoListPlayInfo extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public Long width;

        @NameInMap("Height")
        @Validation(required = true)
        public Long height;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("PlayURL")
        @Validation(required = true)
        public String playURL;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("Encrypt")
        @Validation(required = true)
        public Long encrypt;

        @NameInMap("Plaintext")
        @Validation(required = true)
        public String plaintext;

        @NameInMap("Complexity")
        @Validation(required = true)
        public String complexity;

        @NameInMap("StreamType")
        @Validation(required = true)
        public String streamType;

        @NameInMap("Rand")
        @Validation(required = true)
        public String rand;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static SearchVideoResponseVideoListVideoPlayInfoListPlayInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchVideoResponseVideoListVideoPlayInfoListPlayInfo self = new SearchVideoResponseVideoListVideoPlayInfoListPlayInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchVideoResponseVideoListVideoPlayInfoList extends TeaModel {
        @NameInMap("PlayInfo")
        @Validation(required = true)
        public java.util.List<SearchVideoResponseVideoListVideoPlayInfoListPlayInfo> playInfo;

        public static SearchVideoResponseVideoListVideoPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchVideoResponseVideoListVideoPlayInfoList self = new SearchVideoResponseVideoListVideoPlayInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchVideoResponseVideoListVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static SearchVideoResponseVideoListVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            SearchVideoResponseVideoListVideoSnapshots self = new SearchVideoResponseVideoListVideoSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchVideoResponseVideoListVideoSpriteSnapshots extends TeaModel {
        @NameInMap("SpriteSnapshot")
        @Validation(required = true)
        public java.util.List<String> spriteSnapshot;

        public static SearchVideoResponseVideoListVideoSpriteSnapshots build(java.util.Map<String, ?> map) throws Exception {
            SearchVideoResponseVideoListVideoSpriteSnapshots self = new SearchVideoResponseVideoListVideoSpriteSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchVideoResponseVideoListVideo extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("MediaType")
        @Validation(required = true)
        public String mediaType;

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

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Integer cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("DownloadSwitch")
        @Validation(required = true)
        public String downloadSwitch;

        @NameInMap("PreprocessStatus")
        @Validation(required = true)
        public String preprocessStatus;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("PlayInfoList")
        @Validation(required = true)
        public SearchVideoResponseVideoListVideoPlayInfoList playInfoList;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public SearchVideoResponseVideoListVideoSnapshots snapshots;

        @NameInMap("SpriteSnapshots")
        @Validation(required = true)
        public SearchVideoResponseVideoListVideoSpriteSnapshots spriteSnapshots;

        public static SearchVideoResponseVideoListVideo build(java.util.Map<String, ?> map) throws Exception {
            SearchVideoResponseVideoListVideo self = new SearchVideoResponseVideoListVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchVideoResponseVideoList extends TeaModel {
        @NameInMap("Video")
        @Validation(required = true)
        public java.util.List<SearchVideoResponseVideoListVideo> video;

        public static SearchVideoResponseVideoList build(java.util.Map<String, ?> map) throws Exception {
            SearchVideoResponseVideoList self = new SearchVideoResponseVideoList();
            return TeaModel.build(map, self);
        }

    }

}
