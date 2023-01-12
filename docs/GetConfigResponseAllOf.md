

# GetConfigResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureCount** | **Integer** | number of features per sample |  |
|**streamingWindowSize** | **Integer** | streaming window size |  |
|**features** | [**List&lt;FeatureConfig&gt;**](FeatureConfig.md) |  |  |
|**percentVariation** | **Float** | the percent variation (for instance, 0.025 gives 2.5% variation) used for clustering |  |
|**samplesToBuffer** | **Integer** | the number of samples to be applied before autotuning begins |  |
|**percentVariationOverride** | **Float** | override autotuned percent variation with this value |  [optional] |



