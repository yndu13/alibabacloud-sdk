<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Dyvmsapi\V20170525\Models;

use AlibabaCloud\Tea\Model;

class UnbindNumberAndVoipIdResponse extends Model {
    protected $_name = [
        'requestId' => 'RequestId',
        'code' => 'Code',
        'module' => 'Module',
        'message' => 'Message',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('module', $this->module, true);
        Model::validateRequired('message', $this->message, true);
    }
    public function toMap() {
        $res = [];
        $res['RequestId'] = $this->requestId;
        $res['Code'] = $this->code;
        $res['Module'] = $this->module;
        $res['Message'] = $this->message;
        return $res;
    }
    /**
     * @param array $map
     * @return UnbindNumberAndVoipIdResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['RequestId'])){
            $model->requestId = $map['RequestId'];
        }
        if(isset($map['Code'])){
            $model->code = $map['Code'];
        }
        if(isset($map['Module'])){
            $model->module = $map['Module'];
        }
        if(isset($map['Message'])){
            $model->message = $map['Message'];
        }
        return $model;
    }
    /**
     * @description requestId
     * @var string
     */
    public $requestId;

    /**
     * @description code
     * @var string
     */
    public $code;

    /**
     * @description module
     * @var string
     */
    public $module;

    /**
     * @description message
     * @var string
     */
    public $message;

}
