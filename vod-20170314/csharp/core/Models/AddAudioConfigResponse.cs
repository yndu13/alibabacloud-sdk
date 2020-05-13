// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddAudioConfigResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Configs")]
        [Validation(Required=true)]
        public AddAudioConfigResponseConfigs Configs { get; set; }
        public class AddAudioConfigResponseConfigs : TeaModel {
            [NameInMap("Config")]
            [Validation(Required=true)]
            public List<AddAudioConfigResponseConfigsConfig> Config { get; set; }
            public class AddAudioConfigResponseConfigsConfig : TeaModel {
                    public string TemplateId { get; set; }
                    public string Status { get; set; }
            }
        };

    }

}
