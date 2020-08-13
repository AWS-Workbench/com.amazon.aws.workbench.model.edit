/**
 */
package com.amazon.aws.workbench.model.awsworkbench.provider;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.amazon.aws.workbench.model.awsworkbench.DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaItemProvider extends ServiceResourcesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamoDBStreamToLambdaBuilder_dynamodbstreamlambdaItemProvider(AdapterFactory adapterFactory) {
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

			addDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReferencePropertyDescriptor(
					object);
			addExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReferencePropertyDescriptor(
					object);
			addExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReferencePropertyDescriptor(
					object);
			addLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReferencePropertyDescriptor(
					object);
			addGeneratedClassNamePropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addAdditionalCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE,
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
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReferencePropertyDescriptor(
			Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE,
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
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
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
				getString("_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_generatedClassName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_generatedClassName_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__GENERATED_CLASS_NAME,
				false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_varName_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_varName_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__VAR_NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_identifier_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_identifier_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__IDENTIFIER, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_additionalCode_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_additionalCode_feature",
						"_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type"),
				AwsworkbenchPackage.Literals.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__ADDITIONAL_CODE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda"));
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
		String label = ((DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda) object).getGeneratedClassName();
		return label == null || label.length() == 0
				? getString("_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type")
				: getString("_UI_DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda_type") + " " + label;
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

		switch (notification.getFeatureID(DynamoDBStreamToLambdaBuilder_dynamodbstreamlambda.class)) {
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__GENERATED_CLASS_NAME:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__VAR_NAME:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__IDENTIFIER:
		case AwsworkbenchPackage.DYNAMO_DB_STREAM_TO_LAMBDA_BUILDER_DYNAMODBSTREAMLAMBDA__ADDITIONAL_CODE:
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
