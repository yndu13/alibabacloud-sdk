// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainRealTimeBpsDataResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Data")]
        [Validation(Required=true)]
        public DescribeVodDomainRealTimeBpsDataResponseData Data { get; set; }
        public class DescribeVodDomainRealTimeBpsDataResponseData : TeaModel {
            [NameInMap("BpsModel")]
            [Validation(Required=true)]
            public List<DescribeVodDomainRealTimeBpsDataResponseDataBpsModel> BpsModel { get; set; }
            public class DescribeVodDomainRealTimeBpsDataResponseDataBpsModel : TeaModel {
                    public float? Bps { get; set; }
                    public string TimeStamp { get; set; }
            }
        };

    }

}
