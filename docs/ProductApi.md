# ProductApi

All URIs are relative to *https://product.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMediaGalleryEntry**](ProductApi.md#addMediaGalleryEntry) | **POST** /product.Product/AddMediaGalleryEntry | Add Media Gallery Entry |
| [**bulkAddAssetsEntries**](ProductApi.md#bulkAddAssetsEntries) | **POST** /product.Product/BulkAddAssetsEntries | Bulk Add Assets Entries |
| [**bulkDeleteProducts**](ProductApi.md#bulkDeleteProducts) | **POST** /product.Product/BulkDeleteProducts | Bulk Delete Products |
| [**bulkEnhanceProductDataWithAI**](ProductApi.md#bulkEnhanceProductDataWithAI) | **POST** /product.Product/BulkEnhanceProductDataWithAI | Bulk Enhance Product Data With AI |
| [**bulkRemoveAssetsEntries**](ProductApi.md#bulkRemoveAssetsEntries) | **POST** /product.Product/BulkRemoveAssetsEntries | Bulk Remove Assets Entries |
| [**bulkUpdateAssetsEntries**](ProductApi.md#bulkUpdateAssetsEntries) | **POST** /product.Product/BulkUpdateAssetsEntries | Bulk Update Assets Entries |
| [**bulkUpdateV2**](ProductApi.md#bulkUpdateV2) | **POST** /product.Product/BulkUpdateV2 | Bulk Update Products |
| [**createAttributeOptions**](ProductApi.md#createAttributeOptions) | **POST** /product.Product/CreateAttributeOptions | Create Attribute Options |
| [**createEntity**](ProductApi.md#createEntity) | **POST** /product.Product/CreateEntity | Create Entity |
| [**createOptionsList**](ProductApi.md#createOptionsList) | **POST** /product.Product/CreateOptionsList | Create Options List |
| [**createProductWithAI**](ProductApi.md#createProductWithAI) | **POST** /product.Product/CreateProductWithAI | Create Product With AI |
| [**getAttributeOption**](ProductApi.md#getAttributeOption) | **POST** /product.Product/GetAttributeOption | Get Attribute Option |
| [**getAttributeOptions**](ProductApi.md#getAttributeOptions) | **POST** /product.Product/GetAttributeOptions | Get Attribute Options |
| [**getEntity**](ProductApi.md#getEntity) | **POST** /product.Product/GetEntity | Get Entity Details |
| [**getOptionsList**](ProductApi.md#getOptionsList) | **POST** /product.Product/GetOptionsList | Get Options List |
| [**getProduct**](ProductApi.md#getProduct) | **POST** /product.Product/GetProduct | Get Product |
| [**getProductByCode**](ProductApi.md#getProductByCode) | **POST** /product.Product/GetProductByCode | Get Product By Code |
| [**getProductByUrlKey**](ProductApi.md#getProductByUrlKey) | **POST** /product.Product/GetProductByUrlKey | Get Product By Url Key |
| [**getProductDataInReview**](ProductApi.md#getProductDataInReview) | **POST** /product.Product/GetProductDataInReview | Get Product Data In Review |
| [**listAttributeOptions**](ProductApi.md#listAttributeOptions) | **POST** /product.Product/ListAttributeOptions | List Attribute Options |
| [**listEntities**](ProductApi.md#listEntities) | **POST** /product.Product/ListEntities | List Entities |
| [**listOptionsLists**](ProductApi.md#listOptionsLists) | **POST** /product.Product/ListOptionsLists | List Options Lists |
| [**listProducts**](ProductApi.md#listProducts) | **POST** /product.Product/ListProducts | List Products |
| [**listProductsByIds**](ProductApi.md#listProductsByIds) | **POST** /product.Product/ListProductsByIds | List Products By Ids |
| [**listProductsBySku**](ProductApi.md#listProductsBySku) | **POST** /product.Product/ListProductsBySku | List Products By Sku |
| [**listVariantsBySku**](ProductApi.md#listVariantsBySku) | **POST** /product.Product/ListVariantsBySku | List Product Variants By Sku |
| [**productBulkCreateAttribute**](ProductApi.md#productBulkCreateAttribute) | **POST** /product.Product/BulkCreateAttribute |  |
| [**productBulkUpdate**](ProductApi.md#productBulkUpdate) | **POST** /product.Product/BulkUpdate |  |
| [**productCreateAttributeGroup**](ProductApi.md#productCreateAttributeGroup) | **POST** /product.Product/CreateAttributeGroup |  |
| [**productCreateProduct**](ProductApi.md#productCreateProduct) | **POST** /product.Product/CreateProduct |  |
| [**productCreateProductV2**](ProductApi.md#productCreateProductV2) | **POST** /product.Product/CreateProductV2 |  |
| [**productDelete**](ProductApi.md#productDelete) | **POST** /product.Product/Delete |  |
| [**productDeleteAttribute**](ProductApi.md#productDeleteAttribute) | **POST** /product.Product/DeleteAttribute |  |
| [**productDeleteProduct**](ProductApi.md#productDeleteProduct) | **POST** /product.Product/DeleteProduct |  |
| [**productGetAttributeGroup**](ProductApi.md#productGetAttributeGroup) | **POST** /product.Product/GetAttributeGroup |  |
| [**productListAttributeGroups**](ProductApi.md#productListAttributeGroups) | **POST** /product.Product/ListAttributeGroups |  |
| [**productUpdateAttribute**](ProductApi.md#productUpdateAttribute) | **POST** /product.Product/UpdateAttribute |  |
| [**productUpdateAttributeGroup**](ProductApi.md#productUpdateAttributeGroup) | **POST** /product.Product/UpdateAttributeGroup |  |
| [**productUpdateProduct**](ProductApi.md#productUpdateProduct) | **POST** /product.Product/UpdateProduct |  |
| [**productUpdateProductV2**](ProductApi.md#productUpdateProductV2) | **POST** /product.Product/UpdateProductV2 |  |
| [**removeMediaGalleryEntry**](ProductApi.md#removeMediaGalleryEntry) | **POST** /product.Product/RemoveMediaGalleryEntry | Remove Media Gallery Entry |
| [**updateAttributeOptions**](ProductApi.md#updateAttributeOptions) | **POST** /product.Product/UpdateAttributeOptions | Update Attribute Options |
| [**updateDataToBeReviewed**](ProductApi.md#updateDataToBeReviewed) | **POST** /product.Product/GetEnhanceProductDataWithAIStatus | Get Enhance Product Data With AI Status |
| [**updateDataToBeReviewed_0**](ProductApi.md#updateDataToBeReviewed_0) | **POST** /product.Product/UpdateDataToBeReviewed | Update Data To Be Reviewed |
| [**updateMediaGalleryEntry**](ProductApi.md#updateMediaGalleryEntry) | **POST** /product.Product/UpdateMediaGalleryEntry | Update Media Gallery Entry |
| [**updateOptionsList**](ProductApi.md#updateOptionsList) | **POST** /product.Product/UpdateOptionsList | Update Options List |
| [**updateProductWithAI**](ProductApi.md#updateProductWithAI) | **POST** /product.Product/UpdateProductWithAI | Update Product With AI |


<a id="addMediaGalleryEntry"></a>
# **addMediaGalleryEntry**
> ProductAddMediaGalleryEntryResponse addMediaGalleryEntry(body)

Add Media Gallery Entry

The AddMediaGalleryEntry endpoint allows users to add a new media entry to the gallery of a specific product. To make a request to this endpoint, users need to provide the necessary information in the specified format. The request includes the tenant_id to specify the relevant tenant, the product_id to identify the target product, and the asset_grn which represents the globally unique identifier for the media asset being added. Additionally, the position field indicates the desired position of the media entry within the gallery, allowing users to control the order in which the media items are displayed. The metadata field, which is a repeated field, provides the option to include additional metadata associated with the media entry. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductAddMediaGalleryEntryRequest body = new ProductAddMediaGalleryEntryRequest(); // ProductAddMediaGalleryEntryRequest | 
    try {
      ProductAddMediaGalleryEntryResponse result = apiInstance.addMediaGalleryEntry(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addMediaGalleryEntry");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="bulkAddAssetsEntries"></a>
# **bulkAddAssetsEntries**
> ProductBulkAddAssetsEntriesResponse bulkAddAssetsEntries(body)

Bulk Add Assets Entries

The BulkAddAssetsEntries endpoint allows users to add assets. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkAddAssetsEntriesRequest body = new ProductBulkAddAssetsEntriesRequest(); // ProductBulkAddAssetsEntriesRequest | 
    try {
      ProductBulkAddAssetsEntriesResponse result = apiInstance.bulkAddAssetsEntries(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#bulkAddAssetsEntries");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="bulkDeleteProducts"></a>
# **bulkDeleteProducts**
> Object bulkDeleteProducts(body)

Bulk Delete Products

This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkDeleteProductsRequest body = new ProductBulkDeleteProductsRequest(); // ProductBulkDeleteProductsRequest | 
    try {
      Object result = apiInstance.bulkDeleteProducts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#bulkDeleteProducts");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="bulkEnhanceProductDataWithAI"></a>
# **bulkEnhanceProductDataWithAI**
> Object bulkEnhanceProductDataWithAI(body)

Bulk Enhance Product Data With AI

The BulkEnhanceProductDataWithAI endpoint allows users to enhance product data using artificial intelligence (AI) capabilities. By making a request to this endpoint and providing the necessary input data, users can leverage AI algorithms to enrich and optimize product information. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkEnhanceProductDataWithAIRequest body = new ProductBulkEnhanceProductDataWithAIRequest(); // ProductBulkEnhanceProductDataWithAIRequest | 
    try {
      Object result = apiInstance.bulkEnhanceProductDataWithAI(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#bulkEnhanceProductDataWithAI");
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
| **body** | [**ProductBulkEnhanceProductDataWithAIRequest**](ProductBulkEnhanceProductDataWithAIRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="bulkRemoveAssetsEntries"></a>
# **bulkRemoveAssetsEntries**
> Object bulkRemoveAssetsEntries(body)

Bulk Remove Assets Entries

The BulkRemoveAssetsEntries endpoint allows users to remove assets. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkRemoveAssetsEntriesRequest body = new ProductBulkRemoveAssetsEntriesRequest(); // ProductBulkRemoveAssetsEntriesRequest | 
    try {
      Object result = apiInstance.bulkRemoveAssetsEntries(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#bulkRemoveAssetsEntries");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="bulkUpdateAssetsEntries"></a>
# **bulkUpdateAssetsEntries**
> ProductBulkUpdateAssetsEntriesResponse bulkUpdateAssetsEntries(body)

Bulk Update Assets Entries

The BulkUpdateAssetsEntries endpoint allows users to update assets. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkUpdateAssetsEntriesRequest body = new ProductBulkUpdateAssetsEntriesRequest(); // ProductBulkUpdateAssetsEntriesRequest | 
    try {
      ProductBulkUpdateAssetsEntriesResponse result = apiInstance.bulkUpdateAssetsEntries(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#bulkUpdateAssetsEntries");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="bulkUpdateV2"></a>
# **bulkUpdateV2**
> ProductBulkUpdateResponse bulkUpdateV2(body)

Bulk Update Products

Version 2 of bulk updates for product attributes with enhanced payload structure and response format. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductBulkUpdateRequestV2 body = new ProductBulkUpdateRequestV2(); // ProductBulkUpdateRequestV2 | 
    try {
      ProductBulkUpdateResponse result = apiInstance.bulkUpdateV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#bulkUpdateV2");
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

[**ProductBulkUpdateResponse**](ProductBulkUpdateResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createAttributeOptions"></a>
# **createAttributeOptions**
> EntitymanagerCreateAttributeOptionsResponse createAttributeOptions(body)

Create Attribute Options

Create attribute options with specified codes, values, and swatches. Returns created options and any associated errors.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerCreateAttributeOptionsRequest body = new EntitymanagerCreateAttributeOptionsRequest(); // EntitymanagerCreateAttributeOptionsRequest | 
    try {
      EntitymanagerCreateAttributeOptionsResponse result = apiInstance.createAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createAttributeOptions");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createEntity"></a>
# **createEntity**
> EntitymanagerCreateEntityResponse createEntity(body)

Create Entity

The CreateEntity endpoint allows users to define and create a new entity with custom attributes, providing a flexible way to represent and manage different data structures within the system. By making a request to this endpoint, users can create a new entity that serves as an abstraction of a product or any other domain-specific object. This endpoint empowers users to define the specific attributes that compose the entity, such as color, composition, technical details, or any other relevant properties. Utilize the CreateEntity endpoint to dynamically extend and adapt your system&#39;s data model to accommodate diverse business requirements and efficiently manage various types of entities.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerEntity body = new EntitymanagerEntity(); // EntitymanagerEntity | 
    try {
      EntitymanagerCreateEntityResponse result = apiInstance.createEntity(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createEntity");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createOptionsList"></a>
# **createOptionsList**
> EntitymanagerCreateOptionsListResponse createOptionsList(body)

Create Options List

The CreateOptionsList endpoint allows users to create an OptionList, which represents a list of predefined options for assigning to an attribute. By making a request to this endpoint with the provided request format, users can create a new OptionList by specifying the relevant tenant ID and providing the OptionList object containing the predefined options. This functionality facilitates efficient management and assignment of predefined attribute values, ensuring consistency and flexibility within the system.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerCreateOptionsListRequest body = new EntitymanagerCreateOptionsListRequest(); // EntitymanagerCreateOptionsListRequest | 
    try {
      EntitymanagerCreateOptionsListResponse result = apiInstance.createOptionsList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createOptionsList");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createProductWithAI"></a>
# **createProductWithAI**
> ProductCreateProductWithAIResponse createProductWithAI(body)

Create Product With AI

The CreateProductWithAI endpoint allows users to create a new product within the system using artificial intelligence (AI) capabilities. By sending a request to this endpoint and providing the necessary input data, users can leverage AI algorithms to enhance and optimize the product creation process.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductCreateProductWithAIRequest body = new ProductCreateProductWithAIRequest(); // ProductCreateProductWithAIRequest | 
    try {
      ProductCreateProductWithAIResponse result = apiInstance.createProductWithAI(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#createProductWithAI");
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
| **body** | [**ProductCreateProductWithAIRequest**](ProductCreateProductWithAIRequest.md)|  | |

### Return type

[**ProductCreateProductWithAIResponse**](ProductCreateProductWithAIResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getAttributeOption"></a>
# **getAttributeOption**
> EntitymanagerGetAttributeOptionResponse getAttributeOption(body)

Get Attribute Option

Retrieve attribute option details by providing the tenant ID, list code, and option ID. Returns the specified attribute option.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerGetAttributeOptionRequest body = new EntitymanagerGetAttributeOptionRequest(); // EntitymanagerGetAttributeOptionRequest | 
    try {
      EntitymanagerGetAttributeOptionResponse result = apiInstance.getAttributeOption(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAttributeOption");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getAttributeOptions"></a>
# **getAttributeOptions**
> EntitymanagerGetAttributeOptionsResponse getAttributeOptions(body)

Get Attribute Options

Retrieve a list of attribute options based on the provided tenant ID and list code.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerGetAttributeOptionsRequest body = new EntitymanagerGetAttributeOptionsRequest(); // EntitymanagerGetAttributeOptionsRequest | 
    try {
      EntitymanagerGetAttributeOptionsResponse result = apiInstance.getAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAttributeOptions");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getEntity"></a>
# **getEntity**
> EntitymanagerEntity getEntity(body)

Get Entity Details

Retrieve details of an entity by providing the tenant ID and either entity data or entity ID. Returns information including ID, type, code, label, relationships, and attributes.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerEntityRequest body = new EntitymanagerEntityRequest(); // EntitymanagerEntityRequest | 
    try {
      EntitymanagerEntity result = apiInstance.getEntity(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getEntity");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getOptionsList"></a>
# **getOptionsList**
> EntitymanagerGetOptionsListResponse getOptionsList(body)

Get Options List

Retrieve option lists.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerGetOptionsListRequest body = new EntitymanagerGetOptionsListRequest(); // EntitymanagerGetOptionsListRequest | 
    try {
      EntitymanagerGetOptionsListResponse result = apiInstance.getOptionsList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getOptionsList");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProduct"></a>
# **getProduct**
> ProductGetProductResponse getProduct(body)

Get Product

The GetProduct endpoint enables users to retrieve a product from the system. By sending a request to this endpoint, users can retrieve a product by providing its unique identifier.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetProductRequest body = new ProductGetProductRequest(); // ProductGetProductRequest | 
    try {
      ProductGetProductResponse result = apiInstance.getProduct(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProduct");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductByCode"></a>
# **getProductByCode**
> ProductGetProductByCodeResponse getProductByCode(body)

Get Product By Code

The GetProductByCode endpoint enables users to retrieve a product from the system. By sending a request to this endpoint, users can retrieve a product by providing its unique code.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetProductByCodeRequest body = new ProductGetProductByCodeRequest(); // ProductGetProductByCodeRequest | 
    try {
      ProductGetProductByCodeResponse result = apiInstance.getProductByCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductByCode");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductByUrlKey"></a>
# **getProductByUrlKey**
> ProductGetProductByUrlKeyResponse getProductByUrlKey(body)

Get Product By Url Key

The GetProductByUrlKey endpoint enables users to retrieve a product from the system. By sending a request to this endpoint, users can retrieve a product by providing its unique url key.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetProductByUrlKeyRequest body = new ProductGetProductByUrlKeyRequest(); // ProductGetProductByUrlKeyRequest | 
    try {
      ProductGetProductByUrlKeyResponse result = apiInstance.getProductByUrlKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductByUrlKey");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductDataInReview"></a>
# **getProductDataInReview**
> ProductGetProductDataInReviewResponse getProductDataInReview(body)

Get Product Data In Review

The GetProductDataInReview endpoint allows users to retrieve product data that is currently under review. By making a request to this endpoint, users can access detailed information about the product data that is pending approval or review by authorized personnel. This functionality provides transparency and visibility into the product data review process, enabling users to track the status and progress of product data submissions.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetProductDataInReviewRequest body = new ProductGetProductDataInReviewRequest(); // ProductGetProductDataInReviewRequest | 
    try {
      ProductGetProductDataInReviewResponse result = apiInstance.getProductDataInReview(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductDataInReview");
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
| **body** | [**ProductGetProductDataInReviewRequest**](ProductGetProductDataInReviewRequest.md)|  | |

### Return type

[**ProductGetProductDataInReviewResponse**](ProductGetProductDataInReviewResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listAttributeOptions"></a>
# **listAttributeOptions**
> EntitymanagerListAttributeOptionsResponse listAttributeOptions(body)

List Attribute Options

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerListAttributeOptionsRequest body = new EntitymanagerListAttributeOptionsRequest(); // EntitymanagerListAttributeOptionsRequest | 
    try {
      EntitymanagerListAttributeOptionsResponse result = apiInstance.listAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listAttributeOptions");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listEntities"></a>
# **listEntities**
> EntitymanagerListEntitiesResponse listEntities(body)

List Entities

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerListEntitiesRequest body = new EntitymanagerListEntitiesRequest(); // EntitymanagerListEntitiesRequest | 
    try {
      EntitymanagerListEntitiesResponse result = apiInstance.listEntities(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listEntities");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listOptionsLists"></a>
# **listOptionsLists**
> EntitymanagerListOptionsListsResponse listOptionsLists(body)

List Options Lists

The ListOptionsLists endpoint allows users to retrieve a list of OptionLists available in the system. By making a request to this endpoint with the provided request format, users can obtain all the OptionLists associated with the specified tenant. This functionality enables users to access and manage the predefined options available for various attributes within the system. Utilizing the ListOptionsLists endpoint provides a convenient way to retrieve and work with OptionLists, facilitating efficient management of attribute options and ensuring consistency in attribute values throughout the system.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerListOptionsListsRequest body = new EntitymanagerListOptionsListsRequest(); // EntitymanagerListOptionsListsRequest | 
    try {
      EntitymanagerListOptionsListsResponse result = apiInstance.listOptionsLists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listOptionsLists");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listProducts"></a>
# **listProducts**
> ProductListProductsResponse listProducts(body)

List Products

The ListProducts endpoint provides users with the ability to retrieve a filtered list of products based on specific criteria. By including filter parameters in the request, users can customize the response to only include products that meet certain conditions, such as price range, category, availability, or any other relevant attributes. This endpoint empowers users to efficiently narrow down the product selection and retrieve tailored results.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListProductsRequest body = new ProductListProductsRequest(); // ProductListProductsRequest | 
    try {
      ProductListProductsResponse result = apiInstance.listProducts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listProducts");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listProductsByIds"></a>
# **listProductsByIds**
> ProductListProductsByIdsResponse listProductsByIds(body)

List Products By Ids

The ListProductsByIds endpoint allows users to retrieve a list of products based on provided IDs. By making a request to this endpoint and specifying a set of product IDs, users can retrieve detailed information about the corresponding products. This endpoint facilitates efficient retrieval of specific products, enabling applications to display accurate and targeted product information to users.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListProductsByIdsRequest body = new ProductListProductsByIdsRequest(); // ProductListProductsByIdsRequest | 
    try {
      ProductListProductsByIdsResponse result = apiInstance.listProductsByIds(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listProductsByIds");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listProductsBySku"></a>
# **listProductsBySku**
> ProductListProductsBySkuResponse listProductsBySku(body)

List Products By Sku

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListProductsBySkuRequest body = new ProductListProductsBySkuRequest(); // ProductListProductsBySkuRequest | 
    try {
      ProductListProductsBySkuResponse result = apiInstance.listProductsBySku(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listProductsBySku");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listVariantsBySku"></a>
# **listVariantsBySku**
> ProductListVariantsBySkuResponse listVariantsBySku(body)

List Product Variants By Sku

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductListVariantsBySkuRequest body = new ProductListVariantsBySkuRequest(); // ProductListVariantsBySkuRequest | 
    try {
      ProductListVariantsBySkuResponse result = apiInstance.listVariantsBySku(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listVariantsBySku");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productBulkCreateAttribute"></a>
# **productBulkCreateAttribute**
> EntitymanagerBulkCreateAttributeResponse productBulkCreateAttribute(body)



Allow creation of multiple attributes. If any attribute is invalid, an error will be returned with more details, and in the response body, the attributes created will be returned.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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



This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductCreateProductRequest body = new ProductCreateProductRequest(); // ProductCreateProductRequest | The CreateProductRequest message is used to create a new product within the system. It contains various fields that allow specifying the details and attributes of the product.
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
| **body** | [**ProductCreateProductRequest**](ProductCreateProductRequest.md)| The CreateProductRequest message is used to create a new product within the system. It contains various fields that allow specifying the details and attributes of the product. | |

### Return type

[**ProductCreateProductResponse**](ProductCreateProductResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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



### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

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
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="removeMediaGalleryEntry"></a>
# **removeMediaGalleryEntry**
> Object removeMediaGalleryEntry(body)

Remove Media Gallery Entry

The RemoveMediaGalleryEntry endpoint allows users to remove a specific media entry from a product&#39;s gallery. By making a request to this endpoint and providing the tenant ID, product ID, and the unique identifier of the media entry, users can easily manage and update the visual content of a product&#39;s gallery. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductRemoveMediaGalleryEntryRequest body = new ProductRemoveMediaGalleryEntryRequest(); // ProductRemoveMediaGalleryEntryRequest | 
    try {
      Object result = apiInstance.removeMediaGalleryEntry(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#removeMediaGalleryEntry");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateAttributeOptions"></a>
# **updateAttributeOptions**
> EntitymanagerUpdateAttributeOptionsResponse updateAttributeOptions(body)

Update Attribute Options

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerUpdateAttributeOptionsRequest body = new EntitymanagerUpdateAttributeOptionsRequest(); // EntitymanagerUpdateAttributeOptionsRequest | 
    try {
      EntitymanagerUpdateAttributeOptionsResponse result = apiInstance.updateAttributeOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateAttributeOptions");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateDataToBeReviewed"></a>
# **updateDataToBeReviewed**
> ProductGetEnhanceProductDataWithAIStatusResponse updateDataToBeReviewed(body)

Get Enhance Product Data With AI Status

The GetEnhanceProductDataWithAIStatus endpoint allows users to retrieve the status of a product data enhancement process using artificial intelligence (AI) capabilities. By making a request to this endpoint and providing the necessary input data, users can check the progress and completion status of the AI-driven product data enhancement operation. This functionality provides visibility and transparency into the AI processing of product data, enabling users to monitor and track the status of the enhancement process.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductGetEnhanceProductDataWithAIStatusRequest body = new ProductGetEnhanceProductDataWithAIStatusRequest(); // ProductGetEnhanceProductDataWithAIStatusRequest | 
    try {
      ProductGetEnhanceProductDataWithAIStatusResponse result = apiInstance.updateDataToBeReviewed(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateDataToBeReviewed");
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
| **body** | [**ProductGetEnhanceProductDataWithAIStatusRequest**](ProductGetEnhanceProductDataWithAIStatusRequest.md)|  | |

### Return type

[**ProductGetEnhanceProductDataWithAIStatusResponse**](ProductGetEnhanceProductDataWithAIStatusResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateDataToBeReviewed_0"></a>
# **updateDataToBeReviewed_0**
> Object updateDataToBeReviewed_0(body)

Update Data To Be Reviewed

The UpdateDataToBeReviewed endpoint allows users to update product data that is pending review. By sending a request to this endpoint and providing the necessary input data, users can modify and enhance the product information that is currently under review. This functionality enables users to make changes to product data submissions and ensure that the information is accurate and up-to-date before final approval.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductUpdateDataToBeReviewedRequest body = new ProductUpdateDataToBeReviewedRequest(); // ProductUpdateDataToBeReviewedRequest | 
    try {
      Object result = apiInstance.updateDataToBeReviewed_0(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateDataToBeReviewed_0");
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
| **body** | [**ProductUpdateDataToBeReviewedRequest**](ProductUpdateDataToBeReviewedRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateMediaGalleryEntry"></a>
# **updateMediaGalleryEntry**
> Object updateMediaGalleryEntry(body)

Update Media Gallery Entry

The UpdateMediaGalleryEntry endpoint allows users to modify and update a specific media entry within a product&#39;s gallery. By sending a request to this endpoint and providing the necessary information, users can efficiently update the media asset, position, and metadata associated with the entry. This operation is asynchronous and may complete after the response.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductUpdateMediaGalleryEntryRequest body = new ProductUpdateMediaGalleryEntryRequest(); // ProductUpdateMediaGalleryEntryRequest | 
    try {
      Object result = apiInstance.updateMediaGalleryEntry(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateMediaGalleryEntry");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateOptionsList"></a>
# **updateOptionsList**
> EntitymanagerUpdateOptionsListResponse updateOptionsList(body)

Update Options List

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    EntitymanagerUpdateOptionsListRequest body = new EntitymanagerUpdateOptionsListRequest(); // EntitymanagerUpdateOptionsListRequest | 
    try {
      EntitymanagerUpdateOptionsListResponse result = apiInstance.updateOptionsList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateOptionsList");
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateProductWithAI"></a>
# **updateProductWithAI**
> ProductUpdateProductWithAIResponse updateProductWithAI(body)

Update Product With AI

The UpdateProductWithAI endpoint allows users to update an existing product within the system using artificial intelligence (AI) capabilities. By sending a request to this endpoint and providing the necessary input data, users can leverage AI algorithms to enhance and optimize the product update process.

### Example
```java
// Import classes:
import GeminiCommerce.Product.ApiClient;
import GeminiCommerce.Product.ApiException;
import GeminiCommerce.Product.Configuration;
import GeminiCommerce.Product.auth.*;
import GeminiCommerce.Product.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductUpdateProductWithAIRequest body = new ProductUpdateProductWithAIRequest(); // ProductUpdateProductWithAIRequest | 
    try {
      ProductUpdateProductWithAIResponse result = apiInstance.updateProductWithAI(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateProductWithAI");
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
| **body** | [**ProductUpdateProductWithAIRequest**](ProductUpdateProductWithAIRequest.md)|  | |

### Return type

[**ProductUpdateProductWithAIResponse**](ProductUpdateProductWithAIResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

