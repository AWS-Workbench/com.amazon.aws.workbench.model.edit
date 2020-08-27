/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RestApiPropsBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RestApiPropsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RestApiPropsBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestApiPropsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_PropertyDescriptor(object);
			addBinaryMediaTypes_java_lang_String_AsListPropertyDescriptor(object);
			addCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReferencePropertyDescriptor(
					object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReferencePropertyDescriptor(
					object);
			addEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsListPropertyDescriptor(object);
			addMinimumCompressionSize_java_lang_Number_PropertyDescriptor(object);
			addCloudWatchRole_java_lang_Boolean_PropertyDescriptor(object);
			addDeploy_java_lang_Boolean_PropertyDescriptor(object);
			addDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReferencePropertyDescriptor(
					object);
			addDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReferencePropertyDescriptor(
					object);
			addEndpointExportName_java_lang_String_PropertyDescriptor(object);
			addFailOnWarnings_java_lang_Boolean_PropertyDescriptor(object);
			addParameters_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReferencePropertyDescriptor(
					object);
			addRestApiName_java_lang_String_PropertyDescriptor(object);
			addRetainDeployments_java_lang_Boolean_PropertyDescriptor(object);
			addDefaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReferencePropertyDescriptor(
					object);
			addDefaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReferencePropertyDescriptor(
					object);
			addDefaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Api Key Source Type software amazon awscdk services apigateway Api Key Source Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_apiKeySourceType_software_amazon_awscdk_services_apigateway_ApiKeySourceType__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Binary Media Types java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBinaryMediaTypes_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_binaryMediaTypes_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_binaryMediaTypes_java_lang_String_AsList_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Clone From With IRest Api software amazon awscdk services apigateway IRest Api As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_cloneFromWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE,
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
				getString("_UI_RestApiPropsBuilder_apigateway_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_description_java_lang_String__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Configuration With Endpoint Configuration software amazon awscdk services apigateway Endpoint Configuration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_endpointConfigurationWithEndpointConfiguration_software_amazon_awscdk_services_apigateway_EndpointConfiguration_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Types software amazon awscdk services apigateway Endpoint Type As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_endpointTypes_software_amazon_awscdk_services_apigateway_EndpointType_AsList_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Minimum Compression Size java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumCompressionSize_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_minimumCompressionSize_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_minimumCompressionSize_java_lang_Number__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cloud Watch Role java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudWatchRole_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_cloudWatchRole_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_cloudWatchRole_java_lang_Boolean__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deploy java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploy_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_deploy_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_deploy_java_lang_Boolean__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deploy Options With Stage Options software amazon awscdk services apigateway Stage Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Domain Name With Domain Name Options software amazon awscdk services apigateway Domain Name Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Export Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointExportName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_endpointExportName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_endpointExportName_java_lang_String__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fail On Warnings java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailOnWarnings_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_failOnWarnings_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_failOnWarnings_java_lang_Boolean__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parameters java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameters_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_parameters_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_parameters_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Policy With Policy Document software amazon awscdk services iam Policy Document As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RestApiPropsBuilder_apigateway_policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rest Api Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestApiName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_restApiName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_restApiName_java_lang_String__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Retain Deployments java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetainDeployments_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RestApiPropsBuilder_apigateway_retainDeployments_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_retainDeployments_java_lang_Boolean__feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_RestApiPropsBuilder_apigateway_defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE,
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
						"_UI_RestApiPropsBuilder_apigateway_defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
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
						"_UI_RestApiPropsBuilder_apigateway_defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
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
				getString("_UI_RestApiPropsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RestApiPropsBuilder_apigateway_generatedClassName_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_RestApiPropsBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RestApiPropsBuilder_apigateway_varName_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
				getString("_UI_RestApiPropsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RestApiPropsBuilder_apigateway_identifier_feature",
						"_UI_RestApiPropsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_RestApiPropsBuilder_apigateway_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RestApiPropsBuilder_apigateway_additionalCode_feature",
								"_UI_RestApiPropsBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.REST_API_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RestApiPropsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RestApiPropsBuilder_apigateway"));
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
		return  "RestApiProps " + ((RestApiPropsBuilder_apigateway) object).getVarName();
		
				
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

		switch (notification.getFeatureID(RestApiPropsBuilder_apigateway.class)) {
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__API_KEY_SOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_KEY_SOURCE_TYPE_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__BINARY_MEDIA_TYPES_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__CLONE_FROM_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_CONFIGURATION_WITH_ENDPOINT_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_CONFIGURATION_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_TYPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_AS_LIST:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__MINIMUM_COMPRESSION_SIZE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.REST_API_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
