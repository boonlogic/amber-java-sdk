# StreamStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | **String** | state of the sensor, states will be prefixed with a state variable  followed by a colon followed by a message indicating progress.  Possible state variables  are: Not streaming, Buffering, Autotuning, Learning, Learning Complete, Monitoring,  Streaming error,  Autotuning error, Autotuning retry | 
**message** | **String** | message to accompany the current state | 
**progress** | [**BigDecimal**](BigDecimal.md) | completion percentage (applies to Buffering and Autotuning states) | 
**clusterCount** | [**BigDecimal**](BigDecimal.md) | current cluster count (applies to Learning and Monitoring states) | 
**retryCount** | [**BigDecimal**](BigDecimal.md) | number of restarts that have happened during autotuning | 
**streamingWindowSize** | [**BigDecimal**](BigDecimal.md) | the current streaming window size that is being used | 
**totalInferences** | [**BigDecimal**](BigDecimal.md) | inferences since the most recent restart | 
