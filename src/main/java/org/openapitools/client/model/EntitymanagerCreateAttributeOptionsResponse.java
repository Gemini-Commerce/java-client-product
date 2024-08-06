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
import org.openapitools.client.model.EntitymanagerAttributeOption;
import org.openapitools.client.model.EntitymanagerAttributeOptionErrors;

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
 * EntitymanagerCreateAttributeOptionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-06T13:40:57.069678376Z[Etc/UTC]")
public class EntitymanagerCreateAttributeOptionsResponse {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<EntitymanagerAttributeOption> options;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<EntitymanagerAttributeOptionErrors> errors;

  public EntitymanagerCreateAttributeOptionsResponse() {
  }

  public EntitymanagerCreateAttributeOptionsResponse options(List<EntitymanagerAttributeOption> options) {
    this.options = options;
    return this;
  }

  public EntitymanagerCreateAttributeOptionsResponse addOptionsItem(EntitymanagerAttributeOption optionsItem) {
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


  public EntitymanagerCreateAttributeOptionsResponse errors(List<EntitymanagerAttributeOptionErrors> errors) {
    this.errors = errors;
    return this;
  }

  public EntitymanagerCreateAttributeOptionsResponse addErrorsItem(EntitymanagerAttributeOptionErrors errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<EntitymanagerAttributeOptionErrors> getErrors() {
    return errors;
  }

  public void setErrors(List<EntitymanagerAttributeOptionErrors> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitymanagerCreateAttributeOptionsResponse entitymanagerCreateAttributeOptionsResponse = (EntitymanagerCreateAttributeOptionsResponse) o;
    return Objects.equals(this.options, entitymanagerCreateAttributeOptionsResponse.options) &&
        Objects.equals(this.errors, entitymanagerCreateAttributeOptionsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitymanagerCreateAttributeOptionsResponse {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("options");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EntitymanagerCreateAttributeOptionsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EntitymanagerCreateAttributeOptionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntitymanagerCreateAttributeOptionsResponse is not found in the empty JSON string", EntitymanagerCreateAttributeOptionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EntitymanagerCreateAttributeOptionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntitymanagerCreateAttributeOptionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            EntitymanagerAttributeOptionErrors.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntitymanagerCreateAttributeOptionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntitymanagerCreateAttributeOptionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntitymanagerCreateAttributeOptionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntitymanagerCreateAttributeOptionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EntitymanagerCreateAttributeOptionsResponse>() {
           @Override
           public void write(JsonWriter out, EntitymanagerCreateAttributeOptionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntitymanagerCreateAttributeOptionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntitymanagerCreateAttributeOptionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntitymanagerCreateAttributeOptionsResponse
  * @throws IOException if the JSON string is invalid with respect to EntitymanagerCreateAttributeOptionsResponse
  */
  public static EntitymanagerCreateAttributeOptionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntitymanagerCreateAttributeOptionsResponse.class);
  }

 /**
  * Convert an instance of EntitymanagerCreateAttributeOptionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

