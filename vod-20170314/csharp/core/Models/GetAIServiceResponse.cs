// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAIServiceResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIList")]
        [Validation(Required=true)]
        public List<GetAIServiceResponseAIList> AIList { get; set; }
        public class GetAIServiceResponseAIList : TeaModel {
            [NameInMap("Type")]
            [Validation(Required=true)]
            public string Type { get; set; }

            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }

        }

    }

}
