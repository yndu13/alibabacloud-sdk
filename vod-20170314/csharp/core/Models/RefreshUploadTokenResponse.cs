// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class RefreshUploadTokenResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("UploadKey")]
        [Validation(Required=true)]
        public string UploadKey { get; set; }

        [NameInMap("UploadAddress")]
        [Validation(Required=true)]
        public RefreshUploadTokenResponseUploadAddress UploadAddress { get; set; }
        public class RefreshUploadTokenResponseUploadAddress : TeaModel {
            [NameInMap("AccessKeyId")]
            [Validation(Required=true)]
            public string AccessKeyId { get; set; }
            [NameInMap("AccessKeySecret")]
            [Validation(Required=true)]
            public string AccessKeySecret { get; set; }
            [NameInMap("Expiration")]
            [Validation(Required=true)]
            public string Expiration { get; set; }
            [NameInMap("SecurityToken")]
            [Validation(Required=true)]
            public string SecurityToken { get; set; }
        };

    }

}
