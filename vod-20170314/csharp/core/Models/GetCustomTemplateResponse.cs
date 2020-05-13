// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCustomTemplateResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Template")]
        [Validation(Required=true)]
        public GetCustomTemplateResponseTemplate Template { get; set; }
        public class GetCustomTemplateResponseTemplate : TeaModel {
            [NameInMap("Definition")]
            [Validation(Required=true)]
            public string Definition { get; set; }
            [NameInMap("Condition")]
            [Validation(Required=true)]
            public string Condition { get; set; }
            [NameInMap("TemplateId")]
            [Validation(Required=true)]
            public string TemplateId { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("UserWaterMark")]
            [Validation(Required=true)]
            public string UserWaterMark { get; set; }
            [NameInMap("NarrowBand")]
            [Validation(Required=true)]
            public string NarrowBand { get; set; }
            [NameInMap("Encrypt")]
            [Validation(Required=true)]
            public string Encrypt { get; set; }
            [NameInMap("Video")]
            [Validation(Required=true)]
            public GetCustomTemplateResponseTemplateVideo Video { get; set; }
            public class GetCustomTemplateResponseTemplateVideo : TeaModel {
                [NameInMap("Codec")]
                [Validation(Required=true)]
                public string Codec { get; set; }

                [NameInMap("Profile")]
                [Validation(Required=true)]
                public string Profile { get; set; }

                [NameInMap("Bitrate")]
                [Validation(Required=true)]
                public string Bitrate { get; set; }

                [NameInMap("Crf")]
                [Validation(Required=true)]
                public string Crf { get; set; }

                [NameInMap("Width")]
                [Validation(Required=true)]
                public string Width { get; set; }

                [NameInMap("Height")]
                [Validation(Required=true)]
                public string Height { get; set; }

                [NameInMap("Fps")]
                [Validation(Required=true)]
                public string Fps { get; set; }

                [NameInMap("Gop")]
                [Validation(Required=true)]
                public string Gop { get; set; }

                [NameInMap("Preset")]
                [Validation(Required=true)]
                public string Preset { get; set; }

                [NameInMap("ScanMode")]
                [Validation(Required=true)]
                public string ScanMode { get; set; }

                [NameInMap("PixFmt")]
                [Validation(Required=true)]
                public string PixFmt { get; set; }

                [NameInMap("Remove")]
                [Validation(Required=true)]
                public string Remove { get; set; }

                [NameInMap("Crop")]
                [Validation(Required=true)]
                public string Crop { get; set; }

                [NameInMap("Pad")]
                [Validation(Required=true)]
                public string Pad { get; set; }

            }
            [NameInMap("Audio")]
            [Validation(Required=true)]
            public GetCustomTemplateResponseTemplateAudio Audio { get; set; }
            public class GetCustomTemplateResponseTemplateAudio : TeaModel {
                [NameInMap("Codec")]
                [Validation(Required=true)]
                public string Codec { get; set; }

                [NameInMap("Profile")]
                [Validation(Required=true)]
                public string Profile { get; set; }

                [NameInMap("Bitrate")]
                [Validation(Required=true)]
                public string Bitrate { get; set; }

                [NameInMap("Samplerate")]
                [Validation(Required=true)]
                public string Samplerate { get; set; }

                [NameInMap("Channels")]
                [Validation(Required=true)]
                public string Channels { get; set; }

                [NameInMap("Remove")]
                [Validation(Required=true)]
                public string Remove { get; set; }

            }
            [NameInMap("Container")]
            [Validation(Required=true)]
            public GetCustomTemplateResponseTemplateContainer Container { get; set; }
            public class GetCustomTemplateResponseTemplateContainer : TeaModel {
                [NameInMap("Format")]
                [Validation(Required=true)]
                public string Format { get; set; }

            }
            [NameInMap("TransConfig")]
            [Validation(Required=true)]
            public GetCustomTemplateResponseTemplateTransConfig TransConfig { get; set; }
            public class GetCustomTemplateResponseTemplateTransConfig : TeaModel {
                [NameInMap("TransMode")]
                [Validation(Required=true)]
                public string TransMode { get; set; }

                [NameInMap("IsCheckReso")]
                [Validation(Required=true)]
                public string IsCheckReso { get; set; }

                [NameInMap("IsCheckResoFail")]
                [Validation(Required=true)]
                public string IsCheckResoFail { get; set; }

                [NameInMap("IsCheckVideoBitrate")]
                [Validation(Required=true)]
                public string IsCheckVideoBitrate { get; set; }

                [NameInMap("IsCheckAudioBitrate")]
                [Validation(Required=true)]
                public string IsCheckAudioBitrate { get; set; }

                [NameInMap("isCheckAudioBitrateFail")]
                [Validation(Required=true)]
                public string IsCheckAudioBitrateFail { get; set; }

                [NameInMap("isCheckVideoBitrateFail")]
                [Validation(Required=true)]
                public string IsCheckVideoBitrateFail { get; set; }

            }
            [NameInMap("MuxConfig")]
            [Validation(Required=true)]
            public GetCustomTemplateResponseTemplateMuxConfig MuxConfig { get; set; }
            public class GetCustomTemplateResponseTemplateMuxConfig : TeaModel {
                [NameInMap("Segment")]
                [Validation(Required=true)]
                public GetCustomTemplateResponseTemplateMuxConfigSegment Segment { get; set; }
                public class GetCustomTemplateResponseTemplateMuxConfigSegment : TeaModel {
                    [NameInMap("Duration")]
                    [Validation(Required=true)]
                    public string Duration { get; set; }
                };

            }
        };

    }

}
