/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingIntervalBuilder_applicationautoscalingItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingIntervalBuilder_applicationautoscalingItemProvider(AdapterFactory adapterFactory) {
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

			addChange_java_lang_Number_PropertyDescriptor(object);
			addLower_java_lang_Number_PropertyDescriptor(object);
			addUpper_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Change java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChange_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ScalingIntervalBuilder_applicationautoscaling_change_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_change_java_lang_Number__feature",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_type"),
				AwsworkbenchPackage.Literals.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__CHANGE_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lower java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLower_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ScalingIntervalBuilder_applicationautoscaling_lower_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_lower_java_lang_Number__feature",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_type"),
				AwsworkbenchPackage.Literals.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__LOWER_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Upper java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpper_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ScalingIntervalBuilder_applicationautoscaling_upper_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_upper_java_lang_Number__feature",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_type"),
				AwsworkbenchPackage.Literals.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__UPPER_JAVA_LANG_NUMBER_,
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
				getString("_UI_ScalingIntervalBuilder_applicationautoscaling_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_generatedClassName_feature",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_type"),
				AwsworkbenchPackage.Literals.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__GENERATED_CLASS_NAME,
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
				getString("_UI_ScalingIntervalBuilder_applicationautoscaling_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_varName_feature",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_type"),
				AwsworkbenchPackage.Literals.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__VAR_NAME, true, false,
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
				getString("_UI_ScalingIntervalBuilder_applicationautoscaling_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_identifier_feature",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_type"),
				AwsworkbenchPackage.Literals.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__IDENTIFIER, true, false,
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
				getString("_UI_ScalingIntervalBuilder_applicationautoscaling_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_additionalCode_feature",
						"_UI_ScalingIntervalBuilder_applicationautoscaling_type"),
				AwsworkbenchPackage.Literals.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ScalingIntervalBuilder_applicationautoscaling.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ScalingIntervalBuilder_applicationautoscaling"));
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
		return "ScalingInterval " + ((ScalingIntervalBuilder_applicationautoscaling) object).getVarName();

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

		switch (notification.getFeatureID(ScalingIntervalBuilder_applicationautoscaling.class)) {
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__CHANGE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__LOWER_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__UPPER_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__VAR_NAME:
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__IDENTIFIER:
		case AwsworkbenchPackage.SCALING_INTERVAL_BUILDER_APPLICATIONAUTOSCALING__ADDITIONAL_CODE:
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
