/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.SpecRestApiPropsBuilder_apigateway;

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
 * This is the item provider adapter for a {@link apigateway.SpecRestApiPropsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecRestApiPropsBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecRestApiPropsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReferencePropertyDescriptor(
					object);
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
	 * This adds a property descriptor for the Api Definition With Api Definition software amazon awscdk services apigateway Api Definition As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SpecRestApiPropsBuilder_apigateway_apiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_apiDefinitionWithApiDefinition_software_amazon_awscdk_services_apigateway_ApiDefinition_AsReference_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__API_DEFINITION_WITH_API_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_cloudWatchRole_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_cloudWatchRole_java_lang_Boolean__feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_,
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_deploy_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_deploy_java_lang_Boolean__feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_SpecRestApiPropsBuilder_apigateway_deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_deployOptionsWithStageOptions_software_amazon_awscdk_services_apigateway_StageOptions_AsReference_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE,
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
						"_UI_SpecRestApiPropsBuilder_apigateway_domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_domainNameWithDomainNameOptions_software_amazon_awscdk_services_apigateway_DomainNameOptions_AsReference_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE,
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_endpointExportName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_endpointExportName_java_lang_String__feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_,
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_failOnWarnings_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_failOnWarnings_java_lang_Boolean__feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_,
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
						"_UI_SpecRestApiPropsBuilder_apigateway_parameters_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_parameters_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
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
						"_UI_SpecRestApiPropsBuilder_apigateway_policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE,
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_restApiName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_restApiName_java_lang_String__feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_retainDeployments_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_retainDeployments_java_lang_Boolean__feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_,
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
						"_UI_SpecRestApiPropsBuilder_apigateway_defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_defaultCorsPreflightOptionsWithCorsOptions_software_amazon_awscdk_services_apigateway_CorsOptions_AsReference_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE,
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
						"_UI_SpecRestApiPropsBuilder_apigateway_defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_defaultIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
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
						"_UI_SpecRestApiPropsBuilder_apigateway_defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_defaultMethodOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_generatedClassName_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_SpecRestApiPropsBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SpecRestApiPropsBuilder_apigateway_varName_feature",
								"_UI_SpecRestApiPropsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_SpecRestApiPropsBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SpecRestApiPropsBuilder_apigateway_identifier_feature",
								"_UI_SpecRestApiPropsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_SpecRestApiPropsBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecRestApiPropsBuilder_apigateway_additionalCode_feature",
						"_UI_SpecRestApiPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SpecRestApiPropsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpecRestApiPropsBuilder_apigateway"));
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
		String label = ((SpecRestApiPropsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_SpecRestApiPropsBuilder_apigateway_type")
				: getString("_UI_SpecRestApiPropsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(SpecRestApiPropsBuilder_apigateway.class)) {
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__API_DEFINITION_WITH_API_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_AS_REFERENCE:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__CLOUD_WATCH_ROLE_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEPLOY_OPTIONS_WITH_STAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_STAGE_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DOMAIN_NAME_WITH_DOMAIN_NAME_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_DOMAIN_NAME_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__ENDPOINT_EXPORT_NAME_JAVA_LANG_STRING_:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__FAIL_ON_WARNINGS_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__REST_API_NAME_JAVA_LANG_STRING_:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__RETAIN_DEPLOYMENTS_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_CORS_PREFLIGHT_OPTIONS_WITH_CORS_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CORS_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__DEFAULT_METHOD_OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.SPEC_REST_API_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
