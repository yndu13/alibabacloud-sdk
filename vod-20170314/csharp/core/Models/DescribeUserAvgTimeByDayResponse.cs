// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeUserAvgTimeByDayResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("UserPlayStatisticsInfos")]
        [Validation(Required=true)]
        public DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfos UserPlayStatisticsInfos { get; set; }
        public class DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfos : TeaModel {
            [NameInMap("UserPlayStatisticsInfo")]
            [Validation(Required=true)]
            public List<DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> UserPlayStatisticsInfo { get; set; }
            public class DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo : TeaModel {
                    public string Date { get; set; }
                    public string All { get; set; }
            }
        };

    }

}
