// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeByteHitRateDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeVodDomainRealTimeByteHitRateDataResponseData data;

    public static DescribeVodDomainRealTimeByteHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeByteHitRateDataResponse self = new DescribeVodDomainRealTimeByteHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeByteHitRateDataResponseDataByteHitRateDataModel extends TeaModel {
        @NameInMap("ByteHitRate")
        @Validation(required = true)
        public Double byteHitRate;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeVodDomainRealTimeByteHitRateDataResponseDataByteHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeByteHitRateDataResponseDataByteHitRateDataModel self = new DescribeVodDomainRealTimeByteHitRateDataResponseDataByteHitRateDataModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeByteHitRateDataResponseData extends TeaModel {
        @NameInMap("ByteHitRateDataModel")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeByteHitRateDataResponseDataByteHitRateDataModel> byteHitRateDataModel;

        public static DescribeVodDomainRealTimeByteHitRateDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeByteHitRateDataResponseData self = new DescribeVodDomainRealTimeByteHitRateDataResponseData();
            return TeaModel.build(map, self);
        }

    }

}
