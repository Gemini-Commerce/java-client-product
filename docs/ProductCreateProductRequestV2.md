# # ProductCreateProductRequestV2


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   | [optional]
**entityType**| **String** |   | [optional]
**entityCode**| **String** |   | [optional]
**code**| **String** |   | [optional]
**isConfigurable**| **Boolean** |   | [optional]
**variantAttributes**| **List<String>** |   | [optional] [default to new ArrayList<>()]
**isVirtual**| **Boolean** |   | [optional]
**isGiftcard**| **Boolean** |   | [optional]
**hasConfigurator**| **Boolean** |   | [optional]
**urlKey**| [**ProductLocalizedText**](ProductLocalizedText.md) |   | [optional]
**maxSaleableQuantity**| **Long** |   | [optional]
**attributes**| [**Map<String, ProtobufAny>**](ProtobufAny.md) |   | [optional] [default to new HashMap<>()]
**variants**| [**Map<String, ProductProductVariant>**](ProductProductVariant.md) |   | [optional] [default to new HashMap<>()]
**mediaVariantAttributes**| **List<String>** |   | [optional] [default to new ArrayList<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

