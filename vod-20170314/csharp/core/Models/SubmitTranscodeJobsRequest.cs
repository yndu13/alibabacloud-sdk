// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SubmitTranscodeJobsRequest : TeaModel {
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

        [NameInMap("VideoId")]
        [Validation(Required=true)]
        public string VideoId { get; set; }

        [NameInMap("TemplateGroupId")]
        [Validation(Required=true)]
        public string TemplateGroupId { get; set; }

        [NameInMap("PipelineId")]
        [Validation(Required=false)]
        public string PipelineId { get; set; }

        [NameInMap("EncryptConfig")]
        [Validation(Required=false)]
        public string EncryptConfig { get; set; }

        [NameInMap("OverrideParams")]
        [Validation(Required=false)]
        public string OverrideParams { get; set; }

    }

}
