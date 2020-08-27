/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.PasswordPolicyBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PasswordPolicyBuilder_cognitoItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordPolicyBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addMinLength_java_lang_Number_PropertyDescriptor(object);
			addRequireDigits_java_lang_Boolean_PropertyDescriptor(object);
			addRequireLowercase_java_lang_Boolean_PropertyDescriptor(object);
			addRequireSymbols_java_lang_Boolean_PropertyDescriptor(object);
			addRequireUppercase_java_lang_Boolean_PropertyDescriptor(object);
			addTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Length java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinLength_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PasswordPolicyBuilder_cognito_minLength_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PasswordPolicyBuilder_cognito_minLength_java_lang_Number__feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__MIN_LENGTH_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Require Digits java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequireDigits_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PasswordPolicyBuilder_cognito_requireDigits_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PasswordPolicyBuilder_cognito_requireDigits_java_lang_Boolean__feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_DIGITS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Require Lowercase java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequireLowercase_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PasswordPolicyBuilder_cognito_requireLowercase_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PasswordPolicyBuilder_cognito_requireLowercase_java_lang_Boolean__feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Require Symbols java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequireSymbols_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PasswordPolicyBuilder_cognito_requireSymbols_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PasswordPolicyBuilder_cognito_requireSymbols_java_lang_Boolean__feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Require Uppercase java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequireUppercase_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PasswordPolicyBuilder_cognito_requireUppercase_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PasswordPolicyBuilder_cognito_requireUppercase_java_lang_Boolean__feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Temp Password Validity With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_PasswordPolicyBuilder_cognito_tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PasswordPolicyBuilder_cognito_tempPasswordValidityWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_PasswordPolicyBuilder_cognito_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PasswordPolicyBuilder_cognito_generatedClassName_feature",
								"_UI_PasswordPolicyBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__GENERATED_CLASS_NAME, false,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PasswordPolicyBuilder_cognito_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PasswordPolicyBuilder_cognito_varName_feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__VAR_NAME, true, false, false,
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
				getString("_UI_PasswordPolicyBuilder_cognito_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PasswordPolicyBuilder_cognito_identifier_feature",
						"_UI_PasswordPolicyBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_PasswordPolicyBuilder_cognito_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PasswordPolicyBuilder_cognito_additionalCode_feature",
								"_UI_PasswordPolicyBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.PASSWORD_POLICY_BUILDER_COGNITO__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PasswordPolicyBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PasswordPolicyBuilder_cognito"));
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
		return  "PasswordPolicy " + ((PasswordPolicyBuilder_cognito) object).getVarName();
		
				
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

		switch (notification.getFeatureID(PasswordPolicyBuilder_cognito.class)) {
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__MIN_LENGTH_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_DIGITS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_LOWERCASE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_SYMBOLS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__REQUIRE_UPPERCASE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__TEMP_PASSWORD_VALIDITY_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.PASSWORD_POLICY_BUILDER_COGNITO__ADDITIONAL_CODE:
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
