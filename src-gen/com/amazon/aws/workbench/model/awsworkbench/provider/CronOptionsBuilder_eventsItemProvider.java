/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CronOptionsBuilder_events;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CronOptionsBuilder_events} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CronOptionsBuilder_eventsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CronOptionsBuilder_eventsItemProvider(AdapterFactory adapterFactory) {
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

			addDay_java_lang_String_PropertyDescriptor(object);
			addHour_java_lang_String_PropertyDescriptor(object);
			addMinute_java_lang_String_PropertyDescriptor(object);
			addMonth_java_lang_String_PropertyDescriptor(object);
			addWeekDay_java_lang_String_PropertyDescriptor(object);
			addYear_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Day java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDay_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CronOptionsBuilder_events_day_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CronOptionsBuilder_events_day_java_lang_String__feature",
								"_UI_CronOptionsBuilder_events_type"),
						AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__DAY_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hour java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHour_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CronOptionsBuilder_events_hour_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CronOptionsBuilder_events_hour_java_lang_String__feature",
								"_UI_CronOptionsBuilder_events_type"),
						AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__HOUR_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Minute java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinute_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CronOptionsBuilder_events_minute_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CronOptionsBuilder_events_minute_java_lang_String__feature",
						"_UI_CronOptionsBuilder_events_type"),
				AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__MINUTE_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Month java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonth_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CronOptionsBuilder_events_month_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CronOptionsBuilder_events_month_java_lang_String__feature",
						"_UI_CronOptionsBuilder_events_type"),
				AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__MONTH_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Week Day java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeekDay_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CronOptionsBuilder_events_weekDay_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CronOptionsBuilder_events_weekDay_java_lang_String__feature",
						"_UI_CronOptionsBuilder_events_type"),
				AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__WEEK_DAY_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Year java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYear_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CronOptionsBuilder_events_year_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CronOptionsBuilder_events_year_java_lang_String__feature",
								"_UI_CronOptionsBuilder_events_type"),
						AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__YEAR_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_CronOptionsBuilder_events_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CronOptionsBuilder_events_generatedClassName_feature",
								"_UI_CronOptionsBuilder_events_type"),
						AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__GENERATED_CLASS_NAME, false, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_CronOptionsBuilder_events_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CronOptionsBuilder_events_varName_feature",
								"_UI_CronOptionsBuilder_events_type"),
						AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__VAR_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CronOptionsBuilder_events_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CronOptionsBuilder_events_identifier_feature",
						"_UI_CronOptionsBuilder_events_type"),
				AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__IDENTIFIER, true, false, false,
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
				getString("_UI_CronOptionsBuilder_events_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CronOptionsBuilder_events_additionalCode_feature",
						"_UI_CronOptionsBuilder_events_type"),
				AwsworkbenchPackage.Literals.CRON_OPTIONS_BUILDER_EVENTS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CronOptionsBuilder_events.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CronOptionsBuilder_events"));
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
		String label = ((CronOptionsBuilder_events) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_CronOptionsBuilder_events_type")
				: getString("_UI_CronOptionsBuilder_events_type") + " " + label;
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

		switch (notification.getFeatureID(CronOptionsBuilder_events.class)) {
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__DAY_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__HOUR_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__MINUTE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__MONTH_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__WEEK_DAY_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__YEAR_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__VAR_NAME:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__IDENTIFIER:
		case AwsworkbenchPackage.CRON_OPTIONS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
