/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontWebDistributionPropsBuilder_cloudfront} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudFrontWebDistributionPropsBuilder_cloudfrontItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFrontWebDistributionPropsBuilder_cloudfrontItemProvider(AdapterFactory adapterFactory) {
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

			addOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsListPropertyDescriptor(
					object);
			addAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReferencePropertyDescriptor(
					object);
			addComment_java_lang_String_PropertyDescriptor(object);
			addDefaultRootObject_java_lang_String_PropertyDescriptor(object);
			addEnableIpV6_java_lang_Boolean_PropertyDescriptor(object);
			addErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsListPropertyDescriptor(
					object);
			addGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReferencePropertyDescriptor(
					object);
			addHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_PropertyDescriptor(object);
			addLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReferencePropertyDescriptor(
					object);
			addPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_PropertyDescriptor(object);
			addViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReferencePropertyDescriptor(
					object);
			addViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_PropertyDescriptor(
					object);
			addWebAclId_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Origin Configs software amazon awscdk services cloudfront Source Configuration As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_originConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_originConfigs_software_amazon_awscdk_services_cloudfront_SourceConfiguration_AsList_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ORIGIN_CONFIGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SOURCE_CONFIGURATION_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Alias Configuration With Alias Configuration software amazon awscdk services cloudfront Alias Configuration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_aliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_aliasConfigurationWithAliasConfiguration_software_amazon_awscdk_services_cloudfront_AliasConfiguration_AsReference_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ALIAS_CONFIGURATION_WITH_ALIAS_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ALIAS_CONFIGURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComment_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_comment_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_comment_java_lang_String__feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__COMMENT_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Root Object java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultRootObject_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_defaultRootObject_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_defaultRootObject_java_lang_String__feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__DEFAULT_ROOT_OBJECT_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Ip V6 java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableIpV6_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_enableIpV6_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_enableIpV6_java_lang_Boolean__feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ENABLE_IP_V6_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Error Configurations software amazon awscdk services cloudfront Cfn Distribution Custom Error Response Property As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_errorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_errorConfigurations_software_amazon_awscdk_services_cloudfront_CfnDistribution_CustomErrorResponseProperty_AsList_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ERROR_CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_CUSTOM_ERROR_RESPONSE_PROPERTY_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Geo Restriction With Geo Restriction software amazon awscdk services cloudfront Geo Restriction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_geoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_geoRestrictionWithGeoRestriction_software_amazon_awscdk_services_cloudfront_GeoRestriction_AsReference_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__GEO_RESTRICTION_WITH_GEO_RESTRICTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_GEO_RESTRICTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Http Version software amazon awscdk services cloudfront Http Version  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_httpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_httpVersion_software_amazon_awscdk_services_cloudfront_HttpVersion__feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__HTTP_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_HTTP_VERSION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Logging Config With Logging Configuration software amazon awscdk services cloudfront Logging Configuration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_loggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_loggingConfigWithLoggingConfiguration_software_amazon_awscdk_services_cloudfront_LoggingConfiguration_AsReference_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__LOGGING_CONFIG_WITH_LOGGING_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LOGGING_CONFIGURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Price Class software amazon awscdk services cloudfront Price Class  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriceClass_software_amazon_awscdk_services_cloudfront_PriceClass_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_priceClass_software_amazon_awscdk_services_cloudfront_PriceClass__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_priceClass_software_amazon_awscdk_services_cloudfront_PriceClass__feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__PRICE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_PRICE_CLASS_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Viewer Certificate With Viewer Certificate software amazon awscdk services cloudfront Viewer Certificate As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_viewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_viewerCertificateWithViewerCertificate_software_amazon_awscdk_services_cloudfront_ViewerCertificate_AsReference_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__VIEWER_CERTIFICATE_WITH_VIEWER_CERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_VIEWER_CERTIFICATE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Viewer Protocol Policy software amazon awscdk services cloudfront Viewer Protocol Policy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_viewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_viewerProtocolPolicy_software_amazon_awscdk_services_cloudfront_ViewerProtocolPolicy__feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__VIEWER_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_VIEWER_PROTOCOL_POLICY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Web Acl Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebAclId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_webAclId_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_webAclId_java_lang_String__feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__WEB_ACL_ID_JAVA_LANG_STRING_,
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
				getString("_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_generatedClassName_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME,
				false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_varName_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__VAR_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_identifier_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__IDENTIFIER, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_additionalCode_feature",
						"_UI_CloudFrontWebDistributionPropsBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CloudFrontWebDistributionPropsBuilder_cloudfront.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/CloudFrontWebDistributionPropsBuilder_cloudfront"));
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
		return  "CloudFrontWebDistributionProps " + ((CloudFrontWebDistributionPropsBuilder_cloudfront) object).getVarName();
		
				
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

		switch (notification.getFeatureID(CloudFrontWebDistributionPropsBuilder_cloudfront.class)) {
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ORIGIN_CONFIGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SOURCE_CONFIGURATION_AS_LIST:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ALIAS_CONFIGURATION_WITH_ALIAS_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ALIAS_CONFIGURATION_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__COMMENT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__DEFAULT_ROOT_OBJECT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ENABLE_IP_V6_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ERROR_CONFIGURATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_CUSTOM_ERROR_RESPONSE_PROPERTY_AS_LIST:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__GEO_RESTRICTION_WITH_GEO_RESTRICTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_GEO_RESTRICTION_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__HTTP_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_HTTP_VERSION_:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__LOGGING_CONFIG_WITH_LOGGING_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LOGGING_CONFIGURATION_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__PRICE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_PRICE_CLASS_:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__VIEWER_CERTIFICATE_WITH_VIEWER_CERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_VIEWER_CERTIFICATE_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__VIEWER_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_VIEWER_PROTOCOL_POLICY_:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__WEB_ACL_ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__VAR_NAME:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__IDENTIFIER:
		case AwsworkbenchPackage.CLOUD_FRONT_WEB_DISTRIBUTION_PROPS_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
