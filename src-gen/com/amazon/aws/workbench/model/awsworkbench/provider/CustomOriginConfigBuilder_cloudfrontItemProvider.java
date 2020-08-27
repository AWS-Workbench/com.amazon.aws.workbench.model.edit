/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CustomOriginConfigBuilder_cloudfront} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomOriginConfigBuilder_cloudfrontItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomOriginConfigBuilder_cloudfrontItemProvider(AdapterFactory adapterFactory) {
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

			addDomainName_java_lang_String_PropertyDescriptor(object);
			addAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsListPropertyDescriptor(
					object);
			addHttpPort_java_lang_Number_PropertyDescriptor(object);
			addHttpsPort_java_lang_Number_PropertyDescriptor(object);
			addOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_PropertyDescriptor(
					object);
			addOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomOriginConfigBuilder_cloudfront_domainName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_domainName_java_lang_String__feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__DOMAIN_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allowed Origin Ssl Versions software amazon awscdk services cloudfront Origin Ssl Policy As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomOriginConfigBuilder_cloudfront_allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_allowedOriginSslVersions_software_amazon_awscdk_services_cloudfront_OriginSslPolicy_AsList_feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Http Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomOriginConfigBuilder_cloudfront_httpPort_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_httpPort_java_lang_Number__feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTP_PORT_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Https Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpsPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomOriginConfigBuilder_cloudfront_httpsPort_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_httpsPort_java_lang_Number__feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTPS_PORT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Origin Keepalive Timeout With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomOriginConfigBuilder_cloudfront_originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_originKeepaliveTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Origin Protocol Policy software amazon awscdk services cloudfront Origin Protocol Policy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomOriginConfigBuilder_cloudfront_originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_originProtocolPolicy_software_amazon_awscdk_services_cloudfront_OriginProtocolPolicy__feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Origin Read Timeout With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomOriginConfigBuilder_cloudfront_originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_originReadTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_CustomOriginConfigBuilder_cloudfront_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_generatedClassName_feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_CustomOriginConfigBuilder_cloudfront_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CustomOriginConfigBuilder_cloudfront_varName_feature",
								"_UI_CustomOriginConfigBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_CustomOriginConfigBuilder_cloudfront_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CustomOriginConfigBuilder_cloudfront_identifier_feature",
								"_UI_CustomOriginConfigBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER, true, false,
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
				getString("_UI_CustomOriginConfigBuilder_cloudfront_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomOriginConfigBuilder_cloudfront_additionalCode_feature",
						"_UI_CustomOriginConfigBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CustomOriginConfigBuilder_cloudfront.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomOriginConfigBuilder_cloudfront"));
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
		return  "CustomOriginConfig " + ((CustomOriginConfigBuilder_cloudfront) object).getVarName();
		
				
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

		switch (notification.getFeatureID(CustomOriginConfigBuilder_cloudfront.class)) {
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__DOMAIN_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ALLOWED_ORIGIN_SSL_VERSIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_SSL_POLICY_AS_LIST:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTP_PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__HTTPS_PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_KEEPALIVE_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_PROTOCOL_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_ORIGIN_PROTOCOL_POLICY_:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_READ_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
		case AwsworkbenchPackage.CUSTOM_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
