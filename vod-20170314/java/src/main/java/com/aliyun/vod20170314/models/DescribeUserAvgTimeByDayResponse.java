// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserAvgTimeByDayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisticsInfos")
    @Validation(required = true)
    public DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfos userPlayStatisticsInfos;

    public static DescribeUserAvgTimeByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAvgTimeByDayResponse self = new DescribeUserAvgTimeByDayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("All")
        @Validation(required = true)
        public String all;

        public static DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo self = new DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfos extends TeaModel {
        @NameInMap("UserPlayStatisticsInfo")
        @Validation(required = true)
        public java.util.List<DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> userPlayStatisticsInfo;

        public static DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfos self = new DescribeUserAvgTimeByDayResponseUserPlayStatisticsInfos();
            return TeaModel.build(map, self);
        }

    }

}
