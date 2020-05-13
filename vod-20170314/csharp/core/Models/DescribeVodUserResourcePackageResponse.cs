// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodUserResourcePackageResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("ResourcePackageInfos")]
        [Validation(Required=true)]
        public DescribeVodUserResourcePackageResponseResourcePackageInfos ResourcePackageInfos { get; set; }
        public class DescribeVodUserResourcePackageResponseResourcePackageInfos : TeaModel {
            [NameInMap("ResourcePackageInfo")]
            [Validation(Required=true)]
            public List<DescribeVodUserResourcePackageResponseResourcePackageInfosResourcePackageInfo> ResourcePackageInfo { get; set; }
            public class DescribeVodUserResourcePackageResponseResourcePackageInfosResourcePackageInfo : TeaModel {
                    public string CurrCapacity { get; set; }
                    public string InitCapacity { get; set; }
                    public string CommodityCode { get; set; }
                    public string DisplayName { get; set; }
                    public string InstanceId { get; set; }
                    public string Status { get; set; }
            }
        };

    }

}
