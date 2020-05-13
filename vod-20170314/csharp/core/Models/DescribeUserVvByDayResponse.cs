// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeUserVvByDayResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("UserPlayStatisticsInfos")]
        [Validation(Required=true)]
        public DescribeUserVvByDayResponseUserPlayStatisticsInfos UserPlayStatisticsInfos { get; set; }
        public class DescribeUserVvByDayResponseUserPlayStatisticsInfos : TeaModel {
            [NameInMap("UserPlayStatisticsInfo")]
            [Validation(Required=true)]
            public List<DescribeUserVvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> UserPlayStatisticsInfo { get; set; }
            public class DescribeUserVvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo : TeaModel {
                    public string Date { get; set; }
                    public string Android { get; set; }
                    public string Ios { get; set; }
                    public string H5 { get; set; }
                    public string Flash { get; set; }
            }
        };

    }

}
