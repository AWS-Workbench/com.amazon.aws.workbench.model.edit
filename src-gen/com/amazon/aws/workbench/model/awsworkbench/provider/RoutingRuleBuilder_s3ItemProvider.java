/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RoutingRuleBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoutingRuleBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingRuleBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReferencePropertyDescriptor(
					object);
			addHostName_java_lang_String_PropertyDescriptor(object);
			addHttpRedirectCode_java_lang_String_PropertyDescriptor(object);
			addProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_PropertyDescriptor(object);
			addReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Condition With Routing Rule Condition software amazon awscdk services s3 Routing Rule Condition As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoutingRuleBuilder_s3_conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoutingRuleBuilder_s3_conditionWithRoutingRuleCondition_software_amazon_awscdk_services_s3_RoutingRuleCondition_AsReference_feature",
						"_UI_RoutingRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Host Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoutingRuleBuilder_s3_hostName_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RoutingRuleBuilder_s3_hostName_java_lang_String__feature",
								"_UI_RoutingRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Http Redirect Code java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpRedirectCode_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RoutingRuleBuilder_s3_httpRedirectCode_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoutingRuleBuilder_s3_httpRedirectCode_java_lang_String__feature",
						"_UI_RoutingRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__HTTP_REDIRECT_CODE_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Protocol software amazon awscdk services s3 Redirect Protocol  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoutingRuleBuilder_s3_protocol_software_amazon_awscdk_services_s3_RedirectProtocol__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoutingRuleBuilder_s3_protocol_software_amazon_awscdk_services_s3_RedirectProtocol__feature",
						"_UI_RoutingRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Replace Key With Replace Key software amazon awscdk services s3 Replace Key As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoutingRuleBuilder_s3_replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoutingRuleBuilder_s3_replaceKeyWithReplaceKey_software_amazon_awscdk_services_s3_ReplaceKey_AsReference_feature",
						"_UI_RoutingRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE,
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
				getString("_UI_RoutingRuleBuilder_s3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoutingRuleBuilder_s3_generatedClassName_feature",
						"_UI_RoutingRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_RoutingRuleBuilder_s3_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoutingRuleBuilder_s3_varName_feature",
								"_UI_RoutingRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_RoutingRuleBuilder_s3_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoutingRuleBuilder_s3_identifier_feature",
								"_UI_RoutingRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_RoutingRuleBuilder_s3_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RoutingRuleBuilder_s3_additionalCode_feature", "_UI_RoutingRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.ROUTING_RULE_BUILDER_S3__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RoutingRuleBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoutingRuleBuilder_s3"));
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
		return "RoutingRule " + ((RoutingRuleBuilder_s3) object).getVarName();

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

		switch (notification.getFeatureID(RoutingRuleBuilder_s3.class)) {
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__CONDITION_WITH_ROUTING_RULE_CONDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_CONDITION_AS_REFERENCE:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__HTTP_REDIRECT_CODE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__REPLACE_KEY_WITH_REPLACE_KEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REPLACE_KEY_AS_REFERENCE:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.ROUTING_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
