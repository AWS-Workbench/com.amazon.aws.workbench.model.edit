/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling;
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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AutoScalingGroupBuilder_autoscaling} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AutoScalingGroupBuilder_autoscalingItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoScalingGroupBuilder_autoscalingItemProvider(AdapterFactory adapterFactory) {
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

			addAllowAllOutbound_java_lang_Boolean_PropertyDescriptor(object);
			addAssociatePublicIpAddress_java_lang_Boolean_PropertyDescriptor(object);
			addBlockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsListPropertyDescriptor(object);
			addCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addDesiredCapacity_java_lang_Number_PropertyDescriptor(object);
			addHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReferencePropertyDescriptor(
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
			addInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReferencePropertyDescriptor(
					object);
			addMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReferencePropertyDescriptor(
					object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_allowAllOutbound_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_allowAllOutbound_java_lang_Boolean__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_,
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
				getString(
						"_UI_AutoScalingGroupBuilder_autoscaling_associatePublicIpAddress_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_associatePublicIpAddress_java_lang_Boolean__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_blockDevices_software_amazon_awscdk_services_autoscaling_BlockDevice_AsList_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_cooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_desiredCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_desiredCapacity_java_lang_Number__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__DESIRED_CAPACITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Health Check With Health Check software amazon awscdk services autoscaling Health Check As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHealthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AutoScalingGroupBuilder_autoscaling_healthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_healthCheckWithHealthCheck_software_amazon_awscdk_services_autoscaling_HealthCheck_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_HEALTH_CHECK_AS_REFERENCE,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_ignoreUnmodifiedSizeProperties_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_ignoreUnmodifiedSizeProperties_java_lang_Boolean__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_,
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_keyName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_keyName_java_lang_String__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__KEY_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_maxCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_maxCapacity_java_lang_Number__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MAX_CAPACITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						"_UI_AutoScalingGroupBuilder_autoscaling_maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_maxInstanceLifetimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_minCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_minCapacity_java_lang_Number__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MIN_CAPACITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						"_UI_AutoScalingGroupBuilder_autoscaling_notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_notificationsTopicWithITopic_software_amazon_awscdk_services_sns_ITopic_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_replacingUpdateMinSuccessfulInstancesPercent_java_lang_Number__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_,
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_resourceSignalCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_resourceSignalCount_java_lang_Number__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_resourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_rollingUpdateConfigurationWithRollingUpdateConfiguration_software_amazon_awscdk_services_autoscaling_RollingUpdateConfiguration_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE,
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_spotPrice_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_spotPrice_java_lang_String__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__SPOT_PRICE_JAVA_LANG_STRING_, true,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_updateType_software_amazon_awscdk_services_autoscaling_UpdateType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_updateType_software_amazon_awscdk_services_autoscaling_UpdateType__feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_AutoScalingGroupBuilder_autoscaling_instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_instanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_machineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE,
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
						"_UI_AutoScalingGroupBuilder_autoscaling_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AutoScalingGroupBuilder_autoscaling_roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Data With User Data software amazon awscdk services ec2 User Data As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AutoScalingGroupBuilder_autoscaling_userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE,
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_generatedClassName_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_AutoScalingGroupBuilder_autoscaling_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AutoScalingGroupBuilder_autoscaling_varName_feature",
								"_UI_AutoScalingGroupBuilder_autoscaling_type"),
						AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_AutoScalingGroupBuilder_autoscaling_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AutoScalingGroupBuilder_autoscaling_identifier_feature",
								"_UI_AutoScalingGroupBuilder_autoscaling_type"),
						AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__IDENTIFIER, true, false,
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
				getString("_UI_AutoScalingGroupBuilder_autoscaling_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AutoScalingGroupBuilder_autoscaling_additionalCode_feature",
						"_UI_AutoScalingGroupBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AutoScalingGroupBuilder_autoscaling.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AutoScalingGroupBuilder_autoscaling"));
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
		return  "AutoScalingGroup " + ((AutoScalingGroupBuilder_autoscaling) object).getVarName();
		
				
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

		switch (notification.getFeatureID(AutoScalingGroupBuilder_autoscaling.class)) {
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ASSOCIATE_PUBLIC_IP_ADDRESS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_AS_LIST:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__COOLDOWN_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__DESIRED_CAPACITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__HEALTH_CHECK_WITH_HEALTH_CHECK_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_HEALTH_CHECK_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__IGNORE_UNMODIFIED_SIZE_PROPERTIES_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__KEY_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MAX_CAPACITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MAX_INSTANCE_LIFETIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MIN_CAPACITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__NOTIFICATIONS_TOPIC_WITH_ITOPIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_SNS_ITOPIC_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__REPLACING_UPDATE_MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__RESOURCE_SIGNAL_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ROLLING_UPDATE_CONFIGURATION_WITH_ROLLING_UPDATE_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_ROLLING_UPDATE_CONFIGURATION_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__SPOT_PRICE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__UPDATE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_UPDATE_TYPE_:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__VAR_NAME:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__IDENTIFIER:
		case AwsworkbenchPackage.AUTO_SCALING_GROUP_BUILDER_AUTOSCALING__ADDITIONAL_CODE:
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
