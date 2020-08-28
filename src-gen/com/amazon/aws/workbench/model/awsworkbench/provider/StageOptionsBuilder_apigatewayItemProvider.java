/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.StageOptionsBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.StageOptionsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StageOptionsBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageOptionsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReferencePropertyDescriptor(
					object);
			addAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReferencePropertyDescriptor(
					object);
			addCacheClusterEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addCacheClusterSize_java_lang_String_PropertyDescriptor(object);
			addClientCertificateId_java_lang_String_PropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addDocumentationVersion_java_lang_String_PropertyDescriptor(object);
			addMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMapPropertyDescriptor(
					object);
			addStageName_java_lang_String_PropertyDescriptor(object);
			addTracingEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addVariables_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Access Log Destination With IAccess Log Destination software amazon awscdk services apigateway IAccess Log Destination As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StageOptionsBuilder_apigateway_accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_accessLogDestinationWithIAccessLogDestination_software_amazon_awscdk_services_apigateway_IAccessLogDestination_AsReference_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Access Log Format With Access Log Format software amazon awscdk services apigateway Access Log Format As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StageOptionsBuilder_apigateway_accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_accessLogFormatWithAccessLogFormat_software_amazon_awscdk_services_apigateway_AccessLogFormat_AsReference_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cache Cluster Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheClusterEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StageOptionsBuilder_apigateway_cacheClusterEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_cacheClusterEnabled_java_lang_Boolean__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cache Cluster Size java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheClusterSize_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StageOptionsBuilder_apigateway_cacheClusterSize_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_cacheClusterSize_java_lang_String__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Client Certificate Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientCertificateId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StageOptionsBuilder_apigateway_clientCertificateId_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_clientCertificateId_java_lang_String__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_,
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
				getString("_UI_StageOptionsBuilder_apigateway_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_description_java_lang_String__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Documentation Version java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationVersion_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StageOptionsBuilder_apigateway_documentationVersion_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_documentationVersion_java_lang_String__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Method Options java lang String software amazon awscdk services apigateway Method Deployment Options As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StageOptionsBuilder_apigateway_methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_methodOptions_java_lang_String__software_amazon_awscdk_services_apigateway_MethodDeploymentOptions_AsMap_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stage Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStageName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StageOptionsBuilder_apigateway_stageName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_stageName_java_lang_String__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tracing Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTracingEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StageOptionsBuilder_apigateway_tracingEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_tracingEnabled_java_lang_Boolean__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Variables java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariables_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StageOptionsBuilder_apigateway_variables_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_variables_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_StageOptionsBuilder_apigateway_cacheDataEncrypted_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_cacheDataEncrypted_java_lang_Boolean__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_,
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
						"_UI_StageOptionsBuilder_apigateway_cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_cacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_StageOptionsBuilder_apigateway_cachingEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_cachingEnabled_java_lang_Boolean__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_StageOptionsBuilder_apigateway_dataTraceEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_dataTraceEnabled_java_lang_Boolean__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_,
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
						"_UI_StageOptionsBuilder_apigateway_loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_loggingLevel_software_amazon_awscdk_services_apigateway_MethodLoggingLevel__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_,
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
				getString("_UI_StageOptionsBuilder_apigateway_metricsEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_metricsEnabled_java_lang_Boolean__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_StageOptionsBuilder_apigateway_throttlingBurstLimit_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_throttlingBurstLimit_java_lang_Number__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_,
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
				getString("_UI_StageOptionsBuilder_apigateway_throttlingRateLimit_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_throttlingRateLimit_java_lang_Number__feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_,
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
				getString("_UI_StageOptionsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StageOptionsBuilder_apigateway_generatedClassName_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_StageOptionsBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StageOptionsBuilder_apigateway_varName_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
				getString("_UI_StageOptionsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StageOptionsBuilder_apigateway_identifier_feature",
						"_UI_StageOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_StageOptionsBuilder_apigateway_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_StageOptionsBuilder_apigateway_additionalCode_feature",
								"_UI_StageOptionsBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.STAGE_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns StageOptionsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StageOptionsBuilder_apigateway"));
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
		return "StageOptions " + ((StageOptionsBuilder_apigateway) object).getVarName();

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

		switch (notification.getFeatureID(StageOptionsBuilder_apigateway.class)) {
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__ACCESS_LOG_DESTINATION_WITH_IACCESS_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IACCESS_LOG_DESTINATION_AS_REFERENCE:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__ACCESS_LOG_FORMAT_WITH_ACCESS_LOG_FORMAT_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ACCESS_LOG_FORMAT_AS_REFERENCE:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_CLUSTER_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_CLUSTER_SIZE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__CLIENT_CERTIFICATE_ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__DOCUMENTATION_VERSION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__METHOD_OPTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_DEPLOYMENT_OPTIONS_AS_MAP:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__STAGE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__TRACING_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__VARIABLES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_DATA_ENCRYPTED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__CACHING_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__DATA_TRACE_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__LOGGING_LEVEL_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_LOGGING_LEVEL_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__METRICS_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_BURST_LIMIT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__THROTTLING_RATE_LIMIT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.STAGE_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
