/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontToS3Builder_cloudfronts3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CloudFrontToS3Builder_cloudfronts3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudFrontToS3Builder_cloudfronts3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFrontToS3Builder_cloudfronts3ItemProvider(AdapterFactory adapterFactory) {
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

			addBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReferencePropertyDescriptor(
					object);
			addCloudFrontDistributionProps_java_lang_Object_PropertyDescriptor(object);
			addExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReferencePropertyDescriptor(
					object);
			addInsertHttpSecurityHeaders_java_lang_Boolean_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontToS3Builder_cloudfronts3_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToS3Builder_cloudfronts3_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature",
						"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cloud Front Distribution Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudFrontDistributionProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontToS3Builder_cloudfronts3_cloudFrontDistributionProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToS3Builder_cloudfronts3_cloudFrontDistributionProps_java_lang_Object__feature",
						"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontToS3Builder_cloudfronts3_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToS3Builder_cloudfronts3_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature",
						"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Insert Http Security Headers java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertHttpSecurityHeaders_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CloudFrontToS3Builder_cloudfronts3_insertHttpSecurityHeaders_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToS3Builder_cloudfronts3_insertHttpSecurityHeaders_java_lang_Boolean__feature",
						"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_,
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
				getString("_UI_CloudFrontToS3Builder_cloudfronts3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToS3Builder_cloudfronts3_generatedClassName_feature",
						"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__GENERATED_CLASS_NAME, false, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_CloudFrontToS3Builder_cloudfronts3_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CloudFrontToS3Builder_cloudfronts3_varName_feature",
								"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
						AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_CloudFrontToS3Builder_cloudfronts3_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CloudFrontToS3Builder_cloudfronts3_identifier_feature",
								"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
						AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER, true, false,
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
				getString("_UI_CloudFrontToS3Builder_cloudfronts3_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CloudFrontToS3Builder_cloudfronts3_additionalCode_feature",
						"_UI_CloudFrontToS3Builder_cloudfronts3_type"),
				AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CloudFrontToS3Builder_cloudfronts3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CloudFrontToS3Builder_cloudfronts3"));
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
		String label = ((CloudFrontToS3Builder_cloudfronts3) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_CloudFrontToS3Builder_cloudfronts3_type")
				: getString("_UI_CloudFrontToS3Builder_cloudfronts3_type") + " " + label;
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

		switch (notification.getFeatureID(CloudFrontToS3Builder_cloudfronts3.class)) {
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER:
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE:
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
