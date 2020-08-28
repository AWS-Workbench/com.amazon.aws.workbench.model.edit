/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BucketPropsBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.BucketPropsBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BucketPropsBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketPropsBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_PropertyDescriptor(object);
			addBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReferencePropertyDescriptor(
					object);
			addBucketName_java_lang_String_PropertyDescriptor(object);
			addCors_software_amazon_awscdk_services_s3_CorsRule_AsListPropertyDescriptor(object);
			addEncryption_software_amazon_awscdk_services_s3_BucketEncryption_PropertyDescriptor(object);
			addEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(object);
			addLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsListPropertyDescriptor(object);
			addMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsListPropertyDescriptor(object);
			addPublicReadAccess_java_lang_Boolean_PropertyDescriptor(object);
			addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(object);
			addServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReferencePropertyDescriptor(
					object);
			addServerAccessLogsPrefix_java_lang_String_PropertyDescriptor(object);
			addVersioned_java_lang_Boolean_PropertyDescriptor(object);
			addWebsiteErrorDocument_java_lang_String_PropertyDescriptor(object);
			addWebsiteIndexDocument_java_lang_String_PropertyDescriptor(object);
			addWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReferencePropertyDescriptor(
					object);
			addWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access Control software amazon awscdk services s3 Bucket Access Control  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_accessControl_software_amazon_awscdk_services_s3_BucketAccessControl__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_accessControl_software_amazon_awscdk_services_s3_BucketAccessControl__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_blockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bucket Name java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketName_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_bucketName_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_bucketName_java_lang_String__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__BUCKET_NAME_JAVA_LANG_STRING_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cors software amazon awscdk services s3 Cors Rule As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCors_software_amazon_awscdk_services_s3_CorsRule_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_cors_software_amazon_awscdk_services_s3_CorsRule_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_cors_software_amazon_awscdk_services_s3_CorsRule_AsList_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption software amazon awscdk services s3 Bucket Encryption  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryption_software_amazon_awscdk_services_s3_BucketEncryption_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_encryption_software_amazon_awscdk_services_s3_BucketEncryption__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_encryption_software_amazon_awscdk_services_s3_BucketEncryption__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encryption Key With IKey software amazon awscdk services kms IKey As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_encryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_lifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Metrics software amazon awscdk services s3 Bucket Metrics As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Public Read Access java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicReadAccess_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_publicReadAccess_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_publicReadAccess_java_lang_Boolean__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Removal Policy software amazon awscdk core Removal Policy  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_removalPolicy_software_amazon_awscdk_core_RemovalPolicy__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_serverAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server Access Logs Prefix java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerAccessLogsPrefix_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_serverAccessLogsPrefix_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_serverAccessLogsPrefix_java_lang_String__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Versioned java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersioned_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_versioned_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_versioned_java_lang_Boolean__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__VERSIONED_JAVA_LANG_BOOLEAN_, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Website Error Document java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebsiteErrorDocument_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_websiteErrorDocument_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_websiteErrorDocument_java_lang_String__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Website Index Document java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebsiteIndexDocument_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BucketPropsBuilder_s3_websiteIndexDocument_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_websiteIndexDocument_java_lang_String__feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_websiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Website Routing Rules software amazon awscdk services s3 Routing Rule As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BucketPropsBuilder_s3_websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BucketPropsBuilder_s3_websiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST,
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
				getString("_UI_BucketPropsBuilder_s3_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BucketPropsBuilder_s3_generatedClassName_feature",
						"_UI_BucketPropsBuilder_s3_type"),
				AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__GENERATED_CLASS_NAME, false, false, false,
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
						getResourceLocator(), getString("_UI_BucketPropsBuilder_s3_varName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BucketPropsBuilder_s3_varName_feature",
								"_UI_BucketPropsBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__VAR_NAME, true, false, false,
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
						getResourceLocator(), getString("_UI_BucketPropsBuilder_s3_identifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BucketPropsBuilder_s3_identifier_feature",
								"_UI_BucketPropsBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_BucketPropsBuilder_s3_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BucketPropsBuilder_s3_additionalCode_feature", "_UI_BucketPropsBuilder_s3_type"),
						AwsworkbenchPackage.Literals.BUCKET_PROPS_BUILDER_S3__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BucketPropsBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BucketPropsBuilder_s3"));
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
		return "BucketProps " + ((BucketPropsBuilder_s3) object).getVarName();

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

		switch (notification.getFeatureID(BucketPropsBuilder_s3.class)) {
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__ACCESS_CONTROL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ACCESS_CONTROL_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__BLOCK_PUBLIC_ACCESS_WITH_BLOCK_PUBLIC_ACCESS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BLOCK_PUBLIC_ACCESS_AS_REFERENCE:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__BUCKET_NAME_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__CORS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_CORS_RULE_AS_LIST:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__ENCRYPTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_ENCRYPTION_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__ENCRYPTION_KEY_WITH_IKEY_SOFTWARE_AMAZON_AWSCDK_SERVICES_KMS_IKEY_AS_REFERENCE:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__LIFECYCLE_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_LIFECYCLE_RULE_AS_LIST:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__METRICS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_METRICS_AS_LIST:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__PUBLIC_READ_ACCESS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__SERVER_ACCESS_LOGS_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__SERVER_ACCESS_LOGS_PREFIX_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__VERSIONED_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__WEBSITE_ERROR_DOCUMENT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__WEBSITE_INDEX_DOCUMENT_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__WEBSITE_REDIRECT_WITH_REDIRECT_TARGET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_TARGET_AS_REFERENCE:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__WEBSITE_ROUTING_RULES_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_ROUTING_RULE_AS_LIST:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.BUCKET_PROPS_BUILDER_S3__ADDITIONAL_CODE:
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
