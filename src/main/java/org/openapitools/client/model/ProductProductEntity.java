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
import org.openapitools.client.model.ProductAssets;
import org.openapitools.client.model.ProductLocalizedText;
import org.openapitools.client.model.ProductMediaGallery;
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
 * ProductProductEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:42:17.531571900Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductProductEntity {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTITY_CODE = "entityCode";
  @SerializedName(SERIALIZED_NAME_ENTITY_CODE)
  private String entityCode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_VARIANT_ATTRIBUTES = "variantAttributes";
  @SerializedName(SERIALIZED_NAME_VARIANT_ATTRIBUTES)
  private List<String> variantAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_CONFIGURABLE = "isConfigurable";
  @SerializedName(SERIALIZED_NAME_IS_CONFIGURABLE)
  private Boolean isConfigurable;

  public static final String SERIALIZED_NAME_IS_VIRTUAL = "isVirtual";
  @SerializedName(SERIALIZED_NAME_IS_VIRTUAL)
  private Boolean isVirtual;

  public static final String SERIALIZED_NAME_IS_GIFTCARD = "isGiftcard";
  @SerializedName(SERIALIZED_NAME_IS_GIFTCARD)
  private Boolean isGiftcard;

  public static final String SERIALIZED_NAME_HAS_CONFIGURATOR = "hasConfigurator";
  @SerializedName(SERIALIZED_NAME_HAS_CONFIGURATOR)
  private Boolean hasConfigurator;

  public static final String SERIALIZED_NAME_URL_KEY = "urlKey";
  @SerializedName(SERIALIZED_NAME_URL_KEY)
  private ProductLocalizedText urlKey;

  public static final String SERIALIZED_NAME_MEDIA_VARIANT_ATTRIBUTES = "mediaVariantAttributes";
  @SerializedName(SERIALIZED_NAME_MEDIA_VARIANT_ATTRIBUTES)
  private List<String> mediaVariantAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, ProtobufAny> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_VARIANTS = "variants";
  @SerializedName(SERIALIZED_NAME_VARIANTS)
  private Map<String, ProductProductVariant> variants = new HashMap<>();

  public static final String SERIALIZED_NAME_MEDIA_GALLERY = "mediaGallery";
  @SerializedName(SERIALIZED_NAME_MEDIA_GALLERY)
  private ProductMediaGallery mediaGallery;

  public static final String SERIALIZED_NAME_MAX_SALEABLE_QUANTITY = "maxSaleableQuantity";
  @SerializedName(SERIALIZED_NAME_MAX_SALEABLE_QUANTITY)
  private Long maxSaleableQuantity;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private ProductAssets assets;

  public static final String SERIALIZED_NAME_IN_REVIEW = "inReview";
  @SerializedName(SERIALIZED_NAME_IN_REVIEW)
  private Boolean inReview;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public ProductProductEntity() {
  }

  public ProductProductEntity(
     String grn
  ) {
    this();
    this.grn = grn;
  }

  public ProductProductEntity tenantId(String tenantId) {
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


  /**
   * Get grn
   * @return grn
   */
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }



  public ProductProductEntity entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @javax.annotation.Nullable
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public ProductProductEntity entityCode(String entityCode) {
    this.entityCode = entityCode;
    return this;
  }

  /**
   * Get entityCode
   * @return entityCode
   */
  @javax.annotation.Nullable
  public String getEntityCode() {
    return entityCode;
  }

  public void setEntityCode(String entityCode) {
    this.entityCode = entityCode;
  }


  public ProductProductEntity id(String id) {
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


  public ProductProductEntity code(String code) {
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


  public ProductProductEntity variantAttributes(List<String> variantAttributes) {
    this.variantAttributes = variantAttributes;
    return this;
  }

  public ProductProductEntity addVariantAttributesItem(String variantAttributesItem) {
    if (this.variantAttributes == null) {
      this.variantAttributes = new ArrayList<>();
    }
    this.variantAttributes.add(variantAttributesItem);
    return this;
  }

  /**
   * Get variantAttributes
   * @return variantAttributes
   */
  @javax.annotation.Nullable
  public List<String> getVariantAttributes() {
    return variantAttributes;
  }

  public void setVariantAttributes(List<String> variantAttributes) {
    this.variantAttributes = variantAttributes;
  }


  public ProductProductEntity isConfigurable(Boolean isConfigurable) {
    this.isConfigurable = isConfigurable;
    return this;
  }

  /**
   * Get isConfigurable
   * @return isConfigurable
   */
  @javax.annotation.Nullable
  public Boolean getIsConfigurable() {
    return isConfigurable;
  }

  public void setIsConfigurable(Boolean isConfigurable) {
    this.isConfigurable = isConfigurable;
  }


  public ProductProductEntity isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

  /**
   * Get isVirtual
   * @return isVirtual
   */
  @javax.annotation.Nullable
  public Boolean getIsVirtual() {
    return isVirtual;
  }

  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }


  public ProductProductEntity isGiftcard(Boolean isGiftcard) {
    this.isGiftcard = isGiftcard;
    return this;
  }

  /**
   * Get isGiftcard
   * @return isGiftcard
   */
  @javax.annotation.Nullable
  public Boolean getIsGiftcard() {
    return isGiftcard;
  }

  public void setIsGiftcard(Boolean isGiftcard) {
    this.isGiftcard = isGiftcard;
  }


  public ProductProductEntity hasConfigurator(Boolean hasConfigurator) {
    this.hasConfigurator = hasConfigurator;
    return this;
  }

  /**
   * Get hasConfigurator
   * @return hasConfigurator
   */
  @javax.annotation.Nullable
  public Boolean getHasConfigurator() {
    return hasConfigurator;
  }

  public void setHasConfigurator(Boolean hasConfigurator) {
    this.hasConfigurator = hasConfigurator;
  }


  public ProductProductEntity urlKey(ProductLocalizedText urlKey) {
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


  public ProductProductEntity mediaVariantAttributes(List<String> mediaVariantAttributes) {
    this.mediaVariantAttributes = mediaVariantAttributes;
    return this;
  }

  public ProductProductEntity addMediaVariantAttributesItem(String mediaVariantAttributesItem) {
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


  public ProductProductEntity attributes(Map<String, ProtobufAny> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProductProductEntity putAttributesItem(String key, ProtobufAny attributesItem) {
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


  public ProductProductEntity variants(Map<String, ProductProductVariant> variants) {
    this.variants = variants;
    return this;
  }

  public ProductProductEntity putVariantsItem(String key, ProductProductVariant variantsItem) {
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


  public ProductProductEntity mediaGallery(ProductMediaGallery mediaGallery) {
    this.mediaGallery = mediaGallery;
    return this;
  }

  /**
   * Get mediaGallery
   * @return mediaGallery
   */
  @javax.annotation.Nullable
  public ProductMediaGallery getMediaGallery() {
    return mediaGallery;
  }

  public void setMediaGallery(ProductMediaGallery mediaGallery) {
    this.mediaGallery = mediaGallery;
  }


  public ProductProductEntity maxSaleableQuantity(Long maxSaleableQuantity) {
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


  public ProductProductEntity assets(ProductAssets assets) {
    this.assets = assets;
    return this;
  }

  /**
   * Get assets
   * @return assets
   */
  @javax.annotation.Nullable
  public ProductAssets getAssets() {
    return assets;
  }

  public void setAssets(ProductAssets assets) {
    this.assets = assets;
  }


  public ProductProductEntity inReview(Boolean inReview) {
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


  public ProductProductEntity createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ProductProductEntity updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return the ProductProductEntity instance itself
   */
  public ProductProductEntity putAdditionalProperty(String key, Object value) {
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
    ProductProductEntity productProductEntity = (ProductProductEntity) o;
    return Objects.equals(this.tenantId, productProductEntity.tenantId) &&
        Objects.equals(this.grn, productProductEntity.grn) &&
        Objects.equals(this.entityType, productProductEntity.entityType) &&
        Objects.equals(this.entityCode, productProductEntity.entityCode) &&
        Objects.equals(this.id, productProductEntity.id) &&
        Objects.equals(this.code, productProductEntity.code) &&
        Objects.equals(this.variantAttributes, productProductEntity.variantAttributes) &&
        Objects.equals(this.isConfigurable, productProductEntity.isConfigurable) &&
        Objects.equals(this.isVirtual, productProductEntity.isVirtual) &&
        Objects.equals(this.isGiftcard, productProductEntity.isGiftcard) &&
        Objects.equals(this.hasConfigurator, productProductEntity.hasConfigurator) &&
        Objects.equals(this.urlKey, productProductEntity.urlKey) &&
        Objects.equals(this.mediaVariantAttributes, productProductEntity.mediaVariantAttributes) &&
        Objects.equals(this.attributes, productProductEntity.attributes) &&
        Objects.equals(this.variants, productProductEntity.variants) &&
        Objects.equals(this.mediaGallery, productProductEntity.mediaGallery) &&
        Objects.equals(this.maxSaleableQuantity, productProductEntity.maxSaleableQuantity) &&
        Objects.equals(this.assets, productProductEntity.assets) &&
        Objects.equals(this.inReview, productProductEntity.inReview) &&
        Objects.equals(this.createdAt, productProductEntity.createdAt) &&
        Objects.equals(this.updatedAt, productProductEntity.updatedAt)&&
        Objects.equals(this.additionalProperties, productProductEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, grn, entityType, entityCode, id, code, variantAttributes, isConfigurable, isVirtual, isGiftcard, hasConfigurator, urlKey, mediaVariantAttributes, attributes, variants, mediaGallery, maxSaleableQuantity, assets, inReview, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductProductEntity {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityCode: ").append(toIndentedString(entityCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    variantAttributes: ").append(toIndentedString(variantAttributes)).append("\n");
    sb.append("    isConfigurable: ").append(toIndentedString(isConfigurable)).append("\n");
    sb.append("    isVirtual: ").append(toIndentedString(isVirtual)).append("\n");
    sb.append("    isGiftcard: ").append(toIndentedString(isGiftcard)).append("\n");
    sb.append("    hasConfigurator: ").append(toIndentedString(hasConfigurator)).append("\n");
    sb.append("    urlKey: ").append(toIndentedString(urlKey)).append("\n");
    sb.append("    mediaVariantAttributes: ").append(toIndentedString(mediaVariantAttributes)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    mediaGallery: ").append(toIndentedString(mediaGallery)).append("\n");
    sb.append("    maxSaleableQuantity: ").append(toIndentedString(maxSaleableQuantity)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    inReview: ").append(toIndentedString(inReview)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("grn");
    openapiFields.add("entityType");
    openapiFields.add("entityCode");
    openapiFields.add("id");
    openapiFields.add("code");
    openapiFields.add("variantAttributes");
    openapiFields.add("isConfigurable");
    openapiFields.add("isVirtual");
    openapiFields.add("isGiftcard");
    openapiFields.add("hasConfigurator");
    openapiFields.add("urlKey");
    openapiFields.add("mediaVariantAttributes");
    openapiFields.add("attributes");
    openapiFields.add("variants");
    openapiFields.add("mediaGallery");
    openapiFields.add("maxSaleableQuantity");
    openapiFields.add("assets");
    openapiFields.add("inReview");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductProductEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductProductEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductProductEntity is not found in the empty JSON string", ProductProductEntity.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("entityType") != null && !jsonObj.get("entityType").isJsonNull()) && !jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if ((jsonObj.get("entityCode") != null && !jsonObj.get("entityCode").isJsonNull()) && !jsonObj.get("entityCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityCode").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("variantAttributes") != null && !jsonObj.get("variantAttributes").isJsonNull() && !jsonObj.get("variantAttributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variantAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("variantAttributes").toString()));
      }
      // validate the optional field `urlKey`
      if (jsonObj.get("urlKey") != null && !jsonObj.get("urlKey").isJsonNull()) {
        ProductLocalizedText.validateJsonElement(jsonObj.get("urlKey"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mediaVariantAttributes") != null && !jsonObj.get("mediaVariantAttributes").isJsonNull() && !jsonObj.get("mediaVariantAttributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaVariantAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("mediaVariantAttributes").toString()));
      }
      // validate the optional field `mediaGallery`
      if (jsonObj.get("mediaGallery") != null && !jsonObj.get("mediaGallery").isJsonNull()) {
        ProductMediaGallery.validateJsonElement(jsonObj.get("mediaGallery"));
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        ProductAssets.validateJsonElement(jsonObj.get("assets"));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductProductEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductProductEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductProductEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductProductEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductProductEntity>() {
           @Override
           public void write(JsonWriter out, ProductProductEntity value) throws IOException {
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
           public ProductProductEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProductProductEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ProductProductEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductProductEntity
   * @throws IOException if the JSON string is invalid with respect to ProductProductEntity
   */
  public static ProductProductEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductProductEntity.class);
  }

  /**
   * Convert an instance of ProductProductEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

