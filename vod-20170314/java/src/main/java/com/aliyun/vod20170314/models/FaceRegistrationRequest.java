// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class FaceRegistrationRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("PersonName")
    @Validation(required = true)
    public String personName;

    @NameInMap("PersonId")
    public String personId;

    @NameInMap("PersonLibrary")
    public String personLibrary;

    @NameInMap("Category")
    public String category;

    @NameInMap("ImageIds")
    public String imageIds;

    public static FaceRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceRegistrationRequest self = new FaceRegistrationRequest();
        return TeaModel.build(map, self);
    }

}
