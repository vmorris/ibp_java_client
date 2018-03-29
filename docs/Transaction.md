
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txId** | **String** | The unique ID of the transaction |  [optional]
**instantiate** | **Boolean** | True if the transaction instantiated chaincode on a channel.  False otherwise. |  [optional]
**channelId** | **String** | The name of the channel that the transaction belongs to |  [optional]
**chaincodeId** | **String** | The unique ID of the instantiated chaincode that was used to generate write sets for the transaction. Can be &#39;-&#39; if the transaction doesn&#39;t involve chaincode, such as a genesis transaction |  [optional]
**timestamp** | [**BigDecimal**](BigDecimal.md) | Describes when the transaction was committed |  [optional]
**creatorMspId** | **String** | The MSP ID of the member that created the transaction |  [optional]
**endorsements** | **List&lt;Object&gt;** | A list of signatures that were used to endorse the transaction |  [optional]
**writeSet** | **List&lt;Object&gt;** | A list of changes that this transaction made to the world state of the channel |  [optional]
**params** | **List&lt;String&gt;** | A list of parameters that were passed to the chaincode to generate the write set |  [optional]
**channelUpdate** | **Boolean** | True if the transaction altered the configuration of the channel. False otherwise |  [optional]



