// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetStorageInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("StorageACL")]
        [Validation(Required=true)]
        public string StorageACL { get; set; }

        [NameInMap("DomainInfoList")]
        [Validation(Required=true)]
        public GetStorageInfoResponseDomainInfoList DomainInfoList { get; set; }
        public class GetStorageInfoResponseDomainInfoList : TeaModel {
            [NameInMap("DomainInfo")]
            [Validation(Required=true)]
            public List<GetStorageInfoResponseDomainInfoListDomainInfo> DomainInfo { get; set; }
            public class GetStorageInfoResponseDomainInfoListDomainInfo : TeaModel {
                    public string DomainName { get; set; }
                    public string DomainStatus { get; set; }
                    public string DomainCname { get; set; }
                    public bool? DefaultPlay { get; set; }
            }
        };

        [NameInMap("Storage")]
        [Validation(Required=true)]
        public GetStorageInfoResponseStorage Storage { get; set; }
        public class GetStorageInfoResponseStorage : TeaModel {
            [NameInMap("GmtCreate")]
            [Validation(Required=true)]
            public string GmtCreate { get; set; }
            [NameInMap("GmtModified")]
            [Validation(Required=true)]
            public string GmtModified { get; set; }
            [NameInMap("GroupId")]
            [Validation(Required=true)]
            public string GroupId { get; set; }
            [NameInMap("Location")]
            [Validation(Required=true)]
            public string Location { get; set; }
            [NameInMap("Type")]
            [Validation(Required=true)]
            public int? Type { get; set; }
            [NameInMap("Region")]
            [Validation(Required=true)]
            public string Region { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public int? Status { get; set; }
            [NameInMap("StorageUsage")]
            [Validation(Required=true)]
            public int? StorageUsage { get; set; }
            [NameInMap("DefaultUpload")]
            [Validation(Required=true)]
            public bool? DefaultUpload { get; set; }
        };

    }

}
