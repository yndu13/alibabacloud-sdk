// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddLiveStreamVideoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MediaId")]
        [Validation(Required=true)]
        public string MediaId { get; set; }

        [NameInMap("PlaylistId")]
        [Validation(Required=true)]
        public string PlaylistId { get; set; }

    }

}
