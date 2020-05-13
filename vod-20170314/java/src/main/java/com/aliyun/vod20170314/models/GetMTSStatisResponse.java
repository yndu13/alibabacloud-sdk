// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMTSStatisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MTSStatisBySpecList")
    @Validation(required = true)
    public GetMTSStatisResponseMTSStatisBySpecList MTSStatisBySpecList;

    public static GetMTSStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMTSStatisResponse self = new GetMTSStatisResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("Specification")
        @Validation(required = true)
        public String specification;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        @NameInMap("StatTime")
        @Validation(required = true)
        public String statTime;

        @NameInMap("StatTimeUTC")
        @Validation(required = true)
        public String statTimeUTC;

        public static GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO self = new GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList extends TeaModel {
        @NameInMap("MTSStatisDO")
        @Validation(required = true)
        public java.util.List<GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO> MTSStatisDO;

        public static GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList self = new GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpec extends TeaModel {
        @NameInMap("Specification")
        @Validation(required = true)
        public String specification;

        @NameInMap("MTSStatisDOList")
        @Validation(required = true)
        public GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList MTSStatisDOList;

        public static GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpec build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpec self = new GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpec();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMTSStatisResponseMTSStatisBySpecList extends TeaModel {
        @NameInMap("MTSStatisBySpec")
        @Validation(required = true)
        public java.util.List<GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpec> MTSStatisBySpec;

        public static GetMTSStatisResponseMTSStatisBySpecList build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseMTSStatisBySpecList self = new GetMTSStatisResponseMTSStatisBySpecList();
            return TeaModel.build(map, self);
        }

    }

}
