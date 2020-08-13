/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationTargetPropsBuilder_patterns;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ApplicationTargetPropsBuilder_patterns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationTargetPropsBuilder_patternsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTargetPropsBuilder_patternsItemProvider(AdapterFactory adapterFactory) {
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

			addContainerPort_java_lang_Number_PropertyDescriptor(object);
			addHostHeader_java_lang_String_PropertyDescriptor(object);
			addListener_java_lang_String_PropertyDescriptor(object);
			addPathPattern_java_lang_String_PropertyDescriptor(object);
			addPriority_java_lang_Number_PropertyDescriptor(object);
			addProtocol_software_amazon_awscdk_services_ecs_Protocol_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Container Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApplicationTargetPropsBuilder_patterns_containerPort_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_containerPort_java_lang_Number__feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Host Header java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostHeader_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApplicationTargetPropsBuilder_patterns_hostHeader_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_hostHeader_java_lang_String__feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__HOST_HEADER_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Listener java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListener_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApplicationTargetPropsBuilder_patterns_listener_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_listener_java_lang_String__feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__LISTENER_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Path Pattern java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPattern_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApplicationTargetPropsBuilder_patterns_pathPattern_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_pathPattern_java_lang_String__feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PATH_PATTERN_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Priority java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriority_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApplicationTargetPropsBuilder_patterns_priority_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_priority_java_lang_Number__feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PRIORITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Protocol software amazon awscdk services ecs Protocol  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocol_software_amazon_awscdk_services_ecs_Protocol_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApplicationTargetPropsBuilder_patterns_protocol_software_amazon_awscdk_services_ecs_Protocol__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_protocol_software_amazon_awscdk_services_ecs_Protocol__feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL_,
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
				getString("_UI_ApplicationTargetPropsBuilder_patterns_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_generatedClassName_feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_ApplicationTargetPropsBuilder_patterns_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ApplicationTargetPropsBuilder_patterns_varName_feature",
								"_UI_ApplicationTargetPropsBuilder_patterns_type"),
						AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__VAR_NAME, true, false,
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
				getString("_UI_ApplicationTargetPropsBuilder_patterns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_identifier_feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__IDENTIFIER, true, false, false,
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
				getString("_UI_ApplicationTargetPropsBuilder_patterns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationTargetPropsBuilder_patterns_additionalCode_feature",
						"_UI_ApplicationTargetPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ApplicationTargetPropsBuilder_patterns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApplicationTargetPropsBuilder_patterns"));
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
		String label = ((ApplicationTargetPropsBuilder_patterns) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_ApplicationTargetPropsBuilder_patterns_type")
				: getString("_UI_ApplicationTargetPropsBuilder_patterns_type") + " " + label;
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

		switch (notification.getFeatureID(ApplicationTargetPropsBuilder_patterns.class)) {
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__CONTAINER_PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__HOST_HEADER_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__LISTENER_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PATH_PATTERN_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PRIORITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PROTOCOL_:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__VAR_NAME:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__IDENTIFIER:
		case AwsworkbenchPackage.APPLICATION_TARGET_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
