/**
 */
package iam.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import iam.IamPackage;
import iam.UnknownPrincipalBuilder_iam;

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
 * This is the item provider adapter for a {@link iam.UnknownPrincipalBuilder_iam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnknownPrincipalBuilder_iamItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownPrincipalBuilder_iamItemProvider(AdapterFactory adapterFactory) {
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

			addResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource With IConstruct software amazon awscdk core IConstruct As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_UnknownPrincipalBuilder_iam_resourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UnknownPrincipalBuilder_iam_resourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference_feature",
						"_UI_UnknownPrincipalBuilder_iam_type"),
				IamPackage.Literals.UNKNOWN_PRINCIPAL_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_UnknownPrincipalBuilder_iam_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UnknownPrincipalBuilder_iam_generatedClassName_feature",
								"_UI_UnknownPrincipalBuilder_iam_type"),
						IamPackage.Literals.UNKNOWN_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME, false, false, false,
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
				getString("_UI_UnknownPrincipalBuilder_iam_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnknownPrincipalBuilder_iam_varName_feature",
						"_UI_UnknownPrincipalBuilder_iam_type"),
				IamPackage.Literals.UNKNOWN_PRINCIPAL_BUILDER_IAM__VAR_NAME, true, false, false,
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
				getString("_UI_UnknownPrincipalBuilder_iam_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UnknownPrincipalBuilder_iam_identifier_feature",
						"_UI_UnknownPrincipalBuilder_iam_type"),
				IamPackage.Literals.UNKNOWN_PRINCIPAL_BUILDER_IAM__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_UnknownPrincipalBuilder_iam_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UnknownPrincipalBuilder_iam_additionalCode_feature",
								"_UI_UnknownPrincipalBuilder_iam_type"),
						IamPackage.Literals.UNKNOWN_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns UnknownPrincipalBuilder_iam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnknownPrincipalBuilder_iam"));
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
		String label = ((UnknownPrincipalBuilder_iam) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_UnknownPrincipalBuilder_iam_type")
				: getString("_UI_UnknownPrincipalBuilder_iam_type") + " " + label;
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

		switch (notification.getFeatureID(UnknownPrincipalBuilder_iam.class)) {
		case IamPackage.UNKNOWN_PRINCIPAL_BUILDER_IAM__RESOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
		case IamPackage.UNKNOWN_PRINCIPAL_BUILDER_IAM__GENERATED_CLASS_NAME:
		case IamPackage.UNKNOWN_PRINCIPAL_BUILDER_IAM__VAR_NAME:
		case IamPackage.UNKNOWN_PRINCIPAL_BUILDER_IAM__IDENTIFIER:
		case IamPackage.UNKNOWN_PRINCIPAL_BUILDER_IAM__ADDITIONAL_CODE:
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
