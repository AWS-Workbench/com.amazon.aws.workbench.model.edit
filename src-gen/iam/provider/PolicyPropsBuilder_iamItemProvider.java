/**
 */
package iam.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import iam.IamPackage;
import iam.PolicyPropsBuilder_iam;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iam.PolicyPropsBuilder_iam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyPropsBuilder_iamItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyPropsBuilder_iamItemProvider(AdapterFactory adapterFactory) {
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

			addForce_java_lang_Boolean_PropertyDescriptor(object);
			addGroups_software_amazon_awscdk_services_iam_IGroup_AsListPropertyDescriptor(object);
			addPolicyName_java_lang_String_PropertyDescriptor(object);
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
	 * This adds a property descriptor for the Force java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForce_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PolicyPropsBuilder_iam_force_java_lang_Boolean__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PolicyPropsBuilder_iam_force_java_lang_Boolean__feature",
								"_UI_PolicyPropsBuilder_iam_type"),
						IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_PolicyPropsBuilder_iam_groups_software_amazon_awscdk_services_iam_IGroup_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyPropsBuilder_iam_groups_software_amazon_awscdk_services_iam_IGroup_AsList_feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Policy Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicyName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PolicyPropsBuilder_iam_policyName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyPropsBuilder_iam_policyName_java_lang_String__feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PolicyPropsBuilder_iam_roles_software_amazon_awscdk_services_iam_IRole_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyPropsBuilder_iam_roles_software_amazon_awscdk_services_iam_IRole_AsList_feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST,
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
						"_UI_PolicyPropsBuilder_iam_statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyPropsBuilder_iam_statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
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
				getString("_UI_PolicyPropsBuilder_iam_users_software_amazon_awscdk_services_iam_IUser_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyPropsBuilder_iam_users_software_amazon_awscdk_services_iam_IUser_AsList_feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST,
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
				getString("_UI_PolicyPropsBuilder_iam_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyPropsBuilder_iam_generatedClassName_feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PolicyPropsBuilder_iam_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyPropsBuilder_iam_varName_feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__VAR_NAME, true, false, false,
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
				getString("_UI_PolicyPropsBuilder_iam_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyPropsBuilder_iam_identifier_feature",
						"_UI_PolicyPropsBuilder_iam_type"),
				IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_PolicyPropsBuilder_iam_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PolicyPropsBuilder_iam_additionalCode_feature", "_UI_PolicyPropsBuilder_iam_type"),
						IamPackage.Literals.POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PolicyPropsBuilder_iam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolicyPropsBuilder_iam"));
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
		String label = ((PolicyPropsBuilder_iam) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_PolicyPropsBuilder_iam_type")
				: getString("_UI_PolicyPropsBuilder_iam_type") + " " + label;
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

		switch (notification.getFeatureID(PolicyPropsBuilder_iam.class)) {
		case IamPackage.POLICY_PROPS_BUILDER_IAM__FORCE_JAVA_LANG_BOOLEAN_:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IGROUP_AS_LIST:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__POLICY_NAME_JAVA_LANG_STRING_:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ROLES_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_LIST:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__USERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IUSER_AS_LIST:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__GENERATED_CLASS_NAME:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__VAR_NAME:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__IDENTIFIER:
		case IamPackage.POLICY_PROPS_BUILDER_IAM__ADDITIONAL_CODE:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AwsworkbenchEditPlugin.INSTANCE;
	}

}
