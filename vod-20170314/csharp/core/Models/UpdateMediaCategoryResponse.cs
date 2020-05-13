// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateMediaCategoryResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Media")]
        [Validation(Required=true)]
        public UpdateMediaCategoryResponseMedia Media { get; set; }
        public class UpdateMediaCategoryResponseMedia : TeaModel {
            [NameInMap("MediaId")]
            [Validation(Required=true)]
            public string MediaId { get; set; }
            [NameInMap("Title")]
            [Validation(Required=true)]
            public string Title { get; set; }
            [NameInMap("Description")]
            [Validation(Required=true)]
            public string Description { get; set; }
            [NameInMap("CoverUrl")]
            [Validation(Required=true)]
            public string CoverUrl { get; set; }
            [NameInMap("CateId")]
            [Validation(Required=true)]
            public long CateId { get; set; }
            [NameInMap("Tags")]
            [Validation(Required=true)]
            public string Tags { get; set; }
            [NameInMap("Duration")]
            [Validation(Required=true)]
            public string Duration { get; set; }
            [NameInMap("FileSize")]
            [Validation(Required=true)]
            public string FileSize { get; set; }
            [NameInMap("State")]
            [Validation(Required=true)]
            public int? State { get; set; }
            [NameInMap("MediaWorkflowRunId")]
            [Validation(Required=true)]
            public string MediaWorkflowRunId { get; set; }
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public string CreateTime { get; set; }
            [NameInMap("CreateIp")]
            [Validation(Required=true)]
            public string CreateIp { get; set; }
            [NameInMap("MediaWorkflowId")]
            [Validation(Required=true)]
            public string MediaWorkflowId { get; set; }
            [NameInMap("PublicType")]
            [Validation(Required=true)]
            public int? PublicType { get; set; }
            [NameInMap("Snapshots")]
            [Validation(Required=true)]
            public UpdateMediaCategoryResponseMediaSnapshots Snapshots { get; set; }
            public class UpdateMediaCategoryResponseMediaSnapshots : TeaModel {
                [NameInMap("Snapshot")]
                [Validation(Required=true)]
                public List<string> Snapshot { get; set; }

            }
        };

    }

}
