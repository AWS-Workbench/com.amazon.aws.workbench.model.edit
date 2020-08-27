/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduledFargateTaskBuilder_patternsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledFargateTaskBuilder_patternsItemProvider(AdapterFactory adapterFactory) {
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

			addScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReferencePropertyDescriptor(
					object);
			addClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReferencePropertyDescriptor(object);
			addDesiredTaskCount_java_lang_Number_PropertyDescriptor(object);
			addSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
					object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReferencePropertyDescriptor(
					object);
			addScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Schedule With Schedule software amazon awscdk services applicationautoscaling Schedule As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ScheduledFargateTaskBuilder_patterns_scheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_scheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCHEDULE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cluster With ICluster software amazon awscdk services ecs ICluster As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ScheduledFargateTaskBuilder_patterns_clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Desired Task Count java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesiredTaskCount_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ScheduledFargateTaskBuilder_patterns_desiredTaskCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_desiredTaskCount_java_lang_Number__feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ScheduledFargateTaskBuilder_patterns_subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_subnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
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
						"_UI_ScheduledFargateTaskBuilder_patterns_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scheduled Fargate Task Definition Options With Scheduled Fargate Task Definition Options software amazon awscdk services ecs patterns Scheduled Fargate Task Definition Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ScheduledFargateTaskBuilder_patterns_scheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_scheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_WITH_SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scheduled Fargate Task Image Options With Scheduled Fargate Task Image Options software amazon awscdk services ecs patterns Scheduled Fargate Task Image Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ScheduledFargateTaskBuilder_patterns_scheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_scheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_WITH_SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_AS_REFERENCE,
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
				getString("_UI_ScheduledFargateTaskBuilder_patterns_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_generatedClassName_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_ScheduledFargateTaskBuilder_patterns_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ScheduledFargateTaskBuilder_patterns_varName_feature",
								"_UI_ScheduledFargateTaskBuilder_patterns_type"),
						AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_ScheduledFargateTaskBuilder_patterns_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ScheduledFargateTaskBuilder_patterns_identifier_feature",
								"_UI_ScheduledFargateTaskBuilder_patterns_type"),
						AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__IDENTIFIER, true, false,
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
				getString("_UI_ScheduledFargateTaskBuilder_patterns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledFargateTaskBuilder_patterns_additionalCode_feature",
						"_UI_ScheduledFargateTaskBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ScheduledFargateTaskBuilder_patterns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScheduledFargateTaskBuilder_patterns"));
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
		return  "ScheduledFargateTask " + ((ScheduledFargateTaskBuilder_patterns) object).getVarName();
		
				
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

		switch (notification.getFeatureID(ScheduledFargateTaskBuilder_patterns.class)) {
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCHEDULE_AS_REFERENCE:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_WITH_SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_SCHEDULED_FARGATE_TASK_DEFINITION_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_WITH_SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_SCHEDULED_FARGATE_TASK_IMAGE_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__VAR_NAME:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__IDENTIFIER:
		case AwsworkbenchPackage.SCHEDULED_FARGATE_TASK_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
