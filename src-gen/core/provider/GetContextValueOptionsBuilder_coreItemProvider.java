/**
 */
package core.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import core.CorePackage;
import core.GetContextValueOptionsBuilder_core;

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
 * This is the item provider adapter for a {@link core.GetContextValueOptionsBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GetContextValueOptionsBuilder_coreItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetContextValueOptionsBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addDummyValue_java_lang_Object_PropertyDescriptor(object);
			addProvider_java_lang_String_PropertyDescriptor(object);
			addProps_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dummy Value java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDummyValue_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GetContextValueOptionsBuilder_core_dummyValue_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GetContextValueOptionsBuilder_core_dummyValue_java_lang_Object__feature",
						"_UI_GetContextValueOptionsBuilder_core_type"),
				CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Provider java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvider_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GetContextValueOptionsBuilder_core_provider_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GetContextValueOptionsBuilder_core_provider_java_lang_String__feature",
						"_UI_GetContextValueOptionsBuilder_core_type"),
				CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Props java lang String java lang Object As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProps_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_GetContextValueOptionsBuilder_core_props_java_lang_String__java_lang_Object_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GetContextValueOptionsBuilder_core_props_java_lang_String__java_lang_Object_AsMap_feature",
						"_UI_GetContextValueOptionsBuilder_core_type"),
				CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
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
				getString("_UI_GetContextValueOptionsBuilder_core_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GetContextValueOptionsBuilder_core_generatedClassName_feature",
						"_UI_GetContextValueOptionsBuilder_core_type"),
				CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_GetContextValueOptionsBuilder_core_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_GetContextValueOptionsBuilder_core_varName_feature",
								"_UI_GetContextValueOptionsBuilder_core_type"),
						CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_GetContextValueOptionsBuilder_core_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_GetContextValueOptionsBuilder_core_identifier_feature",
								"_UI_GetContextValueOptionsBuilder_core_type"),
						CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER, true, false, false,
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
				getString("_UI_GetContextValueOptionsBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_GetContextValueOptionsBuilder_core_additionalCode_feature",
						"_UI_GetContextValueOptionsBuilder_core_type"),
				CorePackage.Literals.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns GetContextValueOptionsBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GetContextValueOptionsBuilder_core"));
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
		String label = ((GetContextValueOptionsBuilder_core) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_GetContextValueOptionsBuilder_core_type")
				: getString("_UI_GetContextValueOptionsBuilder_core_type") + " " + label;
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

		switch (notification.getFeatureID(GetContextValueOptionsBuilder_core.class)) {
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_:
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_:
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME:
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER:
		case CorePackage.GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
