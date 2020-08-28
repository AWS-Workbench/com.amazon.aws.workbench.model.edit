/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RoleBuilder_iam;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.RoleBuilder_iam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleBuilder_iamItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleBuilder_iamItemProvider(AdapterFactory adapterFactory) {
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

			addAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReferencePropertyDescriptor(
					object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addExternalId_java_lang_String_PropertyDescriptor(object);
			addExternalIds_java_lang_String_AsListPropertyDescriptor(object);
			addInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMapPropertyDescriptor(
					object);
			addManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsListPropertyDescriptor(object);
			addMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addPath_java_lang_String_PropertyDescriptor(object);
			addPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReferencePropertyDescriptor(
					object);
			addRoleName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Assumed By With IPrincipal software amazon awscdk services iam IPrincipal As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoleBuilder_iam_assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoleBuilder_iam_assumedByWithIPrincipal_software_amazon_awscdk_services_iam_IPrincipal_AsReference_feature",
						"_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_RoleBuilder_iam_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoleBuilder_iam_description_java_lang_String__feature", "_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the External Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoleBuilder_iam_externalId_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RoleBuilder_iam_externalId_java_lang_String__feature", "_UI_RoleBuilder_iam_type"),
						AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the External Ids java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalIds_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RoleBuilder_iam_externalIds_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoleBuilder_iam_externalIds_java_lang_String_AsList_feature", "_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Inline Policies java lang String software amazon awscdk services iam Policy Document As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoleBuilder_iam_inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoleBuilder_iam_inlinePolicies_java_lang_String__software_amazon_awscdk_services_iam_PolicyDocument_AsMap_feature",
						"_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Managed Policies software amazon awscdk services iam IManaged Policy As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoleBuilder_iam_managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoleBuilder_iam_managedPolicies_software_amazon_awscdk_services_iam_IManagedPolicy_AsList_feature",
						"_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Session Duration With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoleBuilder_iam_maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoleBuilder_iam_maxSessionDurationWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_RoleBuilder_iam_path_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RoleBuilder_iam_path_java_lang_String__feature", "_UI_RoleBuilder_iam_type"),
						AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Permissions Boundary With IManaged Policy software amazon awscdk services iam IManaged Policy As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPermissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_RoleBuilder_iam_permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RoleBuilder_iam_permissionsBoundaryWithIManagedPolicy_software_amazon_awscdk_services_iam_IManagedPolicy_AsReference_feature",
						"_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Role Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoleBuilder_iam_roleName_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RoleBuilder_iam_roleName_java_lang_String__feature", "_UI_RoleBuilder_iam_type"),
						AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_RoleBuilder_iam_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RoleBuilder_iam_generatedClassName_feature", "_UI_RoleBuilder_iam_type"),
						AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_RoleBuilder_iam_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoleBuilder_iam_varName_feature",
								"_UI_RoleBuilder_iam_type"),
						AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_RoleBuilder_iam_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoleBuilder_iam_identifier_feature",
								"_UI_RoleBuilder_iam_type"),
						AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__IDENTIFIER, true, false, false,
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
				getString("_UI_RoleBuilder_iam_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoleBuilder_iam_additionalCode_feature",
						"_UI_RoleBuilder_iam_type"),
				AwsworkbenchPackage.Literals.ROLE_BUILDER_IAM__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RoleBuilder_iam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoleBuilder_iam"));
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
		return "Role " + ((RoleBuilder_iam) object).getVarName();

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

		switch (notification.getFeatureID(RoleBuilder_iam.class)) {
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__ASSUMED_BY_WITH_IPRINCIPAL_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IPRINCIPAL_AS_REFERENCE:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__EXTERNAL_ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__EXTERNAL_IDS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__INLINE_POLICIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_DOCUMENT_AS_MAP:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__MANAGED_POLICIES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_LIST:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__MAX_SESSION_DURATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__PATH_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__PERMISSIONS_BOUNDARY_WITH_IMANAGED_POLICY_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IMANAGED_POLICY_AS_REFERENCE:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__ROLE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__VAR_NAME:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__IDENTIFIER:
		case AwsworkbenchPackage.ROLE_BUILDER_IAM__ADDITIONAL_CODE:
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
