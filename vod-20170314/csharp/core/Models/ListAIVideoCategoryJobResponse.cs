// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAIVideoCategoryJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoCategoryJobList")]
        [Validation(Required=true)]
        public ListAIVideoCategoryJobResponseAIVideoCategoryJobList AIVideoCategoryJobList { get; set; }
        public class ListAIVideoCategoryJobResponseAIVideoCategoryJobList : TeaModel {
            [NameInMap("AIVideoCategoryJob")]
            [Validation(Required=true)]
            public List<ListAIVideoCategoryJobResponseAIVideoCategoryJobListAIVideoCategoryJob> AIVideoCategoryJob { get; set; }
            public class ListAIVideoCategoryJobResponseAIVideoCategoryJobListAIVideoCategoryJob : TeaModel {
                    public string JobId { get; set; }
                    public string MediaId { get; set; }
                    public string Status { get; set; }
                    public string Code { get; set; }
                    public string Message { get; set; }
                    public string CreationTime { get; set; }
                    public string Data { get; set; }
            }
        };

        [NameInMap("NonExistAIVideoCategoryJobIds")]
        [Validation(Required=true)]
        public ListAIVideoCategoryJobResponseNonExistAIVideoCategoryJobIds NonExistAIVideoCategoryJobIds { get; set; }
        public class ListAIVideoCategoryJobResponseNonExistAIVideoCategoryJobIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
