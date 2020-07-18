/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VpnConnectionOptionsBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VpnConnectionOptionsBuilder_ec2ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpnConnectionOptionsBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addIp_java_lang_String_PropertyDescriptor(object);
			addAsn_java_lang_Number_PropertyDescriptor(object);
			addStaticRoutes_java_lang_String_AsListPropertyDescriptor(object);
			addTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ip java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIp_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpnConnectionOptionsBuilder_ec2_ip_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpnConnectionOptionsBuilder_ec2_ip_java_lang_String__feature",
						"_UI_VpnConnectionOptionsBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Asn java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsn_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpnConnectionOptionsBuilder_ec2_asn_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpnConnectionOptionsBuilder_ec2_asn_java_lang_Number__feature",
						"_UI_VpnConnectionOptionsBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Static Routes java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticRoutes_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpnConnectionOptionsBuilder_ec2_staticRoutes_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpnConnectionOptionsBuilder_ec2_staticRoutes_java_lang_String_AsList_feature",
						"_UI_VpnConnectionOptionsBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpnConnectionOptionsBuilder_ec2_tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpnConnectionOptionsBuilder_ec2_tunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList_feature",
						"_UI_VpnConnectionOptionsBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST,
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
				getString("_UI_VpnConnectionOptionsBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpnConnectionOptionsBuilder_ec2_generatedClassName_feature",
						"_UI_VpnConnectionOptionsBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_VpnConnectionOptionsBuilder_ec2_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpnConnectionOptionsBuilder_ec2_varName_feature",
						"_UI_VpnConnectionOptionsBuilder_ec2_type"),
				AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_VpnConnectionOptionsBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpnConnectionOptionsBuilder_ec2_identifier_feature",
								"_UI_VpnConnectionOptionsBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_VpnConnectionOptionsBuilder_ec2_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpnConnectionOptionsBuilder_ec2_additionalCode_feature",
								"_UI_VpnConnectionOptionsBuilder_ec2_type"),
						AwsworkbenchPackage.Literals.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VpnConnectionOptionsBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VpnConnectionOptionsBuilder_ec2"));
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
		String label = ((VpnConnectionOptionsBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_VpnConnectionOptionsBuilder_ec2_type")
				: getString("_UI_VpnConnectionOptionsBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(VpnConnectionOptionsBuilder_ec2.class)) {
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST:
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME:
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER:
		case AwsworkbenchPackage.VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
