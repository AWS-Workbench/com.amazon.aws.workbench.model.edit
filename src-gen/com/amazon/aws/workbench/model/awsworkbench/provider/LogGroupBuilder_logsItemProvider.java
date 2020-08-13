/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.LogGroupBuilder_logs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogGroupBuilder_logsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogGroupBuilder_logsItemProvider(AdapterFactory adapterFactory) {
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

			addLogGroupName_java_lang_String_PropertyDescriptor(object);
			addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(object);
			addRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Log Group Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogGroupName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogGroupBuilder_logs_logGroupName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LogGroupBuilder_logs_logGroupName_java_lang_String__feature",
						"_UI_LogGroupBuilder_logs_type"),
				AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS__LOG_GROUP_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Removal Policy software amazon awscdk core Removal Policy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LogGroupBuilder_logs_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LogGroupBuilder_logs_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature",
						"_UI_LogGroupBuilder_logs_type"),
				AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Retention software amazon awscdk services logs Retention Days  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LogGroupBuilder_logs_retention_software_amazon_awscdk_services_logs_RetentionDays__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LogGroupBuilder_logs_retention_software_amazon_awscdk_services_logs_RetentionDays__feature",
						"_UI_LogGroupBuilder_logs_type"),
				AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS__RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generated Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LogGroupBuilder_logs_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LogGroupBuilder_logs_generatedClassName_feature", "_UI_LogGroupBuilder_logs_type"),
						AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS__GENERATED_CLASS_NAME, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_LogGroupBuilder_logs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LogGroupBuilder_logs_varName_feature",
						"_UI_LogGroupBuilder_logs_type"),
				AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_LogGroupBuilder_logs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LogGroupBuilder_logs_identifier_feature",
								"_UI_LogGroupBuilder_logs_type"),
						AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_LogGroupBuilder_logs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LogGroupBuilder_logs_additionalCode_feature", "_UI_LogGroupBuilder_logs_type"),
						AwsworkbenchPackage.Literals.LOG_GROUP_BUILDER_LOGS__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LogGroupBuilder_logs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogGroupBuilder_logs"));
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
		String label = ((LogGroupBuilder_logs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_LogGroupBuilder_logs_type")
				: getString("_UI_LogGroupBuilder_logs_type") + " " + label;
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

		switch (notification.getFeatureID(LogGroupBuilder_logs.class)) {
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__LOG_GROUP_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__VAR_NAME:
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__IDENTIFIER:
		case AwsworkbenchPackage.LOG_GROUP_BUILDER_LOGS__ADDITIONAL_CODE:
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
