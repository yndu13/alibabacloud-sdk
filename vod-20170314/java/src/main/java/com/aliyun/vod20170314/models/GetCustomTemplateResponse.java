// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCustomTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Template")
    @Validation(required = true)
    public GetCustomTemplateResponseTemplate template;

    public static GetCustomTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTemplateResponse self = new GetCustomTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCustomTemplateResponseTemplateVideo extends TeaModel {
        @NameInMap("Codec")
        @Validation(required = true)
        public String codec;

        @NameInMap("Profile")
        @Validation(required = true)
        public String profile;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("Crf")
        @Validation(required = true)
        public String crf;

        @NameInMap("Width")
        @Validation(required = true)
        public String width;

        @NameInMap("Height")
        @Validation(required = true)
        public String height;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("Gop")
        @Validation(required = true)
        public String gop;

        @NameInMap("Preset")
        @Validation(required = true)
        public String preset;

        @NameInMap("ScanMode")
        @Validation(required = true)
        public String scanMode;

        @NameInMap("PixFmt")
        @Validation(required = true)
        public String pixFmt;

        @NameInMap("Remove")
        @Validation(required = true)
        public String remove;

        @NameInMap("Crop")
        @Validation(required = true)
        public String crop;

        @NameInMap("Pad")
        @Validation(required = true)
        public String pad;

        public static GetCustomTemplateResponseTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseTemplateVideo self = new GetCustomTemplateResponseTemplateVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCustomTemplateResponseTemplateAudio extends TeaModel {
        @NameInMap("Codec")
        @Validation(required = true)
        public String codec;

        @NameInMap("Profile")
        @Validation(required = true)
        public String profile;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("Samplerate")
        @Validation(required = true)
        public String samplerate;

        @NameInMap("Channels")
        @Validation(required = true)
        public String channels;

        @NameInMap("Remove")
        @Validation(required = true)
        public String remove;

        public static GetCustomTemplateResponseTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseTemplateAudio self = new GetCustomTemplateResponseTemplateAudio();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCustomTemplateResponseTemplateContainer extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        public static GetCustomTemplateResponseTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseTemplateContainer self = new GetCustomTemplateResponseTemplateContainer();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCustomTemplateResponseTemplateTransConfig extends TeaModel {
        @NameInMap("TransMode")
        @Validation(required = true)
        public String transMode;

        @NameInMap("IsCheckReso")
        @Validation(required = true)
        public String isCheckReso;

        @NameInMap("IsCheckResoFail")
        @Validation(required = true)
        public String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        @Validation(required = true)
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckAudioBitrate")
        @Validation(required = true)
        public String isCheckAudioBitrate;

        @NameInMap("isCheckAudioBitrateFail")
        @Validation(required = true)
        public String isCheckAudioBitrateFail;

        @NameInMap("isCheckVideoBitrateFail")
        @Validation(required = true)
        public String isCheckVideoBitrateFail;

        public static GetCustomTemplateResponseTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseTemplateTransConfig self = new GetCustomTemplateResponseTemplateTransConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCustomTemplateResponseTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetCustomTemplateResponseTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseTemplateMuxConfigSegment self = new GetCustomTemplateResponseTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCustomTemplateResponseTemplateMuxConfig extends TeaModel {
        @NameInMap("Segment")
        @Validation(required = true)
        public GetCustomTemplateResponseTemplateMuxConfigSegment segment;

        public static GetCustomTemplateResponseTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseTemplateMuxConfig self = new GetCustomTemplateResponseTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCustomTemplateResponseTemplate extends TeaModel {
        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("Condition")
        @Validation(required = true)
        public String condition;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("UserWaterMark")
        @Validation(required = true)
        public String userWaterMark;

        @NameInMap("NarrowBand")
        @Validation(required = true)
        public String narrowBand;

        @NameInMap("Encrypt")
        @Validation(required = true)
        public String encrypt;

        @NameInMap("Video")
        @Validation(required = true)
        public GetCustomTemplateResponseTemplateVideo video;

        @NameInMap("Audio")
        @Validation(required = true)
        public GetCustomTemplateResponseTemplateAudio audio;

        @NameInMap("Container")
        @Validation(required = true)
        public GetCustomTemplateResponseTemplateContainer container;

        @NameInMap("TransConfig")
        @Validation(required = true)
        public GetCustomTemplateResponseTemplateTransConfig transConfig;

        @NameInMap("MuxConfig")
        @Validation(required = true)
        public GetCustomTemplateResponseTemplateMuxConfig muxConfig;

        public static GetCustomTemplateResponseTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseTemplate self = new GetCustomTemplateResponseTemplate();
            return TeaModel.build(map, self);
        }

    }

}
