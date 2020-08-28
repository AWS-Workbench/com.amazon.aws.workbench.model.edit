/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2;
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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AmazonLinuxImageBuilder_ec2ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonLinuxImageBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_PropertyDescriptor(object);
			addGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_PropertyDescriptor(object);
			addStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_PropertyDescriptor(object);
			addUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReferencePropertyDescriptor(object);
			addVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Edition software amazon awscdk services ec2 Amazon Linux Edition  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AmazonLinuxImageBuilder_ec2_edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AmazonLinuxImageBuilder_ec2_edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition__feature",
						"_UI_AmazonLinuxImageBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Generation software amazon awscdk services ec2 Amazon Linux Generation  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AmazonLinuxImageBuilder_ec2_generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AmazonLinuxImageBuilder_ec2_generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration__feature",
						"_UI_AmazonLinuxImageBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Storage software amazon awscdk services ec2 Amazon Linux Storage  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AmazonLinuxImageBuilder_ec2_storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AmazonLinuxImageBuilder_ec2_storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage__feature",
						"_UI_AmazonLinuxImageBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						"_UI_AmazonLinuxImageBuilder_ec2_userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AmazonLinuxImageBuilder_ec2_userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference_feature",
						"_UI_AmazonLinuxImageBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Virtualization software amazon awscdk services ec2 Amazon Linux Virt  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AmazonLinuxImageBuilder_ec2_virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AmazonLinuxImageBuilder_ec2_virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt__feature",
						"_UI_AmazonLinuxImageBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_,
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
						getResourceLocator(), getString("_UI_AmazonLinuxImageBuilder_ec2_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AmazonLinuxImageBuilder_ec2_generatedClassName_feature",
								"_UI_AmazonLinuxImageBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_AmazonLinuxImageBuilder_ec2_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AmazonLinuxImageBuilder_ec2_varName_feature",
						"_UI_AmazonLinuxImageBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME, true, false, false,
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
				getString("_UI_AmazonLinuxImageBuilder_ec2_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AmazonLinuxImageBuilder_ec2_identifier_feature",
						"_UI_AmazonLinuxImageBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_AmazonLinuxImageBuilder_ec2_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AmazonLinuxImageBuilder_ec2_additionalCode_feature",
								"_UI_AmazonLinuxImageBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AmazonLinuxImageBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AmazonLinuxImageBuilder_ec2"));
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
		return "AmazonLinuxImage " + ((AmazonLinuxImageBuilder_ec2) object).getVarName();

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

		switch (notification.getFeatureID(AmazonLinuxImageBuilder_ec2.class)) {
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER:
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE:
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
