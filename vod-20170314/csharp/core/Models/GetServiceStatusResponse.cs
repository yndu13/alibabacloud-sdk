// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetServiceStatusResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("status")]
        [Validation(Required=true)]
        public int? Status { get; set; }

        [NameInMap("serviceState")]
        [Validation(Required=true)]
        public int? ServiceState { get; set; }

        [NameInMap("InstanceId")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        [NameInMap("ChargeType")]
        [Validation(Required=true)]
        public int? ChargeType { get; set; }

        [NameInMap("ChangingChargeType")]
        [Validation(Required=true)]
        public string ChangingChargeType { get; set; }

        [NameInMap("ChangingAfterTime")]
        [Validation(Required=true)]
        public string ChangingAfterTime { get; set; }

    }

}
