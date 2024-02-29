# # ProductUpdateProductRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   | [optional]
**id**| **String** |   | [optional]
**code**| **String** |   | [optional]
**attributesMask**| [**ProductFieldMask**](ProductFieldMask.md) |   | [optional]
**urlKey**| [**ProductLocalizedText**](ProductLocalizedText.md) |   | [optional]
**maxSaleableQuantity**| **Long** |   | [optional]
**mediaVariantAttributes**| **List<String>** |   | [optional]
**attributes**| [**Map<String, ProtobufAny>**](ProtobufAny.md) |   | [optional] [default to new HashMap<>()]
**variants**| [**Map<String, ProductProductVariant>**](ProductProductVariant.md) |   | [optional] [default to new HashMap<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

