// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAIVideoCensorJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoCensorJobList")]
        [Validation(Required=true)]
        public ListAIVideoCensorJobResponseAIVideoCensorJobList AIVideoCensorJobList { get; set; }
        public class ListAIVideoCensorJobResponseAIVideoCensorJobList : TeaModel {
            [NameInMap("AIVideoCensorJob")]
            [Validation(Required=true)]
            public List<ListAIVideoCensorJobResponseAIVideoCensorJobListAIVideoCensorJob> AIVideoCensorJob { get; set; }
            public class ListAIVideoCensorJobResponseAIVideoCensorJobListAIVideoCensorJob : TeaModel {
                    public string JobId { get; set; }
                    public string MediaId { get; set; }
                    public string Status { get; set; }
                    public string Code { get; set; }
                    public string Message { get; set; }
                    public string CreationTime { get; set; }
                    public string Data { get; set; }
            }
        };

        [NameInMap("NonExistAIVideoCensorJobIds")]
        [Validation(Required=true)]
        public ListAIVideoCensorJobResponseNonExistAIVideoCensorJobIds NonExistAIVideoCensorJobIds { get; set; }
        public class ListAIVideoCensorJobResponseNonExistAIVideoCensorJobIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
