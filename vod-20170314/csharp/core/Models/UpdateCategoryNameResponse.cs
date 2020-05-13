// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateCategoryNameResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Category")]
        [Validation(Required=true)]
        public UpdateCategoryNameResponseCategory Category { get; set; }
        public class UpdateCategoryNameResponseCategory : TeaModel {
            [NameInMap("CateId")]
            [Validation(Required=true)]
            public string CateId { get; set; }
            [NameInMap("CateName")]
            [Validation(Required=true)]
            public string CateName { get; set; }
            [NameInMap("ParentId")]
            [Validation(Required=true)]
            public string ParentId { get; set; }
            [NameInMap("Level")]
            [Validation(Required=true)]
            public string Level { get; set; }
        };

    }

}
