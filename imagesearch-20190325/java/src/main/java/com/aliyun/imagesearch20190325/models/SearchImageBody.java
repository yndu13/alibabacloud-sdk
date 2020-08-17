// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20190325.models;

import com.aliyun.tea.*;

public class SearchImageBody extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("PicName")
    public String picName;

    @NameInMap("PicContent")
    public String picContent;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Type")
    public String type;

    @NameInMap("Filter")
    public String filter;

    public static SearchImageBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageBody self = new SearchImageBody();
        return TeaModel.build(map, self);
    }

}
