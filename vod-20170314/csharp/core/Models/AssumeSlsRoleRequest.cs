// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AssumeSlsRoleRequest : TeaModel {
        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("ClientId")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        [NameInMap("BusinessType")]
        [Validation(Required=true)]
        public string BusinessType { get; set; }

        [NameInMap("TerminalType")]
        [Validation(Required=true)]
        public string TerminalType { get; set; }

        [NameInMap("DeviceModel")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        [NameInMap("AppVersion")]
        [Validation(Required=true)]
        public string AppVersion { get; set; }

        [NameInMap("AuthTimestamp")]
        [Validation(Required=true)]
        public long AuthTimestamp { get; set; }

        [NameInMap("AuthInfo")]
        [Validation(Required=true)]
        public string AuthInfo { get; set; }

    }

}
