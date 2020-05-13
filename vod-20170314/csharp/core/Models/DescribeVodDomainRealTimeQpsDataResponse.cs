// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainRealTimeQpsDataResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Data")]
        [Validation(Required=true)]
        public DescribeVodDomainRealTimeQpsDataResponseData Data { get; set; }
        public class DescribeVodDomainRealTimeQpsDataResponseData : TeaModel {
            [NameInMap("QpsModel")]
            [Validation(Required=true)]
            public List<DescribeVodDomainRealTimeQpsDataResponseDataQpsModel> QpsModel { get; set; }
            public class DescribeVodDomainRealTimeQpsDataResponseDataQpsModel : TeaModel {
                    public float? Qps { get; set; }
                    public string TimeStamp { get; set; }
            }
        };

    }

}
