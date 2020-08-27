/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.JsonSchemaBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.JsonSchemaBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonSchemaBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonSchemaBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(object);
			addAdditionalProperties_java_lang_Boolean_PropertyDescriptor(object);
			addAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(object);
			addAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(object);
			addContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
					object);
			addContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(object);
			addDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMapPropertyDescriptor(
					object);
			addDependencies_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addEnumValue_java_lang_Object_AsListPropertyDescriptor(object);
			addExclusiveMaximum_java_lang_Boolean_PropertyDescriptor(object);
			addExclusiveMinimum_java_lang_Boolean_PropertyDescriptor(object);
			addFormat_java_lang_String_PropertyDescriptor(object);
			addId_java_lang_String_PropertyDescriptor(object);
			addItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
					object);
			addItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(object);
			addMaximum_java_lang_Number_PropertyDescriptor(object);
			addMaxItems_java_lang_Number_PropertyDescriptor(object);
			addMaxLength_java_lang_Number_PropertyDescriptor(object);
			addMaxProperties_java_lang_Number_PropertyDescriptor(object);
			addMinimum_java_lang_Number_PropertyDescriptor(object);
			addMinItems_java_lang_Number_PropertyDescriptor(object);
			addMinLength_java_lang_Number_PropertyDescriptor(object);
			addMinProperties_java_lang_Number_PropertyDescriptor(object);
			addMultipleOf_java_lang_Number_PropertyDescriptor(object);
			addNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
					object);
			addOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(object);
			addPattern_java_lang_String_PropertyDescriptor(object);
			addPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMapPropertyDescriptor(
					object);
			addProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMapPropertyDescriptor(
					object);
			addPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
					object);
			addRef_java_lang_String_PropertyDescriptor(object);
			addRequired_java_lang_String_AsListPropertyDescriptor(object);
			addSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_PropertyDescriptor(object);
			addTitle_java_lang_String_PropertyDescriptor(object);
			addType_software_amazon_awscdk_services_apigateway_JsonSchemaType_PropertyDescriptor(object);
			addType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsListPropertyDescriptor(object);
			addUniqueItems_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Additional Items software amazon awscdk services apigateway Json Schema As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Properties java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalProperties_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_additionalProperties_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_additionalProperties_java_lang_Boolean__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the All Of software amazon awscdk services apigateway Json Schema As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Any Of software amazon awscdk services apigateway Json Schema As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Contains With Json Schema software amazon awscdk services apigateway Json Schema As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Contains software amazon awscdk services apigateway Json Schema As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Definitions java lang String software amazon awscdk services apigateway Json Schema As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dependencies java lang String java lang Object As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencies_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_dependencies_java_lang_String__java_lang_Object_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_dependencies_java_lang_String__java_lang_Object_AsMap_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_description_java_lang_String__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enum Value java lang Object As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumValue_java_lang_Object_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_enumValue_java_lang_Object_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_enumValue_java_lang_Object_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exclusive Maximum java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusiveMaximum_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_exclusiveMaximum_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_exclusiveMaximum_java_lang_Boolean__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exclusive Minimum java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusiveMinimum_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_exclusiveMinimum_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_exclusiveMinimum_java_lang_Boolean__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Format java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormat_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_format_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_format_java_lang_String__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_id_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_id_java_lang_String__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Items With Json Schema software amazon awscdk services apigateway Json Schema As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Items software amazon awscdk services apigateway Json Schema As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Maximum java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximum_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_maximum_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_maximum_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Items java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxItems_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_maxItems_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_maxItems_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Length java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLength_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_maxLength_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_maxLength_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Properties java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxProperties_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_maxProperties_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_maxProperties_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Minimum java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimum_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_minimum_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_minimum_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Items java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinItems_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_minItems_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_minItems_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Length java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinLength_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_minLength_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_minLength_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Properties java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinProperties_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_minProperties_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_minProperties_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Multiple Of java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipleOf_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_multipleOf_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_multipleOf_java_lang_Number__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Not With Json Schema software amazon awscdk services apigateway Json Schema As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the One Of software amazon awscdk services apigateway Json Schema As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pattern java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPattern_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_pattern_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_pattern_java_lang_String__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pattern Properties java lang String software amazon awscdk services apigateway Json Schema As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Properties java lang String software amazon awscdk services apigateway Json Schema As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Names With Json Schema software amazon awscdk services apigateway Json Schema As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ref java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRef_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_ref_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_ref_java_lang_String__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Required java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequired_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_required_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_required_java_lang_String_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Schema software amazon awscdk services apigateway Json Schema Version  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitle_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_title_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_title_java_lang_String__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type software amazon awscdk services apigateway Json Schema Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addType_software_amazon_awscdk_services_apigateway_JsonSchemaType_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_type_software_amazon_awscdk_services_apigateway_JsonSchemaType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_type_software_amazon_awscdk_services_apigateway_JsonSchemaType__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type software amazon awscdk services apigateway Json Schema Type As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_JsonSchemaBuilder_apigateway_type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Unique Items java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniqueItems_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_uniqueItems_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonSchemaBuilder_apigateway_uniqueItems_java_lang_Boolean__feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generated Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_JsonSchemaBuilder_apigateway_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_JsonSchemaBuilder_apigateway_generatedClassName_feature",
								"_UI_JsonSchemaBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Var Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_JsonSchemaBuilder_apigateway_varName_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonSchemaBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_JsonSchemaBuilder_apigateway_identifier_feature",
						"_UI_JsonSchemaBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_JsonSchemaBuilder_apigateway_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_JsonSchemaBuilder_apigateway_additionalCode_feature",
								"_UI_JsonSchemaBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns JsonSchemaBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JsonSchemaBuilder_apigateway"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return  "JsonSchema " + ((JsonSchemaBuilder_apigateway) object).getVarName();
		
				
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(JsonSchemaBuilder_apigateway.class)) {
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
