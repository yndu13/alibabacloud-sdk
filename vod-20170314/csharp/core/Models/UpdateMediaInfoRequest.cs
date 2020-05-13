// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateMediaInfoRequest : TeaModel {
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

        [NameInMap("FileUrl")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        [NameInMap("VideoId")]
        [Validation(Required=true)]
        public string VideoId { get; set; }

        [NameInMap("Title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        [NameInMap("Tags")]
        [Validation(Required=false)]
        public string Tags { get; set; }

        [NameInMap("Privilege")]
        [Validation(Required=false)]
        public int? Privilege { get; set; }

        [NameInMap("Password")]
        [Validation(Required=false)]
        public string Password { get; set; }

        [NameInMap("Description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        [NameInMap("CoverURL")]
        [Validation(Required=false)]
        public string CoverURL { get; set; }

        [NameInMap("CateId")]
        [Validation(Required=false)]
        public int? CateId { get; set; }

        [NameInMap("Duration")]
        [Validation(Required=false)]
        public long Duration { get; set; }

        [NameInMap("MediaWorkflowId")]
        [Validation(Required=false)]
        public string MediaWorkflowId { get; set; }

        [NameInMap("MediaWorkflowUserData")]
        [Validation(Required=false)]
        public string MediaWorkflowUserData { get; set; }

        [NameInMap("MediaWorkflowRunId")]
        [Validation(Required=false)]
        public string MediaWorkflowRunId { get; set; }

    }

}
