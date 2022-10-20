# PutStreamRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector** | [**List&lt;PutStreamFeature&gt;**](PutStreamFeature.md) |  | 
**submitRule** | [**SubmitRuleEnum**](#SubmitRuleEnum) | Policy for submitting sensor fusion vector on this request, overriding per-feature submit rules in fusion configuration. One of \&quot;default\&quot;, \&quot;submit\&quot;, \&quot;nosubmit\&quot; (defaults to \&quot;default\&quot;). Under \&quot;default\&quot; policy, the per-feature settings of \&quot;submit\&quot; or \&quot;nosubmit\&quot; are used to determine whether this update to the fusion vector triggers an inference. |  [optional]

<a name="SubmitRuleEnum"></a>
## Enum: SubmitRuleEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
SUBMIT | &quot;submit&quot;
NOSUBMIT | &quot;nosubmit&quot;
