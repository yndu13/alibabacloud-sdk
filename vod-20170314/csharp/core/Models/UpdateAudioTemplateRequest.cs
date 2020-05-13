// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateAudioTemplateRequest : TeaModel {
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

        [NameInMap("Codec")]
        [Validation(Required=true)]
        public string Codec { get; set; }

        [NameInMap("Bitrate")]
        [Validation(Required=true)]
        public string Bitrate { get; set; }

        [NameInMap("Channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        [NameInMap("Remove")]
        [Validation(Required=false)]
        public string Remove { get; set; }

        [NameInMap("Name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("Muxer")]
        [Validation(Required=true)]
        public string Muxer { get; set; }

        [NameInMap("Status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        [NameInMap("Type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        [NameInMap("IsDefault")]
        [Validation(Required=true)]
        public string IsDefault { get; set; }

        [NameInMap("TemplateId")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

    }

}
