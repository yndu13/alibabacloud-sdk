// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMidYKVidResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MidYKVidDO")]
        [Validation(Required=true)]
        public GetMidYKVidResponseMidYKVidDO MidYKVidDO { get; set; }
        public class GetMidYKVidResponseMidYKVidDO : TeaModel {
            [NameInMap("MediaId")]
            [Validation(Required=true)]
            public string MediaId { get; set; }
            [NameInMap("YkVid")]
            [Validation(Required=true)]
            public string YkVid { get; set; }
        };

    }

}
