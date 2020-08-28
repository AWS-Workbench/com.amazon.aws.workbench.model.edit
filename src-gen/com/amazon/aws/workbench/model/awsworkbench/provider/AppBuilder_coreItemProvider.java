/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppBuilder_coreItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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

			addAutoSynth_java_lang_Boolean_PropertyDescriptor(object);
			addContext_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addOutdir_java_lang_String_PropertyDescriptor(object);
			addRuntimeInfo_java_lang_Boolean_PropertyDescriptor(object);
			addStackTraces_java_lang_Boolean_PropertyDescriptor(object);
			addTreeMetadata_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
			addProjectNamePropertyDescriptor(object);
			addPackageNamePropertyDescriptor(object);
			addMainClassNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Synth java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoSynth_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AppBuilder_core_autoSynth_java_lang_Boolean__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AppBuilder_core_autoSynth_java_lang_Boolean__feature", "_UI_AppBuilder_core_type"),
						AwsworkbenchPackage.Literals.APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Context java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContext_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppBuilder_core_context_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppBuilder_core_context_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Outdir java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutdir_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AppBuilder_core_outdir_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AppBuilder_core_outdir_java_lang_String__feature", "_UI_AppBuilder_core_type"),
						AwsworkbenchPackage.Literals.APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Runtime Info java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuntimeInfo_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppBuilder_core_runtimeInfo_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppBuilder_core_runtimeInfo_java_lang_Boolean__feature", "_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stack Traces java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStackTraces_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppBuilder_core_stackTraces_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppBuilder_core_stackTraces_java_lang_Boolean__feature", "_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tree Metadata java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTreeMetadata_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppBuilder_core_treeMetadata_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AppBuilder_core_treeMetadata_java_lang_Boolean__feature", "_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_, true, false, false,
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
						getResourceLocator(), getString("_UI_AppBuilder_core_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AppBuilder_core_generatedClassName_feature", "_UI_AppBuilder_core_type"),
						AwsworkbenchPackage.Literals.APP_BUILDER_CORE__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_AppBuilder_core_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AppBuilder_core_varName_feature",
								"_UI_AppBuilder_core_type"),
						AwsworkbenchPackage.Literals.APP_BUILDER_CORE__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_AppBuilder_core_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AppBuilder_core_identifier_feature",
								"_UI_AppBuilder_core_type"),
						AwsworkbenchPackage.Literals.APP_BUILDER_CORE__IDENTIFIER, true, false, false,
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
				getString("_UI_AppBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AppBuilder_core_additionalCode_feature",
						"_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Project Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppBuilder_core_projectName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AppBuilder_core_projectName_feature",
						"_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__PROJECT_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppBuilder_core_packageName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AppBuilder_core_packageName_feature",
						"_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__PACKAGE_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Main Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppBuilder_core_mainClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AppBuilder_core_mainClassName_feature",
						"_UI_AppBuilder_core_type"),
				AwsworkbenchPackage.Literals.APP_BUILDER_CORE__MAIN_CLASS_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AwsworkbenchPackage.Literals.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE);
			childrenFeatures.add(AwsworkbenchPackage.Literals.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE);
			childrenFeatures.add(AwsworkbenchPackage.Literals.APP_BUILDER_CORE__STACKBUILDER_CORE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AppBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AppBuilder_core"));
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
		return "App " + ((AppBuilder_core) object).getVarName();

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

		switch (notification.getFeatureID(AppBuilder_core.class)) {
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.APP_BUILDER_CORE__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.APP_BUILDER_CORE__VAR_NAME:
		case AwsworkbenchPackage.APP_BUILDER_CORE__IDENTIFIER:
		case AwsworkbenchPackage.APP_BUILDER_CORE__ADDITIONAL_CODE:
		case AwsworkbenchPackage.APP_BUILDER_CORE__PROJECT_NAME:
		case AwsworkbenchPackage.APP_BUILDER_CORE__PACKAGE_NAME:
		case AwsworkbenchPackage.APP_BUILDER_CORE__MAIN_CLASS_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE:
		case AwsworkbenchPackage.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE:
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors
				.add(createChildParameter(AwsworkbenchPackage.Literals.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE,
						AwsworkbenchFactory.eINSTANCE.createEnvironmentBuilder_core()));

		newChildDescriptors.add(
				createChildParameter(AwsworkbenchPackage.Literals.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE,
						AwsworkbenchFactory.eINSTANCE.createDefaultStackSynthesizerBuilder_core()));

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.APP_BUILDER_CORE__STACKBUILDER_CORE,
				AwsworkbenchFactory.eINSTANCE.createStackBuilder_core()));
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
