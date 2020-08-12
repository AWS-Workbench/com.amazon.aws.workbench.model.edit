/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AppMeshProxyConfigurationPropsBuilder_ecs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppMeshProxyConfigurationPropsBuilder_ecsItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppMeshProxyConfigurationPropsBuilder_ecsItemProvider(AdapterFactory adapterFactory) {
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

			addAppPorts_java_lang_Number_AsListPropertyDescriptor(object);
			addProxyEgressPort_java_lang_Number_PropertyDescriptor(object);
			addProxyIngressPort_java_lang_Number_PropertyDescriptor(object);
			addEgressIgnoredIPs_java_lang_String_AsListPropertyDescriptor(object);
			addEgressIgnoredPorts_java_lang_Number_AsListPropertyDescriptor(object);
			addIgnoredGid_java_lang_Number_PropertyDescriptor(object);
			addIgnoredUid_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the App Ports java lang Number As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppPorts_java_lang_Number_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_appPorts_java_lang_Number_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_appPorts_java_lang_Number_AsList_feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__APP_PORTS_JAVA_LANG_NUMBER_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Proxy Egress Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProxyEgressPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_proxyEgressPort_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_proxyEgressPort_java_lang_Number__feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_EGRESS_PORT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Proxy Ingress Port java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProxyIngressPort_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_proxyIngressPort_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_proxyIngressPort_java_lang_Number__feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_INGRESS_PORT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Egress Ignored IPs java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEgressIgnoredIPs_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_egressIgnoredIPs_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_egressIgnoredIPs_java_lang_String_AsList_feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Egress Ignored Ports java lang Number As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEgressIgnoredPorts_java_lang_Number_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_egressIgnoredPorts_java_lang_Number_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_egressIgnoredPorts_java_lang_Number_AsList_feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignored Gid java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoredGid_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_ignoredGid_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_ignoredGid_java_lang_Number__feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_GID_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignored Uid java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoredUid_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_ignoredUid_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_ignoredUid_java_lang_Number__feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_UID_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_generatedClassName_feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__GENERATED_CLASS_NAME,
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
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_varName_feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__VAR_NAME, true, false,
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
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_identifier_feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IDENTIFIER, true, false,
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
				getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_additionalCode_feature",
						"_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type"),
				AwsworkbenchPackage.Literals.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AppMeshProxyConfigurationPropsBuilder_ecs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/AppMeshProxyConfigurationPropsBuilder_ecs"));
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
		String label = ((AppMeshProxyConfigurationPropsBuilder_ecs) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type")
				: getString("_UI_AppMeshProxyConfigurationPropsBuilder_ecs_type") + " " + label;
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

		switch (notification.getFeatureID(AppMeshProxyConfigurationPropsBuilder_ecs.class)) {
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__APP_PORTS_JAVA_LANG_NUMBER_AS_LIST:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_EGRESS_PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__PROXY_INGRESS_PORT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_IPS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__EGRESS_IGNORED_PORTS_JAVA_LANG_NUMBER_AS_LIST:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_GID_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IGNORED_UID_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__VAR_NAME:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__IDENTIFIER:
		case AwsworkbenchPackage.APP_MESH_PROXY_CONFIGURATION_PROPS_BUILDER_ECS__ADDITIONAL_CODE:
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
