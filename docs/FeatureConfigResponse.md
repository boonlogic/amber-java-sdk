

# FeatureConfigResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier for this feature. Must be unique with respect to other features in the configuration. Regex: &#x60;^[A-Za-z0-9.:_-]{1,1024}$&#x60;. |  [optional] |
|**minValue** | **Float** | Minimum expected value for this feature. &#x60;minValue&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal &#x60;minValue&#x60; during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;. |  [optional] |
|**maxValue** | **Float** | Maximum expected value for this feature. &#x60;maxValue&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal value during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;. |  [optional] |
|**weight** | **Integer** | Weight of this feature relative to others, as an integer between 1 and 1000. |  [optional] |
|**fusionRule** | [**FusionRuleEnum**](#FusionRuleEnum) | Inference policy for the fusion vector when using &#x60;PUT /data&#x60;. If &#x60;submit&#x60;, any &#x60;PUT /data&#x60; request that updates this feature will cause the fusion vector to be submitted for inference. If &#x60;nosubmit&#x60;, updates to this feature will not trigger a fusion vector inference. |  [optional] |
|**fusionTTL** | **Integer** | Number of seconds without an update before this feature&#39;s value is considered invalid. |  [optional] |
|**minMaxDefined** | **Boolean** | Whether &#x60;minValue&#x60; and &#x60;maxValue&#x60; have been set for this feature (through either configuration or autotuning). &#x60;minValue&#x60; and &#x60;maxValue&#x60; are undefined when this field is false. |  [optional] |



## Enum: FusionRuleEnum

| Name | Value |
|---- | -----|
| SUBMIT | &quot;submit&quot; |
| NOSUBMIT | &quot;nosubmit&quot; |


