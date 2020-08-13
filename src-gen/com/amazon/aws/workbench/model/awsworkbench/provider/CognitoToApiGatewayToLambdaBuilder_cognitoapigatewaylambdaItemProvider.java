/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaItemProvider
		extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambdaItemProvider(AdapterFactory adapterFactory) {
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

			addApiGatewayProps_java_lang_Object_PropertyDescriptor(object);
			addCognitoUserPoolClientPropsWithUserPoolClientProps_software_amazon_awscdk_services_cognito_UserPoolClientProps_AsReferencePropertyDescriptor(
					object);
			addCognitoUserPoolPropsWithUserPoolProps_software_amazon_awscdk_services_cognito_UserPoolProps_AsReferencePropertyDescriptor(
					object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Api Gateway Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiGatewayProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_apiGatewayProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_apiGatewayProps_java_lang_Object__feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cognito User Pool Client Props With User Pool Client Props software amazon awscdk services cognito User Pool Client Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCognitoUserPoolClientPropsWithUserPoolClientProps_software_amazon_awscdk_services_cognito_UserPoolClientProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_cognitoUserPoolClientPropsWithUserPoolClientProps_software_amazon_awscdk_services_cognito_UserPoolClientProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_cognitoUserPoolClientPropsWithUserPoolClientProps_software_amazon_awscdk_services_cognito_UserPoolClientProps_AsReference_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__COGNITO_USER_POOL_CLIENT_PROPS_WITH_USER_POOL_CLIENT_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cognito User Pool Props With User Pool Props software amazon awscdk services cognito User Pool Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCognitoUserPoolPropsWithUserPoolProps_software_amazon_awscdk_services_cognito_UserPoolProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_cognitoUserPoolPropsWithUserPoolProps_software_amazon_awscdk_services_cognito_UserPoolProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_cognitoUserPoolPropsWithUserPoolProps_software_amazon_awscdk_services_cognito_UserPoolProps_AsReference_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__COGNITO_USER_POOL_PROPS_WITH_USER_POOL_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
				getString("_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_generatedClassName_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__GENERATED_CLASS_NAME,
				false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_varName_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__VAR_NAME,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_identifier_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__IDENTIFIER,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_additionalCode_feature",
						"_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda"));
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
		String label = ((CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type")
				: getString("_UI_CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda_type") + " " + label;
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

		switch (notification.getFeatureID(CognitoToApiGatewayToLambdaBuilder_cognitoapigatewaylambda.class)) {
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__COGNITO_USER_POOL_CLIENT_PROPS_WITH_USER_POOL_CLIENT_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_CLIENT_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__COGNITO_USER_POOL_PROPS_WITH_USER_POOL_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_COGNITO_USER_POOL_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__VAR_NAME:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.COGNITO_TO_API_GATEWAY_TO_LAMBDA_BUILDER_COGNITOAPIGATEWAYLAMBDA__ADDITIONAL_CODE:
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
