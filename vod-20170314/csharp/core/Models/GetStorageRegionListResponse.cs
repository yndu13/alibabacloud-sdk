// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetStorageRegionListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("RegionList")]
        [Validation(Required=true)]
        public GetStorageRegionListResponseRegionList RegionList { get; set; }
        public class GetStorageRegionListResponseRegionList : TeaModel {
            [NameInMap("Region")]
            [Validation(Required=true)]
            public List<GetStorageRegionListResponseRegionListRegion> Region { get; set; }
            public class GetStorageRegionListResponseRegionListRegion : TeaModel {
                    public string RegionID { get; set; }
            }
        };

    }

}
