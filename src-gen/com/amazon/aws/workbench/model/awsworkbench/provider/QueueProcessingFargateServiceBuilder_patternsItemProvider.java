/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.QueueProcessingFargateServiceBuilder_patterns;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingFargateServiceBuilder_patterns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QueueProcessingFargateServiceBuilder_patternsItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueProcessingFargateServiceBuilder_patternsItemProvider(AdapterFactory adapterFactory) {
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

			addImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReferencePropertyDescriptor(
					object);
			addClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReferencePropertyDescriptor(object);
			addCommand_java_lang_String_AsListPropertyDescriptor(object);
			addDesiredTaskCount_java_lang_Number_PropertyDescriptor(object);
			addEnableEcsManagedTags_java_lang_Boolean_PropertyDescriptor(object);
			addEnableLogging_java_lang_Boolean_PropertyDescriptor(object);
			addEnvironment_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addFamily_java_lang_String_PropertyDescriptor(object);
			addLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReferencePropertyDescriptor(
					object);
			addMaxHealthyPercent_java_lang_Number_PropertyDescriptor(object);
			addMaxReceiveCount_java_lang_Number_PropertyDescriptor(object);
			addMaxScalingCapacity_java_lang_Number_PropertyDescriptor(object);
			addMinHealthyPercent_java_lang_Number_PropertyDescriptor(object);
			addPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_PropertyDescriptor(object);
			addQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReferencePropertyDescriptor(object);
			addRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsListPropertyDescriptor(
					object);
			addSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMapPropertyDescriptor(object);
			addServiceName_java_lang_String_PropertyDescriptor(object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addCpu_java_lang_Number_PropertyDescriptor(object);
			addMemoryLimitMiB_java_lang_Number_PropertyDescriptor(object);
			addPlatformVersion_software_amazon_awscdk_services_ecs_FargatePlatformVersion_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Image With Container Image software amazon awscdk services ecs Container Image As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE,
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
						"_UI_QueueProcessingFargateServiceBuilder_patterns_clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Command java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommand_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_command_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_command_java_lang_String_AsList_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST,
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
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_desiredTaskCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_desiredTaskCount_java_lang_Number__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Ecs Managed Tags java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableEcsManagedTags_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_enableEcsManagedTags_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_enableEcsManagedTags_java_lang_Boolean__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Logging java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableLogging_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_enableLogging_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_enableLogging_java_lang_Boolean__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Environment java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvironment_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_environment_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_environment_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Family java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFamily_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_family_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_family_java_lang_String__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Healthy Percent java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxHealthyPercent_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_maxHealthyPercent_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_maxHealthyPercent_java_lang_Number__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Receive Count java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxReceiveCount_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_maxReceiveCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_maxReceiveCount_java_lang_Number__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Scaling Capacity java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxScalingCapacity_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_maxScalingCapacity_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_maxScalingCapacity_java_lang_Number__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Healthy Percent java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinHealthyPercent_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_minHealthyPercent_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_minHealthyPercent_java_lang_Number__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Propagate Tags software amazon awscdk services ecs Propagated Tag Source  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Queue With IQueue software amazon awscdk services sqs IQueue As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_queueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Retention Period With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_retentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_scalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Secrets java lang String software amazon awscdk services ecs Secret As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Service Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_serviceName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_serviceName_java_lang_String__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_,
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
						"_UI_QueueProcessingFargateServiceBuilder_patterns_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cpu java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpu_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_cpu_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_cpu_java_lang_Number__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Memory Limit Mi Bjava lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryLimitMiB_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_memoryLimitMiB_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_memoryLimitMiB_java_lang_Number__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Platform Version software amazon awscdk services ecs Fargate Platform Version  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformVersion_software_amazon_awscdk_services_ecs_FargatePlatformVersion_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_QueueProcessingFargateServiceBuilder_patterns_platformVersion_software_amazon_awscdk_services_ecs_FargatePlatformVersion__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_platformVersion_software_amazon_awscdk_services_ecs_FargatePlatformVersion__feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__PLATFORM_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_FARGATE_PLATFORM_VERSION_,
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
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_generatedClassName_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME,
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
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_varName_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__VAR_NAME, true, false,
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
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_identifier_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__IDENTIFIER, true, false,
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
				getString("_UI_QueueProcessingFargateServiceBuilder_patterns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_additionalCode_feature",
						"_UI_QueueProcessingFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns QueueProcessingFargateServiceBuilder_patterns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/QueueProcessingFargateServiceBuilder_patterns"));
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
		String label = ((QueueProcessingFargateServiceBuilder_patterns) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_QueueProcessingFargateServiceBuilder_patterns_type")
				: getString("_UI_QueueProcessingFargateServiceBuilder_patterns_type") + " " + label;
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

		switch (notification.getFeatureID(QueueProcessingFargateServiceBuilder_patterns.class)) {
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__COMMAND_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__DESIRED_TASK_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MAX_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MAX_SCALING_CAPACITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MIN_HEALTHY_PERCENT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__QUEUE_WITH_IQUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_IQUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__RETENTION_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__SCALING_STEPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APPLICATIONAUTOSCALING_SCALING_INTERVAL_AS_LIST:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__PLATFORM_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_FARGATE_PLATFORM_VERSION_:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__VAR_NAME:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
		case AwsworkbenchPackage.QUEUE_PROCESSING_FARGATE_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
