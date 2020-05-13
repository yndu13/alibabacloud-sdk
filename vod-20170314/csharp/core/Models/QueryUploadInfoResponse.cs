// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class QueryUploadInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Bucket")]
        [Validation(Required=true)]
        public string Bucket { get; set; }

        [NameInMap("Endpoint")]
        [Validation(Required=true)]
        public string Endpoint { get; set; }

        [NameInMap("FileDir")]
        [Validation(Required=true)]
        public string FileDir { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=true)]
        public long ResourceOwnerId { get; set; }

    }

}
