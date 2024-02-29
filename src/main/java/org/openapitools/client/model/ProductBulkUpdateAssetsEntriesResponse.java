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
import org.openapitools.client.model.ProductAssetsEntry;

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
 * ProductBulkUpdateAssetsEntriesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:49:30.026307733Z[Etc/UTC]")
public class ProductBulkUpdateAssetsEntriesResponse {
  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private List<ProductAssetsEntry> assets;

  public ProductBulkUpdateAssetsEntriesResponse() {
  }

  public ProductBulkUpdateAssetsEntriesResponse assets(List<ProductAssetsEntry> assets) {
    this.assets = assets;
    return this;
  }

  public ProductBulkUpdateAssetsEntriesResponse addAssetsItem(ProductAssetsEntry assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  public List<ProductAssetsEntry> getAssets() {
    return assets;
  }

  public void setAssets(List<ProductAssetsEntry> assets) {
    this.assets = assets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBulkUpdateAssetsEntriesResponse productBulkUpdateAssetsEntriesResponse = (ProductBulkUpdateAssetsEntriesResponse) o;
    return Objects.equals(this.assets, productBulkUpdateAssetsEntriesResponse.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBulkUpdateAssetsEntriesResponse {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
    openapiFields.add("assets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductBulkUpdateAssetsEntriesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductBulkUpdateAssetsEntriesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductBulkUpdateAssetsEntriesResponse is not found in the empty JSON string", ProductBulkUpdateAssetsEntriesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductBulkUpdateAssetsEntriesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductBulkUpdateAssetsEntriesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        JsonArray jsonArrayassets = jsonObj.getAsJsonArray("assets");
        if (jsonArrayassets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("assets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `assets` to be an array in the JSON string but got `%s`", jsonObj.get("assets").toString()));
          }

          // validate the optional field `assets` (array)
          for (int i = 0; i < jsonArrayassets.size(); i++) {
            ProductAssetsEntry.validateJsonElement(jsonArrayassets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductBulkUpdateAssetsEntriesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductBulkUpdateAssetsEntriesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductBulkUpdateAssetsEntriesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductBulkUpdateAssetsEntriesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductBulkUpdateAssetsEntriesResponse>() {
           @Override
           public void write(JsonWriter out, ProductBulkUpdateAssetsEntriesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductBulkUpdateAssetsEntriesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductBulkUpdateAssetsEntriesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductBulkUpdateAssetsEntriesResponse
  * @throws IOException if the JSON string is invalid with respect to ProductBulkUpdateAssetsEntriesResponse
  */
  public static ProductBulkUpdateAssetsEntriesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductBulkUpdateAssetsEntriesResponse.class);
  }

 /**
  * Convert an instance of ProductBulkUpdateAssetsEntriesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

