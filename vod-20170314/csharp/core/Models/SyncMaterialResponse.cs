// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SyncMaterialResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("SuccessVideoIds")]
        [Validation(Required=true)]
        public SyncMaterialResponseSuccessVideoIds SuccessVideoIds { get; set; }
        public class SyncMaterialResponseSuccessVideoIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

        [NameInMap("FailedVideoIds")]
        [Validation(Required=true)]
        public SyncMaterialResponseFailedVideoIds FailedVideoIds { get; set; }
        public class SyncMaterialResponseFailedVideoIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
