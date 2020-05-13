// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListCustomTemplateResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Templates")]
        [Validation(Required=true)]
        public ListCustomTemplateResponseTemplates Templates { get; set; }
        public class ListCustomTemplateResponseTemplates : TeaModel {
            [NameInMap("Template")]
            [Validation(Required=true)]
            public List<ListCustomTemplateResponseTemplatesTemplate> Template { get; set; }
            public class ListCustomTemplateResponseTemplatesTemplate : TeaModel {
                    public string Definition { get; set; }
                    public string Condition { get; set; }
                    public string TemplateId { get; set; }
                    public string Status { get; set; }
                    public string UserWaterMark { get; set; }
                    public string NarrowBand { get; set; }
                    public string Encrypt { get; set; }
                    public ListCustomTemplateResponseTemplatesTemplateVideo Video { get; set; }
                    public class ListCustomTemplateResponseTemplatesTemplateVideo : TeaModel {
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
                    public ListCustomTemplateResponseTemplatesTemplateAudio Audio { get; set; }
                    public class ListCustomTemplateResponseTemplatesTemplateAudio : TeaModel {
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
                    public ListCustomTemplateResponseTemplatesTemplateContainer Container { get; set; }
                    public class ListCustomTemplateResponseTemplatesTemplateContainer : TeaModel {
                        [NameInMap("Format")]
                        [Validation(Required=true)]
                        public string Format { get; set; }

                    }
                    public ListCustomTemplateResponseTemplatesTemplateTransConfig TransConfig { get; set; }
                    public class ListCustomTemplateResponseTemplatesTemplateTransConfig : TeaModel {
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
                    public ListCustomTemplateResponseTemplatesTemplateMuxConfig MuxConfig { get; set; }
                    public class ListCustomTemplateResponseTemplatesTemplateMuxConfig : TeaModel {
                        [NameInMap("Segment")]
                        [Validation(Required=true)]
                        public ListCustomTemplateResponseTemplatesTemplateMuxConfigSegment Segment { get; set; }
                        public class ListCustomTemplateResponseTemplatesTemplateMuxConfigSegment : TeaModel {
                            [NameInMap("Duration")]
                            [Validation(Required=true)]
                            public string Duration { get; set; }
                        };

                    }
            }
        };

    }

}
