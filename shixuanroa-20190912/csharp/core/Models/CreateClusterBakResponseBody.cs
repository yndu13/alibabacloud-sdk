// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.ShixuanROA20190912.Models
{
    public class CreateClusterBakResponseBody : TeaModel {
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
