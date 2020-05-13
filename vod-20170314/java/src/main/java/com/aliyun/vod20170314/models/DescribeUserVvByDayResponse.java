// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVvByDayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisticsInfos")
    @Validation(required = true)
    public DescribeUserVvByDayResponseUserPlayStatisticsInfos userPlayStatisticsInfos;

    public static DescribeUserVvByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVvByDayResponse self = new DescribeUserVvByDayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUserVvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Android")
        @Validation(required = true)
        public String android;

        @NameInMap("Ios")
        @Validation(required = true)
        public String ios;

        @NameInMap("H5")
        @Validation(required = true)
        public String h5;

        @NameInMap("Flash")
        @Validation(required = true)
        public String flash;

        public static DescribeUserVvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo self = new DescribeUserVvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUserVvByDayResponseUserPlayStatisticsInfos extends TeaModel {
        @NameInMap("UserPlayStatisticsInfo")
        @Validation(required = true)
        public java.util.List<DescribeUserVvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> userPlayStatisticsInfo;

        public static DescribeUserVvByDayResponseUserPlayStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVvByDayResponseUserPlayStatisticsInfos self = new DescribeUserVvByDayResponseUserPlayStatisticsInfos();
            return TeaModel.build(map, self);
        }

    }

}
