// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeDomainBpsDataResponse : TeaModel {
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

        [NameInMap("BpsDataPerInterval")]
        [Validation(Required=true)]
        public DescribeDomainBpsDataResponseBpsDataPerInterval BpsDataPerInterval { get; set; }
        public class DescribeDomainBpsDataResponseBpsDataPerInterval : TeaModel {
            [NameInMap("DataModule")]
            [Validation(Required=true)]
            public List<DescribeDomainBpsDataResponseBpsDataPerIntervalDataModule> DataModule { get; set; }
            public class DescribeDomainBpsDataResponseBpsDataPerIntervalDataModule : TeaModel {
                    public string TimeStamp { get; set; }
                    public string Value { get; set; }
                    public string DomesticValue { get; set; }
                    public string OverseasValue { get; set; }
                    public string L2Value { get; set; }
                    public string DomesticL2Value { get; set; }
                    public string OverseasL2Value { get; set; }
                    public long DynamicValue { get; set; }
                    public string DynamicDomesticValue { get; set; }
                    public string DynamicOverseasValue { get; set; }
                    public string StaticValue { get; set; }
                    public string StaticDomesticValue { get; set; }
                    public string StaticOverseasValue { get; set; }
            }
        };

        [NameInMap("SupplyBpsDatas")]
        [Validation(Required=true)]
        public DescribeDomainBpsDataResponseSupplyBpsDatas SupplyBpsDatas { get; set; }
        public class DescribeDomainBpsDataResponseSupplyBpsDatas : TeaModel {
            [NameInMap("DataModule")]
            [Validation(Required=true)]
            public List<DescribeDomainBpsDataResponseSupplyBpsDatasDataModule> DataModule { get; set; }
            public class DescribeDomainBpsDataResponseSupplyBpsDatasDataModule : TeaModel {
                    public string TimeStamp { get; set; }
                    public string Value { get; set; }
            }
        };

    }

}
