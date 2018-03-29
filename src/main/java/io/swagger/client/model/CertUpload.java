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
import io.swagger.client.model.PeerNames;
import io.swagger.client.model.SKIPCACHE;


/**
 * The contents of a certificate and the peers it should be uploaded to
 */
@ApiModel(description = "The contents of a certificate and the peers it should be uploaded to")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-28T22:08:33.832-05:00")
public class CertUpload   {
  @SerializedName("msp_id")
  private String mspId = null;

  @SerializedName("adminCertName")
  private String adminCertName = null;

  @SerializedName("adminCertificate")
  private String adminCertificate = null;

  @SerializedName("peer_names")
  private PeerNames peerNames = null;

  @SerializedName("SKIP_CACHE")
  private SKIPCACHE SKIP_CACHE = null;

  public CertUpload mspId(String mspId) {
    this.mspId = mspId;
    return this;
  }

   /**
   * The membership service ID of the organization the cert pertains to
   * @return mspId
  **/
  @ApiModelProperty(example = "ExamplePeerOrg1", required = true, value = "The membership service ID of the organization the cert pertains to")
  public String getMspId() {
    return mspId;
  }

  public void setMspId(String mspId) {
    this.mspId = mspId;
  }

  public CertUpload adminCertName(String adminCertName) {
    this.adminCertName = adminCertName;
    return this;
  }

   /**
   * A name to assign to the certificate on the peer(s)
   * @return adminCertName
  **/
  @ApiModelProperty(example = "exampleAdminCert1", required = true, value = "A name to assign to the certificate on the peer(s)")
  public String getAdminCertName() {
    return adminCertName;
  }

  public void setAdminCertName(String adminCertName) {
    this.adminCertName = adminCertName;
  }

  public CertUpload adminCertificate(String adminCertificate) {
    this.adminCertificate = adminCertificate;
    return this;
  }

   /**
   * The contents of a certificate
   * @return adminCertificate
  **/
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE-----
MIIBkzCCATqgAwIB...", required = true, value = "The contents of a certificate")
  public String getAdminCertificate() {
    return adminCertificate;
  }

  public void setAdminCertificate(String adminCertificate) {
    this.adminCertificate = adminCertificate;
  }

  public CertUpload peerNames(PeerNames peerNames) {
    this.peerNames = peerNames;
    return this;
  }

   /**
   * Get peerNames
   * @return peerNames
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PeerNames getPeerNames() {
    return peerNames;
  }

  public void setPeerNames(PeerNames peerNames) {
    this.peerNames = peerNames;
  }

  public CertUpload SKIP_CACHE(SKIPCACHE SKIP_CACHE) {
    this.SKIP_CACHE = SKIP_CACHE;
    return this;
  }

   /**
   * Get SKIP_CACHE
   * @return SKIP_CACHE
  **/
  @ApiModelProperty(example = "null", value = "")
  public SKIPCACHE getSKIPCACHE() {
    return SKIP_CACHE;
  }

  public void setSKIPCACHE(SKIPCACHE SKIP_CACHE) {
    this.SKIP_CACHE = SKIP_CACHE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertUpload certUpload = (CertUpload) o;
    return Objects.equals(this.mspId, certUpload.mspId) &&
        Objects.equals(this.adminCertName, certUpload.adminCertName) &&
        Objects.equals(this.adminCertificate, certUpload.adminCertificate) &&
        Objects.equals(this.peerNames, certUpload.peerNames) &&
        Objects.equals(this.SKIP_CACHE, certUpload.SKIP_CACHE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mspId, adminCertName, adminCertificate, peerNames, SKIP_CACHE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertUpload {\n");
    
    sb.append("    mspId: ").append(toIndentedString(mspId)).append("\n");
    sb.append("    adminCertName: ").append(toIndentedString(adminCertName)).append("\n");
    sb.append("    adminCertificate: ").append(toIndentedString(adminCertificate)).append("\n");
    sb.append("    peerNames: ").append(toIndentedString(peerNames)).append("\n");
    sb.append("    SKIP_CACHE: ").append(toIndentedString(SKIP_CACHE)).append("\n");
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

