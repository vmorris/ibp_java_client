# PeersApi

All URIs are relative to *https://ibmblockchain-staging-starter.stage1.ng.bluemix.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**startPeer**](PeersApi.md#startPeer) | **POST** /networks/{networkID}/nodes/{peerID}/start | Start a peer
[**stopPeer**](PeersApi.md#stopPeer) | **POST** /networks/{networkID}/nodes/{peerID}/stop | Stop a peer


<a name="startPeer"></a>
# **startPeer**
> InlineResponse2002 startPeer(networkID, peerID)

Start a peer

Start a given peer

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.PeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

PeersApi apiInstance = new PeersApi();
String networkID = "networkID_example"; // String | ID of the IBP network
String peerID = "peerID_example"; // String | ID of the peer to start
try {
    InlineResponse2002 result = apiInstance.startPeer(networkID, peerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#startPeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **peerID** | **String**| ID of the peer to start |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopPeer"></a>
# **stopPeer**
> InlineResponse2002 stopPeer(networkID, peerID)

Stop a peer

Stop a given peer

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.PeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

PeersApi apiInstance = new PeersApi();
String networkID = "networkID_example"; // String | ID of the IBP network
String peerID = "peerID_example"; // String | ID of the peer to stop
try {
    InlineResponse2002 result = apiInstance.stopPeer(networkID, peerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#stopPeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **peerID** | **String**| ID of the peer to stop |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

