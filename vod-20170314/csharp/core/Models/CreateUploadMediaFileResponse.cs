// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class CreateUploadMediaFileResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MediaFileInfo")]
        [Validation(Required=true)]
        public CreateUploadMediaFileResponseMediaFileInfo MediaFileInfo { get; set; }
        public class CreateUploadMediaFileResponseMediaFileInfo : TeaModel {
            [NameInMap("MediaFileId")]
            [Validation(Required=true)]
            public string MediaFileId { get; set; }
            [NameInMap("MediaId")]
            [Validation(Required=true)]
            public string MediaId { get; set; }
            [NameInMap("UserData")]
            [Validation(Required=true)]
            public string UserData { get; set; }
            [NameInMap("MediaFilePath")]
            [Validation(Required=true)]
            public string MediaFilePath { get; set; }
            [NameInMap("MediaFileAuth")]
            [Validation(Required=true)]
            public string MediaFileAuth { get; set; }
            [NameInMap("MediaFileURL")]
            [Validation(Required=true)]
            public string MediaFileURL { get; set; }
        };

    }

}
