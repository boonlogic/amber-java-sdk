

# PutDataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vector** | [**List&lt;FusionFeature&gt;**](FusionFeature.md) | Updates to apply to the current fusion vector. |  |
|**fusionRule** | [**FusionRuleEnum**](#FusionRuleEnum) | If &#x60;submit&#x60;, the fusion vector will be submitted for inference on this request. If &#x60;nosubmit&#x60;, this request will not trigger an inference. |  [optional] |



## Enum: FusionRuleEnum

| Name | Value |
|---- | -----|
| SUBMIT | &quot;submit&quot; |
| NOSUBMIT | &quot;nosubmit&quot; |



