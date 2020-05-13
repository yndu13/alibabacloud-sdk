// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAudioConfigResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Configs")]
        [Validation(Required=true)]
        public ListAudioConfigResponseConfigs Configs { get; set; }
        public class ListAudioConfigResponseConfigs : TeaModel {
            [NameInMap("Config")]
            [Validation(Required=true)]
            public List<ListAudioConfigResponseConfigsConfig> Config { get; set; }
            public class ListAudioConfigResponseConfigsConfig : TeaModel {
                    public string TemplateId { get; set; }
                    public string Status { get; set; }
            }
        };

    }

}
