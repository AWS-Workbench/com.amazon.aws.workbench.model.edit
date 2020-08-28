/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.PrivateDnsNamespaceBuilder_servicediscovery;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.PrivateDnsNamespaceBuilder_servicediscovery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivateDnsNamespaceBuilder_servicediscoveryItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateDnsNamespaceBuilder_servicediscoveryItemProvider(AdapterFactory adapterFactory) {
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

			addName_java_lang_String_PropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrivateDnsNamespaceBuilder_servicediscovery_name_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_name_java_lang_String__feature",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrivateDnsNamespaceBuilder_servicediscovery_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_description_java_lang_String__feature",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__DESCRIPTION_JAVA_LANG_STRING_,
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
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference_feature",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
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
				getString("_UI_PrivateDnsNamespaceBuilder_servicediscovery_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_generatedClassName_feature",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__GENERATED_CLASS_NAME,
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
				getString("_UI_PrivateDnsNamespaceBuilder_servicediscovery_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_varName_feature",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__VAR_NAME, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PrivateDnsNamespaceBuilder_servicediscovery_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_identifier_feature",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__IDENTIFIER, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_PrivateDnsNamespaceBuilder_servicediscovery_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_additionalCode_feature",
						"_UI_PrivateDnsNamespaceBuilder_servicediscovery_type"),
				AwsworkbenchPackage.Literals.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PrivateDnsNamespaceBuilder_servicediscovery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/PrivateDnsNamespaceBuilder_servicediscovery"));
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return "PrivateDnsNamespace " + ((PrivateDnsNamespaceBuilder_servicediscovery) object).getVarName();

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

		switch (notification.getFeatureID(PrivateDnsNamespaceBuilder_servicediscovery.class)) {
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__VAR_NAME:
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__IDENTIFIER:
		case AwsworkbenchPackage.PRIVATE_DNS_NAMESPACE_BUILDER_SERVICEDISCOVERY__ADDITIONAL_CODE:
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
