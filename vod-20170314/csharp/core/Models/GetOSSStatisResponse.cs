// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetOSSStatisResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MaxStorageUtilization")]
        [Validation(Required=true)]
        public long MaxStorageUtilization { get; set; }

        [NameInMap("OssStatisList")]
        [Validation(Required=true)]
        public GetOSSStatisResponseOssStatisList OssStatisList { get; set; }
        public class GetOSSStatisResponseOssStatisList : TeaModel {
            [NameInMap("OSSMetric")]
            [Validation(Required=true)]
            public List<GetOSSStatisResponseOssStatisListOSSMetric> OSSMetric { get; set; }
            public class GetOSSStatisResponseOssStatisListOSSMetric : TeaModel {
                    public string StatTime { get; set; }
                    public string StatTimeUTC { get; set; }
                    public long StorageUtilization { get; set; }
            }
        };

    }

}
