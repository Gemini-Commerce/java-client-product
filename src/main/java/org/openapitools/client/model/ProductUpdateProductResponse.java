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
 * ProductUpdateProductResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T10:49:30.026307733Z[Etc/UTC]")
public class ProductUpdateProductResponse {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_PRODUCT_ERRORS = "productErrors";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ERRORS)
  private List<ProductProductResponseError> productErrors;

  public static final String SERIALIZED_NAME_ATTRIBUTE_ERRORS = "attributeErrors";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ERRORS)
  private List<ProductAttributeResponseError> attributeErrors;

  public ProductUpdateProductResponse() {
  }

  public ProductUpdateProductResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ProductUpdateProductResponse productErrors(List<ProductProductResponseError> productErrors) {
    this.productErrors = productErrors;
    return this;
  }

  public ProductUpdateProductResponse addProductErrorsItem(ProductProductResponseError productErrorsItem) {
    if (this.productErrors == null) {
      this.productErrors = new ArrayList<>();
    }
    this.productErrors.add(productErrorsItem);
    return this;
  }

   /**
   * Get productErrors
   * @return productErrors
  **/
  @javax.annotation.Nullable
  public List<ProductProductResponseError> getProductErrors() {
    return productErrors;
  }

  public void setProductErrors(List<ProductProductResponseError> productErrors) {
    this.productErrors = productErrors;
  }


  public ProductUpdateProductResponse attributeErrors(List<ProductAttributeResponseError> attributeErrors) {
    this.attributeErrors = attributeErrors;
    return this;
  }

  public ProductUpdateProductResponse addAttributeErrorsItem(ProductAttributeResponseError attributeErrorsItem) {
    if (this.attributeErrors == null) {
      this.attributeErrors = new ArrayList<>();
    }
    this.attributeErrors.add(attributeErrorsItem);
    return this;
  }

   /**
   * Get attributeErrors
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
    ProductUpdateProductResponse productUpdateProductResponse = (ProductUpdateProductResponse) o;
    return Objects.equals(this.success, productUpdateProductResponse.success) &&
        Objects.equals(this.productErrors, productUpdateProductResponse.productErrors) &&
        Objects.equals(this.attributeErrors, productUpdateProductResponse.attributeErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, productErrors, attributeErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUpdateProductResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("productErrors");
    openapiFields.add("attributeErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductUpdateProductResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductUpdateProductResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductUpdateProductResponse is not found in the empty JSON string", ProductUpdateProductResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductUpdateProductResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductUpdateProductResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
       if (!ProductUpdateProductResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductUpdateProductResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductUpdateProductResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductUpdateProductResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductUpdateProductResponse>() {
           @Override
           public void write(JsonWriter out, ProductUpdateProductResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductUpdateProductResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductUpdateProductResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductUpdateProductResponse
  * @throws IOException if the JSON string is invalid with respect to ProductUpdateProductResponse
  */
  public static ProductUpdateProductResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductUpdateProductResponse.class);
  }

 /**
  * Convert an instance of ProductUpdateProductResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
