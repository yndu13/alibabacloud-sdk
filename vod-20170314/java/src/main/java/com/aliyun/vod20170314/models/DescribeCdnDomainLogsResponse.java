// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Long pageNo;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("DomainLogModel")
    @Validation(required = true)
    public DescribeCdnDomainLogsResponseDomainLogModel domainLogModel;

    public static DescribeCdnDomainLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainLogsResponse self = new DescribeCdnDomainLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetailsDomainLogDetail extends TeaModel {
        @NameInMap("LogPath")
        @Validation(required = true)
        public String logPath;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("LogSize")
        @Validation(required = true)
        public Long logSize;

        @NameInMap("LogName")
        @Validation(required = true)
        public String logName;

        public static DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetailsDomainLogDetail self = new DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        @Validation(required = true)
        public java.util.List<DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetails self = new DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetails();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCdnDomainLogsResponseDomainLogModel extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("DomainLogDetails")
        @Validation(required = true)
        public DescribeCdnDomainLogsResponseDomainLogModelDomainLogDetails domainLogDetails;

        public static DescribeCdnDomainLogsResponseDomainLogModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseDomainLogModel self = new DescribeCdnDomainLogsResponseDomainLogModel();
            return TeaModel.build(map, self);
        }

    }

}
