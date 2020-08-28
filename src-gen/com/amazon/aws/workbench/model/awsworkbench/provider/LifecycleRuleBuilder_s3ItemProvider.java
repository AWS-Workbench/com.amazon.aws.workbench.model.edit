/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LifecycleRuleBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleRuleBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addEnabled_java_lang_Boolean_PropertyDescriptor(object);
			addExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addExpirationDateWithInstant_java_time_Instant_AsReferencePropertyDescriptor(object);
			addId_java_lang_String_PropertyDescriptor(object);
			addNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
					object);
			addNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsListPropertyDescriptor(
					object);
			addPrefix_java_lang_String_PropertyDescriptor(object);
			addTagFilters_java_lang_String__java_lang_Object_AsMapPropertyDescriptor(object);
			addTransitions_software_amazon_awscdk_services_s3_Transition_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LifecycleRuleBuilder_s3_abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enabled java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabled_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LifecycleRuleBuilder_s3_enabled_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_enabled_java_lang_Boolean__feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__ENABLED_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expiration With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LifecycleRuleBuilder_s3_expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expiration Date With Instant java time Instant As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpirationDateWithInstant_java_time_Instant_AsReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LifecycleRuleBuilder_s3_expirationDateWithInstant_java_time_Instant_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_expirationDateWithInstant_java_time_Instant_AsReference_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_LifecycleRuleBuilder_s3_id_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_id_java_lang_String__feature", "_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LifecycleRuleBuilder_s3_noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LifecycleRuleBuilder_s3_noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_LifecycleRuleBuilder_s3_prefix_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LifecycleRuleBuilder_s3_prefix_java_lang_String__feature",
								"_UI_LifecycleRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__PREFIX_JAVA_LANG_STRING_, true, false,
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
				getString("_UI_LifecycleRuleBuilder_s3_tagFilters_java_lang_String__java_lang_Object_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_tagFilters_java_lang_String__java_lang_Object_AsMap_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Transitions software amazon awscdk services s3 Transition As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitions_software_amazon_awscdk_services_s3_Transition_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LifecycleRuleBuilder_s3_transitions_software_amazon_awscdk_services_s3_Transition_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_transitions_software_amazon_awscdk_services_s3_Transition_AsList_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST,
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
				getString("_UI_LifecycleRuleBuilder_s3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LifecycleRuleBuilder_s3_generatedClassName_feature", "_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_LifecycleRuleBuilder_s3_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LifecycleRuleBuilder_s3_varName_feature",
								"_UI_LifecycleRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_LifecycleRuleBuilder_s3_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LifecycleRuleBuilder_s3_identifier_feature", "_UI_LifecycleRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__IDENTIFIER, true, false, false,
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
				getString("_UI_LifecycleRuleBuilder_s3_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LifecycleRuleBuilder_s3_additionalCode_feature",
						"_UI_LifecycleRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LifecycleRuleBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LifecycleRuleBuilder_s3"));
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
		return "LifecycleRule " + ((LifecycleRuleBuilder_s3) object).getVarName();

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

		switch (notification.getFeatureID(LifecycleRuleBuilder_s3.class)) {
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ENABLED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
