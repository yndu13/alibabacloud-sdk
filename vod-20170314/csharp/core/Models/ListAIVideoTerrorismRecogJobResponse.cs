// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAIVideoTerrorismRecogJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoTerrorismRecogJobList")]
        [Validation(Required=true)]
        public ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobList AIVideoTerrorismRecogJobList { get; set; }
        public class ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobList : TeaModel {
            [NameInMap("AIVideoTerrorismRecogJob")]
            [Validation(Required=true)]
            public List<ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob> AIVideoTerrorismRecogJob { get; set; }
            public class ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob : TeaModel {
                    public string JobId { get; set; }
                    public string MediaId { get; set; }
                    public string Status { get; set; }
                    public string Code { get; set; }
                    public string Message { get; set; }
                    public string CreationTime { get; set; }
                    public string Data { get; set; }
            }
        };

        [NameInMap("NonExistTerrorismRecogJobIds")]
        [Validation(Required=true)]
        public ListAIVideoTerrorismRecogJobResponseNonExistTerrorismRecogJobIds NonExistTerrorismRecogJobIds { get; set; }
        public class ListAIVideoTerrorismRecogJobResponseNonExistTerrorismRecogJobIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
