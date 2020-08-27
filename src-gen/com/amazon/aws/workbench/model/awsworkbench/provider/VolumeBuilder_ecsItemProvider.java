/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VolumeBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VolumeBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addName_java_lang_String_PropertyDescriptor(object);
			addDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReferencePropertyDescriptor(
					object);
			addHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VolumeBuilder_ecs_name_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VolumeBuilder_ecs_name_java_lang_String__feature", "_UI_VolumeBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS__NAME_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Docker Volume Configuration With Docker Volume Configuration software amazon awscdk services ecs Docker Volume Configuration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VolumeBuilder_ecs_dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VolumeBuilder_ecs_dockerVolumeConfigurationWithDockerVolumeConfiguration_software_amazon_awscdk_services_ecs_DockerVolumeConfiguration_AsReference_feature",
						"_UI_VolumeBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS__DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Host With Host software amazon awscdk services ecs Host As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostWithHost_software_amazon_awscdk_services_ecs_Host_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VolumeBuilder_ecs_hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VolumeBuilder_ecs_hostWithHost_software_amazon_awscdk_services_ecs_Host_AsReference_feature",
						"_UI_VolumeBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS__HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_VolumeBuilder_ecs_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VolumeBuilder_ecs_generatedClassName_feature", "_UI_VolumeBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS__GENERATED_CLASS_NAME, false, false, false,
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
				getString("_UI_VolumeBuilder_ecs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VolumeBuilder_ecs_varName_feature",
						"_UI_VolumeBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS__VAR_NAME, true, false, false,
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
				getString("_UI_VolumeBuilder_ecs_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VolumeBuilder_ecs_identifier_feature",
						"_UI_VolumeBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS__IDENTIFIER, true, false, false,
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
				getString("_UI_VolumeBuilder_ecs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VolumeBuilder_ecs_additionalCode_feature",
						"_UI_VolumeBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.VOLUME_BUILDER_ECS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VolumeBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VolumeBuilder_ecs"));
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
		return  "Volume " + ((VolumeBuilder_ecs) object).getVarName();
		
				
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

		switch (notification.getFeatureID(VolumeBuilder_ecs.class)) {
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__DOCKER_VOLUME_CONFIGURATION_WITH_DOCKER_VOLUME_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_DOCKER_VOLUME_CONFIGURATION_AS_REFERENCE:
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__HOST_WITH_HOST_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HOST_AS_REFERENCE:
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.VOLUME_BUILDER_ECS__ADDITIONAL_CODE:
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
