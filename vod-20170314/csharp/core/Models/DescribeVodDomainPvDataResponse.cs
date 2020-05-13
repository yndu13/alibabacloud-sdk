// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainPvDataResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainName")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        [NameInMap("PvDataInterval")]
        [Validation(Required=true)]
        public DescribeVodDomainPvDataResponsePvDataInterval PvDataInterval { get; set; }
        public class DescribeVodDomainPvDataResponsePvDataInterval : TeaModel {
            [NameInMap("PvDataInterval")]
            [Validation(Required=true)]
            public List<DescribeVodDomainPvDataResponsePvDataIntervalPvDataInterval> PvDataInterval { get; set; }
            public class DescribeVodDomainPvDataResponsePvDataIntervalPvDataInterval : TeaModel {
                    public string Value { get; set; }
                    public string TimeStamp { get; set; }
            }
        };

    }

}
