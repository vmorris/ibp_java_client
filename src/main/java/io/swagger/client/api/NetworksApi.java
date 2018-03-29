/**
 * IBM Blockchain Platform Service API
 * The Blockchain Service API allows you to interact with your blockchain network.  The APIs listed in this doc are authenticated using basic auth, where the username and password correspond to a user org and secret that are included in your service credentials.  See the ConnectionProfile schema under the Models for more information.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import ibp_java_client.ApiCallback;
import ibp_java_client.ApiClient;
import ibp_java_client.ApiException;
import ibp_java_client.ApiResponse;
import ibp_java_client.Configuration;
import ibp_java_client.Pair;
import ibp_java_client.ProgressRequestBody;
import ibp_java_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.PeerList;
import io.swagger.client.model.ChannelList;
import io.swagger.client.model.NodeStatuses;
import io.swagger.client.model.ConnectionProfile;
import io.swagger.client.model.CertUpload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworksApi {
    private ApiClient apiClient;

    public NetworksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetworksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCertificatesFromPeers */
    private com.squareup.okhttp.Call getCertificatesFromPeersCall(String networkID, PeerList body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'networkID' is set
        if (networkID == null) {
            throw new ApiException("Missing the required parameter 'networkID' when calling getCertificatesFromPeers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/networks/{networkID}/certificates/fetch".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "networkID" + "\\}", apiClient.escapeString(networkID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic_auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List certificates
     * Acquires a list of certificates from each of the peers given in the body of the request
     * @param networkID ID of the IBP network (required)
     * @param body Lists your peers that should be queried (optional)
     * @return ChannelList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChannelList getCertificatesFromPeers(String networkID, PeerList body) throws ApiException {
        ApiResponse<ChannelList> resp = getCertificatesFromPeersWithHttpInfo(networkID, body);
        return resp.getData();
    }

    /**
     * List certificates
     * Acquires a list of certificates from each of the peers given in the body of the request
     * @param networkID ID of the IBP network (required)
     * @param body Lists your peers that should be queried (optional)
     * @return ApiResponse&lt;ChannelList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChannelList> getCertificatesFromPeersWithHttpInfo(String networkID, PeerList body) throws ApiException {
        com.squareup.okhttp.Call call = getCertificatesFromPeersCall(networkID, body, null, null);
        Type localVarReturnType = new TypeToken<ChannelList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List certificates (asynchronously)
     * Acquires a list of certificates from each of the peers given in the body of the request
     * @param networkID ID of the IBP network (required)
     * @param body Lists your peers that should be queried (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCertificatesFromPeersAsync(String networkID, PeerList body, final ApiCallback<ChannelList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCertificatesFromPeersCall(networkID, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChannelList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getNetworkNodesStatus */
    private com.squareup.okhttp.Call getNetworkNodesStatusCall(String networkID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'networkID' is set
        if (networkID == null) {
            throw new ApiException("Missing the required parameter 'networkID' when calling getNetworkNodesStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/networks/{networkID}/nodes/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "networkID" + "\\}", apiClient.escapeString(networkID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic_auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get the status of your blockchain nodes
     * Returns the operational status of all your nodes on the network
     * @param networkID ID of the IBP network (required)
     * @return NodeStatuses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NodeStatuses getNetworkNodesStatus(String networkID) throws ApiException {
        ApiResponse<NodeStatuses> resp = getNetworkNodesStatusWithHttpInfo(networkID);
        return resp.getData();
    }

    /**
     * Get the status of your blockchain nodes
     * Returns the operational status of all your nodes on the network
     * @param networkID ID of the IBP network (required)
     * @return ApiResponse&lt;NodeStatuses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NodeStatuses> getNetworkNodesStatusWithHttpInfo(String networkID) throws ApiException {
        com.squareup.okhttp.Call call = getNetworkNodesStatusCall(networkID, null, null);
        Type localVarReturnType = new TypeToken<NodeStatuses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the status of your blockchain nodes (asynchronously)
     * Returns the operational status of all your nodes on the network
     * @param networkID ID of the IBP network (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNetworkNodesStatusAsync(String networkID, final ApiCallback<NodeStatuses> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNetworkNodesStatusCall(networkID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NodeStatuses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getNetworkServiceCreds */
    private com.squareup.okhttp.Call getNetworkServiceCredsCall(String networkID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'networkID' is set
        if (networkID == null) {
            throw new ApiException("Missing the required parameter 'networkID' when calling getNetworkServiceCreds(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/networks/{networkID}/connection_profile".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "networkID" + "\\}", apiClient.escapeString(networkID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic_auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get the connection profile
     * Gets the connection profile for a network, which has everything the HyperLedger fabric SDK needs to interact with the network.
     * @param networkID ID of the IBP network (required)
     * @return ConnectionProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConnectionProfile getNetworkServiceCreds(String networkID) throws ApiException {
        ApiResponse<ConnectionProfile> resp = getNetworkServiceCredsWithHttpInfo(networkID);
        return resp.getData();
    }

    /**
     * Get the connection profile
     * Gets the connection profile for a network, which has everything the HyperLedger fabric SDK needs to interact with the network.
     * @param networkID ID of the IBP network (required)
     * @return ApiResponse&lt;ConnectionProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConnectionProfile> getNetworkServiceCredsWithHttpInfo(String networkID) throws ApiException {
        com.squareup.okhttp.Call call = getNetworkServiceCredsCall(networkID, null, null);
        Type localVarReturnType = new TypeToken<ConnectionProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the connection profile (asynchronously)
     * Gets the connection profile for a network, which has everything the HyperLedger fabric SDK needs to interact with the network.
     * @param networkID ID of the IBP network (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNetworkServiceCredsAsync(String networkID, final ApiCallback<ConnectionProfile> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNetworkServiceCredsCall(networkID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConnectionProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for uploadCertificate */
    private com.squareup.okhttp.Call uploadCertificateCall(String networkID, CertUpload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'networkID' is set
        if (networkID == null) {
            throw new ApiException("Missing the required parameter 'networkID' when calling uploadCertificate(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling uploadCertificate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/networks/{networkID}/certificates".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "networkID" + "\\}", apiClient.escapeString(networkID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic_auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Add an admin certificate
     * Upload an admin certificate to a given peer
     * @param networkID ID of the IBP network (required)
     * @param body Information for the cert we want to upload (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void uploadCertificate(String networkID, CertUpload body) throws ApiException {
        uploadCertificateWithHttpInfo(networkID, body);
    }

    /**
     * Add an admin certificate
     * Upload an admin certificate to a given peer
     * @param networkID ID of the IBP network (required)
     * @param body Information for the cert we want to upload (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> uploadCertificateWithHttpInfo(String networkID, CertUpload body) throws ApiException {
        com.squareup.okhttp.Call call = uploadCertificateCall(networkID, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add an admin certificate (asynchronously)
     * Upload an admin certificate to a given peer
     * @param networkID ID of the IBP network (required)
     * @param body Information for the cert we want to upload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadCertificateAsync(String networkID, CertUpload body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadCertificateCall(networkID, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}