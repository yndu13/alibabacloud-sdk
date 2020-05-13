// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SetAIServiceResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("SuccessTypes")]
        [Validation(Required=true)]
        public string SuccessTypes { get; set; }

        [NameInMap("FailedTypes")]
        [Validation(Required=true)]
        public string FailedTypes { get; set; }

    }

}
