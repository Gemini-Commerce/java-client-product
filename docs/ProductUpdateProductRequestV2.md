# # ProductUpdateProductRequestV2


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   | [optional]
**id**| **String** |   | [optional]
**code**| **String** |   | [optional]
**attributesMask**| [**ProductFieldMask**](ProductFieldMask.md) |   | [optional]
**urlKey**| [**ProductLocalizedText**](ProductLocalizedText.md) |   | [optional]
**maxSaleableQuantity**| **Long** |   | [optional]
**attributes**| [**Map<String, ProtobufAny>**](ProtobufAny.md) |   | [optional] [default to new HashMap<>()]
**variants**| [**Map<String, ProductProductVariant>**](ProductProductVariant.md) |   | [optional] [default to new HashMap<>()]
**mediaVariantAttributes**| **List<String>** |   | [optional] [default to new ArrayList<>()]
**inReview**| **Boolean** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

