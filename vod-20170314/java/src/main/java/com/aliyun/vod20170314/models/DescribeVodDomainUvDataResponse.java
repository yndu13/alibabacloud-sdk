// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUvDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("UvDataInterval")
    @Validation(required = true)
    public DescribeVodDomainUvDataResponseUvDataInterval uvDataInterval;

    public static DescribeVodDomainUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUvDataResponse self = new DescribeVodDomainUvDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainUvDataResponseUvDataIntervalUvDataInterval extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeVodDomainUvDataResponseUvDataIntervalUvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUvDataResponseUvDataIntervalUvDataInterval self = new DescribeVodDomainUvDataResponseUvDataIntervalUvDataInterval();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainUvDataResponseUvDataInterval extends TeaModel {
        @NameInMap("UvDataInterval")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainUvDataResponseUvDataIntervalUvDataInterval> uvDataInterval;

        public static DescribeVodDomainUvDataResponseUvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUvDataResponseUvDataInterval self = new DescribeVodDomainUvDataResponseUvDataInterval();
            return TeaModel.build(map, self);
        }

    }

}
