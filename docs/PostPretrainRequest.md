

# PostPretrainRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **String** | Data in one of two formats: 1) A flat list of comma-separated values. 2) The string that results from flattening the dataset, packing the values into a byte buffer as float32s (little-endian), and base-64 encoding the buffer.  Datasets which are too large to send in one request may be sent in multiple chunks using the header parameters for chunked uploads (&#x60;txnId&#x60; and &#x60;chunkspec&#x60;).  The total number of data values sent for pretraining must be a multiple of the number of features in the configuration. |  |
|**format** | [**FormatEnum**](#FormatEnum) | Format specifier for &#x60;data&#x60;. |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;csv&quot; |
| B64FLOAT | &quot;b64float&quot; |
| PACKED_FLOAT | &quot;packed-float&quot; |



