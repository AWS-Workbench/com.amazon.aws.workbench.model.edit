/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppMeshProxyConfigurationBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppMeshProxyConfigurationBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addContainerName_java_lang_String_PropertyDescriptor(object);
			addPropertiesWithAppMeshProxyConfigurationProps_software_amazon_awscdk_services_ecs_AppMeshProxyConfigurationProps_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Container Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppMeshProxyConfigurationBuilder_ecs_containerName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_containerName_java_lang_String__feature",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__CONTAINER_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Properties With App Mesh Proxy Configuration Props software amazon awscdk services ecs App Mesh Proxy Configuration Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesWithAppMeshProxyConfigurationProps_software_amazon_awscdk_services_ecs_AppMeshProxyConfigurationProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AppMeshProxyConfigurationBuilder_ecs_propertiesWithAppMeshProxyConfigurationProps_software_amazon_awscdk_services_ecs_AppMeshProxyConfigurationProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_propertiesWithAppMeshProxyConfigurationProps_software_amazon_awscdk_services_ecs_AppMeshProxyConfigurationProps_AsReference_feature",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__PROPERTIES_WITH_APP_MESH_PROXY_CONFIGURATION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_APP_MESH_PROXY_CONFIGURATION_PROPS_AS_REFERENCE,
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
				getString("_UI_AppMeshProxyConfigurationBuilder_ecs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_generatedClassName_feature",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_AppMeshProxyConfigurationBuilder_ecs_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AppMeshProxyConfigurationBuilder_ecs_varName_feature",
								"_UI_AppMeshProxyConfigurationBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_AppMeshProxyConfigurationBuilder_ecs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AppMeshProxyConfigurationBuilder_ecs_identifier_feature",
								"_UI_AppMeshProxyConfigurationBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__IDENTIFIER, true, false,
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
				getString("_UI_AppMeshProxyConfigurationBuilder_ecs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_additionalCode_feature",
						"_UI_AppMeshProxyConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AppMeshProxyConfigurationBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AppMeshProxyConfigurationBuilder_ecs"));
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
		return "AppMeshProxyConfiguration " + ((AppMeshProxyConfigurationBuilder_ecs) object).getVarName();

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

		switch (notification.getFeatureID(AppMeshProxyConfigurationBuilder_ecs.class)) {
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__CONTAINER_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__PROPERTIES_WITH_APP_MESH_PROXY_CONFIGURATION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_APP_MESH_PROXY_CONFIGURATION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE:
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
