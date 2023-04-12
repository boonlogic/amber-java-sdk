

# PostConfigRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streamingWindow** | **Integer** | Number of recent input _vectors_ concatenated together to make up a full input _pattern_ presented to the model for inference.  Let &#x60;featureCount&#x60; be the configured number of features. The model consumes data sequentially in steps of size &#x60;featureCount&#x60;. Each time it receives &#x60;featureCount&#x60; data values, &#x60;featureCount&#x60; input values are consumed and concatenated together to form an input _vector_. This input vector is then concatenated with zero or more past input vectors to form an input _pattern_. The input _pattern_ is the true data vector inferenced by the model at each step. Configuring the &#x60;streamingWindow&#x60; greater than 1 allows a model to identify patterns in vectors that change over time.  If monitoring a single timeseries signal, the model should be configured with just one feature. In that case the input vector has length 1, and &#x60;streamingWindow&#x60; determines the length of a moving window over past samples which is the input pattern to the model for each new sample. For example, a model configured with one feature and a &#x60;streamingWindow&#x60; of 25 will concatenate together and inference the 25 most recent data values for each new value consumed.  If monitoring instantaneous readings from several sensors jointly, each sensor should be associated with one feature in the configuration. In this case &#x60;streamingWindow&#x60; is usually set to 1 so that the input pattern is just the current vector of readings. For example, a model configured with 5 features and a &#x60;streamingWindow&#x60; of 1 will consume 5 values at a time and inference those 5 values as a pattern of length 5. If the &#x60;streamingWindow&#x60; were 2, the model would still consume 5 values at a time, but its input pattern would contain the last 10 samples. |  |
|**percentVariation** | **Float** | Granularity of the underlying cluster model used for anomaly detection. This is a number between 0.01 and 0.20 which is the distance threshold used to determine whether a pattern should be assigned to an existing cluster or create a new cluster of its own. All things held equal, a small &#x60;percentVariation&#x60; will segment a dataset into many clusters while a larger &#x60;percentVariation&#x60; will segment the dataset into fewer clusters.  &#x60;percentVariation&#x60; can be left unset if it is not known at configuration time. In that case, data collected during the &#x60;Buffering&#x60; stage will be used to infer an optimal &#x60;percentVariation&#x60; during the &#x60;Autotuning&#x60; stage and it will be set to the autotuned value at the start of &#x60;Learning&#x60;. |  [optional] |
|**features** | [**List&lt;FeatureConfig&gt;**](FeatureConfig.md) |  |  |
|**training** | [**TrainingConfig**](TrainingConfig.md) |  |  [optional] |
|**autotuning** | [**Autotuning**](Autotuning.md) |  |  [optional] |



