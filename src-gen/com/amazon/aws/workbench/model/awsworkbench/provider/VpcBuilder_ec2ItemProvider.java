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

			addCidr_java_lang_String_PropertyDescriptor(object);
			addDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_PropertyDescriptor(
					object);
			addEnableDnsHostnames_java_lang_Boolean_PropertyDescriptor(object);
			addEnableDnsSupport_java_lang_Boolean_PropertyDescriptor(object);
			addFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMapPropertyDescriptor(
					object);
			addGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMapPropertyDescriptor(
					object);
			addMaxAzs_java_lang_Number_PropertyDescriptor(object);
			addNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReferencePropertyDescriptor(
					object);
			addNatGateways_java_lang_Number_PropertyDescriptor(object);
			addNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
					object);
			addSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsListPropertyDescriptor(
					object);
			addVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMapPropertyDescriptor(
					object);
			addVpnGateway_java_lang_Boolean_PropertyDescriptor(object);
			addVpnGatewayAsn_java_lang_Number_PropertyDescriptor(object);
			addVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cidr java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCidr_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_cidr_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_cidr_java_lang_String__feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_defaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy__feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Dns Hostnames java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDnsHostnames_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_enableDnsHostnames_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_enableDnsHostnames_java_lang_Boolean__feature", "_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Dns Support java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDnsSupport_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_enableDnsSupport_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_enableDnsSupport_java_lang_Boolean__feature", "_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_flowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_gatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Azs java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAzs_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_maxAzs_java_lang_Number__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_maxAzs_java_lang_Number__feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_natGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nat Gateways java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatGateways_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_natGateways_java_lang_Number__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_natGateways_java_lang_Number__feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_, true, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_natGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_subnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMapPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_vpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Gateway java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnGateway_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_ec2_vpnGateway_java_lang_Boolean__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcBuilder_ec2_vpnGateway_java_lang_Boolean__feature", "_UI_VpcBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Gateway Asn java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnGatewayAsn_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcBuilder_ec2_vpnGatewayAsn_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_vpnGatewayAsn_java_lang_Number__feature", "_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcBuilder_ec2_vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcBuilder_ec2_vpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList_feature",
						"_UI_VpcBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST,
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
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2);
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2);
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2);
			childrenFeatures.add(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2);
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
		case AwsworkbenchPackage.VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VAR_NAME:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__IDENTIFIER:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__ADDITIONAL_CODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETBUILDER_EC2:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2:
		case AwsworkbenchPackage.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2:
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
				.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNETSELECTIONBUILDER_EC2,
						AwsworkbenchFactory.eINSTANCE.createSubnetSelectionBuilder_ec2()));

		newChildDescriptors
				.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__SUBNETCONFIGURATIONBUILDER_EC2,
						AwsworkbenchFactory.eINSTANCE.createSubnetConfigurationBuilder_ec2()));

		newChildDescriptors
				.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPNTUNNELOPTIONBUILDER_EC2,
						AwsworkbenchFactory.eINSTANCE.createVpnTunnelOptionBuilder_ec2()));

		newChildDescriptors
				.add(createChildParameter(AwsworkbenchPackage.Literals.VPC_BUILDER_EC2__VPNCONNECTIONOPTIONSBUILDER_EC2,
						AwsworkbenchFactory.eINSTANCE.createVpnConnectionOptionsBuilder_ec2()));
	}

}
