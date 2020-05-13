// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListCompanionresourceInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("CompanionResourceInfos")]
        [Validation(Required=true)]
        public ListCompanionresourceInfoResponseCompanionResourceInfos CompanionResourceInfos { get; set; }
        public class ListCompanionresourceInfoResponseCompanionResourceInfos : TeaModel {
            [NameInMap("CompanionResourceInfo")]
            [Validation(Required=true)]
            public List<ListCompanionresourceInfoResponseCompanionResourceInfosCompanionResourceInfo> CompanionResourceInfo { get; set; }
            public class ListCompanionresourceInfoResponseCompanionResourceInfosCompanionResourceInfo : TeaModel {
                    public string CompanionResourceId { get; set; }
                    public string CompanionResourceType { get; set; }
                    public string CreationTime { get; set; }
                    public string MediaFileUrl { get; set; }
                    public string ResourceName { get; set; }
                    public string ResourceTags { get; set; }
                    public string CompanionResourceConfig { get; set; }
            }
        };

    }

}
