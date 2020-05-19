// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetImageInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImageInfo")
    @Validation(required = true)
    public GetImageInfoResponseImageInfo imageInfo;

    public static GetImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfoResponse self = new GetImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetImageInfoResponseImageInfoMezzanine extends TeaModel {
        @NameInMap("FileURL")
        @Validation(required = true)
        public String fileURL;

        @NameInMap("OriginalFileName")
        @Validation(required = true)
        public String originalFileName;

        @NameInMap("FileSize")
        @Validation(required = true)
        public Long fileSize;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static GetImageInfoResponseImageInfoMezzanine build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfoResponseImageInfoMezzanine self = new GetImageInfoResponseImageInfoMezzanine();
            return TeaModel.build(map, self);
        }

    }

    public static class GetImageInfoResponseImageInfo extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ImageType")
        @Validation(required = true)
        public String imageType;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Integer cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("Mezzanine")
        @Validation(required = true)
        public GetImageInfoResponseImageInfoMezzanine mezzanine;

        public static GetImageInfoResponseImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetImageInfoResponseImageInfo self = new GetImageInfoResponseImageInfo();
            return TeaModel.build(map, self);
        }

    }

}