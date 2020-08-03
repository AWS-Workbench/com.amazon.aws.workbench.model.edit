/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.GatewayResponsePropsBuilder_apigateway;

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
 * This is the item provider adapter for a {@link apigateway.GatewayResponsePropsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GatewayResponsePropsBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayResponsePropsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addRestApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReferencePropertyDescriptor(
					object);
			addTypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReferencePropertyDescriptor(
					object);
			addResponseHeaders_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addStatusCode_java_lang_String_PropertyDescriptor(object);
			addTemplates_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						"_UI_GatewayResponsePropsBuilder_apigateway_restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_restApiWithIRestApi_software_amazon_awscdk_services_apigateway_IRestApi_AsReference_feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type With Response Type software amazon awscdk services apigateway Response Type As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_GatewayResponsePropsBuilder_apigateway_typeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_typeWithResponseType_software_amazon_awscdk_services_apigateway_ResponseType_AsReference_feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__TYPE_WITH_RESPONSE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_RESPONSE_TYPE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Response Headers java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseHeaders_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_GatewayResponsePropsBuilder_apigateway_responseHeaders_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_responseHeaders_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__RESPONSE_HEADERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Status Code java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusCode_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GatewayResponsePropsBuilder_apigateway_statusCode_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_statusCode_java_lang_String__feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Templates java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplates_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_GatewayResponsePropsBuilder_apigateway_templates_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_templates_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
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
				getString("_UI_GatewayResponsePropsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_generatedClassName_feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_GatewayResponsePropsBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_GatewayResponsePropsBuilder_apigateway_varName_feature",
								"_UI_GatewayResponsePropsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__VAR_NAME, true, false,
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
				getString("_UI_GatewayResponsePropsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_identifier_feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
				getString("_UI_GatewayResponsePropsBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GatewayResponsePropsBuilder_apigateway_additionalCode_feature",
						"_UI_GatewayResponsePropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns GatewayResponsePropsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GatewayResponsePropsBuilder_apigateway"));
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
		String label = ((GatewayResponsePropsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_GatewayResponsePropsBuilder_apigateway_type")
				: getString("_UI_GatewayResponsePropsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(GatewayResponsePropsBuilder_apigateway.class)) {
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__REST_API_WITH_IREST_API_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IREST_API_AS_REFERENCE:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__TYPE_WITH_RESPONSE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_RESPONSE_TYPE_AS_REFERENCE:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__RESPONSE_HEADERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.GATEWAY_RESPONSE_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
