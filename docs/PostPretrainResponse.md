

# PostPretrainResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Pretraining status of the model. One of: &#x60;None&#x60;, &#x60;Chunking&#x60;, &#x60;Pretraining&#x60;, &#x60;Pretrained&#x60;. |  [optional] |
|**message** | **String** | Pretraining status description. |  [optional] |
|**token** | **String** | Transaction token for chunked uploads. |  [optional] |
|**chunkspec** | **String** | Chunk specifier for chunked uploads. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| CHUNKING | &quot;Chunking&quot; |
| PRETRAINING | &quot;Pretraining&quot; |
| PRETRAINED | &quot;Pretrained&quot; |



