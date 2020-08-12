/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SecretBuilder_secretsmanager} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecretBuilder_secretsmanagerItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretBuilder_secretsmanagerItemProvider(AdapterFactory adapterFactory) {
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

			addDescription_java_lang_String_PropertyDescriptor(object);
			addEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(object);
			addGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReferencePropertyDescriptor(
					object);
			addSecretName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_SecretBuilder_secretsmanager_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretBuilder_secretsmanager_description_java_lang_String__feature",
						"_UI_SecretBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__DESCRIPTION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretBuilder_secretsmanager_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretBuilder_secretsmanager_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_SecretBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generate Secret String With Secret String Generator software amazon awscdk services secretsmanager Secret String Generator As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SecretBuilder_secretsmanager_generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretBuilder_secretsmanager_generateSecretStringWithSecretStringGenerator_software_amazon_awscdk_services_secretsmanager_SecretStringGenerator_AsReference_feature",
						"_UI_SecretBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Secret Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecretName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SecretBuilder_secretsmanager_secretName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SecretBuilder_secretsmanager_secretName_java_lang_String__feature",
						"_UI_SecretBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__SECRET_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generated Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecretBuilder_secretsmanager_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SecretBuilder_secretsmanager_generatedClassName_feature",
								"_UI_SecretBuilder_secretsmanager_type"),
						AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_SecretBuilder_secretsmanager_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SecretBuilder_secretsmanager_varName_feature",
						"_UI_SecretBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__VAR_NAME, true, false, false,
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
				getString("_UI_SecretBuilder_secretsmanager_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SecretBuilder_secretsmanager_identifier_feature",
						"_UI_SecretBuilder_secretsmanager_type"),
				AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_SecretBuilder_secretsmanager_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SecretBuilder_secretsmanager_additionalCode_feature",
								"_UI_SecretBuilder_secretsmanager_type"),
						AwsworkbenchPackage.Literals.SECRET_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SecretBuilder_secretsmanager.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SecretBuilder_secretsmanager"));
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
		String label = ((SecretBuilder_secretsmanager) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_SecretBuilder_secretsmanager_type")
				: getString("_UI_SecretBuilder_secretsmanager_type") + " " + label;
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

		switch (notification.getFeatureID(SecretBuilder_secretsmanager.class)) {
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATE_SECRET_STRING_WITH_SECRET_STRING_GENERATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_SECRETSMANAGER_SECRET_STRING_GENERATOR_AS_REFERENCE:
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__SECRET_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__VAR_NAME:
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__IDENTIFIER:
		case AwsworkbenchPackage.SECRET_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
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
