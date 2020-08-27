/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.MethodDeploymentOptionsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodDeploymentOptionsBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeploymentOptionsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addCacheDataEncrypted_java_lang_Boolean_PropertyDescriptor(object);
			addCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addCachingEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addDataTraceEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_PropertyDescriptor(object);
			addMetricsEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addThrottlingBurstLimit_java_lang_Number_PropertyDescriptor(object);
			addThrottlingRateLimit_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cache Data Encrypted java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheDataEncrypted_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodDeploymentOptionsBuilder_apigateway_cacheDataEncrypted_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_cacheDataEncrypted_java_lang_Boolean__feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cache Ttl With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodDeploymentOptionsBuilder_apigateway_cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Caching Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachingEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MethodDeploymentOptionsBuilder_apigateway_cachingEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_cachingEnabled_java_lang_Boolean__feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data Trace Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTraceEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MethodDeploymentOptionsBuilder_apigateway_dataTraceEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_dataTraceEnabled_java_lang_Boolean__feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Logging Level software amazon awscdk services apigateway Method Logging Level  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodDeploymentOptionsBuilder_apigateway_loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel__feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Metrics Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetricsEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MethodDeploymentOptionsBuilder_apigateway_metricsEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_metricsEnabled_java_lang_Boolean__feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Throttling Burst Limit java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThrottlingBurstLimit_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodDeploymentOptionsBuilder_apigateway_throttlingBurstLimit_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_throttlingBurstLimit_java_lang_Number__feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Throttling Rate Limit java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThrottlingRateLimit_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodDeploymentOptionsBuilder_apigateway_throttlingRateLimit_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_throttlingRateLimit_java_lang_Number__feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_MethodDeploymentOptionsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_generatedClassName_feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_MethodDeploymentOptionsBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_varName_feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
				getString("_UI_MethodDeploymentOptionsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_identifier_feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_MethodDeploymentOptionsBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_additionalCode_feature",
						"_UI_MethodDeploymentOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns MethodDeploymentOptionsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/MethodDeploymentOptionsBuilder_apigateway"));
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
		return  "MethodDeploymentOptions " + ((MethodDeploymentOptionsBuilder_apigateway) object).getVarName();
		
				
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

		switch (notification.getFeatureID(MethodDeploymentOptionsBuilder_apigateway.class)) {
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.METHOD_DEPLOYMENT_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
