/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchFactory;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StackBuilder_coreItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackBuilder_coreItemProvider(AdapterFactory adapterFactory) {
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
			addEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReferencePropertyDescriptor(object);
			addStackName_java_lang_String_PropertyDescriptor(object);
			addSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReferencePropertyDescriptor(
					object);
			addTags_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addTerminationProtection_java_lang_Boolean_PropertyDescriptor(object);
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
				getString("_UI_StackBuilder_core_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_description_java_lang_String__feature", "_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Env With Environment software amazon awscdk core Environment As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StackBuilder_core_envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_envWithEnvironment_software_amazon_awscdk_core_Environment_AsReference_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stack Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStackName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StackBuilder_core_stackName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_stackName_java_lang_String__feature", "_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_StackBuilder_core_synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_synthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tags java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTags_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StackBuilder_core_tags_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_tags_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Termination Protection java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminationProtection_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StackBuilder_core_terminationProtection_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_StackBuilder_core_terminationProtection_java_lang_Boolean__feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_, true, false,
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
						getResourceLocator(), getString("_UI_StackBuilder_core_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_StackBuilder_core_generatedClassName_feature", "_UI_StackBuilder_core_type"),
						AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__GENERATED_CLASS_NAME, false, false, false,
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
				getString("_UI_StackBuilder_core_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StackBuilder_core_varName_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__VAR_NAME, true, false, false,
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
				getString("_UI_StackBuilder_core_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StackBuilder_core_identifier_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__IDENTIFIER, true, false, false,
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
				getString("_UI_StackBuilder_core_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StackBuilder_core_additionalCode_feature",
						"_UI_StackBuilder_core_type"),
				AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__ADDITIONAL_CODE, true, false, false,
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
			childrenFeatures.add(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__STACKBLOCKS);
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
	 * This returns StackBuilder_core.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StackBuilder_core"));
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
		return  "Stack " + ((StackBuilder_core) object).getVarName();
		
				
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

		switch (notification.getFeatureID(StackBuilder_core.class)) {
		case AwsworkbenchPackage.STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__VAR_NAME:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__IDENTIFIER:
		case AwsworkbenchPackage.STACK_BUILDER_CORE__ADDITIONAL_CODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwsworkbenchPackage.STACK_BUILDER_CORE__STACKBLOCKS:
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

		newChildDescriptors.add(createChildParameter(AwsworkbenchPackage.Literals.STACK_BUILDER_CORE__STACKBLOCKS,
				AwsworkbenchFactory.eINSTANCE.createBlock()));
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
