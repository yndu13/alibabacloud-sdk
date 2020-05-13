// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AuthorizeAppLicenseRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        [NameInMap("SdkCode")]
        [Validation(Required=false)]
        public long SdkCode { get; set; }

        [NameInMap("LicenseVersion")]
        [Validation(Required=true)]
        public long LicenseVersion { get; set; }

        [NameInMap("Platform")]
        [Validation(Required=true)]
        public long Platform { get; set; }

        [NameInMap("BundleId")]
        [Validation(Required=false)]
        public string BundleId { get; set; }

        [NameInMap("PackageName")]
        [Validation(Required=false)]
        public string PackageName { get; set; }

        [NameInMap("LicenseSignature")]
        [Validation(Required=false)]
        public string LicenseSignature { get; set; }

        [NameInMap("Nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        [NameInMap("Time")]
        [Validation(Required=true)]
        public long Time { get; set; }

        [NameInMap("Sign")]
        [Validation(Required=true)]
        public string Sign { get; set; }

        [NameInMap("SdkVersion")]
        [Validation(Required=false)]
        public string SdkVersion { get; set; }

        [NameInMap("SdkVersionCode")]
        [Validation(Required=false)]
        public long SdkVersionCode { get; set; }

    }

}
