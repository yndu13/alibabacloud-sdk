// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainRealTimeSrcBpsDataResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainName")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        [NameInMap("EndTime")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        [NameInMap("DataInterval")]
        [Validation(Required=true)]
        public string DataInterval { get; set; }

        [NameInMap("RealTimeSrcBpsDataPerInterval")]
        [Validation(Required=true)]
        public DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerInterval RealTimeSrcBpsDataPerInterval { get; set; }
        public class DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerInterval : TeaModel {
            [NameInMap("DataModule")]
            [Validation(Required=true)]
            public List<DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerIntervalDataModule> DataModule { get; set; }
            public class DescribeVodDomainRealTimeSrcBpsDataResponseRealTimeSrcBpsDataPerIntervalDataModule : TeaModel {
                    public string TimeStamp { get; set; }
                    public string Value { get; set; }
            }
        };

    }

}
