// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainHttpCodeDataResponse : TeaModel {
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

        [NameInMap("HttpCodeData")]
        [Validation(Required=true)]
        public DescribeVodDomainHttpCodeDataResponseHttpCodeData HttpCodeData { get; set; }
        public class DescribeVodDomainHttpCodeDataResponseHttpCodeData : TeaModel {
            [NameInMap("UsageData")]
            [Validation(Required=true)]
            public List<DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageData> UsageData { get; set; }
            public class DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageData : TeaModel {
                    public string TimeStamp { get; set; }
                    public DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValue Value { get; set; }
                    public class DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValue : TeaModel {
                        [NameInMap("CodeProportionData")]
                        [Validation(Required=true)]
                        public List<DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValueCodeProportionData> CodeProportionData { get; set; }
                        public class DescribeVodDomainHttpCodeDataResponseHttpCodeDataUsageDataValueCodeProportionData : TeaModel {
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
