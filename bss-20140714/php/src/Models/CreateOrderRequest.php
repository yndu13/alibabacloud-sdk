<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Models;

use AlibabaCloud\Tea\Model;

class CreateOrderRequest extends Model{
    protected $_name = [
        'paramStr' => 'paramStr',
    ];
    public function validate() {
        Model::validateRequired('paramStr', $this->paramStr, true);
    }
    public function toMap() {
        $res = [];
        $res['paramStr'] = $this->paramStr;
        return $res;
    }
    /**
     * @param array $map
     * @return CreateOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['paramStr'])){
            $model->paramStr = $map['paramStr'];
        }
        return $model;
    }
    /**
     * @description paramStr
     * @var string
     */
    public $paramStr;

}
