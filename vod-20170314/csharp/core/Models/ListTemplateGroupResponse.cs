// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListTemplateGroupResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("TemplateGroups")]
        [Validation(Required=true)]
        public ListTemplateGroupResponseTemplateGroups TemplateGroups { get; set; }
        public class ListTemplateGroupResponseTemplateGroups : TeaModel {
            [NameInMap("TemplateGroup")]
            [Validation(Required=true)]
            public List<ListTemplateGroupResponseTemplateGroupsTemplateGroup> TemplateGroup { get; set; }
            public class ListTemplateGroupResponseTemplateGroupsTemplateGroup : TeaModel {
                    public string GroupId { get; set; }
                    public string DefaultGroup { get; set; }
                    public string Status { get; set; }
                    public string GroupSymbol { get; set; }
                    public string GroupType { get; set; }
                    public string Name { get; set; }
                    public string TranscodeMode { get; set; }
                    public string IsLocked { get; set; }
            }
        };

    }

}
