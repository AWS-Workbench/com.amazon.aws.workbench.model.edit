/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RulePropsBuilder_events;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RulePropsBuilder_events} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RulePropsBuilder_eventsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulePropsBuilder_eventsItemProvider(AdapterFactory adapterFactory) {
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

			addDescription_java_lang_String_PropertyDescriptor(object);
			addEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReferencePropertyDescriptor(
					object);
			addEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReferencePropertyDescriptor(
					object);
			addRuleName_java_lang_String_PropertyDescriptor(object);
			addScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReferencePropertyDescriptor(
					object);
			addTargets_software_amazon_awscdk_services_events_IRuleTarget_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RulePropsBuilder_events_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_description_java_lang_String__feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__DESCRIPTION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RulePropsBuilder_events_enabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_enabled_java_lang_Boolean__feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__ENABLED_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Event Bus With IEvent Bus software amazon awscdk services events IEvent Bus As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RulePropsBuilder_events_eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_eventBusWithIEventBus_software_amazon_awscdk_services_events_IEventBus_AsReference_feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Event Pattern With Event Pattern software amazon awscdk services events Event Pattern As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RulePropsBuilder_events_eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_eventPatternWithEventPattern_software_amazon_awscdk_services_events_EventPattern_AsReference_feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rule Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuleName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RulePropsBuilder_events_ruleName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_ruleName_java_lang_String__feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__RULE_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Schedule With Schedule software amazon awscdk services events Schedule As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RulePropsBuilder_events_scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_scheduleWithSchedule_software_amazon_awscdk_services_events_Schedule_AsReference_feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Targets software amazon awscdk services events IRule Target As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargets_software_amazon_awscdk_services_events_IRuleTarget_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RulePropsBuilder_events_targets_software_amazon_awscdk_services_events_IRuleTarget_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_targets_software_amazon_awscdk_services_events_IRuleTarget_AsList_feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST,
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
				getString("_UI_RulePropsBuilder_events_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RulePropsBuilder_events_generatedClassName_feature", "_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_RulePropsBuilder_events_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RulePropsBuilder_events_varName_feature",
								"_UI_RulePropsBuilder_events_type"),
						AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_RulePropsBuilder_events_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RulePropsBuilder_events_identifier_feature", "_UI_RulePropsBuilder_events_type"),
						AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__IDENTIFIER, true, false, false,
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
				getString("_UI_RulePropsBuilder_events_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RulePropsBuilder_events_additionalCode_feature",
						"_UI_RulePropsBuilder_events_type"),
				AwsworkbenchPackage.Literals.RULE_PROPS_BUILDER_EVENTS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RulePropsBuilder_events.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RulePropsBuilder_events"));
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
		return "RuleProps " + ((RulePropsBuilder_events) object).getVarName();

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

		switch (notification.getFeatureID(RulePropsBuilder_events.class)) {
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_BUS_WITH_IEVENT_BUS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IEVENT_BUS_AS_REFERENCE:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__EVENT_PATTERN_WITH_EVENT_PATTERN_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_EVENT_PATTERN_AS_REFERENCE:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__RULE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__SCHEDULE_WITH_SCHEDULE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_SCHEDULE_AS_REFERENCE:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EVENTS_IRULE_TARGET_AS_LIST:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__VAR_NAME:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__IDENTIFIER:
		case AwsworkbenchPackage.RULE_PROPS_BUILDER_EVENTS__ADDITIONAL_CODE:
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
