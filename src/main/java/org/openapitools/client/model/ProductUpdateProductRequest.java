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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ProductFieldMask;
import org.openapitools.client.model.ProductLocalizedText;
import org.openapitools.client.model.ProductProductVariant;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Product.JSON;

/**
 * ProductUpdateProductRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:24:03.179733008Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductUpdateProductRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ATTRIBUTES_MASK = "attributesMask";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_MASK)
  private ProductFieldMask attributesMask;

  public static final String SERIALIZED_NAME_URL_KEY = "urlKey";
  @SerializedName(SERIALIZED_NAME_URL_KEY)
  private ProductLocalizedText urlKey;

  public static final String SERIALIZED_NAME_MAX_SALEABLE_QUANTITY = "maxSaleableQuantity";
  @SerializedName(SERIALIZED_NAME_MAX_SALEABLE_QUANTITY)
  private Long maxSaleableQuantity;

  public static final String SERIALIZED_NAME_MEDIA_VARIANT_ATTRIBUTES = "mediaVariantAttributes";
  @SerializedName(SERIALIZED_NAME_MEDIA_VARIANT_ATTRIBUTES)
  private List<String> mediaVariantAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, ProtobufAny> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_VARIANTS = "variants";
  @SerializedName(SERIALIZED_NAME_VARIANTS)
  private Map<String, ProductProductVariant> variants = new HashMap<>();

  public static final String SERIALIZED_NAME_IN_REVIEW = "inReview";
  @SerializedName(SERIALIZED_NAME_IN_REVIEW)
  private Boolean inReview;

  public ProductUpdateProductRequest() {
  }

  public ProductUpdateProductRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ProductUpdateProductRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ProductUpdateProductRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public ProductUpdateProductRequest attributesMask(ProductFieldMask attributesMask) {
    this.attributesMask = attributesMask;
    return this;
  }

  /**
   * Get attributesMask
   * @return attributesMask
   */
  @javax.annotation.Nullable
  public ProductFieldMask getAttributesMask() {
    return attributesMask;
  }

  public void setAttributesMask(ProductFieldMask attributesMask) {
    this.attributesMask = attributesMask;
  }


  public ProductUpdateProductRequest urlKey(ProductLocalizedText urlKey) {
    this.urlKey = urlKey;
    return this;
  }

  /**
   * Get urlKey
   * @return urlKey
   */
  @javax.annotation.Nullable
  public ProductLocalizedText getUrlKey() {
    return urlKey;
  }

  public void setUrlKey(ProductLocalizedText urlKey) {
    this.urlKey = urlKey;
  }


  public ProductUpdateProductRequest maxSaleableQuantity(Long maxSaleableQuantity) {
    this.maxSaleableQuantity = maxSaleableQuantity;
    return this;
  }

  /**
   * Get maxSaleableQuantity
   * @return maxSaleableQuantity
   */
  @javax.annotation.Nullable
  public Long getMaxSaleableQuantity() {
    return maxSaleableQuantity;
  }

  public void setMaxSaleableQuantity(Long maxSaleableQuantity) {
    this.maxSaleableQuantity = maxSaleableQuantity;
  }


  public ProductUpdateProductRequest mediaVariantAttributes(List<String> mediaVariantAttributes) {
    this.mediaVariantAttributes = mediaVariantAttributes;
    return this;
  }

  public ProductUpdateProductRequest addMediaVariantAttributesItem(String mediaVariantAttributesItem) {
    if (this.mediaVariantAttributes == null) {
      this.mediaVariantAttributes = new ArrayList<>();
    }
    this.mediaVariantAttributes.add(mediaVariantAttributesItem);
    return this;
  }

  /**
   * Get mediaVariantAttributes
   * @return mediaVariantAttributes
   */
  @javax.annotation.Nullable
  public List<String> getMediaVariantAttributes() {
    return mediaVariantAttributes;
  }

  public void setMediaVariantAttributes(List<String> mediaVariantAttributes) {
    this.mediaVariantAttributes = mediaVariantAttributes;
  }


  public ProductUpdateProductRequest attributes(Map<String, ProtobufAny> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProductUpdateProductRequest putAttributesItem(String key, ProtobufAny attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public Map<String, ProtobufAny> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, ProtobufAny> attributes) {
    this.attributes = attributes;
  }


  public ProductUpdateProductRequest variants(Map<String, ProductProductVariant> variants) {
    this.variants = variants;
    return this;
  }

  public ProductUpdateProductRequest putVariantsItem(String key, ProductProductVariant variantsItem) {
    if (this.variants == null) {
      this.variants = new HashMap<>();
    }
    this.variants.put(key, variantsItem);
    return this;
  }

  /**
   * Get variants
   * @return variants
   */
  @javax.annotation.Nullable
  public Map<String, ProductProductVariant> getVariants() {
    return variants;
  }

  public void setVariants(Map<String, ProductProductVariant> variants) {
    this.variants = variants;
  }


  public ProductUpdateProductRequest inReview(Boolean inReview) {
    this.inReview = inReview;
    return this;
  }

  /**
   * Get inReview
   * @return inReview
   */
  @javax.annotation.Nullable
  public Boolean getInReview() {
    return inReview;
  }

  public void setInReview(Boolean inReview) {
    this.inReview = inReview;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ProductUpdateProductRequest instance itself
   */
  public ProductUpdateProductRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductUpdateProductRequest productUpdateProductRequest = (ProductUpdateProductRequest) o;
    return Objects.equals(this.tenantId, productUpdateProductRequest.tenantId) &&
        Objects.equals(this.id, productUpdateProductRequest.id) &&
        Objects.equals(this.code, productUpdateProductRequest.code) &&
        Objects.equals(this.attributesMask, productUpdateProductRequest.attributesMask) &&
        Objects.equals(this.urlKey, productUpdateProductRequest.urlKey) &&
        Objects.equals(this.maxSaleableQuantity, productUpdateProductRequest.maxSaleableQuantity) &&
        Objects.equals(this.mediaVariantAttributes, productUpdateProductRequest.mediaVariantAttributes) &&
        Objects.equals(this.attributes, productUpdateProductRequest.attributes) &&
        Objects.equals(this.variants, productUpdateProductRequest.variants) &&
        Objects.equals(this.inReview, productUpdateProductRequest.inReview)&&
        Objects.equals(this.additionalProperties, productUpdateProductRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, id, code, attributesMask, urlKey, maxSaleableQuantity, mediaVariantAttributes, attributes, variants, inReview, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUpdateProductRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    attributesMask: ").append(toIndentedString(attributesMask)).append("\n");
    sb.append("    urlKey: ").append(toIndentedString(urlKey)).append("\n");
    sb.append("    maxSaleableQuantity: ").append(toIndentedString(maxSaleableQuantity)).append("\n");
    sb.append("    mediaVariantAttributes: ").append(toIndentedString(mediaVariantAttributes)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    inReview: ").append(toIndentedString(inReview)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("attributesMask");
    openapiFields.add("urlKey");
    openapiFields.add("maxSaleableQuantity");
    openapiFields.add("mediaVariantAttributes");
    openapiFields.add("attributes");
    openapiFields.add("variants");
    openapiFields.add("inReview");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductUpdateProductRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductUpdateProductRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductUpdateProductRequest is not found in the empty JSON string", ProductUpdateProductRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field `attributesMask`
      if (jsonObj.get("attributesMask") != null && !jsonObj.get("attributesMask").isJsonNull()) {
        ProductFieldMask.validateJsonElement(jsonObj.get("attributesMask"));
      }
      // validate the optional field `urlKey`
      if (jsonObj.get("urlKey") != null && !jsonObj.get("urlKey").isJsonNull()) {
        ProductLocalizedText.validateJsonElement(jsonObj.get("urlKey"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mediaVariantAttributes") != null && !jsonObj.get("mediaVariantAttributes").isJsonNull() && !jsonObj.get("mediaVariantAttributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaVariantAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("mediaVariantAttributes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductUpdateProductRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductUpdateProductRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductUpdateProductRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductUpdateProductRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductUpdateProductRequest>() {
           @Override
           public void write(JsonWriter out, ProductUpdateProductRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductUpdateProductRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProductUpdateProductRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductUpdateProductRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductUpdateProductRequest
   * @throws IOException if the JSON string is invalid with respect to ProductUpdateProductRequest
   */
  public static ProductUpdateProductRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductUpdateProductRequest.class);
  }

  /**
   * Convert an instance of ProductUpdateProductRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

