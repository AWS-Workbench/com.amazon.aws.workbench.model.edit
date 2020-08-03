/**
 */
package apigateway.provider;

import apigateway.ApiDefinitionConfigBuilder_apigateway;
import apigateway.ApigatewayPackage;

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
 * This is the item provider adapter for a {@link apigateway.ApiDefinitionConfigBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiDefinitionConfigBuilder_apigatewayItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiDefinitionConfigBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addInlineDefinition_java_lang_Object_PropertyDescriptor(object);
			addS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inline Definition java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInlineDefinition_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiDefinitionConfigBuilder_apigateway_inlineDefinition_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiDefinitionConfigBuilder_apigateway_inlineDefinition_java_lang_Object__feature",
						"_UI_ApiDefinitionConfigBuilder_apigateway_type"),
				ApigatewayPackage.Literals.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the S3 Location With Api Definition S3 Location software amazon awscdk services apigateway Api Definition S3 Location As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addS3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApiDefinitionConfigBuilder_apigateway_s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiDefinitionConfigBuilder_apigateway_s3LocationWithApiDefinitionS3Location_software_amazon_awscdk_services_apigateway_ApiDefinitionS3Location_AsReference_feature",
						"_UI_ApiDefinitionConfigBuilder_apigateway_type"),
				ApigatewayPackage.Literals.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE,
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
				getString("_UI_ApiDefinitionConfigBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiDefinitionConfigBuilder_apigateway_generatedClassName_feature",
						"_UI_ApiDefinitionConfigBuilder_apigateway_type"),
				ApigatewayPackage.Literals.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_ApiDefinitionConfigBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ApiDefinitionConfigBuilder_apigateway_varName_feature",
								"_UI_ApiDefinitionConfigBuilder_apigateway_type"),
						ApigatewayPackage.Literals.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_ApiDefinitionConfigBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ApiDefinitionConfigBuilder_apigateway_identifier_feature",
								"_UI_ApiDefinitionConfigBuilder_apigateway_type"),
						ApigatewayPackage.Literals.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_ApiDefinitionConfigBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiDefinitionConfigBuilder_apigateway_additionalCode_feature",
						"_UI_ApiDefinitionConfigBuilder_apigateway_type"),
				ApigatewayPackage.Literals.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ApiDefinitionConfigBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApiDefinitionConfigBuilder_apigateway"));
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
		String label = ((ApiDefinitionConfigBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_ApiDefinitionConfigBuilder_apigateway_type")
				: getString("_UI_ApiDefinitionConfigBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(ApiDefinitionConfigBuilder_apigateway.class)) {
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__INLINE_DEFINITION_JAVA_LANG_OBJECT_:
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__S3_LOCATION_WITH_API_DEFINITION_S3_LOCATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_API_DEFINITION_S3_LOCATION_AS_REFERENCE:
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__VAR_NAME:
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__IDENTIFIER:
		case ApigatewayPackage.API_DEFINITION_CONFIG_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
