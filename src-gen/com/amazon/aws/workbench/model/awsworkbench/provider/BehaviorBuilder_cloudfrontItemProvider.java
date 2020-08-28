/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.BehaviorBuilder_cloudfront} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorBuilder_cloudfrontItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorBuilder_cloudfrontItemProvider(AdapterFactory adapterFactory) {
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

			addAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_PropertyDescriptor(
					object);
			addCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_PropertyDescriptor(
					object);
			addCompress_java_lang_Boolean_PropertyDescriptor(object);
			addDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReferencePropertyDescriptor(
					object);
			addIsDefaultBehavior_java_lang_Boolean_PropertyDescriptor(object);
			addLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsListPropertyDescriptor(
					object);
			addMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addPathPattern_java_lang_String_PropertyDescriptor(object);
			addTrustedSigners_java_lang_String_AsListPropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allowed Methods software amazon awscdk services cloudfront Cloud Front Allowed Methods  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BehaviorBuilder_cloudfront_allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_allowedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedMethods__feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cached Methods software amazon awscdk services cloudfront Cloud Front Allowed Cached Methods  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BehaviorBuilder_cloudfront_cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_cachedMethods_software_amazon_awscdk_services_cloudfront_CloudFrontAllowedCachedMethods__feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Compress java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompress_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BehaviorBuilder_cloudfront_compress_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_compress_java_lang_Boolean__feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__COMPRESS_JAVA_LANG_BOOLEAN_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Ttl With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BehaviorBuilder_cloudfront_defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_defaultTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Forwarded Values With Forwarded Values Property software amazon awscdk services cloudfront Cfn Distribution Forwarded Values Property As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BehaviorBuilder_cloudfront_forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_forwardedValuesWithForwardedValuesProperty_software_amazon_awscdk_services_cloudfront_CfnDistribution_ForwardedValuesProperty_AsReference_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Default Behavior java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDefaultBehavior_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BehaviorBuilder_cloudfront_isDefaultBehavior_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_isDefaultBehavior_java_lang_Boolean__feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Function Associations software amazon awscdk services cloudfront Lambda Function Association As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BehaviorBuilder_cloudfront_lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_lambdaFunctionAssociations_software_amazon_awscdk_services_cloudfront_LambdaFunctionAssociation_AsList_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Ttl With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BehaviorBuilder_cloudfront_maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_maxTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Ttl With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinTtlWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_BehaviorBuilder_cloudfront_minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_minTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Path Pattern java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPattern_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BehaviorBuilder_cloudfront_pathPattern_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_pathPattern_java_lang_String__feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__PATH_PATTERN_JAVA_LANG_STRING_, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Trusted Signers java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrustedSigners_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BehaviorBuilder_cloudfront_trustedSigners_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_BehaviorBuilder_cloudfront_trustedSigners_java_lang_String_AsList_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_BehaviorBuilder_cloudfront_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BehaviorBuilder_cloudfront_generatedClassName_feature",
								"_UI_BehaviorBuilder_cloudfront_type"),
						AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME, false, false,
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
				getString("_UI_BehaviorBuilder_cloudfront_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BehaviorBuilder_cloudfront_varName_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__VAR_NAME, true, false, false,
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
				getString("_UI_BehaviorBuilder_cloudfront_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BehaviorBuilder_cloudfront_identifier_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__IDENTIFIER, true, false, false,
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
				getString("_UI_BehaviorBuilder_cloudfront_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BehaviorBuilder_cloudfront_additionalCode_feature",
						"_UI_BehaviorBuilder_cloudfront_type"),
				AwsworkbenchPackage.Literals.BEHAVIOR_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns BehaviorBuilder_cloudfront.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviorBuilder_cloudfront"));
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
		return "Behavior " + ((BehaviorBuilder_cloudfront) object).getVarName();

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

		switch (notification.getFeatureID(BehaviorBuilder_cloudfront.class)) {
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_METHODS_:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__CACHED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CLOUD_FRONT_ALLOWED_CACHED_METHODS_:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__COMPRESS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__DEFAULT_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__FORWARDED_VALUES_WITH_FORWARDED_VALUES_PROPERTY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_CFN_DISTRIBUTION_FORWARDED_VALUES_PROPERTY_AS_REFERENCE:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IS_DEFAULT_BEHAVIOR_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_ASSOCIATIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_FUNCTION_ASSOCIATION_AS_LIST:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MAX_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__MIN_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__PATH_PATTERN_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__TRUSTED_SIGNERS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__VAR_NAME:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__IDENTIFIER:
		case AwsworkbenchPackage.BEHAVIOR_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
