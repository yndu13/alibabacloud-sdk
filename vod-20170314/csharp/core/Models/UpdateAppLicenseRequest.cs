// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateAppLicenseRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        [NameInMap("LicenseId")]
        [Validation(Required=true)]
        public long LicenseId { get; set; }

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

        [NameInMap("LicenseSignature")]
        [Validation(Required=false)]
        public string LicenseSignature { get; set; }

        [NameInMap("Type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        [NameInMap("Feature")]
        [Validation(Required=false)]
        public string Feature { get; set; }

        [NameInMap("Status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        [NameInMap("ExpiredOn")]
        [Validation(Required=false)]
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

    }

}
