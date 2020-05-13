// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainQpsDataResponse : TeaModel {
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

        [NameInMap("QpsDataInterval")]
        [Validation(Required=true)]
        public DescribeVodDomainQpsDataResponseQpsDataInterval QpsDataInterval { get; set; }
        public class DescribeVodDomainQpsDataResponseQpsDataInterval : TeaModel {
            [NameInMap("DataModule")]
            [Validation(Required=true)]
            public List<DescribeVodDomainQpsDataResponseQpsDataIntervalDataModule> DataModule { get; set; }
            public class DescribeVodDomainQpsDataResponseQpsDataIntervalDataModule : TeaModel {
                    public string TimeStamp { get; set; }
                    public string Value { get; set; }
                    public string DomesticValue { get; set; }
                    public string OverseasValue { get; set; }
                    public string AccValue { get; set; }
                    public string AccDomesticValue { get; set; }
                    public string AccOverseasValue { get; set; }
                    public string HttpsValue { get; set; }
                    public string HttpsDomesticValue { get; set; }
                    public string HttpsOverseasValue { get; set; }
                    public string HttpsAccValue { get; set; }
                    public string HttpsAccDomesticValue { get; set; }
                    public string HttpsAccOverseasValue { get; set; }
            }
        };

    }

}
