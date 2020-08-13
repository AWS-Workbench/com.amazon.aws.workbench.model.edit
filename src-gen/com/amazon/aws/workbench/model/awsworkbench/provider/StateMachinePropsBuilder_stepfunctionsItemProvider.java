/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.StateMachinePropsBuilder_stepfunctions;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.StateMachinePropsBuilder_stepfunctions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachinePropsBuilder_stepfunctionsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachinePropsBuilder_stepfunctionsItemProvider(AdapterFactory adapterFactory) {
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

			addDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReferencePropertyDescriptor(
					object);
			addLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReferencePropertyDescriptor(
					object);
			addRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReferencePropertyDescriptor(object);
			addStateMachineName_java_lang_String_PropertyDescriptor(object);
			addStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_PropertyDescriptor(
					object);
			addTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Definition With IChainable software amazon awscdk services stepfunctions IChainable As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StateMachinePropsBuilder_stepfunctions_definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_definitionWithIChainable_software_amazon_awscdk_services_stepfunctions_IChainable_AsReference_feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Logs With Log Options software amazon awscdk services stepfunctions Log Options As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StateMachinePropsBuilder_stepfunctions_logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_logsWithLogOptions_software_amazon_awscdk_services_stepfunctions_LogOptions_AsReference_feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE,
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
						"_UI_StateMachinePropsBuilder_stepfunctions_roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_roleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference_feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the State Machine Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateMachineName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StateMachinePropsBuilder_stepfunctions_stateMachineName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_stateMachineName_java_lang_String__feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the State Machine Type software amazon awscdk services stepfunctions State Machine Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StateMachinePropsBuilder_stepfunctions_stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_stateMachineType_software_amazon_awscdk_services_stepfunctions_StateMachineType__feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StateMachinePropsBuilder_stepfunctions_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_StateMachinePropsBuilder_stepfunctions_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_generatedClassName_feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_StateMachinePropsBuilder_stepfunctions_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_StateMachinePropsBuilder_stepfunctions_varName_feature",
								"_UI_StateMachinePropsBuilder_stepfunctions_type"),
						AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__VAR_NAME, true, false,
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
				getString("_UI_StateMachinePropsBuilder_stepfunctions_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_identifier_feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__IDENTIFIER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_StateMachinePropsBuilder_stepfunctions_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StateMachinePropsBuilder_stepfunctions_additionalCode_feature",
						"_UI_StateMachinePropsBuilder_stepfunctions_type"),
				AwsworkbenchPackage.Literals.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns StateMachinePropsBuilder_stepfunctions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StateMachinePropsBuilder_stepfunctions"));
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
		String label = ((StateMachinePropsBuilder_stepfunctions) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_StateMachinePropsBuilder_stepfunctions_type")
				: getString("_UI_StateMachinePropsBuilder_stepfunctions_type") + " " + label;
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

		switch (notification.getFeatureID(StateMachinePropsBuilder_stepfunctions.class)) {
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__DEFINITION_WITH_ICHAINABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_ICHAINABLE_AS_REFERENCE:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__LOGS_WITH_LOG_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_LOG_OPTIONS_AS_REFERENCE:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__STATE_MACHINE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_STEPFUNCTIONS_STATE_MACHINE_TYPE_:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__VAR_NAME:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__IDENTIFIER:
		case AwsworkbenchPackage.STATE_MACHINE_PROPS_BUILDER_STEPFUNCTIONS__ADDITIONAL_CODE:
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
