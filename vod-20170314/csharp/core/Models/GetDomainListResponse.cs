// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetDomainListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainDTOList")]
        [Validation(Required=true)]
        public GetDomainListResponseDomainDTOList DomainDTOList { get; set; }
        public class GetDomainListResponseDomainDTOList : TeaModel {
            [NameInMap("DomainDTO")]
            [Validation(Required=true)]
            public List<GetDomainListResponseDomainDTOListDomainDTO> DomainDTO { get; set; }
            public class GetDomainListResponseDomainDTOListDomainDTO : TeaModel {
                    public long UserId { get; set; }
                    public string DomainName { get; set; }
                    public string DomainType { get; set; }
                    public string DomainCname { get; set; }
                    public string DomainStatus { get; set; }
                    public string BucketName { get; set; }
                    public string BucketEndpoint { get; set; }
                    public bool? DefaultPlay { get; set; }
                    public string SourceLocation { get; set; }
            }
        };

    }

}
