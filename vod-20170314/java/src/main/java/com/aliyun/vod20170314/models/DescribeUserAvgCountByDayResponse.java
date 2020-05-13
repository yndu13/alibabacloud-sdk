// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserAvgCountByDayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisticsInfos")
    @Validation(required = true)
    public DescribeUserAvgCountByDayResponseUserPlayStatisticsInfos userPlayStatisticsInfos;

    public static DescribeUserAvgCountByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAvgCountByDayResponse self = new DescribeUserAvgCountByDayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUserAvgCountByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("All")
        @Validation(required = true)
        public String all;

        public static DescribeUserAvgCountByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAvgCountByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo self = new DescribeUserAvgCountByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUserAvgCountByDayResponseUserPlayStatisticsInfos extends TeaModel {
        @NameInMap("UserPlayStatisticsInfo")
        @Validation(required = true)
        public java.util.List<DescribeUserAvgCountByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> userPlayStatisticsInfo;

        public static DescribeUserAvgCountByDayResponseUserPlayStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAvgCountByDayResponseUserPlayStatisticsInfos self = new DescribeUserAvgCountByDayResponseUserPlayStatisticsInfos();
            return TeaModel.build(map, self);
        }

    }

}
