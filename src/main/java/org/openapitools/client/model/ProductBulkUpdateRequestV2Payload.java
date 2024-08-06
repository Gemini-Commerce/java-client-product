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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.ProductFieldMask;
import org.openapitools.client.model.ProtobufAny;

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
 * ProductBulkUpdateRequestV2Payload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-06T13:40:57.069678376Z[Etc/UTC]")
public class ProductBulkUpdateRequestV2Payload {
  public static final String SERIALIZED_NAME_UPDATE_MASK = "updateMask";
  @SerializedName(SERIALIZED_NAME_UPDATE_MASK)
  private ProductFieldMask updateMask;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, ProtobufAny> attributes = new HashMap<>();

  public ProductBulkUpdateRequestV2Payload() {
  }

  public ProductBulkUpdateRequestV2Payload updateMask(ProductFieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

   /**
   * Get updateMask
   * @return updateMask
  **/
  @javax.annotation.Nullable
  public ProductFieldMask getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(ProductFieldMask updateMask) {
    this.updateMask = updateMask;
  }


  public ProductBulkUpdateRequestV2Payload attributes(Map<String, ProtobufAny> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProductBulkUpdateRequestV2Payload putAttributesItem(String key, ProtobufAny attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public Map<String, ProtobufAny> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, ProtobufAny> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBulkUpdateRequestV2Payload productBulkUpdateRequestV2Payload = (ProductBulkUpdateRequestV2Payload) o;
    return Objects.equals(this.updateMask, productBulkUpdateRequestV2Payload.updateMask) &&
        Objects.equals(this.attributes, productBulkUpdateRequestV2Payload.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateMask, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBulkUpdateRequestV2Payload {\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("updateMask");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductBulkUpdateRequestV2Payload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductBulkUpdateRequestV2Payload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductBulkUpdateRequestV2Payload is not found in the empty JSON string", ProductBulkUpdateRequestV2Payload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductBulkUpdateRequestV2Payload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductBulkUpdateRequestV2Payload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `updateMask`
      if (jsonObj.get("updateMask") != null && !jsonObj.get("updateMask").isJsonNull()) {
        ProductFieldMask.validateJsonElement(jsonObj.get("updateMask"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductBulkUpdateRequestV2Payload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductBulkUpdateRequestV2Payload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductBulkUpdateRequestV2Payload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductBulkUpdateRequestV2Payload.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductBulkUpdateRequestV2Payload>() {
           @Override
           public void write(JsonWriter out, ProductBulkUpdateRequestV2Payload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductBulkUpdateRequestV2Payload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductBulkUpdateRequestV2Payload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductBulkUpdateRequestV2Payload
  * @throws IOException if the JSON string is invalid with respect to ProductBulkUpdateRequestV2Payload
  */
  public static ProductBulkUpdateRequestV2Payload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductBulkUpdateRequestV2Payload.class);
  }

 /**
  * Convert an instance of ProductBulkUpdateRequestV2Payload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

