// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAudioTemplateResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Audio")]
        [Validation(Required=true)]
        public GetAudioTemplateResponseAudio Audio { get; set; }
        public class GetAudioTemplateResponseAudio : TeaModel {
            [NameInMap("TemplateId")]
            [Validation(Required=true)]
            public string TemplateId { get; set; }
            [NameInMap("Codec")]
            [Validation(Required=true)]
            public string Codec { get; set; }
            [NameInMap("Bitrate")]
            [Validation(Required=true)]
            public string Bitrate { get; set; }
            [NameInMap("Channeles")]
            [Validation(Required=true)]
            public string Channeles { get; set; }
            [NameInMap("Remove")]
            [Validation(Required=true)]
            public string Remove { get; set; }
            [NameInMap("Name")]
            [Validation(Required=true)]
            public string Name { get; set; }
            [NameInMap("Format")]
            [Validation(Required=true)]
            public string Format { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("Type")]
            [Validation(Required=true)]
            public string Type { get; set; }
            [NameInMap("IsDefault")]
            [Validation(Required=true)]
            public string IsDefault { get; set; }
        };

    }

}
