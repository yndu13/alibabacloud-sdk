// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAIASRJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIASRJobList")]
        [Validation(Required=true)]
        public ListAIASRJobResponseAIASRJobList AIASRJobList { get; set; }
        public class ListAIASRJobResponseAIASRJobList : TeaModel {
            [NameInMap("AIASRJob")]
            [Validation(Required=true)]
            public List<ListAIASRJobResponseAIASRJobListAIASRJob> AIASRJob { get; set; }
            public class ListAIASRJobResponseAIASRJobListAIASRJob : TeaModel {
                    public string JobId { get; set; }
                    public string MediaId { get; set; }
                    public string Status { get; set; }
                    public string Code { get; set; }
                    public string Message { get; set; }
                    public string CreationTime { get; set; }
                    public string Data { get; set; }
            }
        };

        [NameInMap("NonExistAIASRJobIds")]
        [Validation(Required=true)]
        public ListAIASRJobResponseNonExistAIASRJobIds NonExistAIASRJobIds { get; set; }
        public class ListAIASRJobResponseNonExistAIASRJobIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
