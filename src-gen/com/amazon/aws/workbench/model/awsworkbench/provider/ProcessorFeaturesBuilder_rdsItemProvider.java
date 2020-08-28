/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ProcessorFeaturesBuilder_rds;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ProcessorFeaturesBuilder_rds} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorFeaturesBuilder_rdsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorFeaturesBuilder_rdsItemProvider(AdapterFactory adapterFactory) {
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

			addCoreCount_java_lang_Number_PropertyDescriptor(object);
			addThreadsPerCore_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Core Count java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoreCount_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ProcessorFeaturesBuilder_rds_coreCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ProcessorFeaturesBuilder_rds_coreCount_java_lang_Number__feature",
						"_UI_ProcessorFeaturesBuilder_rds_type"),
				AwsworkbenchPackage.Literals.PROCESSOR_FEATURES_BUILDER_RDS__CORE_COUNT_JAVA_LANG_NUMBER_, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Threads Per Core java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadsPerCore_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ProcessorFeaturesBuilder_rds_threadsPerCore_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ProcessorFeaturesBuilder_rds_threadsPerCore_java_lang_Number__feature",
						"_UI_ProcessorFeaturesBuilder_rds_type"),
				AwsworkbenchPackage.Literals.PROCESSOR_FEATURES_BUILDER_RDS__THREADS_PER_CORE_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_ProcessorFeaturesBuilder_rds_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ProcessorFeaturesBuilder_rds_generatedClassName_feature",
								"_UI_ProcessorFeaturesBuilder_rds_type"),
						AwsworkbenchPackage.Literals.PROCESSOR_FEATURES_BUILDER_RDS__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_ProcessorFeaturesBuilder_rds_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ProcessorFeaturesBuilder_rds_varName_feature",
						"_UI_ProcessorFeaturesBuilder_rds_type"),
				AwsworkbenchPackage.Literals.PROCESSOR_FEATURES_BUILDER_RDS__VAR_NAME, true, false, false,
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
				getString("_UI_ProcessorFeaturesBuilder_rds_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ProcessorFeaturesBuilder_rds_identifier_feature",
						"_UI_ProcessorFeaturesBuilder_rds_type"),
				AwsworkbenchPackage.Literals.PROCESSOR_FEATURES_BUILDER_RDS__IDENTIFIER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProcessorFeaturesBuilder_rds_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ProcessorFeaturesBuilder_rds_additionalCode_feature",
								"_UI_ProcessorFeaturesBuilder_rds_type"),
						AwsworkbenchPackage.Literals.PROCESSOR_FEATURES_BUILDER_RDS__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ProcessorFeaturesBuilder_rds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessorFeaturesBuilder_rds"));
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
		return  "ProcessorFeatures " + ((ProcessorFeaturesBuilder_rds) object).getVarName();
		
				
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

		switch (notification.getFeatureID(ProcessorFeaturesBuilder_rds.class)) {
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__CORE_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__THREADS_PER_CORE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__VAR_NAME:
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__IDENTIFIER:
		case AwsworkbenchPackage.PROCESSOR_FEATURES_BUILDER_RDS__ADDITIONAL_CODE:
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
