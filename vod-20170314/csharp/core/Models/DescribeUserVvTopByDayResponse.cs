// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeUserVvTopByDayResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("UserPlayStatisticsInfos")]
        [Validation(Required=true)]
        public DescribeUserVvTopByDayResponseUserPlayStatisticsInfos UserPlayStatisticsInfos { get; set; }
        public class DescribeUserVvTopByDayResponseUserPlayStatisticsInfos : TeaModel {
            [NameInMap("UserPlayStatisticsInfo")]
            [Validation(Required=true)]
            public List<DescribeUserVvTopByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> UserPlayStatisticsInfo { get; set; }
            public class DescribeUserVvTopByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo : TeaModel {
                    public string Count { get; set; }
                    public string Videoid { get; set; }
                    public string VideoName { get; set; }
            }
        };

    }

}
