/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ManagedPolicyBuilder_iam;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ManagedPolicyBuilder_iam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagedPolicyBuilder_iamItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagedPolicyBuilder_iamItemProvider(AdapterFactory adapterFactory) {
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
			addDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReferencePropertyDescriptor(
					object);
			addGroups_software_amazon_awscdk_services_iam_IGroup_AsListPropertyDescriptor(object);
			addManagedPolicyName_java_lang_String_PropertyDescriptor(object);
			addPath_java_lang_String_PropertyDescriptor(object);
			addRoles_software_amazon_awscdk_services_iam_IRole_AsListPropertyDescriptor(object);
			addStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsListPropertyDescriptor(object);
			addUsers_software_amazon_awscdk_services_iam_IUser_AsListPropertyDescriptor(object);
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
				getString("_UI_ManagedPolicyBuilder_iam_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_description_java_lang_String__feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Document With Policy Document software amazon awscdk services iam Policy Document As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ManagedPolicyBuilder_iam_documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_documentWithPolicyDocument_software_amazon_awscdk_services_iam_PolicyDocument_AsReference_feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Groups software amazon awscdk services iam IGroup As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroups_software_amazon_awscdk_services_iam_IGroup_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ManagedPolicyBuilder_iam_groups_software_amazon_awscdk_services_iam_IGroup_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_groups_software_amazon_awscdk_services_iam_IGroup_AsList_feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Managed Policy Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagedPolicyName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ManagedPolicyBuilder_iam_managedPolicyName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_managedPolicyName_java_lang_String__feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Path java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPath_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ManagedPolicyBuilder_iam_path_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ManagedPolicyBuilder_iam_path_java_lang_String__feature",
								"_UI_ManagedPolicyBuilder_iam_type"),
						AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Roles software amazon awscdk services iam IRole As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoles_software_amazon_awscdk_services_iam_IRole_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ManagedPolicyBuilder_iam_roles_software_amazon_awscdk_services_iam_IRole_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_roles_software_amazon_awscdk_services_iam_IRole_AsList_feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Statements software amazon awscdk services iam Policy Statement As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ManagedPolicyBuilder_iam_statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Users software amazon awscdk services iam IUser As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsers_software_amazon_awscdk_services_iam_IUser_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ManagedPolicyBuilder_iam_users_software_amazon_awscdk_services_iam_IUser_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_users_software_amazon_awscdk_services_iam_IUser_AsList_feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST,
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
				getString("_UI_ManagedPolicyBuilder_iam_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ManagedPolicyBuilder_iam_generatedClassName_feature", "_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_ManagedPolicyBuilder_iam_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ManagedPolicyBuilder_iam_varName_feature",
								"_UI_ManagedPolicyBuilder_iam_type"),
						AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_ManagedPolicyBuilder_iam_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ManagedPolicyBuilder_iam_identifier_feature", "_UI_ManagedPolicyBuilder_iam_type"),
						AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__IDENTIFIER, true, false, false,
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
				getString("_UI_ManagedPolicyBuilder_iam_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ManagedPolicyBuilder_iam_additionalCode_feature",
						"_UI_ManagedPolicyBuilder_iam_type"),
				AwsworkbenchPackage.Literals.MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ManagedPolicyBuilder_iam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedPolicyBuilder_iam"));
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
		String label = ((ManagedPolicyBuilder_iam) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_ManagedPolicyBuilder_iam_type")
				: getString("_UI_ManagedPolicyBuilder_iam_type") + " " + label;
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

		switch (notification.getFeatureID(ManagedPolicyBuilder_iam.class)) {
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__DOCUMENT_WITH_POLICY_DOCUMENT_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_REFERENCE:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__MANAGED_POLICY_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__VAR_NAME:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__IDENTIFIER:
		case AwsworkbenchPackage.MANAGED_POLICY_BUILDER_IAM__ADDITIONAL_CODE:
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
