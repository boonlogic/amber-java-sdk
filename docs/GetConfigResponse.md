

# GetConfigResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anomalyHistoryWindow** | **Integer** | the number of samples to use when calculating AH |  [optional] |
|**learningRateNumerator** | **Integer** | enables graduation requirements for learning |  [optional] |
|**learningRateDenominator** | **Integer** | enables graduation requirements for learning |  [optional] |
|**learningMaxClusters** | **Integer** | learning graduation requirement for stopping learning upon reaching this cluster count |  [optional] |
|**learningMaxSamples** | **Integer** | learning graduation requirement for stopping learning after acquiring this many samples |  [optional] |
|**featureCount** | **Integer** | number of features per sample |  |
|**streamingWindowSize** | **Integer** | streaming window size |  |
|**features** | [**List&lt;FeatureConfig&gt;**](FeatureConfig.md) |  |  |
|**percentVariation** | **Float** | the percent variation (for instance, 0.025 gives 2.5% variation) used for clustering |  |
|**samplesToBuffer** | **Integer** | the number of samples to be applied before autotuning begins |  |
|**percentVariationOverride** | **Float** | override autotuned percent variation with this value |  [optional] |



