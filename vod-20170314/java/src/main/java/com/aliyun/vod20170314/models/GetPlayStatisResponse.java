// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPlayStatisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PlayStatisByPlatformDOs")
    @Validation(required = true)
    public GetPlayStatisResponsePlayStatisByPlatformDOs playStatisByPlatformDOs;

    public static GetPlayStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayStatisResponse self = new GetPlayStatisResponse();
        return TeaModel.build(map, self);
    }

    public static class GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOsPlayStatisDO extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("VisitView")
        @Validation(required = true)
        public Long visitView;

        @NameInMap("ViewTime")
        @Validation(required = true)
        public Long viewTime;

        @NameInMap("StatTime")
        @Validation(required = true)
        public String statTime;

        public static GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOsPlayStatisDO build(java.util.Map<String, ?> map) throws Exception {
            GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOsPlayStatisDO self = new GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOsPlayStatisDO();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOs extends TeaModel {
        @NameInMap("PlayStatisDO")
        @Validation(required = true)
        public java.util.List<GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOsPlayStatisDO> playStatisDO;

        public static GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOs build(java.util.Map<String, ?> map) throws Exception {
            GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOs self = new GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOs();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatform extends TeaModel {
        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("PlayStatisDOs")
        @Validation(required = true)
        public GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOs playStatisDOs;

        public static GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatform build(java.util.Map<String, ?> map) throws Exception {
            GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatform self = new GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatform();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayStatisResponsePlayStatisByPlatformDOs extends TeaModel {
        @NameInMap("PlayStatisByPlatform")
        @Validation(required = true)
        public java.util.List<GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatform> playStatisByPlatform;

        public static GetPlayStatisResponsePlayStatisByPlatformDOs build(java.util.Map<String, ?> map) throws Exception {
            GetPlayStatisResponsePlayStatisByPlatformDOs self = new GetPlayStatisResponsePlayStatisByPlatformDOs();
            return TeaModel.build(map, self);
        }

    }

}
