// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddSnapshotRequest : TeaModel {
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

        [NameInMap("Time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        [NameInMap("Height")]
        [Validation(Required=true)]
        public string Height { get; set; }

        [NameInMap("Width")]
        [Validation(Required=true)]
        public string Width { get; set; }

        [NameInMap("Number")]
        [Validation(Required=true)]
        public string Number { get; set; }

    }

}
