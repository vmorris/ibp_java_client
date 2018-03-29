
# NodeStatusesExampleNodeID

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The operational status of the node |  [optional]
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) | The Hyperledger Fabric role of the node |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
EXITED | &quot;exited&quot;


<a name="NodeTypeEnum"></a>
## Enum: NodeTypeEnum
Name | Value
---- | -----
CA | &quot;fabric-ca&quot;
PEER | &quot;fabric-peer&quot;
ORDERER | &quot;fabric-orderer&quot;



