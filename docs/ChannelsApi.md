# ChannelsApi

All URIs are relative to *https://ibmblockchain-staging-starter.stage1.ng.bluemix.net/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannelBlock**](ChannelsApi.md#getChannelBlock) | **POST** /networks/{networkID}/channels/{channelID}/blocks/{blockNo} | See a block
[**getChannelMetrics**](ChannelsApi.md#getChannelMetrics) | **POST** /networks/{networkID}/channels/{channelID} | See basic channel stats
[**getChannelsFromPeers**](ChannelsApi.md#getChannelsFromPeers) | **POST** /networks/{networkID}/channels | List channels on peers
[**listChannelMembers**](ChannelsApi.md#listChannelMembers) | **POST** /networks/{networkID}/channels/{channelID}/members | See the channel members
[**listInstantiatedChaincodes**](ChannelsApi.md#listInstantiatedChaincodes) | **POST** /networks/{networkID}/channels/{channelID}/chaincode/instantiated | See instantiated chaincodes
[**syncChannelCerts**](ChannelsApi.md#syncChannelCerts) | **POST** /networks/{networkID}/channels/{channelID}/sync | Sync channel certificates


<a name="getChannelBlock"></a>
# **getChannelBlock**
> BlockInformation getChannelBlock(networkID, channelID, blockNo, body)

See a block

Get the contents of given block

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

ChannelsApi apiInstance = new ChannelsApi();
String networkID = "networkID_example"; // String | ID of the IBP network
String channelID = "channelID_example"; // String | ID of the channel the block belongs to
String blockNo = "blockNo_example"; // String | Number of the block you want the contents of. You derive the block number from the height of the channel. The first block is 0 and the last block is (channel_height - 1)
PeerList body = new PeerList(); // PeerList | Lists your peers that should be queried
try {
    BlockInformation result = apiInstance.getChannelBlock(networkID, channelID, blockNo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getChannelBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **channelID** | **String**| ID of the channel the block belongs to |
 **blockNo** | **String**| Number of the block you want the contents of. You derive the block number from the height of the channel. The first block is 0 and the last block is (channel_height - 1) |
 **body** | [**PeerList**](PeerList.md)| Lists your peers that should be queried | [optional]

### Return type

[**BlockInformation**](BlockInformation.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelMetrics"></a>
# **getChannelMetrics**
> ChannelStats getChannelMetrics(networkID, channelID)

See basic channel stats

Get a report on various channel metrics

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

ChannelsApi apiInstance = new ChannelsApi();
String networkID = "networkID_example"; // String | ID of the IBP network
String channelID = "channelID_example"; // String | Gathered metrics will pertain to this channel
try {
    ChannelStats result = apiInstance.getChannelMetrics(networkID, channelID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getChannelMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **channelID** | **String**| Gathered metrics will pertain to this channel |

### Return type

[**ChannelStats**](ChannelStats.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelsFromPeers"></a>
# **getChannelsFromPeers**
> CertificateList getChannelsFromPeers(networkID, body)

List channels on peers

Retreives a list of channels from each of the peers given in the body of the request

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

ChannelsApi apiInstance = new ChannelsApi();
String networkID = "networkID_example"; // String | ID of the IBP network
PeerList body = new PeerList(); // PeerList | Lists your peers that should be queried
try {
    CertificateList result = apiInstance.getChannelsFromPeers(networkID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getChannelsFromPeers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **body** | [**PeerList**](PeerList.md)| Lists your peers that should be queried | [optional]

### Return type

[**CertificateList**](CertificateList.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listChannelMembers"></a>
# **listChannelMembers**
> List&lt;InlineResponse2001&gt; listChannelMembers(networkID, channelID)

See the channel members

Get a list of the members for a given channel

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

ChannelsApi apiInstance = new ChannelsApi();
String networkID = "networkID_example"; // String | ID of the IBP network
String channelID = "channelID_example"; // String | The list will include members of this channel
try {
    List<InlineResponse2001> result = apiInstance.listChannelMembers(networkID, channelID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#listChannelMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **channelID** | **String**| The list will include members of this channel |

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInstantiatedChaincodes"></a>
# **listInstantiatedChaincodes**
> InlineResponse200 listInstantiatedChaincodes(networkID, channelID, body)

See instantiated chaincodes

Get a list of the instantiated chaincodes for a given channel

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

ChannelsApi apiInstance = new ChannelsApi();
String networkID = "networkID_example"; // String | ID of the IBP network
String channelID = "channelID_example"; // String | Listed chaincodes will pertain to this channel
StandardBody body = new StandardBody(); // StandardBody | (Optional) Specify the specific name of peer(s) to query
try {
    InlineResponse200 result = apiInstance.listInstantiatedChaincodes(networkID, channelID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#listInstantiatedChaincodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **channelID** | **String**| Listed chaincodes will pertain to this channel |
 **body** | [**StandardBody**](StandardBody.md)| (Optional) Specify the specific name of peer(s) to query | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="syncChannelCerts"></a>
# **syncChannelCerts**
> InlineResponse2002 syncChannelCerts(networkID, channelID)

Sync channel certificates

Synchronizes the list of certificates for a given channel across a list of peers.  Useful for making sure all your peers can verify signatures for a given channel.

### Example
```java
// Import classes:
//import ibp_java_client.ApiClient;
//import ibp_java_client.ApiException;
//import ibp_java_client.Configuration;
//import ibp_java_client.auth.*;
//import io.swagger.client.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

ChannelsApi apiInstance = new ChannelsApi();
String networkID = "networkID_example"; // String | ID of the IBP network
String channelID = "channelID_example"; // String | ID of the channel you want to sync
try {
    InlineResponse2002 result = apiInstance.syncChannelCerts(networkID, channelID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#syncChannelCerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkID** | **String**| ID of the IBP network |
 **channelID** | **String**| ID of the channel you want to sync |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

