// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCnameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CnameDatas")
    @Validation(required = true)
    public DescribeVodDomainCnameResponseCnameDatas cnameDatas;

    public static DescribeVodDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCnameResponse self = new DescribeVodDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainCnameResponseCnameDatasData extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Cname")
        @Validation(required = true)
        public String cname;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static DescribeVodDomainCnameResponseCnameDatasData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCnameResponseCnameDatasData self = new DescribeVodDomainCnameResponseCnameDatasData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainCnameResponseCnameDatas extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainCnameResponseCnameDatasData> data;

        public static DescribeVodDomainCnameResponseCnameDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCnameResponseCnameDatas self = new DescribeVodDomainCnameResponseCnameDatas();
            return TeaModel.build(map, self);
        }

    }

}
