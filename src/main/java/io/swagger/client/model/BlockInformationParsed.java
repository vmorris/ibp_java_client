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
import io.swagger.client.model.Transaction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * The data for a block on a channel
 */
@ApiModel(description = "The data for a block on a channel")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-28T22:08:33.832-05:00")
public class BlockInformationParsed   {
  @SerializedName("data_count")
  private BigDecimal dataCount = null;

  @SerializedName("metadata_count")
  private BigDecimal metadataCount = null;

  @SerializedName("txs")
  private List<Transaction> txs = new ArrayList<Transaction>();

  public BlockInformationParsed dataCount(BigDecimal dataCount) {
    this.dataCount = dataCount;
    return this;
  }

   /**
   * The number of transactions in the block
   * @return dataCount
  **/
  @ApiModelProperty(example = "null", value = "The number of transactions in the block")
  public BigDecimal getDataCount() {
    return dataCount;
  }

  public void setDataCount(BigDecimal dataCount) {
    this.dataCount = dataCount;
  }

  public BlockInformationParsed metadataCount(BigDecimal metadataCount) {
    this.metadataCount = metadataCount;
    return this;
  }

   /**
   * Get metadataCount
   * @return metadataCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getMetadataCount() {
    return metadataCount;
  }

  public void setMetadataCount(BigDecimal metadataCount) {
    this.metadataCount = metadataCount;
  }

  public BlockInformationParsed txs(List<Transaction> txs) {
    this.txs = txs;
    return this;
  }

  public BlockInformationParsed addTxsItem(Transaction txsItem) {
    this.txs.add(txsItem);
    return this;
  }

   /**
   * A list of transactions in the block
   * @return txs
  **/
  @ApiModelProperty(example = "null", value = "A list of transactions in the block")
  public List<Transaction> getTxs() {
    return txs;
  }

  public void setTxs(List<Transaction> txs) {
    this.txs = txs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockInformationParsed blockInformationParsed = (BlockInformationParsed) o;
    return Objects.equals(this.dataCount, blockInformationParsed.dataCount) &&
        Objects.equals(this.metadataCount, blockInformationParsed.metadataCount) &&
        Objects.equals(this.txs, blockInformationParsed.txs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCount, metadataCount, txs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockInformationParsed {\n");
    
    sb.append("    dataCount: ").append(toIndentedString(dataCount)).append("\n");
    sb.append("    metadataCount: ").append(toIndentedString(metadataCount)).append("\n");
    sb.append("    txs: ").append(toIndentedString(txs)).append("\n");
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

