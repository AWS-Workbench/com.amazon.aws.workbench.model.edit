/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancerBuilder_elasticloadbalancingv2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancerBuilder_elasticloadbalancingv2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkLoadBalancerBuilder_elasticloadbalancingv2ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLoadBalancerBuilder_elasticloadbalancingv2ItemProvider(AdapterFactory adapterFactory) {
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

			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addDeletionProtection_java_lang_Boolean_PropertyDescriptor(object);
			addInternetFacing_java_lang_Boolean_PropertyDescriptor(object);
			addLoadBalancerName_java_lang_String_PropertyDescriptor(object);
			addVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
					object);
			addCrossZoneEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deletion Protection java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeletionProtection_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_deletionProtection_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_deletionProtection_java_lang_Boolean__feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Internet Facing java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternetFacing_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_internetFacing_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_internetFacing_java_lang_Boolean__feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Load Balancer Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadBalancerName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_loadBalancerName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_loadBalancerName_java_lang_String__feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference_feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cross Zone Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossZoneEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_crossZoneEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_crossZoneEnabled_java_lang_Boolean__feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_,
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
				getString("_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_generatedClassName_feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__GENERATED_CLASS_NAME,
				false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_varName_feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_identifier_feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_additionalCode_feature",
						"_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type"),
				AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns NetworkLoadBalancerBuilder_elasticloadbalancingv2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/NetworkLoadBalancerBuilder_elasticloadbalancingv2"));
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
		String label = ((NetworkLoadBalancerBuilder_elasticloadbalancingv2) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type")
				: getString("_UI_NetworkLoadBalancerBuilder_elasticloadbalancingv2_type") + " " + label;
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

		switch (notification.getFeatureID(NetworkLoadBalancerBuilder_elasticloadbalancingv2.class)) {
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER:
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE:
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
