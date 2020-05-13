// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCompanionresourceInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("CompanionResourceInfo")]
        [Validation(Required=true)]
        public GetCompanionresourceInfoResponseCompanionResourceInfo CompanionResourceInfo { get; set; }
        public class GetCompanionresourceInfoResponseCompanionResourceInfo : TeaModel {
            [NameInMap("CompanionResourceId")]
            [Validation(Required=true)]
            public string CompanionResourceId { get; set; }
            [NameInMap("CompanionResourceType")]
            [Validation(Required=true)]
            public string CompanionResourceType { get; set; }
            [NameInMap("CreationTime")]
            [Validation(Required=true)]
            public string CreationTime { get; set; }
            [NameInMap("MediaFileUrl")]
            [Validation(Required=true)]
            public string MediaFileUrl { get; set; }
            [NameInMap("ResourceName")]
            [Validation(Required=true)]
            public string ResourceName { get; set; }
            [NameInMap("ResourceTags")]
            [Validation(Required=true)]
            public string ResourceTags { get; set; }
            [NameInMap("CompanionResourceConfig")]
            [Validation(Required=true)]
            public string CompanionResourceConfig { get; set; }
        };

    }

}
