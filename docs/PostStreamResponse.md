

# PostStreamResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | **String** | state of the sensor, states will be prefixed with a state variable  followed by a colon followed by a message indicating progress.  Possible state variables  are: Not streaming, Buffering, Autotuning, Learning, Learning Complete, Monitoring,  Streaming error,  Autotuning error, Autotuning retry |  |
|**message** | **String** | message to accompany the current state |  |
|**progress** | **Integer** | completion percentage (applies to Buffering and Autotuning states) |  |
|**clusterCount** | **Integer** | current cluster count (applies to Learning and Monitoring states) |  |
|**retryCount** | **Integer** | number of restarts that have happened during autotuning |  |
|**streamingWindowSize** | **Integer** | the current streaming window size that is being used |  |
|**totalInferences** | **Integer** | inferences since the most recent restart |  |
|**ID** | **List&lt;Integer&gt;** |  |  |
|**RI** | **List&lt;Integer&gt;** |  |  |
|**SI** | **List&lt;Integer&gt;** |  |  |
|**AD** | **List&lt;Integer&gt;** |  |  |
|**AH** | **List&lt;Integer&gt;** |  |  |
|**AM** | **List&lt;Float&gt;** |  |  |
|**AW** | **List&lt;Integer&gt;** |  |  |
|**NI** | **List&lt;Integer&gt;** |  |  |
|**NS** | **List&lt;Integer&gt;** |  |  |
|**NW** | **List&lt;Float&gt;** |  |  |
|**OM** | **List&lt;Float&gt;** |  |  |



