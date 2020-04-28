<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Models\DescribeCouponDetailResponse;

use AlibabaCloud\Tea\Model;

class productCodes extends Model{
    protected $_name = [
        'productCode' => 'ProductCode',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
    }
    public function toMap() {
        $res = [];
        $res['ProductCode'] = [];
        if(null !== $this->productCode){
            $res['ProductCode'] = $this->productCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return productCodes
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ProductCode'])){
            if(!empty($map['ProductCode'])){
                $model->productCode = [];
                $model->productCode = $map['ProductCode'];
            }
        }
        return $model;
    }
    /**
     * @description ProductCode
     * @var array
     */
    public $productCode;

}
