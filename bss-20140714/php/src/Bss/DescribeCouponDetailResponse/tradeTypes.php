<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Bss\DescribeCouponDetailResponse;

use AlibabaCloud\Tea\Model;

class tradeTypes extends Model{
    protected $_name = [
        'tradeType' => 'TradeType',
    ];
    public function validate() {
        Model::validateRequired('tradeType', $this->tradeType, true);
    }
    public function toMap() {
        $res = [];
        $res['TradeType'] = [];
        if(null !== $this->tradeType){
            $res['TradeType'] = $this->tradeType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return tradeTypes
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['TradeType'])){
            if(!empty($map['TradeType'])){
                $model->tradeType = [];
                $model->tradeType = $map['TradeType'];
            }
        }
        return $model;
    }
    /**
     * @description TradeType
     * @var array
     */
    public $tradeType;

}
