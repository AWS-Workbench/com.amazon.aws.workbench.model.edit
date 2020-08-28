/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DockerVolumeConfigurationBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerVolumeConfigurationBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerVolumeConfigurationBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addDriver_java_lang_String_PropertyDescriptor(object);
			addScope_software_amazon_awscdk_services_ecs_Scope_PropertyDescriptor(object);
			addAutoprovision_java_lang_Boolean_PropertyDescriptor(object);
			addDriverOpts_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addLabels_java_lang_String_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Driver java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriver_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DockerVolumeConfigurationBuilder_ecs_driver_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerVolumeConfigurationBuilder_ecs_driver_java_lang_String__feature",
						"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scope software amazon awscdk services ecs Scope  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScope_software_amazon_awscdk_services_ecs_Scope_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DockerVolumeConfigurationBuilder_ecs_scope_software_amazon_awscdk_services_ecs_Scope__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerVolumeConfigurationBuilder_ecs_scope_software_amazon_awscdk_services_ecs_Scope__feature",
						"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Autoprovision java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoprovision_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DockerVolumeConfigurationBuilder_ecs_autoprovision_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerVolumeConfigurationBuilder_ecs_autoprovision_java_lang_Boolean__feature",
						"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__AUTOPROVISION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Driver Opts java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverOpts_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DockerVolumeConfigurationBuilder_ecs_driverOpts_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerVolumeConfigurationBuilder_ecs_driverOpts_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Labels java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabels_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DockerVolumeConfigurationBuilder_ecs_labels_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerVolumeConfigurationBuilder_ecs_labels_java_lang_String_AsList_feature",
						"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__LABELS_JAVA_LANG_STRING_AS_LIST,
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
				getString("_UI_DockerVolumeConfigurationBuilder_ecs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerVolumeConfigurationBuilder_ecs_generatedClassName_feature",
						"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_DockerVolumeConfigurationBuilder_ecs_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DockerVolumeConfigurationBuilder_ecs_varName_feature",
								"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_DockerVolumeConfigurationBuilder_ecs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DockerVolumeConfigurationBuilder_ecs_identifier_feature",
								"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__IDENTIFIER, true, false,
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
				getString("_UI_DockerVolumeConfigurationBuilder_ecs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DockerVolumeConfigurationBuilder_ecs_additionalCode_feature",
						"_UI_DockerVolumeConfigurationBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DockerVolumeConfigurationBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DockerVolumeConfigurationBuilder_ecs"));
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
		return "DockerVolumeConfiguration " + ((DockerVolumeConfigurationBuilder_ecs) object).getVarName();

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

		switch (notification.getFeatureID(DockerVolumeConfigurationBuilder_ecs.class)) {
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__SCOPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SCOPE_:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__AUTOPROVISION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__DRIVER_OPTS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__LABELS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.DOCKER_VOLUME_CONFIGURATION_BUILDER_ECS__ADDITIONAL_CODE:
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
