/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.KeyBuilder_kms} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyBuilder_kmsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyBuilder_kmsItemProvider(AdapterFactory adapterFactory) {
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

			addAlias_java_lang_String_PropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addEnableKeyRotation_java_lang_Boolean_PropertyDescriptor(object);
			addPolicyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReferencePropertyDescriptor(
					object);
			addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(object);
			addTrustAccountIdentities_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alias java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlias_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_KeyBuilder_kms_alias_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_KeyBuilder_kms_alias_java_lang_String__feature", "_UI_KeyBuilder_kms_type"),
						AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_KeyBuilder_kms_description_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_KeyBuilder_kms_description_java_lang_String__feature", "_UI_KeyBuilder_kms_type"),
						AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_KeyBuilder_kms_enabled_java_lang_Boolean__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_KeyBuilder_kms_enabled_java_lang_Boolean__feature", "_UI_KeyBuilder_kms_type"),
						AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Key Rotation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableKeyRotation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_KeyBuilder_kms_enableKeyRotation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KeyBuilder_kms_enableKeyRotation_java_lang_Boolean__feature", "_UI_KeyBuilder_kms_type"),
				AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_KeyBuilder_kms_policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KeyBuilder_kms_policyWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature",
						"_UI_KeyBuilder_kms_type"),
				AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Removal Policy software amazon awscdk core Removal Policy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_KeyBuilder_kms_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KeyBuilder_kms_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature",
						"_UI_KeyBuilder_kms_type"),
				AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Trust Account Identities java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrustAccountIdentities_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_KeyBuilder_kms_trustAccountIdentities_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KeyBuilder_kms_trustAccountIdentities_java_lang_Boolean__feature",
						"_UI_KeyBuilder_kms_type"),
				AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_KeyBuilder_kms_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_KeyBuilder_kms_generatedClassName_feature",
						"_UI_KeyBuilder_kms_type"),
				AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__GENERATED_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_KeyBuilder_kms_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_KeyBuilder_kms_varName_feature",
								"_UI_KeyBuilder_kms_type"),
						AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_KeyBuilder_kms_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_KeyBuilder_kms_identifier_feature",
								"_UI_KeyBuilder_kms_type"),
						AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__IDENTIFIER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_KeyBuilder_kms_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_KeyBuilder_kms_additionalCode_feature",
						"_UI_KeyBuilder_kms_type"),
				AwsworkbenchPackage.Literals.KEY_BUILDER_KMS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns KeyBuilder_kms.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KeyBuilder_kms"));
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
		return  "Key " + ((KeyBuilder_kms) object).getVarName();
		
				
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

		switch (notification.getFeatureID(KeyBuilder_kms.class)) {
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ALIAS_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ENABLE_KEY_ROTATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__POLICY_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__TRUST_ACCOUNT_IDENTITIES_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__VAR_NAME:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__IDENTIFIER:
		case AwsworkbenchPackage.KEY_BUILDER_KMS__ADDITIONAL_CODE:
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
