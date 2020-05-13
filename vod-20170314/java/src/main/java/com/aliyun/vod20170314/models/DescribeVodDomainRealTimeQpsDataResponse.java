// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeVodDomainRealTimeQpsDataResponseData data;

    public static DescribeVodDomainRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeQpsDataResponse self = new DescribeVodDomainRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeQpsDataResponseDataQpsModel extends TeaModel {
        @NameInMap("Qps")
        @Validation(required = true)
        public Double qps;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeVodDomainRealTimeQpsDataResponseDataQpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeQpsDataResponseDataQpsModel self = new DescribeVodDomainRealTimeQpsDataResponseDataQpsModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeQpsDataResponseData extends TeaModel {
        @NameInMap("QpsModel")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeQpsDataResponseDataQpsModel> qpsModel;

        public static DescribeVodDomainRealTimeQpsDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeQpsDataResponseData self = new DescribeVodDomainRealTimeQpsDataResponseData();
            return TeaModel.build(map, self);
        }

    }

}
