/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedTaskImagePropsBuilder_patterns;
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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancedTaskImagePropsBuilder_patterns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationLoadBalancedTaskImagePropsBuilder_patternsItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLoadBalancedTaskImagePropsBuilder_patternsItemProvider(AdapterFactory adapterFactory) {
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
			addContainerName_java_lang_String_PropertyDescriptor(object);
			addContainerPorts_java_lang_Number_AsListPropertyDescriptor(object);
			addEnableLogging_java_lang_Boolean_PropertyDescriptor(object);
			addEnvironment_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addExecutionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addFamily_java_lang_String_PropertyDescriptor(object);
			addLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReferencePropertyDescriptor(
					object);
			addSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMapPropertyDescriptor(object);
			addTaskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
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
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_imageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString(
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_containerName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_containerName_java_lang_String__feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__CONTAINER_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Container Ports java lang Number As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerPorts_java_lang_Number_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_containerPorts_java_lang_Number_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_containerPorts_java_lang_Number_AsList_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__CONTAINER_PORTS_JAVA_LANG_NUMBER_AS_LIST,
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
				getString(
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_enableLogging_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_enableLogging_java_lang_Boolean__feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_,
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
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_environment_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_environment_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_executionRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
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
				getString("_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_family_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_family_java_lang_String__feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_,
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
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_logDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE,
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
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP,
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
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_taskRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
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
				getString("_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_generatedClassName_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME,
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
				getString("_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_varName_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__VAR_NAME,
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
				getString("_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_identifier_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__IDENTIFIER,
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
				getString("_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_additionalCode_feature",
						"_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ApplicationLoadBalancedTaskImagePropsBuilder_patterns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ApplicationLoadBalancedTaskImagePropsBuilder_patterns"));
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
		String label = ((ApplicationLoadBalancedTaskImagePropsBuilder_patterns) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type")
				: getString("_UI_ApplicationLoadBalancedTaskImagePropsBuilder_patterns_type") + " " + label;
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

		switch (notification.getFeatureID(ApplicationLoadBalancedTaskImagePropsBuilder_patterns.class)) {
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__IMAGE_WITH_CONTAINER_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CONTAINER_IMAGE_AS_REFERENCE:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__CONTAINER_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__CONTAINER_PORTS_JAVA_LANG_NUMBER_AS_LIST:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__ENABLE_LOGGING_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__ENVIRONMENT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__EXECUTION_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__FAMILY_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__LOG_DRIVER_WITH_LOG_DRIVER_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_LOG_DRIVER_AS_REFERENCE:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__SECRETS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_SECRET_AS_MAP:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__TASK_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__VAR_NAME:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__IDENTIFIER:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCED_TASK_IMAGE_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
