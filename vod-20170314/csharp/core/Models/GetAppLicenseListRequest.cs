// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAppLicenseListRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        [NameInMap("CustomerId")]
        [Validation(Required=false)]
        public long CustomerId { get; set; }

        [NameInMap("AccountId")]
        [Validation(Required=false)]
        public long AccountId { get; set; }

        [NameInMap("ContractNo")]
        [Validation(Required=false)]
        public string ContractNo { get; set; }

        [NameInMap("AppName")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        [NameInMap("BundleId")]
        [Validation(Required=false)]
        public string BundleId { get; set; }

        [NameInMap("PackageName")]
        [Validation(Required=false)]
        public string PackageName { get; set; }

        [NameInMap("Type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        [NameInMap("SdkIds")]
        [Validation(Required=false)]
        public string SdkIds { get; set; }

        [NameInMap("Feature")]
        [Validation(Required=false)]
        public string Feature { get; set; }

        [NameInMap("Status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        [NameInMap("PageNo")]
        [Validation(Required=false)]
        public long PageNo { get; set; }

        [NameInMap("PageSize")]
        [Validation(Required=false)]
        public long PageSize { get; set; }

        [NameInMap("StartCreationTime")]
        [Validation(Required=false)]
        public string StartCreationTime { get; set; }

        [NameInMap("EndCreationTime")]
        [Validation(Required=false)]
        public string EndCreationTime { get; set; }

        [NameInMap("StartExpiredTime")]
        [Validation(Required=false)]
        public string StartExpiredTime { get; set; }

        [NameInMap("EndExpiredTime")]
        [Validation(Required=false)]
        public string EndExpiredTime { get; set; }

        [NameInMap("SortBy")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

    }

}
