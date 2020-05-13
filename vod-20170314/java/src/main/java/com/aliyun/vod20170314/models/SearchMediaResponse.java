// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchMediaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ScrollToken")
    @Validation(required = true)
    public String scrollToken;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("MediaList")
    @Validation(required = true)
    public java.util.List<SearchMediaResponseMediaList> mediaList;

    public static SearchMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponse self = new SearchMediaResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchMediaResponseMediaListVideoPlayInfoList extends TeaModel {
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

        public static SearchMediaResponseMediaListVideoPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListVideoPlayInfoList self = new SearchMediaResponseMediaListVideoPlayInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListVideo extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("MediaSource")
        @Validation(required = true)
        public String mediaSource;

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
        public Long cateId;

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

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("AuditStatus")
        @Validation(required = true)
        public String auditStatus;

        @NameInMap("AuditAIStatus")
        @Validation(required = true)
        public String auditAIStatus;

        @NameInMap("AuditManualStatus")
        @Validation(required = true)
        public String auditManualStatus;

        @NameInMap("AuditAIResult")
        @Validation(required = true)
        public String auditAIResult;

        @NameInMap("AuditTemplateId")
        @Validation(required = true)
        public String auditTemplateId;

        @NameInMap("CustomMediaInfo")
        @Validation(required = true)
        public String customMediaInfo;

        @NameInMap("PlayInfoList")
        @Validation(required = true)
        public java.util.List<SearchMediaResponseMediaListVideoPlayInfoList> playInfoList;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public java.util.List<String> snapshots;

        @NameInMap("SpriteSnapshots")
        @Validation(required = true)
        public java.util.List<String> spriteSnapshots;

        public static SearchMediaResponseMediaListVideo build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListVideo self = new SearchMediaResponseMediaListVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListAudioPlayInfoList extends TeaModel {
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

        public static SearchMediaResponseMediaListAudioPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListAudioPlayInfoList self = new SearchMediaResponseMediaListAudioPlayInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListAudio extends TeaModel {
        @NameInMap("AudioId")
        @Validation(required = true)
        public String audioId;

        @NameInMap("MediaSource")
        @Validation(required = true)
        public String mediaSource;

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
        public Long cateId;

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

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("AuditStatus")
        @Validation(required = true)
        public String auditStatus;

        @NameInMap("AuditAIStatus")
        @Validation(required = true)
        public String auditAIStatus;

        @NameInMap("AuditManualStatus")
        @Validation(required = true)
        public String auditManualStatus;

        @NameInMap("AuditAIResult")
        @Validation(required = true)
        public String auditAIResult;

        @NameInMap("AuditTemplateId")
        @Validation(required = true)
        public String auditTemplateId;

        @NameInMap("CustomMediaInfo")
        @Validation(required = true)
        public String customMediaInfo;

        @NameInMap("PlayInfoList")
        @Validation(required = true)
        public java.util.List<SearchMediaResponseMediaListAudioPlayInfoList> playInfoList;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public java.util.List<String> snapshots;

        @NameInMap("SpriteSnapshots")
        @Validation(required = true)
        public java.util.List<String> spriteSnapshots;

        public static SearchMediaResponseMediaListAudio build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListAudio self = new SearchMediaResponseMediaListAudio();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaListImage extends TeaModel {
        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Ext")
        @Validation(required = true)
        public String ext;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static SearchMediaResponseMediaListImage build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaListImage self = new SearchMediaResponseMediaListImage();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMediaResponseMediaList extends TeaModel {
        @NameInMap("MediaType")
        @Validation(required = true)
        public String mediaType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Video")
        @Validation(required = true)
        public SearchMediaResponseMediaListVideo video;

        @NameInMap("Audio")
        @Validation(required = true)
        public SearchMediaResponseMediaListAudio audio;

        @NameInMap("Image")
        @Validation(required = true)
        public SearchMediaResponseMediaListImage image;

        public static SearchMediaResponseMediaList build(java.util.Map<String, ?> map) throws Exception {
            SearchMediaResponseMediaList self = new SearchMediaResponseMediaList();
            return TeaModel.build(map, self);
        }

    }

}
