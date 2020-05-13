// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVvTopByDayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisticsInfos")
    @Validation(required = true)
    public DescribeUserVvTopByDayResponseUserPlayStatisticsInfos userPlayStatisticsInfos;

    public static DescribeUserVvTopByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVvTopByDayResponse self = new DescribeUserVvTopByDayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUserVvTopByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public String count;

        @NameInMap("Videoid")
        @Validation(required = true)
        public String videoid;

        @NameInMap("VideoName")
        @Validation(required = true)
        public String videoName;

        public static DescribeUserVvTopByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVvTopByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo self = new DescribeUserVvTopByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUserVvTopByDayResponseUserPlayStatisticsInfos extends TeaModel {
        @NameInMap("UserPlayStatisticsInfo")
        @Validation(required = true)
        public java.util.List<DescribeUserVvTopByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> userPlayStatisticsInfo;

        public static DescribeUserVvTopByDayResponseUserPlayStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVvTopByDayResponseUserPlayStatisticsInfos self = new DescribeUserVvTopByDayResponseUserPlayStatisticsInfos();
            return TeaModel.build(map, self);
        }

    }

}
