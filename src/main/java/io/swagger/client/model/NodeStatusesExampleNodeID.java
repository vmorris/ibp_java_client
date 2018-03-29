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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * An object representing the status of a node on the network
 */
@ApiModel(description = "An object representing the status of a node on the network")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-28T22:08:33.832-05:00")
public class NodeStatusesExampleNodeID   {
  /**
   * The operational status of the node
   */
  public enum StatusEnum {
    @SerializedName("running")
    RUNNING("running"),
    
    @SerializedName("exited")
    EXITED("exited");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * The Hyperledger Fabric role of the node
   */
  public enum NodeTypeEnum {
    @SerializedName("fabric-ca")
    CA("fabric-ca"),
    
    @SerializedName("fabric-peer")
    PEER("fabric-peer"),
    
    @SerializedName("fabric-orderer")
    ORDERER("fabric-orderer");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("node_type")
  private NodeTypeEnum nodeType = null;

  public NodeStatusesExampleNodeID status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The operational status of the node
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The operational status of the node")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public NodeStatusesExampleNodeID nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * The Hyperledger Fabric role of the node
   * @return nodeType
  **/
  @ApiModelProperty(example = "null", value = "The Hyperledger Fabric role of the node")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatusesExampleNodeID nodeStatusesExampleNodeID = (NodeStatusesExampleNodeID) o;
    return Objects.equals(this.status, nodeStatusesExampleNodeID.status) &&
        Objects.equals(this.nodeType, nodeStatusesExampleNodeID.nodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, nodeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusesExampleNodeID {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
