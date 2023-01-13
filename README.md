# openapi-java-client

Amber API Server
- API version: 2.0.0
  - Build date: 2023-01-13T13:40:02.482575-06:00[America/Chicago]

Boon Logic Amber API server


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:2.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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
    defaultClient.setBasePath("http://amber.boonlogic.com/v2");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | 
    try {
      apiInstance.deleteModel(modelId);
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

## Documentation for API Endpoints

All URIs are relative to *http://amber.boonlogic.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteModel**](docs/DefaultApi.md#deleteModel) | **DELETE** /models/{modelId} | delete a model
*DefaultApi* | [**getBlame**](docs/DefaultApi.md#getBlame) | **GET** /models/{modelId}/blame | perform root cause analysis
*DefaultApi* | [**getConfig**](docs/DefaultApi.md#getConfig) | **GET** /models/{modelId}/config | get model configuration
*DefaultApi* | [**getData**](docs/DefaultApi.md#getData) | **GET** /models/{modelId}/data | get the current fusion vector
*DefaultApi* | [**getModel**](docs/DefaultApi.md#getModel) | **GET** /models/{modelId} | get model metadata
*DefaultApi* | [**getModels**](docs/DefaultApi.md#getModels) | **GET** /models | list all models
*DefaultApi* | [**getPretrain**](docs/DefaultApi.md#getPretrain) | **GET** /models/{modelId}/pretrain | get pretraining progress
*DefaultApi* | [**getStatus**](docs/DefaultApi.md#getStatus) | **GET** /models/{modelId}/status | get current status of the model
*DefaultApi* | [**getUsage**](docs/DefaultApi.md#getUsage) | **GET** /models/{modelId}/usage | get model usage metrics
*DefaultApi* | [**getVersion**](docs/DefaultApi.md#getVersion) | **GET** /version | get version information
*DefaultApi* | [**postConfig**](docs/DefaultApi.md#postConfig) | **POST** /models/{modelId}/config | configure a model
*DefaultApi* | [**postData**](docs/DefaultApi.md#postData) | **POST** /models/{modelId}/data | send data to model and get back results
*DefaultApi* | [**postModel**](docs/DefaultApi.md#postModel) | **POST** /models | create a model
*DefaultApi* | [**postOauth2Access**](docs/DefaultApi.md#postOauth2Access) | **POST** /oauth2/access | request an API token given license and secret key
*DefaultApi* | [**postOauth2Refresh**](docs/DefaultApi.md#postOauth2Refresh) | **POST** /oauth2/refresh | request an API token given a refresh token
*DefaultApi* | [**postOutage**](docs/DefaultApi.md#postOutage) | **POST** /models/{modelId}/outage | call this after a data outage before resuming streaming
*DefaultApi* | [**postPretrain**](docs/DefaultApi.md#postPretrain) | **POST** /models/{modelId}/pretrain | pretrain model with an existing dataset
*DefaultApi* | [**putConfig**](docs/DefaultApi.md#putConfig) | **PUT** /models/{modelId}/config | update model configuration
*DefaultApi* | [**putData**](docs/DefaultApi.md#putData) | **PUT** /models/{modelId}/data | update fusion vector and get back results
*DefaultApi* | [**putModel**](docs/DefaultApi.md#putModel) | **PUT** /models/{modelId} | update model metadata


## Documentation for Models

 - [AmberState](docs/AmberState.md)
 - [AnalyticResults](docs/AnalyticResults.md)
 - [Config](docs/Config.md)
 - [ConfigResponse](docs/ConfigResponse.md)
 - [EndpointUsage](docs/EndpointUsage.md)
 - [Error](docs/Error.md)
 - [FeatureBlame](docs/FeatureBlame.md)
 - [FeatureConfig](docs/FeatureConfig.md)
 - [FeatureConfigResponse](docs/FeatureConfigResponse.md)
 - [FeatureConfigResponseAllOf](docs/FeatureConfigResponseAllOf.md)
 - [FusionFeature](docs/FusionFeature.md)
 - [GetDataResponse](docs/GetDataResponse.md)
 - [GetUsageResponse](docs/GetUsageResponse.md)
 - [GetUsageResponseEndpoints](docs/GetUsageResponseEndpoints.md)
 - [Model](docs/Model.md)
 - [ModelStatus](docs/ModelStatus.md)
 - [PercentVariationResponse](docs/PercentVariationResponse.md)
 - [PostDataRequest](docs/PostDataRequest.md)
 - [PostDataResponse](docs/PostDataResponse.md)
 - [PostModelRequest](docs/PostModelRequest.md)
 - [PostOauth2AccessRequest](docs/PostOauth2AccessRequest.md)
 - [PostOauth2AccessResponse](docs/PostOauth2AccessResponse.md)
 - [PostOauth2RefreshRequest](docs/PostOauth2RefreshRequest.md)
 - [PostOauth2RefreshResponse](docs/PostOauth2RefreshResponse.md)
 - [PostPretrainRequest](docs/PostPretrainRequest.md)
 - [PostPretrainResponse](docs/PostPretrainResponse.md)
 - [PostPretrainResponseAllOf](docs/PostPretrainResponseAllOf.md)
 - [PretrainStatus](docs/PretrainStatus.md)
 - [PutConfigRequest](docs/PutConfigRequest.md)
 - [PutDataRequest](docs/PutDataRequest.md)
 - [PutDataResponse](docs/PutDataResponse.md)
 - [PutModelRequest](docs/PutModelRequest.md)
 - [TrainingConfig](docs/TrainingConfig.md)
 - [Version](docs/Version.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



