// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainUvDataResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainName")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        [NameInMap("UvDataInterval")]
        [Validation(Required=true)]
        public DescribeVodDomainUvDataResponseUvDataInterval UvDataInterval { get; set; }
        public class DescribeVodDomainUvDataResponseUvDataInterval : TeaModel {
            [NameInMap("UvDataInterval")]
            [Validation(Required=true)]
            public List<DescribeVodDomainUvDataResponseUvDataIntervalUvDataInterval> UvDataInterval { get; set; }
            public class DescribeVodDomainUvDataResponseUvDataIntervalUvDataInterval : TeaModel {
                    public string Value { get; set; }
                    public string TimeStamp { get; set; }
            }
        };

    }

}
