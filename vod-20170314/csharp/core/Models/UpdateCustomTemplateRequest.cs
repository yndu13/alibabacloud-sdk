// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateCustomTemplateRequest : TeaModel {
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

        [NameInMap("GroupId")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        [NameInMap("Video")]
        [Validation(Required=true)]
        public string Video { get; set; }

        [NameInMap("Audio")]
        [Validation(Required=true)]
        public string Audio { get; set; }

        [NameInMap("TransConfig")]
        [Validation(Required=false)]
        public string TransConfig { get; set; }

        [NameInMap("MuxConfig")]
        [Validation(Required=false)]
        public string MuxConfig { get; set; }

        [NameInMap("Container")]
        [Validation(Required=true)]
        public string Container { get; set; }

        [NameInMap("Definition")]
        [Validation(Required=true)]
        public string Definition { get; set; }

        [NameInMap("UseWaterMark")]
        [Validation(Required=false)]
        public string UseWaterMark { get; set; }

        [NameInMap("Encrypt")]
        [Validation(Required=false)]
        public string Encrypt { get; set; }

        [NameInMap("Condition")]
        [Validation(Required=false)]
        public string Condition { get; set; }

        [NameInMap("TemplateId")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        [NameInMap("NarrowBand")]
        [Validation(Required=false)]
        public string NarrowBand { get; set; }

    }

}
