// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddMidYKVidResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MidYKVidDO")]
        [Validation(Required=true)]
        public AddMidYKVidResponseMidYKVidDO MidYKVidDO { get; set; }
        public class AddMidYKVidResponseMidYKVidDO : TeaModel {
            [NameInMap("MediaId")]
            [Validation(Required=true)]
            public string MediaId { get; set; }
            [NameInMap("YKCloudVid")]
            [Validation(Required=true)]
            public string YKCloudVid { get; set; }
            [NameInMap("YKVideoId")]
            [Validation(Required=true)]
            public string YKVideoId { get; set; }
        };

    }

}
