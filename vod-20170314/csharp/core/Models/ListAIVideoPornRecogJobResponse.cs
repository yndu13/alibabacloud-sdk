// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAIVideoPornRecogJobResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoPornRecogJobList")]
        [Validation(Required=true)]
        public ListAIVideoPornRecogJobResponseAIVideoPornRecogJobList AIVideoPornRecogJobList { get; set; }
        public class ListAIVideoPornRecogJobResponseAIVideoPornRecogJobList : TeaModel {
            [NameInMap("AIVideoPornRecogJob")]
            [Validation(Required=true)]
            public List<ListAIVideoPornRecogJobResponseAIVideoPornRecogJobListAIVideoPornRecogJob> AIVideoPornRecogJob { get; set; }
            public class ListAIVideoPornRecogJobResponseAIVideoPornRecogJobListAIVideoPornRecogJob : TeaModel {
                    public string JobId { get; set; }
                    public string MediaId { get; set; }
                    public string Status { get; set; }
                    public string Code { get; set; }
                    public string Message { get; set; }
                    public string CreationTime { get; set; }
                    public string Data { get; set; }
            }
        };

        [NameInMap("NonExistPornRecogJobIds")]
        [Validation(Required=true)]
        public ListAIVideoPornRecogJobResponseNonExistPornRecogJobIds NonExistPornRecogJobIds { get; set; }
        public class ListAIVideoPornRecogJobResponseNonExistPornRecogJobIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
