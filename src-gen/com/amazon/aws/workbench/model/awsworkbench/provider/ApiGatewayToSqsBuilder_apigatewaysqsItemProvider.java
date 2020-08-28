/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.ApiGatewayToSqsBuilder_apigatewaysqs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiGatewayToSqsBuilder_apigatewaysqsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiGatewayToSqsBuilder_apigatewaysqsItemProvider(AdapterFactory adapterFactory) {
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

			addAllowCreateOperation_java_lang_Boolean_PropertyDescriptor(object);
			addAllowDeleteOperation_java_lang_Boolean_PropertyDescriptor(object);
			addAllowReadOperation_java_lang_Boolean_PropertyDescriptor(object);
			addApiGatewayProps_java_lang_Object_PropertyDescriptor(object);
			addCreateRequestTemplate_java_lang_String_PropertyDescriptor(object);
			addDeployDeadLetterQueue_java_lang_Boolean_PropertyDescriptor(object);
			addMaxReceiveCount_java_lang_Number_PropertyDescriptor(object);
			addQueueProps_java_lang_Object_PropertyDescriptor(object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allow Create Operation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowCreateOperation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_allowCreateOperation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_allowCreateOperation_java_lang_Boolean__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Delete Operation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowDeleteOperation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_allowDeleteOperation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_allowDeleteOperation_java_lang_Boolean__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Read Operation java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowReadOperation_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_allowReadOperation_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_allowReadOperation_java_lang_Boolean__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Api Gateway Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiGatewayProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_apiGatewayProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_apiGatewayProps_java_lang_Object__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Create Request Template java lang String  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateRequestTemplate_java_lang_String_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_createRequestTemplate_java_lang_String__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_createRequestTemplate_java_lang_String__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deploy Dead Letter Queue java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployDeadLetterQueue_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_deployDeadLetterQueue_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_deployDeadLetterQueue_java_lang_Boolean__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Receive Count java lang Number  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxReceiveCount_java_lang_Number_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_maxReceiveCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_maxReceiveCount_java_lang_Number__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_,
				true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Queue Props java lang Object  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueProps_java_lang_Object_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_queueProps_java_lang_Object__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_queueProps_java_lang_Object__feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_,
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
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_generatedClassName_feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__GENERATED_CLASS_NAME, false,
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
						getResourceLocator(), getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_varName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_varName_feature",
								"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
						AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME, true, false,
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
						getResourceLocator(), getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_identifier_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_identifier_feature",
								"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
						AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER, true, false,
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
				getString("_UI_ApiGatewayToSqsBuilder_apigatewaysqs_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_additionalCode_feature",
						"_UI_ApiGatewayToSqsBuilder_apigatewaysqs_type"),
				AwsworkbenchPackage.Literals.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ApiGatewayToSqsBuilder_apigatewaysqs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApiGatewayToSqsBuilder_apigatewaysqs"));
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
		return "ApiGatewayToSqs " + ((ApiGatewayToSqsBuilder_apigatewaysqs) object).getVarName();

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

		switch (notification.getFeatureID(ApiGatewayToSqsBuilder_apigatewaysqs.class)) {
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_CREATE_OPERATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_DELETE_OPERATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ALLOW_READ_OPERATION_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__API_GATEWAY_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__CREATE_REQUEST_TEMPLATE_JAVA_LANG_STRING_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__QUEUE_PROPS_JAVA_LANG_OBJECT_:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__VAR_NAME:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__IDENTIFIER:
		case AwsworkbenchPackage.API_GATEWAY_TO_SQS_BUILDER_APIGATEWAYSQS__ADDITIONAL_CODE:
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
