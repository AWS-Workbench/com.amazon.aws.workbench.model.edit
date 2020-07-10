/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VpcBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VpcBuilder_ec2ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpcBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addCidrPropertyDescriptor(object);
			addDefaultInstanceTenancyPropertyDescriptor(object);
			addEnableDnsHostnamesPropertyDescriptor(object);
			addEnableDnsSupportPropertyDescriptor(object);
			addFlowLogsAsMapPropertyDescriptor(object);
			addGatewayEndpointsAsMapPropertyDescriptor(object);
			addMaxAzsPropertyDescriptor(object);
			addNatGatewayProviderWithNatProviderAsReferencePropertyDescriptor(object);
			addNatGatewaysPropertyDescriptor(object);
			addNatGatewaySubnetsWithSubnetSelectionAsReferencePropertyDescriptor(object);
			addSubnetConfigurationAsListPropertyDescriptor(object);
			addVpnConnectionsAsMapPropertyDescriptor(object);
			addVpnGatewayPropertyDescriptor(object);
			addVpnGatewayAsnPropertyDescriptor(object);
			addVpnRoutePropagationAsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cidr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCidrPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_cidr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_cidr_feature",
								"_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__CIDR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Instance Tenancy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultInstanceTenancyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_defaultInstanceTenancy_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_defaultInstanceTenancy_feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Dns Hostnames feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDnsHostnamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_enableDnsHostnames_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_enableDnsHostnames_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Dns Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDnsSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_enableDnsSupport_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_enableDnsSupport_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Flow Logs As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowLogsAsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_flowLogsAsMap_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_flowLogsAsMap_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gateway Endpoints As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatewayEndpointsAsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_gatewayEndpointsAsMap_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_gatewayEndpointsAsMap_feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Azs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAzsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_maxAzs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_maxAzs_feature",
								"_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__MAX_AZS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nat Gateway Provider With Nat Provider As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatGatewayProviderWithNatProviderAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_natGatewayProviderWithNatProviderAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_natGatewayProviderWithNatProviderAsReference_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nat Gateways feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatGatewaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_natGateways_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_natGateways_feature",
								"_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__NAT_GATEWAYS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nat Gateway Subnets With Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatGatewaySubnetsWithSubnetSelectionAsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_natGatewaySubnetsWithSubnetSelectionAsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_natGatewaySubnetsWithSubnetSelectionAsReference_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subnet Configuration As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetConfigurationAsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_subnetConfigurationAsList_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_subnetConfigurationAsList_feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Connections As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnConnectionsAsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_vpnConnectionsAsMap_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_vpnConnectionsAsMap_feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_vpnGateway_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_vpnGateway_feature",
								"_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_GATEWAY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Gateway Asn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnGatewayAsnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_vpnGatewayAsn_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_vpnGatewayAsn_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_GATEWAY_ASN, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Route Propagation As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnRoutePropagationAsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_vpnRoutePropagationAsList_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_vpnRoutePropagationAsList_feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST, true, false, false,
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
				getString("_UI_VpcBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_generatedClassName_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_varName_feature",
								"_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_identifier_feature",
								"_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__IDENTIFIER, true, false, false,
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
				getString("_UI_VpcBuilder_ec2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_ec2_additionalCode_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNETBUILDER_EC2);
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2);
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2);
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VpcBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VpcBuilder_ec2"));
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
		String label = ((VpcBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_VpcBuilder_ec2_type")
				: getString("_UI_VpcBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(VpcBuilder_ec2.class)) {
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_AS_MAP:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_AS_MAP:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_AS_REFERENCE:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_AS_LIST:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_AS_MAP:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_AS_LIST:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VAR_NAME:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__IDENTIFIER:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ADDITIONAL_CODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNETBUILDER_EC2,
				AwsworkbenchFactory.eINSTANCE.createSubnetBuilder_ec2()));

		newChildDescriptors
				.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SECURITYGROUPBUILDER_EC2,
						AwsworkbenchFactory.eINSTANCE.createSecurityGroupBuilder_ec2()));

		newChildDescriptors
				.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__PRIVATESUBNETBUILDER_EC2,
						AwsworkbenchFactory.eINSTANCE.createPrivateSubnetBuilder_ec2()));

		newChildDescriptors
				.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__PUBLICSUBNETBUILDER_EC2,
						AwsworkbenchFactory.eINSTANCE.createPublicSubnetBuilder_ec2()));
	}

}
