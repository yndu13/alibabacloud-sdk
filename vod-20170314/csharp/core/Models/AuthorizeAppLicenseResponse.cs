// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AuthorizeAppLicenseResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("ExpireDate")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        [NameInMap("Sign")]
        [Validation(Required=true)]
        public string Sign { get; set; }

        [NameInMap("Feature")]
        [Validation(Required=true)]
        public string Feature { get; set; }

    }

}
