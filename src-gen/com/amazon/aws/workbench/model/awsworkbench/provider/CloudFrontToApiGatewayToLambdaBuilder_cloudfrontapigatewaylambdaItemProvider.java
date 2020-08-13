/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaItemProvider
		extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambdaItemProvider(AdapterFactory adapterFactory) {
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

			addApiGatewayPropsWithLambdaRestApiProps_software_amazon_awscdk_services_apigateway_LambdaRestApiProps_AsReferencePropertyDescriptor(
					object);
			addCloudFrontDistributionProps_java_lang_Object_PropertyDescriptor(object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addInsertHttpSecurityHeaders_java_lang_Boolean_PropertyDescriptor(object);
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
	 * This adds a property descriptor for the Api Gateway Props With Lambda Rest Api Props software amazon awscdk services apigateway Lambda Rest Api Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiGatewayPropsWithLambdaRestApiProps_software_amazon_awscdk_services_apigateway_LambdaRestApiProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_apiGatewayPropsWithLambdaRestApiProps_software_amazon_awscdk_services_apigateway_LambdaRestApiProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_apiGatewayPropsWithLambdaRestApiProps_software_amazon_awscdk_services_apigateway_LambdaRestApiProps_AsReference_feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__API_GATEWAY_PROPS_WITH_LAMBDA_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_LAMBDA_REST_API_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cloud Front Distribution Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudFrontDistributionProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_cloudFrontDistributionProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_cloudFrontDistributionProps_java_lang_Object__feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_,
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
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Insert Http Security Headers java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertHttpSecurityHeaders_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_insertHttpSecurityHeaders_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_insertHttpSecurityHeaders_java_lang_Boolean__feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_,
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
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
				getString(
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_generatedClassName_feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__GENERATED_CLASS_NAME,
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
				getString("_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_varName_feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__VAR_NAME,
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
				getString("_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_identifier_feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__IDENTIFIER,
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
				getString(
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_additionalCode_feature",
						"_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator()
				.getImage("full/obj16/CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda"));
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
		String label = ((CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda) object)
				.getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type")
				: getString("_UI_CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda_type") + " " + label;
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

		switch (notification.getFeatureID(CloudFrontToApiGatewayToLambdaBuilder_cloudfrontapigatewaylambda.class)) {
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__API_GATEWAY_PROPS_WITH_LAMBDA_REST_API_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_LAMBDA_REST_API_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__VAR_NAME:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_API_GATEWAY_TO_LAMBDA_BUILDER_CLOUDFRONTAPIGATEWAYLAMBDA__ADDITIONAL_CODE:
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
