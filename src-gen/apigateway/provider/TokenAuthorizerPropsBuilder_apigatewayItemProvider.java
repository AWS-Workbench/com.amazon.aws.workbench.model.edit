/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.TokenAuthorizerPropsBuilder_apigateway;

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
 * This is the item provider adapter for a {@link apigateway.TokenAuthorizerPropsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenAuthorizerPropsBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenAuthorizerPropsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addIdentitySource_java_lang_String_PropertyDescriptor(object);
			addValidationRegex_java_lang_String_PropertyDescriptor(object);
			addHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
					object);
			addAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addAuthorizerName_java_lang_String_PropertyDescriptor(object);
			addResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identity Source java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentitySource_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TokenAuthorizerPropsBuilder_apigateway_identitySource_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_identitySource_java_lang_String__feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTITY_SOURCE_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Validation Regex java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationRegex_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TokenAuthorizerPropsBuilder_apigateway_validationRegex_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_validationRegex_java_lang_String__feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VALIDATION_REGEX_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Handler With IFunction software amazon awscdk services lambda IFunction As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHandlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TokenAuthorizerPropsBuilder_apigateway_handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_handlerWithIFunction_software_amazon_awscdk_services_lambda_IFunction_AsReference_feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Assume Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TokenAuthorizerPropsBuilder_apigateway_assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_assumeRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Authorizer Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizerName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TokenAuthorizerPropsBuilder_apigateway_authorizerName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_authorizerName_java_lang_String__feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Results Cache Ttl With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_TokenAuthorizerPropsBuilder_apigateway_resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_resultsCacheTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_TokenAuthorizerPropsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_generatedClassName_feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_TokenAuthorizerPropsBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TokenAuthorizerPropsBuilder_apigateway_varName_feature",
								"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VAR_NAME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_TokenAuthorizerPropsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_identifier_feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
				getString("_UI_TokenAuthorizerPropsBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_additionalCode_feature",
						"_UI_TokenAuthorizerPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TokenAuthorizerPropsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TokenAuthorizerPropsBuilder_apigateway"));
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
		String label = ((TokenAuthorizerPropsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_TokenAuthorizerPropsBuilder_apigateway_type")
				: getString("_UI_TokenAuthorizerPropsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(TokenAuthorizerPropsBuilder_apigateway.class)) {
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTITY_SOURCE_JAVA_LANG_STRING_:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VALIDATION_REGEX_JAVA_LANG_STRING_:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__HANDLER_WITH_IFUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IFUNCTION_AS_REFERENCE:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ASSUME_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__AUTHORIZER_NAME_JAVA_LANG_STRING_:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__RESULTS_CACHE_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.TOKEN_AUTHORIZER_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
