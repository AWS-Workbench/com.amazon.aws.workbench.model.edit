/**
 */
package core.provider;

import com.amazon.aws.workbench.model.awsworkbench.provider.AwsworkbenchEditPlugin;

import core.CorePackage;
import core.ResolveOptionsBuilder_core;

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
 * This is the item provider adapter for a {@link core.ResolveOptionsBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolveOptionsBuilder_coreItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveOptionsBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReferencePropertyDescriptor(
					object);
			addScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReferencePropertyDescriptor(object);
			addPreparing_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ResolveOptionsBuilder_core_resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResolveOptionsBuilder_core_resolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference_feature",
						"_UI_ResolveOptionsBuilder_core_type"),
				CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scope With IConstruct software amazon awscdk core IConstruct As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ResolveOptionsBuilder_core_scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResolveOptionsBuilder_core_scopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference_feature",
						"_UI_ResolveOptionsBuilder_core_type"),
				CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Preparing java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreparing_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResolveOptionsBuilder_core_preparing_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ResolveOptionsBuilder_core_preparing_java_lang_Boolean__feature",
						"_UI_ResolveOptionsBuilder_core_type"),
				CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_, true, false, false,
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
						getResourceLocator(), getString("_UI_ResolveOptionsBuilder_core_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResolveOptionsBuilder_core_generatedClassName_feature",
								"_UI_ResolveOptionsBuilder_core_type"),
						CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_ResolveOptionsBuilder_core_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResolveOptionsBuilder_core_varName_feature",
						"_UI_ResolveOptionsBuilder_core_type"),
				CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME, true, false, false,
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
				getString("_UI_ResolveOptionsBuilder_core_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResolveOptionsBuilder_core_identifier_feature",
						"_UI_ResolveOptionsBuilder_core_type"),
				CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER, true, false, false,
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
				getString("_UI_ResolveOptionsBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResolveOptionsBuilder_core_additionalCode_feature",
						"_UI_ResolveOptionsBuilder_core_type"),
				CorePackage.Literals.RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ResolveOptionsBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResolveOptionsBuilder_core"));
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
		String label = ((ResolveOptionsBuilder_core) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_ResolveOptionsBuilder_core_type")
				: getString("_UI_ResolveOptionsBuilder_core_type") + " " + label;
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

		switch (notification.getFeatureID(ResolveOptionsBuilder_core.class)) {
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE:
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE:
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_:
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME:
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME:
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER:
		case CorePackage.RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE:
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
