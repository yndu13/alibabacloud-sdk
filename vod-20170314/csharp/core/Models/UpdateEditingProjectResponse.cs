// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateEditingProjectResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Project")]
        [Validation(Required=true)]
        public UpdateEditingProjectResponseProject Project { get; set; }
        public class UpdateEditingProjectResponseProject : TeaModel {
            [NameInMap("ProjectId")]
            [Validation(Required=true)]
            public string ProjectId { get; set; }
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public string CreateTime { get; set; }
            [NameInMap("ModifyTime")]
            [Validation(Required=true)]
            public string ModifyTime { get; set; }
            [NameInMap("CustomerId")]
            [Validation(Required=true)]
            public string CustomerId { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("Description")]
            [Validation(Required=true)]
            public string Description { get; set; }
            [NameInMap("Title")]
            [Validation(Required=true)]
            public string Title { get; set; }
            [NameInMap("Timeline")]
            [Validation(Required=true)]
            public string Timeline { get; set; }
            [NameInMap("ProducedMediaId")]
            [Validation(Required=true)]
            public string ProducedMediaId { get; set; }
            [NameInMap("Duration")]
            [Validation(Required=true)]
            public float? Duration { get; set; }
            [NameInMap("CoverUrl")]
            [Validation(Required=true)]
            public string CoverUrl { get; set; }
        };

    }

}
