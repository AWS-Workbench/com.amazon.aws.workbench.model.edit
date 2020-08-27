/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BucketMetricsBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketMetricsBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addId_java_lang_String_PropertyDescriptor(object);
			addPrefix_java_lang_String_PropertyDescriptor(object);
			addTagFilters_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketMetricsBuilder_s3_id_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketMetricsBuilder_s3_id_java_lang_String__feature", "_UI_BucketMetricsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3__ID_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prefix java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefix_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BucketMetricsBuilder_s3_prefix_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BucketMetricsBuilder_s3_prefix_java_lang_String__feature",
								"_UI_BucketMetricsBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3__PREFIX_JAVA_LANG_STRING_, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tag Filters java lang String java lang Object As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagFilters_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketMetricsBuilder_s3_tagFilters_java_lang_String__java_lang_Object_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketMetricsBuilder_s3_tagFilters_java_lang_String__java_lang_Object_AsMap_feature",
						"_UI_BucketMetricsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
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
				getString("_UI_BucketMetricsBuilder_s3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketMetricsBuilder_s3_generatedClassName_feature", "_UI_BucketMetricsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3__GENERATED_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_BucketMetricsBuilder_s3_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BucketMetricsBuilder_s3_varName_feature",
								"_UI_BucketMetricsBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3__VAR_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_BucketMetricsBuilder_s3_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BucketMetricsBuilder_s3_identifier_feature", "_UI_BucketMetricsBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3__IDENTIFIER, true, false, false,
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
				getString("_UI_BucketMetricsBuilder_s3_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BucketMetricsBuilder_s3_additionalCode_feature",
						"_UI_BucketMetricsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BucketMetricsBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BucketMetricsBuilder_s3"));
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
		return  "BucketMetrics " + ((BucketMetricsBuilder_s3) object).getVarName();
		
				
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

		switch (notification.getFeatureID(BucketMetricsBuilder_s3.class)) {
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ADDITIONAL_CODE:
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
