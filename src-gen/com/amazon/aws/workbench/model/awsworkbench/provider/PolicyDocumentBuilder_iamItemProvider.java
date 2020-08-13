/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.PolicyDocumentBuilder_iam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyDocumentBuilder_iamItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyDocumentBuilder_iamItemProvider(AdapterFactory adapterFactory) {
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

			addAssignSids_java_lang_Boolean_PropertyDescriptor(object);
			addStatements_software_amazon_awscdk_services_iam_PolicyStatement_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Assign Sids java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignSids_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PolicyDocumentBuilder_iam_assignSids_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyDocumentBuilder_iam_assignSids_java_lang_Boolean__feature",
						"_UI_PolicyDocumentBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_PolicyDocumentBuilder_iam_statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PolicyDocumentBuilder_iam_statements_software_amazon_awscdk_services_iam_PolicyStatement_AsList_feature",
						"_UI_PolicyDocumentBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_PolicyDocumentBuilder_iam_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PolicyDocumentBuilder_iam_generatedClassName_feature",
								"_UI_PolicyDocumentBuilder_iam_type"),
						AwsworkbenchPackage.Literals.POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME, false, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_PolicyDocumentBuilder_iam_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PolicyDocumentBuilder_iam_varName_feature",
								"_UI_PolicyDocumentBuilder_iam_type"),
						AwsworkbenchPackage.Literals.POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME, true, false, false,
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
				getString("_UI_PolicyDocumentBuilder_iam_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyDocumentBuilder_iam_identifier_feature",
						"_UI_PolicyDocumentBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER, true, false, false,
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
				getString("_UI_PolicyDocumentBuilder_iam_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PolicyDocumentBuilder_iam_additionalCode_feature",
						"_UI_PolicyDocumentBuilder_iam_type"),
				AwsworkbenchPackage.Literals.POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PolicyDocumentBuilder_iam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolicyDocumentBuilder_iam"));
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
		String label = ((PolicyDocumentBuilder_iam) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_PolicyDocumentBuilder_iam_type")
				: getString("_UI_PolicyDocumentBuilder_iam_type") + " " + label;
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

		switch (notification.getFeatureID(PolicyDocumentBuilder_iam.class)) {
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ASSIGN_SIDS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__STATEMENTS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_POLICY_STATEMENT_AS_LIST:
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__VAR_NAME:
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__IDENTIFIER:
		case AwsworkbenchPackage.POLICY_DOCUMENT_BUILDER_IAM__ADDITIONAL_CODE:
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
