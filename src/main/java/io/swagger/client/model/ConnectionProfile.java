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
import io.swagger.client.model.ConnectionProfileCertificateAuthorities;
import io.swagger.client.model.ConnectionProfileOrderers;
import io.swagger.client.model.ConnectionProfilePeers;


/**
 * All of the information necessary for a user to connect to the network as a specific organization
 */
@ApiModel(description = "All of the information necessary for a user to connect to the network as a specific organization")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-28T22:08:33.832-05:00")
public class ConnectionProfile   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("x-networkId")
  private String xNetworkId = null;

  @SerializedName("x-type")
  private String xType = null;

  @SerializedName("orderers")
  private ConnectionProfileOrderers orderers = null;

  @SerializedName("peers")
  private ConnectionProfilePeers peers = null;

  @SerializedName("certificateAuthorities")
  private ConnectionProfileCertificateAuthorities certificateAuthorities = null;

  public ConnectionProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The friendly name for the blockchain network
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The friendly name for the blockchain network")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionProfile xNetworkId(String xNetworkId) {
    this.xNetworkId = xNetworkId;
    return this;
  }

   /**
   * The uuid representing the blockchain network
   * @return xNetworkId
  **/
  @ApiModelProperty(example = "null", value = "The uuid representing the blockchain network")
  public String getXNetworkId() {
    return xNetworkId;
  }

  public void setXNetworkId(String xNetworkId) {
    this.xNetworkId = xNetworkId;
  }

  public ConnectionProfile xType(String xType) {
    this.xType = xType;
    return this;
  }

   /**
   * Get xType
   * @return xType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getXType() {
    return xType;
  }

  public void setXType(String xType) {
    this.xType = xType;
  }

  public ConnectionProfile orderers(ConnectionProfileOrderers orderers) {
    this.orderers = orderers;
    return this;
  }

   /**
   * Get orderers
   * @return orderers
  **/
  @ApiModelProperty(example = "null", value = "")
  public ConnectionProfileOrderers getOrderers() {
    return orderers;
  }

  public void setOrderers(ConnectionProfileOrderers orderers) {
    this.orderers = orderers;
  }

  public ConnectionProfile peers(ConnectionProfilePeers peers) {
    this.peers = peers;
    return this;
  }

   /**
   * Get peers
   * @return peers
  **/
  @ApiModelProperty(example = "null", value = "")
  public ConnectionProfilePeers getPeers() {
    return peers;
  }

  public void setPeers(ConnectionProfilePeers peers) {
    this.peers = peers;
  }

  public ConnectionProfile certificateAuthorities(ConnectionProfileCertificateAuthorities certificateAuthorities) {
    this.certificateAuthorities = certificateAuthorities;
    return this;
  }

   /**
   * Get certificateAuthorities
   * @return certificateAuthorities
  **/
  @ApiModelProperty(example = "null", value = "")
  public ConnectionProfileCertificateAuthorities getCertificateAuthorities() {
    return certificateAuthorities;
  }

  public void setCertificateAuthorities(ConnectionProfileCertificateAuthorities certificateAuthorities) {
    this.certificateAuthorities = certificateAuthorities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionProfile connectionProfile = (ConnectionProfile) o;
    return Objects.equals(this.name, connectionProfile.name) &&
        Objects.equals(this.xNetworkId, connectionProfile.xNetworkId) &&
        Objects.equals(this.xType, connectionProfile.xType) &&
        Objects.equals(this.orderers, connectionProfile.orderers) &&
        Objects.equals(this.peers, connectionProfile.peers) &&
        Objects.equals(this.certificateAuthorities, connectionProfile.certificateAuthorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, xNetworkId, xType, orderers, peers, certificateAuthorities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionProfile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    xNetworkId: ").append(toIndentedString(xNetworkId)).append("\n");
    sb.append("    xType: ").append(toIndentedString(xType)).append("\n");
    sb.append("    orderers: ").append(toIndentedString(orderers)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
    sb.append("    certificateAuthorities: ").append(toIndentedString(certificateAuthorities)).append("\n");
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

