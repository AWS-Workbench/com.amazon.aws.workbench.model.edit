/**
 */
package ec2.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import ec2.CommonNetworkAclEntryOptionsBuilder_ec2;
import ec2.Ec2Package;

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
 * This is the item provider adapter for a {@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonNetworkAclEntryOptionsBuilder_ec2ItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonNetworkAclEntryOptionsBuilder_ec2ItemProvider(AdapterFactory adapterFactory) {
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

			addCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReferencePropertyDescriptor(object);
			addRuleNumber_java_lang_Number_PropertyDescriptor(object);
			addTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReferencePropertyDescriptor(
					object);
			addDirection_software_amazon_awscdk_services_ec2_TrafficDirection_PropertyDescriptor(object);
			addNetworkAclEntryName_java_lang_String_PropertyDescriptor(object);
			addRuleAction_software_amazon_awscdk_services_ec2_Action_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_cidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference_feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rule Number java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuleNumber_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_ruleNumber_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_ruleNumber_java_lang_Number__feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_trafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference_feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Direction software amazon awscdk services ec2 Traffic Direction  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirection_software_amazon_awscdk_services_ec2_TrafficDirection_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_direction_software_amazon_awscdk_services_ec2_TrafficDirection__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_direction_software_amazon_awscdk_services_ec2_TrafficDirection__feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Network Acl Entry Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkAclEntryName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_networkAclEntryName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_networkAclEntryName_java_lang_String__feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rule Action software amazon awscdk services ec2 Action  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuleAction_software_amazon_awscdk_services_ec2_Action_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_ruleAction_software_amazon_awscdk_services_ec2_Action__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_ruleAction_software_amazon_awscdk_services_ec2_Action__feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_,
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
				getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_generatedClassName_feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME, false, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_varName_feature",
								"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
						Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__VAR_NAME, true, false, false,
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
				getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_identifier_feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__IDENTIFIER, true, false, false,
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
				getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_additionalCode_feature",
						"_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type"),
				Ec2Package.Literals.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CommonNetworkAclEntryOptionsBuilder_ec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/CommonNetworkAclEntryOptionsBuilder_ec2"));
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
		String label = ((CommonNetworkAclEntryOptionsBuilder_ec2) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type")
				: getString("_UI_CommonNetworkAclEntryOptionsBuilder_ec2_type") + " " + label;
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

		switch (notification.getFeatureID(CommonNetworkAclEntryOptionsBuilder_ec2.class)) {
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__VAR_NAME:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__IDENTIFIER:
		case Ec2Package.COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
