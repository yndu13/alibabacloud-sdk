<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Dysmsapi\V20170525\Models;

use AlibabaCloud\Tea\Model;

use AlibabaCloud\SDK\Dysmsapi\V20170525\Models\QuerySendDetailsResponse\smsSendDetailDTOs;

class QuerySendDetailsResponse extends Model {
    protected $_name = [
        'requestId' => 'RequestId',
        'code' => 'Code',
        'message' => 'Message',
        'totalCount' => 'TotalCount',
        'smsSendDetailDTOs' => 'SmsSendDetailDTOs',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('smsSendDetailDTOs', $this->smsSendDetailDTOs, true);
    }
    public function toMap() {
        $res = [];
        $res['RequestId'] = $this->requestId;
        $res['Code'] = $this->code;
        $res['Message'] = $this->message;
        $res['TotalCount'] = $this->totalCount;
        $res['SmsSendDetailDTOs'] = null !== $this->smsSendDetailDTOs ? $this->smsSendDetailDTOs->toMap() : null;
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySendDetailsResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['RequestId'])){
            $model->requestId = $map['RequestId'];
        }
        if(isset($map['Code'])){
            $model->code = $map['Code'];
        }
        if(isset($map['Message'])){
            $model->message = $map['Message'];
        }
        if(isset($map['TotalCount'])){
            $model->totalCount = $map['TotalCount'];
        }
        if(isset($map['SmsSendDetailDTOs'])){
            $model->smsSendDetailDTOs = smsSendDetailDTOs::fromMap($map['SmsSendDetailDTOs']);
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
     * @description message
     * @var string
     */
    public $message;

    /**
     * @description totalCount
     * @var string
     */
    public $totalCount;

    /**
     * @description module
     * @var QuerySendDetailsResponse.smsSendDetailDTOs
     */
    public $smsSendDetailDTOs;

}
