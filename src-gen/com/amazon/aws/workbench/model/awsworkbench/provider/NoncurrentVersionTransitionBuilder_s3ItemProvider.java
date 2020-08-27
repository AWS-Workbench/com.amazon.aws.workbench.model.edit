/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.NoncurrentVersionTransitionBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.NoncurrentVersionTransitionBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NoncurrentVersionTransitionBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoncurrentVersionTransitionBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReferencePropertyDescriptor(
					object);
			addTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Storage Class With Storage Class software amazon awscdk services s3 Storage Class As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NoncurrentVersionTransitionBuilder_s3_storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NoncurrentVersionTransitionBuilder_s3_storageClassWithStorageClass_software_amazon_awscdk_services_s3_StorageClass_AsReference_feature",
						"_UI_NoncurrentVersionTransitionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Transition After With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_NoncurrentVersionTransitionBuilder_s3_transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NoncurrentVersionTransitionBuilder_s3_transitionAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_NoncurrentVersionTransitionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
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
				getString("_UI_NoncurrentVersionTransitionBuilder_s3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NoncurrentVersionTransitionBuilder_s3_generatedClassName_feature",
						"_UI_NoncurrentVersionTransitionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__GENERATED_CLASS_NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_NoncurrentVersionTransitionBuilder_s3_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_NoncurrentVersionTransitionBuilder_s3_varName_feature",
								"_UI_NoncurrentVersionTransitionBuilder_s3_type"),
						AwsworkbenchPackage.Literals.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__VAR_NAME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_NoncurrentVersionTransitionBuilder_s3_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_NoncurrentVersionTransitionBuilder_s3_identifier_feature",
								"_UI_NoncurrentVersionTransitionBuilder_s3_type"),
						AwsworkbenchPackage.Literals.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__IDENTIFIER, true, false,
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
				getString("_UI_NoncurrentVersionTransitionBuilder_s3_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_NoncurrentVersionTransitionBuilder_s3_additionalCode_feature",
						"_UI_NoncurrentVersionTransitionBuilder_s3_type"),
				AwsworkbenchPackage.Literals.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns NoncurrentVersionTransitionBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NoncurrentVersionTransitionBuilder_s3"));
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
		return  "NoncurrentVersionTransition " + ((NoncurrentVersionTransitionBuilder_s3) object).getVarName();
		
				
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

		switch (notification.getFeatureID(NoncurrentVersionTransitionBuilder_s3.class)) {
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__STORAGE_CLASS_WITH_STORAGE_CLASS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_STORAGE_CLASS_AS_REFERENCE:
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__TRANSITION_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.NONCURRENT_VERSION_TRANSITION_BUILDER_S3__ADDITIONAL_CODE:
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
