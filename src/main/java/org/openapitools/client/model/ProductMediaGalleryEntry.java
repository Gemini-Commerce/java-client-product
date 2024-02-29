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
 * ProductMediaGalleryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:49:30.026307733Z[Etc/UTC]")
public class ProductMediaGalleryEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ASSET_GRN = "assetGrn";
  @SerializedName(SERIALIZED_NAME_ASSET_GRN)
  private String assetGrn;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Long position;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<ProductMediaGalleryEntryMetadata> metadata;

  public ProductMediaGalleryEntry() {
  }

  public ProductMediaGalleryEntry id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ProductMediaGalleryEntry assetGrn(String assetGrn) {
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


  public ProductMediaGalleryEntry position(Long position) {
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


  public ProductMediaGalleryEntry metadata(List<ProductMediaGalleryEntryMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProductMediaGalleryEntry addMetadataItem(ProductMediaGalleryEntryMetadata metadataItem) {
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
    ProductMediaGalleryEntry productMediaGalleryEntry = (ProductMediaGalleryEntry) o;
    return Objects.equals(this.id, productMediaGalleryEntry.id) &&
        Objects.equals(this.assetGrn, productMediaGalleryEntry.assetGrn) &&
        Objects.equals(this.position, productMediaGalleryEntry.position) &&
        Objects.equals(this.metadata, productMediaGalleryEntry.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assetGrn, position, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMediaGalleryEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("id");
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
  * @throws IOException if the JSON Element is invalid with respect to ProductMediaGalleryEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductMediaGalleryEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductMediaGalleryEntry is not found in the empty JSON string", ProductMediaGalleryEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductMediaGalleryEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductMediaGalleryEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
       if (!ProductMediaGalleryEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductMediaGalleryEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductMediaGalleryEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductMediaGalleryEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductMediaGalleryEntry>() {
           @Override
           public void write(JsonWriter out, ProductMediaGalleryEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductMediaGalleryEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductMediaGalleryEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductMediaGalleryEntry
  * @throws IOException if the JSON string is invalid with respect to ProductMediaGalleryEntry
  */
  public static ProductMediaGalleryEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductMediaGalleryEntry.class);
  }

 /**
  * Convert an instance of ProductMediaGalleryEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
