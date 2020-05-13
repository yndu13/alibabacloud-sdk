// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodUserResourcePackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourcePackageInfos")
    @Validation(required = true)
    public DescribeVodUserResourcePackageResponseResourcePackageInfos resourcePackageInfos;

    public static DescribeVodUserResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserResourcePackageResponse self = new DescribeVodUserResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodUserResourcePackageResponseResourcePackageInfosResourcePackageInfo extends TeaModel {
        @NameInMap("CurrCapacity")
        @Validation(required = true)
        public String currCapacity;

        @NameInMap("InitCapacity")
        @Validation(required = true)
        public String initCapacity;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeVodUserResourcePackageResponseResourcePackageInfosResourcePackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserResourcePackageResponseResourcePackageInfosResourcePackageInfo self = new DescribeVodUserResourcePackageResponseResourcePackageInfosResourcePackageInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodUserResourcePackageResponseResourcePackageInfos extends TeaModel {
        @NameInMap("ResourcePackageInfo")
        @Validation(required = true)
        public java.util.List<DescribeVodUserResourcePackageResponseResourcePackageInfosResourcePackageInfo> resourcePackageInfo;

        public static DescribeVodUserResourcePackageResponseResourcePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserResourcePackageResponseResourcePackageInfos self = new DescribeVodUserResourcePackageResponseResourcePackageInfos();
            return TeaModel.build(map, self);
        }

    }

}
