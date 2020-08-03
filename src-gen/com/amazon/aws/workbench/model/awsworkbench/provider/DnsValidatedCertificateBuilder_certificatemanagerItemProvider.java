/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DnsValidatedCertificateBuilder_certificatemanager;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DnsValidatedCertificateBuilder_certificatemanager} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DnsValidatedCertificateBuilder_certificatemanagerItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DnsValidatedCertificateBuilder_certificatemanagerItemProvider(AdapterFactory adapterFactory) {
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
			addSubjectAlternativeNames_java_lang_String_AsListPropertyDescriptor(object);
			addValidationDomains_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_PropertyDescriptor(
					object);
			addHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReferencePropertyDescriptor(
					object);
			addCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
					object);
			addRegion_java_lang_String_PropertyDescriptor(object);
			addRoute53Endpoint_java_lang_String_PropertyDescriptor(object);
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
				getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_domainName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_domainName_java_lang_String__feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subject Alternative Names java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectAlternativeNames_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_subjectAlternativeNames_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_subjectAlternativeNames_java_lang_String_AsList_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Validation Domains java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationDomains_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_validationDomains_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_validationDomains_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Validation Method software amazon awscdk services certificatemanager Validation Method  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_validationMethod_software_amazon_awscdk_services_certificatemanager_ValidationMethod__feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hosted Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_hostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_hostedZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custom Resource Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_customResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_customResourceRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Region java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegion_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_region_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_region_java_lang_String__feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Route53 Endpoint java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoute53Endpoint_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_route53Endpoint_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_route53Endpoint_java_lang_String__feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_,
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
				getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_generatedClassName_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME,
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
				getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_varName_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME, true,
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
				getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_identifier_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER, true,
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
				getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_additionalCode_feature",
						"_UI_DnsValidatedCertificateBuilder_certificatemanager_type"),
				AwsworkbenchPackage.Literals.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DnsValidatedCertificateBuilder_certificatemanager.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/DnsValidatedCertificateBuilder_certificatemanager"));
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
		String label = ((DnsValidatedCertificateBuilder_certificatemanager) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_type")
				: getString("_UI_DnsValidatedCertificateBuilder_certificatemanager_type") + " " + label;
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

		switch (notification.getFeatureID(DnsValidatedCertificateBuilder_certificatemanager.class)) {
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__DOMAIN_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__SUBJECT_ALTERNATIVE_NAMES_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_DOMAINS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VALIDATION_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CERTIFICATEMANAGER_VALIDATION_METHOD_:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__HOSTED_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__CUSTOM_RESOURCE_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__REGION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ROUTE53_ENDPOINT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__VAR_NAME:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__IDENTIFIER:
		case AwsworkbenchPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER__ADDITIONAL_CODE:
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
