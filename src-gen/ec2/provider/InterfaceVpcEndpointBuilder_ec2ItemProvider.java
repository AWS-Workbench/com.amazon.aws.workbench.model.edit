/**
 */
package ec2.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import ec2.Ec2Package;
import ec2.InterfaceVpcEndpointBuilder_ec2;

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
 * This is the item provider adapter for a {@link ec2.InterfaceVpcEndpointBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceVpcEndpointBuilder_ec2ItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceVpcEndpointBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReferencePropertyDescriptor(
					object);
			addLookupSupportedAzs_java_lang_Boolean_PropertyDescriptor(object);
			addOpen_java_lang_Boolean_PropertyDescriptor(object);
			addPrivateDnsEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsListPropertyDescriptor(object);
			addSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
					object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_InterfaceVpcEndpointBuilder_ec2_serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_serviceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference_feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lookup Supported Azs java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLookupSupportedAzs_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InterfaceVpcEndpointBuilder_ec2_lookupSupportedAzs_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_lookupSupportedAzs_java_lang_Boolean__feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Open java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpen_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InterfaceVpcEndpointBuilder_ec2_open_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_open_java_lang_Boolean__feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Private Dns Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateDnsEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InterfaceVpcEndpointBuilder_ec2_privateDnsEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_privateDnsEnabled_java_lang_Boolean__feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Groups software amazon awscdk services ec2 ISecurity Group As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_InterfaceVpcEndpointBuilder_ec2_securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_securityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList_feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_InterfaceVpcEndpointBuilder_ec2_subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_subnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_InterfaceVpcEndpointBuilder_ec2_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
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
				getString("_UI_InterfaceVpcEndpointBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_InterfaceVpcEndpointBuilder_ec2_generatedClassName_feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
				getString("_UI_InterfaceVpcEndpointBuilder_ec2_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InterfaceVpcEndpointBuilder_ec2_varName_feature",
						"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
				Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_InterfaceVpcEndpointBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InterfaceVpcEndpointBuilder_ec2_identifier_feature",
								"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
						Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_InterfaceVpcEndpointBuilder_ec2_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InterfaceVpcEndpointBuilder_ec2_additionalCode_feature",
								"_UI_InterfaceVpcEndpointBuilder_ec2_type"),
						Ec2Package.Literals.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns InterfaceVpcEndpointBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InterfaceVpcEndpointBuilder_ec2"));
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
		String label = ((InterfaceVpcEndpointBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_InterfaceVpcEndpointBuilder_ec2_type")
				: getString("_UI_InterfaceVpcEndpointBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(InterfaceVpcEndpointBuilder_ec2.class)) {
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER:
		case Ec2Package.INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE:
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
