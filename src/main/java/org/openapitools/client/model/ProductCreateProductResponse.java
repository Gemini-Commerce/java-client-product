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
import org.openapitools.client.model.ProductAttributeResponseError;
import org.openapitools.client.model.ProductProductResponseError;

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
 * The CreateProductResponse message is used to provide a response after creating a product within the system. It includes fields that indicate the success of the product creation and any errors encountered during the process.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-06T13:40:57.069678376Z[Etc/UTC]")
public class ProductCreateProductResponse {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PRODUCT_ERRORS = "productErrors";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ERRORS)
  private List<ProductProductResponseError> productErrors;

  public static final String SERIALIZED_NAME_ATTRIBUTE_ERRORS = "attributeErrors";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ERRORS)
  private List<ProductAttributeResponseError> attributeErrors;

  public ProductCreateProductResponse() {
  }

  public ProductCreateProductResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicates whether the product creation was successful or not.
   * @return success
  **/
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ProductCreateProductResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Represents the ID of the created product.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ProductCreateProductResponse productErrors(List<ProductProductResponseError> productErrors) {
    this.productErrors = productErrors;
    return this;
  }

  public ProductCreateProductResponse addProductErrorsItem(ProductProductResponseError productErrorsItem) {
    if (this.productErrors == null) {
      this.productErrors = new ArrayList<>();
    }
    this.productErrors.add(productErrorsItem);
    return this;
  }

   /**
   * Contains a list of ProductResponseError messages, indicating any errors related to the product creation.
   * @return productErrors
  **/
  @javax.annotation.Nullable
  public List<ProductProductResponseError> getProductErrors() {
    return productErrors;
  }

  public void setProductErrors(List<ProductProductResponseError> productErrors) {
    this.productErrors = productErrors;
  }


  public ProductCreateProductResponse attributeErrors(List<ProductAttributeResponseError> attributeErrors) {
    this.attributeErrors = attributeErrors;
    return this;
  }

  public ProductCreateProductResponse addAttributeErrorsItem(ProductAttributeResponseError attributeErrorsItem) {
    if (this.attributeErrors == null) {
      this.attributeErrors = new ArrayList<>();
    }
    this.attributeErrors.add(attributeErrorsItem);
    return this;
  }

   /**
   * Contains a list of AttributeResponseError messages, indicating any errors related to the attributes of the product.
   * @return attributeErrors
  **/
  @javax.annotation.Nullable
  public List<ProductAttributeResponseError> getAttributeErrors() {
    return attributeErrors;
  }

  public void setAttributeErrors(List<ProductAttributeResponseError> attributeErrors) {
    this.attributeErrors = attributeErrors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCreateProductResponse productCreateProductResponse = (ProductCreateProductResponse) o;
    return Objects.equals(this.success, productCreateProductResponse.success) &&
        Objects.equals(this.id, productCreateProductResponse.id) &&
        Objects.equals(this.productErrors, productCreateProductResponse.productErrors) &&
        Objects.equals(this.attributeErrors, productCreateProductResponse.attributeErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, id, productErrors, attributeErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreateProductResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productErrors: ").append(toIndentedString(productErrors)).append("\n");
    sb.append("    attributeErrors: ").append(toIndentedString(attributeErrors)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("id");
    openapiFields.add("productErrors");
    openapiFields.add("attributeErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductCreateProductResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductCreateProductResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductCreateProductResponse is not found in the empty JSON string", ProductCreateProductResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductCreateProductResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductCreateProductResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("productErrors") != null && !jsonObj.get("productErrors").isJsonNull()) {
        JsonArray jsonArrayproductErrors = jsonObj.getAsJsonArray("productErrors");
        if (jsonArrayproductErrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productErrors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productErrors` to be an array in the JSON string but got `%s`", jsonObj.get("productErrors").toString()));
          }

          // validate the optional field `productErrors` (array)
          for (int i = 0; i < jsonArrayproductErrors.size(); i++) {
            ProductProductResponseError.validateJsonElement(jsonArrayproductErrors.get(i));
          };
        }
      }
      if (jsonObj.get("attributeErrors") != null && !jsonObj.get("attributeErrors").isJsonNull()) {
        JsonArray jsonArrayattributeErrors = jsonObj.getAsJsonArray("attributeErrors");
        if (jsonArrayattributeErrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributeErrors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributeErrors` to be an array in the JSON string but got `%s`", jsonObj.get("attributeErrors").toString()));
          }

          // validate the optional field `attributeErrors` (array)
          for (int i = 0; i < jsonArrayattributeErrors.size(); i++) {
            ProductAttributeResponseError.validateJsonElement(jsonArrayattributeErrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductCreateProductResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductCreateProductResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductCreateProductResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductCreateProductResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductCreateProductResponse>() {
           @Override
           public void write(JsonWriter out, ProductCreateProductResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductCreateProductResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductCreateProductResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCreateProductResponse
  * @throws IOException if the JSON string is invalid with respect to ProductCreateProductResponse
  */
  public static ProductCreateProductResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCreateProductResponse.class);
  }

 /**
  * Convert an instance of ProductCreateProductResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

