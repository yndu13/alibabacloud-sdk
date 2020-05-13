// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateAudioConfigResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Configs")]
        [Validation(Required=true)]
        public UpdateAudioConfigResponseConfigs Configs { get; set; }
        public class UpdateAudioConfigResponseConfigs : TeaModel {
            [NameInMap("Config")]
            [Validation(Required=true)]
            public List<UpdateAudioConfigResponseConfigsConfig> Config { get; set; }
            public class UpdateAudioConfigResponseConfigsConfig : TeaModel {
                    public string TemplateId { get; set; }
                    public string Status { get; set; }
            }
        };

    }

}
