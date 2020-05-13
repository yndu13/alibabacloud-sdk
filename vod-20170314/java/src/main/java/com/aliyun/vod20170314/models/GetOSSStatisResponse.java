// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetOSSStatisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaxStorageUtilization")
    @Validation(required = true)
    public Long maxStorageUtilization;

    @NameInMap("OssStatisList")
    @Validation(required = true)
    public GetOSSStatisResponseOssStatisList ossStatisList;

    public static GetOSSStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSStatisResponse self = new GetOSSStatisResponse();
        return TeaModel.build(map, self);
    }

    public static class GetOSSStatisResponseOssStatisListOSSMetric extends TeaModel {
        @NameInMap("StatTime")
        @Validation(required = true)
        public String statTime;

        @NameInMap("StatTimeUTC")
        @Validation(required = true)
        public String statTimeUTC;

        @NameInMap("StorageUtilization")
        @Validation(required = true)
        public Long storageUtilization;

        public static GetOSSStatisResponseOssStatisListOSSMetric build(java.util.Map<String, ?> map) throws Exception {
            GetOSSStatisResponseOssStatisListOSSMetric self = new GetOSSStatisResponseOssStatisListOSSMetric();
            return TeaModel.build(map, self);
        }

    }

    public static class GetOSSStatisResponseOssStatisList extends TeaModel {
        @NameInMap("OSSMetric")
        @Validation(required = true)
        public java.util.List<GetOSSStatisResponseOssStatisListOSSMetric> OSSMetric;

        public static GetOSSStatisResponseOssStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetOSSStatisResponseOssStatisList self = new GetOSSStatisResponseOssStatisList();
            return TeaModel.build(map, self);
        }

    }

}
