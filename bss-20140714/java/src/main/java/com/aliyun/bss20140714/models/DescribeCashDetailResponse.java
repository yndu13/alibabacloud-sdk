// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCashDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BalanceAmount")
    @Validation(required = true)
    public String balanceAmount;

    @NameInMap("AmountOwed")
    @Validation(required = true)
    public String amountOwed;

    @NameInMap("EnableThresholdAlert")
    @Validation(required = true)
    public String enableThresholdAlert;

    @NameInMap("MiniAlertThreshold")
    @Validation(required = true)
    public Long miniAlertThreshold;

    @NameInMap("FrozenAmount")
    @Validation(required = true)
    public String frozenAmount;

    @NameInMap("CreditCardAmount")
    @Validation(required = true)
    public String creditCardAmount;

    @NameInMap("RemmitanceAmount")
    @Validation(required = true)
    public String remmitanceAmount;

    @NameInMap("CreditLimit")
    @Validation(required = true)
    public String creditLimit;

    @NameInMap("AvailableCredit")
    @Validation(required = true)
    public String availableCredit;

    public static DescribeCashDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCashDetailResponse self = new DescribeCashDetailResponse();
        return TeaModel.build(map, self);
    }

}
