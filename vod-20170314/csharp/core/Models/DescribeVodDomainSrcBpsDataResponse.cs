// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainSrcBpsDataResponse : TeaModel {
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

        [NameInMap("SrcBpsDataPerInterval")]
        [Validation(Required=true)]
        public DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerInterval SrcBpsDataPerInterval { get; set; }
        public class DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerInterval : TeaModel {
            [NameInMap("DataModule")]
            [Validation(Required=true)]
            public List<DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerIntervalDataModule> DataModule { get; set; }
            public class DescribeVodDomainSrcBpsDataResponseSrcBpsDataPerIntervalDataModule : TeaModel {
                    public string TimeStamp { get; set; }
                    public string Value { get; set; }
                    public string HttpsValue { get; set; }
            }
        };

    }

}
