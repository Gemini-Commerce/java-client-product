# ProductApi

All URIs are relative to *https://product.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productAddMediaGalleryEntry**](ProductApi.md#productAddMediaGalleryEntry) | **POST** /product.Product/AddMediaGalleryEntry |  |
| [**productBulkAddAssetsEntries**](ProductApi.md#productBulkAddAssetsEntries) | **POST** /product.Product/BulkAddAssetsEntries | Assets endpoints |
| [**productBulkCreateAttribute**](ProductApi.md#productBulkCreateAttribute) | **POST** /product.Product/BulkCreateAttribute |  |
| [**productBulkDeleteProducts**](ProductApi.md#productBulkDeleteProducts) | **POST** /product.Product/BulkDeleteProducts |  |
| [**productBulkRemoveAssetsEntries**](ProductApi.md#productBulkRemoveAssetsEntries) | **POST** /product.Product/BulkRemoveAssetsEntries |  |
| [**productBulkUpdate**](ProductApi.md#productBulkUpdate) | **POST** /product.Product/BulkUpdate |  |
| [**productBulkUpdateAssetsEntries**](ProductApi.md#productBulkUpdateAssetsEntries) | **POST** /product.Product/BulkUpdateAssetsEntries |  |
| [**productBulkUpdateV2**](ProductApi.md#productBulkUpdateV2) | **POST** /product.Product/BulkUpdateV2 |  |
| [**productCreateAttributeGroup**](ProductApi.md#productCreateAttributeGroup) | **POST** /product.Product/CreateAttributeGroup |  |
| [**productCreateAttributeOptions**](ProductApi.md#productCreateAttributeOptions) | **POST** /product.Product/CreateAttributeOptions |  |
| [**productCreateEntity**](ProductApi.md#productCreateEntity) | **POST** /product.Product/CreateEntity |  |
| [**productCreateOptionsList**](ProductApi.md#productCreateOptionsList) | **POST** /product.Product/CreateOptionsList |  |
| [**productCreateProduct**](ProductApi.md#productCreateProduct) | **POST** /product.Product/CreateProduct |  |
| [**productCreateProductV2**](ProductApi.md#productCreateProductV2) | **POST** /product.Product/CreateProductV2 |  |
| [**productDelete**](ProductApi.md#productDelete) | **POST** /product.Product/Delete |  |
| [**productDeleteAttribute**](ProductApi.md#productDeleteAttribute) | **POST** /product.Product/DeleteAttribute |  |
| [**productDeleteProduct**](ProductApi.md#productDeleteProduct) | **POST** /product.Product/DeleteProduct |  |
| [**productGetAttributeGroup**](ProductApi.md#productGetAttributeGroup) | **POST** /product.Product/GetAttributeGroup |  |
| [**productGetAttributeOption**](ProductApi.md#productGetAttributeOption) | **POST** /product.Product/GetAttributeOption |  |
| [**productGetAttributeOptions**](ProductApi.md#productGetAttributeOptions) | **POST** /product.Product/GetAttributeOptions |  |
| [**productGetEntity**](ProductApi.md#productGetEntity) | **POST** /product.Product/GetEntity |  |
| [**productGetOptionsList**](ProductApi.md#productGetOptionsList) | **POST** /product.Product/GetOptionsList |  |
| [**productGetProduct**](ProductApi.md#productGetProduct) | **POST** /product.Product/GetProduct |  |
| [**productGetProductByCode**](ProductApi.md#productGetProductByCode) | **POST** /product.Product/GetProductByCode |  |
| [**productGetProductByUrlKey**](ProductApi.md#productGetProductByUrlKey) | **POST** /product.Product/GetProductByUrlKey |  |
| [**productListAttributeGroups**](ProductApi.md#productListAttributeGroups) | **POST** /product.Product/ListAttributeGroups | Attribute Groups endpoints |
| [**productListAttributeOptions**](ProductApi.md#productListAttributeOptions) | **POST** /product.Product/ListAttributeOptions |  |
| [**productListEntities**](ProductApi.md#productListEntities) | **POST** /product.Product/ListEntities |  |
| [**productListOptionsLists**](ProductApi.md#productListOptionsLists) | **POST** /product.Product/ListOptionsLists |  |
| [**productListProducts**](ProductApi.md#productListProducts) | **POST** /product.Product/ListProducts |  |
| [**productListProductsByIds**](ProductApi.md#productListProductsByIds) | **POST** /product.Product/ListProductsByIds |  |
| [**productListProductsBySku**](ProductApi.md#productListProductsBySku) | **POST** /product.Product/ListProductsBySku |  |
| [**productListVariantsBySku**](ProductApi.md#productListVariantsBySku) | **POST** /product.Product/ListVariantsBySku |  |
| [**productRemoveMediaGalleryEntry**](ProductApi.md#productRemoveMediaGalleryEntry) | **POST** /product.Product/RemoveMediaGalleryEntry |  |
| [**productUpdateAttribute**](ProductApi.md#productUpdateAttribute) | **POST** /product.Product/UpdateAttribute |  |
| [**productUpdateAttributeGroup**](ProductApi.md#productUpdateAttributeGroup) | **POST** /product.Product/UpdateAttributeGroup |  |
| [**productUpdateAttributeOptions**](ProductApi.md#productUpdateAttributeOptions) | **POST** /product.Product/UpdateAttributeOptions | rpc GetAttributeOptionByCode (product.entitymanager.GetAttributeOptionByCodeRequest) returns (product.entitymanager.GetAttributeOptionByCodeResponse) {} |
| [**productUpdateMediaGalleryEntry**](ProductApi.md#productUpdateMediaGalleryEntry) | **POST** /product.Product/UpdateMediaGalleryEntry |  |
| [**productUpdateOptionsList**](ProductApi.md#productUpdateOptionsList) | **POST** /product.Product/UpdateOptionsList |  |
| [**productUpdateProduct**](ProductApi.md#productUpdateProduct) | **POST** /product.Product/UpdateProduct |  |
| [**productUpdateProductV2**](ProductApi.md#productUpdateProductV2) | **POST** /product.Product/UpdateProductV2 |  |


<a id="productAddMediaGalleryEntry"></a>
# **productAddMediaGalleryEntry**
> ProductAddMediaGalleryEntryResponse productAddMediaGalleryEntry(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductAddMediaGalleryEntryRequest body = new ProductAddMediaGalleryEntryRequest(); // ProductAddMediaGalleryEntryRequest | 
    try {
      ProductAddMediaGalleryEntryResponse result = apiInstance.productAddMediaGalleryEntry(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productAddMediaGalleryEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductAddMediaGalleryEntryRequest**](ProductAddMediaGalleryEntryRequest.md)|  | |

### Return type

[**ProductAddMediaGalleryEntryResponse**](ProductAddMediaGalleryEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkAddAssetsEntries"></a>
# **productBulkAddAssetsEntries**
> ProductBulkAddAssetsEntriesResponse productBulkAddAssetsEntries(body)

Assets endpoints

### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkAddAssetsEntriesRequest body = new ProductBulkAddAssetsEntriesRequest(); // ProductBulkAddAssetsEntriesRequest | 
    try {
      ProductBulkAddAssetsEntriesResponse result = apiInstance.productBulkAddAssetsEntries(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productBulkAddAssetsEntries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductBulkAddAssetsEntriesRequest**](ProductBulkAddAssetsEntriesRequest.md)|  | |

### Return type

[**ProductBulkAddAssetsEntriesResponse**](ProductBulkAddAssetsEntriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkCreateAttribute"></a>
# **productBulkCreateAttribute**
> EntitymanagerBulkCreateAttributeResponse productBulkCreateAttribute(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerBulkCreateAttributeRequest body = new EntitymanagerBulkCreateAttributeRequest(); // EntitymanagerBulkCreateAttributeRequest | 
    try {
      EntitymanagerBulkCreateAttributeResponse result = apiInstance.productBulkCreateAttribute(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productBulkCreateAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerBulkCreateAttributeRequest**](EntitymanagerBulkCreateAttributeRequest.md)|  | |

### Return type

[**EntitymanagerBulkCreateAttributeResponse**](EntitymanagerBulkCreateAttributeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkDeleteProducts"></a>
# **productBulkDeleteProducts**
> Object productBulkDeleteProducts(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkDeleteProductsRequest body = new ProductBulkDeleteProductsRequest(); // ProductBulkDeleteProductsRequest | 
    try {
      Object result = apiInstance.productBulkDeleteProducts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productBulkDeleteProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductBulkDeleteProductsRequest**](ProductBulkDeleteProductsRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkRemoveAssetsEntries"></a>
# **productBulkRemoveAssetsEntries**
> Object productBulkRemoveAssetsEntries(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkRemoveAssetsEntriesRequest body = new ProductBulkRemoveAssetsEntriesRequest(); // ProductBulkRemoveAssetsEntriesRequest | 
    try {
      Object result = apiInstance.productBulkRemoveAssetsEntries(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productBulkRemoveAssetsEntries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductBulkRemoveAssetsEntriesRequest**](ProductBulkRemoveAssetsEntriesRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkUpdate"></a>
# **productBulkUpdate**
> ProductBulkUpdateResponse productBulkUpdate(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkUpdateRequest body = new ProductBulkUpdateRequest(); // ProductBulkUpdateRequest | 
    try {
      ProductBulkUpdateResponse result = apiInstance.productBulkUpdate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productBulkUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductBulkUpdateRequest**](ProductBulkUpdateRequest.md)|  | |

### Return type

[**ProductBulkUpdateResponse**](ProductBulkUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkUpdateAssetsEntries"></a>
# **productBulkUpdateAssetsEntries**
> ProductBulkUpdateAssetsEntriesResponse productBulkUpdateAssetsEntries(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkUpdateAssetsEntriesRequest body = new ProductBulkUpdateAssetsEntriesRequest(); // ProductBulkUpdateAssetsEntriesRequest | 
    try {
      ProductBulkUpdateAssetsEntriesResponse result = apiInstance.productBulkUpdateAssetsEntries(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productBulkUpdateAssetsEntries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductBulkUpdateAssetsEntriesRequest**](ProductBulkUpdateAssetsEntriesRequest.md)|  | |

### Return type

[**ProductBulkUpdateAssetsEntriesResponse**](ProductBulkUpdateAssetsEntriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkUpdateV2"></a>
# **productBulkUpdateV2**
> ProductBulkUpdateResponseV2 productBulkUpdateV2(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkUpdateRequestV2 body = new ProductBulkUpdateRequestV2(); // ProductBulkUpdateRequestV2 | 
    try {
      ProductBulkUpdateResponseV2 result = apiInstance.productBulkUpdateV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productBulkUpdateV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductBulkUpdateRequestV2**](ProductBulkUpdateRequestV2.md)|  | |

### Return type

[**ProductBulkUpdateResponseV2**](ProductBulkUpdateResponseV2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productCreateAttributeGroup"></a>
# **productCreateAttributeGroup**
> EntitymanagerAttributeGroup productCreateAttributeGroup(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerCreateAttributeGroupRequest body = new EntitymanagerCreateAttributeGroupRequest(); // EntitymanagerCreateAttributeGroupRequest | 
    try {
      EntitymanagerAttributeGroup result = apiInstance.productCreateAttributeGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productCreateAttributeGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerCreateAttributeGroupRequest**](EntitymanagerCreateAttributeGroupRequest.md)|  | |

### Return type

[**EntitymanagerAttributeGroup**](EntitymanagerAttributeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productCreateAttributeOptions"></a>
# **productCreateAttributeOptions**
> EntitymanagerCreateAttributeOptionsResponse productCreateAttributeOptions(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerCreateAttributeOptionsRequest body = new EntitymanagerCreateAttributeOptionsRequest(); // EntitymanagerCreateAttributeOptionsRequest | 
    try {
      EntitymanagerCreateAttributeOptionsResponse result = apiInstance.productCreateAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productCreateAttributeOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerCreateAttributeOptionsRequest**](EntitymanagerCreateAttributeOptionsRequest.md)|  | |

### Return type

[**EntitymanagerCreateAttributeOptionsResponse**](EntitymanagerCreateAttributeOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productCreateEntity"></a>
# **productCreateEntity**
> EntitymanagerCreateEntityResponse productCreateEntity(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerEntity body = new EntitymanagerEntity(); // EntitymanagerEntity | 
    try {
      EntitymanagerCreateEntityResponse result = apiInstance.productCreateEntity(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productCreateEntity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerEntity**](EntitymanagerEntity.md)|  | |

### Return type

[**EntitymanagerCreateEntityResponse**](EntitymanagerCreateEntityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productCreateOptionsList"></a>
# **productCreateOptionsList**
> EntitymanagerCreateOptionsListResponse productCreateOptionsList(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerCreateOptionsListRequest body = new EntitymanagerCreateOptionsListRequest(); // EntitymanagerCreateOptionsListRequest | 
    try {
      EntitymanagerCreateOptionsListResponse result = apiInstance.productCreateOptionsList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productCreateOptionsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerCreateOptionsListRequest**](EntitymanagerCreateOptionsListRequest.md)|  | |

### Return type

[**EntitymanagerCreateOptionsListResponse**](EntitymanagerCreateOptionsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productCreateProduct"></a>
# **productCreateProduct**
> ProductCreateProductResponse productCreateProduct(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductCreateProductRequest body = new ProductCreateProductRequest(); // ProductCreateProductRequest | 
    try {
      ProductCreateProductResponse result = apiInstance.productCreateProduct(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productCreateProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductCreateProductRequest**](ProductCreateProductRequest.md)|  | |

### Return type

[**ProductCreateProductResponse**](ProductCreateProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productCreateProductV2"></a>
# **productCreateProductV2**
> ProductCreateProductResponseV2 productCreateProductV2(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductCreateProductRequestV2 body = new ProductCreateProductRequestV2(); // ProductCreateProductRequestV2 | 
    try {
      ProductCreateProductResponseV2 result = apiInstance.productCreateProductV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productCreateProductV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductCreateProductRequestV2**](ProductCreateProductRequestV2.md)|  | |

### Return type

[**ProductCreateProductResponseV2**](ProductCreateProductResponseV2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productDelete"></a>
# **productDelete**
> ProductDeleteResponse productDelete(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductDeleteRequest body = new ProductDeleteRequest(); // ProductDeleteRequest | 
    try {
      ProductDeleteResponse result = apiInstance.productDelete(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductDeleteRequest**](ProductDeleteRequest.md)|  | |

### Return type

[**ProductDeleteResponse**](ProductDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productDeleteAttribute"></a>
# **productDeleteAttribute**
> Object productDeleteAttribute(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerDeleteAttributeRequest body = new EntitymanagerDeleteAttributeRequest(); // EntitymanagerDeleteAttributeRequest | 
    try {
      Object result = apiInstance.productDeleteAttribute(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productDeleteAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerDeleteAttributeRequest**](EntitymanagerDeleteAttributeRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productDeleteProduct"></a>
# **productDeleteProduct**
> Object productDeleteProduct(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductDeleteProductRequest body = new ProductDeleteProductRequest(); // ProductDeleteProductRequest | 
    try {
      Object result = apiInstance.productDeleteProduct(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productDeleteProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductDeleteProductRequest**](ProductDeleteProductRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetAttributeGroup"></a>
# **productGetAttributeGroup**
> EntitymanagerAttributeGroup productGetAttributeGroup(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerGetAttributeGroupRequest body = new EntitymanagerGetAttributeGroupRequest(); // EntitymanagerGetAttributeGroupRequest | 
    try {
      EntitymanagerAttributeGroup result = apiInstance.productGetAttributeGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetAttributeGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerGetAttributeGroupRequest**](EntitymanagerGetAttributeGroupRequest.md)|  | |

### Return type

[**EntitymanagerAttributeGroup**](EntitymanagerAttributeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetAttributeOption"></a>
# **productGetAttributeOption**
> EntitymanagerGetAttributeOptionResponse productGetAttributeOption(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerGetAttributeOptionRequest body = new EntitymanagerGetAttributeOptionRequest(); // EntitymanagerGetAttributeOptionRequest | 
    try {
      EntitymanagerGetAttributeOptionResponse result = apiInstance.productGetAttributeOption(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetAttributeOption");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerGetAttributeOptionRequest**](EntitymanagerGetAttributeOptionRequest.md)|  | |

### Return type

[**EntitymanagerGetAttributeOptionResponse**](EntitymanagerGetAttributeOptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetAttributeOptions"></a>
# **productGetAttributeOptions**
> EntitymanagerGetAttributeOptionsResponse productGetAttributeOptions(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerGetAttributeOptionsRequest body = new EntitymanagerGetAttributeOptionsRequest(); // EntitymanagerGetAttributeOptionsRequest | 
    try {
      EntitymanagerGetAttributeOptionsResponse result = apiInstance.productGetAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetAttributeOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerGetAttributeOptionsRequest**](EntitymanagerGetAttributeOptionsRequest.md)|  | |

### Return type

[**EntitymanagerGetAttributeOptionsResponse**](EntitymanagerGetAttributeOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetEntity"></a>
# **productGetEntity**
> EntitymanagerEntity productGetEntity(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerEntityRequest body = new EntitymanagerEntityRequest(); // EntitymanagerEntityRequest | 
    try {
      EntitymanagerEntity result = apiInstance.productGetEntity(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetEntity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerEntityRequest**](EntitymanagerEntityRequest.md)|  | |

### Return type

[**EntitymanagerEntity**](EntitymanagerEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetOptionsList"></a>
# **productGetOptionsList**
> EntitymanagerGetOptionsListResponse productGetOptionsList(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerGetOptionsListRequest body = new EntitymanagerGetOptionsListRequest(); // EntitymanagerGetOptionsListRequest | 
    try {
      EntitymanagerGetOptionsListResponse result = apiInstance.productGetOptionsList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetOptionsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerGetOptionsListRequest**](EntitymanagerGetOptionsListRequest.md)|  | |

### Return type

[**EntitymanagerGetOptionsListResponse**](EntitymanagerGetOptionsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetProduct"></a>
# **productGetProduct**
> ProductGetProductResponse productGetProduct(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetProductRequest body = new ProductGetProductRequest(); // ProductGetProductRequest | 
    try {
      ProductGetProductResponse result = apiInstance.productGetProduct(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductGetProductRequest**](ProductGetProductRequest.md)|  | |

### Return type

[**ProductGetProductResponse**](ProductGetProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetProductByCode"></a>
# **productGetProductByCode**
> ProductGetProductByCodeResponse productGetProductByCode(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetProductByCodeRequest body = new ProductGetProductByCodeRequest(); // ProductGetProductByCodeRequest | 
    try {
      ProductGetProductByCodeResponse result = apiInstance.productGetProductByCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetProductByCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductGetProductByCodeRequest**](ProductGetProductByCodeRequest.md)|  | |

### Return type

[**ProductGetProductByCodeResponse**](ProductGetProductByCodeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productGetProductByUrlKey"></a>
# **productGetProductByUrlKey**
> ProductGetProductByUrlKeyResponse productGetProductByUrlKey(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetProductByUrlKeyRequest body = new ProductGetProductByUrlKeyRequest(); // ProductGetProductByUrlKeyRequest | 
    try {
      ProductGetProductByUrlKeyResponse result = apiInstance.productGetProductByUrlKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productGetProductByUrlKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductGetProductByUrlKeyRequest**](ProductGetProductByUrlKeyRequest.md)|  | |

### Return type

[**ProductGetProductByUrlKeyResponse**](ProductGetProductByUrlKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListAttributeGroups"></a>
# **productListAttributeGroups**
> EntitymanagerListAttributeGroupsResponse productListAttributeGroups(body)

Attribute Groups endpoints

### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerListAttributeGroupsRequest body = new EntitymanagerListAttributeGroupsRequest(); // EntitymanagerListAttributeGroupsRequest | 
    try {
      EntitymanagerListAttributeGroupsResponse result = apiInstance.productListAttributeGroups(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListAttributeGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerListAttributeGroupsRequest**](EntitymanagerListAttributeGroupsRequest.md)|  | |

### Return type

[**EntitymanagerListAttributeGroupsResponse**](EntitymanagerListAttributeGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListAttributeOptions"></a>
# **productListAttributeOptions**
> EntitymanagerListAttributeOptionsResponse productListAttributeOptions(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerListAttributeOptionsRequest body = new EntitymanagerListAttributeOptionsRequest(); // EntitymanagerListAttributeOptionsRequest | 
    try {
      EntitymanagerListAttributeOptionsResponse result = apiInstance.productListAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListAttributeOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerListAttributeOptionsRequest**](EntitymanagerListAttributeOptionsRequest.md)|  | |

### Return type

[**EntitymanagerListAttributeOptionsResponse**](EntitymanagerListAttributeOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListEntities"></a>
# **productListEntities**
> EntitymanagerListEntitiesResponse productListEntities(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerListEntitiesRequest body = new EntitymanagerListEntitiesRequest(); // EntitymanagerListEntitiesRequest | 
    try {
      EntitymanagerListEntitiesResponse result = apiInstance.productListEntities(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerListEntitiesRequest**](EntitymanagerListEntitiesRequest.md)|  | |

### Return type

[**EntitymanagerListEntitiesResponse**](EntitymanagerListEntitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListOptionsLists"></a>
# **productListOptionsLists**
> EntitymanagerListOptionsListsResponse productListOptionsLists(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerListOptionsListsRequest body = new EntitymanagerListOptionsListsRequest(); // EntitymanagerListOptionsListsRequest | 
    try {
      EntitymanagerListOptionsListsResponse result = apiInstance.productListOptionsLists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListOptionsLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerListOptionsListsRequest**](EntitymanagerListOptionsListsRequest.md)|  | |

### Return type

[**EntitymanagerListOptionsListsResponse**](EntitymanagerListOptionsListsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListProducts"></a>
# **productListProducts**
> ProductListProductsResponse productListProducts(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListProductsRequest body = new ProductListProductsRequest(); // ProductListProductsRequest | 
    try {
      ProductListProductsResponse result = apiInstance.productListProducts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductListProductsRequest**](ProductListProductsRequest.md)|  | |

### Return type

[**ProductListProductsResponse**](ProductListProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListProductsByIds"></a>
# **productListProductsByIds**
> ProductListProductsByIdsResponse productListProductsByIds(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListProductsByIdsRequest body = new ProductListProductsByIdsRequest(); // ProductListProductsByIdsRequest | 
    try {
      ProductListProductsByIdsResponse result = apiInstance.productListProductsByIds(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListProductsByIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductListProductsByIdsRequest**](ProductListProductsByIdsRequest.md)|  | |

### Return type

[**ProductListProductsByIdsResponse**](ProductListProductsByIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListProductsBySku"></a>
# **productListProductsBySku**
> ProductListProductsBySkuResponse productListProductsBySku(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListProductsBySkuRequest body = new ProductListProductsBySkuRequest(); // ProductListProductsBySkuRequest | 
    try {
      ProductListProductsBySkuResponse result = apiInstance.productListProductsBySku(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListProductsBySku");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductListProductsBySkuRequest**](ProductListProductsBySkuRequest.md)|  | |

### Return type

[**ProductListProductsBySkuResponse**](ProductListProductsBySkuResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productListVariantsBySku"></a>
# **productListVariantsBySku**
> ProductListVariantsBySkuResponse productListVariantsBySku(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListVariantsBySkuRequest body = new ProductListVariantsBySkuRequest(); // ProductListVariantsBySkuRequest | 
    try {
      ProductListVariantsBySkuResponse result = apiInstance.productListVariantsBySku(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productListVariantsBySku");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductListVariantsBySkuRequest**](ProductListVariantsBySkuRequest.md)|  | |

### Return type

[**ProductListVariantsBySkuResponse**](ProductListVariantsBySkuResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productRemoveMediaGalleryEntry"></a>
# **productRemoveMediaGalleryEntry**
> Object productRemoveMediaGalleryEntry(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductRemoveMediaGalleryEntryRequest body = new ProductRemoveMediaGalleryEntryRequest(); // ProductRemoveMediaGalleryEntryRequest | 
    try {
      Object result = apiInstance.productRemoveMediaGalleryEntry(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productRemoveMediaGalleryEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductRemoveMediaGalleryEntryRequest**](ProductRemoveMediaGalleryEntryRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productUpdateAttribute"></a>
# **productUpdateAttribute**
> EntitymanagerAttribute productUpdateAttribute(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerUpdateAttributeRequest body = new EntitymanagerUpdateAttributeRequest(); // EntitymanagerUpdateAttributeRequest | 
    try {
      EntitymanagerAttribute result = apiInstance.productUpdateAttribute(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productUpdateAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerUpdateAttributeRequest**](EntitymanagerUpdateAttributeRequest.md)|  | |

### Return type

[**EntitymanagerAttribute**](EntitymanagerAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productUpdateAttributeGroup"></a>
# **productUpdateAttributeGroup**
> EntitymanagerAttributeGroup productUpdateAttributeGroup(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerUpdateAttributeGroupRequest body = new EntitymanagerUpdateAttributeGroupRequest(); // EntitymanagerUpdateAttributeGroupRequest | 
    try {
      EntitymanagerAttributeGroup result = apiInstance.productUpdateAttributeGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productUpdateAttributeGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerUpdateAttributeGroupRequest**](EntitymanagerUpdateAttributeGroupRequest.md)|  | |

### Return type

[**EntitymanagerAttributeGroup**](EntitymanagerAttributeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productUpdateAttributeOptions"></a>
# **productUpdateAttributeOptions**
> EntitymanagerUpdateAttributeOptionsResponse productUpdateAttributeOptions(body)

rpc GetAttributeOptionByCode (product.entitymanager.GetAttributeOptionByCodeRequest) returns (product.entitymanager.GetAttributeOptionByCodeResponse) {}

### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerUpdateAttributeOptionsRequest body = new EntitymanagerUpdateAttributeOptionsRequest(); // EntitymanagerUpdateAttributeOptionsRequest | 
    try {
      EntitymanagerUpdateAttributeOptionsResponse result = apiInstance.productUpdateAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productUpdateAttributeOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerUpdateAttributeOptionsRequest**](EntitymanagerUpdateAttributeOptionsRequest.md)|  | |

### Return type

[**EntitymanagerUpdateAttributeOptionsResponse**](EntitymanagerUpdateAttributeOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productUpdateMediaGalleryEntry"></a>
# **productUpdateMediaGalleryEntry**
> Object productUpdateMediaGalleryEntry(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductUpdateMediaGalleryEntryRequest body = new ProductUpdateMediaGalleryEntryRequest(); // ProductUpdateMediaGalleryEntryRequest | 
    try {
      Object result = apiInstance.productUpdateMediaGalleryEntry(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productUpdateMediaGalleryEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductUpdateMediaGalleryEntryRequest**](ProductUpdateMediaGalleryEntryRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productUpdateOptionsList"></a>
# **productUpdateOptionsList**
> EntitymanagerUpdateOptionsListResponse productUpdateOptionsList(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerUpdateOptionsListRequest body = new EntitymanagerUpdateOptionsListRequest(); // EntitymanagerUpdateOptionsListRequest | 
    try {
      EntitymanagerUpdateOptionsListResponse result = apiInstance.productUpdateOptionsList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productUpdateOptionsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**EntitymanagerUpdateOptionsListRequest**](EntitymanagerUpdateOptionsListRequest.md)|  | |

### Return type

[**EntitymanagerUpdateOptionsListResponse**](EntitymanagerUpdateOptionsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productUpdateProduct"></a>
# **productUpdateProduct**
> ProductUpdateProductResponse productUpdateProduct(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductUpdateProductRequest body = new ProductUpdateProductRequest(); // ProductUpdateProductRequest | 
    try {
      ProductUpdateProductResponse result = apiInstance.productUpdateProduct(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productUpdateProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductUpdateProductRequest**](ProductUpdateProductRequest.md)|  | |

### Return type

[**ProductUpdateProductResponse**](ProductUpdateProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productUpdateProductV2"></a>
# **productUpdateProductV2**
> Object productUpdateProductV2(body)



### Example
```java
// Import classes:
import GeminiCommerce_Product.ApiClient;
import GeminiCommerce_Product.ApiException;
import GeminiCommerce_Product.Configuration;
import GeminiCommerce_Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductUpdateProductRequestV2 body = new ProductUpdateProductRequestV2(); // ProductUpdateProductRequestV2 | 
    try {
      Object result = apiInstance.productUpdateProductV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#productUpdateProductV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductUpdateProductRequestV2**](ProductUpdateProductRequestV2.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

