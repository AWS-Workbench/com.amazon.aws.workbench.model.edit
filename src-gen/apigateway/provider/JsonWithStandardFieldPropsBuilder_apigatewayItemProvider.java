/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.JsonWithStandardFieldPropsBuilder_apigateway;

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
 * This is the item provider adapter for a {@link apigateway.JsonWithStandardFieldPropsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonWithStandardFieldPropsBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonWithStandardFieldPropsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addCaller_java_lang_Boolean_PropertyDescriptor(object);
			addHttpMethod_java_lang_Boolean_PropertyDescriptor(object);
			addIp_java_lang_Boolean_PropertyDescriptor(object);
			addProtocol_java_lang_Boolean_PropertyDescriptor(object);
			addRequestTime_java_lang_Boolean_PropertyDescriptor(object);
			addResourcePath_java_lang_Boolean_PropertyDescriptor(object);
			addResponseLength_java_lang_Boolean_PropertyDescriptor(object);
			addStatus_java_lang_Boolean_PropertyDescriptor(object);
			addUser_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Caller java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaller_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_caller_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_caller_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__CALLER_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Http Method java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpMethod_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_httpMethod_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_httpMethod_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ip java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIp_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_ip_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_ip_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__IP_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Protocol java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocol_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_protocol_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_protocol_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__PROTOCOL_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request Time java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestTime_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_requestTime_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_requestTime_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__REQUEST_TIME_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Path java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePath_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_resourcePath_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_resourcePath_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__RESOURCE_PATH_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Response Length java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseLength_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_responseLength_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_responseLength_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__RESPONSE_LENGTH_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Status java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatus_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_status_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_status_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__STATUS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUser_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_user_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_user_java_lang_Boolean__feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__USER_JAVA_LANG_BOOLEAN_,
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
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_generatedClassName_feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME,
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
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_varName_feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__VAR_NAME, true, false,
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
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_identifier_feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_additionalCode_feature",
						"_UI_JsonWithStandardFieldPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns JsonWithStandardFieldPropsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/JsonWithStandardFieldPropsBuilder_apigateway"));
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
		String label = ((JsonWithStandardFieldPropsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_type")
				: getString("_UI_JsonWithStandardFieldPropsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(JsonWithStandardFieldPropsBuilder_apigateway.class)) {
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__CALLER_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__IP_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__PROTOCOL_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__REQUEST_TIME_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__RESOURCE_PATH_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__RESPONSE_LENGTH_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__STATUS_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__USER_JAVA_LANG_BOOLEAN_:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.JSON_WITH_STANDARD_FIELD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
