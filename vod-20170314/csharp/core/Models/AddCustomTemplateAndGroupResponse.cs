// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class AddCustomTemplateAndGroupResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Result")]
        [Validation(Required=true)]
        public bool? Result { get; set; }

        [NameInMap("TemplateGroup")]
        [Validation(Required=true)]
        public AddCustomTemplateAndGroupResponseTemplateGroup TemplateGroup { get; set; }
        public class AddCustomTemplateAndGroupResponseTemplateGroup : TeaModel {
            [NameInMap("TemplateGroupId")]
            [Validation(Required=true)]
            public string TemplateGroupId { get; set; }
        };

    }

}
