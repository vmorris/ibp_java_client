# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ibp_java_client.*;
import ibp_java_client.auth.*;
import ibp_java_client.model.*;
import io.swagger.client.api.ChannelsApi;

import java.io.File;
import java.util.*;

public class ChannelsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ibmblockchain-staging-starter.stage1.ng.bluemix.net/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChannelsApi* | [**getChannelBlock**](docs/ChannelsApi.md#getChannelBlock) | **POST** /networks/{networkID}/channels/{channelID}/blocks/{blockNo} | See a block
*ChannelsApi* | [**getChannelMetrics**](docs/ChannelsApi.md#getChannelMetrics) | **POST** /networks/{networkID}/channels/{channelID} | See basic channel stats
*ChannelsApi* | [**getChannelsFromPeers**](docs/ChannelsApi.md#getChannelsFromPeers) | **POST** /networks/{networkID}/channels | List channels on peers
*ChannelsApi* | [**listChannelMembers**](docs/ChannelsApi.md#listChannelMembers) | **POST** /networks/{networkID}/channels/{channelID}/members | See the channel members
*ChannelsApi* | [**listInstantiatedChaincodes**](docs/ChannelsApi.md#listInstantiatedChaincodes) | **POST** /networks/{networkID}/channels/{channelID}/chaincode/instantiated | See instantiated chaincodes
*ChannelsApi* | [**syncChannelCerts**](docs/ChannelsApi.md#syncChannelCerts) | **POST** /networks/{networkID}/channels/{channelID}/sync | Sync channel certificates
*NetworksApi* | [**getCertificatesFromPeers**](docs/NetworksApi.md#getCertificatesFromPeers) | **POST** /networks/{networkID}/certificates/fetch | List certificates
*NetworksApi* | [**getNetworkNodesStatus**](docs/NetworksApi.md#getNetworkNodesStatus) | **GET** /networks/{networkID}/nodes/status | Get the status of your blockchain nodes
*NetworksApi* | [**getNetworkServiceCreds**](docs/NetworksApi.md#getNetworkServiceCreds) | **GET** /networks/{networkID}/connection_profile | Get the connection profile
*NetworksApi* | [**uploadCertificate**](docs/NetworksApi.md#uploadCertificate) | **POST** /networks/{networkID}/certificates | Add an admin certificate
*PeersApi* | [**startPeer**](docs/PeersApi.md#startPeer) | **POST** /networks/{networkID}/nodes/{peerID}/start | Start a peer
*PeersApi* | [**stopPeer**](docs/PeersApi.md#stopPeer) | **POST** /networks/{networkID}/nodes/{peerID}/stop | Stop a peer


## Documentation for Models

 - [BlockInformation](docs/BlockInformation.md)
 - [BlockInformationParsed](docs/BlockInformationParsed.md)
 - [CertUpload](docs/CertUpload.md)
 - [CertificateList](docs/CertificateList.md)
 - [CertificateListPeerName](docs/CertificateListPeerName.md)
 - [ChannelList](docs/ChannelList.md)
 - [ChannelListPeerName](docs/ChannelListPeerName.md)
 - [ChannelStats](docs/ChannelStats.md)
 - [ChannelStatsHeight](docs/ChannelStatsHeight.md)
 - [ConnectionProfile](docs/ConnectionProfile.md)
 - [ConnectionProfileCertificateAuthorities](docs/ConnectionProfileCertificateAuthorities.md)
 - [ConnectionProfileCertificateAuthoritiesFabriccaorgIDcaID](docs/ConnectionProfileCertificateAuthoritiesFabriccaorgIDcaID.md)
 - [ConnectionProfileCertificateAuthoritiesFabriccaorgIDcaIDRegistrar](docs/ConnectionProfileCertificateAuthoritiesFabriccaorgIDcaIDRegistrar.md)
 - [ConnectionProfileCertificateAuthoritiesFabriccaorgIDcaIDTlsCACerts](docs/ConnectionProfileCertificateAuthoritiesFabriccaorgIDcaIDTlsCACerts.md)
 - [ConnectionProfileOrderers](docs/ConnectionProfileOrderers.md)
 - [ConnectionProfilePeers](docs/ConnectionProfilePeers.md)
 - [ConnectionProfilePeersFabricpeerorgIDpeerID](docs/ConnectionProfilePeersFabricpeerorgIDpeerID.md)
 - [ConnectionProfilePeersFabricpeerorgIDpeerIDTlsCACerts](docs/ConnectionProfilePeersFabricpeerorgIDpeerIDTlsCACerts.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse4001](docs/InlineResponse4001.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [NodeStatuses](docs/NodeStatuses.md)
 - [NodeStatusesExampleNodeID](docs/NodeStatusesExampleNodeID.md)
 - [PeerList](docs/PeerList.md)
 - [PeerNames](docs/PeerNames.md)
 - [SKIPCACHE](docs/SKIPCACHE.md)
 - [StandardBody](docs/StandardBody.md)
 - [Transaction](docs/Transaction.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic_auth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



