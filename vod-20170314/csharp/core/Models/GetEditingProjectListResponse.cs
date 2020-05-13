// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetEditingProjectListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("ProjectList")]
        [Validation(Required=true)]
        public GetEditingProjectListResponseProjectList ProjectList { get; set; }
        public class GetEditingProjectListResponseProjectList : TeaModel {
            [NameInMap("Project")]
            [Validation(Required=true)]
            public List<GetEditingProjectListResponseProjectListProject> Project { get; set; }
            public class GetEditingProjectListResponseProjectListProject : TeaModel {
                    public string ProjectId { get; set; }
                    public string CreateTime { get; set; }
                    public string ModifyTime { get; set; }
                    public string CustomerId { get; set; }
                    public string Status { get; set; }
                    public string Description { get; set; }
                    public string Title { get; set; }
                    public string ProducedMediaId { get; set; }
                    public float? Duration { get; set; }
                    public string CoverUrl { get; set; }
            }
        };

    }

}
