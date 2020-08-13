/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CognitoOptionsBuilder_core;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CognitoOptionsBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CognitoOptionsBuilder_coreItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitoOptionsBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReferencePropertyDescriptor(
					object);
			addUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReferencePropertyDescriptor(
					object);
			addUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identitypool With Cfn Identity Pool software amazon awscdk services cognito Cfn Identity Pool As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoOptionsBuilder_core_identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoOptionsBuilder_core_identitypoolWithCfnIdentityPool_software_amazon_awscdk_services_cognito_CfnIdentityPool_AsReference_feature",
						"_UI_CognitoOptionsBuilder_core_type"),
				AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Userpool With User Pool software amazon awscdk services cognito User Pool As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoOptionsBuilder_core_userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoOptionsBuilder_core_userpoolWithUserPool_software_amazon_awscdk_services_cognito_UserPool_AsReference_feature",
						"_UI_CognitoOptionsBuilder_core_type"),
				AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Userpoolclient With User Pool Client software amazon awscdk services cognito User Pool Client As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoOptionsBuilder_core_userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoOptionsBuilder_core_userpoolclientWithUserPoolClient_software_amazon_awscdk_services_cognito_UserPoolClient_AsReference_feature",
						"_UI_CognitoOptionsBuilder_core_type"),
				AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_CognitoOptionsBuilder_core_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CognitoOptionsBuilder_core_generatedClassName_feature",
								"_UI_CognitoOptionsBuilder_core_type"),
						AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_CognitoOptionsBuilder_core_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CognitoOptionsBuilder_core_varName_feature",
						"_UI_CognitoOptionsBuilder_core_type"),
				AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME, true, false, false,
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
				getString("_UI_CognitoOptionsBuilder_core_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CognitoOptionsBuilder_core_identifier_feature",
						"_UI_CognitoOptionsBuilder_core_type"),
				AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER, true, false, false,
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
				getString("_UI_CognitoOptionsBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CognitoOptionsBuilder_core_additionalCode_feature",
						"_UI_CognitoOptionsBuilder_core_type"),
				AwsworkbenchPackage.Literals.COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CognitoOptionsBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CognitoOptionsBuilder_core"));
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
		String label = ((CognitoOptionsBuilder_core) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_CognitoOptionsBuilder_core_type")
				: getString("_UI_CognitoOptionsBuilder_core_type") + " " + label;
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

		switch (notification.getFeatureID(CognitoOptionsBuilder_core.class)) {
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTITYPOOL_WITH_CFN_IDENTITY_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_CFN_IDENTITY_POOL_AS_REFERENCE:
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOL_WITH_USER_POOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_AS_REFERENCE:
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__USERPOOLCLIENT_WITH_USER_POOL_CLIENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_AS_REFERENCE:
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__VAR_NAME:
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__IDENTIFIER:
		case AwsworkbenchPackage.COGNITO_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
