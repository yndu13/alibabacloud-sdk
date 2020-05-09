<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Models;

use AlibabaCloud\Tea\Model;

class DescribeCouponDetailRequest extends Model {
    protected $_name = [
        'couponNumber' => 'CouponNumber',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        $res['CouponNumber'] = $this->couponNumber;
        return $res;
    }
    /**
     * @param array $map
     * @return DescribeCouponDetailRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['CouponNumber'])){
            $model->couponNumber = $map['CouponNumber'];
        }
        return $model;
    }
    /**
     * @description couponNumber
     * @var string
     */
    public $couponNumber;

}
