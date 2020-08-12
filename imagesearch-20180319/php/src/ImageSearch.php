<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\ImageSearch\V20180319;

use AlibabaCloud\Endpoint\Endpoint;
use AlibabaCloud\SDK\ImageSearch\V20180319\Models\AddItemRequest;
use AlibabaCloud\SDK\ImageSearch\V20180319\Models\AddItemResponse;
use AlibabaCloud\SDK\ImageSearch\V20180319\Models\DeleteItemRequest;
use AlibabaCloud\SDK\ImageSearch\V20180319\Models\DeleteItemResponse;
use AlibabaCloud\SDK\ImageSearch\V20180319\Models\SearchItemRequest;
use AlibabaCloud\SDK\ImageSearch\V20180319\Models\SearchItemResponse;
use AlibabaCloud\Tea\Roa\Roa;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;

class ImageSearch extends Roa
{
    public function __construct($config)
    {
        parent::__construct($config);
        $this->_endpointRule = '';
        $this->checkConfig($config);
        $this->_endpointHost = $this->getEndpoint('imagesearch', $this->_regionId, $this->_endpointRule, $this->_network, $this->_suffix, $this->_endpointMap, $this->_endpointHost);
    }

    /**
     * @param SearchItemRequest $request
     * @param RuntimeOptions    $runtime
     *
     * @return SearchItemResponse
     */
    public function searchItemWithOptions($request, $runtime)
    {
        Utils::validateModel($request);

        return SearchItemResponse::fromMap($this->doRequestWithAction('SearchItem', '2018-03-19', 'HTTPS', 'POST', 'AK', '/item/search', Utils::stringifyMapValue($request->query), $request->headers, null, $runtime));
    }

    /**
     * @param SearchItemRequest $request
     *
     * @return SearchItemResponse
     */
    public function searchItem($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->searchItemWithOptions($request, $runtime);
    }

    /**
     * @param DeleteItemRequest $request
     * @param RuntimeOptions    $runtime
     *
     * @return DeleteItemResponse
     */
    public function deleteItemWithOptions($request, $runtime)
    {
        Utils::validateModel($request);

        return DeleteItemResponse::fromMap($this->doRequestWithAction('DeleteItem', '2018-03-19', 'HTTPS', 'POST', 'AK', '/item/delete', Utils::stringifyMapValue($request->query), $request->headers, null, $runtime));
    }

    /**
     * @param DeleteItemRequest $request
     *
     * @return DeleteItemResponse
     */
    public function deleteItem($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->deleteItemWithOptions($request, $runtime);
    }

    /**
     * @param AddItemRequest $request
     * @param RuntimeOptions $runtime
     *
     * @return AddItemResponse
     */
    public function addItemWithOptions($request, $runtime)
    {
        Utils::validateModel($request);

        return AddItemResponse::fromMap($this->doRequestWithAction('AddItem', '2018-03-19', 'HTTPS', 'POST', 'AK', '/item/add', Utils::stringifyMapValue($request->query), $request->headers, null, $runtime));
    }

    /**
     * @param AddItemRequest $request
     *
     * @return AddItemResponse
     */
    public function addItem($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->addItemWithOptions($request, $runtime);
    }

    /**
     * @param string $productId
     * @param string $regionId
     * @param string $endpointRule
     * @param string $network
     * @param string $suffix
     * @param array  $endpointMap
     * @param string $endpoint
     *
     * @return string
     */
    public function getEndpoint($productId, $regionId, $endpointRule, $network, $suffix, $endpointMap, $endpoint)
    {
        if (!Utils::empty_($endpoint)) {
            return $endpoint;
        }
        if (!Utils::isUnset($endpointMap) && !Utils::empty_($endpointMap['regionId'])) {
            return $endpointMap['regionId'];
        }

        return Endpoint::getEndpointRules($productId, $regionId, $endpointRule, $network, $suffix);
    }
}
