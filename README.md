# openapi-java-client

Amber API Server
- API version: 2.0.0

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
  <groupId>org.boonamber</groupId>
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
     implementation "org.boonamber:openapi-java-client:2.0.0"
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
import org.boonamber.client.ApiClient;
import org.boonamber.client.ApiException;
import org.boonamber.client.Configuration;
import org.boonamber.client.auth.*;
import org.boonamber.client.models.*;
import org.boonamber.client.api.DefaultApi;

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

## Documentation for API Endpoints

All URIs are relative to *http://amber.boonlogic.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteModel**](docs/DefaultApi.md#deleteModel) | **DELETE** /models/{modelId} | delete a model
*DefaultApi* | [**getModel**](docs/DefaultApi.md#getModel) | **GET** /models/{modelId} | get model metadata
*DefaultApi* | [**getModelConfig**](docs/DefaultApi.md#getModelConfig) | **GET** /models/{modelId}/config | get model configuration
*DefaultApi* | [**getModelDiagnostic**](docs/DefaultApi.md#getModelDiagnostic) | **GET** /models/{modelId}/diagnostic | get the diagnostic of a model
*DefaultApi* | [**getModelNanoStatus**](docs/DefaultApi.md#getModelNanoStatus) | **GET** /models/{modelId}/status/nano | get current nano status of the model
*DefaultApi* | [**getModelPretrain**](docs/DefaultApi.md#getModelPretrain) | **GET** /models/{modelId}/pretrain | get pretraining progress
*DefaultApi* | [**getModelRootCause**](docs/DefaultApi.md#getModelRootCause) | **GET** /models/{modelId}/rootCause | perform root cause analysis
*DefaultApi* | [**getModelStatus**](docs/DefaultApi.md#getModelStatus) | **GET** /models/{modelId}/status | get current status of the model
*DefaultApi* | [**getModelSummary**](docs/DefaultApi.md#getModelSummary) | **GET** /models/{modelId}/summary | get the summation of a model
*DefaultApi* | [**getModels**](docs/DefaultApi.md#getModels) | **GET** /models | list all models
*DefaultApi* | [**getVersion**](docs/DefaultApi.md#getVersion) | **GET** /version | get version information
*DefaultApi* | [**postModel**](docs/DefaultApi.md#postModel) | **POST** /models | create a model
*DefaultApi* | [**postModelConfig**](docs/DefaultApi.md#postModelConfig) | **POST** /models/{modelId}/config | configure a model
*DefaultApi* | [**postModelData**](docs/DefaultApi.md#postModelData) | **POST** /models/{modelId}/data | send data to model and get back results
*DefaultApi* | [**postModelLearning**](docs/DefaultApi.md#postModelLearning) | **POST** /models/{modelId}/learning | update model configuration and re-enable learning
*DefaultApi* | [**postModelMigrate**](docs/DefaultApi.md#postModelMigrate) | **POST** /models/{v1ModelId}/migrate | migrate a v1 sensor to a v2 model
*DefaultApi* | [**postModelOutage**](docs/DefaultApi.md#postModelOutage) | **POST** /models/{modelId}/outage | call this after a data outage before resuming streaming
*DefaultApi* | [**postModelPretrain**](docs/DefaultApi.md#postModelPretrain) | **POST** /models/{modelId}/pretrain | pretrain model with an existing dataset
*DefaultApi* | [**postOauth2Access**](docs/DefaultApi.md#postOauth2Access) | **POST** /oauth2/access | request an API token given license and secret key
*DefaultApi* | [**postOauth2Refresh**](docs/DefaultApi.md#postOauth2Refresh) | **POST** /oauth2/refresh | request an API token given a refresh token
*DefaultApi* | [**putModel**](docs/DefaultApi.md#putModel) | **PUT** /models/{modelId} | update model metadata
*DefaultApi* | [**putModelData**](docs/DefaultApi.md#putModelData) | **PUT** /models/{modelId}/data | update fusion vector and get back results


## Documentation for Models

 - [AmberState](docs/AmberState.md)
 - [AnalyticResults](docs/AnalyticResults.md)
 - [Autotuning](docs/Autotuning.md)
 - [ConfigResponse](docs/ConfigResponse.md)
 - [DeleteModelResponse](docs/DeleteModelResponse.md)
 - [Error](docs/Error.md)
 - [FeatureConfig](docs/FeatureConfig.md)
 - [FeatureConfigResponse](docs/FeatureConfigResponse.md)
 - [FeatureConfigResponseAllOf](docs/FeatureConfigResponseAllOf.md)
 - [FeatureRootCause](docs/FeatureRootCause.md)
 - [FusionFeature](docs/FusionFeature.md)
 - [GetModelsResponse](docs/GetModelsResponse.md)
 - [GetNanoStatusResponse](docs/GetNanoStatusResponse.md)
 - [GetPretrainResponse](docs/GetPretrainResponse.md)
 - [GetRootCauseResponse](docs/GetRootCauseResponse.md)
 - [GetStatusResponse](docs/GetStatusResponse.md)
 - [GetSummaryResponse](docs/GetSummaryResponse.md)
 - [GetVersionResponse](docs/GetVersionResponse.md)
 - [MAP](docs/MAP.md)
 - [MAmberStatus](docs/MAmberStatus.md)
 - [MAutotune](docs/MAutotune.md)
 - [MBufferStats](docs/MBufferStats.md)
 - [MNCP](docs/MNCP.md)
 - [MNano](docs/MNano.md)
 - [MNanoBackend](docs/MNanoBackend.md)
 - [MNanoConfig](docs/MNanoConfig.md)
 - [MPatternMemory](docs/MPatternMemory.md)
 - [MRecentAMs](docs/MRecentAMs.md)
 - [MRecentAnalytics](docs/MRecentAnalytics.md)
 - [MRecentFloats](docs/MRecentFloats.md)
 - [MRecentIDs](docs/MRecentIDs.md)
 - [MRecentSamples](docs/MRecentSamples.md)
 - [MRecentTimes](docs/MRecentTimes.md)
 - [MStreamingParameters](docs/MStreamingParameters.md)
 - [MTraining](docs/MTraining.md)
 - [Model](docs/Model.md)
 - [ModelStatus](docs/ModelStatus.md)
 - [NanoStatus](docs/NanoStatus.md)
 - [PercentVariationResponse](docs/PercentVariationResponse.md)
 - [PostConfigRequest](docs/PostConfigRequest.md)
 - [PostConfigResponse](docs/PostConfigResponse.md)
 - [PostDataRequest](docs/PostDataRequest.md)
 - [PostDataResponse](docs/PostDataResponse.md)
 - [PostLearningRequest](docs/PostLearningRequest.md)
 - [PostLearningResponse](docs/PostLearningResponse.md)
 - [PostModelRequest](docs/PostModelRequest.md)
 - [PostModelResponse](docs/PostModelResponse.md)
 - [PostOauth2AccessRequest](docs/PostOauth2AccessRequest.md)
 - [PostOauth2AccessResponse](docs/PostOauth2AccessResponse.md)
 - [PostOauth2RefreshRequest](docs/PostOauth2RefreshRequest.md)
 - [PostOauth2RefreshResponse](docs/PostOauth2RefreshResponse.md)
 - [PostPretrainRequest](docs/PostPretrainRequest.md)
 - [PostPretrainResponse](docs/PostPretrainResponse.md)
 - [PostPretrainResponseAllOf](docs/PostPretrainResponseAllOf.md)
 - [PretrainStatus](docs/PretrainStatus.md)
 - [PutDataRequest](docs/PutDataRequest.md)
 - [PutDataResponse](docs/PutDataResponse.md)
 - [PutModelRequest](docs/PutModelRequest.md)
 - [TrainingConfig](docs/TrainingConfig.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



