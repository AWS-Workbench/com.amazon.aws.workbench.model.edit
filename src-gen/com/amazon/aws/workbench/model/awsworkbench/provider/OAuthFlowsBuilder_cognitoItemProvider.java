/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.OAuthFlowsBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OAuthFlowsBuilder_cognitoItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthFlowsBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addAuthorizationCodeGrant_java_lang_Boolean_PropertyDescriptor(object);
			addClientCredentials_java_lang_Boolean_PropertyDescriptor(object);
			addImplicitCodeGrant_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Authorization Code Grant java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizationCodeGrant_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OAuthFlowsBuilder_cognito_authorizationCodeGrant_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OAuthFlowsBuilder_cognito_authorizationCodeGrant_java_lang_Boolean__feature",
						"_UI_OAuthFlowsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO__AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Client Credentials java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientCredentials_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OAuthFlowsBuilder_cognito_clientCredentials_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OAuthFlowsBuilder_cognito_clientCredentials_java_lang_Boolean__feature",
						"_UI_OAuthFlowsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO__CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Implicit Code Grant java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitCodeGrant_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OAuthFlowsBuilder_cognito_implicitCodeGrant_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OAuthFlowsBuilder_cognito_implicitCodeGrant_java_lang_Boolean__feature",
						"_UI_OAuthFlowsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO__IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_OAuthFlowsBuilder_cognito_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_OAuthFlowsBuilder_cognito_generatedClassName_feature",
								"_UI_OAuthFlowsBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_OAuthFlowsBuilder_cognito_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OAuthFlowsBuilder_cognito_varName_feature",
								"_UI_OAuthFlowsBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO__VAR_NAME, true, false, false,
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
				getString("_UI_OAuthFlowsBuilder_cognito_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OAuthFlowsBuilder_cognito_identifier_feature",
						"_UI_OAuthFlowsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO__IDENTIFIER, true, false, false,
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
				getString("_UI_OAuthFlowsBuilder_cognito_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OAuthFlowsBuilder_cognito_additionalCode_feature",
						"_UI_OAuthFlowsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_FLOWS_BUILDER_COGNITO__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns OAuthFlowsBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OAuthFlowsBuilder_cognito"));
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
		return "OAuthFlows " + ((OAuthFlowsBuilder_cognito) object).getVarName();

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

		switch (notification.getFeatureID(OAuthFlowsBuilder_cognito.class)) {
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__AUTHORIZATION_CODE_GRANT_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__CLIENT_CREDENTIALS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IMPLICIT_CODE_GRANT_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.OAUTH_FLOWS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
