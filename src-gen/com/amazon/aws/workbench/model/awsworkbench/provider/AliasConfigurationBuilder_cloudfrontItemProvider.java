/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AliasConfigurationBuilder_cloudfront} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AliasConfigurationBuilder_cloudfrontItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasConfigurationBuilder_cloudfrontItemProvider(AdapterFactory adapterFactory) {
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

			addAcmCertRef_java_lang_String_PropertyDescriptor(object);
			addNames_java_lang_String_AsListPropertyDescriptor(object);
			addSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_PropertyDescriptor(
					object);
			addSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Acm Cert Ref java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcmCertRef_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AliasConfigurationBuilder_cloudfront_acmCertRef_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AliasConfigurationBuilder_cloudfront_acmCertRef_java_lang_String__feature",
						"_UI_AliasConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ACM_CERT_REF_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Names java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNames_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AliasConfigurationBuilder_cloudfront_names_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AliasConfigurationBuilder_cloudfront_names_java_lang_String_AsList_feature",
						"_UI_AliasConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__NAMES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Policy software amazon awscdk services cloudfront Security Policy Protocol  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AliasConfigurationBuilder_cloudfront_securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AliasConfigurationBuilder_cloudfront_securityPolicy_software_amazon_awscdk_services_cloudfront_SecurityPolicyProtocol__feature",
						"_UI_AliasConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ssl Method software amazon awscdk services cloudfront SSL Method  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AliasConfigurationBuilder_cloudfront_sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AliasConfigurationBuilder_cloudfront_sslMethod_software_amazon_awscdk_services_cloudfront_SSLMethod__feature",
						"_UI_AliasConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD_,
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
				getString("_UI_AliasConfigurationBuilder_cloudfront_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AliasConfigurationBuilder_cloudfront_generatedClassName_feature",
						"_UI_AliasConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_AliasConfigurationBuilder_cloudfront_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AliasConfigurationBuilder_cloudfront_varName_feature",
								"_UI_AliasConfigurationBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_AliasConfigurationBuilder_cloudfront_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AliasConfigurationBuilder_cloudfront_identifier_feature",
								"_UI_AliasConfigurationBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER, true, false,
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
				getString("_UI_AliasConfigurationBuilder_cloudfront_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AliasConfigurationBuilder_cloudfront_additionalCode_feature",
						"_UI_AliasConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AliasConfigurationBuilder_cloudfront.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AliasConfigurationBuilder_cloudfront"));
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
		String label = ((AliasConfigurationBuilder_cloudfront) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_AliasConfigurationBuilder_cloudfront_type")
				: getString("_UI_AliasConfigurationBuilder_cloudfront_type") + " " + label;
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

		switch (notification.getFeatureID(AliasConfigurationBuilder_cloudfront.class)) {
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ACM_CERT_REF_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__NAMES_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SECURITY_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SECURITY_POLICY_PROTOCOL_:
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__SSL_METHOD_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_SSL_METHOD_:
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME:
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER:
		case AwsworkbenchPackage.ALIAS_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
