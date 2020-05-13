// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeUserVvByVideoidResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("UserPlayStatisticsInfos")]
        [Validation(Required=true)]
        public DescribeUserVvByVideoidResponseUserPlayStatisticsInfos UserPlayStatisticsInfos { get; set; }
        public class DescribeUserVvByVideoidResponseUserPlayStatisticsInfos : TeaModel {
            [NameInMap("UserPlayStatisticsInfo")]
            [Validation(Required=true)]
            public List<DescribeUserVvByVideoidResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> UserPlayStatisticsInfo { get; set; }
            public class DescribeUserVvByVideoidResponseUserPlayStatisticsInfosUserPlayStatisticsInfo : TeaModel {
                    public string Date { get; set; }
                    public string All { get; set; }
            }
        };

    }

}
