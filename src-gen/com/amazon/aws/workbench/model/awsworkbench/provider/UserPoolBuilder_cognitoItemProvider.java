/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.UserPoolBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserPoolBuilder_cognitoItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPoolBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReferencePropertyDescriptor(
					object);
			addCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMapPropertyDescriptor(
					object);
			addEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReferencePropertyDescriptor(
					object);
			addLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReferencePropertyDescriptor(
					object);
			addMfa_software_amazon_awscdk_services_cognito_Mfa_PropertyDescriptor(object);
			addMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReferencePropertyDescriptor(
					object);
			addPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReferencePropertyDescriptor(
					object);
			addRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReferencePropertyDescriptor(
					object);
			addSelfSignUpEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReferencePropertyDescriptor(
					object);
			addSignInCaseSensitive_java_lang_Boolean_PropertyDescriptor(object);
			addSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addSmsRoleExternalId_java_lang_String_PropertyDescriptor(object);
			addUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReferencePropertyDescriptor(
					object);
			addUserPoolName_java_lang_String_PropertyDescriptor(object);
			addUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Verify With Auto Verified Attrs software amazon awscdk services cognito Auto Verified Attrs As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_autoVerifyWithAutoVerifiedAttrs_software_amazon_awscdk_services_cognito_AutoVerifiedAttrs_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custom Attributes java lang String software amazon awscdk services cognito ICustom Attribute As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_customAttributes_java_lang_String__software_amazon_awscdk_services_cognito_ICustomAttribute_AsMap_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Email Settings With Email Settings software amazon awscdk services cognito Email Settings As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_emailSettingsWithEmailSettings_software_amazon_awscdk_services_cognito_EmailSettings_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Triggers With User Pool Triggers software amazon awscdk services cognito User Pool Triggers As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_lambdaTriggersWithUserPoolTriggers_software_amazon_awscdk_services_cognito_UserPoolTriggers_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mfa software amazon awscdk services cognito Mfa  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMfa_software_amazon_awscdk_services_cognito_Mfa_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UserPoolBuilder_cognito_mfa_software_amazon_awscdk_services_cognito_Mfa__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_mfa_software_amazon_awscdk_services_cognito_Mfa__feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mfa Second Factor With Mfa Second Factor software amazon awscdk services cognito Mfa Second Factor As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_mfaSecondFactorWithMfaSecondFactor_software_amazon_awscdk_services_cognito_MfaSecondFactor_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Password Policy With Password Policy software amazon awscdk services cognito Password Policy As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_passwordPolicyWithPasswordPolicy_software_amazon_awscdk_services_cognito_PasswordPolicy_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Required Attributes With Required Attributes software amazon awscdk services cognito Required Attributes As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_requiredAttributesWithRequiredAttributes_software_amazon_awscdk_services_cognito_RequiredAttributes_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Self Sign Up Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelfSignUpEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UserPoolBuilder_cognito_selfSignUpEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_selfSignUpEnabled_java_lang_Boolean__feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sign In Aliases With Sign In Aliases software amazon awscdk services cognito Sign In Aliases As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_signInAliasesWithSignInAliases_software_amazon_awscdk_services_cognito_SignInAliases_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sign In Case Sensitive java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignInCaseSensitive_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UserPoolBuilder_cognito_signInCaseSensitive_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_signInCaseSensitive_java_lang_Boolean__feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sms Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_smsRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sms Role External Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmsRoleExternalId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UserPoolBuilder_cognito_smsRoleExternalId_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_smsRoleExternalId_java_lang_String__feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Invitation With User Invitation Config software amazon awscdk services cognito User Invitation Config As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_userInvitationWithUserInvitationConfig_software_amazon_awscdk_services_cognito_UserInvitationConfig_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Pool Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPoolName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UserPoolBuilder_cognito_userPoolName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_userPoolName_java_lang_String__feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__USER_POOL_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Verification With User Verification Config software amazon awscdk services cognito User Verification Config As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolBuilder_cognito_userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_userVerificationWithUserVerificationConfig_software_amazon_awscdk_services_cognito_UserVerificationConfig_AsReference_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE,
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
				getString("_UI_UserPoolBuilder_cognito_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolBuilder_cognito_generatedClassName_feature", "_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_UserPoolBuilder_cognito_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_UserPoolBuilder_cognito_varName_feature",
								"_UI_UserPoolBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_UserPoolBuilder_cognito_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UserPoolBuilder_cognito_identifier_feature", "_UI_UserPoolBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__IDENTIFIER, true, false, false,
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
				getString("_UI_UserPoolBuilder_cognito_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UserPoolBuilder_cognito_additionalCode_feature",
						"_UI_UserPoolBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_BUILDER_COGNITO__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns UserPoolBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserPoolBuilder_cognito"));
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
		String label = ((UserPoolBuilder_cognito) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_UserPoolBuilder_cognito_type")
				: getString("_UI_UserPoolBuilder_cognito_type") + " " + label;
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

		switch (notification.getFeatureID(UserPoolBuilder_cognito.class)) {
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__AUTO_VERIFY_WITH_AUTO_VERIFIED_ATTRS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTO_VERIFIED_ATTRS_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__CUSTOM_ATTRIBUTES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_ICUSTOM_ATTRIBUTE_AS_MAP:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__EMAIL_SETTINGS_WITH_EMAIL_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_EMAIL_SETTINGS_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__LAMBDA_TRIGGERS_WITH_USER_POOL_TRIGGERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_TRIGGERS_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__MFA_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__MFA_SECOND_FACTOR_WITH_MFA_SECOND_FACTOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_MFA_SECOND_FACTOR_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__PASSWORD_POLICY_WITH_PASSWORD_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_PASSWORD_POLICY_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__REQUIRED_ATTRIBUTES_WITH_REQUIRED_ATTRIBUTES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_REQUIRED_ATTRIBUTES_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__SELF_SIGN_UP_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__SIGN_IN_ALIASES_WITH_SIGN_IN_ALIASES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_SIGN_IN_ALIASES_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__SIGN_IN_CASE_SENSITIVE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__SMS_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__SMS_ROLE_EXTERNAL_ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__USER_INVITATION_WITH_USER_INVITATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_INVITATION_CONFIG_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__USER_POOL_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__USER_VERIFICATION_WITH_USER_VERIFICATION_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_VERIFICATION_CONFIG_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.USER_POOL_BUILDER_COGNITO__ADDITIONAL_CODE:
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
