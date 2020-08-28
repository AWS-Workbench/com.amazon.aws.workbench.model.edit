/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.FargateTaskDefinitionBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FargateTaskDefinitionBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FargateTaskDefinitionBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addFamily_java_lang_String_PropertyDescriptor(object);
			addProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReferencePropertyDescriptor(
					object);
			addTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addVolumes_software_amazon_awscdk_services_ecs_Volume_AsListPropertyDescriptor(object);
			addCpu_java_lang_Number_PropertyDescriptor(object);
			addMemoryLimitMiB_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Execution Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FargateTaskDefinitionBuilder_ecs_executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
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
				getString("_UI_FargateTaskDefinitionBuilder_ecs_family_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_family_java_lang_String__feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__FAMILY_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Proxy Configuration With Proxy Configuration software amazon awscdk services ecs Proxy Configuration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FargateTaskDefinitionBuilder_ecs_proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_proxyConfigurationWithProxyConfiguration_software_amazon_awscdk_services_ecs_ProxyConfiguration_AsReference_feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Task Role With IRole software amazon awscdk services iam IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FargateTaskDefinitionBuilder_ecs_taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Volumes software amazon awscdk services ecs Volume As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumes_software_amazon_awscdk_services_ecs_Volume_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_FargateTaskDefinitionBuilder_ecs_volumes_software_amazon_awscdk_services_ecs_Volume_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_volumes_software_amazon_awscdk_services_ecs_Volume_AsList_feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST,
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
				getString("_UI_FargateTaskDefinitionBuilder_ecs_cpu_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_cpu_java_lang_Number__feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__CPU_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_FargateTaskDefinitionBuilder_ecs_memoryLimitMiB_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_memoryLimitMiB_java_lang_Number__feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_FargateTaskDefinitionBuilder_ecs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FargateTaskDefinitionBuilder_ecs_generatedClassName_feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__GENERATED_CLASS_NAME, false, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_FargateTaskDefinitionBuilder_ecs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FargateTaskDefinitionBuilder_ecs_varName_feature",
						"_UI_FargateTaskDefinitionBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__VAR_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_FargateTaskDefinitionBuilder_ecs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_FargateTaskDefinitionBuilder_ecs_identifier_feature",
								"_UI_FargateTaskDefinitionBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__IDENTIFIER, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_FargateTaskDefinitionBuilder_ecs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_FargateTaskDefinitionBuilder_ecs_additionalCode_feature",
								"_UI_FargateTaskDefinitionBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.FARGATE_TASK_DEFINITION_BUILDER_ECS__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns FargateTaskDefinitionBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FargateTaskDefinitionBuilder_ecs"));
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
		return "FargateTaskDefinition " + ((FargateTaskDefinitionBuilder_ecs) object).getVarName();

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

		switch (notification.getFeatureID(FargateTaskDefinitionBuilder_ecs.class)) {
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__FAMILY_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__PROXY_CONFIGURATION_WITH_PROXY_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROXY_CONFIGURATION_AS_REFERENCE:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VOLUMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_VOLUME_AS_LIST:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__CPU_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__MEMORY_LIMIT_MI_BJAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.FARGATE_TASK_DEFINITION_BUILDER_ECS__ADDITIONAL_CODE:
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
