// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DeleteMediaTagResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MediaInfoDTO")]
        [Validation(Required=true)]
        public DeleteMediaTagResponseMediaInfoDTO MediaInfoDTO { get; set; }
        public class DeleteMediaTagResponseMediaInfoDTO : TeaModel {
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
