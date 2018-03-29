
# ConnectionProfilePeersFabricpeerorgIDpeerID

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | The connection endpoint for submitting transactions |  [optional]
**eventUrl** | **String** | The connection endpoint for subscribing to peer events |  [optional]
**grpcOptions** | **Object** | Connection parameters to be passed to your GRPC library when connecting to the peer |  [optional]
**tlsCACerts** | [**ConnectionProfilePeersFabricpeerorgIDpeerIDTlsCACerts**](ConnectionProfilePeersFabricpeerorgIDpeerIDTlsCACerts.md) |  |  [optional]
**xMspid** | **String** | The MSP ID for the organization that owns this peer |  [optional]
**xLedgerDbType** | [**XLedgerDbTypeEnum**](#XLedgerDbTypeEnum) | The backing database that the peer uses to store its ledger |  [optional]
**xInstalledChaincode** | **Object** | a list of installed chaincodes on the peer |  [optional]


<a name="XLedgerDbTypeEnum"></a>
## Enum: XLedgerDbTypeEnum
Name | Value
---- | -----
LEVELDB | &quot;levelDB&quot;



