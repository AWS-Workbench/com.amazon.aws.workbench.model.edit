/**
 */
package ec2.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import ec2.Ec2Package;
import ec2.VpcAttributesBuilder_ec2;

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
 * This is the item provider adapter for a {@link ec2.VpcAttributesBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VpcAttributesBuilder_ec2ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpcAttributesBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addAvailabilityZones_java_lang_String_AsListPropertyDescriptor(object);
			addVpcId_java_lang_String_PropertyDescriptor(object);
			addIsolatedSubnetIds_java_lang_String_AsListPropertyDescriptor(object);
			addIsolatedSubnetNames_java_lang_String_AsListPropertyDescriptor(object);
			addIsolatedSubnetRouteTableIds_java_lang_String_AsListPropertyDescriptor(object);
			addPrivateSubnetIds_java_lang_String_AsListPropertyDescriptor(object);
			addPrivateSubnetNames_java_lang_String_AsListPropertyDescriptor(object);
			addPrivateSubnetRouteTableIds_java_lang_String_AsListPropertyDescriptor(object);
			addPublicSubnetIds_java_lang_String_AsListPropertyDescriptor(object);
			addPublicSubnetNames_java_lang_String_AsListPropertyDescriptor(object);
			addPublicSubnetRouteTableIds_java_lang_String_AsListPropertyDescriptor(object);
			addVpcCidrBlock_java_lang_String_PropertyDescriptor(object);
			addVpnGatewayId_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Availability Zones java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilityZones_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_availabilityZones_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_availabilityZones_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcAttributesBuilder_ec2_vpcId_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcAttributesBuilder_ec2_vpcId_java_lang_String__feature",
								"_UI_VpcAttributesBuilder_ec2_type"),
						Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Isolated Subnet Ids java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsolatedSubnetIds_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_isolatedSubnetIds_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_isolatedSubnetIds_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Isolated Subnet Names java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsolatedSubnetNames_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_isolatedSubnetNames_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_isolatedSubnetNames_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Isolated Subnet Route Table Ids java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsolatedSubnetRouteTableIds_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_isolatedSubnetRouteTableIds_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_isolatedSubnetRouteTableIds_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Private Subnet Ids java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateSubnetIds_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_privateSubnetIds_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_privateSubnetIds_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Private Subnet Names java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateSubnetNames_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_privateSubnetNames_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_privateSubnetNames_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Private Subnet Route Table Ids java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateSubnetRouteTableIds_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_privateSubnetRouteTableIds_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_privateSubnetRouteTableIds_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Public Subnet Ids java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicSubnetIds_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_publicSubnetIds_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_publicSubnetIds_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Public Subnet Names java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicSubnetNames_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_publicSubnetNames_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_publicSubnetNames_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Public Subnet Route Table Ids java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicSubnetRouteTableIds_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_publicSubnetRouteTableIds_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_publicSubnetRouteTableIds_java_lang_String_AsList_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Cidr Block java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcCidrBlock_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_vpcCidrBlock_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_vpcCidrBlock_java_lang_String__feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Gateway Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnGatewayId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcAttributesBuilder_ec2_vpnGatewayId_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_vpnGatewayId_java_lang_String__feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_VpcAttributesBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcAttributesBuilder_ec2_generatedClassName_feature", "_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
				getString("_UI_VpcAttributesBuilder_ec2_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcAttributesBuilder_ec2_varName_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcAttributesBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcAttributesBuilder_ec2_identifier_feature", "_UI_VpcAttributesBuilder_ec2_type"),
						Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER, true, false, false,
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
				getString("_UI_VpcAttributesBuilder_ec2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcAttributesBuilder_ec2_additionalCode_feature",
						"_UI_VpcAttributesBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VpcAttributesBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VpcAttributesBuilder_ec2"));
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
		String label = ((VpcAttributesBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_VpcAttributesBuilder_ec2_type")
				: getString("_UI_VpcAttributesBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(VpcAttributesBuilder_ec2.class)) {
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER:
		case Ec2Package.VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE:
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
