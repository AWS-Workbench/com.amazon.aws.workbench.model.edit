/**
 */
package com.amazon.aws.workbench.model.awsworkbench.builders.provider;

import com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage;
import com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder;

import com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.provider.AwsworkbenchEditPlugin;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VpcBuilderItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpcBuilderItemProvider(AdapterFactory adapterFactory) {
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
			addEnableDnsHostnamesPropertyDescriptor(object);
			addEnableDnsSupportPropertyDescriptor(object);
			addMaxAzsPropertyDescriptor(object);
			addNatGatewaysPropertyDescriptor(object);
			addVpnGatewayPropertyDescriptor(object);
			addVpnGatewayAsnPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_VpcBuilder_cidr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_cidr_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__CIDR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Dns Hostnames feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDnsHostnamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_enableDnsHostnames_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_enableDnsHostnames_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__ENABLE_DNS_HOSTNAMES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Dns Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDnsSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_enableDnsSupport_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_enableDnsSupport_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__ENABLE_DNS_SUPPORT, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_maxAzs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_maxAzs_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__MAX_AZS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_VpcBuilder_natGateways_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_natGateways_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__NAT_GATEWAYS, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_vpnGateway_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_vpnGateway_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__VPN_GATEWAY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpn Gateway Asn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpnGatewayAsnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VpcBuilder_vpnGatewayAsn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_vpnGatewayAsn_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__VPN_GATEWAY_ASN, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_generatedClassName_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__GENERATED_CLASS_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_varName_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_identifier_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcBuilder_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcBuilder_additionalCode_feature",
								"_UI_VpcBuilder_type"),
						BuildersPackage.Literals.VPC_BUILDER__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VpcBuilder.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VpcBuilder"));
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
		String label = ((VpcBuilder) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_VpcBuilder_type")
				: getString("_UI_VpcBuilder_type") + " " + label;
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

		switch (notification.getFeatureID(VpcBuilder.class)) {
		case BuildersPackage.VPC_BUILDER__CIDR:
		case BuildersPackage.VPC_BUILDER__ENABLE_DNS_HOSTNAMES:
		case BuildersPackage.VPC_BUILDER__ENABLE_DNS_SUPPORT:
		case BuildersPackage.VPC_BUILDER__MAX_AZS:
		case BuildersPackage.VPC_BUILDER__NAT_GATEWAYS:
		case BuildersPackage.VPC_BUILDER__VPN_GATEWAY:
		case BuildersPackage.VPC_BUILDER__VPN_GATEWAY_ASN:
		case BuildersPackage.VPC_BUILDER__GENERATED_CLASS_NAME:
		case BuildersPackage.VPC_BUILDER__VAR_NAME:
		case BuildersPackage.VPC_BUILDER__IDENTIFIER:
		case BuildersPackage.VPC_BUILDER__ADDITIONAL_CODE:
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
