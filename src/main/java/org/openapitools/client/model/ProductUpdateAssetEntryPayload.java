/*
 * Product Service
 * Introducing our revolutionary Product Management Service! Designed to streamline your product inventory and elevate customer experiences, our cutting-edge protobuf service is a game-changer in the world of efficient product management.  With our service, you can effortlessly create new products, allowing you to quickly bring your ideas to life and expand your catalog. Retrieve product information in a snap, providing accurate and personalized details to your customers based on their specific needs and preferences.  Stay ahead of the competition by easily updating product information, ensuring your catalog is always up-to-date and optimized. Seamlessly remove products from your inventory when needed, maintaining a clean and relevant product selection.  Enhance the visual appeal of your products with our advanced media gallery functionalities. Effortlessly add and update captivating images and videos to showcase your products in the best possible light, engaging your customers and driving conversions.  Personalization is key in today's market, and our service enables you to offer unique options to your customers. Easily create and manage lists of customizable options for your products, providing flexibility and tailoring to individual preferences.  Attributes play a vital role in defining products, and our service empowers you to effectively manage them. From bulk attribute creation to listing and retrieving attribute options, our service ensures your product information is rich and comprehensive.  Our service extends its capabilities to entity management, allowing you to effortlessly handle different entities and create customized options lists associated with them. This provides further flexibility and customization options for your product offerings.  When it comes to bulk updates, our service has you covered. Effortlessly update multiple products simultaneously, saving you time and streamlining your operations.  Finding specific products and variants is a breeze with our service. Quickly locate products based on their unique stock keeping unit (SKU) values, ensuring efficient inventory management and smooth order fulfillment.  Experience a new level of efficiency and productivity with our Product Management Service. Unlock the full potential of streamlined product management and empower your business to thrive in today's competitive market. Try our service today and elevate your product management to new heights!
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
import org.openapitools.client.model.ProductAssetsEntryMetadata;
import org.openapitools.client.model.ProductLocalizedAsset;

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
 * ProductUpdateAssetEntryPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-06T13:40:57.069678376Z[Etc/UTC]")
public class ProductUpdateAssetEntryPayload {
  public static final String SERIALIZED_NAME_ASSET_GRN = "assetGrn";
  @SerializedName(SERIALIZED_NAME_ASSET_GRN)
  private String assetGrn;

  public static final String SERIALIZED_NAME_LOCALIZED_ASSET_GRN = "localizedAssetGrn";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_ASSET_GRN)
  private ProductLocalizedAsset localizedAssetGrn;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Long position;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<ProductAssetsEntryMetadata> metadata;

  public ProductUpdateAssetEntryPayload() {
  }

  public ProductUpdateAssetEntryPayload assetGrn(String assetGrn) {
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


  public ProductUpdateAssetEntryPayload localizedAssetGrn(ProductLocalizedAsset localizedAssetGrn) {
    this.localizedAssetGrn = localizedAssetGrn;
    return this;
  }

   /**
   * Get localizedAssetGrn
   * @return localizedAssetGrn
  **/
  @javax.annotation.Nullable
  public ProductLocalizedAsset getLocalizedAssetGrn() {
    return localizedAssetGrn;
  }

  public void setLocalizedAssetGrn(ProductLocalizedAsset localizedAssetGrn) {
    this.localizedAssetGrn = localizedAssetGrn;
  }


  public ProductUpdateAssetEntryPayload position(Long position) {
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


  public ProductUpdateAssetEntryPayload metadata(List<ProductAssetsEntryMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProductUpdateAssetEntryPayload addMetadataItem(ProductAssetsEntryMetadata metadataItem) {
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
  public List<ProductAssetsEntryMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<ProductAssetsEntryMetadata> metadata) {
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
    ProductUpdateAssetEntryPayload productUpdateAssetEntryPayload = (ProductUpdateAssetEntryPayload) o;
    return Objects.equals(this.assetGrn, productUpdateAssetEntryPayload.assetGrn) &&
        Objects.equals(this.localizedAssetGrn, productUpdateAssetEntryPayload.localizedAssetGrn) &&
        Objects.equals(this.position, productUpdateAssetEntryPayload.position) &&
        Objects.equals(this.metadata, productUpdateAssetEntryPayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGrn, localizedAssetGrn, position, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUpdateAssetEntryPayload {\n");
    sb.append("    assetGrn: ").append(toIndentedString(assetGrn)).append("\n");
    sb.append("    localizedAssetGrn: ").append(toIndentedString(localizedAssetGrn)).append("\n");
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
    openapiFields.add("assetGrn");
    openapiFields.add("localizedAssetGrn");
    openapiFields.add("position");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductUpdateAssetEntryPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductUpdateAssetEntryPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductUpdateAssetEntryPayload is not found in the empty JSON string", ProductUpdateAssetEntryPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductUpdateAssetEntryPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductUpdateAssetEntryPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("assetGrn") != null && !jsonObj.get("assetGrn").isJsonNull()) && !jsonObj.get("assetGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetGrn").toString()));
      }
      // validate the optional field `localizedAssetGrn`
      if (jsonObj.get("localizedAssetGrn") != null && !jsonObj.get("localizedAssetGrn").isJsonNull()) {
        ProductLocalizedAsset.validateJsonElement(jsonObj.get("localizedAssetGrn"));
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
            ProductAssetsEntryMetadata.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductUpdateAssetEntryPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductUpdateAssetEntryPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductUpdateAssetEntryPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductUpdateAssetEntryPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductUpdateAssetEntryPayload>() {
           @Override
           public void write(JsonWriter out, ProductUpdateAssetEntryPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductUpdateAssetEntryPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductUpdateAssetEntryPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductUpdateAssetEntryPayload
  * @throws IOException if the JSON string is invalid with respect to ProductUpdateAssetEntryPayload
  */
  public static ProductUpdateAssetEntryPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductUpdateAssetEntryPayload.class);
  }

 /**
  * Convert an instance of ProductUpdateAssetEntryPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

