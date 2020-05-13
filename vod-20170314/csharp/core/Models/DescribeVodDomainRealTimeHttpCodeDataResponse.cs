// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainRealTimeHttpCodeDataResponse : TeaModel {
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

        [NameInMap("RealTimeHttpCodeData")]
        [Validation(Required=true)]
        public DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData RealTimeHttpCodeData { get; set; }
        public class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeData : TeaModel {
            [NameInMap("UsageData")]
            [Validation(Required=true)]
            public List<DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData> UsageData { get; set; }
            public class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageData : TeaModel {
                    public string TimeStamp { get; set; }
                    public DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue Value { get; set; }
                    public class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValue : TeaModel {
                        [NameInMap("RealTimeCodeProportionData")]
                        [Validation(Required=true)]
                        public List<DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> RealTimeCodeProportionData { get; set; }
                        public class DescribeVodDomainRealTimeHttpCodeDataResponseRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData : TeaModel {
                            [NameInMap("Code")]
                            [Validation(Required=true)]
                            public string Code { get; set; }

                            [NameInMap("Proportion")]
                            [Validation(Required=true)]
                            public string Proportion { get; set; }

                            [NameInMap("Count")]
                            [Validation(Required=true)]
                            public string Count { get; set; }

                        }

                    }
            }
        };

    }

}
