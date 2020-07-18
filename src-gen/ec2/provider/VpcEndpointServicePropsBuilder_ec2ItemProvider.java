/**
 */
package ec2.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import ec2.Ec2Package;
import ec2.VpcEndpointServicePropsBuilder_ec2;

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
 * This is the item provider adapter for a {@link ec2.VpcEndpointServicePropsBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VpcEndpointServicePropsBuilder_ec2ItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpcEndpointServicePropsBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsListPropertyDescriptor(
					object);
			addAcceptanceRequired_java_lang_Boolean_PropertyDescriptor(object);
			addVpcEndpointServiceName_java_lang_String_PropertyDescriptor(object);
			addWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcEndpointServicePropsBuilder_ec2_vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcEndpointServicePropsBuilder_ec2_vpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList_feature",
						"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Acceptance Required java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcceptanceRequired_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcEndpointServicePropsBuilder_ec2_acceptanceRequired_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcEndpointServicePropsBuilder_ec2_acceptanceRequired_java_lang_Boolean__feature",
						"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Endpoint Service Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcEndpointServiceName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcEndpointServicePropsBuilder_ec2_vpcEndpointServiceName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcEndpointServicePropsBuilder_ec2_vpcEndpointServiceName_java_lang_String__feature",
						"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Whitelisted Principals software amazon awscdk services iam Arn Principal As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcEndpointServicePropsBuilder_ec2_whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcEndpointServicePropsBuilder_ec2_whitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList_feature",
						"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST,
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
				getString("_UI_VpcEndpointServicePropsBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcEndpointServicePropsBuilder_ec2_generatedClassName_feature",
						"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_VpcEndpointServicePropsBuilder_ec2_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcEndpointServicePropsBuilder_ec2_varName_feature",
								"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
						Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_VpcEndpointServicePropsBuilder_ec2_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcEndpointServicePropsBuilder_ec2_identifier_feature",
								"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
						Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__IDENTIFIER, true, false, false,
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
				getString("_UI_VpcEndpointServicePropsBuilder_ec2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcEndpointServicePropsBuilder_ec2_additionalCode_feature",
						"_UI_VpcEndpointServicePropsBuilder_ec2_type"),
				Ec2Package.Literals.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VpcEndpointServicePropsBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VpcEndpointServicePropsBuilder_ec2"));
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
		String label = ((VpcEndpointServicePropsBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_VpcEndpointServicePropsBuilder_ec2_type")
				: getString("_UI_VpcEndpointServicePropsBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(VpcEndpointServicePropsBuilder_ec2.class)) {
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST:
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_:
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_:
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST:
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME:
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VAR_NAME:
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__IDENTIFIER:
		case Ec2Package.VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE:
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
