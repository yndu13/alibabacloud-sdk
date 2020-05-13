// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodUserQuotaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainQuota")
    @Validation(required = true)
    public Integer domainQuota;

    @NameInMap("RefreshUrlQuota")
    @Validation(required = true)
    public Integer refreshUrlQuota;

    @NameInMap("RefreshDirQuota")
    @Validation(required = true)
    public Integer refreshDirQuota;

    @NameInMap("RefreshUrlRemain")
    @Validation(required = true)
    public Integer refreshUrlRemain;

    @NameInMap("RefreshDirRemain")
    @Validation(required = true)
    public Integer refreshDirRemain;

    @NameInMap("PreloadQuota")
    @Validation(required = true)
    public Integer preloadQuota;

    @NameInMap("PreloadRemain")
    @Validation(required = true)
    public Integer preloadRemain;

    @NameInMap("BlockQuota")
    @Validation(required = true)
    public Integer blockQuota;

    @NameInMap("BlockRemain")
    @Validation(required = true)
    public Integer blockRemain;

    public static DescribeVodUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserQuotaResponse self = new DescribeVodUserQuotaResponse();
        return TeaModel.build(map, self);
    }

}
