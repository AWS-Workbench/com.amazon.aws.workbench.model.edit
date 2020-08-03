/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.RateLimitedApiKeyBuilder_apigateway;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link apigateway.RateLimitedApiKeyBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RateLimitedApiKeyBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateLimitedApiKeyBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReferencePropertyDescriptor(
					object);
			addDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReferencePropertyDescriptor(
					object);
			addDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReferencePropertyDescriptor(
					object);
			addApiKeyName_java_lang_String_PropertyDescriptor(object);
			addValue_java_lang_String_PropertyDescriptor(object);
			addCustomerId_java_lang_String_PropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addGenerateDistinctId_java_lang_Boolean_PropertyDescriptor(object);
			addResources_software_amazon_awscdk_services_apigateway_RestApi_AsListPropertyDescriptor(object);
			addApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsListPropertyDescriptor(
					object);
			addQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReferencePropertyDescriptor(
					object);
			addThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Cors Preflight Options With Cors Options software amazon awscdk services apigateway Cors Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RateLimitedApiKeyBuilder_apigateway_defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Integration With Integration software amazon awscdk services apigateway Integration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RateLimitedApiKeyBuilder_apigateway_defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Method Options With Method Options software amazon awscdk services apigateway Method Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RateLimitedApiKeyBuilder_apigateway_defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Api Key Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiKeyName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_apiKeyName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_apiKeyName_java_lang_String__feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Value java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValue_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_value_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_value_java_lang_String__feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Customer Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomerId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_customerId_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_customerId_java_lang_String__feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_description_java_lang_String__feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_enabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_enabled_java_lang_Boolean__feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generate Distinct Id java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateDistinctId_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_generateDistinctId_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_generateDistinctId_java_lang_Boolean__feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resources software amazon awscdk services apigateway Rest Api As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResources_software_amazon_awscdk_services_apigateway_RestApi_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RateLimitedApiKeyBuilder_apigateway_resources_software_amazon_awscdk_services_apigateway_RestApi_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_resources_software_amazon_awscdk_services_apigateway_RestApi_AsList_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Api Stages software amazon awscdk services apigateway Usage Plan Per Api Stage As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RateLimitedApiKeyBuilder_apigateway_apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_apiStages_software_amazon_awscdk_services_apigateway_UsagePlanPerApiStage_AsList_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Quota With Quota Settings software amazon awscdk services apigateway Quota Settings As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RateLimitedApiKeyBuilder_apigateway_quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_quotaWithQuotaSettings_software_amazon_awscdk_services_apigateway_QuotaSettings_AsReference_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Throttle With Throttle Settings software amazon awscdk services apigateway Throttle Settings As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThrottleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RateLimitedApiKeyBuilder_apigateway_throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_throttleWithThrottleSettings_software_amazon_awscdk_services_apigateway_ThrottleSettings_AsReference_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generated Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_generatedClassName_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Var Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RateLimitedApiKeyBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RateLimitedApiKeyBuilder_apigateway_varName_feature",
								"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
						ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__VAR_NAME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RateLimitedApiKeyBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RateLimitedApiKeyBuilder_apigateway_identifier_feature",
								"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
						ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RateLimitedApiKeyBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RateLimitedApiKeyBuilder_apigateway_additionalCode_feature",
						"_UI_RateLimitedApiKeyBuilder_apigateway_type"),
				ApigatewayPackage.Literals.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RateLimitedApiKeyBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RateLimitedApiKeyBuilder_apigateway"));
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RateLimitedApiKeyBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_RateLimitedApiKeyBuilder_apigateway_type")
				: getString("_UI_RateLimitedApiKeyBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(RateLimitedApiKeyBuilder_apigateway.class)) {
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__API_KEY_NAME_JAVA_LANG_STRING_:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__VALUE_JAVA_LANG_STRING_:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__CUSTOMER_ID_JAVA_LANG_STRING_:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__ENABLED_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__GENERATE_DISTINCT_ID_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__RESOURCES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REST_API_AS_LIST:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__API_STAGES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_USAGE_PLAN_PER_API_STAGE_AS_LIST:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__QUOTA_WITH_QUOTA_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_QUOTA_SETTINGS_AS_REFERENCE:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__THROTTLE_WITH_THROTTLE_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_THROTTLE_SETTINGS_AS_REFERENCE:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.RATE_LIMITED_API_KEY_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AwsworkbenchEditPlugin.INSTANCE;
	}

}
