# DefaultApi

All URIs are relative to *http://amber.boonlogic.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteModel**](DefaultApi.md#deleteModel) | **DELETE** /models/{modelId} | delete a model |
| [**getModel**](DefaultApi.md#getModel) | **GET** /models/{modelId} | get model metadata |
| [**getModelConfig**](DefaultApi.md#getModelConfig) | **GET** /models/{modelId}/config | get model configuration |
| [**getModelDiagnostic**](DefaultApi.md#getModelDiagnostic) | **GET** /models/{modelId}/diagnostic | get the diagnostic of a model |
| [**getModelNanoStatus**](DefaultApi.md#getModelNanoStatus) | **GET** /models/{modelId}/status/nano | get current nano status of the model |
| [**getModelPretrain**](DefaultApi.md#getModelPretrain) | **GET** /models/{modelId}/pretrain | get pretraining progress |
| [**getModelRootCause**](DefaultApi.md#getModelRootCause) | **GET** /models/{modelId}/rootCause | perform root cause analysis |
| [**getModelStatus**](DefaultApi.md#getModelStatus) | **GET** /models/{modelId}/status | get current status of the model |
| [**getModelSummary**](DefaultApi.md#getModelSummary) | **GET** /models/{modelId}/summary | get the summation of a model |
| [**getModels**](DefaultApi.md#getModels) | **GET** /models | list all models |
| [**getVersion**](DefaultApi.md#getVersion) | **GET** /version | get version information |
| [**postModel**](DefaultApi.md#postModel) | **POST** /models | create a model |
| [**postModelConfig**](DefaultApi.md#postModelConfig) | **POST** /models/{modelId}/config | configure a model |
| [**postModelCopy**](DefaultApi.md#postModelCopy) | **POST** /models/{modelId}/copy | make a copy of a model |
| [**postModelData**](DefaultApi.md#postModelData) | **POST** /models/{modelId}/data | send data to model and get back results |
| [**postModelLearning**](DefaultApi.md#postModelLearning) | **POST** /models/{modelId}/learning | update model configuration and re-enable learning |
| [**postModelMigrate**](DefaultApi.md#postModelMigrate) | **POST** /models/{v1ModelId}/migrate | migrate a v1 sensor to a v2 model |
| [**postModelOutage**](DefaultApi.md#postModelOutage) | **POST** /models/{modelId}/outage | call this after a data outage before resuming streaming |
| [**postModelPretrain**](DefaultApi.md#postModelPretrain) | **POST** /models/{modelId}/pretrain | pretrain model with an existing dataset |
| [**postOauth2Access**](DefaultApi.md#postOauth2Access) | **POST** /oauth2/access | request an API token given license and secret key |
| [**postOauth2Refresh**](DefaultApi.md#postOauth2Refresh) | **POST** /oauth2/refresh | request an API token given a refresh token |
| [**putModel**](DefaultApi.md#putModel) | **PUT** /models/{modelId} | update model metadata |
| [**putModelData**](DefaultApi.md#putModelData) | **PUT** /models/{modelId}/data | update fusion vector and get back results |


<a name="deleteModel"></a>
# **deleteModel**
> DeleteModelResponse deleteModel(modelId)

delete a model

Permanently delete the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      DeleteModelResponse result = apiInstance.deleteModel(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModel"></a>
# **getModel**
> PostModelResponse getModel(modelId)

get model metadata

Return metadata for the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      PostModelResponse result = apiInstance.getModel(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**PostModelResponse**](PostModelResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModelConfig"></a>
# **getModelConfig**
> PostConfigResponse getModelConfig(modelId)

get model configuration

Get the configuration of the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      PostConfigResponse result = apiInstance.getModelConfig(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**PostConfigResponse**](PostConfigResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModelDiagnostic"></a>
# **getModelDiagnostic**
> File getModelDiagnostic(modelId)

get the diagnostic of a model

Get the current diagnostic of the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      File result = apiInstance.getModelDiagnostic(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelDiagnostic");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModelNanoStatus"></a>
# **getModelNanoStatus**
> GetNanoStatusResponse getModelNanoStatus(modelId)

get current nano status of the model

Get the current nano state of the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      GetNanoStatusResponse result = apiInstance.getModelNanoStatus(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelNanoStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**GetNanoStatusResponse**](GetNanoStatusResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModelPretrain"></a>
# **getModelPretrain**
> GetPretrainResponse getModelPretrain(modelId)

get pretraining progress

Get the pretraining status of the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      GetPretrainResponse result = apiInstance.getModelPretrain(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelPretrain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**GetPretrainResponse**](GetPretrainResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Model is not pretraining |  -  |
| **202** | Model is currently pretraining |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModelRootCause"></a>
# **getModelRootCause**
> GetRootCauseResponse getModelRootCause(modelId, clusters, vectors)

perform root cause analysis

Return a measure of the significance of each feature in the creation of a cluster. The values range from 0 to 1 where a relatively high value represents a feature that was influential in creating the new cluster. No conclusions can be drawn from values close to zero. This measure can be computed for existing clusters or for individual vectors directly.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    String clusters = "clusters_example"; // String | Clusters to analyze (list of comma-separated integers).
    String vectors = "vectors_example"; // String | Vectors to analyze, as a flat list of comma-separated floats. Number of values must be a multiple of the configured number of features.
    try {
      GetRootCauseResponse result = apiInstance.getModelRootCause(modelId, clusters, vectors);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelRootCause");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **clusters** | **String**| Clusters to analyze (list of comma-separated integers). | [optional] |
| **vectors** | **String**| Vectors to analyze, as a flat list of comma-separated floats. Number of values must be a multiple of the configured number of features. | [optional] |

### Return type

[**GetRootCauseResponse**](GetRootCauseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModelStatus"></a>
# **getModelStatus**
> GetStatusResponse getModelStatus(modelId)

get current status of the model

Get the current state and learning progress of the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      GetStatusResponse result = apiInstance.getModelStatus(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**GetStatusResponse**](GetStatusResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModelSummary"></a>
# **getModelSummary**
> String getModelSummary(modelId)

get the summation of a model

Get the current summation of the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      String result = apiInstance.getModelSummary(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="getModels"></a>
# **getModels**
> GetModelsResponse getModels()

list all models

Return &#x60;id&#x60; and &#x60;label&#x60; for all models belonging to the user.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      GetModelsResponse result = apiInstance.getModels();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a name="getVersion"></a>
# **getVersion**
> GetVersionResponse getVersion()

get version information

Return version information for the API.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      GetVersionResponse result = apiInstance.getVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetVersionResponse**](GetVersionResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a name="postModel"></a>
# **postModel**
> PostModelResponse postModel(postModelRequest)

create a model

Create a new model and return its unique identifier.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PostModelRequest postModelRequest = new PostModelRequest(); // PostModelRequest | initial metadata for new model
    try {
      PostModelResponse result = apiInstance.postModel(postModelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postModelRequest** | [**PostModelRequest**](PostModelRequest.md)| initial metadata for new model | |

### Return type

[**PostModelResponse**](PostModelResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a name="postModelConfig"></a>
# **postModelConfig**
> PostConfigResponse postModelConfig(modelId, postConfigRequest)

configure a model

Configure the specified model. Wipes all progress and puts the model in the &#x60;Buffering&#x60; state.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    PostConfigRequest postConfigRequest = new PostConfigRequest(); // PostConfigRequest | configuration to apply
    try {
      PostConfigResponse result = apiInstance.postModelConfig(modelId, postConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModelConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **postConfigRequest** | [**PostConfigRequest**](PostConfigRequest.md)| configuration to apply | [optional] |

### Return type

[**PostConfigResponse**](PostConfigResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="postModelCopy"></a>
# **postModelCopy**
> PostModelResponse postModelCopy(modelId, postModelCopyRequest)

make a copy of a model

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    PostModelCopyRequest postModelCopyRequest = new PostModelCopyRequest(); // PostModelCopyRequest | copy request params
    try {
      PostModelResponse result = apiInstance.postModelCopy(modelId, postModelCopyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModelCopy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **postModelCopyRequest** | [**PostModelCopyRequest**](PostModelCopyRequest.md)| copy request params | [optional] |

### Return type

[**PostModelResponse**](PostModelResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="postModelData"></a>
# **postModelData**
> PostDataResponse postModelData(modelId, postDataRequest)

send data to model and get back results

Send data to the specified model, and get back the resulting analytics and model status.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    PostDataRequest postDataRequest = new PostDataRequest(); // PostDataRequest | data vector or vectors as a flattened list of comma-separated values
    try {
      PostDataResponse result = apiInstance.postModelData(modelId, postDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModelData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **postDataRequest** | [**PostDataRequest**](PostDataRequest.md)| data vector or vectors as a flattened list of comma-separated values | |

### Return type

[**PostDataResponse**](PostDataResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="postModelLearning"></a>
# **postModelLearning**
> PostLearningResponse postModelLearning(modelId, postLearningRequest)

update model configuration and re-enable learning

Turns on learning and processes new data into the model

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    PostLearningRequest postLearningRequest = new PostLearningRequest(); // PostLearningRequest | updates to apply
    try {
      PostLearningResponse result = apiInstance.postModelLearning(modelId, postLearningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModelLearning");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **postLearningRequest** | [**PostLearningRequest**](PostLearningRequest.md)| updates to apply | [optional] |

### Return type

[**PostLearningResponse**](PostLearningResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="postModelMigrate"></a>
# **postModelMigrate**
> PostModelResponse postModelMigrate(v1ModelId)

migrate a v1 sensor to a v2 model

migrate a v1 sensor to a v2 model

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String v1ModelId = "v1ModelId_example"; // String | version 1 model id
    try {
      PostModelResponse result = apiInstance.postModelMigrate(v1ModelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModelMigrate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v1ModelId** | **String**| version 1 model id | |

### Return type

[**PostModelResponse**](PostModelResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="postModelOutage"></a>
# **postModelOutage**
> Error postModelOutage(modelId)

call this after a data outage before resuming streaming

Resets the streaming window generated by &#x60;streamingWindow&#x60;. This endpoint should be called after a data outage before resuming streaming.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      Error result = apiInstance.postModelOutage(modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModelOutage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |

### Return type

[**Error**](Error.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="postModelPretrain"></a>
# **postModelPretrain**
> PostPretrainResponse postModelPretrain(modelId, postPretrainRequest, chunkspec, txnId)

pretrain model with an existing dataset

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    PostPretrainRequest postPretrainRequest = new PostPretrainRequest(); // PostPretrainRequest | Data to use for pretraining.
    String chunkspec = "chunkspec_example"; // String | Chunk specifier for chunked uploads. In a chunked upload, each request is sent with a `chunkspec` of the form `1:3`, `2:10`, `7:7`, etc. where the first number is the index for the chunk being uploaded (1-based) and the second number is the total number of chunks in the transaction. The chunks may be uploaded in any order. Pretraining starts once all chunks have been received.
    String txnId = "txnId_example"; // String | Transaction id for chunked uploads. The response body for the first request in a chunked upload will contain a `txnId` which uniquely identifies the chunking transaction across multiple requests. That `txnId` must be included in the header of all remaining chunks uploaded in the transaction.
    try {
      PostPretrainResponse result = apiInstance.postModelPretrain(modelId, postPretrainRequest, chunkspec, txnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postModelPretrain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **postPretrainRequest** | [**PostPretrainRequest**](PostPretrainRequest.md)| Data to use for pretraining. | |
| **chunkspec** | **String**| Chunk specifier for chunked uploads. In a chunked upload, each request is sent with a &#x60;chunkspec&#x60; of the form &#x60;1:3&#x60;, &#x60;2:10&#x60;, &#x60;7:7&#x60;, etc. where the first number is the index for the chunk being uploaded (1-based) and the second number is the total number of chunks in the transaction. The chunks may be uploaded in any order. Pretraining starts once all chunks have been received. | [optional] |
| **txnId** | **String**| Transaction id for chunked uploads. The response body for the first request in a chunked upload will contain a &#x60;txnId&#x60; which uniquely identifies the chunking transaction across multiple requests. That &#x60;txnId&#x60; must be included in the header of all remaining chunks uploaded in the transaction. | [optional] |

### Return type

[**PostPretrainResponse**](PostPretrainResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **202** | Operation was accepted |  * txnId -  <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="postOauth2Access"></a>
# **postOauth2Access**
> PostOauth2AccessResponse postOauth2Access(postOauth2AccessRequest)

request an API token given license and secret key

Request an Oauth2 Bearer token.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PostOauth2AccessRequest postOauth2AccessRequest = new PostOauth2AccessRequest(); // PostOauth2AccessRequest | Amber account credentials
    try {
      PostOauth2AccessResponse result = apiInstance.postOauth2Access(postOauth2AccessRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postOauth2Access");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postOauth2AccessRequest** | [**PostOauth2AccessRequest**](PostOauth2AccessRequest.md)| Amber account credentials | |

### Return type

[**PostOauth2AccessResponse**](PostOauth2AccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a name="postOauth2Refresh"></a>
# **postOauth2Refresh**
> PostOauth2RefreshResponse postOauth2Refresh(postOauth2RefreshRequest)

request an API token given a refresh token

Request an Oauth2 Bearer token.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PostOauth2RefreshRequest postOauth2RefreshRequest = new PostOauth2RefreshRequest(); // PostOauth2RefreshRequest | Amber account credentials
    try {
      PostOauth2RefreshResponse result = apiInstance.postOauth2Refresh(postOauth2RefreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postOauth2Refresh");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postOauth2RefreshRequest** | [**PostOauth2RefreshRequest**](PostOauth2RefreshRequest.md)| Amber account credentials | |

### Return type

[**PostOauth2RefreshResponse**](PostOauth2RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a name="putModel"></a>
# **putModel**
> PostModelResponse putModel(modelId, putModelRequest)

update model metadata

Update metadata for the specified model.

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    PutModelRequest putModelRequest = new PutModelRequest(); // PutModelRequest | updates to apply
    try {
      PostModelResponse result = apiInstance.putModel(modelId, putModelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#putModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **putModelRequest** | [**PutModelRequest**](PutModelRequest.md)| updates to apply | |

### Return type

[**PostModelResponse**](PostModelResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

<a name="putModelData"></a>
# **putModelData**
> PutDataResponse putModelData(modelId, putDataRequest)

update fusion vector and get back results

### Example
```java
// Import classes:
import com.boonamber.ApiClient;
import com.boonamber.ApiException;
import com.boonamber.Configuration;
import com.boonamber.auth.*;
import com.boonamber.models.*;
import com.boonamber.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    PutDataRequest putDataRequest = new PutDataRequest(); // PutDataRequest | updates to the fusion vector
    try {
      PutDataResponse result = apiInstance.putModelData(modelId, putDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#putModelData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**|  | |
| **putDataRequest** | [**PutDataRequest**](PutDataRequest.md)| updates to the fusion vector | |

### Return type

[**PutDataResponse**](PutDataResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vector has been updated and analytics were run. |  -  |
| **202** | Vector has been updated but no analytics were run. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |

