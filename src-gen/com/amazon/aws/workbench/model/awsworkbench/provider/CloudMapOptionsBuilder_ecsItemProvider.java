/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudMapOptionsBuilder_ecsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudMapOptionsBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReferencePropertyDescriptor(
					object);
			addDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_PropertyDescriptor(object);
			addDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addFailureThreshold_java_lang_Number_PropertyDescriptor(object);
			addName_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudMapOptionsBuilder_ecs_cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudMapOptionsBuilder_ecs_cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference_feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dns Record Type software amazon awscdk services servicediscovery Dns Record Type  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudMapOptionsBuilder_ecs_dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudMapOptionsBuilder_ecs_dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType__feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dns Ttl With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudMapOptionsBuilder_ecs_dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudMapOptionsBuilder_ecs_dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Failure Threshold java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailureThreshold_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CloudMapOptionsBuilder_ecs_failureThreshold_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudMapOptionsBuilder_ecs_failureThreshold_java_lang_Number__feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__FAILURE_THRESHOLD_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_CloudMapOptionsBuilder_ecs_name_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudMapOptionsBuilder_ecs_name_java_lang_String__feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_, true, false, false,
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
						getResourceLocator(), getString("_UI_CloudMapOptionsBuilder_ecs_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CloudMapOptionsBuilder_ecs_generatedClassName_feature",
								"_UI_CloudMapOptionsBuilder_ecs_type"),
						AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_CloudMapOptionsBuilder_ecs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CloudMapOptionsBuilder_ecs_varName_feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__VAR_NAME, true, false, false,
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
				getString("_UI_CloudMapOptionsBuilder_ecs_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CloudMapOptionsBuilder_ecs_identifier_feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__IDENTIFIER, true, false, false,
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
				getString("_UI_CloudMapOptionsBuilder_ecs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CloudMapOptionsBuilder_ecs_additionalCode_feature",
						"_UI_CloudMapOptionsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CloudMapOptionsBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CloudMapOptionsBuilder_ecs"));
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
		String label = ((CloudMapOptionsBuilder_ecs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_CloudMapOptionsBuilder_ecs_type")
				: getString("_UI_CloudMapOptionsBuilder_ecs_type") + " " + label;
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

		switch (notification.getFeatureID(CloudMapOptionsBuilder_ecs.class)) {
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE_:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__FAILURE_THRESHOLD_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
