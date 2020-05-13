// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetDomainListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainDTOList")
    @Validation(required = true)
    public GetDomainListResponseDomainDTOList domainDTOList;

    public static GetDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainListResponse self = new GetDomainListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetDomainListResponseDomainDTOListDomainDTO extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public Long userId;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("DomainType")
        @Validation(required = true)
        public String domainType;

        @NameInMap("DomainCname")
        @Validation(required = true)
        public String domainCname;

        @NameInMap("DomainStatus")
        @Validation(required = true)
        public String domainStatus;

        @NameInMap("BucketName")
        @Validation(required = true)
        public String bucketName;

        @NameInMap("BucketEndpoint")
        @Validation(required = true)
        public String bucketEndpoint;

        @NameInMap("DefaultPlay")
        @Validation(required = true)
        public Boolean defaultPlay;

        @NameInMap("SourceLocation")
        @Validation(required = true)
        public String sourceLocation;

        public static GetDomainListResponseDomainDTOListDomainDTO build(java.util.Map<String, ?> map) throws Exception {
            GetDomainListResponseDomainDTOListDomainDTO self = new GetDomainListResponseDomainDTOListDomainDTO();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDomainListResponseDomainDTOList extends TeaModel {
        @NameInMap("DomainDTO")
        @Validation(required = true)
        public java.util.List<GetDomainListResponseDomainDTOListDomainDTO> domainDTO;

        public static GetDomainListResponseDomainDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetDomainListResponseDomainDTOList self = new GetDomainListResponseDomainDTOList();
            return TeaModel.build(map, self);
        }

    }

}
