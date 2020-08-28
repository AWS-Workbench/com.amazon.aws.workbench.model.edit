/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CorsRuleBuilder_s3ItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorsRuleBuilder_s3ItemProvider(AdapterFactory adapterFactory) {
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

			addAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsListPropertyDescriptor(object);
			addAllowedOrigins_java_lang_String_AsListPropertyDescriptor(object);
			addAllowedHeaders_java_lang_String_AsListPropertyDescriptor(object);
			addExposedHeaders_java_lang_String_AsListPropertyDescriptor(object);
			addId_java_lang_String_PropertyDescriptor(object);
			addMaxAge_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allowed Methods software amazon awscdk services s3 Http Methods As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsListPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CorsRuleBuilder_s3_allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsRuleBuilder_s3_allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList_feature",
						"_UI_CorsRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allowed Origins java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedOrigins_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsRuleBuilder_s3_allowedOrigins_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsRuleBuilder_s3_allowedOrigins_java_lang_String_AsList_feature",
						"_UI_CorsRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allowed Headers java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedHeaders_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsRuleBuilder_s3_allowedHeaders_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsRuleBuilder_s3_allowedHeaders_java_lang_String_AsList_feature",
						"_UI_CorsRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exposed Headers java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExposedHeaders_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsRuleBuilder_s3_exposedHeaders_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsRuleBuilder_s3_exposedHeaders_java_lang_String_AsList_feature",
						"_UI_CorsRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addId_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CorsRuleBuilder_s3_id_java_lang_String__feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CorsRuleBuilder_s3_id_java_lang_String__feature", "_UI_CorsRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Age java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAge_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsRuleBuilder_s3_maxAge_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsRuleBuilder_s3_maxAge_java_lang_Number__feature", "_UI_CorsRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__MAX_AGE_JAVA_LANG_NUMBER_, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_CorsRuleBuilder_s3_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CorsRuleBuilder_s3_generatedClassName_feature", "_UI_CorsRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__GENERATED_CLASS_NAME, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CorsRuleBuilder_s3_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CorsRuleBuilder_s3_varName_feature",
						"_UI_CorsRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__VAR_NAME, true, false, false,
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
				getString("_UI_CorsRuleBuilder_s3_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CorsRuleBuilder_s3_identifier_feature",
						"_UI_CorsRuleBuilder_s3_type"),
				AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_CorsRuleBuilder_s3_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CorsRuleBuilder_s3_additionalCode_feature",
								"_UI_CorsRuleBuilder_s3_type"),
						AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3__ADDITIONAL_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CorsRuleBuilder_s3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CorsRuleBuilder_s3"));
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
		return "CorsRule " + ((CorsRuleBuilder_s3) object).getVarName();

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

		switch (notification.getFeatureID(CorsRuleBuilder_s3.class)) {
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__MAX_AGE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__VAR_NAME:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__IDENTIFIER:
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
