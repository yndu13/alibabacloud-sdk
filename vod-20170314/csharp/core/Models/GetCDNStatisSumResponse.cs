// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCDNStatisSumResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("SumFlowDataValue")]
        [Validation(Required=true)]
        public long SumFlowDataValue { get; set; }

        [NameInMap("MaxBpsDataValue")]
        [Validation(Required=true)]
        public long MaxBpsDataValue { get; set; }

        [NameInMap("Current95BpsDataValue")]
        [Validation(Required=true)]
        public long Current95BpsDataValue { get; set; }

        [NameInMap("Level")]
        [Validation(Required=true)]
        public string Level { get; set; }

        [NameInMap("CDNStatisList")]
        [Validation(Required=true)]
        public GetCDNStatisSumResponseCDNStatisList CDNStatisList { get; set; }
        public class GetCDNStatisSumResponseCDNStatisList : TeaModel {
            [NameInMap("CDNMetric")]
            [Validation(Required=true)]
            public List<GetCDNStatisSumResponseCDNStatisListCDNMetric> CDNMetric { get; set; }
            public class GetCDNStatisSumResponseCDNStatisListCDNMetric : TeaModel {
                    public string StatTime { get; set; }
                    public string StatTimeUTC { get; set; }
                    public long FlowDataDomesticValue { get; set; }
                    public long FlowDataOverseasValue { get; set; }
                    public long FlowDataValue { get; set; }
                    public long BpsDataDomesticValue { get; set; }
                    public long BpsDataOverseasValue { get; set; }
                    public long BpsDataValue { get; set; }
            }
        };

    }

}
