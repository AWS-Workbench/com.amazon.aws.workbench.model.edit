/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.IntegrationResponseBuilder_apigateway} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationResponseBuilder_apigatewayItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationResponseBuilder_apigatewayItemProvider(AdapterFactory adapterFactory) {
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

			addStatusCode_java_lang_String_PropertyDescriptor(object);
			addContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_PropertyDescriptor(object);
			addResponseParameters_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addResponseTemplates_java_lang_String__java_lang_String_AsMapPropertyDescriptor(object);
			addSelectionPattern_java_lang_String_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status Code java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusCode_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IntegrationResponseBuilder_apigateway_statusCode_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationResponseBuilder_apigateway_statusCode_java_lang_String__feature",
						"_UI_IntegrationResponseBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Content Handling software amazon awscdk services apigateway Content Handling  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentHandling_software_amazon_awscdk_services_apigateway_ContentHandling_PropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationResponseBuilder_apigateway_contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationResponseBuilder_apigateway_contentHandling_software_amazon_awscdk_services_apigateway_ContentHandling__feature",
						"_UI_IntegrationResponseBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Response Parameters java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseParameters_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationResponseBuilder_apigateway_responseParameters_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationResponseBuilder_apigateway_responseParameters_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_IntegrationResponseBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Response Templates java lang String java lang String As Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseTemplates_java_lang_String__java_lang_String_AsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_IntegrationResponseBuilder_apigateway_responseTemplates_java_lang_String__java_lang_String_AsMap_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationResponseBuilder_apigateway_responseTemplates_java_lang_String__java_lang_String_AsMap_feature",
						"_UI_IntegrationResponseBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Selection Pattern java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionPattern_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IntegrationResponseBuilder_apigateway_selectionPattern_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationResponseBuilder_apigateway_selectionPattern_java_lang_String__feature",
						"_UI_IntegrationResponseBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__SELECTION_PATTERN_JAVA_LANG_STRING_,
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
				getString("_UI_IntegrationResponseBuilder_apigateway_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationResponseBuilder_apigateway_generatedClassName_feature",
						"_UI_IntegrationResponseBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_IntegrationResponseBuilder_apigateway_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IntegrationResponseBuilder_apigateway_varName_feature",
								"_UI_IntegrationResponseBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_IntegrationResponseBuilder_apigateway_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IntegrationResponseBuilder_apigateway_identifier_feature",
								"_UI_IntegrationResponseBuilder_apigateway_type"),
						AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER, true, false,
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
				getString("_UI_IntegrationResponseBuilder_apigateway_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IntegrationResponseBuilder_apigateway_additionalCode_feature",
						"_UI_IntegrationResponseBuilder_apigateway_type"),
				AwsworkbenchPackage.Literals.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns IntegrationResponseBuilder_apigateway.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IntegrationResponseBuilder_apigateway"));
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
		String label = ((IntegrationResponseBuilder_apigateway) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_IntegrationResponseBuilder_apigateway_type")
				: getString("_UI_IntegrationResponseBuilder_apigateway_type") + " " + label;
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

		switch (notification.getFeatureID(IntegrationResponseBuilder_apigateway.class)) {
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__STATUS_CODE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__CONTENT_HANDLING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_CONTENT_HANDLING_:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__RESPONSE_TEMPLATES_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__SELECTION_PATTERN_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__VAR_NAME:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__IDENTIFIER:
		case AwsworkbenchPackage.INTEGRATION_RESPONSE_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
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
