

# AnalyticResults


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**warningLevel** | **List&lt;Integer&gt;** | Amber warning level at each sample, a measure of the compliance of recent behavior compared to behavior observed during &#x60;Learning&#x60;. This value is derived from &#x60;recentAnomalies&#x60; and a statistical model of expectations about the usual frequency of anomalies. - &#x60;0&#x60;: OK - &#x60;1&#x60;: asset changing - &#x60;2&#x60;: asset critical |  [optional] |
|**recentAnomalies** | **List&lt;Integer&gt;** | The number of anomalous patterns in the last &#x60;historyWindow&#x60; samples. Specifically, this is a moving-window sum of the &#x60;anomalyDetection&#x60; array with window length &#x60;historyWindow&#x60;. |  [optional] |
|**anomalyDetection** | **List&lt;Integer&gt;** | A binary array where 1 means a pattern was anomalous and 0 means normal. This value is derived by thresholding the &#x60;anomalyIndex&#x60;. |  [optional] |
|**anomalyIndex** | **List&lt;Integer&gt;** | An integer between 0 and 1000 giving a measure of how anomalous this pattern is compared to patterns seen in the past. Values closer to 0 represent patterns which are ordinary given the data seen so far on this model, while values closer to 1000 represent anomalous patterns. Patterns with a high &#x60;anomalyIndex&#x60; belong to clusters with relatively few patterns compared to the other clusters. |  [optional] |
|**clusterId** | **List&lt;Integer&gt;** | The cluster to which each input pattern was assigned. The first pattern is assigned a &#x60;clusterId&#x60; of 1. Each pattern thereafter is either assigned to an existing cluster (if its distance from that cluster is less than &#x60;percentVariation&#x60;) or creates a new cluster (if its distance from all clusters exceeds &#x60;percentVariation&#x60;). The &#x60;clusterId&#x60; for each new cluster is the current maximum &#x60;clusterId&#x60; plus one. For example, a model with 10 clusters will have &#x60;clusterIds&#x60; 1-10, and the next new cluster will have &#x60;clusterId&#x60; 11.  During &#x60;Monitoring&#x60;, the cluster model becomes frozen and no new clusters are formed. Patterns which cannot be assigned to any existing cluster will return a negative &#x60;clusterId&#x60;. These &#x60;clusterIds&#x60; start at -1 and decreasing strictly by 1 without repeating (they can be used for blame analysis). |  [optional] |



