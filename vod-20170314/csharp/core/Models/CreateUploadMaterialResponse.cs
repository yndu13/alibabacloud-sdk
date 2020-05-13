// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class CreateUploadMaterialResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MaterialId")]
        [Validation(Required=true)]
        public string MaterialId { get; set; }

        [NameInMap("UploadAddress")]
        [Validation(Required=true)]
        public string UploadAddress { get; set; }

        [NameInMap("UploadAuth")]
        [Validation(Required=true)]
        public string UploadAuth { get; set; }

    }

}
