# NetworksApi

All URIs are relative to *https://ibmblockchain-staging-starter.stage1.ng.bluemix.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCertificatesFromPeers**](NetworksApi.md#getCertificatesFromPeers) | **POST** /networks/{networkID}/certificates/fetch | List certificates
[**getNetworkNodesStatus**](NetworksApi.md#getNetworkNodesStatus) | **GET** /networks/{networkID}/nodes/status | Get the status of your blockchain nodes
[**getNetworkServiceCreds**](NetworksApi.md#getNetworkServiceCreds) | **GET** /networks/{networkID}/connection_profile | Get the connection profile
[**uploadCertificate**](NetworksApi.md#uploadCertificate) | **POST** /networks/{networkID}/certificates | Add an admin certificate


<a name="getCertificatesFromPeers"></a>
# **getCertificatesFromPeers**
> ChannelList getCertificatesFromPeers(networkID, body)

List certificates

Acquires a list of certificates from each of the peers given in the body of the request

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.NetworksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

NetworksApi apiInstance = new NetworksApi();
String networkID = "networkID_example"; // String | ID of the IBP network
PeerList body = new PeerList(); // PeerList | Lists your peers that should be queried
try {
    ChannelList result = apiInstance.getCertificatesFromPeers(networkID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#getCertificatesFromPeers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **body** | [**PeerList**](PeerList.md)| Lists your peers that should be queried | [optional]

### Return type

[**ChannelList**](ChannelList.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkNodesStatus"></a>
# **getNetworkNodesStatus**
> NodeStatuses getNetworkNodesStatus(networkID)

Get the status of your blockchain nodes

Returns the operational status of all your nodes on the network

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.NetworksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

NetworksApi apiInstance = new NetworksApi();
String networkID = "networkID_example"; // String | ID of the IBP network
try {
    NodeStatuses result = apiInstance.getNetworkNodesStatus(networkID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#getNetworkNodesStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |

### Return type

[**NodeStatuses**](NodeStatuses.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkServiceCreds"></a>
# **getNetworkServiceCreds**
> ConnectionProfile getNetworkServiceCreds(networkID)

Get the connection profile

Gets the connection profile for a network, which has everything the HyperLedger fabric SDK needs to interact with the network.

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.NetworksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

NetworksApi apiInstance = new NetworksApi();
String networkID = "networkID_example"; // String | ID of the IBP network
try {
    ConnectionProfile result = apiInstance.getNetworkServiceCreds(networkID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#getNetworkServiceCreds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |

### Return type

[**ConnectionProfile**](ConnectionProfile.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadCertificate"></a>
# **uploadCertificate**
> uploadCertificate(networkID, body)

Add an admin certificate

Upload an admin certificate to a given peer

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.NetworksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

NetworksApi apiInstance = new NetworksApi();
String networkID = "networkID_example"; // String | ID of the IBP network
CertUpload body = new CertUpload(); // CertUpload | Information for the cert we want to upload
try {
    apiInstance.uploadCertificate(networkID, body);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#uploadCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **body** | [**CertUpload**](CertUpload.md)| Information for the cert we want to upload |

### Return type

null (empty response body)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

