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
import org.openapitools.client.model.ProductAttributeToEnrich;

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
 * ProductUpdateProductWithAIRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-06T13:40:57.069678376Z[Etc/UTC]")
public class ProductUpdateProductWithAIRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_SKIP_REVIEW = "skipReview";
  @SerializedName(SERIALIZED_NAME_SKIP_REVIEW)
  private Boolean skipReview;

  public static final String SERIALIZED_NAME_ATTRIBUTES_TO_ENRICH = "attributesToEnrich";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_TO_ENRICH)
  private List<ProductAttributeToEnrich> attributesToEnrich;

  public ProductUpdateProductWithAIRequest() {
  }

  public ProductUpdateProductWithAIRequest tenantId(String tenantId) {
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


  public ProductUpdateProductWithAIRequest id(String id) {
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


  public ProductUpdateProductWithAIRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public ProductUpdateProductWithAIRequest skipReview(Boolean skipReview) {
    this.skipReview = skipReview;
    return this;
  }

   /**
   * Get skipReview
   * @return skipReview
  **/
  @javax.annotation.Nullable
  public Boolean getSkipReview() {
    return skipReview;
  }

  public void setSkipReview(Boolean skipReview) {
    this.skipReview = skipReview;
  }


  public ProductUpdateProductWithAIRequest attributesToEnrich(List<ProductAttributeToEnrich> attributesToEnrich) {
    this.attributesToEnrich = attributesToEnrich;
    return this;
  }

  public ProductUpdateProductWithAIRequest addAttributesToEnrichItem(ProductAttributeToEnrich attributesToEnrichItem) {
    if (this.attributesToEnrich == null) {
      this.attributesToEnrich = new ArrayList<>();
    }
    this.attributesToEnrich.add(attributesToEnrichItem);
    return this;
  }

   /**
   * Get attributesToEnrich
   * @return attributesToEnrich
  **/
  @javax.annotation.Nullable
  public List<ProductAttributeToEnrich> getAttributesToEnrich() {
    return attributesToEnrich;
  }

  public void setAttributesToEnrich(List<ProductAttributeToEnrich> attributesToEnrich) {
    this.attributesToEnrich = attributesToEnrich;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductUpdateProductWithAIRequest productUpdateProductWithAIRequest = (ProductUpdateProductWithAIRequest) o;
    return Objects.equals(this.tenantId, productUpdateProductWithAIRequest.tenantId) &&
        Objects.equals(this.id, productUpdateProductWithAIRequest.id) &&
        Objects.equals(this.locale, productUpdateProductWithAIRequest.locale) &&
        Objects.equals(this.skipReview, productUpdateProductWithAIRequest.skipReview) &&
        Objects.equals(this.attributesToEnrich, productUpdateProductWithAIRequest.attributesToEnrich);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, id, locale, skipReview, attributesToEnrich);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUpdateProductWithAIRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    skipReview: ").append(toIndentedString(skipReview)).append("\n");
    sb.append("    attributesToEnrich: ").append(toIndentedString(attributesToEnrich)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("locale");
    openapiFields.add("skipReview");
    openapiFields.add("attributesToEnrich");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductUpdateProductWithAIRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductUpdateProductWithAIRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductUpdateProductWithAIRequest is not found in the empty JSON string", ProductUpdateProductWithAIRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductUpdateProductWithAIRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductUpdateProductWithAIRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if (jsonObj.get("attributesToEnrich") != null && !jsonObj.get("attributesToEnrich").isJsonNull()) {
        JsonArray jsonArrayattributesToEnrich = jsonObj.getAsJsonArray("attributesToEnrich");
        if (jsonArrayattributesToEnrich != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributesToEnrich").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributesToEnrich` to be an array in the JSON string but got `%s`", jsonObj.get("attributesToEnrich").toString()));
          }

          // validate the optional field `attributesToEnrich` (array)
          for (int i = 0; i < jsonArrayattributesToEnrich.size(); i++) {
            ProductAttributeToEnrich.validateJsonElement(jsonArrayattributesToEnrich.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductUpdateProductWithAIRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductUpdateProductWithAIRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductUpdateProductWithAIRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductUpdateProductWithAIRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductUpdateProductWithAIRequest>() {
           @Override
           public void write(JsonWriter out, ProductUpdateProductWithAIRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductUpdateProductWithAIRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductUpdateProductWithAIRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductUpdateProductWithAIRequest
  * @throws IOException if the JSON string is invalid with respect to ProductUpdateProductWithAIRequest
  */
  public static ProductUpdateProductWithAIRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductUpdateProductWithAIRequest.class);
  }

 /**
  * Convert an instance of ProductUpdateProductWithAIRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

