// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetPersonalStorageListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("StorageInfoList")]
        [Validation(Required=true)]
        public GetPersonalStorageListResponseStorageInfoList StorageInfoList { get; set; }
        public class GetPersonalStorageListResponseStorageInfoList : TeaModel {
            [NameInMap("StorageInfo")]
            [Validation(Required=true)]
            public List<GetPersonalStorageListResponseStorageInfoListStorageInfo> StorageInfo { get; set; }
            public class GetPersonalStorageListResponseStorageInfoListStorageInfo : TeaModel {
                    public string Location { get; set; }
                    public string GmtCreate { get; set; }
                    public long OwnerId { get; set; }
                    public string StorageClass { get; set; }
                    public string ExtranetEndpoint { get; set; }
                    public string IntranetEndpoint { get; set; }
                    public string StorageACL { get; set; }
            }
        };

    }

}
