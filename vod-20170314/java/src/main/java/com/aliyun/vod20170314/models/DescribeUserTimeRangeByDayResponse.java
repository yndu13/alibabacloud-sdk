// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserTimeRangeByDayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisticsInfos")
    @Validation(required = true)
    public DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfos userPlayStatisticsInfos;

    public static DescribeUserTimeRangeByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTimeRangeByDayResponse self = new DescribeUserTimeRangeByDayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("All")
        @Validation(required = true)
        public String all;

        public static DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo self = new DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfos extends TeaModel {
        @NameInMap("UserPlayStatisticsInfo")
        @Validation(required = true)
        public java.util.List<DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> userPlayStatisticsInfo;

        public static DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfos self = new DescribeUserTimeRangeByDayResponseUserPlayStatisticsInfos();
            return TeaModel.build(map, self);
        }

    }

}
