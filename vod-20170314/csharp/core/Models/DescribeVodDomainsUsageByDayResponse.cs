// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainsUsageByDayResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainName")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        [NameInMap("DataInterval")]
        [Validation(Required=true)]
        public string DataInterval { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        [NameInMap("EndTime")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        [NameInMap("UsageByDays")]
        [Validation(Required=true)]
        public DescribeVodDomainsUsageByDayResponseUsageByDays UsageByDays { get; set; }
        public class DescribeVodDomainsUsageByDayResponseUsageByDays : TeaModel {
            [NameInMap("UsageByDay")]
            [Validation(Required=true)]
            public List<DescribeVodDomainsUsageByDayResponseUsageByDaysUsageByDay> UsageByDay { get; set; }
            public class DescribeVodDomainsUsageByDayResponseUsageByDaysUsageByDay : TeaModel {
                    public string TimeStamp { get; set; }
                    public string Qps { get; set; }
                    public string BytesHitRate { get; set; }
                    public string RequestHitRate { get; set; }
                    public string MaxBps { get; set; }
                    public string MaxBpsTime { get; set; }
                    public string MaxSrcBps { get; set; }
                    public string MaxSrcBpsTime { get; set; }
                    public string TotalAccess { get; set; }
                    public string TotalTraffic { get; set; }
            }
        };

        [NameInMap("UsageTotal")]
        [Validation(Required=true)]
        public DescribeVodDomainsUsageByDayResponseUsageTotal UsageTotal { get; set; }
        public class DescribeVodDomainsUsageByDayResponseUsageTotal : TeaModel {
            [NameInMap("BytesHitRate")]
            [Validation(Required=true)]
            public string BytesHitRate { get; set; }
            [NameInMap("RequestHitRate")]
            [Validation(Required=true)]
            public string RequestHitRate { get; set; }
            [NameInMap("MaxBps")]
            [Validation(Required=true)]
            public string MaxBps { get; set; }
            [NameInMap("MaxBpsTime")]
            [Validation(Required=true)]
            public string MaxBpsTime { get; set; }
            [NameInMap("MaxSrcBps")]
            [Validation(Required=true)]
            public string MaxSrcBps { get; set; }
            [NameInMap("MaxSrcBpsTime")]
            [Validation(Required=true)]
            public string MaxSrcBpsTime { get; set; }
            [NameInMap("TotalAccess")]
            [Validation(Required=true)]
            public string TotalAccess { get; set; }
            [NameInMap("TotalTraffic")]
            [Validation(Required=true)]
            public string TotalTraffic { get; set; }
        };

    }

}
