/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.EventPatternBuilder_events;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.EventPatternBuilder_events} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventPatternBuilder_eventsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPatternBuilder_eventsItemProvider(AdapterFactory adapterFactory) {
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

			addAccount_java_lang_String_AsListPropertyDescriptor(object);
			addDetail_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(object);
			addDetailType_java_lang_String_AsListPropertyDescriptor(object);
			addId_java_lang_String_AsListPropertyDescriptor(object);
			addRegion_java_lang_String_AsListPropertyDescriptor(object);
			addResources_java_lang_String_AsListPropertyDescriptor(object);
			addSource_java_lang_String_AsListPropertyDescriptor(object);
			addTime_java_lang_String_AsListPropertyDescriptor(object);
			addVersion_java_lang_String_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Account java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccount_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_account_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_account_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__ACCOUNT_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Detail java lang String java lang Object As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetail_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_detail_java_lang_String__java_lang_Object_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_detail_java_lang_String__java_lang_Object_AsMap_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__DETAIL_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Detail Type java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailType_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_detailType_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_detailType_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__DETAIL_TYPE_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addId_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_id_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_id_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__ID_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Region java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegion_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_region_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_region_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__REGION_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resources java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResources_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_resources_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_resources_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__RESOURCES_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSource_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_source_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_source_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__SOURCE_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Time java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTime_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_time_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_time_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__TIME_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Version java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersion_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EventPatternBuilder_events_version_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_EventPatternBuilder_events_version_java_lang_String_AsList_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__VERSION_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_EventPatternBuilder_events_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_EventPatternBuilder_events_generatedClassName_feature",
								"_UI_EventPatternBuilder_events_type"),
						AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_EventPatternBuilder_events_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EventPatternBuilder_events_varName_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__VAR_NAME, true, false, false,
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
				getString("_UI_EventPatternBuilder_events_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EventPatternBuilder_events_identifier_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__IDENTIFIER, true, false, false,
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
				getString("_UI_EventPatternBuilder_events_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EventPatternBuilder_events_additionalCode_feature",
						"_UI_EventPatternBuilder_events_type"),
				AwsworkbenchPackage.Literals.EVENT_PATTERN_BUILDER_EVENTS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EventPatternBuilder_events.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EventPatternBuilder_events"));
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
		String label = ((EventPatternBuilder_events) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_EventPatternBuilder_events_type")
				: getString("_UI_EventPatternBuilder_events_type") + " " + label;
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

		switch (notification.getFeatureID(EventPatternBuilder_events.class)) {
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__ACCOUNT_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__DETAIL_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__DETAIL_TYPE_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__ID_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__REGION_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__RESOURCES_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__SOURCE_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__TIME_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__VERSION_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__VAR_NAME:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__IDENTIFIER:
		case AwsworkbenchPackage.EVENT_PATTERN_BUILDER_EVENTS__ADDITIONAL_CODE:
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
