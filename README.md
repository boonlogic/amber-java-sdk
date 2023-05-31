# boonamber

Amber API Server
- API version: 2.0.0

Boon Logic Amber API server


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, set environment variables ```AMBER_TEST_LICENSE_FILE``` and ```AMBER_TEST_LICENSE_ID``` and execute:

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
  <groupId>com.boonlogic</groupId>
  <artifactId>boonamber</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'boonamber' jar has been published to maven central.
    mavenLocal()       // Needed if the 'boonamber' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.boonlogic:boonamber:2.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/boonamber-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.boonamber.ApiException;
import com.boonamber.AmberV2Client;
import com.boonamber.models.*;

public class Example {
  public static void main(String[] args) {
    AmberV2Client amber = new AmberV2Client("default", "~/.Amber.license");
    
    // getVersion
    String modelId = "modelId_example"; 
    try {
      GetVersionResponse result = amber.getVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling getVersion");
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

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](docs/DefaultApi.md#deleteModel) | **DELETE** /models/{modelId} | delete a model
[**getModel**](docs/DefaultApi.md#getModel) | **GET** /models/{modelId} | get model metadata
[**getConfig**](docs/DefaultApi.md#getModelConfig) | **GET** /models/{modelId}/config | get model configuration
[**getDiagnostic**](docs/DefaultApi.md#getModelDiagnostic) | **GET** /models/{modelId}/diagnostic | get the diagnostic of a model
[**getNanoStatus**](docs/DefaultApi.md#getModelNanoStatus) | **GET** /models/{modelId}/status/nano | get current nano status of the model
[**getPretrain**](docs/DefaultApi.md#getModelPretrain) | **GET** /models/{modelId}/pretrain | get pretraining progress
[**getRootCause**](docs/DefaultApi.md#getModelRootCause) | **GET** /models/{modelId}/rootCause | perform root cause analysis
[**getStatus**](docs/DefaultApi.md#getModelStatus) | **GET** /models/{modelId}/status | get current status of the model
[**getModels**](docs/DefaultApi.md#getModels) | **GET** /models | list all models
[**getVersion**](docs/DefaultApi.md#getVersion) | **GET** /version | get version information
[**postModel**](docs/DefaultApi.md#postModel) | **POST** /models | create a model
[**postConfig**](docs/DefaultApi.md#postModelConfig) | **POST** /models/{modelId}/config | configure a model
[**postData**](docs/DefaultApi.md#postModelData) | **POST** /models/{modelId}/data | send data to model and get back results
[**enableLearning**](docs/DefaultApi.md#postModelLearning) | **POST** /models/{modelId}/learning | update model configuration and re-enable learning
[**migrateModel**](docs/DefaultApi.md#postModelMigrate) | **POST** /models/{v1ModelId}/migrate | migrate a v1 sensor to a v2 model
[**postOutage**](docs/DefaultApi.md#postModelOutage) | **POST** /models/{modelId}/outage | call this after a data outage before resuming streaming
[**postPretrain**](docs/DefaultApi.md#postModelPretrain) | **POST** /models/{modelId}/pretrain | pretrain model with an existing dataset
[**putModel**](docs/DefaultApi.md#putModel) | **PUT** /models/{modelId} | update model metadata
[**putData**](docs/DefaultApi.md#putModelData) | **PUT** /models/{modelId}/data | update fusion vector and get back results


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
 - [Model](docs/Model.md)
 - [ModelStatus](docs/ModelStatus.md)
 - [NanoStatus](docs/NanoStatus.md)
 - [PostConfigRequest](docs/PostConfigRequest.md)
 - [PostConfigResponse](docs/PostConfigResponse.md)
 - [PostDataRequest](docs/PostDataRequest.md)
 - [PostDataResponse](docs/PostDataResponse.md)
 - [PostLearningRequest](docs/PostLearningRequest.md)
 - [PostLearningResponse](docs/PostLearningResponse.md)
 - [PostModelCopyRequest](docs/PostModelCopyRequest.md)
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




