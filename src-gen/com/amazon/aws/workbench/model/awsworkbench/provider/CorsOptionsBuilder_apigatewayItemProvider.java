/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.CorsOptionsBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CorsOptionsBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorsOptionsBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addAllowOrigins_java_lang_String_AsListPropertyDescriptor(object);
			addAllowCredentials_java_lang_Boolean_PropertyDescriptor(object);
			addAllowHeaders_java_lang_String_AsListPropertyDescriptor(object);
			addAllowMethods_java_lang_String_AsListPropertyDescriptor(object);
			addDisableCache_java_lang_Boolean_PropertyDescriptor(object);
			addExposeHeaders_java_lang_String_AsListPropertyDescriptor(object);
			addMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(object);
			addStatusCode_java_lang_Number_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allow Origins java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowOrigins_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsOptionsBuilder_apigateway_allowOrigins_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_allowOrigins_java_lang_String_AsList_feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Credentials java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowCredentials_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsOptionsBuilder_apigateway_allowCredentials_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_allowCredentials_java_lang_Boolean__feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Headers java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowHeaders_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsOptionsBuilder_apigateway_allowHeaders_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_allowHeaders_java_lang_String_AsList_feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Methods java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowMethods_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsOptionsBuilder_apigateway_allowMethods_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_allowMethods_java_lang_String_AsList_feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Disable Cache java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisableCache_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsOptionsBuilder_apigateway_disableCache_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_disableCache_java_lang_Boolean__feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expose Headers java lang String As List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExposeHeaders_java_lang_String_AsListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsOptionsBuilder_apigateway_exposeHeaders_java_lang_String_AsList_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_exposeHeaders_java_lang_String_AsList_feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Age With Duration software amazon awscdk core Duration As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_CorsOptionsBuilder_apigateway_maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_maxAgeWithDuration_software_amazon_awscdk_core_Duration_AsReference_feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Status Code java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusCode_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CorsOptionsBuilder_apigateway_statusCode_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CorsOptionsBuilder_apigateway_statusCode_java_lang_Number__feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_CorsOptionsBuilder_apigateway_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CorsOptionsBuilder_apigateway_generatedClassName_feature",
								"_UI_CorsOptionsBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CorsOptionsBuilder_apigateway_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CorsOptionsBuilder_apigateway_varName_feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME, true, false, false,
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
				getString("_UI_CorsOptionsBuilder_apigateway_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CorsOptionsBuilder_apigateway_identifier_feature",
						"_UI_CorsOptionsBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_CorsOptionsBuilder_apigateway_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CorsOptionsBuilder_apigateway_additionalCode_feature",
								"_UI_CorsOptionsBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CorsOptionsBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CorsOptionsBuilder_apigateway"));
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
		String label = ((CorsOptionsBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_CorsOptionsBuilder_apigateway_type")
				: getString("_UI_CorsOptionsBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(CorsOptionsBuilder_apigateway.class)) {
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_ORIGINS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_CREDENTIALS_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_HEADERS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ALLOW_METHODS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__DISABLE_CACHE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__EXPOSE_HEADERS_JAVA_LANG_STRING_AS_LIST:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__MAX_AGE_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.CORS_OPTIONS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
