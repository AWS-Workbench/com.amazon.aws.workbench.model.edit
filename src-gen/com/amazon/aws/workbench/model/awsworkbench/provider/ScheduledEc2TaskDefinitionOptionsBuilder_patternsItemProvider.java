/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskDefinitionOptionsBuilder_patterns;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ScheduledEc2TaskDefinitionOptionsBuilder_patterns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduledEc2TaskDefinitionOptionsBuilder_patternsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEc2TaskDefinitionOptionsBuilder_patternsItemProvider(AdapterFactory adapterFactory) {
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

			addTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Task Definition With Ec2 Task Definition software amazon awscdk services ecs Ec2 Task Definition As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_taskDefinitionWithEc2TaskDefinition_software_amazon_awscdk_services_ecs_Ec2TaskDefinition_AsReference_feature",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE,
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
				getString("_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_generatedClassName_feature",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__GENERATED_CLASS_NAME,
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
				getString("_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_varName_feature",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__VAR_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_identifier_feature",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__IDENTIFIER, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_additionalCode_feature",
						"_UI_ScheduledEc2TaskDefinitionOptionsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ScheduledEc2TaskDefinitionOptionsBuilder_patterns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ScheduledEc2TaskDefinitionOptionsBuilder_patterns"));
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
		return "ScheduledEc2TaskDefinitionOptions "
				+ ((ScheduledEc2TaskDefinitionOptionsBuilder_patterns) object).getVarName();

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

		switch (notification.getFeatureID(ScheduledEc2TaskDefinitionOptionsBuilder_patterns.class)) {
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__TASK_DEFINITION_WITH_EC2_TASK_DEFINITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_EC2_TASK_DEFINITION_AS_REFERENCE:
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__VAR_NAME:
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__IDENTIFIER:
		case AwsworkbenchPackage.SCHEDULED_EC2_TASK_DEFINITION_OPTIONS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
