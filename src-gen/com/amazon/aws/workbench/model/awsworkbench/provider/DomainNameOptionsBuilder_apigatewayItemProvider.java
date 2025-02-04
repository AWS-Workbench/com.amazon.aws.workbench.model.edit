/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DomainNameOptionsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainNameOptionsBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainNameOptionsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReferencePropertyDescriptor(
					object);
			addDomainName_java_lang_String_PropertyDescriptor(object);
			addEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_PropertyDescriptor(object);
			addSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Certificate With ICertificate software amazon awscdk services certificatemanager ICertificate As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCertificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DomainNameOptionsBuilder_apigateway_certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DomainNameOptionsBuilder_apigateway_certificateWithICertificate_software_amazon_awscdk_services_certificatemanager_ICertificate_AsReference_feature",
						"_UI_DomainNameOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DomainNameOptionsBuilder_apigateway_domainName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DomainNameOptionsBuilder_apigateway_domainName_java_lang_String__feature",
						"_UI_DomainNameOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Type software amazon awscdk services apigateway Endpoint Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointType_software_amazon_awscdk_services_apigateway_EndpointType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DomainNameOptionsBuilder_apigateway_endpointType_software_amazon_awscdk_services_apigateway_EndpointType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DomainNameOptionsBuilder_apigateway_endpointType_software_amazon_awscdk_services_apigateway_EndpointType__feature",
						"_UI_DomainNameOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Policy software amazon awscdk services apigateway Security Policy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DomainNameOptionsBuilder_apigateway_securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DomainNameOptionsBuilder_apigateway_securityPolicy_software_amazon_awscdk_services_apigateway_SecurityPolicy__feature",
						"_UI_DomainNameOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_,
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
				getString("_UI_DomainNameOptionsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DomainNameOptionsBuilder_apigateway_generatedClassName_feature",
						"_UI_DomainNameOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_DomainNameOptionsBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DomainNameOptionsBuilder_apigateway_varName_feature",
								"_UI_DomainNameOptionsBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_DomainNameOptionsBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DomainNameOptionsBuilder_apigateway_identifier_feature",
								"_UI_DomainNameOptionsBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_DomainNameOptionsBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DomainNameOptionsBuilder_apigateway_additionalCode_feature",
						"_UI_DomainNameOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DomainNameOptionsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DomainNameOptionsBuilder_apigateway"));
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
		return "DomainNameOptions " + ((DomainNameOptionsBuilder_apigateway) object).getVarName();

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

		switch (notification.getFeatureID(DomainNameOptionsBuilder_apigateway.class)) {
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__CERTIFICATE_WITH_ICERTIFICATE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_ICERTIFICATE_AS_REFERENCE:
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__DOMAIN_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ENDPOINT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_ENDPOINT_TYPE_:
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_SECURITY_POLICY_:
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.DOMAIN_NAME_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
