/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ClusterBuilder_ecs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ClusterBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusterBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReferencePropertyDescriptor(
					object);
			addClusterName_java_lang_String_PropertyDescriptor(object);
			addContainerInsights_java_lang_Boolean_PropertyDescriptor(object);
			addDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReferencePropertyDescriptor(
					object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Capacity With Add Capacity Options software amazon awscdk services ecs Add Capacity Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ClusterBuilder_ecs_capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ClusterBuilder_ecs_capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference_feature",
						"_UI_ClusterBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cluster Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClusterName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ClusterBuilder_ecs_clusterName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ClusterBuilder_ecs_clusterName_java_lang_String__feature", "_UI_ClusterBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__CLUSTER_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Container Insights java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerInsights_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ClusterBuilder_ecs_containerInsights_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ClusterBuilder_ecs_containerInsights_java_lang_Boolean__feature",
						"_UI_ClusterBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Cloud Map Namespace With Cloud Map Namespace Options software amazon awscdk services ecs Cloud Map Namespace Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ClusterBuilder_ecs_defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ClusterBuilder_ecs_defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference_feature",
						"_UI_ClusterBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ClusterBuilder_ecs_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ClusterBuilder_ecs_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_ClusterBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_ClusterBuilder_ecs_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ClusterBuilder_ecs_generatedClassName_feature", "_UI_ClusterBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__GENERATED_CLASS_NAME, false, false, false,
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
				getString("_UI_ClusterBuilder_ecs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ClusterBuilder_ecs_varName_feature",
						"_UI_ClusterBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__VAR_NAME, true, false, false,
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
				getString("_UI_ClusterBuilder_ecs_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ClusterBuilder_ecs_identifier_feature",
						"_UI_ClusterBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_ClusterBuilder_ecs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ClusterBuilder_ecs_additionalCode_feature",
								"_UI_ClusterBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ClusterBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClusterBuilder_ecs"));
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
		String label = ((ClusterBuilder_ecs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_ClusterBuilder_ecs_type")
				: getString("_UI_ClusterBuilder_ecs_type") + " " + label;
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

		switch (notification.getFeatureID(ClusterBuilder_ecs.class)) {
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CLUSTER_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__ADDITIONAL_CODE:
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
