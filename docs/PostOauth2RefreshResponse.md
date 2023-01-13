

# PostOauth2RefreshResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idToken** | **String** | Authorization token. Requests to all API endpoints except &#x60;POST /oauth2&#x60; must include a valid token in a header field called &#x60;Authorization&#x60; with value &#x60;Bearer ${idToken}&#x60;. |  [optional] |
|**tokenType** | **String** | Always &#x60;Bearer&#x60;. |  [optional] |
|**expiresIn** | **String** | Number of seconds before &#x60;idToken&#x60; becomes invalid. |  [optional] |
|**refreshToken** | **String** | Can be used to refresh the &#x60;idToken&#x60; when it is nearing expiration. |  [optional] |



