<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Bss\DescribeCouponListResponse;

use AlibabaCloud\Tea\Model;

use AlibabaCloud\SDK\Bss\V20140714\Bss\coupons\productCodes;
use AlibabaCloud\SDK\Bss\V20140714\Bss\coupons\tradeTypes;

class coupons extends Model{
    protected $_name = [
        'couponTemplateId' => 'CouponTemplateId',
        'totalAmount' => 'TotalAmount',
        'balanceAmount' => 'BalanceAmount',
        'frozenAmount' => 'FrozenAmount',
        'expiredAmount' => 'ExpiredAmount',
        'deliveryTime' => 'DeliveryTime',
        'expiredTime' => 'ExpiredTime',
        'couponNumber' => 'CouponNumber',
        'status' => 'Status',
        'description' => 'Description',
        'creationTime' => 'CreationTime',
        'modificationTime' => 'ModificationTime',
        'priceLimit' => 'PriceLimit',
        'application' => 'Application',
        'productCodes' => 'ProductCodes',
        'tradeTypes' => 'TradeTypes',
    ];
    public function validate() {
        Model::validateRequired('couponTemplateId', $this->couponTemplateId, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('balanceAmount', $this->balanceAmount, true);
        Model::validateRequired('frozenAmount', $this->frozenAmount, true);
        Model::validateRequired('expiredAmount', $this->expiredAmount, true);
        Model::validateRequired('deliveryTime', $this->deliveryTime, true);
        Model::validateRequired('expiredTime', $this->expiredTime, true);
        Model::validateRequired('couponNumber', $this->couponNumber, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('creationTime', $this->creationTime, true);
        Model::validateRequired('modificationTime', $this->modificationTime, true);
        Model::validateRequired('priceLimit', $this->priceLimit, true);
        Model::validateRequired('application', $this->application, true);
        Model::validateRequired('productCodes', $this->productCodes, true);
        Model::validateRequired('tradeTypes', $this->tradeTypes, true);
    }
    public function toMap() {
        $res = [];
        $res['CouponTemplateId'] = $this->couponTemplateId;
        $res['TotalAmount'] = $this->totalAmount;
        $res['BalanceAmount'] = $this->balanceAmount;
        $res['FrozenAmount'] = $this->frozenAmount;
        $res['ExpiredAmount'] = $this->expiredAmount;
        $res['DeliveryTime'] = $this->deliveryTime;
        $res['ExpiredTime'] = $this->expiredTime;
        $res['CouponNumber'] = $this->couponNumber;
        $res['Status'] = $this->status;
        $res['Description'] = $this->description;
        $res['CreationTime'] = $this->creationTime;
        $res['ModificationTime'] = $this->modificationTime;
        $res['PriceLimit'] = $this->priceLimit;
        $res['Application'] = $this->application;
        $res['ProductCodes'] = null !== $this->productCodes ? $this->productCodes->toMap() : null;
        $res['TradeTypes'] = null !== $this->tradeTypes ? $this->tradeTypes->toMap() : null;
        return $res;
    }
    /**
     * @param array $map
     * @return coupons
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['CouponTemplateId'])){
            $model->couponTemplateId = $map['CouponTemplateId'];
        }
        if(isset($map['TotalAmount'])){
            $model->totalAmount = $map['TotalAmount'];
        }
        if(isset($map['BalanceAmount'])){
            $model->balanceAmount = $map['BalanceAmount'];
        }
        if(isset($map['FrozenAmount'])){
            $model->frozenAmount = $map['FrozenAmount'];
        }
        if(isset($map['ExpiredAmount'])){
            $model->expiredAmount = $map['ExpiredAmount'];
        }
        if(isset($map['DeliveryTime'])){
            $model->deliveryTime = $map['DeliveryTime'];
        }
        if(isset($map['ExpiredTime'])){
            $model->expiredTime = $map['ExpiredTime'];
        }
        if(isset($map['CouponNumber'])){
            $model->couponNumber = $map['CouponNumber'];
        }
        if(isset($map['Status'])){
            $model->status = $map['Status'];
        }
        if(isset($map['Description'])){
            $model->description = $map['Description'];
        }
        if(isset($map['CreationTime'])){
            $model->creationTime = $map['CreationTime'];
        }
        if(isset($map['ModificationTime'])){
            $model->modificationTime = $map['ModificationTime'];
        }
        if(isset($map['PriceLimit'])){
            $model->priceLimit = $map['PriceLimit'];
        }
        if(isset($map['Application'])){
            $model->application = $map['Application'];
        }
        if(isset($map['ProductCodes'])){
            $model->productCodes = coupons\productCodes::fromMap($map['ProductCodes']);
        }
        if(isset($map['TradeTypes'])){
            $model->tradeTypes = coupons\tradeTypes::fromMap($map['TradeTypes']);
        }
        return $model;
    }
    /**
     * @description couponTemplateId
     * @var integer
     */
    public $couponTemplateId;
    /**
     * @description totalAmount
     * @var string
     */
    public $totalAmount;
    /**
     * @description balanceAmount
     * @var string
     */
    public $balanceAmount;
    /**
     * @description frozenAmount
     * @var string
     */
    public $frozenAmount;
    /**
     * @description expiredAmount
     * @var string
     */
    public $expiredAmount;
    /**
     * @description deliveryTime
     * @var string
     */
    public $deliveryTime;
    /**
     * @description expiredTime
     * @var string
     */
    public $expiredTime;
    /**
     * @description couponNumber
     * @var string
     */
    public $couponNumber;
    /**
     * @description status
     * @var string
     */
    public $status;
    /**
     * @description description
     * @var string
     */
    public $description;
    /**
     * @description gmtCreate
     * @var string
     */
    public $creationTime;
    /**
     * @description gmtModify
     * @var string
     */
    public $modificationTime;
    /**
     * @description priceLimit
     * @var string
     */
    public $priceLimit;
    /**
     * @description application
     * @var string
     */
    public $application;
    /**
     * @description productCode
     * @var coupons.productCodes
     */
    public $productCodes;
    /**
     * @description tradeType
     * @var coupons.tradeTypes
     */
    public $tradeTypes;
}
