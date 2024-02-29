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
import org.openapitools.client.model.EntitymanagerAttributeOption;

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
 * EntitymanagerCreateAttributeOptionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:49:30.026307733Z[Etc/UTC]")
public class EntitymanagerCreateAttributeOptionsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_LIST_CODE = "listCode";
  @SerializedName(SERIALIZED_NAME_LIST_CODE)
  private String listCode;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<EntitymanagerAttributeOption> options;

  public EntitymanagerCreateAttributeOptionsRequest() {
  }

  public EntitymanagerCreateAttributeOptionsRequest tenantId(String tenantId) {
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


  public EntitymanagerCreateAttributeOptionsRequest listCode(String listCode) {
    this.listCode = listCode;
    return this;
  }

   /**
   * Get listCode
   * @return listCode
  **/
  @javax.annotation.Nullable
  public String getListCode() {
    return listCode;
  }

  public void setListCode(String listCode) {
    this.listCode = listCode;
  }


  public EntitymanagerCreateAttributeOptionsRequest options(List<EntitymanagerAttributeOption> options) {
    this.options = options;
    return this;
  }

  public EntitymanagerCreateAttributeOptionsRequest addOptionsItem(EntitymanagerAttributeOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public List<EntitymanagerAttributeOption> getOptions() {
    return options;
  }

  public void setOptions(List<EntitymanagerAttributeOption> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitymanagerCreateAttributeOptionsRequest entitymanagerCreateAttributeOptionsRequest = (EntitymanagerCreateAttributeOptionsRequest) o;
    return Objects.equals(this.tenantId, entitymanagerCreateAttributeOptionsRequest.tenantId) &&
        Objects.equals(this.listCode, entitymanagerCreateAttributeOptionsRequest.listCode) &&
        Objects.equals(this.options, entitymanagerCreateAttributeOptionsRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, listCode, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitymanagerCreateAttributeOptionsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    listCode: ").append(toIndentedString(listCode)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("listCode");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EntitymanagerCreateAttributeOptionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EntitymanagerCreateAttributeOptionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntitymanagerCreateAttributeOptionsRequest is not found in the empty JSON string", EntitymanagerCreateAttributeOptionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EntitymanagerCreateAttributeOptionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntitymanagerCreateAttributeOptionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("listCode") != null && !jsonObj.get("listCode").isJsonNull()) && !jsonObj.get("listCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listCode").toString()));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            EntitymanagerAttributeOption.validateJsonElement(jsonArrayoptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntitymanagerCreateAttributeOptionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntitymanagerCreateAttributeOptionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntitymanagerCreateAttributeOptionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntitymanagerCreateAttributeOptionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EntitymanagerCreateAttributeOptionsRequest>() {
           @Override
           public void write(JsonWriter out, EntitymanagerCreateAttributeOptionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntitymanagerCreateAttributeOptionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntitymanagerCreateAttributeOptionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntitymanagerCreateAttributeOptionsRequest
  * @throws IOException if the JSON string is invalid with respect to EntitymanagerCreateAttributeOptionsRequest
  */
  public static EntitymanagerCreateAttributeOptionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntitymanagerCreateAttributeOptionsRequest.class);
  }

 /**
  * Convert an instance of EntitymanagerCreateAttributeOptionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
