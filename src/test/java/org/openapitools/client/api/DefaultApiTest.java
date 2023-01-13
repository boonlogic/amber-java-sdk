/*
 * Amber API Server
 * Boon Logic Amber API Server
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.GetConfigResponse;
import org.openapitools.client.model.GetPretrainResponse;
import org.openapitools.client.model.GetSensorResponse;
import org.openapitools.client.model.GetStatusResponse;
import org.openapitools.client.model.GetSummaryResponse;
import org.openapitools.client.model.PostAuth2Request;
import org.openapitools.client.model.PostAuth2Response;
import org.openapitools.client.model.PostConfigRequest;
import org.openapitools.client.model.PostConfigResponse;
import org.openapitools.client.model.PostOutageResponse;
import org.openapitools.client.model.PostPretrainRequest;
import org.openapitools.client.model.PostPretrainResponse;
import org.openapitools.client.model.PostSensorRequest;
import org.openapitools.client.model.PostSensorResponse;
import org.openapitools.client.model.PostStreamRequest;
import org.openapitools.client.model.PostStreamResponse;
import org.openapitools.client.model.PutConfigRequest;
import org.openapitools.client.model.PutConfigResponse;
import org.openapitools.client.model.PutSensorRequest;
import org.openapitools.client.model.PutSensorResponse;
import org.openapitools.client.model.PutStreamRequest;
import org.openapitools.client.model.PutStreamResponse;
import org.openapitools.client.model.SensorInstance;
import org.openapitools.client.model.Version;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;
    
    public DefaultApiTest() {
    	try {
    		this.api = new DefaultApi("default", "/Users/elise/.Amber.license");
    	} catch(Exception e) {
    		System.out.println(e);
    	}
    }

    /**
     * Delete a sensor instance
     *
     * Deletes the sensor instance with the specified sensorId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSensorTest() throws ApiException {
        String sensorId = null;
        // TODO: test validations
        Assertions.assertThrows(ApiException.class, () -> {
        	api.deleteSensor(sensorId);
        	}, "deleteSensor accepted null sensorID");
    }

    /**
     * Get the JSON block of the amber image
     *
     * Returns the json block of the amber sensor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAmberSummaryTest() throws ApiException {
        String sensorId = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getAmberSummary(sensorId);
        	}, "getAmberSummary accepted null sensorID");
        // GetSummaryResponse response = api.getAmberSummary(sensorId);
        // TODO: test validations
    }

    /**
     * Get the current configuration of a sensor instance
     *
     * Returns the current configuration of the sensor instance specified.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        String sensorId = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getConfig(sensorId);
        	}, "getConfig accepted null sensorID");
        // GetConfigResponse response = api.getConfig(sensorId);
        // TODO: test validations
    }

    /**
     * Get status of pretrain operation
     *
     * Get status of a sensor which is currently pretraining.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPretrainTest() throws ApiException {
        String sensorId = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getPretrain(sensorId);
        	}, "getPretrain accepted null sensorID");
        //GetPretrainResponse response = api.getPretrain(sensorId);
        // TODO: test validations
    }

    /**
     * Get root cause analysis information from a sensor
     *
     * Returns analytic information on the root cause for the clusters provided.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRootCauseTest() throws ApiException {
        String sensorId = null;
        String clusterID = null;
        String pattern = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getRootCause(sensorId, clusterID, pattern);
        	}, "getRootCause accepted null sensorID");
        // List<List<Float>> response = api.getRootCause(sensorId, clusterID, pattern);
        // TODO: test validations
    }

    /**
     * Get basic information about a sensor instance
     *
     * Returns basic information about an existing sensor instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSensorTest() throws ApiException {
        String sensorId = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getSensor(sensorId);
        	}, "getSensor accepted null sensorID");
        // GetSensorResponse response = api.getSensor(sensorId);
        // TODO: test validations
    }

    /**
     * List all sensors for this user
     *
     * Returns a list of all current sensor instances for this user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSensorsTest() throws ApiException {
        List<SensorInstance> response = api.getSensors();
        // TODO: test validations
    }

    /**
     * Get analytic information from a sensor
     *
     * Returns analytic information derived from data processed by a sensor thus far.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String sensorId = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.getStatus(sensorId);
        	}, "getStatus accepted null sensorID");
        // GetStatusResponse response = api.getStatus(sensorId);
        // TODO: test validations
    }

    /**
     * Retrieves API version information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVersionTest() throws ApiException {
        Version response = api.getVersion();
        // TODO: test validations
        Assertions.assertNotNull(response.getNanoSecure());
    }

    /**
     * Apply configuration to a sensor instance
     *
     * Applies the provided configuration to the sensor instance specified.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigTest() throws ApiException {
        String sensorId = null;
        PostConfigRequest postConfigRequest = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postConfig(sensorId, postConfigRequest);
        	}, "postConfig accepted null sensorID");
        // PostConfigResponse response = api.postConfig(sensorId, postConfigRequest);
        // TODO: test validations
    }

    /**
     * Request a bearer token using Amber account credentials
     *
     * Requests a bearer token using Amber account credentials. The requested bearer token is returned as the \&quot;id-token\&quot; response attribute. This token is to be used for authenticating API requests throughout a usage session and expires after 60 minutes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postOauth2Test() throws ApiException {
        PostAuth2Request postAuth2Request = null;
        PostAuth2Response response = api.postOauth2(postAuth2Request);
        // TODO: test validations
    }

    /**
     * Informs the server of an outage
     *
     * Clears the load buffer of streaming window and resets statistics. Returns stream status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postOutageTest() throws ApiException {
        String sensorId = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postOutage(sensorId);
        	}, "postOutage accepted null sensorID");
        // PostOutageResponse response = api.postOutage(sensorId);
        // TODO: test validations
    }

    /**
     * Pretrain a sensor using historical data
     *
     * Pretrains a sensor. Ingoing data should be formatted as a simple string of comma-separated numbers with no spaces.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPretrainTest() throws ApiException {
        String sensorId = null;
        PostPretrainRequest postPretrainRequest = null;
        String amberChunk = null;
        String amberTransaction = null;
        String pretrainAsync = null;
        PostPretrainResponse response = api.postPretrain(sensorId, postPretrainRequest, amberChunk, amberTransaction, pretrainAsync);
        // TODO: test validations
    }

    /**
     * Create a new a sensor instance
     *
     * Spawns a new sensor instance, returning its unique sensorId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postSensorTest() throws ApiException {
        PostSensorRequest postSensorRequest = null;
        PostSensorResponse response = api.postSensor(postSensorRequest);
        // TODO: test validations
    }

    /**
     * Stream data to a sensor
     *
     * Sends data to a sensor. Ingoing data should be formatted as a simple string of comma-separated numbers with no spaces.  The following analytic results are returned: - state : sensor state as of this call (one of: \&quot;Buffering\&quot;, \&quot;Autotuning\&quot;, \&quot;Learning\&quot;, \&quot;Monitoring\&quot;, \&quot;Error\&quot;) - ID : array of cluster IDs. These correspond one-to-one with input samples, indicating the cluster to which each input pattern was assigned. - RI : array of values ranging from 0 to 1000 that give a gauge as to how uncommon the sample&#39;s cluster is. - SI : array of smoothed anomaly index values. These values correspond one-to-one with the input samples and range between 0 and 1000. Values closer to 0 represent input patterns which are ordinary given the data seen so far on this sensor. Values closer to 1000 represent novel patterns which are anomalous with respect to data seen before. - AD : array of 0&#39;s and 1&#39;s as anomaly detection indicators. These correspond one-to-one with input samples and are produced by thresholding the smoothed anomaly index (SI). The threshold is determined automatically from the SI values. A value of 0 indicates that the SI has not exceeded the anomaly detection threshold. A value of 1 indicates it has, signaling an anomaly at the corresponding input sample. - AH : array of anomaly history values. These values are a moving-window sum of the AD, giving the number of anomaly detections (1&#39;s) present in the AD signal over a \&quot;recent history\&quot; window whose length is the buffer size. - AM : array of Amber Metric values. These are floating-point values between 0.0 and 1.0 indicating the extent to which the AH contains an unusually high number of anomalies in recent history. The values are derived statistically from a Poisson model, with values close to 0.0 signaling a lower, and values close to 1.0 signaling a higher, frequency of anomalies than usual. - AW : array of Amber Warning Level values. This index is produced by thresholding the Amber Metric (AM) and takes on the values 0, 1 or 2 representing a discrete \&quot;warning level\&quot; for an asset based on the frequency of anomalies within recent history. 0 &#x3D; normal, 1 &#x3D; asset changing, 2 &#x3D; asset critical. The default thresholds for the two warning levels are the standard statistical values of 0.95 (outlier, asset chaing) and 0.997 (extreme outlier, asset critical). - NI : array of values ranging from 0 to 1000 to give a rating for unseen clusters on how new the data points are compared the the rest of the model&#39;s clusters. - NS : array of values ranging from 0 to 1000 that is a weighted average of the time series of NI. - NW : an array of NS values that are normalized to range from 0 to 2. - OM : an array of floats signifying roughly the operational mode that the state is in based on a sliding window average cluster ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postStreamTest() throws ApiException {
        String sensorId = null;
        PostStreamRequest postStreamRequest = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.postStream(sensorId, postStreamRequest);
        	}, "postStream accepted null sensorID");
        // PostStreamResponse response = api.postStream(sensorId, postStreamRequest);
        // TODO: test validations
    }

    /**
     * Update configuration for a sensor instance
     *
     * Updates the configuration for the sensor instance specified.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putConfigTest() throws ApiException {
        String sensorId = null;
        PutConfigRequest putConfigRequest = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.putConfig(sensorId, putConfigRequest);
        	}, "putConfig accepted null sensorID");
        // PutConfigResponse response = api.putConfig(sensorId, putConfigRequest);
        // TODO: test validations
    }

    /**
     * Update label for a sensor instance
     *
     * Changes the label of an existing sensor instance to the new label specified.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putSensorTest() throws ApiException {
        String sensorId = null;
        PutSensorRequest putSensorRequest = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.putSensor(sensorId, putSensorRequest);
        	}, "putSensor accepted null sensorID");
        // PutSensorResponse response = api.putSensor(sensorId, putSensorRequest);
        // TODO: test validations
    }

    /**
     * Stream data to a sensor fusion vector
     *
     * Update fusion vector with new values for the given features, and optionally submit to Amber. Analytic results returned are the same as POST /stream.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putStreamTest() throws ApiException {
        String sensorId = null;
        PutStreamRequest putStreamRequest = null;
        Assertions.assertThrows(ApiException.class, () -> {
        	api.putStream(sensorId, putStreamRequest);
        	}, "putStream accepted null sensorID");
        // PutStreamResponse response = api.putStream(sensorId, putStreamRequest);
        // TODO: test validations
    }

}
