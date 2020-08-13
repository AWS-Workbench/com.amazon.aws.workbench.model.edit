/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.HealthCheckBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthCheckBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthCheckBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addCommand_java_lang_String_AsListPropertyDescriptor(object);
			addIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addRetries_java_lang_Number_PropertyDescriptor(object);
			addStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_HealthCheckBuilder_ecs_command_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HealthCheckBuilder_ecs_command_java_lang_String_AsList_feature",
						"_UI_HealthCheckBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__COMMAND_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Interval With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntervalWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_HealthCheckBuilder_ecs_intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HealthCheckBuilder_ecs_intervalWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_HealthCheckBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Retries java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetries_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HealthCheckBuilder_ecs_retries_java_lang_Number__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HealthCheckBuilder_ecs_retries_java_lang_Number__feature",
								"_UI_HealthCheckBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__RETRIES_JAVA_LANG_NUMBER_, true, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Start Period With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_HealthCheckBuilder_ecs_startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HealthCheckBuilder_ecs_startPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_HealthCheckBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
						"_UI_HealthCheckBuilder_ecs_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HealthCheckBuilder_ecs_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_HealthCheckBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_HealthCheckBuilder_ecs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HealthCheckBuilder_ecs_generatedClassName_feature",
						"_UI_HealthCheckBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__GENERATED_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_HealthCheckBuilder_ecs_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HealthCheckBuilder_ecs_varName_feature",
								"_UI_HealthCheckBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_HealthCheckBuilder_ecs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HealthCheckBuilder_ecs_identifier_feature",
								"_UI_HealthCheckBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_HealthCheckBuilder_ecs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HealthCheckBuilder_ecs_additionalCode_feature", "_UI_HealthCheckBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.HEALTH_CHECK_BUILDER_ECS__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns HealthCheckBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HealthCheckBuilder_ecs"));
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
		String label = ((HealthCheckBuilder_ecs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_HealthCheckBuilder_ecs_type")
				: getString("_UI_HealthCheckBuilder_ecs_type") + " " + label;
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

		switch (notification.getFeatureID(HealthCheckBuilder_ecs.class)) {
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__COMMAND_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__INTERVAL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__RETRIES_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__START_PERIOD_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.HEALTH_CHECK_BUILDER_ECS__ADDITIONAL_CODE:
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
