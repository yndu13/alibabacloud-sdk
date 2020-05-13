// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class CompleteOrderParamResponse : TeaModel {
        [NameInMap("requestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
