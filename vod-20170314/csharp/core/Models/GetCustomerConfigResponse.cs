// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCustomerConfigResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DownloadSwitch")]
        [Validation(Required=true)]
        public string DownloadSwitch { get; set; }

        [NameInMap("MetricConfig")]
        [Validation(Required=true)]
        public string MetricConfig { get; set; }

    }

}
