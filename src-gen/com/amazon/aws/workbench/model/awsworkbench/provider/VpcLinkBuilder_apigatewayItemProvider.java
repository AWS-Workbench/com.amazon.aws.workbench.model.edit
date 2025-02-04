/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.VpcLinkBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.VpcLinkBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VpcLinkBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpcLinkBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addDescription_java_lang_String_PropertyDescriptor(object);
			addTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsListPropertyDescriptor(
					object);
			addVpcLinkName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_VpcLinkBuilder_apigateway_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLinkBuilder_apigateway_description_java_lang_String__feature",
						"_UI_VpcLinkBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.VPC_LINK_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_VpcLinkBuilder_apigateway_targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLinkBuilder_apigateway_targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList_feature",
						"_UI_VpcLinkBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.VPC_LINK_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpc Link Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcLinkName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VpcLinkBuilder_apigateway_vpcLinkName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_VpcLinkBuilder_apigateway_vpcLinkName_java_lang_String__feature",
						"_UI_VpcLinkBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.VPC_LINK_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_VpcLinkBuilder_apigateway_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VpcLinkBuilder_apigateway_generatedClassName_feature",
								"_UI_VpcLinkBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.VPC_LINK_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_VpcLinkBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VpcLinkBuilder_apigateway_varName_feature",
								"_UI_VpcLinkBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.VPC_LINK_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
				getString("_UI_VpcLinkBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcLinkBuilder_apigateway_identifier_feature",
						"_UI_VpcLinkBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.VPC_LINK_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
				getString("_UI_VpcLinkBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VpcLinkBuilder_apigateway_additionalCode_feature",
						"_UI_VpcLinkBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.VPC_LINK_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns VpcLinkBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VpcLinkBuilder_apigateway"));
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
		return "VpcLink " + ((VpcLinkBuilder_apigateway) object).getVarName();

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

		switch (notification.getFeatureID(VpcLinkBuilder_apigateway.class)) {
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST:
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.VPC_LINK_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
