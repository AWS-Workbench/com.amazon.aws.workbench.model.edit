/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerPropsBuilder_patterns;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ApplicationLoadBalancerPropsBuilder_patterns} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationLoadBalancerPropsBuilder_patternsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLoadBalancerPropsBuilder_patternsItemProvider(AdapterFactory adapterFactory) {
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

			addListeners_software_amazon_awscdk_services_ecs_patterns_ApplicationListenerProps_AsListPropertyDescriptor(
					object);
			addName_java_lang_String_PropertyDescriptor(object);
			addDomainName_java_lang_String_PropertyDescriptor(object);
			addDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReferencePropertyDescriptor(
					object);
			addPublicLoadBalancer_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Listeners software amazon awscdk services ecs patterns Application Listener Props As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListeners_software_amazon_awscdk_services_ecs_patterns_ApplicationListenerProps_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_listeners_software_amazon_awscdk_services_ecs_patterns_ApplicationListenerProps_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_listeners_software_amazon_awscdk_services_ecs_patterns_ApplicationListenerProps_AsList_feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__LISTENERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LISTENER_PROPS_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_ApplicationLoadBalancerPropsBuilder_patterns_name_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_name_java_lang_String__feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Domain Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApplicationLoadBalancerPropsBuilder_patterns_domainName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_domainName_java_lang_String__feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__DOMAIN_NAME_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Domain Zone With IHosted Zone software amazon awscdk services route53 IHosted Zone As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_domainZoneWithIHostedZone_software_amazon_awscdk_services_route53_IHostedZone_AsReference_feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Public Load Balancer java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicLoadBalancer_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_publicLoadBalancer_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_publicLoadBalancer_java_lang_Boolean__feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN_,
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
				getString("_UI_ApplicationLoadBalancerPropsBuilder_patterns_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_generatedClassName_feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME,
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
				getString("_UI_ApplicationLoadBalancerPropsBuilder_patterns_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_varName_feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__VAR_NAME, true, false,
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
				getString("_UI_ApplicationLoadBalancerPropsBuilder_patterns_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_identifier_feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__IDENTIFIER, true, false,
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
				getString("_UI_ApplicationLoadBalancerPropsBuilder_patterns_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_additionalCode_feature",
						"_UI_ApplicationLoadBalancerPropsBuilder_patterns_type"),
				AwsworkbenchPackage.Literals.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ApplicationLoadBalancerPropsBuilder_patterns.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ApplicationLoadBalancerPropsBuilder_patterns"));
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
		return  "ApplicationLoadBalancerProps " + ((ApplicationLoadBalancerPropsBuilder_patterns) object).getVarName();
		
				
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

		switch (notification.getFeatureID(ApplicationLoadBalancerPropsBuilder_patterns.class)) {
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__LISTENERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_PATTERNS_APPLICATION_LISTENER_PROPS_AS_LIST:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__DOMAIN_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__DOMAIN_ZONE_WITH_IHOSTED_ZONE_SOFTWARE_AMAZON_AWSCDK_SERVICES_ROUTE53_IHOSTED_ZONE_AS_REFERENCE:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__PUBLIC_LOAD_BALANCER_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__VAR_NAME:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__IDENTIFIER:
		case AwsworkbenchPackage.APPLICATION_LOAD_BALANCER_PROPS_BUILDER_PATTERNS__ADDITIONAL_CODE:
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
