/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LayerVersionBuilder_lambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.LayerVersionBuilder_lambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerVersionBuilder_lambdaItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerVersionBuilder_lambdaItemProvider(AdapterFactory adapterFactory) {
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

			addCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReferencePropertyDescriptor(object);
			addCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsListPropertyDescriptor(object);
			addDescription_java_lang_String_PropertyDescriptor(object);
			addLayerVersionName_java_lang_String_PropertyDescriptor(object);
			addLicense_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Code With Code software amazon awscdk services lambda Code As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodeWithCode_software_amazon_awscdk_services_lambda_Code_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LayerVersionBuilder_lambda_codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LayerVersionBuilder_lambda_codeWithCode_software_amazon_awscdk_services_lambda_Code_AsReference_feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Compatible Runtimes software amazon awscdk services lambda Runtime As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LayerVersionBuilder_lambda_compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LayerVersionBuilder_lambda_compatibleRuntimes_software_amazon_awscdk_services_lambda_Runtime_AsList_feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_LayerVersionBuilder_lambda_description_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LayerVersionBuilder_lambda_description_java_lang_String__feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Layer Version Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayerVersionName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LayerVersionBuilder_lambda_layerVersionName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LayerVersionBuilder_lambda_layerVersionName_java_lang_String__feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the License java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicense_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LayerVersionBuilder_lambda_license_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LayerVersionBuilder_lambda_license_java_lang_String__feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_, true, false,
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
						getResourceLocator(), getString("_UI_LayerVersionBuilder_lambda_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LayerVersionBuilder_lambda_generatedClassName_feature",
								"_UI_LayerVersionBuilder_lambda_type"),
						AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_LayerVersionBuilder_lambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LayerVersionBuilder_lambda_varName_feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME, true, false, false,
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
				getString("_UI_LayerVersionBuilder_lambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LayerVersionBuilder_lambda_identifier_feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER, true, false, false,
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
				getString("_UI_LayerVersionBuilder_lambda_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LayerVersionBuilder_lambda_additionalCode_feature",
						"_UI_LayerVersionBuilder_lambda_type"),
				AwsworkbenchPackage.Literals.LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LayerVersionBuilder_lambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayerVersionBuilder_lambda"));
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
		String label = ((LayerVersionBuilder_lambda) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_LayerVersionBuilder_lambda_type")
				: getString("_UI_LayerVersionBuilder_lambda_type") + " " + label;
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

		switch (notification.getFeatureID(LayerVersionBuilder_lambda.class)) {
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__CODE_WITH_CODE_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_CODE_AS_REFERENCE:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__COMPATIBLE_RUNTIMES_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_RUNTIME_AS_LIST:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__DESCRIPTION_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LAYER_VERSION_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__LICENSE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__VAR_NAME:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.LAYER_VERSION_BUILDER_LAMBDA__ADDITIONAL_CODE:
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
