// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20190325.models;

import com.aliyun.tea.*;

public class AddImageBody extends TeaModel {
    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    @NameInMap("PicName")
    @Validation(required = true)
    public String picName;

    @NameInMap("PicContent")
    @Validation(required = true)
    public String picContent;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("StrAttr")
    public String strAttr;

    public static AddImageBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageBody self = new AddImageBody();
        return TeaModel.build(map, self);
    }

}
