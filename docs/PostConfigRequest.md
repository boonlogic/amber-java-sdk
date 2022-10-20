# PostConfigRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**featureCount** | **Integer** | number of features per sample | 
**streamingWindowSize** | **Integer** | streaming window size | 
**features** | [**List&lt;FeatureConfig&gt;**](FeatureConfig.md) |  |  [optional]
**samplesToBuffer** | [**BigDecimal**](BigDecimal.md) | the number of samples to be applied before autotuning begins |  [optional]
**percentVariationOverride** | **Float** | override autotuned percent variation with this value |  [optional]
