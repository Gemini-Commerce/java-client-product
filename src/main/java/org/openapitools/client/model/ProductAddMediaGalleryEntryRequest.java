/*
 * Product Service
 * API for managing products
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ProductMediaGalleryEntryMetadata;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Product.JSON;

/**
 * ProductAddMediaGalleryEntryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:49:30.026307733Z[Etc/UTC]")
public class ProductAddMediaGalleryEntryRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_ASSET_GRN = "assetGrn";
  @SerializedName(SERIALIZED_NAME_ASSET_GRN)
  private String assetGrn;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Long position;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<ProductMediaGalleryEntryMetadata> metadata;

  public ProductAddMediaGalleryEntryRequest() {
  }

  public ProductAddMediaGalleryEntryRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ProductAddMediaGalleryEntryRequest productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public ProductAddMediaGalleryEntryRequest assetGrn(String assetGrn) {
    this.assetGrn = assetGrn;
    return this;
  }

   /**
   * Get assetGrn
   * @return assetGrn
  **/
  @javax.annotation.Nullable
  public String getAssetGrn() {
    return assetGrn;
  }

  public void setAssetGrn(String assetGrn) {
    this.assetGrn = assetGrn;
  }


  public ProductAddMediaGalleryEntryRequest position(Long position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }


  public ProductAddMediaGalleryEntryRequest metadata(List<ProductMediaGalleryEntryMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProductAddMediaGalleryEntryRequest addMetadataItem(ProductMediaGalleryEntryMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public List<ProductMediaGalleryEntryMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<ProductMediaGalleryEntryMetadata> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAddMediaGalleryEntryRequest productAddMediaGalleryEntryRequest = (ProductAddMediaGalleryEntryRequest) o;
    return Objects.equals(this.tenantId, productAddMediaGalleryEntryRequest.tenantId) &&
        Objects.equals(this.productId, productAddMediaGalleryEntryRequest.productId) &&
        Objects.equals(this.assetGrn, productAddMediaGalleryEntryRequest.assetGrn) &&
        Objects.equals(this.position, productAddMediaGalleryEntryRequest.position) &&
        Objects.equals(this.metadata, productAddMediaGalleryEntryRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, productId, assetGrn, position, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAddMediaGalleryEntryRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    assetGrn: ").append(toIndentedString(assetGrn)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("productId");
    openapiFields.add("assetGrn");
    openapiFields.add("position");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductAddMediaGalleryEntryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductAddMediaGalleryEntryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductAddMediaGalleryEntryRequest is not found in the empty JSON string", ProductAddMediaGalleryEntryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductAddMediaGalleryEntryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductAddMediaGalleryEntryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("productId") != null && !jsonObj.get("productId").isJsonNull()) && !jsonObj.get("productId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productId").toString()));
      }
      if ((jsonObj.get("assetGrn") != null && !jsonObj.get("assetGrn").isJsonNull()) && !jsonObj.get("assetGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetGrn").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            ProductMediaGalleryEntryMetadata.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductAddMediaGalleryEntryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductAddMediaGalleryEntryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductAddMediaGalleryEntryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductAddMediaGalleryEntryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductAddMediaGalleryEntryRequest>() {
           @Override
           public void write(JsonWriter out, ProductAddMediaGalleryEntryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductAddMediaGalleryEntryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductAddMediaGalleryEntryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductAddMediaGalleryEntryRequest
  * @throws IOException if the JSON string is invalid with respect to ProductAddMediaGalleryEntryRequest
  */
  public static ProductAddMediaGalleryEntryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductAddMediaGalleryEntryRequest.class);
  }

 /**
  * Convert an instance of ProductAddMediaGalleryEntryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

