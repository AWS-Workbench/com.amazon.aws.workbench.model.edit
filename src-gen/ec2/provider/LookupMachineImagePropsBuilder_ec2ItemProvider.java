/**
 */
package ec2.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import ec2.Ec2Package;
import ec2.LookupMachineImagePropsBuilder_ec2;

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
 * This is the item provider adapter for a {@link ec2.LookupMachineImagePropsBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LookupMachineImagePropsBuilder_ec2ItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMachineImagePropsBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addName_java_lang_String_PropertyDescriptor(object);
			addOwners_java_lang_String_AsListPropertyDescriptor(object);
			addUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReferencePropertyDescriptor(object);
			addWindows_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LookupMachineImagePropsBuilder_ec2_name_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LookupMachineImagePropsBuilder_ec2_name_java_lang_String__feature",
						"_UI_LookupMachineImagePropsBuilder_ec2_type"),
				Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Owners java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwners_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LookupMachineImagePropsBuilder_ec2_owners_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LookupMachineImagePropsBuilder_ec2_owners_java_lang_String_AsList_feature",
						"_UI_LookupMachineImagePropsBuilder_ec2_type"),
				Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Data With User Data software amazon awscdk services ec2 User Data As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LookupMachineImagePropsBuilder_ec2_userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LookupMachineImagePropsBuilder_ec2_userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference_feature",
						"_UI_LookupMachineImagePropsBuilder_ec2_type"),
				Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Windows java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindows_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LookupMachineImagePropsBuilder_ec2_windows_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LookupMachineImagePropsBuilder_ec2_windows_java_lang_Boolean__feature",
						"_UI_LookupMachineImagePropsBuilder_ec2_type"),
				Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_LookupMachineImagePropsBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LookupMachineImagePropsBuilder_ec2_generatedClassName_feature",
						"_UI_LookupMachineImagePropsBuilder_ec2_type"),
				Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_LookupMachineImagePropsBuilder_ec2_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LookupMachineImagePropsBuilder_ec2_varName_feature",
								"_UI_LookupMachineImagePropsBuilder_ec2_type"),
						Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_LookupMachineImagePropsBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LookupMachineImagePropsBuilder_ec2_identifier_feature",
								"_UI_LookupMachineImagePropsBuilder_ec2_type"),
						Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER, true, false, false,
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
				getString("_UI_LookupMachineImagePropsBuilder_ec2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LookupMachineImagePropsBuilder_ec2_additionalCode_feature",
						"_UI_LookupMachineImagePropsBuilder_ec2_type"),
				Ec2Package.Literals.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LookupMachineImagePropsBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LookupMachineImagePropsBuilder_ec2"));
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
		String label = ((LookupMachineImagePropsBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_LookupMachineImagePropsBuilder_ec2_type")
				: getString("_UI_LookupMachineImagePropsBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(LookupMachineImagePropsBuilder_ec2.class)) {
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_:
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_:
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME:
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER:
		case Ec2Package.LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
