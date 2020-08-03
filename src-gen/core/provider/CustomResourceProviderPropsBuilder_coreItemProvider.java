/**
 */
package core.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import core.CorePackage;
import core.CustomResourceProviderPropsBuilder_core;

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
 * This is the item provider adapter for a {@link core.CustomResourceProviderPropsBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomResourceProviderPropsBuilder_coreItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomResourceProviderPropsBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addCodeDirectory_java_lang_String_PropertyDescriptor(object);
			addRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_PropertyDescriptor(object);
			addMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReferencePropertyDescriptor(object);
			addPolicyStatements_java_lang_Object_AsListPropertyDescriptor(object);
			addTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Code Directory java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodeDirectory_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomResourceProviderPropsBuilder_core_codeDirectory_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_codeDirectory_java_lang_String__feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Runtime software amazon awscdk core Custom Resource Provider Runtime  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomResourceProviderPropsBuilder_core_runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime__feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Memory Size With Size software amazon awscdk core Size As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomResourceProviderPropsBuilder_core_memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_memorySizeWithSize_software_amazon_awscdk_core_Size_AsReference_feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Policy Statements java lang Object As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicyStatements_java_lang_Object_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomResourceProviderPropsBuilder_core_policyStatements_java_lang_Object_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_policyStatements_java_lang_Object_AsList_feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CustomResourceProviderPropsBuilder_core_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_timeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_CustomResourceProviderPropsBuilder_core_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_generatedClassName_feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME, false, false,
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
						getResourceLocator(), getString("_UI_CustomResourceProviderPropsBuilder_core_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CustomResourceProviderPropsBuilder_core_varName_feature",
								"_UI_CustomResourceProviderPropsBuilder_core_type"),
						CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME, true, false, false,
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
				getString("_UI_CustomResourceProviderPropsBuilder_core_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_identifier_feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER, true, false, false,
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
				getString("_UI_CustomResourceProviderPropsBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CustomResourceProviderPropsBuilder_core_additionalCode_feature",
						"_UI_CustomResourceProviderPropsBuilder_core_type"),
				CorePackage.Literals.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CustomResourceProviderPropsBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/CustomResourceProviderPropsBuilder_core"));
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
		String label = ((CustomResourceProviderPropsBuilder_core) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_CustomResourceProviderPropsBuilder_core_type")
				: getString("_UI_CustomResourceProviderPropsBuilder_core_type") + " " + label;
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

		switch (notification.getFeatureID(CustomResourceProviderPropsBuilder_core.class)) {
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER:
		case CorePackage.CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
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
