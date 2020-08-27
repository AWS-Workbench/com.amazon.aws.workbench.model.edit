/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.UserPoolTriggersBuilder_cognito;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.UserPoolTriggersBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserPoolTriggersBuilder_cognitoItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPoolTriggersBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addCreateAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addCustomMessageWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addDefineAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addPostAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addPostConfirmationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addPreAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addPreSignUpWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addPreTokenGenerationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addUserMigrationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addVerifyAuthChallengeResponseWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Create Auth Challenge With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_createAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_createAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__CREATE_AUTH_CHALLENGE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custom Message With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomMessageWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_customMessageWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_customMessageWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__CUSTOM_MESSAGE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Define Auth Challenge With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefineAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_defineAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_defineAuthChallengeWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__DEFINE_AUTH_CHALLENGE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Post Authentication With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_postAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_postAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__POST_AUTHENTICATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Post Confirmation With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostConfirmationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_postConfirmationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_postConfirmationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__POST_CONFIRMATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pre Authentication With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_preAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_preAuthenticationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__PRE_AUTHENTICATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pre Sign Up With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreSignUpWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_preSignUpWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_preSignUpWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__PRE_SIGN_UP_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pre Token Generation With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreTokenGenerationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_preTokenGenerationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_preTokenGenerationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__PRE_TOKEN_GENERATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Migration With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserMigrationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_userMigrationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_userMigrationWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__USER_MIGRATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Verify Auth Challenge Response With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerifyAuthChallengeResponseWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolTriggersBuilder_cognito_verifyAuthChallengeResponseWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_verifyAuthChallengeResponseWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__VERIFY_AUTH_CHALLENGE_RESPONSE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
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
				getString("_UI_UserPoolTriggersBuilder_cognito_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolTriggersBuilder_cognito_generatedClassName_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_UserPoolTriggersBuilder_cognito_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UserPoolTriggersBuilder_cognito_varName_feature",
						"_UI_UserPoolTriggersBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_UserPoolTriggersBuilder_cognito_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UserPoolTriggersBuilder_cognito_identifier_feature",
								"_UI_UserPoolTriggersBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_UserPoolTriggersBuilder_cognito_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UserPoolTriggersBuilder_cognito_additionalCode_feature",
								"_UI_UserPoolTriggersBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.USER_POOL_TRIGGERS_BUILDER_COGNITO__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns UserPoolTriggersBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserPoolTriggersBuilder_cognito"));
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
		return  "UserPoolTriggers " + ((UserPoolTriggersBuilder_cognito) object).getVarName();
		
				
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

		switch (notification.getFeatureID(UserPoolTriggersBuilder_cognito.class)) {
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__CREATE_AUTH_CHALLENGE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__CUSTOM_MESSAGE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__DEFINE_AUTH_CHALLENGE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__POST_AUTHENTICATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__POST_CONFIRMATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__PRE_AUTHENTICATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__PRE_SIGN_UP_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__PRE_TOKEN_GENERATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__USER_MIGRATION_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__VERIFY_AUTH_CHALLENGE_RESPONSE_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.USER_POOL_TRIGGERS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
