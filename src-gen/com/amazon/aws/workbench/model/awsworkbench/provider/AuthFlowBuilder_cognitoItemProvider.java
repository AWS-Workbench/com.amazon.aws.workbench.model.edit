/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AuthFlowBuilder_cognito;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AuthFlowBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthFlowBuilder_cognitoItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthFlowBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addAdminUserPassword_java_lang_Boolean_PropertyDescriptor(object);
			addCustom_java_lang_Boolean_PropertyDescriptor(object);
			addRefreshToken_java_lang_Boolean_PropertyDescriptor(object);
			addUserPassword_java_lang_Boolean_PropertyDescriptor(object);
			addUserSrp_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Admin User Password java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdminUserPassword_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AuthFlowBuilder_cognito_adminUserPassword_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AuthFlowBuilder_cognito_adminUserPassword_java_lang_Boolean__feature",
						"_UI_AuthFlowBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custom java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustom_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AuthFlowBuilder_cognito_custom_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AuthFlowBuilder_cognito_custom_java_lang_Boolean__feature",
						"_UI_AuthFlowBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__CUSTOM_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Refresh Token java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefreshToken_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AuthFlowBuilder_cognito_refreshToken_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AuthFlowBuilder_cognito_refreshToken_java_lang_Boolean__feature",
						"_UI_AuthFlowBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__REFRESH_TOKEN_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Password java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPassword_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AuthFlowBuilder_cognito_userPassword_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AuthFlowBuilder_cognito_userPassword_java_lang_Boolean__feature",
						"_UI_AuthFlowBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__USER_PASSWORD_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Srp java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserSrp_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AuthFlowBuilder_cognito_userSrp_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AuthFlowBuilder_cognito_userSrp_java_lang_Boolean__feature",
						"_UI_AuthFlowBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__USER_SRP_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AuthFlowBuilder_cognito_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AuthFlowBuilder_cognito_generatedClassName_feature", "_UI_AuthFlowBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_AuthFlowBuilder_cognito_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AuthFlowBuilder_cognito_varName_feature",
								"_UI_AuthFlowBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_AuthFlowBuilder_cognito_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AuthFlowBuilder_cognito_identifier_feature", "_UI_AuthFlowBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__IDENTIFIER, true, false, false,
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
				getString("_UI_AuthFlowBuilder_cognito_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AuthFlowBuilder_cognito_additionalCode_feature",
						"_UI_AuthFlowBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.AUTH_FLOW_BUILDER_COGNITO__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AuthFlowBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AuthFlowBuilder_cognito"));
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
		return  "AuthFlow " + ((AuthFlowBuilder_cognito) object).getVarName();
		
				
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

		switch (notification.getFeatureID(AuthFlowBuilder_cognito.class)) {
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADMIN_USER_PASSWORD_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__CUSTOM_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__REFRESH_TOKEN_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_PASSWORD_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__USER_SRP_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.AUTH_FLOW_BUILDER_COGNITO__ADDITIONAL_CODE:
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
