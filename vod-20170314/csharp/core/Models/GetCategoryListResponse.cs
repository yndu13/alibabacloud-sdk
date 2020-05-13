// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCategoryListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("CategoryList")]
        [Validation(Required=true)]
        public GetCategoryListResponseCategoryList CategoryList { get; set; }
        public class GetCategoryListResponseCategoryList : TeaModel {
            [NameInMap("Category")]
            [Validation(Required=true)]
            public List<GetCategoryListResponseCategoryListCategory> Category { get; set; }
            public class GetCategoryListResponseCategoryListCategory : TeaModel {
                    public string CateId { get; set; }
                    public string CateName { get; set; }
                    public string ParentId { get; set; }
                    public string Level { get; set; }
            }
        };

    }

}
