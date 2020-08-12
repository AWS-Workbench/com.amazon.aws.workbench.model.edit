/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.BlockDeviceBuilder_autoscaling} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockDeviceBuilder_autoscalingItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockDeviceBuilder_autoscalingItemProvider(AdapterFactory adapterFactory) {
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

			addDeviceName_java_lang_String_PropertyDescriptor(object);
			addVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReferencePropertyDescriptor(
					object);
			addMappingEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Device Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeviceName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BlockDeviceBuilder_autoscaling_deviceName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockDeviceBuilder_autoscaling_deviceName_java_lang_String__feature",
						"_UI_BlockDeviceBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.BLOCK_DEVICE_BUILDER_AUTOSCALING__DEVICE_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Volume With Block Device Volume software amazon awscdk services autoscaling Block Device Volume As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BlockDeviceBuilder_autoscaling_volumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockDeviceBuilder_autoscaling_volumeWithBlockDeviceVolume_software_amazon_awscdk_services_autoscaling_BlockDeviceVolume_AsReference_feature",
						"_UI_BlockDeviceBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.BLOCK_DEVICE_BUILDER_AUTOSCALING__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_VOLUME_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mapping Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappingEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BlockDeviceBuilder_autoscaling_mappingEnabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockDeviceBuilder_autoscaling_mappingEnabled_java_lang_Boolean__feature",
						"_UI_BlockDeviceBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.BLOCK_DEVICE_BUILDER_AUTOSCALING__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_BlockDeviceBuilder_autoscaling_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BlockDeviceBuilder_autoscaling_generatedClassName_feature",
						"_UI_BlockDeviceBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.BLOCK_DEVICE_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_BlockDeviceBuilder_autoscaling_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BlockDeviceBuilder_autoscaling_varName_feature",
						"_UI_BlockDeviceBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.BLOCK_DEVICE_BUILDER_AUTOSCALING__VAR_NAME, true, false, false,
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
				getString("_UI_BlockDeviceBuilder_autoscaling_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BlockDeviceBuilder_autoscaling_identifier_feature",
						"_UI_BlockDeviceBuilder_autoscaling_type"),
				AwsworkbenchPackage.Literals.BLOCK_DEVICE_BUILDER_AUTOSCALING__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_BlockDeviceBuilder_autoscaling_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BlockDeviceBuilder_autoscaling_additionalCode_feature",
								"_UI_BlockDeviceBuilder_autoscaling_type"),
						AwsworkbenchPackage.Literals.BLOCK_DEVICE_BUILDER_AUTOSCALING__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BlockDeviceBuilder_autoscaling.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BlockDeviceBuilder_autoscaling"));
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
		String label = ((BlockDeviceBuilder_autoscaling) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_BlockDeviceBuilder_autoscaling_type")
				: getString("_UI_BlockDeviceBuilder_autoscaling_type") + " " + label;
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

		switch (notification.getFeatureID(BlockDeviceBuilder_autoscaling.class)) {
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING__DEVICE_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_AUTOSCALING_BLOCK_DEVICE_VOLUME_AS_REFERENCE:
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING__VAR_NAME:
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING__IDENTIFIER:
		case AwsworkbenchPackage.BLOCK_DEVICE_BUILDER_AUTOSCALING__ADDITIONAL_CODE:
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
