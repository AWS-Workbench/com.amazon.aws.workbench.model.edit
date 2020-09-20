/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AddRulePropsBuilder_elasticloadbalancingv2;
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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AddRulePropsBuilder_elasticloadbalancingv2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddRulePropsBuilder_elasticloadbalancingv2ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddRulePropsBuilder_elasticloadbalancingv2ItemProvider(AdapterFactory adapterFactory) {
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

			addConditions_software_amazon_awscdk_services_elasticloadbalancingv2_ListenerCondition_AsListPropertyDescriptor(
					object);
			addHostHeader_java_lang_String_PropertyDescriptor(object);
			addPathPattern_java_lang_String_PropertyDescriptor(object);
			addPathPatterns_java_lang_String_AsListPropertyDescriptor(object);
			addPriority_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Conditions software amazon awscdk services elasticloadbalancingv2 Listener Condition As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditions_software_amazon_awscdk_services_elasticloadbalancingv2_ListenerCondition_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_conditions_software_amazon_awscdk_services_elasticloadbalancingv2_ListenerCondition_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_conditions_software_amazon_awscdk_services_elasticloadbalancingv2_ListenerCondition_AsList_feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__CONDITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_LISTENER_CONDITION_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AddRulePropsBuilder_elasticloadbalancingv2_hostHeader_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_hostHeader_java_lang_String__feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__HOST_HEADER_JAVA_LANG_STRING_,
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
				getString("_UI_AddRulePropsBuilder_elasticloadbalancingv2_pathPattern_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_pathPattern_java_lang_String__feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__PATH_PATTERN_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Path Patterns java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPatterns_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_pathPatterns_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_pathPatterns_java_lang_String_AsList_feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__PATH_PATTERNS_JAVA_LANG_STRING_AS_LIST,
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
				getString("_UI_AddRulePropsBuilder_elasticloadbalancingv2_priority_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_priority_java_lang_Number__feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__PRIORITY_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_AddRulePropsBuilder_elasticloadbalancingv2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_generatedClassName_feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_AddRulePropsBuilder_elasticloadbalancingv2_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_varName_feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME, true, false,
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
				getString("_UI_AddRulePropsBuilder_elasticloadbalancingv2_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_identifier_feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER, true, false,
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
				getString("_UI_AddRulePropsBuilder_elasticloadbalancingv2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_additionalCode_feature",
						"_UI_AddRulePropsBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AddRulePropsBuilder_elasticloadbalancingv2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/AddRulePropsBuilder_elasticloadbalancingv2"));
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
		return  "AddRuleProps " + ((AddRulePropsBuilder_elasticloadbalancingv2) object).getVarName();
		
				
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

		switch (notification.getFeatureID(AddRulePropsBuilder_elasticloadbalancingv2.class)) {
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__CONDITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_LISTENER_CONDITION_AS_LIST:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__HOST_HEADER_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__PATH_PATTERN_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__PATH_PATTERNS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__PRIORITY_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER:
		case AwsworkbenchPackage.ADD_RULE_PROPS_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE:
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
