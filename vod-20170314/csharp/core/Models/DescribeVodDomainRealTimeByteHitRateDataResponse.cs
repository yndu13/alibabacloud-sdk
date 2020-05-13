// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainRealTimeByteHitRateDataResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Data")]
        [Validation(Required=true)]
        public DescribeVodDomainRealTimeByteHitRateDataResponseData Data { get; set; }
        public class DescribeVodDomainRealTimeByteHitRateDataResponseData : TeaModel {
            [NameInMap("ByteHitRateDataModel")]
            [Validation(Required=true)]
            public List<DescribeVodDomainRealTimeByteHitRateDataResponseDataByteHitRateDataModel> ByteHitRateDataModel { get; set; }
            public class DescribeVodDomainRealTimeByteHitRateDataResponseDataByteHitRateDataModel : TeaModel {
                    public float? ByteHitRate { get; set; }
                    public string TimeStamp { get; set; }
            }
        };

    }

}
