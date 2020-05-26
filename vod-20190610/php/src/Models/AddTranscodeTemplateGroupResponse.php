<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\vod\V20190610\Models;

use AlibabaCloud\Tea\Model;

class AddTranscodeTemplateGroupResponse extends Model {
    protected $_name = [
        'requestId' => 'RequestId',
        'transcodeTemplateGroupId' => 'TranscodeTemplateGroupId',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('transcodeTemplateGroupId', $this->transcodeTemplateGroupId, true);
    }
    public function toMap() {
        $res = [];
        $res['RequestId'] = $this->requestId;
        $res['TranscodeTemplateGroupId'] = $this->transcodeTemplateGroupId;
        return $res;
    }
    /**
     * @param array $map
     * @return AddTranscodeTemplateGroupResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['RequestId'])){
            $model->requestId = $map['RequestId'];
        }
        if(isset($map['TranscodeTemplateGroupId'])){
            $model->transcodeTemplateGroupId = $map['TranscodeTemplateGroupId'];
        }
        return $model;
    }
    /**
     * @description requestId
     * @var string
     */
    public $requestId;

    /**
     * @description data.transcodeTemplateGroupId
     * @var string
     */
    public $transcodeTemplateGroupId;

}
