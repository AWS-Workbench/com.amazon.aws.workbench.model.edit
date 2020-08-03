/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.MethodOptionsBuilder_apigateway;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

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
 * This is the item provider adapter for a {@link apigateway.MethodOptionsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodOptionsBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodOptionsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addApiKeyRequired_java_lang_Boolean_PropertyDescriptor(object);
			addAuthorizationScopes_java_lang_String_AsListPropertyDescriptor(object);
			addAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_PropertyDescriptor(
					object);
			addAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReferencePropertyDescriptor(
					object);
			addMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsListPropertyDescriptor(
					object);
			addOperationName_java_lang_String_PropertyDescriptor(object);
			addRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMapPropertyDescriptor(
					object);
			addRequestParameters_java_lang_String__java_lang_Boolean_AsMapPropertyDescriptor(object);
			addRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReferencePropertyDescriptor(
					object);
			addRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Api Key Required java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiKeyRequired_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MethodOptionsBuilder_apigateway_apiKeyRequired_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_apiKeyRequired_java_lang_Boolean__feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Authorization Scopes java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizationScopes_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MethodOptionsBuilder_apigateway_authorizationScopes_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_authorizationScopes_java_lang_String_AsList_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Authorization Type software amazon awscdk services apigateway Authorization Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodOptionsBuilder_apigateway_authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_authorizationType_software_amazon_awscdk_services_apigateway_AuthorizationType__feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Authorizer With IAuthorizer software amazon awscdk services apigateway IAuthorizer As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodOptionsBuilder_apigateway_authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_authorizerWithIAuthorizer_software_amazon_awscdk_services_apigateway_IAuthorizer_AsReference_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Method Responses software amazon awscdk services apigateway Method Response As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodOptionsBuilder_apigateway_methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_methodResponses_software_amazon_awscdk_services_apigateway_MethodResponse_AsList_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operation Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MethodOptionsBuilder_apigateway_operationName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_operationName_java_lang_String__feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Models java lang String software amazon awscdk services apigateway IModel As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodOptionsBuilder_apigateway_requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_requestModels_java_lang_String__software_amazon_awscdk_services_apigateway_IModel_AsMap_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Parameters java lang String java lang Boolean As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestParameters_java_lang_String__java_lang_Boolean_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodOptionsBuilder_apigateway_requestParameters_java_lang_String__java_lang_Boolean_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_requestParameters_java_lang_String__java_lang_Boolean_AsMap_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Validator With IRequest Validator software amazon awscdk services apigateway IRequest Validator As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodOptionsBuilder_apigateway_requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_requestValidatorWithIRequestValidator_software_amazon_awscdk_services_apigateway_IRequestValidator_AsReference_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Validator Options With Request Validator Options software amazon awscdk services apigateway Request Validator Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodOptionsBuilder_apigateway_requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_requestValidatorOptionsWithRequestValidatorOptions_software_amazon_awscdk_services_apigateway_RequestValidatorOptions_AsReference_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE,
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
				getString("_UI_MethodOptionsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodOptionsBuilder_apigateway_generatedClassName_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_MethodOptionsBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MethodOptionsBuilder_apigateway_varName_feature",
						"_UI_MethodOptionsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_MethodOptionsBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MethodOptionsBuilder_apigateway_identifier_feature",
								"_UI_MethodOptionsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_MethodOptionsBuilder_apigateway_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MethodOptionsBuilder_apigateway_additionalCode_feature",
								"_UI_MethodOptionsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns MethodOptionsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodOptionsBuilder_apigateway"));
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
		String label = ((MethodOptionsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_MethodOptionsBuilder_apigateway_type")
				: getString("_UI_MethodOptionsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(MethodOptionsBuilder_apigateway.class)) {
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__API_KEY_REQUIRED_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_SCOPES_JAVA_LANG_STRING_AS_LIST:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_AUTHORIZATION_TYPE_:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__AUTHORIZER_WITH_IAUTHORIZER_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IAUTHORIZER_AS_REFERENCE:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__METHOD_RESPONSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_RESPONSE_AS_LIST:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__OPERATION_NAME_JAVA_LANG_STRING_:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_MODELS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IMODEL_AS_MAP:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_BOOLEAN_AS_MAP:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_WITH_IREQUEST_VALIDATOR_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREQUEST_VALIDATOR_AS_REFERENCE:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__REQUEST_VALIDATOR_OPTIONS_WITH_REQUEST_VALIDATOR_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_REQUEST_VALIDATOR_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.METHOD_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
