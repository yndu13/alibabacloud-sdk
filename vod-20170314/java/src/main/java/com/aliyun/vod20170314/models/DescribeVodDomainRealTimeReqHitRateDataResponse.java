// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeReqHitRateDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeVodDomainRealTimeReqHitRateDataResponseData data;

    public static DescribeVodDomainRealTimeReqHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeReqHitRateDataResponse self = new DescribeVodDomainRealTimeReqHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeReqHitRateDataResponseDataReqHitRateDataModel extends TeaModel {
        @NameInMap("ReqHitRate")
        @Validation(required = true)
        public Double reqHitRate;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeVodDomainRealTimeReqHitRateDataResponseDataReqHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeReqHitRateDataResponseDataReqHitRateDataModel self = new DescribeVodDomainRealTimeReqHitRateDataResponseDataReqHitRateDataModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeReqHitRateDataResponseData extends TeaModel {
        @NameInMap("ReqHitRateDataModel")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeReqHitRateDataResponseDataReqHitRateDataModel> reqHitRateDataModel;

        public static DescribeVodDomainRealTimeReqHitRateDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeReqHitRateDataResponseData self = new DescribeVodDomainRealTimeReqHitRateDataResponseData();
            return TeaModel.build(map, self);
        }

    }

}
