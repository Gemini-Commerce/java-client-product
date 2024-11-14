# # ProductCreateProductRequest
The CreateProductRequest message is used to create a new product within the system. It contains various fields that allow specifying the details and attributes of the product.

## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** | Represents the ID of the tenant associated with the product.  | [optional]
**entityType**| **String** | Specifies the type of entity for the product.  | [optional]
**entityCode**| **String** | Indicates the code of the entity associated with the product.  | [optional]
**code**| **String** | Represents the unique code or identifier for the product.  | [optional]
**isConfigurable**| **Boolean** | Specifies whether the product has variants or not.  | [optional]
**variantAttributes**| **List<String>** | Contains a list of attributes specific to the product variants.  | [optional] [default to new ArrayList<>()]
**isVirtual**| **Boolean** | Indicates whether the product is virtual or not.  | [optional]
**isGiftcard**| **Boolean** | Specifies whether the product is a gift card or not.  | [optional]
**hasConfigurator**| **Boolean** |   | [optional]
**urlKey**| [**ProductLocalizedText**](ProductLocalizedText.md) |   | [optional]
**maxSaleableQuantity**| **Long** | Specifies the maximum quantity that can be sold for the product in each order.  | [optional]
**mediaVariantAttributes**| **List<String>** |   | [optional] [default to new ArrayList<>()]
**attributes**| [**Map<String, ProtobufAny>**](ProtobufAny.md) | Contains a map of additional attributes associated with the product, where the key is the attribute name and the value is any type of value.  | [optional] [default to new HashMap<>()]
**variants**| [**Map<String, ProductProductVariant>**](ProductProductVariant.md) | Represents a map of product variants associated with the product, where the key is the variant ID or code, and the value is a ProductVariant message.  | [optional] [default to new HashMap<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

