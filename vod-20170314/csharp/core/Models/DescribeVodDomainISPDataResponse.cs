// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainISPDataResponse : TeaModel {
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

        [NameInMap("Value")]
        [Validation(Required=true)]
        public DescribeVodDomainISPDataResponseValue Value { get; set; }
        public class DescribeVodDomainISPDataResponseValue : TeaModel {
            [NameInMap("ISPProportionData")]
            [Validation(Required=true)]
            public List<DescribeVodDomainISPDataResponseValueISPProportionData> ISPProportionData { get; set; }
            public class DescribeVodDomainISPDataResponseValueISPProportionData : TeaModel {
                    public string ISP { get; set; }
                    public string Proportion { get; set; }
                    public string IspEname { get; set; }
                    public string AvgObjectSize { get; set; }
                    public string AvgResponseTime { get; set; }
                    public string Bps { get; set; }
                    public string Qps { get; set; }
                    public string AvgResponseRate { get; set; }
                    public string ReqErrRate { get; set; }
                    public string TotalBytes { get; set; }
                    public string BytesProportion { get; set; }
                    public string TotalQuery { get; set; }
            }
        };

    }

}
