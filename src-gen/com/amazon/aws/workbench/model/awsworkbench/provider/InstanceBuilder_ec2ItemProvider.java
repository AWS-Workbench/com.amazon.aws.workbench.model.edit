/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.InstanceBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceBuilder_ec2ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addInstanceTypeWithInstanceTypeAsReferencePropertyDescriptor(object);
			addMachineImageWithIMachineImageAsReferencePropertyDescriptor(object);
			addVpcWithIVpcAsReferencePropertyDescriptor(object);
			addAllowAllOutboundPropertyDescriptor(object);
			addAvailabilityZonePropertyDescriptor(object);
			addBlockDevicesAsListPropertyDescriptor(object);
			addInstanceNamePropertyDescriptor(object);
			addKeyNamePropertyDescriptor(object);
			addPrivateIpAddressPropertyDescriptor(object);
			addResourceSignalTimeoutWithDurationAsReferencePropertyDescriptor(object);
			addRoleWithIRoleAsReferencePropertyDescriptor(object);
			addSecurityGroupWithISecurityGroupAsReferencePropertyDescriptor(object);
			addSourceDestCheckPropertyDescriptor(object);
			addUserDataWithUserDataAsReferencePropertyDescriptor(object);
			addVpcSubnetsWithSubnetSelectionAsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Type With Instance Type As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypeWithInstanceTypeAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_instanceTypeWithInstanceTypeAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_instanceTypeWithInstanceTypeAsReference_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Machine Image With IMachine Image As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMachineImageWithIMachineImageAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_machineImageWithIMachineImageAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_machineImageWithIMachineImageAsReference_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc With IVpc As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcWithIVpcAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_vpcWithIVpcAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_vpcWithIVpcAsReference_feature", "_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow All Outbound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowAllOutboundPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_allowAllOutbound_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InstanceBuilder_ec2_allowAllOutbound_feature", "_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Availability Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilityZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_availabilityZone_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InstanceBuilder_ec2_availabilityZone_feature", "_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Devices As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockDevicesAsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_blockDevicesAsList_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InstanceBuilder_ec2_blockDevicesAsList_feature", "_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Instance Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_instanceName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InstanceBuilder_ec2_instanceName_feature",
								"_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__INSTANCE_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_keyName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InstanceBuilder_ec2_keyName_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__KEY_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Private Ip Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateIpAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_privateIpAddress_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InstanceBuilder_ec2_privateIpAddress_feature", "_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Signal Timeout With Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceSignalTimeoutWithDurationAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_resourceSignalTimeoutWithDurationAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_resourceSignalTimeoutWithDurationAsReference_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Role With IRole As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleWithIRoleAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_roleWithIRoleAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_roleWithIRoleAsReference_feature", "_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Group With ISecurity Group As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityGroupWithISecurityGroupAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_securityGroupWithISecurityGroupAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_securityGroupWithISecurityGroupAsReference_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source Dest Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDestCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_sourceDestCheck_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InstanceBuilder_ec2_sourceDestCheck_feature", "_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Data With User Data As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDataWithUserDataAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_userDataWithUserDataAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_userDataWithUserDataAsReference_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Subnets With Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcSubnetsWithSubnetSelectionAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InstanceBuilder_ec2_vpcSubnetsWithSubnetSelectionAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InstanceBuilder_ec2_vpcSubnetsWithSubnetSelectionAsReference_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InstanceBuilder_ec2_generatedClassName_feature", "_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
				getString("_UI_InstanceBuilder_ec2_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InstanceBuilder_ec2_varName_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__VAR_NAME, true, false, false,
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
				getString("_UI_InstanceBuilder_ec2_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InstanceBuilder_ec2_identifier_feature",
						"_UI_InstanceBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_InstanceBuilder_ec2_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InstanceBuilder_ec2_additionalCode_feature", "_UI_InstanceBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.INSTANCE_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns InstanceBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InstanceBuilder_ec2"));
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
		String label = ((InstanceBuilder_ec2) object).getInstanceName();
		return label == null || label.length() == 0 ? getString("_UI_InstanceBuilder_ec2_type")
				: getString("_UI_InstanceBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(InstanceBuilder_ec2.class)) {
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__BLOCK_DEVICES_AS_LIST:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__INSTANCE_NAME:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__KEY_NAME:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__VAR_NAME:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__IDENTIFIER:
		case AwsworkbenchPackage.INSTANCE_BUILDER_EC2__ADDITIONAL_CODE:
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
