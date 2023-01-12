# DefaultApi

All URIs are relative to *http://amber.boonlogic.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSensor**](DefaultApi.md#deleteSensor) | **DELETE** /sensor | Delete a sensor instance |
| [**getAmberSummary**](DefaultApi.md#getAmberSummary) | **GET** /__summary | Get the JSON block of the amber image |
| [**getConfig**](DefaultApi.md#getConfig) | **GET** /config | Get the current configuration of a sensor instance |
| [**getPretrain**](DefaultApi.md#getPretrain) | **GET** /pretrain | Get status of pretrain operation |
| [**getRootCause**](DefaultApi.md#getRootCause) | **GET** /rootCause | Get root cause analysis information from a sensor |
| [**getSensor**](DefaultApi.md#getSensor) | **GET** /sensor | Get basic information about a sensor instance |
| [**getSensors**](DefaultApi.md#getSensors) | **GET** /sensors | List all sensors for this user |
| [**getStatus**](DefaultApi.md#getStatus) | **GET** /status | Get analytic information from a sensor |
| [**getVersion**](DefaultApi.md#getVersion) | **GET** /version | Retrieves API version information |
| [**postConfig**](DefaultApi.md#postConfig) | **POST** /config | Apply configuration to a sensor instance |
| [**postOauth2**](DefaultApi.md#postOauth2) | **POST** /oauth2 | Request a bearer token using Amber account credentials |
| [**postOutage**](DefaultApi.md#postOutage) | **POST** /outage | Informs the server of an outage |
| [**postPretrain**](DefaultApi.md#postPretrain) | **POST** /pretrain | Pretrain a sensor using historical data |
| [**postSensor**](DefaultApi.md#postSensor) | **POST** /sensor | Create a new a sensor instance |
| [**postStream**](DefaultApi.md#postStream) | **POST** /stream | Stream data to a sensor |
| [**putConfig**](DefaultApi.md#putConfig) | **PUT** /config | Update configuration for a sensor instance |
| [**putSensor**](DefaultApi.md#putSensor) | **PUT** /sensor | Update label for a sensor instance |
| [**putStream**](DefaultApi.md#putStream) | **PUT** /stream | Stream data to a sensor fusion vector |


<a name="deleteSensor"></a>
# **deleteSensor**
> Error deleteSensor(sensorId)

Delete a sensor instance

Deletes the sensor instance with the specified sensorId.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    try {
      Error result = apiInstance.deleteSensor(sensorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteSensor");
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
| **sensorId** | **String**| Unique identifier for sensor | |

### Return type

[**Error**](Error.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="getAmberSummary"></a>
# **getAmberSummary**
> GetSummaryResponse getAmberSummary(sensorId)

Get the JSON block of the amber image

Returns the json block of the amber sensor

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    try {
      GetSummaryResponse result = apiInstance.getAmberSummary(sensorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAmberSummary");
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
| **sensorId** | **String**| Unique identifier for sensor | |

### Return type

[**GetSummaryResponse**](GetSummaryResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="getConfig"></a>
# **getConfig**
> GetConfigResponse getConfig(sensorId)

Get the current configuration of a sensor instance

Returns the current configuration of the sensor instance specified.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    try {
      GetConfigResponse result = apiInstance.getConfig(sensorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getConfig");
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
| **sensorId** | **String**| Unique identifier for sensor | |

### Return type

[**GetConfigResponse**](GetConfigResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="getPretrain"></a>
# **getPretrain**
> GetPretrainResponse getPretrain(sensorId)

Get status of pretrain operation

Get status of a sensor which is currently pretraining.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    try {
      GetPretrainResponse result = apiInstance.getPretrain(sensorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPretrain");
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
| **sensorId** | **String**| Unique identifier for sensor | |

### Return type

[**GetPretrainResponse**](GetPretrainResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sensor is not pretraining |  -  |
| **202** | Sensor is currently pretraining |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |

<a name="getRootCause"></a>
# **getRootCause**
> List&lt;List&lt;Float&gt;&gt; getRootCause(sensorId, clusterID, pattern)

Get root cause analysis information from a sensor

Returns analytic information on the root cause for the clusters provided.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    String clusterID = "clusterID_example"; // String | An array of cluster IDs
    String pattern = "pattern_example"; // String | Patterns to compare to the nano model for the root cause analysis
    try {
      List<List<Float>> result = apiInstance.getRootCause(sensorId, clusterID, pattern);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRootCause");
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
| **sensorId** | **String**| Unique identifier for sensor | |
| **clusterID** | **String**| An array of cluster IDs | [optional] |
| **pattern** | **String**| Patterns to compare to the nano model for the root cause analysis | [optional] |

### Return type

[**List&lt;List&lt;Float&gt;&gt;**](List.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |

<a name="getSensor"></a>
# **getSensor**
> GetSensorResponse getSensor(sensorId)

Get basic information about a sensor instance

Returns basic information about an existing sensor instance.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    try {
      GetSensorResponse result = apiInstance.getSensor(sensorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSensor");
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
| **sensorId** | **String**| Unique identifier for sensor | |

### Return type

[**GetSensorResponse**](GetSensorResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="getSensors"></a>
# **getSensors**
> List&lt;SensorInstance&gt; getSensors()

List all sensors for this user

Returns a list of all current sensor instances for this user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<SensorInstance> result = apiInstance.getSensors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSensors");
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

[**List&lt;SensorInstance&gt;**](SensorInstance.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="getStatus"></a>
# **getStatus**
> GetStatusResponse getStatus(sensorId)

Get analytic information from a sensor

Returns analytic information derived from data processed by a sensor thus far.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    try {
      GetStatusResponse result = apiInstance.getStatus(sensorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getStatus");
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
| **sensorId** | **String**| Unique identifier for sensor | |

### Return type

[**GetStatusResponse**](GetStatusResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="getVersion"></a>
# **getVersion**
> Version getVersion()

Retrieves API version information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      Version result = apiInstance.getVersion();
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

[**Version**](Version.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success, version information returned |  -  |
| **500** | Internal server error |  -  |

<a name="postConfig"></a>
# **postConfig**
> PostConfigResponse postConfig(sensorId, postConfigRequest)

Apply configuration to a sensor instance

Applies the provided configuration to the sensor instance specified.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    PostConfigRequest postConfigRequest = new PostConfigRequest(); // PostConfigRequest | Sensor configuration to be applied
    try {
      PostConfigResponse result = apiInstance.postConfig(sensorId, postConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postConfig");
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
| **sensorId** | **String**| Unique identifier for sensor | |
| **postConfigRequest** | [**PostConfigRequest**](PostConfigRequest.md)| Sensor configuration to be applied | |

### Return type

[**PostConfigResponse**](PostConfigResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Server busy |  -  |

<a name="postOauth2"></a>
# **postOauth2**
> PostAuth2Response postOauth2(postAuth2Request)

Request a bearer token using Amber account credentials

Requests a bearer token using Amber account credentials. The requested bearer token is returned as the \&quot;id-token\&quot; response attribute. This token is to be used for authenticating API requests throughout a usage session and expires after 60 minutes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PostAuth2Request postAuth2Request = new PostAuth2Request(); // PostAuth2Request | Account credentials to be used for authentication
    try {
      PostAuth2Response result = apiInstance.postOauth2(postAuth2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postOauth2");
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
| **postAuth2Request** | [**PostAuth2Request**](PostAuth2Request.md)| Account credentials to be used for authentication | |

### Return type

[**PostAuth2Response**](PostAuth2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a name="postOutage"></a>
# **postOutage**
> PostOutageResponse postOutage(sensorId)

Informs the server of an outage

Clears the load buffer of streaming window and resets statistics. Returns stream status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    try {
      PostOutageResponse result = apiInstance.postOutage(sensorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postOutage");
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
| **sensorId** | **String**| Unique identifier for sensor | |

### Return type

[**PostOutageResponse**](PostOutageResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="postPretrain"></a>
# **postPretrain**
> PostPretrainResponse postPretrain(sensorId, postPretrainRequest, amberChunk, amberTransaction, pretrainAsync)

Pretrain a sensor using historical data

Pretrains a sensor. Ingoing data should be formatted as a simple string of comma-separated numbers with no spaces.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    PostPretrainRequest postPretrainRequest = new PostPretrainRequest(); // PostPretrainRequest | Data to be streamed to sensor. Should be formatted as a simple string of comma-separated numbers with no spaces (e.g. \"0,0.5,1,1.5,2\").
    String amberChunk = "amberChunk_example"; // String | Specification of chunk, 1:3 2:3 3:3 for example
    String amberTransaction = "amberTransaction_example"; // String | Unique identifier for chunk transactions
    String pretrainAsync = "pretrainAsync_example"; // String | Internal header for async lambda processing
    try {
      PostPretrainResponse result = apiInstance.postPretrain(sensorId, postPretrainRequest, amberChunk, amberTransaction, pretrainAsync);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postPretrain");
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
| **sensorId** | **String**| Unique identifier for sensor | |
| **postPretrainRequest** | [**PostPretrainRequest**](PostPretrainRequest.md)| Data to be streamed to sensor. Should be formatted as a simple string of comma-separated numbers with no spaces (e.g. \&quot;0,0.5,1,1.5,2\&quot;). | |
| **amberChunk** | **String**| Specification of chunk, 1:3 2:3 3:3 for example | [optional] |
| **amberTransaction** | **String**| Unique identifier for chunk transactions | [optional] |
| **pretrainAsync** | **String**| Internal header for async lambda processing | [optional] |

### Return type

[**PostPretrainResponse**](PostPretrainResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **202** | Operation was accepted |  * amberTransaction -  <br>  * pretrain-async -  <br>  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **503** | Server is busy |  -  |

<a name="postSensor"></a>
# **postSensor**
> PostSensorResponse postSensor(postSensorRequest)

Create a new a sensor instance

Spawns a new sensor instance, returning its unique sensorId.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PostSensorRequest postSensorRequest = new PostSensorRequest(); // PostSensorRequest | Label for new sensor instance to be created
    try {
      PostSensorResponse result = apiInstance.postSensor(postSensorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postSensor");
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
| **postSensorRequest** | [**PostSensorRequest**](PostSensorRequest.md)| Label for new sensor instance to be created | |

### Return type

[**PostSensorResponse**](PostSensorResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="postStream"></a>
# **postStream**
> PostStreamResponse postStream(sensorId, postStreamRequest)

Stream data to a sensor

Sends data to a sensor. Ingoing data should be formatted as a simple string of comma-separated numbers with no spaces.  The following analytic results are returned: - state : sensor state as of this call (one of: \&quot;Buffering\&quot;, \&quot;Autotuning\&quot;, \&quot;Learning\&quot;, \&quot;Monitoring\&quot;, \&quot;Error\&quot;) - ID : array of cluster IDs. These correspond one-to-one with input samples, indicating the cluster to which each input pattern was assigned. - RI : array of values ranging from 0 to 1000 that give a gauge as to how uncommon the sample&#39;s cluster is. - SI : array of smoothed anomaly index values. These values correspond one-to-one with the input samples and range between 0 and 1000. Values closer to 0 represent input patterns which are ordinary given the data seen so far on this sensor. Values closer to 1000 represent novel patterns which are anomalous with respect to data seen before. - AD : array of 0&#39;s and 1&#39;s as anomaly detection indicators. These correspond one-to-one with input samples and are produced by thresholding the smoothed anomaly index (SI). The threshold is determined automatically from the SI values. A value of 0 indicates that the SI has not exceeded the anomaly detection threshold. A value of 1 indicates it has, signaling an anomaly at the corresponding input sample. - AH : array of anomaly history values. These values are a moving-window sum of the AD, giving the number of anomaly detections (1&#39;s) present in the AD signal over a \&quot;recent history\&quot; window whose length is the buffer size. - AM : array of Amber Metric values. These are floating-point values between 0.0 and 1.0 indicating the extent to which the AH contains an unusually high number of anomalies in recent history. The values are derived statistically from a Poisson model, with values close to 0.0 signaling a lower, and values close to 1.0 signaling a higher, frequency of anomalies than usual. - AW : array of Amber Warning Level values. This index is produced by thresholding the Amber Metric (AM) and takes on the values 0, 1 or 2 representing a discrete \&quot;warning level\&quot; for an asset based on the frequency of anomalies within recent history. 0 &#x3D; normal, 1 &#x3D; asset changing, 2 &#x3D; asset critical. The default thresholds for the two warning levels are the standard statistical values of 0.95 (outlier, asset chaing) and 0.997 (extreme outlier, asset critical). - NI : array of values ranging from 0 to 1000 to give a rating for unseen clusters on how new the data points are compared the the rest of the model&#39;s clusters. - NS : array of values ranging from 0 to 1000 that is a weighted average of the time series of NI. - NW : an array of NS values that are normalized to range from 0 to 2. - OM : an array of floats signifying roughly the operational mode that the state is in based on a sliding window average cluster ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    PostStreamRequest postStreamRequest = new PostStreamRequest(); // PostStreamRequest | Data to be streamed to sensor. Should be formatted as a simple string of comma-separated numbers with no spaces (e.g. \"0,0.5,1,1.5,2\").
    try {
      PostStreamResponse result = apiInstance.postStream(sensorId, postStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postStream");
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
| **sensorId** | **String**| Unique identifier for sensor | |
| **postStreamRequest** | [**PostStreamRequest**](PostStreamRequest.md)| Data to be streamed to sensor. Should be formatted as a simple string of comma-separated numbers with no spaces (e.g. \&quot;0,0.5,1,1.5,2\&quot;). | |

### Return type

[**PostStreamResponse**](PostStreamResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Server busy |  -  |

<a name="putConfig"></a>
# **putConfig**
> PutConfigResponse putConfig(sensorId, putConfigRequest)

Update configuration for a sensor instance

Updates the configuration for the sensor instance specified.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    PutConfigRequest putConfigRequest = new PutConfigRequest(); // PutConfigRequest | Updates to sensor configuration
    try {
      PutConfigResponse result = apiInstance.putConfig(sensorId, putConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#putConfig");
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
| **sensorId** | **String**| Unique identifier for sensor | |
| **putConfigRequest** | [**PutConfigRequest**](PutConfigRequest.md)| Updates to sensor configuration | |

### Return type

[**PutConfigResponse**](PutConfigResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Server busy |  -  |

<a name="putSensor"></a>
# **putSensor**
> PutSensorResponse putSensor(sensorId, putSensorRequest)

Update label for a sensor instance

Changes the label of an existing sensor instance to the new label specified.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    PutSensorRequest putSensorRequest = new PutSensorRequest(); // PutSensorRequest | New label to apply to sensor instance
    try {
      PutSensorResponse result = apiInstance.putSensor(sensorId, putSensorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#putSensor");
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
| **sensorId** | **String**| Unique identifier for sensor | |
| **putSensorRequest** | [**PutSensorRequest**](PutSensorRequest.md)| New label to apply to sensor instance | |

### Return type

[**PutSensorResponse**](PutSensorResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation was successful |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |

<a name="putStream"></a>
# **putStream**
> PutStreamResponse putStream(sensorId, putStreamRequest)

Stream data to a sensor fusion vector

Update fusion vector with new values for the given features, and optionally submit to Amber. Analytic results returned are the same as POST /stream.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://amber.boonlogic.com/v1");
    
    // Configure API key authorization: authorize-amber-pool
    ApiKeyAuth authorize-amber-pool = (ApiKeyAuth) defaultClient.getAuthentication("authorize-amber-pool");
    authorize-amber-pool.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authorize-amber-pool.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sensorId = "sensorId_example"; // String | Unique identifier for sensor
    PutStreamRequest putStreamRequest = new PutStreamRequest(); // PutStreamRequest | New values for sensor fusion vector.
    try {
      PutStreamResponse result = apiInstance.putStream(sensorId, putStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#putStream");
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
| **sensorId** | **String**| Unique identifier for sensor | |
| **putStreamRequest** | [**PutStreamRequest**](PutStreamRequest.md)| New values for sensor fusion vector. | |

### Return type

[**PutStreamResponse**](PutStreamResponse.md)

### Authorization

[authorize-amber-pool](../README.md#authorize-amber-pool)

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
| **404** | The specified resource was not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Server busy |  -  |

