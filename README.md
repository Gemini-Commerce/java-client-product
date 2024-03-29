# openapi-java-client

Product Service
- API version: v1
  - Build date: 2024-02-29T10:49:30.026307733Z[Etc/UTC]

API for managing products


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://product.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductApi* | [**productAddMediaGalleryEntry**](docs/ProductApi.md#productAddMediaGalleryEntry) | **POST** /product.Product/AddMediaGalleryEntry | 
*ProductApi* | [**productBulkAddAssetsEntries**](docs/ProductApi.md#productBulkAddAssetsEntries) | **POST** /product.Product/BulkAddAssetsEntries | Assets endpoints
*ProductApi* | [**productBulkCreateAttribute**](docs/ProductApi.md#productBulkCreateAttribute) | **POST** /product.Product/BulkCreateAttribute | 
*ProductApi* | [**productBulkDeleteProducts**](docs/ProductApi.md#productBulkDeleteProducts) | **POST** /product.Product/BulkDeleteProducts | 
*ProductApi* | [**productBulkRemoveAssetsEntries**](docs/ProductApi.md#productBulkRemoveAssetsEntries) | **POST** /product.Product/BulkRemoveAssetsEntries | 
*ProductApi* | [**productBulkUpdate**](docs/ProductApi.md#productBulkUpdate) | **POST** /product.Product/BulkUpdate | 
*ProductApi* | [**productBulkUpdateAssetsEntries**](docs/ProductApi.md#productBulkUpdateAssetsEntries) | **POST** /product.Product/BulkUpdateAssetsEntries | 
*ProductApi* | [**productBulkUpdateV2**](docs/ProductApi.md#productBulkUpdateV2) | **POST** /product.Product/BulkUpdateV2 | 
*ProductApi* | [**productCreateAttributeGroup**](docs/ProductApi.md#productCreateAttributeGroup) | **POST** /product.Product/CreateAttributeGroup | 
*ProductApi* | [**productCreateAttributeOptions**](docs/ProductApi.md#productCreateAttributeOptions) | **POST** /product.Product/CreateAttributeOptions | 
*ProductApi* | [**productCreateEntity**](docs/ProductApi.md#productCreateEntity) | **POST** /product.Product/CreateEntity | 
*ProductApi* | [**productCreateOptionsList**](docs/ProductApi.md#productCreateOptionsList) | **POST** /product.Product/CreateOptionsList | 
*ProductApi* | [**productCreateProduct**](docs/ProductApi.md#productCreateProduct) | **POST** /product.Product/CreateProduct | 
*ProductApi* | [**productCreateProductV2**](docs/ProductApi.md#productCreateProductV2) | **POST** /product.Product/CreateProductV2 | 
*ProductApi* | [**productDelete**](docs/ProductApi.md#productDelete) | **POST** /product.Product/Delete | 
*ProductApi* | [**productDeleteAttribute**](docs/ProductApi.md#productDeleteAttribute) | **POST** /product.Product/DeleteAttribute | 
*ProductApi* | [**productDeleteProduct**](docs/ProductApi.md#productDeleteProduct) | **POST** /product.Product/DeleteProduct | 
*ProductApi* | [**productGetAttributeGroup**](docs/ProductApi.md#productGetAttributeGroup) | **POST** /product.Product/GetAttributeGroup | 
*ProductApi* | [**productGetAttributeOption**](docs/ProductApi.md#productGetAttributeOption) | **POST** /product.Product/GetAttributeOption | 
*ProductApi* | [**productGetAttributeOptions**](docs/ProductApi.md#productGetAttributeOptions) | **POST** /product.Product/GetAttributeOptions | 
*ProductApi* | [**productGetEntity**](docs/ProductApi.md#productGetEntity) | **POST** /product.Product/GetEntity | 
*ProductApi* | [**productGetOptionsList**](docs/ProductApi.md#productGetOptionsList) | **POST** /product.Product/GetOptionsList | 
*ProductApi* | [**productGetProduct**](docs/ProductApi.md#productGetProduct) | **POST** /product.Product/GetProduct | 
*ProductApi* | [**productGetProductByCode**](docs/ProductApi.md#productGetProductByCode) | **POST** /product.Product/GetProductByCode | 
*ProductApi* | [**productGetProductByUrlKey**](docs/ProductApi.md#productGetProductByUrlKey) | **POST** /product.Product/GetProductByUrlKey | 
*ProductApi* | [**productListAttributeGroups**](docs/ProductApi.md#productListAttributeGroups) | **POST** /product.Product/ListAttributeGroups | Attribute Groups endpoints
*ProductApi* | [**productListAttributeOptions**](docs/ProductApi.md#productListAttributeOptions) | **POST** /product.Product/ListAttributeOptions | 
*ProductApi* | [**productListEntities**](docs/ProductApi.md#productListEntities) | **POST** /product.Product/ListEntities | 
*ProductApi* | [**productListOptionsLists**](docs/ProductApi.md#productListOptionsLists) | **POST** /product.Product/ListOptionsLists | 
*ProductApi* | [**productListProducts**](docs/ProductApi.md#productListProducts) | **POST** /product.Product/ListProducts | 
*ProductApi* | [**productListProductsByIds**](docs/ProductApi.md#productListProductsByIds) | **POST** /product.Product/ListProductsByIds | 
*ProductApi* | [**productListProductsBySku**](docs/ProductApi.md#productListProductsBySku) | **POST** /product.Product/ListProductsBySku | 
*ProductApi* | [**productListVariantsBySku**](docs/ProductApi.md#productListVariantsBySku) | **POST** /product.Product/ListVariantsBySku | 
*ProductApi* | [**productRemoveMediaGalleryEntry**](docs/ProductApi.md#productRemoveMediaGalleryEntry) | **POST** /product.Product/RemoveMediaGalleryEntry | 
*ProductApi* | [**productUpdateAttribute**](docs/ProductApi.md#productUpdateAttribute) | **POST** /product.Product/UpdateAttribute | 
*ProductApi* | [**productUpdateAttributeGroup**](docs/ProductApi.md#productUpdateAttributeGroup) | **POST** /product.Product/UpdateAttributeGroup | 
*ProductApi* | [**productUpdateAttributeOptions**](docs/ProductApi.md#productUpdateAttributeOptions) | **POST** /product.Product/UpdateAttributeOptions | rpc GetAttributeOptionByCode (product.entitymanager.GetAttributeOptionByCodeRequest) returns (product.entitymanager.GetAttributeOptionByCodeResponse) {}
*ProductApi* | [**productUpdateMediaGalleryEntry**](docs/ProductApi.md#productUpdateMediaGalleryEntry) | **POST** /product.Product/UpdateMediaGalleryEntry | 
*ProductApi* | [**productUpdateOptionsList**](docs/ProductApi.md#productUpdateOptionsList) | **POST** /product.Product/UpdateOptionsList | 
*ProductApi* | [**productUpdateProduct**](docs/ProductApi.md#productUpdateProduct) | **POST** /product.Product/UpdateProduct | 
*ProductApi* | [**productUpdateProductV2**](docs/ProductApi.md#productUpdateProductV2) | **POST** /product.Product/UpdateProductV2 | 


## Documentation for Models

 - [BulkUpdateAssetsEntriesRequestUpdateEntity](docs/BulkUpdateAssetsEntriesRequestUpdateEntity.md)
 - [EntitymanagerAttribute](docs/EntitymanagerAttribute.md)
 - [EntitymanagerAttributeGroup](docs/EntitymanagerAttributeGroup.md)
 - [EntitymanagerAttributeOption](docs/EntitymanagerAttributeOption.md)
 - [EntitymanagerAttributeOptionErrors](docs/EntitymanagerAttributeOptionErrors.md)
 - [EntitymanagerAttributeOptionSwatch](docs/EntitymanagerAttributeOptionSwatch.md)
 - [EntitymanagerAttributeWriteError](docs/EntitymanagerAttributeWriteError.md)
 - [EntitymanagerAttributeWriteErrors](docs/EntitymanagerAttributeWriteErrors.md)
 - [EntitymanagerBulkCreateAttributeRequest](docs/EntitymanagerBulkCreateAttributeRequest.md)
 - [EntitymanagerBulkCreateAttributeResponse](docs/EntitymanagerBulkCreateAttributeResponse.md)
 - [EntitymanagerCreateAttributeGroupRequest](docs/EntitymanagerCreateAttributeGroupRequest.md)
 - [EntitymanagerCreateAttributeOptionsRequest](docs/EntitymanagerCreateAttributeOptionsRequest.md)
 - [EntitymanagerCreateAttributeOptionsResponse](docs/EntitymanagerCreateAttributeOptionsResponse.md)
 - [EntitymanagerCreateEntityResponse](docs/EntitymanagerCreateEntityResponse.md)
 - [EntitymanagerCreateOptionsListRequest](docs/EntitymanagerCreateOptionsListRequest.md)
 - [EntitymanagerCreateOptionsListResponse](docs/EntitymanagerCreateOptionsListResponse.md)
 - [EntitymanagerDeleteAttributeRequest](docs/EntitymanagerDeleteAttributeRequest.md)
 - [EntitymanagerEntity](docs/EntitymanagerEntity.md)
 - [EntitymanagerEntityIdentifier](docs/EntitymanagerEntityIdentifier.md)
 - [EntitymanagerEntityRequest](docs/EntitymanagerEntityRequest.md)
 - [EntitymanagerGetAttributeGroupRequest](docs/EntitymanagerGetAttributeGroupRequest.md)
 - [EntitymanagerGetAttributeOptionRequest](docs/EntitymanagerGetAttributeOptionRequest.md)
 - [EntitymanagerGetAttributeOptionResponse](docs/EntitymanagerGetAttributeOptionResponse.md)
 - [EntitymanagerGetAttributeOptionsRequest](docs/EntitymanagerGetAttributeOptionsRequest.md)
 - [EntitymanagerGetAttributeOptionsRequestOption](docs/EntitymanagerGetAttributeOptionsRequestOption.md)
 - [EntitymanagerGetAttributeOptionsResponse](docs/EntitymanagerGetAttributeOptionsResponse.md)
 - [EntitymanagerGetAttributeOptionsResponseOption](docs/EntitymanagerGetAttributeOptionsResponseOption.md)
 - [EntitymanagerGetOptionsListRequest](docs/EntitymanagerGetOptionsListRequest.md)
 - [EntitymanagerGetOptionsListResponse](docs/EntitymanagerGetOptionsListResponse.md)
 - [EntitymanagerListAttributeGroupsRequest](docs/EntitymanagerListAttributeGroupsRequest.md)
 - [EntitymanagerListAttributeGroupsResponse](docs/EntitymanagerListAttributeGroupsResponse.md)
 - [EntitymanagerListAttributeOptionsRequest](docs/EntitymanagerListAttributeOptionsRequest.md)
 - [EntitymanagerListAttributeOptionsResponse](docs/EntitymanagerListAttributeOptionsResponse.md)
 - [EntitymanagerListEntitiesRequest](docs/EntitymanagerListEntitiesRequest.md)
 - [EntitymanagerListEntitiesResponse](docs/EntitymanagerListEntitiesResponse.md)
 - [EntitymanagerListOptionsListsRequest](docs/EntitymanagerListOptionsListsRequest.md)
 - [EntitymanagerListOptionsListsResponse](docs/EntitymanagerListOptionsListsResponse.md)
 - [EntitymanagerOptionsList](docs/EntitymanagerOptionsList.md)
 - [EntitymanagerRenderAs](docs/EntitymanagerRenderAs.md)
 - [EntitymanagerTypes](docs/EntitymanagerTypes.md)
 - [EntitymanagerUpdateAttributeGroupRequest](docs/EntitymanagerUpdateAttributeGroupRequest.md)
 - [EntitymanagerUpdateAttributeGroupRequestPayload](docs/EntitymanagerUpdateAttributeGroupRequestPayload.md)
 - [EntitymanagerUpdateAttributeOptionsRequest](docs/EntitymanagerUpdateAttributeOptionsRequest.md)
 - [EntitymanagerUpdateAttributeOptionsResponse](docs/EntitymanagerUpdateAttributeOptionsResponse.md)
 - [EntitymanagerUpdateAttributeRequest](docs/EntitymanagerUpdateAttributeRequest.md)
 - [EntitymanagerUpdateAttributeRequestPayload](docs/EntitymanagerUpdateAttributeRequestPayload.md)
 - [EntitymanagerUpdateOptionsListRequest](docs/EntitymanagerUpdateOptionsListRequest.md)
 - [EntitymanagerUpdateOptionsListResponse](docs/EntitymanagerUpdateOptionsListResponse.md)
 - [ListProductsRequestFilter](docs/ListProductsRequestFilter.md)
 - [ProductAddMediaGalleryEntryRequest](docs/ProductAddMediaGalleryEntryRequest.md)
 - [ProductAddMediaGalleryEntryResponse](docs/ProductAddMediaGalleryEntryResponse.md)
 - [ProductAssetData](docs/ProductAssetData.md)
 - [ProductAssets](docs/ProductAssets.md)
 - [ProductAssetsEntry](docs/ProductAssetsEntry.md)
 - [ProductAssetsEntryMetadata](docs/ProductAssetsEntryMetadata.md)
 - [ProductAttributeResponseError](docs/ProductAttributeResponseError.md)
 - [ProductBulkAddAssetsEntriesRequest](docs/ProductBulkAddAssetsEntriesRequest.md)
 - [ProductBulkAddAssetsEntriesResponse](docs/ProductBulkAddAssetsEntriesResponse.md)
 - [ProductBulkDeleteProductsRequest](docs/ProductBulkDeleteProductsRequest.md)
 - [ProductBulkRemoveAssetsEntriesRequest](docs/ProductBulkRemoveAssetsEntriesRequest.md)
 - [ProductBulkUpdateAssetsEntriesRequest](docs/ProductBulkUpdateAssetsEntriesRequest.md)
 - [ProductBulkUpdateAssetsEntriesResponse](docs/ProductBulkUpdateAssetsEntriesResponse.md)
 - [ProductBulkUpdateRequest](docs/ProductBulkUpdateRequest.md)
 - [ProductBulkUpdateRequestPayload](docs/ProductBulkUpdateRequestPayload.md)
 - [ProductBulkUpdateRequestV2](docs/ProductBulkUpdateRequestV2.md)
 - [ProductBulkUpdateRequestV2Payload](docs/ProductBulkUpdateRequestV2Payload.md)
 - [ProductBulkUpdateResponse](docs/ProductBulkUpdateResponse.md)
 - [ProductBulkUpdateResponseResponse](docs/ProductBulkUpdateResponseResponse.md)
 - [ProductBulkUpdateResponseV2](docs/ProductBulkUpdateResponseV2.md)
 - [ProductBulkUpdateResponseV2Response](docs/ProductBulkUpdateResponseV2Response.md)
 - [ProductCreateProductRequest](docs/ProductCreateProductRequest.md)
 - [ProductCreateProductRequestV2](docs/ProductCreateProductRequestV2.md)
 - [ProductCreateProductResponse](docs/ProductCreateProductResponse.md)
 - [ProductCreateProductResponseV2](docs/ProductCreateProductResponseV2.md)
 - [ProductDeleteProductRequest](docs/ProductDeleteProductRequest.md)
 - [ProductDeleteRequest](docs/ProductDeleteRequest.md)
 - [ProductDeleteResponse](docs/ProductDeleteResponse.md)
 - [ProductFieldMask](docs/ProductFieldMask.md)
 - [ProductGetProductByCodeRequest](docs/ProductGetProductByCodeRequest.md)
 - [ProductGetProductByCodeResponse](docs/ProductGetProductByCodeResponse.md)
 - [ProductGetProductByUrlKeyRequest](docs/ProductGetProductByUrlKeyRequest.md)
 - [ProductGetProductByUrlKeyResponse](docs/ProductGetProductByUrlKeyResponse.md)
 - [ProductGetProductRequest](docs/ProductGetProductRequest.md)
 - [ProductGetProductResponse](docs/ProductGetProductResponse.md)
 - [ProductListProductsByIdsRequest](docs/ProductListProductsByIdsRequest.md)
 - [ProductListProductsByIdsResponse](docs/ProductListProductsByIdsResponse.md)
 - [ProductListProductsBySkuRequest](docs/ProductListProductsBySkuRequest.md)
 - [ProductListProductsBySkuResponse](docs/ProductListProductsBySkuResponse.md)
 - [ProductListProductsRequest](docs/ProductListProductsRequest.md)
 - [ProductListProductsResponse](docs/ProductListProductsResponse.md)
 - [ProductListVariantsBySkuRequest](docs/ProductListVariantsBySkuRequest.md)
 - [ProductListVariantsBySkuResponse](docs/ProductListVariantsBySkuResponse.md)
 - [ProductLocalizedAsset](docs/ProductLocalizedAsset.md)
 - [ProductLocalizedText](docs/ProductLocalizedText.md)
 - [ProductMediaGallery](docs/ProductMediaGallery.md)
 - [ProductMediaGalleryEntry](docs/ProductMediaGalleryEntry.md)
 - [ProductMediaGalleryEntryMetadata](docs/ProductMediaGalleryEntryMetadata.md)
 - [ProductProductEntity](docs/ProductProductEntity.md)
 - [ProductProductResponseError](docs/ProductProductResponseError.md)
 - [ProductProductVariant](docs/ProductProductVariant.md)
 - [ProductRemoveMediaGalleryEntryRequest](docs/ProductRemoveMediaGalleryEntryRequest.md)
 - [ProductUpdateAssetEntryPayload](docs/ProductUpdateAssetEntryPayload.md)
 - [ProductUpdateMediaGalleryEntryRequest](docs/ProductUpdateMediaGalleryEntryRequest.md)
 - [ProductUpdateProductRequest](docs/ProductUpdateProductRequest.md)
 - [ProductUpdateProductRequestV2](docs/ProductUpdateProductRequestV2.md)
 - [ProductUpdateProductResponse](docs/ProductUpdateProductResponse.md)
 - [ProductentitymanagerLocalizedText](docs/ProductentitymanagerLocalizedText.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com

