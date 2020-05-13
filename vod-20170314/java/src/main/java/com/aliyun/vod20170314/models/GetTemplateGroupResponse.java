// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetTemplateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateGroup")
    @Validation(required = true)
    public GetTemplateGroupResponseTemplateGroup templateGroup;

    public static GetTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateGroupResponse self = new GetTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class GetTemplateGroupResponseTemplateGroupTemplatesTemplateVideo extends TeaModel {
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

        @NameInMap("LongShortMode")
        @Validation(required = true)
        public String longShortMode;

        public static GetTemplateGroupResponseTemplateGroupTemplatesTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplatesTemplateVideo self = new GetTemplateGroupResponseTemplateGroupTemplatesTemplateVideo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroupTemplatesTemplateAudio extends TeaModel {
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

        public static GetTemplateGroupResponseTemplateGroupTemplatesTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplatesTemplateAudio self = new GetTemplateGroupResponseTemplateGroupTemplatesTemplateAudio();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroupTemplatesTemplateContainer extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        public static GetTemplateGroupResponseTemplateGroupTemplatesTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplatesTemplateContainer self = new GetTemplateGroupResponseTemplateGroupTemplatesTemplateContainer();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroupTemplatesTemplateTransConfig extends TeaModel {
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

        @NameInMap("IsCheckAudioBitrateFail")
        @Validation(required = true)
        public String isCheckAudioBitrateFail;

        @NameInMap("IsCheckVideoBitrateFail")
        @Validation(required = true)
        public String isCheckVideoBitrateFail;

        public static GetTemplateGroupResponseTemplateGroupTemplatesTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplatesTemplateTransConfig self = new GetTemplateGroupResponseTemplateGroupTemplatesTemplateTransConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfigSegment self = new GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfig extends TeaModel {
        @NameInMap("Segment")
        @Validation(required = true)
        public GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfigSegment segment;

        public static GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfig self = new GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroupTemplatesTemplate extends TeaModel {
        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("MediaDefinition")
        @Validation(required = true)
        public String mediaDefinition;

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

        @NameInMap("UseWaterMark")
        @Validation(required = true)
        public String useWaterMark;

        @NameInMap("NarrowBand")
        @Validation(required = true)
        public String narrowBand;

        @NameInMap("Encrypt")
        @Validation(required = true)
        public String encrypt;

        @NameInMap("IsLocked")
        @Validation(required = true)
        public String isLocked;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Video")
        @Validation(required = true)
        public GetTemplateGroupResponseTemplateGroupTemplatesTemplateVideo video;

        @NameInMap("Audio")
        @Validation(required = true)
        public GetTemplateGroupResponseTemplateGroupTemplatesTemplateAudio audio;

        @NameInMap("Container")
        @Validation(required = true)
        public GetTemplateGroupResponseTemplateGroupTemplatesTemplateContainer container;

        @NameInMap("TransConfig")
        @Validation(required = true)
        public GetTemplateGroupResponseTemplateGroupTemplatesTemplateTransConfig transConfig;

        @NameInMap("MuxConfig")
        @Validation(required = true)
        public GetTemplateGroupResponseTemplateGroupTemplatesTemplateMuxConfig muxConfig;

        public static GetTemplateGroupResponseTemplateGroupTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplatesTemplate self = new GetTemplateGroupResponseTemplateGroupTemplatesTemplate();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroupTemplates extends TeaModel {
        @NameInMap("Template")
        @Validation(required = true)
        public java.util.List<GetTemplateGroupResponseTemplateGroupTemplatesTemplate> template;

        public static GetTemplateGroupResponseTemplateGroupTemplates build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroupTemplates self = new GetTemplateGroupResponseTemplateGroupTemplates();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTemplateGroupResponseTemplateGroup extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("DefaultGroup")
        @Validation(required = true)
        public String defaultGroup;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("GroupType")
        @Validation(required = true)
        public String groupType;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("GroupSymbol")
        @Validation(required = true)
        public String groupSymbol;

        @NameInMap("IsLocked")
        @Validation(required = true)
        public String isLocked;

        @NameInMap("Templates")
        @Validation(required = true)
        public GetTemplateGroupResponseTemplateGroupTemplates templates;

        public static GetTemplateGroupResponseTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupResponseTemplateGroup self = new GetTemplateGroupResponseTemplateGroup();
            return TeaModel.build(map, self);
        }

    }

}
