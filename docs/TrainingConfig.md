

# TrainingConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**historyWindow** | **Integer** | Number of past inferences to take into account when computing &#x60;warningLevel&#x60; at a given moment. |  [optional] |
|**bufferingSamples** | **Integer** | Number of data vectors to collect during &#x60;Buffering&#x60;. These samples are used as data for &#x60;Autotuning&#x60;. |  [optional] |
|**learningMaxSamples** | **Integer** | Maximum number of vectors to process during &#x60;Learning&#x60; before transitioning to &#x60;Monitoring&#x60;. |  [optional] |
|**learningMaxClusters** | **Integer** | Maximum number of clusters before model transitions from &#x60;Learning&#x60; to &#x60;Monitoring&#x60;. |  [optional] |
|**learningRateNumerator** | **Integer** | Switch to &#x60;Monitoring&#x60; if there were fewer than &#x60;learningRateNumerator&#x60; new clusters in the last &#x60;learningRateDenominator&#x60; inferences. |  [optional] |
|**learningRateDenominator** | **Integer** | See &#x60;learningRateNumerator&#x60;. |  [optional] |



