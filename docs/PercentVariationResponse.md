

# PercentVariationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **Float** | Granularity of the underlying cluster model used for anomaly detection. This is a number between 0.01 and 0.20 which is the distance threshold used to determine whether a pattern should be assigned to an existing cluster or create a new cluster of its own. All things held equal, a small &#x60;percentVariation&#x60; will segment a dataset into many clusters while a larger &#x60;percentVariation&#x60; will segment the dataset into fewer clusters.  &#x60;percentVariation&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal &#x60;percentVariation&#x60; during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;. |  [optional] |



