// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCouponDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CouponTemplateId")
    @Validation(required = true)
    public Long couponTemplateId;

    @NameInMap("TotalAmount")
    @Validation(required = true)
    public String totalAmount;

    @NameInMap("BalanceAmount")
    @Validation(required = true)
    public String balanceAmount;

    @NameInMap("FrozenAmount")
    @Validation(required = true)
    public String frozenAmount;

    @NameInMap("ExpiredAmount")
    @Validation(required = true)
    public String expiredAmount;

    @NameInMap("DeliveryTime")
    @Validation(required = true)
    public String deliveryTime;

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("CouponNumber")
    @Validation(required = true)
    public String couponNumber;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("ModificationTime")
    @Validation(required = true)
    public String modificationTime;

    @NameInMap("PriceLimit")
    @Validation(required = true)
    public String priceLimit;

    @NameInMap("Application")
    @Validation(required = true)
    public String application;

    @NameInMap("ProductCodes")
    @Validation(required = true)
    public DescribeCouponDetailResponseProductCodes productCodes;

    @NameInMap("TradeTypes")
    @Validation(required = true)
    public DescribeCouponDetailResponseTradeTypes tradeTypes;

    public static DescribeCouponDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponDetailResponse self = new DescribeCouponDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCouponDetailResponseProductCodes extends TeaModel {
        @NameInMap("ProductCode")
        @Validation(required = true)
        public java.util.List<String> productCode;

        public static DescribeCouponDetailResponseProductCodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponDetailResponseProductCodes self = new DescribeCouponDetailResponseProductCodes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCouponDetailResponseTradeTypes extends TeaModel {
        @NameInMap("TradeType")
        @Validation(required = true)
        public java.util.List<String> tradeType;

        public static DescribeCouponDetailResponseTradeTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponDetailResponseTradeTypes self = new DescribeCouponDetailResponseTradeTypes();
            return TeaModel.build(map, self);
        }

    }

}
