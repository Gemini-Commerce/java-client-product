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
 * ProductAssetsEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:49:30.026307733Z[Etc/UTC]")
public class ProductAssetsEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ASSET_GRN = "assetGrn";
  @SerializedName(SERIALIZED_NAME_ASSET_GRN)
  private String assetGrn;

  public static final String SERIALIZED_NAME_LOCALIZED_ASSET_GRN = "localizedAssetGrn";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_ASSET_GRN)
  private ProductLocalizedAsset localizedAssetGrn;

  public static final String SERIALIZED_NAME_LOCALES = "locales";
  @SerializedName(SERIALIZED_NAME_LOCALES)
  private List<String> locales;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Long position;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<ProductAssetsEntryMetadata> metadata;

  public ProductAssetsEntry() {
  }

  public ProductAssetsEntry id(String id) {
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


  public ProductAssetsEntry assetGrn(String assetGrn) {
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


  public ProductAssetsEntry localizedAssetGrn(ProductLocalizedAsset localizedAssetGrn) {
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


  public ProductAssetsEntry locales(List<String> locales) {
    this.locales = locales;
    return this;
  }

  public ProductAssetsEntry addLocalesItem(String localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

   /**
   * Get locales
   * @return locales
  **/
  @javax.annotation.Nullable
  public List<String> getLocales() {
    return locales;
  }

  public void setLocales(List<String> locales) {
    this.locales = locales;
  }


  public ProductAssetsEntry position(Long position) {
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


  public ProductAssetsEntry metadata(List<ProductAssetsEntryMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProductAssetsEntry addMetadataItem(ProductAssetsEntryMetadata metadataItem) {
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
    ProductAssetsEntry productAssetsEntry = (ProductAssetsEntry) o;
    return Objects.equals(this.id, productAssetsEntry.id) &&
        Objects.equals(this.assetGrn, productAssetsEntry.assetGrn) &&
        Objects.equals(this.localizedAssetGrn, productAssetsEntry.localizedAssetGrn) &&
        Objects.equals(this.locales, productAssetsEntry.locales) &&
        Objects.equals(this.position, productAssetsEntry.position) &&
        Objects.equals(this.metadata, productAssetsEntry.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assetGrn, localizedAssetGrn, locales, position, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAssetsEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assetGrn: ").append(toIndentedString(assetGrn)).append("\n");
    sb.append("    localizedAssetGrn: ").append(toIndentedString(localizedAssetGrn)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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
    openapiFields.add("localizedAssetGrn");
    openapiFields.add("locales");
    openapiFields.add("position");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductAssetsEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductAssetsEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductAssetsEntry is not found in the empty JSON string", ProductAssetsEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductAssetsEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductAssetsEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("assetGrn") != null && !jsonObj.get("assetGrn").isJsonNull()) && !jsonObj.get("assetGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetGrn").toString()));
      }
      // validate the optional field `localizedAssetGrn`
      if (jsonObj.get("localizedAssetGrn") != null && !jsonObj.get("localizedAssetGrn").isJsonNull()) {
        ProductLocalizedAsset.validateJsonElement(jsonObj.get("localizedAssetGrn"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("locales") != null && !jsonObj.get("locales").isJsonNull() && !jsonObj.get("locales").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locales` to be an array in the JSON string but got `%s`", jsonObj.get("locales").toString()));
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
       if (!ProductAssetsEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductAssetsEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductAssetsEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductAssetsEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductAssetsEntry>() {
           @Override
           public void write(JsonWriter out, ProductAssetsEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductAssetsEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductAssetsEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductAssetsEntry
  * @throws IOException if the JSON string is invalid with respect to ProductAssetsEntry
  */
  public static ProductAssetsEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductAssetsEntry.class);
  }

 /**
  * Convert an instance of ProductAssetsEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

