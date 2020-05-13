// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeVodDomainRealTimeBpsDataResponseData data;

    public static DescribeVodDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeBpsDataResponse self = new DescribeVodDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainRealTimeBpsDataResponseDataBpsModel extends TeaModel {
        @NameInMap("Bps")
        @Validation(required = true)
        public Double bps;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeVodDomainRealTimeBpsDataResponseDataBpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeBpsDataResponseDataBpsModel self = new DescribeVodDomainRealTimeBpsDataResponseDataBpsModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainRealTimeBpsDataResponseData extends TeaModel {
        @NameInMap("BpsModel")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainRealTimeBpsDataResponseDataBpsModel> bpsModel;

        public static DescribeVodDomainRealTimeBpsDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeBpsDataResponseData self = new DescribeVodDomainRealTimeBpsDataResponseData();
            return TeaModel.build(map, self);
        }

    }

}
