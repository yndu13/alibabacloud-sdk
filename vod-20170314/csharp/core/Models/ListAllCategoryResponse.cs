// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListAllCategoryResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("CategoryList")]
        [Validation(Required=true)]
        public ListAllCategoryResponseCategoryList CategoryList { get; set; }
        public class ListAllCategoryResponseCategoryList : TeaModel {
            [NameInMap("Category")]
            [Validation(Required=true)]
            public List<ListAllCategoryResponseCategoryListCategory> Category { get; set; }
            public class ListAllCategoryResponseCategoryListCategory : TeaModel {
                    public string CateId { get; set; }
                    public string CateName { get; set; }
                    public string ParentId { get; set; }
                    public string Level { get; set; }
            }
        };

    }

}
