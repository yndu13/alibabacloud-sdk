<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Bss;

use AlibabaCloud\Tea\Model;

class DescribeCashDetailResponse extends Model{
    protected $_name = [
        'requestId' => 'RequestId',
        'balanceAmount' => 'BalanceAmount',
        'amountOwed' => 'AmountOwed',
        'enableThresholdAlert' => 'EnableThresholdAlert',
        'miniAlertThreshold' => 'MiniAlertThreshold',
        'frozenAmount' => 'FrozenAmount',
        'creditCardAmount' => 'CreditCardAmount',
        'remmitanceAmount' => 'RemmitanceAmount',
        'creditLimit' => 'CreditLimit',
        'availableCredit' => 'AvailableCredit',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('balanceAmount', $this->balanceAmount, true);
        Model::validateRequired('amountOwed', $this->amountOwed, true);
        Model::validateRequired('enableThresholdAlert', $this->enableThresholdAlert, true);
        Model::validateRequired('miniAlertThreshold', $this->miniAlertThreshold, true);
        Model::validateRequired('frozenAmount', $this->frozenAmount, true);
        Model::validateRequired('creditCardAmount', $this->creditCardAmount, true);
        Model::validateRequired('remmitanceAmount', $this->remmitanceAmount, true);
        Model::validateRequired('creditLimit', $this->creditLimit, true);
        Model::validateRequired('availableCredit', $this->availableCredit, true);
    }
    public function toMap() {
        $res = [];
        $res['RequestId'] = $this->requestId;
        $res['BalanceAmount'] = $this->balanceAmount;
        $res['AmountOwed'] = $this->amountOwed;
        $res['EnableThresholdAlert'] = $this->enableThresholdAlert;
        $res['MiniAlertThreshold'] = $this->miniAlertThreshold;
        $res['FrozenAmount'] = $this->frozenAmount;
        $res['CreditCardAmount'] = $this->creditCardAmount;
        $res['RemmitanceAmount'] = $this->remmitanceAmount;
        $res['CreditLimit'] = $this->creditLimit;
        $res['AvailableCredit'] = $this->availableCredit;
        return $res;
    }
    /**
     * @param array $map
     * @return DescribeCashDetailResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['RequestId'])){
            $model->requestId = $map['RequestId'];
        }
        if(isset($map['BalanceAmount'])){
            $model->balanceAmount = $map['BalanceAmount'];
        }
        if(isset($map['AmountOwed'])){
            $model->amountOwed = $map['AmountOwed'];
        }
        if(isset($map['EnableThresholdAlert'])){
            $model->enableThresholdAlert = $map['EnableThresholdAlert'];
        }
        if(isset($map['MiniAlertThreshold'])){
            $model->miniAlertThreshold = $map['MiniAlertThreshold'];
        }
        if(isset($map['FrozenAmount'])){
            $model->frozenAmount = $map['FrozenAmount'];
        }
        if(isset($map['CreditCardAmount'])){
            $model->creditCardAmount = $map['CreditCardAmount'];
        }
        if(isset($map['RemmitanceAmount'])){
            $model->remmitanceAmount = $map['RemmitanceAmount'];
        }
        if(isset($map['CreditLimit'])){
            $model->creditLimit = $map['CreditLimit'];
        }
        if(isset($map['AvailableCredit'])){
            $model->availableCredit = $map['AvailableCredit'];
        }
        return $model;
    }
    /**
     * @description requestId
     * @var string
     */
    public $requestId;
    /**
     * @description data.balanceAmount
     * @var string
     */
    public $balanceAmount;
    /**
     * @description data.amountOwed
     * @var string
     */
    public $amountOwed;
    /**
     * @description data.enableThresholdAlert
     * @var string
     */
    public $enableThresholdAlert;
    /**
     * @description data.miniAlertThreshold
     * @var integer
     */
    public $miniAlertThreshold;
    /**
     * @description data.depositAmount
     * @var string
     */
    public $frozenAmount;
    /**
     * @description data.creditCardAmount
     * @var string
     */
    public $creditCardAmount;
    /**
     * @description data.remmitanceAmount
     * @var string
     */
    public $remmitanceAmount;
    /**
     * @description data.creditLimit
     * @var string
     */
    public $creditLimit;
    /**
     * @description data.availableCredit
     * @var string
     */
    public $availableCredit;
}
