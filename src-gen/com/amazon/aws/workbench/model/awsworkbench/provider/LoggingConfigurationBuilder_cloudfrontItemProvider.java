/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront;

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
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.LoggingConfigurationBuilder_cloudfront} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoggingConfigurationBuilder_cloudfrontItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfigurationBuilder_cloudfrontItemProvider(AdapterFactory adapterFactory) {
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

			addBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReferencePropertyDescriptor(object);
			addIncludeCookies_java_lang_Boolean_PropertyDescriptor(object);
			addPrefix_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bucket With IBucket software amazon awscdk services s3 IBucket As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LoggingConfigurationBuilder_cloudfront_bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LoggingConfigurationBuilder_cloudfront_bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference_feature",
						"_UI_LoggingConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Include Cookies java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeCookies_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LoggingConfigurationBuilder_cloudfront_includeCookies_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LoggingConfigurationBuilder_cloudfront_includeCookies_java_lang_Boolean__feature",
						"_UI_LoggingConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__INCLUDE_COOKIES_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prefix java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefix_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LoggingConfigurationBuilder_cloudfront_prefix_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LoggingConfigurationBuilder_cloudfront_prefix_java_lang_String__feature",
						"_UI_LoggingConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__PREFIX_JAVA_LANG_STRING_, true,
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
				getString("_UI_LoggingConfigurationBuilder_cloudfront_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LoggingConfigurationBuilder_cloudfront_generatedClassName_feature",
						"_UI_LoggingConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_LoggingConfigurationBuilder_cloudfront_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LoggingConfigurationBuilder_cloudfront_varName_feature",
								"_UI_LoggingConfigurationBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME, true, false,
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
				getString("_UI_LoggingConfigurationBuilder_cloudfront_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LoggingConfigurationBuilder_cloudfront_identifier_feature",
						"_UI_LoggingConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER, true, false, false,
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
				getString("_UI_LoggingConfigurationBuilder_cloudfront_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LoggingConfigurationBuilder_cloudfront_additionalCode_feature",
						"_UI_LoggingConfigurationBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LoggingConfigurationBuilder_cloudfront.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LoggingConfigurationBuilder_cloudfront"));
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
		String label = ((LoggingConfigurationBuilder_cloudfront) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_LoggingConfigurationBuilder_cloudfront_type")
				: getString("_UI_LoggingConfigurationBuilder_cloudfront_type") + " " + label;
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

		switch (notification.getFeatureID(LoggingConfigurationBuilder_cloudfront.class)) {
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__INCLUDE_COOKIES_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__PREFIX_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__VAR_NAME:
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__IDENTIFIER:
		case AwsworkbenchPackage.LOGGING_CONFIGURATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
