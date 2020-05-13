// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserUvByDayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisticsInfos")
    @Validation(required = true)
    public DescribeUserUvByDayResponseUserPlayStatisticsInfos userPlayStatisticsInfos;

    public static DescribeUserUvByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUvByDayResponse self = new DescribeUserUvByDayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUserUvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo extends TeaModel {
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

        public static DescribeUserUvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo self = new DescribeUserUvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUserUvByDayResponseUserPlayStatisticsInfos extends TeaModel {
        @NameInMap("UserPlayStatisticsInfo")
        @Validation(required = true)
        public java.util.List<DescribeUserUvByDayResponseUserPlayStatisticsInfosUserPlayStatisticsInfo> userPlayStatisticsInfo;

        public static DescribeUserUvByDayResponseUserPlayStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUvByDayResponseUserPlayStatisticsInfos self = new DescribeUserUvByDayResponseUserPlayStatisticsInfos();
            return TeaModel.build(map, self);
        }

    }

}
