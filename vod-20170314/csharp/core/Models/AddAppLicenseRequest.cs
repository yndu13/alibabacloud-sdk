// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddAppLicenseRequest : TeaModel {
        [NameInMap("AppName")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        [NameInMap("ContractNo")]
        [Validation(Required=false)]
        public string ContractNo { get; set; }

        [NameInMap("BundleId")]
        [Validation(Required=false)]
        public string BundleId { get; set; }

        [NameInMap("PackageName")]
        [Validation(Required=false)]
        public string PackageName { get; set; }

        [NameInMap("LicenseSignature")]
        [Validation(Required=false)]
        public string LicenseSignature { get; set; }

        [NameInMap("Type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        [NameInMap("Feature")]
        [Validation(Required=false)]
        public string Feature { get; set; }

        [NameInMap("ExpiredOn")]
        [Validation(Required=true)]
        public string ExpiredOn { get; set; }

        [NameInMap("SdkIds")]
        [Validation(Required=false)]
        public string SdkIds { get; set; }

        [NameInMap("CustomerId")]
        [Validation(Required=false)]
        public long CustomerId { get; set; }

        [NameInMap("AccountId")]
        [Validation(Required=false)]
        public long AccountId { get; set; }

        [NameInMap("LicenseId")]
        [Validation(Required=false)]
        public long LicenseId { get; set; }

        [NameInMap("CreateTime")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        [NameInMap("Status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
