// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeDomainFlowDataResponse : TeaModel {
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

        [NameInMap("FlowDataPerInterval")]
        [Validation(Required=true)]
        public DescribeDomainFlowDataResponseFlowDataPerInterval FlowDataPerInterval { get; set; }
        public class DescribeDomainFlowDataResponseFlowDataPerInterval : TeaModel {
            [NameInMap("DataModule")]
            [Validation(Required=true)]
            public List<DescribeDomainFlowDataResponseFlowDataPerIntervalDataModule> DataModule { get; set; }
            public class DescribeDomainFlowDataResponseFlowDataPerIntervalDataModule : TeaModel {
                    public string TimeStamp { get; set; }
                    public string Value { get; set; }
                    public string DomesticValue { get; set; }
                    public string OverseasValue { get; set; }
                    public string DynamicValue { get; set; }
                    public string DynamicDomesticValue { get; set; }
                    public string DynamicOverseasValue { get; set; }
                    public string StaticValue { get; set; }
                    public string StaticDomesticValue { get; set; }
                    public string StaticOverseasValue { get; set; }
            }
        };

    }

}
