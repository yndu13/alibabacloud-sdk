// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetStorageListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("PageSize")]
        [Validation(Required=true)]
        public int? PageSize { get; set; }

        [NameInMap("PageNumber")]
        [Validation(Required=true)]
        public int? PageNumber { get; set; }

        [NameInMap("TotalCount")]
        [Validation(Required=true)]
        public int? TotalCount { get; set; }

        [NameInMap("StorageList")]
        [Validation(Required=true)]
        public GetStorageListResponseStorageList StorageList { get; set; }
        public class GetStorageListResponseStorageList : TeaModel {
            [NameInMap("Storage")]
            [Validation(Required=true)]
            public List<GetStorageListResponseStorageListStorage> Storage { get; set; }
            public class GetStorageListResponseStorageListStorage : TeaModel {
                    public string GmtCreate { get; set; }
                    public string GmtModified { get; set; }
                    public string GroupId { get; set; }
                    public string Location { get; set; }
                    public int? Type { get; set; }
                    public string Region { get; set; }
                    public int? Status { get; set; }
                    public int? StorageUsage { get; set; }
                    public bool? DefaultUpload { get; set; }
            }
        };

    }

}
