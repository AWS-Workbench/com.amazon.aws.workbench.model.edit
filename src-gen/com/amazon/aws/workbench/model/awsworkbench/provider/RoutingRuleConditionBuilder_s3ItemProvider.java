/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoutingRuleConditionBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingRuleConditionBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addHttpErrorCodeReturnedEquals_java_lang_String_PropertyDescriptor(object);
			addKeyPrefixEquals_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Http Error Code Returned Equals java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpErrorCodeReturnedEquals_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RoutingRuleConditionBuilder_s3_httpErrorCodeReturnedEquals_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoutingRuleConditionBuilder_s3_httpErrorCodeReturnedEquals_java_lang_String__feature",
						"_UI_RoutingRuleConditionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_CONDITION_BUILDER_S3__HTTP_ERROR_CODE_RETURNED_EQUALS_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Key Prefix Equals java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPrefixEquals_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RoutingRuleConditionBuilder_s3_keyPrefixEquals_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoutingRuleConditionBuilder_s3_keyPrefixEquals_java_lang_String__feature",
						"_UI_RoutingRuleConditionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_CONDITION_BUILDER_S3__KEY_PREFIX_EQUALS_JAVA_LANG_STRING_,
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
				getString("_UI_RoutingRuleConditionBuilder_s3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoutingRuleConditionBuilder_s3_generatedClassName_feature",
						"_UI_RoutingRuleConditionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_CONDITION_BUILDER_S3__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_RoutingRuleConditionBuilder_s3_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoutingRuleConditionBuilder_s3_varName_feature",
						"_UI_RoutingRuleConditionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_CONDITION_BUILDER_S3__VAR_NAME, true, false, false,
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
				getString("_UI_RoutingRuleConditionBuilder_s3_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoutingRuleConditionBuilder_s3_identifier_feature",
						"_UI_RoutingRuleConditionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_CONDITION_BUILDER_S3__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_RoutingRuleConditionBuilder_s3_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RoutingRuleConditionBuilder_s3_additionalCode_feature",
								"_UI_RoutingRuleConditionBuilder_s3_type"),
						AwsworkbenchPackage.Literals.ROUTING_RULE_CONDITION_BUILDER_S3__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RoutingRuleConditionBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoutingRuleConditionBuilder_s3"));
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
		String label = ((RoutingRuleConditionBuilder_s3) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_RoutingRuleConditionBuilder_s3_type")
				: getString("_UI_RoutingRuleConditionBuilder_s3_type") + " " + label;
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

		switch (notification.getFeatureID(RoutingRuleConditionBuilder_s3.class)) {
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3__HTTP_ERROR_CODE_RETURNED_EQUALS_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3__KEY_PREFIX_EQUALS_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.ROUTING_RULE_CONDITION_BUILDER_S3__ADDITIONAL_CODE:
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
