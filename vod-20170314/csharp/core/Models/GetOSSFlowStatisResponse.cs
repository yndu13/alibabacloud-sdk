// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetOSSFlowStatisResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("OSSFlowStatisList")]
        [Validation(Required=true)]
        public List<GetOSSFlowStatisResponseOSSFlowStatisList> OSSFlowStatisList { get; set; }
        public class GetOSSFlowStatisResponseOSSFlowStatisList : TeaModel {
            [NameInMap("StatTime")]
            [Validation(Required=true)]
            public string StatTime { get; set; }

            [NameInMap("StatTimeUTC")]
            [Validation(Required=true)]
            public string StatTimeUTC { get; set; }

            [NameInMap("NetworkOut")]
            [Validation(Required=true)]
            public long NetworkOut { get; set; }

        }

    }

}
