// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetUploadProgressRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("Source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        [NameInMap("ClientId")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

        [NameInMap("BusinessType")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        [NameInMap("TerminalType")]
        [Validation(Required=false)]
        public string TerminalType { get; set; }

        [NameInMap("DeviceModel")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        [NameInMap("AppVersion")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        [NameInMap("AuthTimestamp")]
        [Validation(Required=true)]
        public long AuthTimestamp { get; set; }

        [NameInMap("AuthInfo")]
        [Validation(Required=true)]
        public string AuthInfo { get; set; }

        [NameInMap("UploadInfoList")]
        [Validation(Required=true)]
        public string UploadInfoList { get; set; }

        [NameInMap("UserId")]
        [Validation(Required=false)]
        public long UserId { get; set; }

        [NameInMap("UploadAddress")]
        [Validation(Required=false)]
        public string UploadAddress { get; set; }

    }

}
