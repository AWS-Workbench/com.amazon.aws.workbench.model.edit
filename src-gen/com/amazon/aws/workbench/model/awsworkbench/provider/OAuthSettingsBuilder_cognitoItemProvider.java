/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.OAuthSettingsBuilder_cognito} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OAuthSettingsBuilder_cognitoItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthSettingsBuilder_cognitoItemProvider(AdapterFactory adapterFactory) {
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

			addCallbackUrls_java_lang_String_AsListPropertyDescriptor(object);
			addFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReferencePropertyDescriptor(
					object);
			addScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Callback Urls java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallbackUrls_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OAuthSettingsBuilder_cognito_callbackUrls_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OAuthSettingsBuilder_cognito_callbackUrls_java_lang_String_AsList_feature",
						"_UI_OAuthSettingsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO__CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Flows With OAuth Flows software amazon awscdk services cognito OAuth Flows As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_OAuthSettingsBuilder_cognito_flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OAuthSettingsBuilder_cognito_flowsWithOAuthFlows_software_amazon_awscdk_services_cognito_OAuthFlows_AsReference_feature",
						"_UI_OAuthSettingsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO__FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scopes software amazon awscdk services cognito OAuth Scope As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopes_software_amazon_awscdk_services_cognito_OAuthScope_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_OAuthSettingsBuilder_cognito_scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OAuthSettingsBuilder_cognito_scopes_software_amazon_awscdk_services_cognito_OAuthScope_AsList_feature",
						"_UI_OAuthSettingsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO__SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST,
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
						getResourceLocator(), getString("_UI_OAuthSettingsBuilder_cognito_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_OAuthSettingsBuilder_cognito_generatedClassName_feature",
								"_UI_OAuthSettingsBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_OAuthSettingsBuilder_cognito_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OAuthSettingsBuilder_cognito_varName_feature",
						"_UI_OAuthSettingsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO__VAR_NAME, true, false, false,
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
				getString("_UI_OAuthSettingsBuilder_cognito_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OAuthSettingsBuilder_cognito_identifier_feature",
						"_UI_OAuthSettingsBuilder_cognito_type"),
				AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_OAuthSettingsBuilder_cognito_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_OAuthSettingsBuilder_cognito_additionalCode_feature",
								"_UI_OAuthSettingsBuilder_cognito_type"),
						AwsworkbenchPackage.Literals.OAUTH_SETTINGS_BUILDER_COGNITO__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns OAuthSettingsBuilder_cognito.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OAuthSettingsBuilder_cognito"));
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
		return "OAuthSettings " + ((OAuthSettingsBuilder_cognito) object).getVarName();

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

		switch (notification.getFeatureID(OAuthSettingsBuilder_cognito.class)) {
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__CALLBACK_URLS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__FLOWS_WITH_OAUTH_FLOWS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_FLOWS_AS_REFERENCE:
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__SCOPES_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_OAUTH_SCOPE_AS_LIST:
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__VAR_NAME:
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__IDENTIFIER:
		case AwsworkbenchPackage.OAUTH_SETTINGS_BUILDER_COGNITO__ADDITIONAL_CODE:
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
