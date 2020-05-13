// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVvByVideoidResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisticsInfos")
    @Validation(required = true)
    public DescribeUserVvByVideoidResponseUserPlayStatisticsInfos userPlayStatisticsInfos;

    public static DescribeUserVvByVideoidResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVvByVideoidResponse self = new DescribeUserVvByVideoidResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUserVvByVideoidResponseUserPlayStatisticsInfosUserPlayStatisticsInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("All")
        @Validation(required = true)
        public String all;

        public static DescribeUserVvByVideoidResponseUserPlayStatisticsInfosUserPlayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVvByVideoidResponseUserPlayStatisticsInfosUserPlayStatisticsInfo self = new DescribeUserVvByVideoidResponseUserPlayStatisticsInfosUserPlayStatisticsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUserVvByVideoidResponseUserPlayStatisticsInfos extends TeaModel {
        @NameInMap("UserPlayStatisticsInfo")
        @Validation(required = true)
        public java.util.List<DescribeUserVvByVideoidResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> userPlayStatisticsInfo;

        public static DescribeUserVvByVideoidResponseUserPlayStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVvByVideoidResponseUserPlayStatisticsInfos self = new DescribeUserVvByVideoidResponseUserPlayStatisticsInfos();
            return TeaModel.build(map, self);
        }

    }

}
