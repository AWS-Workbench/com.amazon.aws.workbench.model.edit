/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RollingUpdateConfigurationBuilder_autoscaling} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RollingUpdateConfigurationBuilder_autoscalingItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollingUpdateConfigurationBuilder_autoscalingItemProvider(AdapterFactory adapterFactory) {
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

			addMaxBatchSize_java_lang_Number_PropertyDescriptor(object);
			addMinInstancesInService_java_lang_Number_PropertyDescriptor(object);
			addMinSuccessfulInstancesPercent_java_lang_Number_PropertyDescriptor(object);
			addPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsListPropertyDescriptor(
					object);
			addWaitOnResourceSignals_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Max Batch Size java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxBatchSize_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RollingUpdateConfigurationBuilder_autoscaling_maxBatchSize_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_maxBatchSize_java_lang_Number__feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MAX_BATCH_SIZE_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Instances In Service java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinInstancesInService_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_minInstancesInService_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_minInstancesInService_java_lang_Number__feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Successful Instances Percent java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinSuccessfulInstancesPercent_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_minSuccessfulInstancesPercent_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_minSuccessfulInstancesPercent_java_lang_Number__feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pause Time With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_pauseTimeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Suspend Processes software amazon awscdk services autoscaling Scaling Process As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_suspendProcesses_software_amazon_awscdk_services_autoscaling_ScalingProcess_AsList_feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Wait On Resource Signals java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitOnResourceSignals_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_waitOnResourceSignals_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_waitOnResourceSignals_java_lang_Boolean__feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN_,
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
				getString("_UI_RollingUpdateConfigurationBuilder_autoscaling_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_generatedClassName_feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME,
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
				getString("_UI_RollingUpdateConfigurationBuilder_autoscaling_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_varName_feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__VAR_NAME, true, false,
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
				getString("_UI_RollingUpdateConfigurationBuilder_autoscaling_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_identifier_feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__IDENTIFIER, true, false,
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
				getString("_UI_RollingUpdateConfigurationBuilder_autoscaling_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_additionalCode_feature",
						"_UI_RollingUpdateConfigurationBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RollingUpdateConfigurationBuilder_autoscaling.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/RollingUpdateConfigurationBuilder_autoscaling"));
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
		return  "RollingUpdateConfiguration " + ((RollingUpdateConfigurationBuilder_autoscaling) object).getVarName();
		
				
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

		switch (notification.getFeatureID(RollingUpdateConfigurationBuilder_autoscaling.class)) {
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MAX_BATCH_SIZE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_INSTANCES_IN_SERVICE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__MIN_SUCCESSFUL_INSTANCES_PERCENT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__PAUSE_TIME_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__SUSPEND_PROCESSES_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_SCALING_PROCESS_AS_LIST:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__WAIT_ON_RESOURCE_SIGNALS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__VAR_NAME:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__IDENTIFIER:
		case AwsworkbenchPackage.ROLLING_UPDATE_CONFIGURATION_BUILDER_AUTOSCALING__ADDITIONAL_CODE:
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
