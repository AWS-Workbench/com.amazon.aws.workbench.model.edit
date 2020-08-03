/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.SqsToLambdaBuilder_sqslambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SqsToLambdaBuilder_sqslambdaItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqsToLambdaBuilder_sqslambdaItemProvider(AdapterFactory adapterFactory) {
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
						"_UI_SqsToLambdaBuilder_sqslambda_deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqsToLambdaBuilder_sqslambda_deadLetterQueuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE,
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
				getString("_UI_SqsToLambdaBuilder_sqslambda_deployDeadLetterQueue_java_lang_Boolean__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqsToLambdaBuilder_sqslambda_deployDeadLetterQueue_java_lang_Boolean__feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_,
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
						"_UI_SqsToLambdaBuilder_sqslambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqsToLambdaBuilder_sqslambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
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
						"_UI_SqsToLambdaBuilder_sqslambda_existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqsToLambdaBuilder_sqslambda_existingQueueObjWithQueue_software_amazon_awscdk_services_sqs_Queue_AsReference_feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE,
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
						"_UI_SqsToLambdaBuilder_sqslambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqsToLambdaBuilder_sqslambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
				getString("_UI_SqsToLambdaBuilder_sqslambda_maxReceiveCount_java_lang_Number__feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqsToLambdaBuilder_sqslambda_maxReceiveCount_java_lang_Number__feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_, true,
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
						"_UI_SqsToLambdaBuilder_sqslambda_queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SqsToLambdaBuilder_sqslambda_queuePropsWithQueueProps_software_amazon_awscdk_services_sqs_QueueProps_AsReference_feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE,
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
						getResourceLocator(), getString("_UI_SqsToLambdaBuilder_sqslambda_generatedClassName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SqsToLambdaBuilder_sqslambda_generatedClassName_feature",
								"_UI_SqsToLambdaBuilder_sqslambda_type"),
						AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__GENERATED_CLASS_NAME, false,
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
				getString("_UI_SqsToLambdaBuilder_sqslambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SqsToLambdaBuilder_sqslambda_varName_feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__VAR_NAME, true, false, false,
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
				getString("_UI_SqsToLambdaBuilder_sqslambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SqsToLambdaBuilder_sqslambda_identifier_feature",
						"_UI_SqsToLambdaBuilder_sqslambda_type"),
				AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_SqsToLambdaBuilder_sqslambda_additionalCode_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SqsToLambdaBuilder_sqslambda_additionalCode_feature",
								"_UI_SqsToLambdaBuilder_sqslambda_type"),
						AwsworkbenchPackage.Literals.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__ADDITIONAL_CODE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SqsToLambdaBuilder_sqslambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SqsToLambdaBuilder_sqslambda"));
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
		String label = ((SqsToLambdaBuilder_sqslambda) object).getGeneratedClassName();
		return label == null || label.length() == 0 ? getString("_UI_SqsToLambdaBuilder_sqslambda_type")
				: getString("_UI_SqsToLambdaBuilder_sqslambda_type") + " " + label;
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

		switch (notification.getFeatureID(SqsToLambdaBuilder_sqslambda.class)) {
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__DEAD_LETTER_QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__DEPLOY_DEAD_LETTER_QUEUE_JAVA_LANG_BOOLEAN_:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__EXISTING_QUEUE_OBJ_WITH_QUEUE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_AS_REFERENCE:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__MAX_RECEIVE_COUNT_JAVA_LANG_NUMBER_:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__QUEUE_PROPS_WITH_QUEUE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_SQS_QUEUE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__VAR_NAME:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.SQS_TO_LAMBDA_BUILDER_SQSLAMBDA__ADDITIONAL_CODE:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AwsworkbenchEditPlugin.INSTANCE;
	}

}
