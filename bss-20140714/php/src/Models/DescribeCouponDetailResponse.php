<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Models;

use AlibabaCloud\Tea\Model;

use AlibabaCloud\SDK\Bss\V20140714\Models\DescribeCouponDetailResponse\productCodes;
use AlibabaCloud\SDK\Bss\V20140714\Models\DescribeCouponDetailResponse\tradeTypes;

class DescribeCouponDetailResponse extends Model {
    protected $_name = [
        'requestId' => 'RequestId',
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
        Model::validateRequired('requestId', $this->requestId, true);
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
        $res['RequestId'] = $this->requestId;
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
     * @return DescribeCouponDetailResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['RequestId'])){
            $model->requestId = $map['RequestId'];
        }
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
            $model->productCodes = productCodes::fromMap($map['ProductCodes']);
        }
        if(isset($map['TradeTypes'])){
            $model->tradeTypes = tradeTypes::fromMap($map['TradeTypes']);
        }
        return $model;
    }
    /**
     * @description requestId
     * @var string
     */
    public $requestId;

    /**
     * @description data.couponTemplateId
     * @var integer
     */
    public $couponTemplateId;

    /**
     * @description data.totalAmount
     * @var string
     */
    public $totalAmount;

    /**
     * @description data.balanceAmount
     * @var string
     */
    public $balanceAmount;

    /**
     * @description data.frozenAmount
     * @var string
     */
    public $frozenAmount;

    /**
     * @description data.expiredAmount
     * @var string
     */
    public $expiredAmount;

    /**
     * @description data.deliveryTime
     * @var string
     */
    public $deliveryTime;

    /**
     * @description data.expiredTime
     * @var string
     */
    public $expiredTime;

    /**
     * @description data.couponNumber
     * @var string
     */
    public $couponNumber;

    /**
     * @description data.status
     * @var string
     */
    public $status;

    /**
     * @description data.description
     * @var string
     */
    public $description;

    /**
     * @description data.gmtCreate
     * @var string
     */
    public $creationTime;

    /**
     * @description data.gmtModify
     * @var string
     */
    public $modificationTime;

    /**
     * @description data.priceLimit
     * @var string
     */
    public $priceLimit;

    /**
     * @description data.application
     * @var string
     */
    public $application;

    /**
     * @description data.productCode
     * @var DescribeCouponDetailResponse.productCodes
     */
    public $productCodes;

    /**
     * @description data.tradeType
     * @var DescribeCouponDetailResponse.tradeTypes
     */
    public $tradeTypes;

}
