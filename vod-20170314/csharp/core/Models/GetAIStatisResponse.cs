// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAIStatisResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIStatisList")]
        [Validation(Required=true)]
        public List<GetAIStatisResponseAIStatisList> AIStatisList { get; set; }
        public class GetAIStatisResponseAIStatisList : TeaModel {
            [NameInMap("StatTime")]
            [Validation(Required=true)]
            public string StatTime { get; set; }

            [NameInMap("StatTimeUTC")]
            [Validation(Required=true)]
            public string StatTimeUTC { get; set; }

            [NameInMap("Duration")]
            [Validation(Required=true)]
            public long Duration { get; set; }

        }

    }

}
