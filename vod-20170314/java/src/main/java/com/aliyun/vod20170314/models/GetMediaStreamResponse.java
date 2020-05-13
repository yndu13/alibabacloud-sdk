// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMediaStreamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StreamInfo")
    @Validation(required = true)
    public GetMediaStreamResponseStreamInfo streamInfo;

    public static GetMediaStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaStreamResponse self = new GetMediaStreamResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaStreamResponseStreamInfoAudioStream extends TeaModel {
        @NameInMap("Index")
        @Validation(required = true)
        public String index;

        @NameInMap("CodecName")
        @Validation(required = true)
        public String codecName;

        @NameInMap("CodecLongName")
        @Validation(required = true)
        public String codecLongName;

        @NameInMap("CodecTimeBase")
        @Validation(required = true)
        public String codecTimeBase;

        @NameInMap("CodecTagString")
        @Validation(required = true)
        public String codecTagString;

        @NameInMap("CodecTag")
        @Validation(required = true)
        public String codecTag;

        @NameInMap("SampleFmt")
        @Validation(required = true)
        public String sampleFmt;

        @NameInMap("SampleRate")
        @Validation(required = true)
        public String sampleRate;

        @NameInMap("Channels")
        @Validation(required = true)
        public String channels;

        @NameInMap("ChannelLayout")
        @Validation(required = true)
        public String channelLayout;

        @NameInMap("Timebase")
        @Validation(required = true)
        public String timebase;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("NumFrames")
        @Validation(required = true)
        public String numFrames;

        @NameInMap("Lang")
        @Validation(required = true)
        public String lang;

        public static GetMediaStreamResponseStreamInfoAudioStream build(java.util.Map<String, ?> map) throws Exception {
            GetMediaStreamResponseStreamInfoAudioStream self = new GetMediaStreamResponseStreamInfoAudioStream();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaStreamResponseStreamInfoVideoStream extends TeaModel {
        @NameInMap("Index")
        @Validation(required = true)
        public String index;

        @NameInMap("CodecName")
        @Validation(required = true)
        public String codecName;

        @NameInMap("CodecLongName")
        @Validation(required = true)
        public String codecLongName;

        @NameInMap("Profile")
        @Validation(required = true)
        public String profile;

        @NameInMap("CodecTimeBase")
        @Validation(required = true)
        public String codecTimeBase;

        @NameInMap("CodecTagString")
        @Validation(required = true)
        public String codecTagString;

        @NameInMap("CodecTag")
        @Validation(required = true)
        public String codecTag;

        @NameInMap("Width")
        @Validation(required = true)
        public String width;

        @NameInMap("Height")
        @Validation(required = true)
        public String height;

        @NameInMap("HasBFrames")
        @Validation(required = true)
        public String hasBFrames;

        @NameInMap("Sar")
        @Validation(required = true)
        public String sar;

        @NameInMap("Dar")
        @Validation(required = true)
        public String dar;

        @NameInMap("PixFmt")
        @Validation(required = true)
        public String pixFmt;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("AvgFPS")
        @Validation(required = true)
        public String avgFPS;

        @NameInMap("Timebase")
        @Validation(required = true)
        public String timebase;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("NumFrames")
        @Validation(required = true)
        public String numFrames;

        @NameInMap("Lang")
        @Validation(required = true)
        public String lang;

        public static GetMediaStreamResponseStreamInfoVideoStream build(java.util.Map<String, ?> map) throws Exception {
            GetMediaStreamResponseStreamInfoVideoStream self = new GetMediaStreamResponseStreamInfoVideoStream();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaStreamResponseStreamInfoPlayInfo extends TeaModel {
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

        @NameInMap("PreprocessStatus")
        @Validation(required = true)
        public String preprocessStatus;

        @NameInMap("WatermarkId")
        @Validation(required = true)
        public String watermarkId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("EncryptType")
        @Validation(required = true)
        public String encryptType;

        @NameInMap("TemplateGroupId")
        @Validation(required = true)
        public String templateGroupId;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        public static GetMediaStreamResponseStreamInfoPlayInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaStreamResponseStreamInfoPlayInfo self = new GetMediaStreamResponseStreamInfoPlayInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaStreamResponseStreamInfo extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("FileType")
        @Validation(required = true)
        public String fileType;

        @NameInMap("AudioStream")
        @Validation(required = true)
        public GetMediaStreamResponseStreamInfoAudioStream audioStream;

        @NameInMap("VideoStream")
        @Validation(required = true)
        public GetMediaStreamResponseStreamInfoVideoStream videoStream;

        @NameInMap("PlayInfo")
        @Validation(required = true)
        public GetMediaStreamResponseStreamInfoPlayInfo playInfo;

        public static GetMediaStreamResponseStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaStreamResponseStreamInfo self = new GetMediaStreamResponseStreamInfo();
            return TeaModel.build(map, self);
        }

    }

}
