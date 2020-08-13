/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToS3Builder_kinesisfirehoses3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.KinesisFirehoseToS3Builder_kinesisfirehoses3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KinesisFirehoseToS3Builder_kinesisfirehoses3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinesisFirehoseToS3Builder_kinesisfirehoses3ItemProvider(AdapterFactory adapterFactory) {
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
			addExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReferencePropertyDescriptor(
					object);
			addKinesisFirehoseProps_java_lang_Object_PropertyDescriptor(object);
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
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference_feature",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type"),
				AwsworkbenchPackage.Literals.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE,
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
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference_feature",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type"),
				AwsworkbenchPackage.Literals.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Kinesis Firehose Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKinesisFirehoseProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_kinesisFirehoseProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_kinesisFirehoseProps_java_lang_Object__feature",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type"),
				AwsworkbenchPackage.Literals.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__KINESIS_FIREHOSE_PROPS_JAVA_LANG_OBJECT_,
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
				getString("_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_generatedClassName_feature",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type"),
				AwsworkbenchPackage.Literals.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__GENERATED_CLASS_NAME,
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
				getString("_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_varName_feature",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type"),
				AwsworkbenchPackage.Literals.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__VAR_NAME, true, false,
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
				getString("_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_identifier_feature",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type"),
				AwsworkbenchPackage.Literals.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__IDENTIFIER, true, false,
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
				getString("_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_additionalCode_feature",
						"_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type"),
				AwsworkbenchPackage.Literals.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__ADDITIONAL_CODE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns KinesisFirehoseToS3Builder_kinesisfirehoses3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/KinesisFirehoseToS3Builder_kinesisfirehoses3"));
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
		String label = ((KinesisFirehoseToS3Builder_kinesisfirehoses3) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type")
				: getString("_UI_KinesisFirehoseToS3Builder_kinesisfirehoses3_type") + " " + label;
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

		switch (notification.getFeatureID(KinesisFirehoseToS3Builder_kinesisfirehoses3.class)) {
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__KINESIS_FIREHOSE_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__VAR_NAME:
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__IDENTIFIER:
		case AwsworkbenchPackage.KINESIS_FIREHOSE_TO_S3_BUILDER_KINESISFIREHOSES3__ADDITIONAL_CODE:
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
