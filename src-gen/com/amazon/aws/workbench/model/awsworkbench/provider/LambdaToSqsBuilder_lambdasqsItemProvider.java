/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToSqsBuilder_lambdasqs;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.LambdaToSqsBuilder_lambdasqs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LambdaToSqsBuilder_lambdasqsItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaToSqsBuilder_lambdasqsItemProvider(AdapterFactory adapterFactory) {
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

			addDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReferencePropertyDescriptor(
					object);
			addDeployDeadLetterQueue_java_lang_Boolean_PropertyDescriptor(object);
			addEnableQueuePurging_java_lang_Boolean_PropertyDescriptor(object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReferencePropertyDescriptor(
					object);
			addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
					object);
			addMaxReceiveCount_java_lang_Number_PropertyDescriptor(object);
			addQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dead Letter Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaToSqsBuilder_lambdasqs_deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE,
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
				getString("_UI_LambdaToSqsBuilder_lambdasqs_deployDeadLetterQueue_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_deployDeadLetterQueue_java_lang_Boolean__feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enable Queue Purging java lang Boolean  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableQueuePurging_java_lang_Boolean_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LambdaToSqsBuilder_lambdasqs_enableQueuePurging_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_enableQueuePurging_java_lang_Boolean__feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaToSqsBuilder_lambdasqs_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Queue Obj With Queue software amazon awscdk services sqs Queue As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaToSqsBuilder_lambdasqs_existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference_feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaToSqsBuilder_lambdasqs_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
				getString("_UI_LambdaToSqsBuilder_lambdasqs_maxReceiveCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_maxReceiveCount_java_lang_Number__feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_, true,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Queue Props With Queue Props software amazon awscdk services sqs Queue Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_LambdaToSqsBuilder_lambdasqs_queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_LambdaToSqsBuilder_lambdasqs_queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_LambdaToSqsBuilder_lambdasqs_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LambdaToSqsBuilder_lambdasqs_generatedClassName_feature",
								"_UI_LambdaToSqsBuilder_lambdasqs_type"),
						AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__GENERATED_CLASS_NAME, false,
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
				getString("_UI_LambdaToSqsBuilder_lambdasqs_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LambdaToSqsBuilder_lambdasqs_varName_feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME, true, false, false,
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
				getString("_UI_LambdaToSqsBuilder_lambdasqs_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LambdaToSqsBuilder_lambdasqs_identifier_feature",
						"_UI_LambdaToSqsBuilder_lambdasqs_type"),
				AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_LambdaToSqsBuilder_lambdasqs_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LambdaToSqsBuilder_lambdasqs_additionalCode_feature",
								"_UI_LambdaToSqsBuilder_lambdasqs_type"),
						AwsworkbenchPackage.Literals.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LambdaToSqsBuilder_lambdasqs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LambdaToSqsBuilder_lambdasqs"));
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
		return "LambdaToSqs " + ((LambdaToSqsBuilder_lambdasqs) object).getVarName();

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

		switch (notification.getFeatureID(LambdaToSqsBuilder_lambdasqs.class)) {
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ENABLE_QUEUE_PURGING_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__VAR_NAME:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__IDENTIFIER:
		case AwsworkbenchPackage.LAMBDA_TO_SQS_BUILDER_LAMBDASQS__ADDITIONAL_CODE:
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
