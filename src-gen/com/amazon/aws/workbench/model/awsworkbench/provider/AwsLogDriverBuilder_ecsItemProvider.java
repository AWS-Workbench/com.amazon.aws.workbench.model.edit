/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverBuilder_ecs;
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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AwsLogDriverBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AwsLogDriverBuilder_ecsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsLogDriverBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addStreamPrefix_java_lang_String_PropertyDescriptor(object);
			addDatetimeFormat_java_lang_String_PropertyDescriptor(object);
			addLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReferencePropertyDescriptor(
					object);
			addLogRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(object);
			addMultilinePattern_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Stream Prefix java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStreamPrefix_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AwsLogDriverBuilder_ecs_streamPrefix_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AwsLogDriverBuilder_ecs_streamPrefix_java_lang_String__feature",
						"_UI_AwsLogDriverBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__STREAM_PREFIX_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Datetime Format java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatetimeFormat_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AwsLogDriverBuilder_ecs_datetimeFormat_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AwsLogDriverBuilder_ecs_datetimeFormat_java_lang_String__feature",
						"_UI_AwsLogDriverBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__DATETIME_FORMAT_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AwsLogDriverBuilder_ecs_logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AwsLogDriverBuilder_ecs_logGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference_feature",
						"_UI_AwsLogDriverBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Log Retention software amazon awscdk services logs Retention Days  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogRetention_software_amazon_awscdk_services_logs_RetentionDays_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AwsLogDriverBuilder_ecs_logRetention_software_amazon_awscdk_services_logs_RetentionDays__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AwsLogDriverBuilder_ecs_logRetention_software_amazon_awscdk_services_logs_RetentionDays__feature",
						"_UI_AwsLogDriverBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Multiline Pattern java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultilinePattern_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AwsLogDriverBuilder_ecs_multilinePattern_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AwsLogDriverBuilder_ecs_multilinePattern_java_lang_String__feature",
						"_UI_AwsLogDriverBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__MULTILINE_PATTERN_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AwsLogDriverBuilder_ecs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AwsLogDriverBuilder_ecs_generatedClassName_feature", "_UI_AwsLogDriverBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_AwsLogDriverBuilder_ecs_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AwsLogDriverBuilder_ecs_varName_feature",
								"_UI_AwsLogDriverBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_AwsLogDriverBuilder_ecs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AwsLogDriverBuilder_ecs_identifier_feature", "_UI_AwsLogDriverBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__IDENTIFIER, true, false, false,
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
				getString("_UI_AwsLogDriverBuilder_ecs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AwsLogDriverBuilder_ecs_additionalCode_feature",
						"_UI_AwsLogDriverBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.AWS_LOG_DRIVER_BUILDER_ECS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AwsLogDriverBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AwsLogDriverBuilder_ecs"));
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
		String label = ((AwsLogDriverBuilder_ecs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_AwsLogDriverBuilder_ecs_type")
				: getString("_UI_AwsLogDriverBuilder_ecs_type") + " " + label;
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

		switch (notification.getFeatureID(AwsLogDriverBuilder_ecs.class)) {
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__STREAM_PREFIX_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__DATETIME_FORMAT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__LOG_RETENTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_RETENTION_DAYS_:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__MULTILINE_PATTERN_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.AWS_LOG_DRIVER_BUILDER_ECS__ADDITIONAL_CODE:
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
