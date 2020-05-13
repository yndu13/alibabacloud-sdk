// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddVideoTagResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MediaInfoDTO")]
        [Validation(Required=true)]
        public AddVideoTagResponseMediaInfoDTO MediaInfoDTO { get; set; }
        public class AddVideoTagResponseMediaInfoDTO : TeaModel {
            [NameInMap("UserId")]
            [Validation(Required=true)]
            public long UserId { get; set; }
            [NameInMap("MediaId")]
            [Validation(Required=true)]
            public string MediaId { get; set; }
            [NameInMap("Title")]
            [Validation(Required=true)]
            public string Title { get; set; }
            [NameInMap("Tags")]
            [Validation(Required=true)]
            public string Tags { get; set; }
        };

    }

}
