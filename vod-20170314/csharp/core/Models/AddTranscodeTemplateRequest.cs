// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddTranscodeTemplateRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("Muxer")]
        [Validation(Required=true)]
        public string Muxer { get; set; }

        [NameInMap("Resolution")]
        [Validation(Required=true)]
        public string Resolution { get; set; }

        [NameInMap("Detail")]
        [Validation(Required=true)]
        public string Detail { get; set; }

        [NameInMap("Name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("VideoBitrate")]
        [Validation(Required=true)]
        public string VideoBitrate { get; set; }

        [NameInMap("VideoCodec")]
        [Validation(Required=true)]
        public string VideoCodec { get; set; }

        [NameInMap("AudioBitrate")]
        [Validation(Required=true)]
        public string AudioBitrate { get; set; }

        [NameInMap("AudioCodec")]
        [Validation(Required=true)]
        public string AudioCodec { get; set; }

    }

}
