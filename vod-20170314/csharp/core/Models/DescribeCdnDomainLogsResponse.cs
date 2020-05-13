// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeCdnDomainLogsResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("PageNo")]
        [Validation(Required=true)]
        public long PageNo { get; set; }

        [NameInMap("PageSize")]
        [Validation(Required=true)]
        public long PageSize { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public long Total { get; set; }

        [NameInMap("DomainLogModel")]
        [Validation(Required=true)]
        public DescribeCdnDomainLogsResponseDomainLogModel DomainLogModel { get; set; }
        public class DescribeCdnDomainLogsResponseDomainLogModel : TeaModel {
            [NameInMap("DomainName")]
            [Validation(Required=true)]
            public string DomainName { get; set; }
            [NameInMap("DomainLogDetails")]
            [Validation(Required=true)]
            public DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetails DomainLogDetails { get; set; }
            public class DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetails : TeaModel {
                [NameInMap("DomainLogDetail")]
                [Validation(Required=true)]
                public List<DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetailsDomainLogDetail> DomainLogDetail { get; set; }
                public class DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetailsDomainLogDetail : TeaModel {
                    [NameInMap("LogPath")]
                    [Validation(Required=true)]
                    public string LogPath { get; set; }

                    [NameInMap("StartTime")]
                    [Validation(Required=true)]
                    public string StartTime { get; set; }

                    [NameInMap("EndTime")]
                    [Validation(Required=true)]
                    public string EndTime { get; set; }

                    [NameInMap("LogSize")]
                    [Validation(Required=true)]
                    public long LogSize { get; set; }

                    [NameInMap("LogName")]
                    [Validation(Required=true)]
                    public string LogName { get; set; }

                }

            }
        };

    }

}
