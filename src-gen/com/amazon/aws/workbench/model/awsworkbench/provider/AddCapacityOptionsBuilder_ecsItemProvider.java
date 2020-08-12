/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AddCapacityOptionsBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AddCapacityOptionsBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddCapacityOptionsBuilder_ecsItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCapacityOptionsBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReferencePropertyDescriptor(
					object);
			addMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReferencePropertyDescriptor(
					object);
			addCanContainersAccessInstanceRole_java_lang_Boolean_PropertyDescriptor(object);
			addSpotInstanceDraining_java_lang_Boolean_PropertyDescriptor(object);
			addTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addAllowAllOutbound_java_lang_Boolean_PropertyDescriptor(object);
			addAssociatePublicIpAddress_java_lang_Boolean_PropertyDescriptor(object);
			addBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsListPropertyDescriptor(object);
			addCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addDesiredCapacity_java_lang_Number_PropertyDescriptor(object);
			addHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReferencePropertyDescriptor(
					object);
			addIgnoreUnmodifiedSizeProperties_java_lang_Boolean_PropertyDescriptor(object);
			addKeyName_java_lang_String_PropertyDescriptor(object);
			addMaxCapacity_java_lang_Number_PropertyDescriptor(object);
			addMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addMinCapacity_java_lang_Number_PropertyDescriptor(object);
			addNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReferencePropertyDescriptor(
					object);
			addReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_PropertyDescriptor(object);
			addResourceSignalCount_java_lang_Number_PropertyDescriptor(object);
			addResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReferencePropertyDescriptor(
					object);
			addSpotPrice_java_lang_String_PropertyDescriptor(object);
			addUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_PropertyDescriptor(object);
			addVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Can Containers Access Instance Role java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanContainersAccessInstanceRole_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_canContainersAccessInstanceRole_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_canContainersAccessInstanceRole_java_lang_Boolean__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Spot Instance Draining java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpotInstanceDraining_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_spotInstanceDraining_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_spotInstanceDraining_java_lang_Boolean__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Task Drain Time With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_taskDrainTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow All Outbound java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowAllOutbound_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_allowAllOutbound_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_allowAllOutbound_java_lang_Boolean__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Associate Public Ip Address java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociatePublicIpAddress_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_associatePublicIpAddress_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_associatePublicIpAddress_java_lang_Boolean__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Devices software amazon awscdk services autoscaling Block Device As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cooldown With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Desired Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesiredCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_desiredCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_desiredCapacity_java_lang_Number__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__DESIRED_CAPACITY_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Health Check With Health Check software amazon awscdk services ecs Health Check As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHealthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_healthCheckWithHealthCheck_software_amazon_awscdk_services_ecs_HealthCheck_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignore Unmodified Size Properties java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreUnmodifiedSizeProperties_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_ignoreUnmodifiedSizeProperties_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_ignoreUnmodifiedSizeProperties_java_lang_Boolean__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Key Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_keyName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_keyName_java_lang_String__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__KEY_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_maxCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_maxCapacity_java_lang_Number__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_CAPACITY_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Instance Lifetime With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_minCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_minCapacity_java_lang_Number__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MIN_CAPACITY_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Notifications Topic With ITopic software amazon awscdk services sns ITopic As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Replacing Update Min Successful Instances Percent java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplacingUpdateMinSuccessfulInstancesPercent_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Signal Count java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceSignalCount_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_resourceSignalCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_resourceSignalCount_java_lang_Number__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rolling Update Configuration With Rolling Update Configuration software amazon awscdk services autoscaling Rolling Update Configuration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Spot Price java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpotPrice_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddCapacityOptionsBuilder_ecs_spotPrice_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_spotPrice_java_lang_String__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_PRICE_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Update Type software amazon awscdk services autoscaling Update Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateType_software_amazon_awscdk_services_autoscaling_UpdateType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_updateType_software_amazon_awscdk_services_autoscaling_UpdateType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_updateType_software_amazon_awscdk_services_autoscaling_UpdateType__feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddCapacityOptionsBuilder_ecs_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddCapacityOptionsBuilder_ecs_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_AddCapacityOptionsBuilder_ecs_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AddCapacityOptionsBuilder_ecs_generatedClassName_feature",
								"_UI_AddCapacityOptionsBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME, false,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AddCapacityOptionsBuilder_ecs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AddCapacityOptionsBuilder_ecs_varName_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VAR_NAME, true, false, false,
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
				getString("_UI_AddCapacityOptionsBuilder_ecs_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AddCapacityOptionsBuilder_ecs_identifier_feature",
						"_UI_AddCapacityOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_AddCapacityOptionsBuilder_ecs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AddCapacityOptionsBuilder_ecs_additionalCode_feature",
								"_UI_AddCapacityOptionsBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AddCapacityOptionsBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddCapacityOptionsBuilder_ecs"));
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
		String label = ((AddCapacityOptionsBuilder_ecs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_AddCapacityOptionsBuilder_ecs_type")
				: getString("_UI_AddCapacityOptionsBuilder_ecs_type") + " " + label;
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

		switch (notification.getFeatureID(AddCapacityOptionsBuilder_ecs.class)) {
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__CAN_CONTAINERS_ACCESS_INSTANCE_ROLE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_INSTANCE_DRAINING_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__TASK_DRAIN_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__DESIRED_CAPACITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_HEALTH_CHECK_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__KEY_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_CAPACITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__MIN_CAPACITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__SPOT_PRICE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.ADD_CAPACITY_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
