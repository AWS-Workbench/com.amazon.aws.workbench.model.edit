/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.PolicyStatementBuilder_iam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyStatementBuilder_iamItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyStatementBuilder_iamItemProvider(AdapterFactory adapterFactory) {
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

			addActions_java_lang_String_AsListPropertyDescriptor(object);
			addConditions_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(object);
			addEffect_software_amazon_awscdk_services_iam_Effect_PropertyDescriptor(object);
			addNotActions_java_lang_String_AsListPropertyDescriptor(object);
			addNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsListPropertyDescriptor(object);
			addNotResources_java_lang_String_AsListPropertyDescriptor(object);
			addPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsListPropertyDescriptor(object);
			addResources_java_lang_String_AsListPropertyDescriptor(object);
			addSid_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actions java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActions_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PolicyStatementBuilder_iam_actions_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_actions_java_lang_String_AsList_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Conditions java lang String java lang Object As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditions_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PolicyStatementBuilder_iam_conditions_java_lang_String__java_lang_Object_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_conditions_java_lang_String__java_lang_Object_AsMap_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Effect software amazon awscdk services iam Effect  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffect_software_amazon_awscdk_services_iam_Effect_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PolicyStatementBuilder_iam_effect_software_amazon_awscdk_services_iam_Effect__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_effect_software_amazon_awscdk_services_iam_Effect__feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Not Actions java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotActions_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PolicyStatementBuilder_iam_notActions_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_notActions_java_lang_String_AsList_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Not Principals software amazon awscdk services iam IPrincipal As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_PolicyStatementBuilder_iam_notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_notPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsList_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Not Resources java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotResources_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PolicyStatementBuilder_iam_notResources_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_notResources_java_lang_String_AsList_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Principals software amazon awscdk services iam IPrincipal As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrincipals_software_amazon_awscdk_services_iam_IPrincipal_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_PolicyStatementBuilder_iam_principals_software_amazon_awscdk_services_iam_IPrincipal_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_principals_software_amazon_awscdk_services_iam_IPrincipal_AsList_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PolicyStatementBuilder_iam_resources_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyStatementBuilder_iam_resources_java_lang_String_AsList_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sid java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSid_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PolicyStatementBuilder_iam_sid_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PolicyStatementBuilder_iam_sid_java_lang_String__feature",
								"_UI_PolicyStatementBuilder_iam_type"),
						AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_, true, false,
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
						getResourceLocator(), getString("_UI_PolicyStatementBuilder_iam_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PolicyStatementBuilder_iam_generatedClassName_feature",
								"_UI_PolicyStatementBuilder_iam_type"),
						AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_PolicyStatementBuilder_iam_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyStatementBuilder_iam_varName_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__VAR_NAME, true, false, false,
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
				getString("_UI_PolicyStatementBuilder_iam_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyStatementBuilder_iam_identifier_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER, true, false, false,
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
				getString("_UI_PolicyStatementBuilder_iam_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyStatementBuilder_iam_additionalCode_feature",
						"_UI_PolicyStatementBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PolicyStatementBuilder_iam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolicyStatementBuilder_iam"));
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
		return  "PolicyStatement " + ((PolicyStatementBuilder_iam) object).getVarName();
		
				
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

		switch (notification.getFeatureID(PolicyStatementBuilder_iam.class)) {
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__ACTIONS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__CONDITIONS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__EFFECT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_EFFECT_:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_ACTIONS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__NOT_RESOURCES_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_LIST:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__RESOURCES_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__SID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__VAR_NAME:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__IDENTIFIER:
		case AwsworkbenchPackage.POLICY_STATEMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
