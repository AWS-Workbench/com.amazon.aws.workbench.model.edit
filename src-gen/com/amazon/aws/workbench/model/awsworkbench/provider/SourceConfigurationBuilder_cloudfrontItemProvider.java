/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SourceConfigurationBuilder_cloudfront;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SourceConfigurationBuilder_cloudfront} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceConfigurationBuilder_cloudfrontItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceConfigurationBuilder_cloudfrontItemProvider(AdapterFactory adapterFactory) {
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

			addBehaviors_software_amazon_awscdk_services_cloudfront_Behavior_AsListPropertyDescriptor(object);
			addCustomOriginSourceWithCustomOriginConfig_software_amazon_awscdk_services_cloudfront_CustomOriginConfig_AsReferencePropertyDescriptor(
					object);
			addOriginHeaders_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addOriginPath_java_lang_String_PropertyDescriptor(object);
			addS3OriginSourceWithS3OriginConfig_software_amazon_awscdk_services_cloudfront_S3OriginConfig_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Behaviors software amazon awscdk services cloudfront Behavior As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviors_software_amazon_awscdk_services_cloudfront_Behavior_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SourceConfigurationBuilder_cloudfront_behaviors_software_amazon_awscdk_services_cloudfront_Behavior_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SourceConfigurationBuilder_cloudfront_behaviors_software_amazon_awscdk_services_cloudfront_Behavior_AsList_feature",
						"_UI_SourceConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__BEHAVIORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_BEHAVIOR_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custom Origin Source With Custom Origin Config software amazon awscdk services cloudfront Custom Origin Config As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomOriginSourceWithCustomOriginConfig_software_amazon_awscdk_services_cloudfront_CustomOriginConfig_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SourceConfigurationBuilder_cloudfront_customOriginSourceWithCustomOriginConfig_software_amazon_awscdk_services_cloudfront_CustomOriginConfig_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SourceConfigurationBuilder_cloudfront_customOriginSourceWithCustomOriginConfig_software_amazon_awscdk_services_cloudfront_CustomOriginConfig_AsReference_feature",
						"_UI_SourceConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__CUSTOM_ORIGIN_SOURCE_WITH_CUSTOM_ORIGIN_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CUSTOM_ORIGIN_CONFIG_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Origin Headers java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginHeaders_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SourceConfigurationBuilder_cloudfront_originHeaders_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SourceConfigurationBuilder_cloudfront_originHeaders_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_SourceConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__ORIGIN_HEADERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Origin Path java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginPath_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SourceConfigurationBuilder_cloudfront_originPath_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SourceConfigurationBuilder_cloudfront_originPath_java_lang_String__feature",
						"_UI_SourceConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__ORIGIN_PATH_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the S3 Origin Source With S3 Origin Config software amazon awscdk services cloudfront S3 Origin Config As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addS3OriginSourceWithS3OriginConfig_software_amazon_awscdk_services_cloudfront_S3OriginConfig_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_SourceConfigurationBuilder_cloudfront_s3OriginSourceWithS3OriginConfig_software_amazon_awscdk_services_cloudfront_S3OriginConfig_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SourceConfigurationBuilder_cloudfront_s3OriginSourceWithS3OriginConfig_software_amazon_awscdk_services_cloudfront_S3OriginConfig_AsReference_feature",
						"_UI_SourceConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__S3_ORIGIN_SOURCE_WITH_S3_ORIGIN_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_S3_ORIGIN_CONFIG_AS_REFERENCE,
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
				getString("_UI_SourceConfigurationBuilder_cloudfront_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SourceConfigurationBuilder_cloudfront_generatedClassName_feature",
						"_UI_SourceConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_SourceConfigurationBuilder_cloudfront_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SourceConfigurationBuilder_cloudfront_varName_feature",
								"_UI_SourceConfigurationBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_SourceConfigurationBuilder_cloudfront_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SourceConfigurationBuilder_cloudfront_identifier_feature",
								"_UI_SourceConfigurationBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER, true, false,
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
				getString("_UI_SourceConfigurationBuilder_cloudfront_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SourceConfigurationBuilder_cloudfront_additionalCode_feature",
						"_UI_SourceConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SourceConfigurationBuilder_cloudfront.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SourceConfigurationBuilder_cloudfront"));
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
		String label = ((SourceConfigurationBuilder_cloudfront) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_SourceConfigurationBuilder_cloudfront_type")
				: getString("_UI_SourceConfigurationBuilder_cloudfront_type") + " " + label;
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

		switch (notification.getFeatureID(SourceConfigurationBuilder_cloudfront.class)) {
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__BEHAVIORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_BEHAVIOR_AS_LIST:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__CUSTOM_ORIGIN_SOURCE_WITH_CUSTOM_ORIGIN_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CUSTOM_ORIGIN_CONFIG_AS_REFERENCE:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__ORIGIN_HEADERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__ORIGIN_PATH_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__S3_ORIGIN_SOURCE_WITH_S3_ORIGIN_CONFIG_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_S3_ORIGIN_CONFIG_AS_REFERENCE:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER:
		case AwsworkbenchPackage.SOURCE_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
