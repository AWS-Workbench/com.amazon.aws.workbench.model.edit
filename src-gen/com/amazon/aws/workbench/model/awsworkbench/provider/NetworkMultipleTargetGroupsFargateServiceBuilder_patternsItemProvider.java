/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.NetworkMultipleTargetGroupsFargateServiceBuilder_patterns;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.NetworkMultipleTargetGroupsFargateServiceBuilder_patterns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkMultipleTargetGroupsFargateServiceBuilder_patternsItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkMultipleTargetGroupsFargateServiceBuilder_patternsItemProvider(AdapterFactory adapterFactory) {
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

			addCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReferencePropertyDescriptor(
					object);
			addClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReferencePropertyDescriptor(object);
			addDesiredCount_java_lang_Number_PropertyDescriptor(object);
			addEnableEcsManagedTags_java_lang_Boolean_PropertyDescriptor(object);
			addHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addLoadBalancers_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancerProps_AsListPropertyDescriptor(
					object);
			addPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_PropertyDescriptor(object);
			addServiceName_java_lang_String_PropertyDescriptor(object);
			addTargetGroups_software_amazon_awscdk_services_ecs_patterns_NetworkTargetProps_AsListPropertyDescriptor(
					object);
			addTaskImageOptionsWithNetworkLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancedTaskImageProps_AsReferencePropertyDescriptor(
					object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addAssignPublicIp_java_lang_Boolean_PropertyDescriptor(object);
			addCpu_java_lang_Number_PropertyDescriptor(object);
			addMemoryLimitMiB_java_lang_Number_PropertyDescriptor(object);
			addPlatformVersion_software_amazon_awscdk_services_ecs_FargatePlatformVersion_PropertyDescriptor(object);
			addTaskDefinitionWithFargateTaskDefinition_software_amazon_awscdk_services_ecs_FargateTaskDefinition_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cloud Map Options With Cloud Map Options software amazon awscdk services ecs Cloud Map Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_cloudMapOptionsWithCloudMapOptions_software_amazon_awscdk_services_ecs_CloudMapOptions_AsReference_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE,
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
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_clusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Desired Count java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesiredCount_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_desiredCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_desiredCount_java_lang_Number__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_,
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
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_enableEcsManagedTags_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_enableEcsManagedTags_java_lang_Boolean__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Health Check Grace Period With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHealthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_healthCheckGracePeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Load Balancers software amazon awscdk services ecs patterns Network Load Balancer Props As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadBalancers_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancerProps_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_loadBalancers_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancerProps_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_loadBalancers_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancerProps_AsList_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_NETWORK_LOAD_BALANCER_PROPS_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_propagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_,
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
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_serviceName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_serviceName_java_lang_String__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Groups software amazon awscdk services ecs patterns Network Target Props As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetGroups_software_amazon_awscdk_services_ecs_patterns_NetworkTargetProps_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_targetGroups_software_amazon_awscdk_services_ecs_patterns_NetworkTargetProps_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_targetGroups_software_amazon_awscdk_services_ecs_patterns_NetworkTargetProps_AsList_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_NETWORK_TARGET_PROPS_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Task Image Options With Network Load Balanced Task Image Props software amazon awscdk services ecs patterns Network Load Balanced Task Image Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskImageOptionsWithNetworkLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancedTaskImageProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_taskImageOptionsWithNetworkLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancedTaskImageProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_taskImageOptionsWithNetworkLoadBalancedTaskImageProps_software_amazon_awscdk_services_ecs_patterns_NetworkLoadBalancedTaskImageProps_AsReference_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_NETWORK_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_NETWORK_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE,
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
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Assign Public Ip java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignPublicIp_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_assignPublicIp_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_assignPublicIp_java_lang_Boolean__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__ASSIGN_PUBLIC_IP_JAVA_LANG_BOOLEAN_,
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
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_cpu_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_cpu_java_lang_Number__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_,
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
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_memoryLimitMiB_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_memoryLimitMiB_java_lang_Number__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
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
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_platformVersion_software_amazon_awscdk_services_ecs_FargatePlatformVersion__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_platformVersion_software_amazon_awscdk_services_ecs_FargatePlatformVersion__feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__PLATFORM_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_FARGATE_PLATFORM_VERSION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Task Definition With Fargate Task Definition software amazon awscdk services ecs Fargate Task Definition As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskDefinitionWithFargateTaskDefinition_software_amazon_awscdk_services_ecs_FargateTaskDefinition_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_taskDefinitionWithFargateTaskDefinition_software_amazon_awscdk_services_ecs_FargateTaskDefinition_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_taskDefinitionWithFargateTaskDefinition_software_amazon_awscdk_services_ecs_FargateTaskDefinition_AsReference_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_FARGATE_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_FARGATE_TASK_DEFINITION_AS_REFERENCE,
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
				getString("_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_generatedClassName_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME,
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
				getString("_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_varName_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__VAR_NAME,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_identifier_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__IDENTIFIER,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_additionalCode_feature",
						"_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns NetworkMultipleTargetGroupsFargateServiceBuilder_patterns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/NetworkMultipleTargetGroupsFargateServiceBuilder_patterns"));
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
		String label = ((NetworkMultipleTargetGroupsFargateServiceBuilder_patterns) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type")
				: getString("_UI_NetworkMultipleTargetGroupsFargateServiceBuilder_patterns_type") + " " + label;
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

		switch (notification.getFeatureID(NetworkMultipleTargetGroupsFargateServiceBuilder_patterns.class)) {
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__CLOUD_MAP_OPTIONS_WITH_CLOUD_MAP_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__CLUSTER_WITH_ICLUSTER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ICLUSTER_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__DESIRED_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__ENABLE_ECS_MANAGED_TAGS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__HEALTH_CHECK_GRACE_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_NETWORK_LOAD_BALANCER_PROPS_AS_LIST:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__PROPAGATE_TAGS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROPAGATED_TAG_SOURCE_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__SERVICE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__TARGET_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_NETWORK_TARGET_PROPS_AS_LIST:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__TASK_IMAGE_OPTIONS_WITH_NETWORK_LOAD_BALANCED_TASK_IMAGE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_NETWORK_LOAD_BALANCED_TASK_IMAGE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__ASSIGN_PUBLIC_IP_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__CPU_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__PLATFORM_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_FARGATE_PLATFORM_VERSION_:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__TASK_DEFINITION_WITH_FARGATE_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_FARGATE_TASK_DEFINITION_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__VAR_NAME:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__IDENTIFIER:
		case AwsworkbenchPackage.NETWORK_MULTIPLE_TARGET_GROUPS_FARGATE_SERVICE_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
