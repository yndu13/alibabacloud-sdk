// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAudioTemplateResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Audios")]
        [Validation(Required=true)]
        public ListAudioTemplateResponseAudios Audios { get; set; }
        public class ListAudioTemplateResponseAudios : TeaModel {
            [NameInMap("Audio")]
            [Validation(Required=true)]
            public List<ListAudioTemplateResponseAudiosAudio> Audio { get; set; }
            public class ListAudioTemplateResponseAudiosAudio : TeaModel {
                    public string TemplateId { get; set; }
                    public string Codec { get; set; }
                    public string Bitrate { get; set; }
                    public string Channeles { get; set; }
                    public string Remove { get; set; }
                    public string Name { get; set; }
                    public string Format { get; set; }
                    public string Status { get; set; }
                    public string Type { get; set; }
                    public string IsDefault { get; set; }
            }
        };

    }

}
