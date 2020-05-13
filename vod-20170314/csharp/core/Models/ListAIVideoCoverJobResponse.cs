// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAIVideoCoverJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoCoverJobList")]
        [Validation(Required=true)]
        public ListAIVideoCoverJobResponseAIVideoCoverJobList AIVideoCoverJobList { get; set; }
        public class ListAIVideoCoverJobResponseAIVideoCoverJobList : TeaModel {
            [NameInMap("AIVideoCoverJob")]
            [Validation(Required=true)]
            public List<ListAIVideoCoverJobResponseAIVideoCoverJobListAIVideoCoverJob> AIVideoCoverJob { get; set; }
            public class ListAIVideoCoverJobResponseAIVideoCoverJobListAIVideoCoverJob : TeaModel {
                    public string JobId { get; set; }
                    public string MediaId { get; set; }
                    public string Status { get; set; }
                    public string Code { get; set; }
                    public string Message { get; set; }
                    public string CreationTime { get; set; }
                    public string Data { get; set; }
            }
        };

        [NameInMap("NonExistAIVideoCoverJobIds")]
        [Validation(Required=true)]
        public ListAIVideoCoverJobResponseNonExistAIVideoCoverJobIds NonExistAIVideoCoverJobIds { get; set; }
        public class ListAIVideoCoverJobResponseNonExistAIVideoCoverJobIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
