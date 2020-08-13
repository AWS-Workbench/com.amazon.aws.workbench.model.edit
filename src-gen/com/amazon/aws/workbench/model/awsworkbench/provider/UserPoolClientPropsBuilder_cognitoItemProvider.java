/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.UserPoolClientPropsBuilder_cognito;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.UserPoolClientPropsBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserPoolClientPropsBuilder_cognitoItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPoolClientPropsBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addUserPoolWithIUserPool_software_amazon_awscdk_services_cognito_IUserPool_AsReferencePropertyDescriptor(
					object);
			addAuthFlowsWithAuthFlow_software_amazon_awscdk_services_cognito_AuthFlow_AsReferencePropertyDescriptor(
					object);
			addGenerateSecret_java_lang_Boolean_PropertyDescriptor(object);
			addOAuthWithOAuthSettings_software_amazon_awscdk_services_cognito_OAuthSettings_AsReferencePropertyDescriptor(
					object);
			addPreventUserExistenceErrors_java_lang_Boolean_PropertyDescriptor(object);
			addUserPoolClientName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the User Pool With IUser Pool software amazon awscdk services cognito IUser Pool As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPoolWithIUserPool_software_amazon_awscdk_services_cognito_IUserPool_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolClientPropsBuilder_cognito_userPoolWithIUserPool_software_amazon_awscdk_services_cognito_IUserPool_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_userPoolWithIUserPool_software_amazon_awscdk_services_cognito_IUserPool_AsReference_feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__USER_POOL_WITH_IUSER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_IUSER_POOL_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Auth Flows With Auth Flow software amazon awscdk services cognito Auth Flow As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthFlowsWithAuthFlow_software_amazon_awscdk_services_cognito_AuthFlow_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolClientPropsBuilder_cognito_authFlowsWithAuthFlow_software_amazon_awscdk_services_cognito_AuthFlow_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_authFlowsWithAuthFlow_software_amazon_awscdk_services_cognito_AuthFlow_AsReference_feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__AUTH_FLOWS_WITH_AUTH_FLOW_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTH_FLOW_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generate Secret java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateSecret_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UserPoolClientPropsBuilder_cognito_generateSecret_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_generateSecret_java_lang_Boolean__feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__GENERATE_SECRET_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the OAuth With OAuth Settings software amazon awscdk services cognito OAuth Settings As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOAuthWithOAuthSettings_software_amazon_awscdk_services_cognito_OAuthSettings_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolClientPropsBuilder_cognito_oAuthWithOAuthSettings_software_amazon_awscdk_services_cognito_OAuthSettings_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_oAuthWithOAuthSettings_software_amazon_awscdk_services_cognito_OAuthSettings_AsReference_feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__OAUTH_WITH_OAUTH_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SETTINGS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prevent User Existence Errors java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreventUserExistenceErrors_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UserPoolClientPropsBuilder_cognito_preventUserExistenceErrors_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_preventUserExistenceErrors_java_lang_Boolean__feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__PREVENT_USER_EXISTENCE_ERRORS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Pool Client Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPoolClientName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UserPoolClientPropsBuilder_cognito_userPoolClientName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_userPoolClientName_java_lang_String__feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__USER_POOL_CLIENT_NAME_JAVA_LANG_STRING_,
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
				getString("_UI_UserPoolClientPropsBuilder_cognito_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_generatedClassName_feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_UserPoolClientPropsBuilder_cognito_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UserPoolClientPropsBuilder_cognito_varName_feature",
								"_UI_UserPoolClientPropsBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_UserPoolClientPropsBuilder_cognito_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UserPoolClientPropsBuilder_cognito_identifier_feature",
								"_UI_UserPoolClientPropsBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__IDENTIFIER, true, false,
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
				getString("_UI_UserPoolClientPropsBuilder_cognito_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UserPoolClientPropsBuilder_cognito_additionalCode_feature",
						"_UI_UserPoolClientPropsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns UserPoolClientPropsBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserPoolClientPropsBuilder_cognito"));
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
		String label = ((UserPoolClientPropsBuilder_cognito) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_UserPoolClientPropsBuilder_cognito_type")
				: getString("_UI_UserPoolClientPropsBuilder_cognito_type") + " " + label;
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

		switch (notification.getFeatureID(UserPoolClientPropsBuilder_cognito.class)) {
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__USER_POOL_WITH_IUSER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_IUSER_POOL_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__AUTH_FLOWS_WITH_AUTH_FLOW_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_AUTH_FLOW_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__GENERATE_SECRET_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__OAUTH_WITH_OAUTH_SETTINGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SETTINGS_AS_REFERENCE:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__PREVENT_USER_EXISTENCE_ERRORS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__USER_POOL_CLIENT_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.USER_POOL_CLIENT_PROPS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
