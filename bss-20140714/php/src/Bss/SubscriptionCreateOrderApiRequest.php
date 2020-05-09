<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Bss;

use AlibabaCloud\Tea\Model;

class SubscriptionCreateOrderApiRequest extends Model{
    protected $_name = [
        'ownerId' => 'ownerId',
        'productCode' => 'productCode',
    ];
    public function validate() {
        Model::validateRequired('ownerId', $this->ownerId, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }
    public function toMap() {
        $res = [];
        $res['ownerId'] = $this->ownerId;
        $res['productCode'] = $this->productCode;
        return $res;
    }
    /**
     * @param array $map
     * @return SubscriptionCreateOrderApiRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ownerId'])){
            $model->ownerId = $map['ownerId'];
        }
        if(isset($map['productCode'])){
            $model->productCode = $map['productCode'];
        }
        return $model;
    }
    /**
     * @description ownerId
     * @var string
     */
    public $ownerId;
    /**
     * @description productCode
     * @var string
     */
    public $productCode;
}
