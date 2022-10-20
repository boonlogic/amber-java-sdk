# FeatureConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxVal** | **Float** | corresponding maximum value |  [optional]
**minVal** | **Float** | the value that should be considered the minimum value for this feature. This can be set to a value larger than the actual min if you want to treat all value less than that as the same (for instance, to keep a noise spike from having undue influence in the clustering |  [optional]
**weight** | **Integer** | corresponding weight |  [optional]
**label** | **String** | label associated with feature |  [optional]
**submitRule** | [**SubmitRuleEnum**](#SubmitRuleEnum) | policy for submitting sensor fusion vector when this feature is updated. One of \&quot;submit\&quot;, \&quot;nosubmit\&quot; (defaults to \&quot;submit\&quot;) |  [optional]

<a name="SubmitRuleEnum"></a>
## Enum: SubmitRuleEnum
Name | Value
---- | -----
SUBMIT | &quot;submit&quot;
NOSUBMIT | &quot;nosubmit&quot;
