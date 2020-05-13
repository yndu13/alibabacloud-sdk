// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainRealTimeReqHitRateDataResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Data")]
        [Validation(Required=true)]
        public DescribeVodDomainRealTimeReqHitRateDataResponseData Data { get; set; }
        public class DescribeVodDomainRealTimeReqHitRateDataResponseData : TeaModel {
            [NameInMap("ReqHitRateDataModel")]
            [Validation(Required=true)]
            public List<DescribeVodDomainRealTimeReqHitRateDataResponseDataReqHitRateDataModel> ReqHitRateDataModel { get; set; }
            public class DescribeVodDomainRealTimeReqHitRateDataResponseDataReqHitRateDataModel : TeaModel {
                    public float? ReqHitRate { get; set; }
                    public string TimeStamp { get; set; }
            }
        };

    }

}
