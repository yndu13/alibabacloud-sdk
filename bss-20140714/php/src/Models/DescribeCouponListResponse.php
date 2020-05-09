<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Models;

use AlibabaCloud\Tea\Model;

use AlibabaCloud\SDK\Bss\V20140714\Models\DescribeCouponListResponse\coupons;

class DescribeCouponListResponse extends Model {
    protected $_name = [
        'requestId' => 'RequestId',
        'coupons' => 'Coupons',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('coupons', $this->coupons, true);
    }
    public function toMap() {
        $res = [];
        $res['RequestId'] = $this->requestId;
        $res['Coupons'] = [];
        if(null !== $this->coupons && is_array($this->coupons)){
            $n = 0;
            foreach($this->coupons as $item){
                $res['Coupons'][$n++] = null !== $item ? $item->toMap() : $item;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DescribeCouponListResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['RequestId'])){
            $model->requestId = $map['RequestId'];
        }
        if(isset($map['Coupons'])){
            if(!empty($map['Coupons'])){
                $model->coupons = [];
                $n = 0;
                foreach($map['Coupons'] as $item) {
                    $model->coupons[$n++] = null !== $item ? coupons::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description requestId
     * @var string
     */
    public $requestId;

    /**
     * @description data
     * @var array
     */
    public $coupons;

}
