/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HostedZoneBuilder_route53ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostedZoneBuilder_route53ItemProvider(AdapterFactory adapterFactory) {
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

			addZoneName_java_lang_String_PropertyDescriptor(object);
			addComment_java_lang_String_PropertyDescriptor(object);
			addQueryLogsLogGroupArn_java_lang_String_PropertyDescriptor(object);
			addVpcs_software_amazon_awscdk_services_ec2_IVpc_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Zone Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZoneName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HostedZoneBuilder_route53_zoneName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HostedZoneBuilder_route53_zoneName_java_lang_String__feature",
						"_UI_HostedZoneBuilder_route53_type"),
				AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComment_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HostedZoneBuilder_route53_comment_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HostedZoneBuilder_route53_comment_java_lang_String__feature",
						"_UI_HostedZoneBuilder_route53_type"),
				AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Query Logs Log Group Arn java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueryLogsLogGroupArn_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HostedZoneBuilder_route53_queryLogsLogGroupArn_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HostedZoneBuilder_route53_queryLogsLogGroupArn_java_lang_String__feature",
						"_UI_HostedZoneBuilder_route53_type"),
				AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vpcs software amazon awscdk services ec2 IVpc As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcs_software_amazon_awscdk_services_ec2_IVpc_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HostedZoneBuilder_route53_vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_HostedZoneBuilder_route53_vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList_feature",
						"_UI_HostedZoneBuilder_route53_type"),
				AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_HostedZoneBuilder_route53_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HostedZoneBuilder_route53_generatedClassName_feature",
								"_UI_HostedZoneBuilder_route53_type"),
						AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_HostedZoneBuilder_route53_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HostedZoneBuilder_route53_varName_feature",
								"_UI_HostedZoneBuilder_route53_type"),
						AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME, true, false, false,
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
				getString("_UI_HostedZoneBuilder_route53_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HostedZoneBuilder_route53_identifier_feature",
						"_UI_HostedZoneBuilder_route53_type"),
				AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER, true, false, false,
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
				getString("_UI_HostedZoneBuilder_route53_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HostedZoneBuilder_route53_additionalCode_feature",
						"_UI_HostedZoneBuilder_route53_type"),
				AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns HostedZoneBuilder_route53.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HostedZoneBuilder_route53"));
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
		return  "HostedZone " + ((HostedZoneBuilder_route53) object).getVarName();
		
				
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

		switch (notification.getFeatureID(HostedZoneBuilder_route53.class)) {
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST:
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME:
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER:
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE:
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
