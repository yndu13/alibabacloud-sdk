// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAppLicenseResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AppLicense")]
        [Validation(Required=true)]
        public GetAppLicenseResponseAppLicense AppLicense { get; set; }
        public class GetAppLicenseResponseAppLicense : TeaModel {
            [NameInMap("LicenseId")]
            [Validation(Required=true)]
            public long LicenseId { get; set; }
            [NameInMap("CreationTime")]
            [Validation(Required=true)]
            public string CreationTime { get; set; }
            [NameInMap("ContractNo")]
            [Validation(Required=true)]
            public string ContractNo { get; set; }
            [NameInMap("AppName")]
            [Validation(Required=true)]
            public string AppName { get; set; }
            [NameInMap("BundleId")]
            [Validation(Required=true)]
            public string BundleId { get; set; }
            [NameInMap("PackageName")]
            [Validation(Required=true)]
            public string PackageName { get; set; }
            [NameInMap("LicenseSignature")]
            [Validation(Required=true)]
            public string LicenseSignature { get; set; }
            [NameInMap("Type")]
            [Validation(Required=true)]
            public string Type { get; set; }
            [NameInMap("Feature")]
            [Validation(Required=true)]
            public string Feature { get; set; }
            [NameInMap("ExpiredOn")]
            [Validation(Required=true)]
            public string ExpiredOn { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("SdkIds")]
            [Validation(Required=true)]
            public string SdkIds { get; set; }
            [NameInMap("AccountId")]
            [Validation(Required=true)]
            public long AccountId { get; set; }
            [NameInMap("CustomerId")]
            [Validation(Required=true)]
            public long CustomerId { get; set; }
        };

    }

}
