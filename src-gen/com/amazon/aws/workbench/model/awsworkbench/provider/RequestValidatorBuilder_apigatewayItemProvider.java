/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RequestValidatorBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RequestValidatorBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequestValidatorBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestValidatorBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addRequestValidatorName_java_lang_String_PropertyDescriptor(object);
			addValidateRequestBody_java_lang_Boolean_PropertyDescriptor(object);
			addValidateRequestParameters_java_lang_Boolean_PropertyDescriptor(object);
			addRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Request Validator Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestValidatorName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequestValidatorBuilder_apigateway_requestValidatorName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequestValidatorBuilder_apigateway_requestValidatorName_java_lang_String__feature",
						"_UI_RequestValidatorBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Validate Request Body java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidateRequestBody_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequestValidatorBuilder_apigateway_validateRequestBody_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequestValidatorBuilder_apigateway_validateRequestBody_java_lang_Boolean__feature",
						"_UI_RequestValidatorBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Validate Request Parameters java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidateRequestParameters_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RequestValidatorBuilder_apigateway_validateRequestParameters_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequestValidatorBuilder_apigateway_validateRequestParameters_java_lang_Boolean__feature",
						"_UI_RequestValidatorBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rest Api With IRest Api software amazon awscdk services apigateway IRest Api As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RequestValidatorBuilder_apigateway_restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequestValidatorBuilder_apigateway_restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference_feature",
						"_UI_RequestValidatorBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE,
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
				getString("_UI_RequestValidatorBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequestValidatorBuilder_apigateway_generatedClassName_feature",
						"_UI_RequestValidatorBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_RequestValidatorBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RequestValidatorBuilder_apigateway_varName_feature",
								"_UI_RequestValidatorBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_RequestValidatorBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RequestValidatorBuilder_apigateway_identifier_feature",
								"_UI_RequestValidatorBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_RequestValidatorBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequestValidatorBuilder_apigateway_additionalCode_feature",
						"_UI_RequestValidatorBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RequestValidatorBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequestValidatorBuilder_apigateway"));
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
		return "RequestValidator " + ((RequestValidatorBuilder_apigateway) object).getVarName();

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

		switch (notification.getFeatureID(RequestValidatorBuilder_apigateway.class)) {
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_BODY_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VALIDATE_REQUEST_PARAMETERS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.REQUEST_VALIDATOR_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
