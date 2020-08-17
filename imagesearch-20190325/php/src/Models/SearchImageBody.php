<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\ImageSearch\V20190325\Models;

use AlibabaCloud\Tea\Model;

class SearchImageBody extends Model
{
    /**
     * @var int
     */
    public $categoryId;

    /**
     * @var string
     */
    public $instanceName;

    /**
     * @var string
     */
    public $productId;

    /**
     * @var string
     */
    public $picName;

    /**
     * @var string
     */
    public $picContent;

    /**
     * @var bool
     */
    public $crop;

    /**
     * @var string
     */
    public $region;

    /**
     * @var int
     */
    public $num;

    /**
     * @var int
     */
    public $start;

    /**
     * @var string
     */
    public $type;

    /**
     * @var string
     */
    public $filter;
    protected $_name = [
        'categoryId'   => 'CategoryId',
        'instanceName' => 'InstanceName',
        'productId'    => 'ProductId',
        'picName'      => 'PicName',
        'picContent'   => 'PicContent',
        'crop'         => 'Crop',
        'region'       => 'Region',
        'num'          => 'Num',
        'start'        => 'Start',
        'type'         => 'Type',
        'filter'       => 'Filter',
    ];

    public function validate()
    {
        Model::validateRequired('instanceName', $this->instanceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->categoryId) {
            $res['CategoryId'] = $this->categoryId;
        }
        if (null !== $this->instanceName) {
            $res['InstanceName'] = $this->instanceName;
        }
        if (null !== $this->productId) {
            $res['ProductId'] = $this->productId;
        }
        if (null !== $this->picName) {
            $res['PicName'] = $this->picName;
        }
        if (null !== $this->picContent) {
            $res['PicContent'] = $this->picContent;
        }
        if (null !== $this->crop) {
            $res['Crop'] = $this->crop;
        }
        if (null !== $this->region) {
            $res['Region'] = $this->region;
        }
        if (null !== $this->num) {
            $res['Num'] = $this->num;
        }
        if (null !== $this->start) {
            $res['Start'] = $this->start;
        }
        if (null !== $this->type) {
            $res['Type'] = $this->type;
        }
        if (null !== $this->filter) {
            $res['Filter'] = $this->filter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SearchImageBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['CategoryId'])) {
            $model->categoryId = $map['CategoryId'];
        }
        if (isset($map['InstanceName'])) {
            $model->instanceName = $map['InstanceName'];
        }
        if (isset($map['ProductId'])) {
            $model->productId = $map['ProductId'];
        }
        if (isset($map['PicName'])) {
            $model->picName = $map['PicName'];
        }
        if (isset($map['PicContent'])) {
            $model->picContent = $map['PicContent'];
        }
        if (isset($map['Crop'])) {
            $model->crop = $map['Crop'];
        }
        if (isset($map['Region'])) {
            $model->region = $map['Region'];
        }
        if (isset($map['Num'])) {
            $model->num = $map['Num'];
        }
        if (isset($map['Start'])) {
            $model->start = $map['Start'];
        }
        if (isset($map['Type'])) {
            $model->type = $map['Type'];
        }
        if (isset($map['Filter'])) {
            $model->filter = $map['Filter'];
        }

        return $model;
    }
}
