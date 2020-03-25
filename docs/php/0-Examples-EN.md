[← Home](../../README.md) | Examples[(中文)](0-Examples-CN.md)

***

## Requirements

- To use Alibaba Cloud SDK for PHP, you must have an Alibaba Cloud account as well as an `AccessKey ID` and an `AccessKey Secret`. Create and view your AccessKey on the [RAM console](https://ram.console.aliyun.com "RAM console") or contact your system administrator.
- To use the Alibaba Cloud SDK for PHP to access the APIs of a product, you must first activate the product on the [Alibaba Cloud console](https://home.console.aliyun.com) if required.
- The Alibaba Cloud PHP SDK requires JDK 1.6 or later.

## Installation

If you use `Composer` to manage php libraries

```bash
# require alibabacloud/imagesearch-20200212 for example
composer require alibabacloud/imagesearch-20200212
```

## Quick Examples

The following code example shows the three main steps to use Alibaba Cloud SDK for PHP :

1. Create and initialize a `Config` instance.

2. Create and initialize a `Client` instance.

3. Create and set up parameters `RuntimeOptions` instance.

4. Create an API request and set parameters.

5. Initiate the request and handle the response or exceptions.

```php
namespace demo;

require __DIR__ . '/vendor/autoload.php';

use AlibabaCloud\SDK\ImageSearch\V20200212\ImageSearch;
use AlibabaCloud\SDK\ImageSearch\V20200212\ImageSearch\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;

$config = new Config([
    'type'            => 'access_key',
    'accessKeyId'     => '<Access-Key-Id>',
    'accessKeySecret' => '<Access-Key-Secret>',
    'regionId'        => 'cn-shanghai',
    'endpoint'        => 'imagesearch.cn-shanghai.aliyuncs.com',
]);

$client = new ImageSearch($config);

$request          = new ImageSearch\SearchImageByNameRequest();
$request->picName = 'test';

$runtime                 = new RuntimeOptions();
$runtime->maxIdleConns   = 3;
$runtime->connectTimeout = 10000;
$runtime->readTimeout    = 10000;

try {
    $response = $client->searchImageByName($request, $runtime);
    var_dump($response);
} catch (TeaError $e) {
    var_dump($e->getErrorInfo());
}

```

***
[← Home](../../README.md) | Examples[(中文)](0-Examples-CN.md)