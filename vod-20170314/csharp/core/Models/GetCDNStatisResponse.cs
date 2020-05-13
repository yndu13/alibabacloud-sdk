// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCDNStatisResponse : TeaModel {
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

        [NameInMap("CDNStatisList")]
        [Validation(Required=true)]
        public GetCDNStatisResponseCDNStatisList CDNStatisList { get; set; }
        public class GetCDNStatisResponseCDNStatisList : TeaModel {
            [NameInMap("CDNMetric")]
            [Validation(Required=true)]
            public List<GetCDNStatisResponseCDNStatisListCDNMetric> CDNMetric { get; set; }
            public class GetCDNStatisResponseCDNStatisListCDNMetric : TeaModel {
                    public string CdnDomain { get; set; }
                    public string StatTime { get; set; }
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
