// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListCustomTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Templates")
    @Validation(required = true)
    public ListCustomTemplateResponseTemplates templates;

    public static ListCustomTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomTemplateResponse self = new ListCustomTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class ListCustomTemplateResponseTemplatesTemplateVideo extends TeaModel {
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

        public static ListCustomTemplateResponseTemplatesTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplatesTemplateVideo self = new ListCustomTemplateResponseTemplatesTemplateVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCustomTemplateResponseTemplatesTemplateAudio extends TeaModel {
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

        public static ListCustomTemplateResponseTemplatesTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplatesTemplateAudio self = new ListCustomTemplateResponseTemplatesTemplateAudio();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCustomTemplateResponseTemplatesTemplateContainer extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        public static ListCustomTemplateResponseTemplatesTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplatesTemplateContainer self = new ListCustomTemplateResponseTemplatesTemplateContainer();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCustomTemplateResponseTemplatesTemplateTransConfig extends TeaModel {
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

        public static ListCustomTemplateResponseTemplatesTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplatesTemplateTransConfig self = new ListCustomTemplateResponseTemplatesTemplateTransConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCustomTemplateResponseTemplatesTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static ListCustomTemplateResponseTemplatesTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplatesTemplateMuxConfigSegment self = new ListCustomTemplateResponseTemplatesTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCustomTemplateResponseTemplatesTemplateMuxConfig extends TeaModel {
        @NameInMap("Segment")
        @Validation(required = true)
        public ListCustomTemplateResponseTemplatesTemplateMuxConfigSegment segment;

        public static ListCustomTemplateResponseTemplatesTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplatesTemplateMuxConfig self = new ListCustomTemplateResponseTemplatesTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCustomTemplateResponseTemplatesTemplate extends TeaModel {
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
        public ListCustomTemplateResponseTemplatesTemplateVideo video;

        @NameInMap("Audio")
        @Validation(required = true)
        public ListCustomTemplateResponseTemplatesTemplateAudio audio;

        @NameInMap("Container")
        @Validation(required = true)
        public ListCustomTemplateResponseTemplatesTemplateContainer container;

        @NameInMap("TransConfig")
        @Validation(required = true)
        public ListCustomTemplateResponseTemplatesTemplateTransConfig transConfig;

        @NameInMap("MuxConfig")
        @Validation(required = true)
        public ListCustomTemplateResponseTemplatesTemplateMuxConfig muxConfig;

        public static ListCustomTemplateResponseTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplatesTemplate self = new ListCustomTemplateResponseTemplatesTemplate();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCustomTemplateResponseTemplates extends TeaModel {
        @NameInMap("Template")
        @Validation(required = true)
        public java.util.List<ListCustomTemplateResponseTemplatesTemplate> template;

        public static ListCustomTemplateResponseTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplateResponseTemplates self = new ListCustomTemplateResponseTemplates();
            return TeaModel.build(map, self);
        }

    }

}
