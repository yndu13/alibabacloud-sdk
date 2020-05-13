// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetAppLicenseListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public long Total { get; set; }

        [NameInMap("AppLicenseList")]
        [Validation(Required=true)]
        public GetAppLicenseListResponseAppLicenseList AppLicenseList { get; set; }
        public class GetAppLicenseListResponseAppLicenseList : TeaModel {
            [NameInMap("AppLicense")]
            [Validation(Required=true)]
            public List<GetAppLicenseListResponseAppLicenseListAppLicense> AppLicense { get; set; }
            public class GetAppLicenseListResponseAppLicenseListAppLicense : TeaModel {
                    public long LicenseId { get; set; }
                    public string CreationTime { get; set; }
                    public string ContractNo { get; set; }
                    public string AppName { get; set; }
                    public string BundleId { get; set; }
                    public string PackageName { get; set; }
                    public string LicenseSignature { get; set; }
                    public string Type { get; set; }
                    public string Feature { get; set; }
                    public string ExpiredOn { get; set; }
                    public string Status { get; set; }
                    public string SdkIds { get; set; }
                    public long AccountId { get; set; }
                    public long CustomerId { get; set; }
            }
        };

    }

}
