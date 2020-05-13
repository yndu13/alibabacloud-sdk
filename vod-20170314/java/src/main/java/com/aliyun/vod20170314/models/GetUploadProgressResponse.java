// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetUploadProgressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UploadProgress")
    @Validation(required = true)
    public GetUploadProgressResponseUploadProgress uploadProgress;

    public static GetUploadProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadProgressResponse self = new GetUploadProgressResponse();
        return TeaModel.build(map, self);
    }

    public static class GetUploadProgressResponseUploadProgressUploadProgressList extends TeaModel {
        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("ClientId")
        @Validation(required = true)
        public String clientId;

        @NameInMap("BusinessType")
        @Validation(required = true)
        public String businessType;

        @NameInMap("TerminalType")
        @Validation(required = true)
        public String terminalType;

        @NameInMap("DeviceModel")
        @Validation(required = true)
        public String deviceModel;

        @NameInMap("AppVersion")
        @Validation(required = true)
        public String appVersion;

        @NameInMap("AuthTimestamp")
        @Validation(required = true)
        public String authTimestamp;

        @NameInMap("AuthInfo")
        @Validation(required = true)
        public String authInfo;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileSize")
        @Validation(required = true)
        public Long fileSize;

        @NameInMap("FileCreateTime")
        @Validation(required = true)
        public String fileCreateTime;

        @NameInMap("FileHash")
        @Validation(required = true)
        public String fileHash;

        @NameInMap("UploadSpeed")
        @Validation(required = true)
        public Double uploadSpeed;

        @NameInMap("UploadRatio")
        @Validation(required = true)
        public Double uploadRatio;

        @NameInMap("UploadId")
        @Validation(required = true)
        public String uploadId;

        @NameInMap("DonePartsCount")
        @Validation(required = true)
        public Integer donePartsCount;

        @NameInMap("TotalPart")
        @Validation(required = true)
        public String totalPart;

        @NameInMap("PartSize")
        @Validation(required = true)
        public Long partSize;

        @NameInMap("UploadPoint")
        @Validation(required = true)
        public String uploadPoint;

        @NameInMap("UploadAddress")
        @Validation(required = true)
        public String uploadAddress;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        public static GetUploadProgressResponseUploadProgressUploadProgressList build(java.util.Map<String, ?> map) throws Exception {
            GetUploadProgressResponseUploadProgressUploadProgressList self = new GetUploadProgressResponseUploadProgressUploadProgressList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetUploadProgressResponseUploadProgress extends TeaModel {
        @NameInMap("UploadProgressList")
        @Validation(required = true)
        public java.util.List<GetUploadProgressResponseUploadProgressUploadProgressList> uploadProgressList;

        public static GetUploadProgressResponseUploadProgress build(java.util.Map<String, ?> map) throws Exception {
            GetUploadProgressResponseUploadProgress self = new GetUploadProgressResponseUploadProgress();
            return TeaModel.build(map, self);
        }

    }

}
