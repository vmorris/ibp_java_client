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
import java.util.ArrayList;
import java.util.List;


/**
 * ChannelListPeerName
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-28T22:08:33.832-05:00")
public class ChannelListPeerName   {
  @SerializedName("certs")
  private List<String> certs = new ArrayList<String>();

  public ChannelListPeerName certs(List<String> certs) {
    this.certs = certs;
    return this;
  }

  public ChannelListPeerName addCertsItem(String certsItem) {
    this.certs.add(certsItem);
    return this;
  }

   /**
   * A list of channels loaded on the peer
   * @return certs
  **/
  @ApiModelProperty(example = "null", value = "A list of channels loaded on the peer")
  public List<String> getCerts() {
    return certs;
  }

  public void setCerts(List<String> certs) {
    this.certs = certs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelListPeerName channelListPeerName = (ChannelListPeerName) o;
    return Objects.equals(this.certs, channelListPeerName.certs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelListPeerName {\n");
    
    sb.append("    certs: ").append(toIndentedString(certs)).append("\n");
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

