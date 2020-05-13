// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeUserVodStatusResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Enabled")]
        [Validation(Required=true)]
        public bool? Enabled { get; set; }

        [NameInMap("OnService")]
        [Validation(Required=true)]
        public bool? OnService { get; set; }

        [NameInMap("InDebt")]
        [Validation(Required=true)]
        public bool? InDebt { get; set; }

        [NameInMap("InDebtOverdue")]
        [Validation(Required=true)]
        public bool? InDebtOverdue { get; set; }

    }

}
