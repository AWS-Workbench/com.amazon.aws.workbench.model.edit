/**
 */
package apigateway.provider;

import apigateway.ApigatewayPackage;
import apigateway.MethodPropsBuilder_apigateway;

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
 * This is the item provider adapter for a {@link apigateway.MethodPropsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodPropsBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPropsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addHttpMethod_java_lang_String_PropertyDescriptor(object);
			addResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReferencePropertyDescriptor(
					object);
			addIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReferencePropertyDescriptor(
					object);
			addOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Http Method java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpMethod_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MethodPropsBuilder_apigateway_httpMethod_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodPropsBuilder_apigateway_httpMethod_java_lang_String__feature",
						"_UI_MethodPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource With IResource software amazon awscdk services apigateway IResource As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodPropsBuilder_apigateway_resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodPropsBuilder_apigateway_resourceWithIResource_software_amazon_awscdk_services_apigateway_IResource_AsReference_feature",
						"_UI_MethodPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Integration With Integration software amazon awscdk services apigateway Integration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodPropsBuilder_apigateway_integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodPropsBuilder_apigateway_integrationWithIntegration_software_amazon_awscdk_services_apigateway_Integration_AsReference_feature",
						"_UI_MethodPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Options With Method Options software amazon awscdk services apigateway Method Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_MethodPropsBuilder_apigateway_optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MethodPropsBuilder_apigateway_optionsWithMethodOptions_software_amazon_awscdk_services_apigateway_MethodOptions_AsReference_feature",
						"_UI_MethodPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_MethodPropsBuilder_apigateway_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MethodPropsBuilder_apigateway_generatedClassName_feature",
								"_UI_MethodPropsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_MethodPropsBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MethodPropsBuilder_apigateway_varName_feature",
						"_UI_MethodPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
				getString("_UI_MethodPropsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MethodPropsBuilder_apigateway_identifier_feature",
						"_UI_MethodPropsBuilder_apigateway_type"),
				ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_MethodPropsBuilder_apigateway_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MethodPropsBuilder_apigateway_additionalCode_feature",
								"_UI_MethodPropsBuilder_apigateway_type"),
						ApigatewayPackage.Literals.METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns MethodPropsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodPropsBuilder_apigateway"));
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
		String label = ((MethodPropsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_MethodPropsBuilder_apigateway_type")
				: getString("_UI_MethodPropsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(MethodPropsBuilder_apigateway.class)) {
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__HTTP_METHOD_JAVA_LANG_STRING_:
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__RESOURCE_WITH_IRESOURCE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_IRESOURCE_AS_REFERENCE:
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__INTEGRATION_WITH_INTEGRATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_INTEGRATION_AS_REFERENCE:
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__OPTIONS_WITH_METHOD_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_METHOD_OPTIONS_AS_REFERENCE:
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.METHOD_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
